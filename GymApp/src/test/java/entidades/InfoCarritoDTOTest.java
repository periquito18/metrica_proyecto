/*
 * Test InfoCarritoDAO
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
public class InfoCarritoDTOTest {
    
    public InfoCarritoDTOTest() {
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
     * Test of getCategoria method, of class InfoCarritoDTO.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        InfoCarritoDTO instance = null;
        Categoria expResult = null;
        Categoria result = instance.getCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdProducto method, of class InfoCarritoDTO.
     */
    @Test
    public void testGetIdProducto() {
        System.out.println("getIdProducto");
        InfoCarritoDTO instance = null;
        int expResult = 0;
        int result = instance.getIdProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreProducto method, of class InfoCarritoDTO.
     */
    @Test
    public void testGetNombreProducto() {
        System.out.println("getNombreProducto");
        InfoCarritoDTO instance = null;
        String expResult = "";
        String result = instance.getNombreProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidad method, of class InfoCarritoDTO.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        InfoCarritoDTO instance = null;
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioUnidad method, of class InfoCarritoDTO.
     */
    @Test
    public void testGetPrecioUnidad() {
        System.out.println("getPrecioUnidad");
        InfoCarritoDTO instance = null;
        double expResult = 0.0;
        double result = instance.getPrecioUnidad();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
