/*
 * Test Pedido
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
public class PedidoTest {
    
    public PedidoTest() {
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
     * Test of getId method, of class Pedido.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Pedido instance = new Pedido();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Pedido.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Pedido instance = new Pedido();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuarioId method, of class Pedido.
     */
    @Test
    public void testGetUsuarioId() {
        System.out.println("getUsuarioId");
        Pedido instance = new Pedido();
        int expResult = 0;
        int result = instance.getUsuarioId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuarioId method, of class Pedido.
     */
    @Test
    public void testSetUsuarioId() {
        System.out.println("setUsuarioId");
        int usuarioId = 0;
        Pedido instance = new Pedido();
        instance.setUsuarioId(usuarioId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Pedido.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Pedido instance = new Pedido();
        LocalDate expResult = null;
        LocalDate result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Pedido.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        LocalDate fecha = null;
        Pedido instance = new Pedido();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Pedido.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Pedido instance = new Pedido();
        double expResult = 0.0;
        double result = instance.getTotal();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal method, of class Pedido.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        double total = 0.0;
        Pedido instance = new Pedido();
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoEstado method, of class Pedido.
     */
    @Test
    public void testGetTipoEstado() {
        System.out.println("getTipoEstado");
        Pedido instance = new Pedido();
        Estado expResult = null;
        Estado result = instance.getTipoEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoEstado method, of class Pedido.
     */
    @Test
    public void testSetTipoEstado() {
        System.out.println("setTipoEstado");
        Estado tipoEstado = null;
        Pedido instance = new Pedido();
        instance.setTipoEstado(tipoEstado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Pedido.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Pedido instance = new Pedido();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Pedido.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Pedido instance = new Pedido();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Pedido.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Pedido instance = new Pedido();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
