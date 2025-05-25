/*
 * Test DAOCarritos
 */
package bbdd;

import entidades.Carrito;
import entidades.InfoCarritoDTO;
import entidades.Producto_Carrito;
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
public class DAOCarritosTest {
    
    public DAOCarritosTest() {
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
     * Test of listarCarrito method, of class DAOCarritos.
     */
    @Test
    public void testListarCarrito() {
        System.out.println("listarCarrito");
        int id_usuario = 0;
        DAOCarritos instance = new DAOCarritos();
        List<Producto_Carrito> expResult = null;
        List<Producto_Carrito> result = instance.listarCarrito(id_usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verCarrito method, of class DAOCarritos.
     */
    @Test
    public void testVerCarrito() {
        System.out.println("verCarrito");
        int id_usuario = 0;
        DAOCarritos instance = new DAOCarritos();
        List<InfoCarritoDTO> expResult = null;
        List<InfoCarritoDTO> result = instance.verCarrito(id_usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerOCrearCarrito method, of class DAOCarritos.
     */
    @Test
    public void testObtenerOCrearCarrito() {
        System.out.println("obtenerOCrearCarrito");
        int id_usuario = 0;
        DAOCarritos instance = new DAOCarritos();
        Carrito expResult = null;
        Carrito result = instance.obtenerOCrearCarrito(id_usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerIdCarritoPorIdUsuario method, of class DAOCarritos.
     */
    @Test
    public void testObtenerIdCarritoPorIdUsuario() {
        System.out.println("obtenerIdCarritoPorIdUsuario");
        int id_usuario = 0;
        DAOCarritos instance = new DAOCarritos();
        int expResult = 0;
        int result = instance.obtenerIdCarritoPorIdUsuario(id_usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarNuevoProductoCarrito method, of class DAOCarritos.
     */
    @Test
    public void testAgregarNuevoProductoCarrito() {
        System.out.println("agregarNuevoProductoCarrito");
        int id_usuario = 0;
        int id_producto = 0;
        DAOCarritos instance = new DAOCarritos();
        instance.agregarNuevoProductoCarrito(id_usuario, id_producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarProductoExistenteCarrito method, of class DAOCarritos.
     */
    @Test
    public void testAgregarProductoExistenteCarrito() {
        System.out.println("agregarProductoExistenteCarrito");
        int id_usuario = 0;
        int id_producto = 0;
        DAOCarritos instance = new DAOCarritos();
        instance.agregarProductoExistenteCarrito(id_usuario, id_producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of productoEnCarrito method, of class DAOCarritos.
     */
    @Test
    public void testProductoEnCarrito() {
        System.out.println("productoEnCarrito");
        int id_usuario = 0;
        int id_producto = 0;
        DAOCarritos instance = new DAOCarritos();
        boolean expResult = false;
        boolean result = instance.productoEnCarrito(id_usuario, id_producto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarProductoCarrito method, of class DAOCarritos.
     */
    @Test
    public void testEliminarProductoCarrito() {
        System.out.println("eliminarProductoCarrito");
        int id_usuario = 0;
        int id_producto = 0;
        DAOCarritos instance = new DAOCarritos();
        instance.eliminarProductoCarrito(id_usuario, id_producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarProductoUnicoCarrito method, of class DAOCarritos.
     */
    @Test
    public void testEliminarProductoUnicoCarrito() {
        System.out.println("eliminarProductoUnicoCarrito");
        int id_usuario = 0;
        int id_producto = 0;
        DAOCarritos instance = new DAOCarritos();
        instance.eliminarProductoUnicoCarrito(id_usuario, id_producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPrecioTotal method, of class DAOCarritos.
     */
    @Test
    public void testCalcularPrecioTotal() {
        System.out.println("calcularPrecioTotal");
        int id_usuario = 0;
        DAOCarritos instance = new DAOCarritos();
        double expResult = 0.0;
        double result = instance.calcularPrecioTotal(id_usuario);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vaciarProductoCarrito method, of class DAOCarritos.
     */
    @Test
    public void testVaciarProductoCarrito() throws Exception {
        System.out.println("vaciarProductoCarrito");
        int idUsuario = 0;
        DAOCarritos instance = new DAOCarritos();
        instance.vaciarProductoCarrito(idUsuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vaciarCarrito method, of class DAOCarritos.
     */
    @Test
    public void testVaciarCarrito() {
        System.out.println("vaciarCarrito");
        int id_usuario = 0;
        DAOCarritos instance = new DAOCarritos();
        instance.vaciarCarrito(id_usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
