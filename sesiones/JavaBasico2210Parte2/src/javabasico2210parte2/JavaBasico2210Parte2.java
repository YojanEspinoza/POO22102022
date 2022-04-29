/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2210parte2;

import ico.fes.Circulo;
import ico.fes.Cuadrado;

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
        
        System.out.println( c.calcularArea() );
        System.out.println( cir.calcularArea() );
    }
    
}
