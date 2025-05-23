/*
 * Entidad Carrito
 */
package entidades;

//import java.sql.Date;
import java.time.LocalDate;
//import java.util.List;

/**
 *
 * @author SGame
 */
public class Carrito {
    // Atributos
    private int id;
    private int usuarioId;
    private LocalDate fecha;
//    private List<Producto> productos;
    
    // Constructores
    public Carrito(){
        
    }
    
    public Carrito(int id, int usuarioId, LocalDate fecha){
        this.id = id;
        this.usuarioId = usuarioId;
        this.fecha = fecha;
    }
    
    public Carrito(int usuarioId, LocalDate fecha){
        this.usuarioId = usuarioId;
        this.fecha = fecha;
    }

    // Métodos Getter y Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    /**
     * Metodo toString
     * @return
     */
    @Override
    public String toString(){
        return "Carrito id: " + id + ", Usuario id: " + usuarioId + ", fecha: " + fecha;
    }

    /**
     * Metodo hashCode
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
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
        final Carrito other = (Carrito) obj;
        return this.id == other.id;
    }
}
