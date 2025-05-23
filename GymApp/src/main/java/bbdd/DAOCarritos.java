/*
 * DAOCarritos
 * Operaciones de acceso a datos para la entidad Carrito
 */
package bbdd;

import util.Conexion;
import entidades.Carrito;
import entidades.Categoria;
import entidades.InfoCarritoDTO;
import entidades.Producto_Carrito;
import java.sql.Connection;
//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SGame
 */
public class DAOCarritos {

    public List<Producto_Carrito> listarCarrito(int id_usuario){
        Connection conn = null;
        List<Producto_Carrito> productos = new ArrayList<>();
        try{
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("select pc.* from producto_carrito pc join carrito c on pc.id_carrito = c.id_carrito\n"
                    + " join producto p on pc.id_producto = p.id_producto where c.id_usuario = ?");
            ps.setInt(1, id_usuario);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Producto_Carrito producto = new Producto_Carrito(rs.getInt("id_producto_carrito"), rs.getInt("id_carrito"), rs.getInt("id_producto"), rs.getInt("cantidad"), rs.getDouble("precio_unidad"));
                productos.add(producto);
            }
        } catch(SQLException e){
            System.err.println("listarCarrito: " + e.getMessage());
        } finally{
            Conexion.desconectarBD(conn);
        }
        return productos;
    }
    
    public List<InfoCarritoDTO> verCarrito(int id_usuario) {
        Connection conn = null;
        List<InfoCarritoDTO> productos = new ArrayList<>();
        try {
            conn = Conexion.conectarBD();

            PreparedStatement ps = conn.prepareStatement("select p.id_producto, p.nombre, pc.cantidad, pc.precio_unidad, p.tipo_categoria\n"

                    + " from producto_carrito pc join carrito c on pc.id_carrito = c.id_carrito\n"
                    + " join producto p on pc.id_producto = p.id_producto where c.id_usuario = ?");
            ps.setInt(1, id_usuario);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                InfoCarritoDTO producto = new InfoCarritoDTO(rs.getInt("id_producto"), rs.getString("nombre"), rs.getInt("cantidad"), rs.getDouble("precio_unidad"), Categoria.fromString(rs.getString("tipo_categoria")));
                productos.add(producto);
            }
        } catch (SQLException e) {
            System.err.println("verCarrito: " + e.getMessage());
        } finally {
            Conexion.desconectarBD(conn);
        }
        return productos;
    }

    public Carrito obtenerOCrearCarrito(int id_usuario) {
        Connection conn = null;
        Carrito carrito = null;
        String sqlBuscar = "select * from carrito where id_usuario = ?";
        String slqCrear = "insert into carrito (id_usuario, fecha) values (?, sysdate)";
        try {
            conn = Conexion.conectarBD();
            PreparedStatement ps1 = conn.prepareStatement(sqlBuscar);
            ps1.setInt(1, id_usuario);
            ResultSet rs1 = ps1.executeQuery();
            if (rs1.next()) {
                carrito = new Carrito(rs1.getInt("id_carrito"), rs1.getInt("id_usuario"), rs1.getDate("fecha").toLocalDate());
            } else {
                try {
                    PreparedStatement ps2 = conn.prepareStatement(slqCrear);
                    ps2.setInt(1, id_usuario);
                    ResultSet rs2 = ps2.executeQuery();
                    if (rs2.next()) {
                        carrito = new Carrito(id_usuario, LocalDate.now());
                    }
                } catch (SQLException e) {
                    System.err.println("obtenerOCrearCarrito: " + e.getMessage());
                }
            }
        } catch (SQLException e) {
            System.err.println("obtenerOCrearCarrito: " + e.getMessage());
        } finally {
            Conexion.desconectarBD(conn);
        }
        return carrito;
    }
    
    public int obtenerIdCarritoPorIdUsuario(int id_usuario){
        Connection conn = null;
        int id = 0;
        try{
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("select id_carrito from carrito where id_usuario = ?");
            ps.setInt(1, id_usuario);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                id = rs.getInt("id_carrito");
            }
        } catch(SQLException e){
            System.err.println("obtenerOCrearCarrito: " + e.getMessage());
        } finally{
            Conexion.desconectarBD(conn);
        }
        return id;
    }

    public void agregarNuevoProductoCarrito(int id_usuario, int id_producto) {
        Connection conn = null;
        try {
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("insert into producto_carrito (id_carrito, id_producto, cantidad, precio_unidad) "
                    + "select c.id_carrito, p.id_producto, 1, p.precio "
                    + "from carrito c join producto p on p.id_producto = ? "
                    + "where c.id_usuario = ?");
            ps.setInt(1, id_producto);
            ps.setInt(2, id_usuario);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("agregarNuevoProducto: " + e.getMessage());
        } finally {
            Conexion.desconectarBD(conn);
        }
    }

    public void agregarProductoExistenteCarrito(int id_usuario, int id_producto) {
        Connection conn = null;
        try {
            conn = Conexion.conectarBD();
            PreparedStatement ps1 = conn.prepareStatement("select pc.* from producto_carrito pc "
                    + "join carrito c on pc.id_carrito = c.id_carrito "
                    + "where c.id_usuario = ? and pc.id_producto = ?");
            ps1.setInt(1, id_usuario);
            ps1.setInt(2, id_producto);
            ResultSet rs1 = ps1.executeQuery();
            if (rs1.next()) {
                PreparedStatement ps2 = conn.prepareStatement("update producto_carrito set cantidad = cantidad + 1 "
                        + "where id_carrito = (select id_carrito from carrito where id_usuario = ?) and id_producto = ?");
                ps2.setInt(1, id_usuario);
                ps2.setInt(2, id_producto);
                ps2.executeUpdate();
            }
        } catch (SQLException e) {
            System.err.println("agregarProductoExistente: " + e.getMessage());
        } finally {
            Conexion.desconectarBD(conn);
        }
    }

    public boolean productoEnCarrito(int id_usuario, int id_producto) {
        Connection conn = null;
        boolean existe = false;
        try {
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT 1 FROM producto_carrito pc "
                    + "JOIN carrito c ON pc.id_carrito = c.id_carrito "
                    + "WHERE c.id_usuario = ? AND pc.id_producto = ?"
            );
            ps.setInt(1, id_usuario);
            ps.setInt(2, id_producto);
            ResultSet rs = ps.executeQuery();
            existe = rs.next(); // true si hay algún resultado
        } catch (SQLException e) {
            System.err.println("Error en productoEnCarrito: " + e.getMessage());
        } finally {
            Conexion.desconectarBD(conn);
        }
        return existe;
    }

