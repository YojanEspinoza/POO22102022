/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2210parte2;

import ico.fes.Circulo;
import ico.fes.Cuadrado;
import ico.fes.Figura;
import ico.fes.Rectangulo;
import ico.fes.Triangulo;
import ico.fes.herencia.EstudianteDeportistaArtista;
import ico.fes.herencia.Artista;
import ico.fes.herencia.Deportista;
import ico.fes.herencia.Persona;
import java.awt.Color;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author yojan
 */
public class JavaBasico2210Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado c = new Cuadrado(4.0f, 4.0f);
        Circulo cir = new Circulo(5.0f);
        Triangulo tri = new Triangulo(3.0f, 5.0f);
        Rectangulo rec = new Rectangulo(3.0f, 6.0f);

        System.out.println("El area del cuadrado es: " + c.calcularArea());
        System.out.println("El area del circulo es: " + cir.calcularArea());
        System.out.println("El area del triangulo es: " + tri.calcularArea());
        System.out.println("El area del rectangulo es: " + rec.calcularArea());

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escoge una opcion: 1)cuadrado, 2)circulo, 3)triangulo, 4)rectangulo");
        int opcion = teclado.nextInt(); //Excepciones
        switch (opcion) {
            case Figura.CUADRADO://En la clase figura esta igual es 1
                System.out.println(c.calcularArea());
                break;
            case Figura.CIRCULO:
                System.out.println(cir.calcularArea());
                break;
            case Figura.TRIANGULO:
                System.out.println(tri.calcularArea());
                break;
            case Figura.RECTANGULO:
                System.out.println(rec.calcularArea());
                break;
            default:
                System.out.println("Opcion no valida");

        }

        JOptionPane.showMessageDialog(null, "Hola", "El titulo", JOptionPane.ERROR_MESSAGE);

        //COLORES
        //Color color = new Color(Color.GREEN);
        //Color miColor = new Color(186, 52, 235);
        
        System.out.println("---------------------------------------------");
        EstudianteDeportistaArtista eda = new EstudianteDeportistaArtista();
        eda.setNombre("Daniela");
        eda.entrenar();
        eda.ensayar();
        eda.comer();
    }

}
