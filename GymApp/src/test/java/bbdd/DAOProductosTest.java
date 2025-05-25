/*
 * Test DAOProductos
 */
package bbdd;

import entidades.Categoria;
import entidades.Producto;
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
public class DAOProductosTest {
    
    public DAOProductosTest() {
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
     * Test of listarProductos method, of class DAOProductos.
     */
    @Test
    public void testListarProductos() {
        System.out.println("listarProductos");
        DAOProductos instance = new DAOProductos();
        List<Producto> expResult = null;
        List<Producto> result = instance.listarProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorId method, of class DAOProductos.
     */
    @Test
    public void testBuscarPorId() {
        System.out.println("buscarPorId");
        int id = 0;
        DAOProductos instance = new DAOProductos();
        Producto expResult = null;
        Producto result = instance.buscarPorId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of filtrarPorCategoria method, of class DAOProductos.
     */
    @Test
    public void testFiltrarPorCategoria() {
        System.out.println("filtrarPorCategoria");
        Categoria categoria = null;
        DAOProductos instance = new DAOProductos();
        List<Producto> expResult = null;
        List<Producto> result = instance.filtrarPorCategoria(categoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarStock method, of class DAOProductos.
     */
    @Test
    public void testModificarStock() {
        System.out.println("modificarStock");
        int id = 0;
        int stock = 0;
        DAOProductos instance = new DAOProductos();
        instance.modificarStock(id, stock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarPrecio method, of class DAOProductos.
     */
    @Test
    public void testModificarPrecio() {
        System.out.println("modificarPrecio");
        int id = 0;
        double precio = 0.0;
        DAOProductos instance = new DAOProductos();
        instance.modificarPrecio(id, precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStock method, of class DAOProductos.
     */
    @Test
    public void testGetStock() throws Exception {
        System.out.println("getStock");
        int idProducto = 0;
        DAOProductos instance = new DAOProductos();
        int expResult = 0;
        int result = instance.getStock(idProducto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of descontarStock method, of class DAOProductos.
     */
    @Test
    public void testDescontarStock() {
        System.out.println("descontarStock");
        int idProducto = 0;
        int cantidad = 0;
        DAOProductos instance = new DAOProductos();
        instance.descontarStock(idProducto, cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarProducto method, of class DAOProductos.
     */
    @Test
    public void testAgregarProducto() {
        System.out.println("agregarProducto");
        Producto producto = null;
        DAOProductos instance = new DAOProductos();
        instance.agregarProducto(producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarProducto method, of class DAOProductos.
     */
    @Test
    public void testEliminarProducto() {
        System.out.println("eliminarProducto");
        int id_producto = 0;
        DAOProductos instance = new DAOProductos();
        instance.eliminarProducto(id_producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
