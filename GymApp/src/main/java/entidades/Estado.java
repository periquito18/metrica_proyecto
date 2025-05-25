/*
 * Entidad Estado
 */
package entidades;

/**
 *
 * @author SGame
 */
public enum Estado {
    PENDIENTE,
    EN_PROCESO,
    COMPLETADO,
    CANCELADO;
    
    /**
     * Convierte una cadena de texto a un valor del Enum Estado
     * @param nombre nombre del estado
     * @return objeto Estado
     */
    public static Estado fromString(String nombre){
        return Estado.valueOf(nombre.toUpperCase().replace(" ", "_"));
    }
    
    /**
     * Metodo toString
     * @return cadena de texto con información del estado
     */
    @Override
    public String toString() {
        return name();
    }
}
