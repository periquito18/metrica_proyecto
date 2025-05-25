/*
 * Test Estado
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
public class EstadoTest {
    
    public EstadoTest() {
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
     * Test of values method, of class Estado.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Estado[] expResult = null;
        Estado[] result = Estado.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Estado.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        Estado expResult = null;
        Estado result = Estado.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fromString method, of class Estado.
     */
    @Test
    public void testFromString() {
        System.out.println("fromString");
        String nombre = "";
        Estado expResult = null;
        Estado result = Estado.fromString(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Estado.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Estado instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
