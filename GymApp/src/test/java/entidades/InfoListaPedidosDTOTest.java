/*
 * Test InfoListaPedidosDTO
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
public class InfoListaPedidosDTOTest {
    
    public InfoListaPedidosDTOTest() {
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
     * Test of getId method, of class InfoListaPedidosDTO.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        InfoListaPedidosDTO instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class InfoListaPedidosDTO.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        InfoListaPedidosDTO instance = null;
        LocalDate expResult = null;
        LocalDate result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class InfoListaPedidosDTO.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        InfoListaPedidosDTO instance = null;
        double expResult = 0.0;
        double result = instance.getTotal();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoEstado method, of class InfoListaPedidosDTO.
     */
    @Test
    public void testGetTipoEstado() {
        System.out.println("getTipoEstado");
        InfoListaPedidosDTO instance = null;
        Estado expResult = null;
        Estado result = instance.getTipoEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
