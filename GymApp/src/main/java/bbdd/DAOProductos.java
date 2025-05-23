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

<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream

    public List<Producto> filtrarPorCategoria(Categoria categoria) {

=======
    public List<Producto> filtrarPorCategoria(Categoria categoria) {
>>>>>>> Stashed changes
=======
    public List<Producto> filtrarPorCategoria(Categoria categoria) {
>>>>>>> Stashed changes
=======
    public List<Producto> filtrarPorCategoria(Categoria categoria) {
>>>>>>> Stashed changes
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
}
