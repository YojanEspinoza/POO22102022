/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

import java.lang.*;
/**
 *
 * @author yojan
 */
public class JavaBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 22;
        Integer edad2 = new Integer(2);
        float x = edad2.floatValue();
        System.out.println(x);
        String dias = "23";
        System.out.println((dias + 3));
        int temp = Integer.parseInt(dias);
        
        edad2.parseInt("33");
        System.out.println("Dias = "+(temp + 3));
        
        Perro dog1 = new Perro("Poodle", 1);
        Perro dog2 = new Perro("Poodle", 1);
        Perro dog3 = new Perro("Poodle", 1);
        System.out.println( dog1 );
        System.out.println( Perro.cola );
        System.out.println( dog1.cola );
        System.out.println( dog2.cola );
        System.out.println( dog3.cola );
        
        //No es necesario importar la clase ya que estan en el mismo paquete
        Perro.ladrar();
        
        String cad1 = "Hola ";
        String cad2 = "Mundo ";
        String cad3 = cad1 +cad2; //Concatenando 
        System.out.println( cad3 );
        
        System.out.println( "Edad :" + edad + " años");
        
        String res = " ";
        /*edad = 15;
        if (edad >= 18){
            res = "Mayor de edad";
        }else{
            res = "Menor de edad";
        }
        
        System.out.println("Eres : " + res );
        */
        //OPERADOR TERNARIO
        System.out.println("-------------------------------");
        edad = 15;
        res = (edad>=18)?"Mayor de edad":"Menor de edad";
        System.out.println(edad);
        System.out.println("Eres : " + res );
    }
    
}
