/*
 * Clase Pedido DTO
 */
package entidades;

import java.sql.Date;

/**
 *
 * @author SGame
 */
public class InfoListaPedidosDTO {
    
    //Atributos
    private int id;
    private Date fecha;
    private double total;
    private Estado tipoEstado;
    
    //Constructor
    public InfoListaPedidosDTO(int id, Date fecha, double total, Estado tipoEstado){
        this.id = id;
        this.fecha = fecha;
        this.total = total;
        this.tipoEstado = tipoEstado;
    }
    
    //Métodos Getter

    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getTotal() {
        return total;
    }

    public Estado getTipoEstado() {
        return tipoEstado;
    }
    
}
