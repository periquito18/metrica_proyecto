/*
 * Entidad Carrito
 */
package entidades;

/**
 *
 * @author SGame
 */
public class Producto_Pedido {
    // Atributos
    private int id;
    private int pedidoId;
    private int productoId;
    private int cantidad;
    private double precioUnidad;
    
    // Constructores
    public Producto_Pedido(){
        
    }
    
    public Producto_Pedido(int id, int pedidoId, int productoId, int cantidad, double precioUnidad){
        this.id = id;
        this.pedidoId = pedidoId;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }
    
    public Producto_Pedido(int pedidoId, int productoId, int cantidad, double precioUnidad){
        this.pedidoId = pedidoId;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    // Métodos Getter y Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    /**
     * Metodo hashCode
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        return hash;
    }

    /**
     * Metodo equals
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto_Pedido other = (Producto_Pedido) obj;
        return this.id == other.id;
    }

    /**
     * Metodo toString
     * @return 
     */
    @Override
    public String toString(){
        return "Pedido: " + pedidoId + ", producto: " + productoId + ", cantidad: " + cantidad + ", precio por unidad: " + precioUnidad;
    }
}
