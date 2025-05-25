/*
 * Test PedidoService
 */
package bbdd;

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
public class PedidoServiceTest {
    
    public PedidoServiceTest() {
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
     * Test of finalizarCompraService method, of class PedidoService.
     */
    @Test
    public void testFinalizarCompraService() {
        System.out.println("finalizarCompraService");
        int id_usuario = 0;
        PedidoService instance = new PedidoService();
        boolean expResult = false;
        boolean result = instance.finalizarCompraService(id_usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
