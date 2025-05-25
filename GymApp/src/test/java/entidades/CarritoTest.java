/*
 * Test Carrito
 */
package entidades;

import java.time.LocalDate;
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
public class CarritoTest {
    
    public CarritoTest() {
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
     * Test of getId method, of class Carrito.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Carrito instance = new Carrito();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Carrito.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Carrito instance = new Carrito();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuarioId method, of class Carrito.
     */
    @Test
    public void testGetUsuarioId() {
        System.out.println("getUsuarioId");
        Carrito instance = new Carrito();
        int expResult = 0;
        int result = instance.getUsuarioId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuarioId method, of class Carrito.
     */
    @Test
    public void testSetUsuarioId() {
        System.out.println("setUsuarioId");
        int usuarioId = 0;
        Carrito instance = new Carrito();
        instance.setUsuarioId(usuarioId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Carrito.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Carrito instance = new Carrito();
        LocalDate expResult = null;
        LocalDate result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Carrito.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        LocalDate fecha = null;
        Carrito instance = new Carrito();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Carrito.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Carrito instance = new Carrito();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Carrito.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Carrito instance = new Carrito();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Carrito.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Carrito instance = new Carrito();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
