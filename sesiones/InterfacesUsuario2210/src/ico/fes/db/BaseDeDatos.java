/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.db;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class BaseDeDatos {
    private Connection conexion;
    private static BaseDeDatos instanciaUnica;

    private BaseDeDatos() {
        try {
            String url="jdbc:sqlite:" + System.getProperty("user.dir")+"/poo2022.db"; 
            conexion = DriverManager.getConnection(url); 
            System.out.println("Conexión establecida...");
            } catch (SQLException e){ 
             System.out.println(e.getMessage());
            }
    }
    
    public static BaseDeDatos getInstance(){
        if(instanciaUnica == null){
            //voy a invocar el constructor
            instanciaUnica = new BaseDeDatos();
        }else{
            //ya esta creado, no hacer nada
            System.out.println("Ya no se invoca al constructor");
        }
        return instanciaUnica;
    }

    public Connection getConexion() {
        return conexion;
    }
    
    public static void main(String[] args) {
        try {
            Statement stm = BaseDeDatos.getInstance().getConexion().createStatement();
            //SELECT o un Update...
            Statement stm2 = BaseDeDatos.getInstance().getConexion().createStatement();
            //Select con stm2...
        } catch (SQLException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
