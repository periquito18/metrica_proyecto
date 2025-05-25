/*
 * DAOUsusarios.
 * Operaciones de acceso a datos para la entidad Usuario
 */
package bbdd;

import util.Conexion;
import entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SGame
 */
public class DAOUsuarios {
    
    /**
     * Devuelve un usuario segun su id
     * @param id identificador del usuario
     * @return objeto Usuario
     */
    public Usuario buscarPorId(String id) {
        Usuario user = null;
        Connection conn = null;
        try {
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("select * from usuario where id = ?");
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new Usuario(Integer.parseInt(id), rs.getString("password"), rs.getString("nombre"), rs.getString("email"), rs.getString("localidad"), rs.getBoolean("es_admin"));
            }
        } catch (SQLException e) {
            System.err.println("buscarPorId: " + e.getMessage());
        } finally {
            Conexion.desconectarBD(conn);
        }
        return user;
    }
    
    /**
     * Devuelve un usuario segun su email
     * @param email email del usuario
     * @return objeto Usuario
     */
    public Usuario buscarPorEmail(String email) {
        Usuario user = null;
        Connection conn = null;
        try {
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("select * from usuario where email = ?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new Usuario(rs.getInt("id_usuario"), rs.getString("nombre"), rs.getString("password"), rs.getString("email"), rs.getString("localidad"), rs.getBoolean("es_admin"));
            }
        } catch (SQLException e) {
            System.err.println("buscarPorEmail: " + e.getMessage());
        } finally {
            Conexion.desconectarBD(conn);
        }
        return user;
    }
    
    /**
     * Agrega un nuevo usuario al producto
     * @param user nuevo Usuario
     */
    public void insertarUsuario(Usuario user) {
        Connection conn = null;
        try {
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("insert into usuario (nombre, password, email, localidad, es_admin) values(?, ?, ?, ?, ?)");
            //ps.setInt(1, user.getId());
            ps.setString(1, user.getNombre());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getLocalidad());
            ps.setBoolean(5, user.isEsAdmin());
            ps.execute();
        } catch (SQLException e) {
            System.err.println("insertarUsuario: " + e.getMessage());
        } finally {
            Conexion.desconectarBD(conn);
        }
    }
    
    /**
     * Muestra una lista de usuario
     * @return lista Usuario
     */
    public List<Usuario> consultarUsuarios() {
        Connection conn = null;
        List<Usuario> usuarios = new ArrayList();
        try {
            conn = Conexion.conectarBD();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from usuario");
            while (rs.next()) {
                Usuario user = new Usuario(rs.getInt("id_usuario"), rs.getString("nombre"), rs.getString("password"), rs.getString("email"), rs.getString("localidad"), rs.getBoolean("es_admin"));
                usuarios.add(user);
            }
        } catch (SQLException e) {
            System.err.println("consultarUsuarios: " + e.getMessage());
        } finally {
            Conexion.desconectarBD(conn);
        }
        return usuarios;
    }
}
