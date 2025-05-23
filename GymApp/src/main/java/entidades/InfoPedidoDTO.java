/*
 * Clase Pedido DTO
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
