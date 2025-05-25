/*
 * Clase Pedido DTO --> Capa intermedia
 */
package entidades;

/**
 *
 * @author SGame
 */
public class InfoPedidoDTO {
    
   // Atributos
    private String nombreProducto;
    private int cantidad;
    private double precioUnidad;
    
    //Constructor
    public InfoPedidoDTO(String nombreProducto, int cantidad, double precioUnidad){
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }
    
    // Métodos Getter
    /**
     * Devuelve el nombre de un producto en un pedido
     * @return nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Devuelve la cantidad de un producto en un pedido
     * @return cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Devuelve el precio por unidad de un producto en un pedido
     * @return precioUnidad
     */
    public double getPrecioUnidad() {
        return precioUnidad;
    }
}
