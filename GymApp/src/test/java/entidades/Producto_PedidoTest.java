/*
 * Test Producto_Pedido
 */
package entidades;

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
public class Producto_PedidoTest {
    
    public Producto_PedidoTest() {
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
     * Test of getId method, of class Producto_Pedido.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Producto_Pedido instance = new Producto_Pedido();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Producto_Pedido.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Producto_Pedido instance = new Producto_Pedido();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPedidoId method, of class Producto_Pedido.
     */
    @Test
    public void testGetPedidoId() {
        System.out.println("getPedidoId");
        Producto_Pedido instance = new Producto_Pedido();
        int expResult = 0;
        int result = instance.getPedidoId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPedidoId method, of class Producto_Pedido.
     */
    @Test
    public void testSetPedidoId() {
        System.out.println("setPedidoId");
        int pedidoId = 0;
        Producto_Pedido instance = new Producto_Pedido();
        instance.setPedidoId(pedidoId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductoId method, of class Producto_Pedido.
     */
    @Test
    public void testGetProductoId() {
        System.out.println("getProductoId");
        Producto_Pedido instance = new Producto_Pedido();
        int expResult = 0;
        int result = instance.getProductoId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProductoId method, of class Producto_Pedido.
     */
    @Test
    public void testSetProductoId() {
        System.out.println("setProductoId");
        int productoId = 0;
        Producto_Pedido instance = new Producto_Pedido();
        instance.setProductoId(productoId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidad method, of class Producto_Pedido.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        Producto_Pedido instance = new Producto_Pedido();
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidad method, of class Producto_Pedido.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int cantidad = 0;
        Producto_Pedido instance = new Producto_Pedido();
        instance.setCantidad(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioUnidad method, of class Producto_Pedido.
     */
    @Test
    public void testGetPrecioUnidad() {
        System.out.println("getPrecioUnidad");
        Producto_Pedido instance = new Producto_Pedido();
        double expResult = 0.0;
        double result = instance.getPrecioUnidad();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioUnidad method, of class Producto_Pedido.
     */
    @Test
    public void testSetPrecioUnidad() {
        System.out.println("setPrecioUnidad");
        double precioUnidad = 0.0;
        Producto_Pedido instance = new Producto_Pedido();
        instance.setPrecioUnidad(precioUnidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Producto_Pedido.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Producto_Pedido instance = new Producto_Pedido();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Producto_Pedido.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Producto_Pedido instance = new Producto_Pedido();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Producto_Pedido.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Producto_Pedido instance = new Producto_Pedido();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
