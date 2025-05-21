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
    
    //¿Qué es? --> Método para convertir una cadena de texto al valor del enum
//    public static Estado fromString(String nombre){
//        return Estado.valueOf(nombre.toUpperCase());
//    }
}
