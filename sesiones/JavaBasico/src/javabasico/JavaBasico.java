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
        
        System.out.println("----- OPERADORES AND Y OR -----");
        int val1 = 7;
        int val2 = 2;
        System.out.println( val1 | val2);
        System.out.println( val1 & val2);
        
        /*
        val1 = 000...0111
        and
        val2 = 000...0010
        -------------------
               000...0010 // 2 decimal
        */
        // Desplazamiento a nivel de bits
        System.out.println("----- DESPLAZAMIENTO A NIVEL DE BITS -----");
        int val3 = 1; //000...0001
        int val4 = val3<<1; // Desplazar los bits una posicion a la izquierda
                            // 000...0010
        System.out.println( val4 );
        val4 = val4<<1;
        System.out.println( val4 );
        
        System.out.println("-----ARREGLOS-----");
        int[]edades; //Aqui solo se declara
        int[]edades2 = new int[5]; //Aqui se declara y reserva en memoria
        int[]edades3 = {22,21,18,19,18};//En esta, se declara, reserva e inicializa
        
        /*
        Ahora, se usa igual como en lang C, C++, Python.... etc
        */
        edades2[0] = 33;
        System.out.println( edades2[0] ); //33
        System.out.println( edades2[1] ); //0
        
        //Ahora imprimos las edades3
        System.out.println("Edades 3 a mano");
        System.out.println( edades3[0] );
        System.out.println( edades3[1] );
        System.out.println( edades3[2] );
        System.out.println( edades3[3] );
        System.out.println( edades3[4] );
        
        //Ahora lo combinamos con FOR
        System.out.println("-----Automatizado-----");
        for (int i = 0; i < edades3.length; i++) {
            int j = edades3[i];
            System.out.println( edades3[i]);
        }
        //IMPRIMIR EDADES EN ORDEN INVERSO DE 18 A 22
        System.out.println("-----ORDEN INVERSO-----");
        for (int i = edades3.length-1; i>=0; i--) {
            System.out.println( edades3[i] );
        }
        
             
        //CAMBIAR TODAS LAS EDADES DE edades3 A 18
        System.out.println("-----TODOS A 18-----");
        for (int i = 0; i < edades3.length; i++) {
            edades3[i] = edades3[2];
            System.out.println( edades3[i] );
        }
        
        /*
        for EACH es un for especial, introducido en la version 2 de Java.
        En esa version, Java sufrio muchos cambios que lo mejoraron bastante.
        El objetivo del For Eachh es simplificar la forma de recorrer arreglos:
        Se puede usar: fore + tabulador
        */
        System.out.println("----- FOR EACH -----");
        System.out.println("CON FOR EACH");
        for (int ed : edades3) {
            System.out.println( ed );
        }
        /*
        Los : significan que del arreglo que esta al frente  de los ":", 
        sacar el siguiente elemento y asignarlo a lo que esta a la
        izquierda de los ":"
        */
        //Comparado con el for original, este queda de una mejor manera 
        
        System.out.println("----- Arreglo de la clase perro -----");
        Perro [] lista = new Perro[3];
        lista[0] = new Perro("Poddle", 1);
        lista[1] = new Perro("San bernardo", 3);
        lista[2] = new Perro("Akita", 2);
        for (Perro perro : lista) {
            perro.comer();
        }
        System.out.println("----- CAMBIANDO LOS PERROS A RAZA DOVERMAN -----");
        for (Perro perro : lista) {
            perro.setRaza("Doverman");
        }
        //Imprimiendo la lista nuevamente
        for (Perro perro : lista) {
            System.out.println( perro );
        }
        
    }
    
}
