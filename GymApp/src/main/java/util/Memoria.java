/*
 * Datos en memoria (cache)
 */
package util;

import bbdd.DAOProductos;
//import entidades.Categoria;
import entidades.Producto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author SGame
 */
public class Memoria {
     public static List<Producto> productos = new ArrayList<>();

     // Cargar productos desde la base de datos
    public static void cargarProductos() throws SQLException {
        DAOProductos dao = new DAOProductos();
        productos = dao.listarProductos(); // carga desde la BD
    }

    // Refrescar productos (vuelve a cargar)
    public static void refrescarProductos() {
        try {
            cargarProductos();
            System.out.println("Productos actualizados correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al refrescar productos: " + e.getMessage());
        }
    }
    
    // Obtener todos los productos en memoria
    public static List<Producto> getProductos() {
        return productos;
    }
    
    // Buscar productos por nombre
    public static List<Producto> buscarPorNombre(String texto) {
        return productos.stream()
                .filter(p -> p.getNombre().toLowerCase().contains(texto.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Filtrar productos por categoría (enum.toString())
    public static List<Producto> filtrarPorCategoria(String categoria) {
        return productos.stream()
                .filter(p -> p.getCategoria().name().equalsIgnoreCase(categoria))
                .collect(Collectors.toList());
    }
    
//    public static void filtrarPorCategoria(Categoria categoria) {
//        productos.stream()
//            .filter(p -> p.getCategoria().name().equals(categoria.name()))
//            .forEach(p -> System.out.println(p.getNombre() + p.getPrecio()));
//    }

    // Mostrar todos los productos por consola
    public static void mostrarTodos() {
        productos.forEach(p -> System.out.println(p.getNombre() + p.getPrecio()));
    }
}
