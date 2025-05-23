/*
 * Entidad Categoria
 */
package entidades;

/**
 *
 * @author SGame
 */
public enum Categoria {
    ALIMENTACION,
    SUPLEMENTOS,
    ROPA,
    ACCESORIOS;
    
    // Metodo para convertir una cadena de texto al valor del enum
    public static Categoria fromString(String nombre){
        return Categoria.valueOf(nombre.toUpperCase().replace(" ", "_"));
    }

    /**
     * Metodo toString
     * @return
     */
    @Override
    public String toString() {
        return name();
    }
}
