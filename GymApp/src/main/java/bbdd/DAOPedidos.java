/*
 * DAOPedidos
 * Operaciones de acceso a datos para la entidad Pedido
 */
package bbdd;

import entidades.Estado;
import entidades.InfoListaPedidosDTO;
import entidades.InfoPedidoDTO;
import entidades.Pedido;
import entidades.Producto_Pedido;
import java.sql.Connection;
import java.sql.Date;
//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import util.Conexion;

/**
 *
 * @author SGame
 */
public class DAOPedidos {
    
    public List<Pedido> listarPedidos(){
        Connection conn = null;
        List<Pedido> pedidos = new ArrayList<>();
        try{
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("select * from pedido");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Pedido pedido = new Pedido(rs.getInt("id_pedido"), rs.getInt("id_usuario"), rs.getDate("fecha").toLocalDate(), rs.getDouble("total"), Estado.valueOf(rs.getString("tipo_Estado")));
                pedidos.add(pedido);
            }
        } catch(SQLException e){
            System.err.println("listarPedidos: " + e.getMessage());
        } finally{
            Conexion.desconectarBD(conn);
        }
        return pedidos;
    }
    
    public List<InfoListaPedidosDTO> listarPedidosPorUsuario(int id_usuario){
        Connection conn = null;
        List<InfoListaPedidosDTO> pedidos = new ArrayList<>();
        try{
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("select * from pedido where id_usuario = ?");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                InfoListaPedidosDTO pedido = new InfoListaPedidosDTO(rs.getInt("id_pedido"), rs.getDate("fecha").toLocalDate(), rs.getDouble("total"), Estado.valueOf(rs.getString("tipo_Estado")));
                pedidos.add(pedido);
            }
        } catch(SQLException e){
            System.err.println("listarPedidosPorUsuario: " + e.getMessage());
        } finally{
            Conexion.desconectarBD(conn);
        }
        return pedidos;
    }
    
    public InfoPedidoDTO verDetallesPedido(int id_pedido){
        Connection conn = null;
        InfoPedidoDTO pedido = null;
        try{
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("select pr.nommbre, pp.cantidad, pp.precio_unidad\n"
                    + " from producto_pedido pp join pedido p on pp.id_pedido = p.id_pedido\n"
                    + " join producto pr on pp.id_producto = pr.id_producto where p.id_pedido = ?");
            ps.setInt(1, id_pedido);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                pedido = new InfoPedidoDTO(rs.getString("nombre"), rs.getInt("cantidad"), rs.getDouble("precio_unidad"));
            }
        } catch(SQLException e){
            System.err.println("verDetallesPedido: " + e.getMessage());
        } finally{
            Conexion.desconectarBD(conn);
        }
        return pedido;
    }
    
    public int insertarPedido(int id_usuario, LocalDate fecha, double total, Estado estado) throws SQLException{
        Connection conn = null;
        try{
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("insert into pedido (ID_USUARIO, FECHA, TOTAL, TIPO_ESTADO)"
                    + "values (?, ?, ?, ?)");
            ps.setInt(1, id_usuario);
            ps.setDate(2, Date.valueOf(fecha));
            ps.setDouble(3, total);
            ps.setString(4, estado.name());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt("id_pedido");
            } else{
                throw new SQLException("No se pudo insertar pedido");
            }
        } finally{
            Conexion.desconectarBD(conn);
        }
    }
    
    public void insertarProductoPedido(Producto_Pedido producto){
        Connection conn = null;
        try{
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("insert into producto_pedido (ID_PEDIDO, ID_PRODUCTO, CANTIDAD, PRECIO_UNIDAD)"
                    + " values (?, ?, ?, ?)");
            ps.setInt(1, producto.getPedidoId());
            ps.setInt(2, producto.getProductoId());
            ps.setInt(3, producto.getCantidad());
            ps.setDouble(4, producto.getPrecioUnidad());
            int filas = ps.executeUpdate();
            if(filas > 0){
                System.out.println("Producto insertado en Pedido");
            } else{
                System.out.println("No se pudo insertar producto en pedido");
            }
        } catch(SQLException e){
            System.err.println("insertarProductoPedido: " + e.getMessage());
        } finally{
            Conexion.desconectarBD(conn);
        }
    }
    
    public double calcularPrecioTotalPedido(int id_pedido){
        Connection conn = null;
        double precio = 0.0;
        try{
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("select SUM(cantidad * precio_unidad) as total from producto_pedido pp"
                    + "join pedido p on pp.id_pedido = p.id_pedido where p.id_pedido = ?");
            ps.setInt(1, id_pedido);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                precio = rs.getDouble("total");
            }
        } catch(SQLException e){
            System.err.println("calcularPrecioTotalPedido: " + e.getMessage());
        } finally{
            Conexion.desconectarBD(conn);
        }
        return precio;
    }
    
    public void cambiarEstadoPedido(int id_pedido, Estado estado){
        Connection conn = null;
        try{
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("update pedido set tipo_estado = ? where id_pedido = ?");
            ps.setString(1, estado.name());
            ps.setInt(2, id_pedido);
            int filas = ps.executeUpdate();
            if(filas > 0){
                System.out.println("Estado actualizado");
            } else{
                System.out.println("No se pudo actualizar estado");
            }
        } catch(SQLException e){
            System.err.println("cambiarEstadoPedido: " + e.getMessage());
        } finally{
            Conexion.desconectarBD(conn);
        }
    }
    
    //Versión para Clientes (se puede hacer una versión para administradores o poner mismo constructor para ambos)
    public List<InfoListaPedidosDTO> filtrarPedidosPorEstado(Estado estado){
        Connection conn = null;
        List<InfoListaPedidosDTO> pedidos = new ArrayList<>();
        try{
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("select * from pedido where tipo_Estado = ?");
            ps.setString(1, estado.name());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                InfoListaPedidosDTO pedido = new InfoListaPedidosDTO(rs.getInt("id_pedido"), rs.getDate("fecha").toLocalDate(), rs.getDouble("total"), Estado.valueOf(rs.getString("tipo_Estado")));
                pedidos.add(pedido);
            }
        } catch(SQLException e){
            System.err.println("filtrarPedidosPorEstado: " + e.getMessage());
        } finally{
            Conexion.desconectarBD(conn);
        }
        return pedidos;
    }
    
