/*
 * Clase Carrito DTO --> Capa Intermedia
 */
package entidades;

/**
 *
 * @author SGame
 */
public class InfoCarritoDTO {
    
    // Atributos
    private int idProducto;
    private String nombreProducto;
    private int cantidad;
    private double precioUnidad;
    private Categoria categoria;
    
    //Constructor
    public InfoCarritoDTO(int idProducto, String nombreProducto, int cantidad, double precioUnidad, Categoria categoria){
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
        this.categoria = categoria; 
    }
    
    // Métodos Getter
    /**
     * Devuelve la categoria de un producto
     * @return objeto Categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Devuele el identificador de un producto
     * @return idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }
    
    /**
     * Devuelve el nombre del producto
     * @return nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Devuelve la cantidad de un producto en un carrito
     * @return cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Devuelve el precio por cada unidad de producto de un producto
     * @return precioUnidad
     */
    public double getPrecioUnidad() {
        return precioUnidad;
    }
}
