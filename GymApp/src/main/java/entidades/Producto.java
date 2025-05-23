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
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * Metodo hashCode
     * @return
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
        final Producto other = (Producto) obj;
        return Objects.equals(this.id, other.id);
    }
    
    /**
     * Metodo toString
     * @return 
     */
    @Override
    public String toString(){
        return "Producto: " + nombre + ", precio: " + precio + ", cantidad: " + stock + ", categoria: " + categoria;
    }
}