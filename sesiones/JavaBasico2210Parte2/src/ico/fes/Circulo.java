/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author yojan
 */
//Palabra reservada implements
public class Circulo implements Figura{
    public static final float PI=3.1416f; //Declarando una constante 
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public float calcularArea() {
        return PI * (this.radio*this.radio);
    }

    @Override
    public String saludar() {
        System.out.println("Hola desde el ciculo :D");
        return "Hola C";
    }
    
    
}
