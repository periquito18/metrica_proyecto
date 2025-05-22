/*
 * Entidad Pedido
 */
package entidades;

import java.sql.Date;
//import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author SGame
 */
public class Pedido {
    // Atributos
    private int id;
    private int usuarioId;
    private Date fecha;
    private double total;
    private Estado tipoEstado;
    
    // Constructores
    public Pedido(){
        
    }
    
    public Pedido(int id, int usuarioId, Date fecha, double total, Estado tipoEstado){
        this.id = id;
        this.usuarioId = usuarioId;
        this.fecha = fecha;
        this.total = total;
        this.tipoEstado = tipoEstado;
    }
    
    public Pedido(int usuarioId, Date fecha, double total, Estado tipoEstado){
        this.usuarioId = usuarioId;
        this.fecha = fecha;
        this.total = total;
        this.tipoEstado = tipoEstado;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Estado getTipoEstado() {
        return tipoEstado;
    }

    public void setTipoEstado(Estado tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 11 * hash + Objects.hashCode(this.id);
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
//        final Pedido other = (Pedido) obj;
//        return Objects.equals(this.id, other.id);
//    }
    
    /**
     * Método toString
     * @return 
     */
    @Override
    public String toString(){
        return "Pedido id: " + id + ", Usuario id: " + usuarioId + ", fecha: " + fecha + ", precio: " + total + "estado: " + tipoEstado;
    }
    
    // Métodos propios de la clase
}
