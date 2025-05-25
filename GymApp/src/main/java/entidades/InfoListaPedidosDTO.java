/*
 * Clase Pedido DTO --> Capa Intermedia
 */
package entidades;

//import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author SGame
 */
public class InfoListaPedidosDTO {
    
    //Atributos
    private int id;
    private LocalDate fecha;
    private double total;
    private Estado tipoEstado;
    
    //Constructor
    public InfoListaPedidosDTO(int id, LocalDate fecha, double total, Estado tipoEstado){
        this.id = id;
        this.fecha = fecha;
        this.total = total;
        this.tipoEstado = tipoEstado;
    }
    
    //Métodos Getter
    /**
     * Devuelve identificador del objeto InfoListaPedidosDTO
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve la fecha de un pedido
     * @return fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Devuelve el precio total de un pedido
     * @return total
     */
    public double getTotal() {
        return total;
    }

    /**
     * Devuelve el estado de un pedido
     * @return tipoEstado
     */
    public Estado getTipoEstado() {
        return tipoEstado;
    }
}
