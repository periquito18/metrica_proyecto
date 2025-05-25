/*
 * DAOAuxiliar
 * Operaciones de acceso a datos para las entidades Categoria y Estado
 */
package bbdd;

import util.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SGame
 */
public class DAOAuxiliar {
    
    /**
     * Devuelve una lista con las categorías
     * @return lista de los nombres de las categorías
     */
    public List<String> listarCategorias(){
        Connection conn = null;
        List<String> listaCategoria = new ArrayList<>();

        try {
            conn = Conexion.conectarBD();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select nombre from categoria");
            while (rs.next()) {
                listaCategoria.add(rs.getString("nombre"));
            }
        } catch(SQLException e){
            System.err.println("listarCategorias: " + e.getMessage());
        } finally{
            Conexion.desconectarBD(conn);
        }   
        return listaCategoria;
    }
    
    /**
     * Devuelve una lista con los estados
     * @return lista de los nombres de los estados
     */
    public List<String> listarEstados(){
        Connection conn = null;
        List<String> listaEstado = new ArrayList<>();

        try {
            conn = Conexion.conectarBD();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select nombre from estado");
            while (rs.next()) {
                listaEstado.add(rs.getString("nombre"));
            }
        } catch(SQLException e){
            System.err.println("listarCategorias: " + e.getMessage());
        } finally{
            Conexion.desconectarBD(conn);
        }   
        return listaEstado;
    }
}
