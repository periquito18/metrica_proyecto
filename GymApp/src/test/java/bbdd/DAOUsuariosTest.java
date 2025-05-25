/*
 * Test DAOUsuarios
 */
package bbdd;

import entidades.Usuario;
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
public class DAOUsuariosTest {
    
    public DAOUsuariosTest() {
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
     * Test of buscarPorId method, of class DAOUsuarios.
     */
    @Test
    public void testBuscarPorId() {
        System.out.println("buscarPorId");
        String id = "";
        DAOUsuarios instance = new DAOUsuarios();
        Usuario expResult = null;
        Usuario result = instance.buscarPorId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorEmail method, of class DAOUsuarios.
     */
    @Test
    public void testBuscarPorEmail() {
        System.out.println("buscarPorEmail");
        String email = "";
        DAOUsuarios instance = new DAOUsuarios();
        Usuario expResult = null;
        Usuario result = instance.buscarPorEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertarUsuario method, of class DAOUsuarios.
     */
    @Test
    public void testInsertarUsuario() {
        System.out.println("insertarUsuario");
        Usuario user = null;
        DAOUsuarios instance = new DAOUsuarios();
        instance.insertarUsuario(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarUsuarios method, of class DAOUsuarios.
     */
    @Test
    public void testConsultarUsuarios() {
        System.out.println("consultarUsuarios");
        DAOUsuarios instance = new DAOUsuarios();
        List<Usuario> expResult = null;
        List<Usuario> result = instance.consultarUsuarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
