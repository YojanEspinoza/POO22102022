/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author yojan
 */
public class Alumno extends Persona {
    //Es String porque tiene un guion 
    private String numCuenta;
    private String carrera;
    private int semestre;

    public Alumno() {
    }

    public Alumno(String numCuenta, String carrera, int semestre) {
        this.numCuenta = numCuenta;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public Alumno(String numCuenta, String carrera, int semestre, String nombre, int edad) {
        super(nombre, edad);
        this.numCuenta = numCuenta;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "numCuenta=" + numCuenta + ", carrera=" + carrera + ", semestre=" + semestre + '}';
    }
    
    
    
    
    
}