//    public Producto_Carrito buscarProductoCarritoPorUsuario(int id_usuario, int id_producto){
//        Connection conn = null;
//        String sql = "select pc.* from producto_carrito pc " +
//                     "join carrito c on pc.id_carrito = c.id_carrito " +
//                     "where c.id_usuario = ? and pc.id_producto = ?";
//
//        try{
//            conn = Conexion.conectarBD();
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setInt(1, id_usuario);
//            ps.setInt(2, id_producto);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                return new Producto_Carrito(
//                    rs.getInt("id_producto_carrito"),
//                    rs.getInt("id_carrito"),
//                    rs.getInt("id_producto"),
//                    rs.getInt("cantidad"),
//                    rs.getDouble("precio_unidad")
//                );
//            }
//        } catch(SQLException e){
//            System.err.println("buscarProductoCarritoPorUsuario: " + e.getMessage());
//        }
//        return null;
//    }
//    
//    public void agregarProductoExistente(int id_usuario, int id_producto){
//        Connection conn = null;
//        String sql = "update producto_carrito set cantidad = cantidad + 1 " +
//                     "where id_carrito = (select id_carrito from carrito where id_usuario = ?) " +
//                     "and id_producto = ?";
//
//        try{
//            conn = Conexion.conectarBD();
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setInt(1, id_usuario);
//            ps.setInt(2, id_producto);
//            ps.executeUpdate();
//        } catch(SQLException e){
//            System.err.println("agregarProductoExistente: " + e.getMessage());
//        }
//    }
    public void eliminarProductoCarrito(int id_usuario, int id_producto) {
        Connection conn = null;
        String sql = "update producto_carrito set cantidad = cantidad - 1 "
                + "where id_carrito = (select id_carrito from carrito where id_usuario = ?) "
                + "and id_producto = ? and cantidad > 1";

        try {
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id_usuario);
            ps.setInt(2, id_producto);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("eliminarProducto: " + e.getMessage());
        } finally {
            Conexion.desconectarBD(conn);
        }
    }

    public void eliminarProductoUnicoCarrito(int id_usuario, int id_producto) {
        Connection conn = null;
        String sql = "delete from producto_carrito "
                + "where id_carrito = (select id_carrito from carrito where id_usuario = ?) "
                + "and id_producto = ? and cantidad = 1";

        try {
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id_usuario);
            ps.setInt(2, id_producto);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("eliminarProductoUnico: " + e.getMessage());
        } finally {
            Conexion.desconectarBD(conn);
        }
    }

    public double calcularPrecioTotal(int id_usuario) {
        Connection conn = null;
        try {
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("select SUM(cantidad * precio_unidad) as total from producto_carrito "
                    + "where id_carrito = (select id_carrito from carrito where id_usuario = ?)");
            ps.setInt(1, id_usuario);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getDouble("total");
            }
        } catch (SQLException e) {
            System.err.println("calcularPrecioTotal: " + e.getMessage());
        } finally {
            Conexion.desconectarBD(conn);
        }
        return 0.0;
    }

    public void vaciarProductoCarrito(int idUsuario) throws SQLException {
        Connection conn = null;

        try {
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("delete from producto_carrito "
                    + "where id_carrito = (select id_carrito from carrito where id_usuario = ?)");
            ps.setInt(1, idUsuario);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                System.out.println("Productos del carrito vaciado");
            } else {
                System.out.println("No se pudo vaciar productos de carrito");
            }
        } catch (SQLException e) {
            System.err.println("vaciarProductoCarrito: " + e.getMessage());
        } finally {
            Conexion.desconectarBD(conn);
        }
    }

    public void vaciarCarrito(int id_usuario) {
        Connection conn = null;

        try {
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("delete from carrito where id_usuario = ?");
            ps.setInt(1, id_usuario);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                System.out.println("Carrito vaciado");
            } else {
                System.out.println("No se pudo vaciar carrito");
            }
        } catch (SQLException e) {
            System.err.println("vaciarCarrito: " + e.getMessage());
        } finally {
            Conexion.desconectarBD(conn);
        }

    }

