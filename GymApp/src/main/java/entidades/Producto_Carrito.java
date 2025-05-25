/*
 * Entidad Producto_Carrito
 */
package entidades;

/**
 *
 * @author SGame
 */
public class Producto_Carrito {
    // Atributos
    private int id;
    private int carritoId;
    private int productoId;
    private int cantidad;
    private double precioUnidad;

    // Constructores
    public Producto_Carrito() {
    }

    public Producto_Carrito(int id, int carritoId, int productoId, int cantidad, double precioUnidad) {
        this.id = id;
        this.carritoId = carritoId;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }
    
    public Producto_Carrito(int carritoId, int productoId, int cantidad, double precioUnidad) {
        this.carritoId = carritoId;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    // Métodos Getter y Setter
    /**
     * Devuelve el identificador del producto_carrito
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Modifica el identificador del producot_carrito
     * @param id nuevo identificador producto_Carrito
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Devuelve el identificador del Carrito
     * @return carritoId
     */
    public int getCarritoId() {
        return carritoId;
    }

    /**
     * Modifica el identificador del carrito
     * @param carritoId nuevo identificador del carrito
     */
    public void setCarritoId(int carritoId) {
        this.carritoId = carritoId;
    }

    /**
     * Devuelve el identificador del producto
     * @return productoId
     */
    public int getProductoId() {
        return productoId;
    }

    /**
     * Modifica el identificador del producto
     * @param productoId nuevo identificador del producto
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
     * Devuelve el precio del producto
     * @return precioUnidad
     */
    public double getPrecioUnidad() {
        return precioUnidad;
    }

    /**
     * Modifica el precio del producto
     * @param precioUnidad nuevo precioUnidad
     */
    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
    
    /**
     * Método toString
     * @return cadena de texto con información del Producto_Carrito
     */
    @Override
    public String toString(){
        return "Carrito id: " + carritoId + ", Producto id: " + productoId + ", cantidad: " + cantidad + ", precio por unidad: " + precioUnidad;
    }

    /**
     * Metodo hashCode
     * @return hash
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
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
        final Producto_Carrito other = (Producto_Carrito) obj;
        return this.id == other.id;
    }  
}
