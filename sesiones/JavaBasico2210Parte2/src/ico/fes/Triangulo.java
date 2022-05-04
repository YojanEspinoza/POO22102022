/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author yojan
 */
public class Triangulo implements Figura {
    private float base;
    private float altura;

    public Triangulo() {
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public float calcularArea() {
        return (this.base * this.altura)/2;
    }

    @Override
    public String saludar() {
        System.out.println("Hola soy un tringulo");
        return "Hola T";
    }
    
    

  
    
}
