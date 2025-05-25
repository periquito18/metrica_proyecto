/*
 * Entidad Usuario
 */
package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author SGame
 */
public class Usuario {

    // Atributos
    ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private int id;
    private String nombre;
    private String password;
    private String email;
    private String localidad;
    private boolean esAdmin;
    private List<Pedido> pedidos;

    // Constructores
    public Usuario() {
        pedidos = new ArrayList<>();
    }

    public Usuario(String nombre, String password, String email, String localidad, boolean esAdmin) {
        this.nombre = nombre;
        this.password = password;
        this.email = email;
        this.localidad = localidad;
        this.esAdmin = esAdmin;
        listaUsuarios.add(this);
    }

    public Usuario(int id, String nombre, String password, String email, String localidad, boolean esAdmin) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.email = email;
        this.localidad = localidad;
        this.esAdmin = esAdmin;
        this.pedidos = new ArrayList<>();
    }

    // Métodos Getter y Setter
    /**
     * Devuelve el identificador del usuario
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Modifica el identificador del usuario
     * @param id nuevo identificador del usuario
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Devuelve el nombre del usuario
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del usuario
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la contraseña del usuario
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Modifica la contraseña del usuario
     * @param password nueva password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Devuelve el email del usuario
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Modifica el email del usuario
     * @param email nuevo email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Devuelve la localidad del usuario
     * @return localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Modifica la localidad del usuario
     * @param localidad nueva localidad
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * Indica si el usuario es administrador o no
     * @return esAdmin
     */
    public boolean isEsAdmin() {
        return esAdmin;
    }

    /**
     * Modifica si el usuario es administrador o no
     * @param esAdmin nuevo esAdmin
     */
    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    }

    /**
     * Devuelve una lista de pedidos del usuario
     * @return pedidos
     */
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    /**
     * Añade un pedido a la lista de pedidos
     * @param pedido nuevo Pedido
     */
    public void addPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    /**
     * Devuelve una lista de usuarios
     * @return listaUsuarios
     */
    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    /**
     * Añade un usuario a la lista de usuarios
     * @param usuario nuevo Usuario
     */
    public void addUsuario(Usuario usuario) {
        this.listaUsuarios.add(usuario);
    }

    /**
     * Método toString
     * @return cadena de texto con información del pedido
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", email: " + email + ", localidad: " + localidad;
    }

    /**
     * Metodo hashCode
     * @return hash
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Metodo equals
     * @param obj
     * @return booleano
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.id, other.id);
    }
}
