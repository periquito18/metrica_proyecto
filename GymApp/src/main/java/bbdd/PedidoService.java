/*
 * Clase Servicio Pedido
 */
package bbdd;

import entidades.Estado;
import entidades.Producto_Carrito;
import entidades.Producto_Pedido;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import util.Conexion;

/**
 *
 * @author SGame
 */
public class PedidoService {

    private final DAOPedidos DAOpedido = new DAOPedidos();
    private final DAOCarritos DAOcarrito = new DAOCarritos();
    private final DAOProductos DAOproducto = new DAOProductos();

    public boolean finalizarCompraService(int id_usuario) {
        Connection conn = null;
        try {
            conn = Conexion.conectarBD();
            conn.setAutoCommit(false);

            List<Producto_Carrito> productos = DAOcarrito.listarCarrito(id_usuario);
            double total = DAOcarrito.calcularPrecioTotal(id_usuario);
            int idPedido = DAOpedido.insertarPedido(id_usuario, LocalDate.now(), total, Estado.PENDIENTE);
            for (Producto_Carrito pc : productos) {
                Producto_Pedido pedidoLinea = new Producto_Pedido(idPedido, pc.getProductoId(), pc.getCantidad(), pc.getPrecioUnidad());
                DAOpedido.insertarProductoPedido(pedidoLinea);
                int stock = DAOproducto.getStock(pc.getProductoId());
                if (stock < pc.getCantidad()) {
                    throw new SQLException("Stock insuficiente para producto ID: " + pc.getProductoId());
                }
                DAOproducto.descontarStock(pc.getProductoId(), pc.getCantidad());
            }
            DAOcarrito.vaciarProductoCarrito(id_usuario);
            DAOcarrito.vaciarCarrito(id_usuario);

            conn.commit();
            return true;

        } catch (SQLException e) {
            System.err.println("Error al crear pedido desde carrito: " + e.getMessage());
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.err.println("Error al hacer rollback: " + ex.getMessage());
                }
            }
        } finally {
            Conexion.desconectarBD(conn);
        }

        return false;
    }
}
