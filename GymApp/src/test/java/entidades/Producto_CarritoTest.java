/*
 * Test Producto_Carrito
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
public class Producto_CarritoTest {
    
    public Producto_CarritoTest() {
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
     * Test of getId method, of class Producto_Carrito.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Producto_Carrito instance = new Producto_Carrito();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Producto_Carrito.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Producto_Carrito instance = new Producto_Carrito();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarritoId method, of class Producto_Carrito.
     */
    @Test
    public void testGetCarritoId() {
        System.out.println("getCarritoId");
        Producto_Carrito instance = new Producto_Carrito();
        int expResult = 0;
        int result = instance.getCarritoId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarritoId method, of class Producto_Carrito.
     */
    @Test
    public void testSetCarritoId() {
        System.out.println("setCarritoId");
        int carritoId = 0;
        Producto_Carrito instance = new Producto_Carrito();
        instance.setCarritoId(carritoId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductoId method, of class Producto_Carrito.
     */
    @Test
    public void testGetProductoId() {
        System.out.println("getProductoId");
        Producto_Carrito instance = new Producto_Carrito();
        int expResult = 0;
        int result = instance.getProductoId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProductoId method, of class Producto_Carrito.
     */
    @Test
    public void testSetProductoId() {
        System.out.println("setProductoId");
        int productoId = 0;
        Producto_Carrito instance = new Producto_Carrito();
        instance.setProductoId(productoId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidad method, of class Producto_Carrito.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        Producto_Carrito instance = new Producto_Carrito();
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidad method, of class Producto_Carrito.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int cantidad = 0;
        Producto_Carrito instance = new Producto_Carrito();
        instance.setCantidad(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioUnidad method, of class Producto_Carrito.
     */
    @Test
    public void testGetPrecioUnidad() {
        System.out.println("getPrecioUnidad");
        Producto_Carrito instance = new Producto_Carrito();
        double expResult = 0.0;
        double result = instance.getPrecioUnidad();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioUnidad method, of class Producto_Carrito.
     */
    @Test
    public void testSetPrecioUnidad() {
        System.out.println("setPrecioUnidad");
        double precioUnidad = 0.0;
        Producto_Carrito instance = new Producto_Carrito();
        instance.setPrecioUnidad(precioUnidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Producto_Carrito.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Producto_Carrito instance = new Producto_Carrito();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Producto_Carrito.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Producto_Carrito instance = new Producto_Carrito();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Producto_Carrito.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Producto_Carrito instance = new Producto_Carrito();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
