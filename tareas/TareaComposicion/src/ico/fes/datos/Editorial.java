/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.datos;

/**
 *
 * @author yojan
 */
public class Editorial {
    //Atributos
    private String nombre;
    private String pais;
    private int año;

    public Editorial() {
    }

    public Editorial(String nombre, String pais, int año) {
        this.nombre = nombre;
        this.pais = pais;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", pais=" + pais + ", a\u00f1o=" + año + '}';
    }
    
    
  
    
   
}
