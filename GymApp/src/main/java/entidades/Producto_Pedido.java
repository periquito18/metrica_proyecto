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
    /**
     * Devuelve identificador del producto_pedido
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Modifica el identificador del producto_pedido
     * @param id nuevo identificador del producto_pedido
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Devuelve el identificador del pedido
     * @return pedidoId
     */
    public int getPedidoId() {
        return pedidoId;
    }

    /**
     * Modifica el identificador de pedido
     * @param pedidoId nuevo identificador de pedido
     */
    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    /**
     * Devuelve el identificador del producto
     * @return productoId
     */
    public int getProductoId() {
        return productoId;
    }

    /**
     * Modifica el identificador de producto
     * @param productoId nuevo identificador de producto
     */
    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    /**
     * Devuelve la cantidad de un producto en un pedido
     * @return cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Modifica la cantidad de un producto en un pedido
     * @param cantidad nueva cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Devuelve el precio por unidad de un producto
     * @return precioUnidad
     */
    public double getPrecioUnidad() {
        return precioUnidad;
    }

    /**
     * Modifica el precio por unidad de un producto
     * @param precioUnidad nuevo precioUnidad
     */
    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    /**
     * Metodo hashCode
     * @return hash
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
     * @return boolean
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
     * @return cadena de texto con información del Producto_Pedido
     */
    @Override
    public String toString(){
        return "Pedido: " + pedidoId + ", producto: " + productoId + ", cantidad: " + cantidad + ", precio por unidad: " + precioUnidad;
    }
}
