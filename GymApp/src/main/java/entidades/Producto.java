/*
 * Entidad Producto
 */
package entidades;

//import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author SGame
 */
public class Producto {
    // Atributos
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private Categoria categoria;
//    ArrayList<Producto> listaProductos = new ArrayList<>();
    
    // Constructores
    public Producto(){
        
    }
    
    public Producto(int id, String nombre, double precio, int stock, Categoria categoria){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }
    
    public Producto(String nombre, double precio, int stock, Categoria categoria){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    // Métodos Getter y Setter
    /**
     * Devuelve el identificador del producto
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Modifica el identificador del usuario
     * @param id nuevo identificador del usuario
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Devuelve el nombre del producto
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del producto
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el precio del producto
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Modifica el precio del producto
     * @param precio nuevo precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve el inventario del producto
     * @return stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Modifica el inventario del producto
     * @param stock nuevo inventario
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Devuelve la categoria de un producto
     * @return objeto Categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Modifica la categoria de un producto
     * @param categoria 
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * Metodo hashCode
     * @return hash 
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.id);
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
        final Producto other = (Producto) obj;
        return Objects.equals(this.id, other.id);
    }
    
    /**
     * Metodo toString
     * @return cadena de texto con información del producto
     */
    @Override
    public String toString(){
        return "Producto: " + nombre + ", precio: " + precio + ", cantidad: " + stock + ", categoria: " + categoria;
    }
}