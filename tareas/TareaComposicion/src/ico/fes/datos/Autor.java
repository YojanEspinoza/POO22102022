/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.datos;

/**
 *
 * @author yojan
 */
public class Autor {
    //Atributos
    private String nombres;
    private String apellidos;
    private int añonacimiento;
    private String nacionalidad;

    public Autor() {
    }

    public Autor(String nombres, String apellidos, int añonacimiento, String nacionalidad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.añonacimiento = añonacimiento;
        this.nacionalidad = nacionalidad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAñonacimiento() {
        return añonacimiento;
    }

    public void setAñonacimiento(int añonacimiento) {
        this.añonacimiento = añonacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", a\u00f1onacimiento=" + añonacimiento + ", nacionalidad=" + nacionalidad + '}';
    }
    
    
}
