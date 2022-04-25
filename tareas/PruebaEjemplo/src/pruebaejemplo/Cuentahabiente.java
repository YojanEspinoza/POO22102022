/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author yojan
 */
public class Cuentahabiente {
    private int idCliente;
    private String nombre;
    private float balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(int idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    
        
    public void retirarDinero( float monto ){
        float op;
        float retiro;
        op = balance - monto;
        retiro = balance - op;
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println( "Hace un retiro de: " + retiro );
        System.out.println( "El balance actual despues del retiro es: " + op );
    }
    
    public String evaluarNivelCliente(){
        
        System.out.println( " *** CLIENTE *** ");
        System.out.println("ID: " + idCliente + " | Nombre: " + nombre + " | Balance: " + balance );
        String nivel = " ";
        nivel = ( balance <= 50000)? "Cliente Regular" : "Cliente Premium";
        System.out.println("Segun su balance actual...." );
        System.out.println("Es: " + nivel );
        return null;
    }
   
}
    

