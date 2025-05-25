/*
 * Entidad Pedido
 */
package entidades;

//import java.sql.Date;
import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Objects;

/**
 *
 * @author SGame
 */
public class Pedido {
    // Atributos
    private int id;
    private int usuarioId;
    private LocalDate fecha;
    private double total;
    private Estado tipoEstado;
//    private List<Producto> productos;
//    ArrayList<Pedido> listaPedidos = new ArrayList<>();
    
    // Constructores
    public Pedido(){
        
    }
    
    public Pedido(int id, int usuarioId, LocalDate fecha, double total, Estado tipoEstado){
        this.id = id;
        this.usuarioId = usuarioId;
        this.fecha = fecha;
        this.total = total;
        this.tipoEstado = tipoEstado;
    }
    
    public Pedido(int usuarioId, LocalDate fecha, double total, Estado tipoEstado){
        this.usuarioId = usuarioId;
        this.fecha = fecha;
        this.total = total;
        this.tipoEstado = tipoEstado;
    }

    // Métodos Getter y Setter
    /**
     * Devuelve el identificador del pedido
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Modifica el identificador del pedido
     * @param id nuevo identificador del pedido
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Devuelve el identificador del usuario
     * @return usuarioId
     */
    public int getUsuarioId() {
        return usuarioId;
    }

    /**
     * Modifica el identificador del usuario
     * @param usuarioId nuevo identificador del usuario
     */
    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    /**
     * Devuelve la fecha de un pedido
     * @return fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Modifica la fecha de un producto
     * @param fecha nueva fecha
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Devuelve el precio total de un pedido
     * @return total
     */
    public double getTotal() {
        return total;
    }

    /**
     * Modifica el precio total de un pedido
     * @param total nuevo total
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * Devuelve el estado del pedido
     * @return objeto Estado
     */
    public Estado getTipoEstado() {
        return tipoEstado;
    }

    /**
     * Modifica el estado de un pedido
     * @param tipoEstado nuevo objeto Estado 
     */
    public void setTipoEstado(Estado tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    /**
     * Metodo hashCode
     * @return hash
     */
    @Override
    public int hashCode() {
        int hash = 7;
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
        final Pedido other = (Pedido) obj;
        return Objects.equals(this.id, other.id);
    }
    
    /**
     * Metodo toString
     * @return cadena de texto con información del pedido
     */
    @Override
    public String toString(){
        return "Pedido id: " + id + ", Usuario id: " + usuarioId + ", fecha: " + fecha + ", precio: " + total + "estado: " + tipoEstado;
    }
}
