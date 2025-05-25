/*
 * Test DAOAuxiliar
 */
package bbdd;

import java.util.Arrays;
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
public class DAOAuxiliarTest {
    
    public DAOAuxiliarTest() {
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
     * Test of listarCategorias method, of class DAOAuxiliar.
     */
    @Test
    public void testListarCategorias() {
        System.out.println("listarCategorias");
        DAOAuxiliar instance = new DAOAuxiliar();
        List<String> expResult = Arrays.asList("ALIMENTACION", "SUPLEMENTOS", "ROPA", "ACCESORIOS");
        List<String> result = instance.listarCategorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarEstados method, of class DAOAuxiliar.
     */
    @Test
    public void testListarEstados() {
        System.out.println("listarEstados");
        DAOAuxiliar instance = new DAOAuxiliar();
        List<String> expResult = Arrays.asList("PENDIENTE", "EN_PROCESO", "COMPLETADO", "CANCELADO");
        List<String> result = instance.listarEstados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
