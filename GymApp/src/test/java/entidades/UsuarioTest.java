/*
 * Test Usuario
 */
package entidades;

import java.util.ArrayList;
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
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of getId method, of class Usuario.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Usuario.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Usuario instance = new Usuario();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Usuario.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Usuario.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Usuario instance = new Usuario();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Usuario.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Usuario.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Usuario instance = new Usuario();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Usuario.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Usuario.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Usuario instance = new Usuario();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocalidad method, of class Usuario.
     */
    @Test
    public void testGetLocalidad() {
        System.out.println("getLocalidad");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getLocalidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocalidad method, of class Usuario.
     */
    @Test
    public void testSetLocalidad() {
        System.out.println("setLocalidad");
        String localidad = "";
        Usuario instance = new Usuario();
        instance.setLocalidad(localidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEsAdmin method, of class Usuario.
     */
    @Test
    public void testIsEsAdmin() {
        System.out.println("isEsAdmin");
        Usuario instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.isEsAdmin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEsAdmin method, of class Usuario.
     */
    @Test
    public void testSetEsAdmin() {
        System.out.println("setEsAdmin");
        boolean esAdmin = false;
        Usuario instance = new Usuario();
        instance.setEsAdmin(esAdmin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPedidos method, of class Usuario.
     */
    @Test
    public void testGetPedidos() {
        System.out.println("getPedidos");
        Usuario instance = new Usuario();
        List<Pedido> expResult = null;
        List<Pedido> result = instance.getPedidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPedido method, of class Usuario.
     */
    @Test
    public void testAddPedido() {
        System.out.println("addPedido");
        Pedido pedido = null;
        Usuario instance = new Usuario();
        instance.addPedido(pedido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaUsuarios method, of class Usuario.
     */
    @Test
    public void testGetListaUsuarios() {
        System.out.println("getListaUsuarios");
        Usuario instance = new Usuario();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.getListaUsuarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUsuario method, of class Usuario.
     */
    @Test
    public void testAddUsuario() {
        System.out.println("addUsuario");
        Usuario usuario = null;
        Usuario instance = new Usuario();
        instance.addUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Usuario.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Usuario.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Usuario.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Usuario instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