//    public List<Pedido> filtrarPedidoPorPrecioTotal(double minimo, double maximo) throws SQLException {
//        List<Pedido> lista = new ArrayList<>();
//        String sql = "SELECT * FROM Pedido WHERE precio_total BETWEEN ? AND ?";
//        try (Connection conn = Conexion.conectarBD();
//             PreparedStatement stmt = conn.prepareStatement(sql)) {
//            stmt.setDouble(1, minimo);
//            stmt.setDouble(2, maximo);
//            ResultSet rs = stmt.executeQuery();
//            while (rs.next()) {
//                lista.add(new Pedido(
//                    rs.getInt("id_pedido"),
//                    rs.getInt("id_usuario"),
//                    rs.getDate("fecha"),
//                    rs.getDouble("total"),
//                    Estado.valueOf(rs.getString("tipo_Estado"))
//                ));
//            }
//        }
//        return lista;
//    }
//
//    public List<Pedido> filtrarPedidoPorFecha(Date fechaInicio, Date fechaFin) throws SQLException {
//        List<Pedido> lista = new ArrayList<>();
//        String sql = "SELECT * FROM Pedido WHERE fecha BETWEEN ? AND ?";
//        try (Connection conn = Conexion.conectarBD();
//             PreparedStatement stmt = conn.prepareStatement(sql)) {
//            stmt.setDate(1, fechaInicio);
//            stmt.setDate(2, fechaFin);
//            ResultSet rs = stmt.executeQuery();
//            while (rs.next()) {
//                lista.add(new Pedido(
//                    rs.getInt("id_pedido"),
//                    rs.getInt("id_usuario"),
//                    rs.getDate("fecha"),
//                    rs.getDouble("precio_total"),
//                    Estado.valueOf(rs.getString("tipo_Estado"))
//                ));
//            }
//        }
//        return lista;
//    }
    
}
