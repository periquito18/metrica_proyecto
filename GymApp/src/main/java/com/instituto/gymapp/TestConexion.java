package com.instituto.gymapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import util.Conexion;

public class TestConexion {
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
    public static void main(String[] args) { 
=======
    public static void main(String[] args) {
>>>>>>> Stashed changes
=======
    public static void main(String[] args) {
>>>>>>> Stashed changes
=======
    public static void main(String[] args) {
>>>>>>> Stashed changes
        try (Connection conn = Conexion.conectarBD()) {
            System.out.println("Conexión exitosa a la BD");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM producto");
            if (rs.next()) {
                System.out.println("Número de productos en BD: " + rs.getInt(1));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Error de conexión o consulta: " + e.getMessage());
        }
    }
}