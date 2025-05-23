///*
// * Clase Servicio Pedido
// */
//package bbdd;
//
//import entidades.Producto_Carrito;
//import java.sql.Connection;
//import java.util.List;
//import util.Conexion;
//
///**
// *
// * @author SGame
// */
//public class PedidoService {
//    
//    private final DAOPedidos pedido = new DAOPedidos();
//    private final DAOCarritos carrito = new DAOCarritos();
//    private final DAOProductos producto = new DAOProductos();
//    
////    public boolean crearPedidoDesdeCarrito(int id_usuario){
////        Connection conn = null;
////        try{
////            conn = Conexion.conectarBD();
////            conn.setAutoCommit(false);
////            
////            int id_carrito = DAOCarritos.obtenerIdCarritoPorIdUsuario(int id_usuario);
////            List<Producto_Carrito> productos_carrito = DAOCarritos.verCarrito(int id_usuario);
////            double total = DAOCarritos.calcularPrecioTotal(int id_usuario);
////        }
////    }
//}
