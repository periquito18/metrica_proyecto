/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.sql.Date;
//import java.time.LocalDateTime;

/**
 *
 * @author SGame
 */
public class Carrito {
    // Atributos
    private int id;
    private int usuarioId;
    private Date fecha;
    
    // Constructores
    public Carrito(){
        
    }
    
    public Carrito(int id, int usuarioId, Date fecha){
        this.id = id;
        this.usuarioId = usuarioId;
        this.fecha = fecha;
    }
    
    public Carrito(int usuarioId, Date fecha){
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    /**
     * Método toString
     * @return
     */
    @Override
    public String toString(){
        return "Carrito id: " + id + ", Usuario id: " + usuarioId + ", fecha: " + fecha;
    }

//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 97 * hash + this.id;
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
//        return this.id == other.id;
//    }
    
    // Métodos propios de la clase
}
