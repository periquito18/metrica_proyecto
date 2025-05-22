/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarritoId() {
        return carritoId;
    }

    public void setCarritoId(int carritoId) {
        this.carritoId = carritoId;
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
     * Método toString
     * @return
     */
    @Override
    public String toString(){
        return "Carrito id: " + carritoId + ", Producto id: " + productoId + ", cantidad: " + cantidad + ", precio por unidad: " + precioUnidad;
    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 89 * hash + this.id;
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
//        final Producto_Carrito other = (Producto_Carrito) obj;
//        return this.id == other.id;
//    }  
    
    // Métodos propios de la clase
}
