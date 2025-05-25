/*
 * Test DAOPedidos
 */
package bbdd;

import entidades.Estado;
import entidades.InfoListaPedidosDTO;
import entidades.InfoPedidoDTO;
import entidades.Pedido;
import entidades.Producto_Pedido;
import java.time.LocalDate;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SGame
 */
public class DAOPedidosTest {
    
    public DAOPedidosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of listarPedidos method, of class DAOPedidos.
     */
    @Test
    public void testListarPedidos() {
        System.out.println("listarPedidos");
        DAOPedidos instance = new DAOPedidos();
        List<Pedido> expResult = null;
        List<Pedido> result = instance.listarPedidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPedidosPorUsuario method, of class DAOPedidos.
     */
    @Test
    public void testListarPedidosPorUsuario() {
        System.out.println("listarPedidosPorUsuario");
        int id_usuario = 0;
        DAOPedidos instance = new DAOPedidos();
        List<InfoListaPedidosDTO> expResult = null;
        List<InfoListaPedidosDTO> result = instance.listarPedidosPorUsuario(id_usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verDetallesPedido method, of class DAOPedidos.
     */
    @Test
    public void testVerDetallesPedido() {
        System.out.println("verDetallesPedido");
        int id_pedido = 0;
        DAOPedidos instance = new DAOPedidos();
        InfoPedidoDTO expResult = null;
        InfoPedidoDTO result = instance.verDetallesPedido(id_pedido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertarPedido method, of class DAOPedidos.
     */
    @Test
    public void testInsertarPedido() throws Exception {
        System.out.println("insertarPedido");
        int id_usuario = 0;
        LocalDate fecha = null;
        double total = 0.0;
        Estado estado = null;
        DAOPedidos instance = new DAOPedidos();
        int expResult = 0;
        int result = instance.insertarPedido(id_usuario, fecha, total, estado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertarProductoPedido method, of class DAOPedidos.
     */
    @Test
    public void testInsertarProductoPedido() {
        System.out.println("insertarProductoPedido");
        Producto_Pedido producto = null;
        DAOPedidos instance = new DAOPedidos();
        instance.insertarProductoPedido(producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPrecioTotalPedido method, of class DAOPedidos.
     */
    @Test
    public void testCalcularPrecioTotalPedido() {
        System.out.println("calcularPrecioTotalPedido");
        int id_pedido = 0;
        DAOPedidos instance = new DAOPedidos();
        double expResult = 0.0;
        double result = instance.calcularPrecioTotalPedido(id_pedido);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarEstadoPedido method, of class DAOPedidos.
     */
    @Test
    public void testCambiarEstadoPedido() {
        System.out.println("cambiarEstadoPedido");
        int id_pedido = 0;
        Estado estado = null;
        DAOPedidos instance = new DAOPedidos();
        instance.cambiarEstadoPedido(id_pedido, estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of filtrarPedidosPorEstado method, of class DAOPedidos.
     */
    @Test
    public void testFiltrarPedidosPorEstado() {
        System.out.println("filtrarPedidosPorEstado");
        Estado estado = null;
        DAOPedidos instance = new DAOPedidos();
        List<InfoListaPedidosDTO> expResult = null;
        List<InfoListaPedidosDTO> result = instance.filtrarPedidosPorEstado(estado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
