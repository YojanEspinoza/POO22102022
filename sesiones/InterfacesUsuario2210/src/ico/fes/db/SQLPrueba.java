/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.db;
import java.sql.*;
/**
 *
 * @author USER
 */

//SOLO PARA PROBAR
public class SQLPrueba {
    private Connection conexion;
    public static void main(String[] args) {
        Connection conexion;
         
        try {
            String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "/poo2022.db";
            conexion = DriverManager.getConnection(url);
            System.out.println(System.getProperty("user.dir") + "/poo2022.db");
            System.out.println("Conexión establecida...");
            Statement stm = conexion.createStatement();
            //stm.execute("CREATE TABLE alumno(id INT, nc VARCHAR(20) , nombre VARCHAR(50));");
            //stm.execute("INSERT INTO alumno VALUES(1,'12345','Diana');");
            
            ResultSet rst = stm.executeQuery("SELECT * FROM alumno;");
            
            while( rst.next() ){
                System.out.print("Id:" + rst.getInt(1));
                System.out.println(" Nombre:" + rst.getString(3));
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