//    public void restablecerStockYVaciarCarrito(int idUsuario) throws SQLException {
//        Connection conn = null;
//        String sqlProductos = "SELECT pc.id_producto, pc.cantidad FROM Producto_Carrito pc " +
//                              "JOIN Carrito c ON pc.id_carrito = c.id_carrito " +
//                              "WHERE c.id_usuario = ?";
//
//        String sqlActualizarStock = "UPDATE Producto SET stock = stock + ? WHERE id_producto = ?";
//        String sqlVaciar = "DELETE FROM Producto_Carrito WHERE id_carrito = (SELECT id_carrito FROM Carrito WHERE id_usuario = ?)";
//
//        try{
//            conn = Conexion.conectarBD();
//            conn.setAutoCommit(false);
//
//            try (PreparedStatement stmtProductos = conn.prepareStatement(sqlProductos)) {
//                stmtProductos.setInt(1, idUsuario);
//                ResultSet rs = stmtProductos.executeQuery();
//
//                while (rs.next()) {
//                    int idProducto = rs.getInt("id_producto");
//                    int cantidad = rs.getInt("cantidad");
//
//                    try (PreparedStatement stmtActualizar = conn.prepareStatement(sqlActualizarStock)) {
//                        stmtActualizar.setInt(1, cantidad);
//                        stmtActualizar.setInt(2, idProducto);
//                        stmtActualizar.executeUpdate();
//                    }
//                }
//            }
//
//            try (PreparedStatement stmtVaciar = conn.prepareStatement(sqlVaciar)) {
//                stmtVaciar.setInt(1, idUsuario);
//                stmtVaciar.executeUpdate();
//            }
//
//            conn.commit();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw e;
//        }
//    }
}
