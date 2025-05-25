/*
 * Entidad Carrito
 */
package entidades;

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
    /**
     * Devuelve el identificador del carrito
     * @return id 
     */
    public int getId() {
        return id;
    }

    /**
     * Modifica el identificador del carrito
     * @param id nuevo identificador del carrito
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Devuelve el identificador del usuario del carrito
     * @return usuarioId
     */
    public int getUsuarioId() {
        return usuarioId;
    }

    /**
     * Modifica el identificador del usuario del carrito
     * @param usuarioId nuevo identificador del usuario del carrito
     */
    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    /**
     * Devuelve la fecha del carrito
     * @return fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Modifica la fecha del carrito
     * @param fecha nueva fecha del carrito
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    /**
     * Metodo toString
     * @return cadena de texto con información del carrito
     */
    @Override
    public String toString(){
        return "Carrito id: " + id + ", Usuario id: " + usuarioId + ", fecha: " + fecha;
    }

    /**
     * Metodo hashCode
     * @return hash
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
        final Carrito other = (Carrito) obj;
        return this.id == other.id;
    }
}
