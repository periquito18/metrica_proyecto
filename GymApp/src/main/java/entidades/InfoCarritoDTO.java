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

    public Categoria getCategoria() {
        return categoria;
    }

    public int getIdProducto() {
        return idProducto;
    }
    
    // Métodos Getter
    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }
}
