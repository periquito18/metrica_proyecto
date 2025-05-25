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
    
    /**
     * Convierte una cadena de texto a un valor del Enum Categoria
     * @param nombre nombre de la categoria
     * @return objeto Categoria
     */
    public static Categoria fromString(String nombre){
        return Categoria.valueOf(nombre.toUpperCase().replace(" ", "_"));
    }

    /**
     * Metodo toString
     * @return cadena de texto con información de la categoria
     */
    @Override
    public String toString() {
        return name();
    }
}
