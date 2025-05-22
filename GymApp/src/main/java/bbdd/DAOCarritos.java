/*
 * DAOCarritos
 * Operaciones de acceso a datos para la entidad Carrito
 */
package bbdd;

import util.Conexion;
import entidades.Carrito;
import entidades.InfoCarritoDTO;
import java.sql.Connection;
import java.sql.Date;
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
public class DAOCarritos {
    
    public List<InfoCarritoDTO> verCarrito(int id_usuario){
        Connection conn = null;
        List<InfoCarritoDTO> productos = new ArrayList<>();
        try{
            conn = Conexion.conectarBD();
            PreparedStatement ps = conn.prepareStatement("select p.nommbre, pc.cantidad, pc.precio_unidad\n"
                    + " from producto_carrito pc join carrito c on pc.id_carrito = c.id_carrito\n"
                    + " join producto p on pc.id_producto = p.id_producto where c.id_usurio = ?");
            ps.setInt(1, id_usuario);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                InfoCarritoDTO producto = new InfoCarritoDTO(rs.getString("nombre"), rs.getInt("cantidad"), rs.getDouble("precio_unidad"));
                productos.add(producto);
            }
        } catch(SQLException e){
            System.err.println("verCarrito: " + e.getMessage());
        } finally{
            Conexion.desconectarBD(conn);
        }
        return productos;
    }
    
    public Carrito obtenerOCrearCarrito(int id_usuario){
        Connection conn = null;
        Carrito carrito = null;
        String sqlBuscar = "select * from carrito where id_usuario = ?";
        String slqCrear = "insert into carrito (id_usuario, fecha) values (?, sysdate)";
        try{
            conn = Conexion.conectarBD();
            PreparedStatement ps1 = conn.prepareStatement(sqlBuscar);
            ps1.setInt(1, id_usuario);
            ResultSet rs1 = ps1.executeQuery();
            if(rs1.next()){
                carrito = new Carrito(rs1.getInt("id_carrito"), rs1.getInt("id_usuario"), rs1.getDate("fecha"));
            } else{
                try{
                    PreparedStatement ps2 = conn.prepareStatement(slqCrear);
                    ps2.setInt(1, id_usuario);
                    ResultSet rs2 = ps2.executeQuery();
                    if(rs2.next()){
                        carrito = new Carrito(id_usuario, new Date(id_usuario, id_usuario, id_usuario));
                    }
                } catch(SQLException e){
                    System.err.println("obtenerOCrearCarrito: " + e.getMessage());
                } 
            }
        } catch(SQLException e){
            System.err.println("obtenerOCrearCarrito: " + e.getMessage());
        } finally{
            Conexion.desconectarBD(conn);
        }
        return carrito;
    }
    
}
