/*
 * Entidad Usuario
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

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
    public Usuario(){
        pedidos = new ArrayList<>();
    }
    
    public Usuario(String nombre, String password, String email, String localidad, boolean esAdmin){
        this.nombre = nombre;
        this.password = password;
        this.email = email;
        this.localidad = localidad;
        this.esAdmin = esAdmin;
//        listaUsuarios.add(this);
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
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public boolean isEsAdmin() {
        return esAdmin;
    }

    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
    
public void agregarPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }

//    public List<Pedido> getPedidos() {
//        return pedidos;
//    }
//
//    public void setPedidos(List<Pedido> pedidos) {
//        this.pedidos = pedidos;
//    }
//
//    public void agregarPedido(Pedido pedido){
//        this.pedidos.add(pedido);
//    }
    
    /**
     * Método toString
     * @return 
     */
    @Override
    public String toString(){
        return email;
    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 83 * hash + Objects.hashCode(this.id);
//        return hash;
//    }

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
//        final Usuario other = (Usuario) obj;
//        return Objects.equals(this.id, other.id);
//    }
    
    // Métodos propios de la clase
    
}
