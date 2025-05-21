/*
 * Entidad Carrito
 */
package entidades;

import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author SGame
 */
public class Producto_Pedido {
    private int id;
    private int pedidoId;
    private int productoId;
    private int cantidad;
    private double precioUnidad;
    
    public Producto_Pedido(){
        
    }
    
    public Producto_Pedido(int id, int pedidoId, int productoId, int cantidad, double precioUnidad){
        this.id = id;
        this.pedidoId = pedidoId;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

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

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 13 * hash + Objects.hashCode(this.pedidoId);
//        hash = 13 * hash + Objects.hashCode(this.productoId);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Carrito other = (Carrito) obj;
//        if (!Objects.equals(this.pedidoId, other.pedidoId)) {
//            return false;
//        }
//        return Objects.equals(this.productoId, other.productoId);
//    }
    
    @Override
    public String toString(){
        return "Pedido: " + pedidoId + ", producto: " + productoId + ", cantidad: " + cantidad + ", precio por unidad: " + precioUnidad;
    }
    
}
