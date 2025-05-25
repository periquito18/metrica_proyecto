/*
 * DAOProductos
 * Operaciones de acceso a datos para la entidad Producto
 */
package bbdd;

import util.Conexion;
import entidades.Categoria;
import entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SGame
 */
public class DAOProductos {

    /**
     * Devuelve una lista de productos
     * @return lista de Producto
     */
    public List<Producto> listarProductos() {
        List<Producto> productos = new ArrayList<>();
       
        try (
                Connection conn = Conexion.conectarBD(); Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery("select * from producto");
            System.out.println(rs.next());
            while (rs.next()) {
                Producto producto = new Producto(rs.getInt("id_producto"), rs.getString("nombre"), rs.getDouble("precio"), rs.getInt("stock"), Categoria.valueOf(rs.getString("tipo_categoria")));
                System.out.println(rs.getInt("id_producto") + rs.getString("nombre") + rs.getDouble("precio") + rs.getInt("stock") + Categoria.valueOf(rs.getString("tipo_categoria")));
                productos.add(producto);
            }

        } catch (SQLException e) {
            System.err.println("listarProductos: " + e.getMessage());
        } catch (Exception error) {
            error.printStackTrace();
        }
        return productos;
    }

    /**
     * Devuelve un objeto Producto
     * @param id identificador del producto
     * @return objeto Producto
     */
    public Producto buscarPorId(int id) {
        Producto producto = null;
        Connection conn = null;
        try {
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("select * from producto where id_producto = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                producto = new Producto(rs.getInt("id_producto"), rs.getString("nombre"), rs.getDouble("precio"), rs.getInt("stock"), Categoria.valueOf(rs.getString("tipo_categoria")));
            }
        } catch (SQLException e) {
            System.err.println("buscarPorId: " + e.getMessage());
        } finally {
            Conexion.desconectarBD(conn);
        }
        return producto;
    }


    /**
     * Muestra una lista de productos segun su categoria
     * @param categoria objeto Categoria
     * @return lista Producto
     */
    public List<Producto> filtrarPorCategoria(Categoria categoria) {

        Connection conn = null;
        List<Producto> lista = new ArrayList<>();
        try {
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("select * from producto where tipo_categoria = ?");
            ps.setString(1, categoria.name());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(new Producto(rs.getInt("id_producto"), rs.getString("nombre"), rs.getDouble("precio"), rs.getInt("stock"), Categoria.valueOf(rs.getString("tipo_categoria"))));
            }
        } catch (SQLException e) {
            System.err.println("buscarPorId: " + e.getMessage());
        } finally {
            Conexion.desconectarBD(conn);
        }
        return lista;
    }

    /**
     * Modifica el inventario de un producto
     * @param id identificador del producto
     * @param stock nueva cantidad de inventario del producto
     */
    public void modificarStock(int id, int stock) {
        Connection conn = null;
        try {
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("update producto set stock = ? where id_producto = ?");
            ps.setInt(1, stock);
            ps.setInt(2, id);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                System.out.println("Stock actualizado");
            } else {
                System.out.println("No se pudo actualizar stock");
            }
        } catch (SQLException e) {
            System.err.println("modificarStock: " + e.getMessage());
        } finally {
            Conexion.desconectarBD(conn);
        }
    }

    /**
     * Modifica el precio de un producto
     * @param id identificador del producto
     * @param precio nuevo precio del producto
     */
    public void modificarPrecio(int id, double precio) {
        Connection conn = null;
        try {
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("update producto set precio = ? where id_producto = ?");
            ps.setDouble(1, precio);
            ps.setInt(2, id);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                System.out.println("Precio actualizado");
            } else {
                System.out.println("No se pudo actualizar precio");
            }
        } catch (SQLException e) {
            System.err.println("modificarPrecio: " + e.getMessage());
        } finally {
            Conexion.desconectarBD(conn);
        }
    }
    
    /**
     * Devuelve el inventario de un producto
     * @param idProducto identificador del producto
     * @return inventario del producto
     * @throws SQLException 
     */
    public int getStock(int idProducto) throws SQLException{
        Connection conn = null;
        try{
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("select stock from producto where id_producto = ?");
            ps.setInt(1, idProducto);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt("stock");
            } else{
                throw new SQLException("No se pudo seleccionar el stock");
            }
        } finally{
            Conexion.desconectarBD(conn);
        }
    }
    
    /**
     * Descuenta el inventario de un producto segun la cantidad comprada por un cliente
     * @param idProducto identificador del producto
     * @param cantidad cantidad del producto en carrito
     */
    public void descontarStock(int idProducto, int cantidad){
        Connection conn = null;
        try{
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("update producto set stock = stock - ? where id_producto = ?");
            ps.setInt(1, cantidad);
            ps.setInt(2, idProducto);
            ps.executeUpdate();
        } catch(SQLException e){
            System.err.println("descontarStock: " + e.getMessage());
        } finally{
            Conexion.desconectarBD(conn);
        }
    }
    
//    public void agregarProducto(String nombre, double precio, int stock, Categoria categoria){
//        
//    }
    
    /**
     * Agrega un producto al sistema
     * @param producto nuevo Producto
     */
    public void agregarProducto(Producto producto){
        Connection conn = null;
        try{
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("insert into producto (NOMBRE, PRECIO, STOCK, TIPO_CATEGORIA)"
                    + "values (?, ?, ?, ?)");
            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.setString(4, producto.getCategoria().name());
            int filas = ps.executeUpdate();
            if(filas > 0){
                System.out.println("Producto agregado");
            } else{
                System.out.println("No se pudo agregar producto");
            }
        } catch(SQLException e){
            System.err.println("agregarProducto: " + e.getMessage());
        } finally{
            Conexion.desconectarBD(conn);
        }
    }
    
    /**
     * Elimina un producto del sistema
     * @param id_producto identificador del producto
     */
    public void eliminarProducto(int id_producto){
        Connection conn = null;
        try{
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("delete from producto where id_producto = ?");
            ps.setInt(1, id_producto);
            int filas = ps.executeUpdate();
            if(filas > 0){
                System.out.println("Producto eliminado");
            } else{
                System.out.println("No se pudo eliminar producto");
            }
        } catch(SQLException e){
            System.err.println("eliminarProducto: " + e.getMessage());
        } finally{
            Conexion.desconectarBD(conn);
        }
    }
}
