/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

import java.lang.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
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
        
        //ArrayList de la clase perro
        System.out.println("----- ArrayList -----");
        //Comparado con un arreglo normal, en esta 
        //puedes agregar y quitar mas o menos elementos.
        ArrayList mascotas = new ArrayList();
        mascotas.add( new Perro( "Poddle", 1 ) );
        mascotas.add( new Perro( "Doverman", 2 ) );
        mascotas.add( new Perro( "Akita", 2 ) );
        mascotas.add( new Perro( "Gran Danes", 3 ) );
        mascotas.add( new Perro( "Chihuahua", 0 ) );
        
        for (Object mascota : mascotas) {
            Perro tmp = ( Perro )mascota;
            System.out.println( tmp );
        }
        
        //Despues de la version 2 de Java se agrego el concepto
        //de clases genericas
        //ES MEJOR USAR LAS CLASES GENERICAS
        System.out.println("----- REESCRIBIENDO CON CLASES GENERICAS -----");
        //Los datos internos van a ser de tipo perro
        ArrayList<Perro> mascotas2 = new ArrayList<Perro>();
        mascotas2.add( new Perro( "Poddle", 1 ) );
        mascotas2.add( new Perro( "Doverman", 2 ) );
        mascotas2.add( new Perro( "Akita", 2 ) );
        mascotas2.add( new Perro( "Gran Danes", 3 ) );
        mascotas2.add( new Perro( "Chihuahua", 0 ) );
        //Regresa de tipo perro y solo se imprime 
        
        System.out.println("----- CAMBIAR EL TAMAÑO DE ALGUN PERRO SEGUN SU RAZA ----- ");
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Que raza quieres cambiar el tamaño?");
        String raza = teclado.next(); //Faltan excepciones
        
        for (Perro perro : mascotas2) {
            if(perro.getRaza().equals( raza )){
                perro.setTamaño(4);
            }
        }
        
        for (Perro perro : mascotas2){
            System.out.println( perro );
        }
        /*
        System.out.println("----- AGREGANDO OTRO PERRO -----");
        mascotas2.add(2, new Perro( "Pug", 2 ));
        for (Perro perro : mascotas2) {
            System.out.println( perro );   
        }
        */                                         
        System.out.println("----- AGREGANDO PERRO EN UN LUGAR EN ESPECIFICO -----");
        mascotas2.add(2, new Perro("Pug",2));
        for (Perro perro : mascotas2) {
            System.out.println( perro );
        }
        System.out.println("--------------------------------");
        System.out.println("Perro 2 es : " + mascotas2.get(2));//Regresa un objeto en la posicion i       
        
        System.out.println("----- Eliminar el Akita, index 3 -----");
        Perro p = mascotas2.remove(3); //Se almacena el elemtno que se quiera sacar
        
        for (Perro perro : mascotas2) {
            System.out.println(perro);
        }
        System.out.println("----- IMPRIMIEDNO VALOR ELIMINADO ----- ");
        System.out.println("El perro sacado es " + p);
        //Intercambiando por el que se saco
        mascotas2.set(1, new Perro("Boxer" ,3));
        mascotas2.set(2, new Perro("Labrador", 4));
        System.out.println("----- INTERCAMBIANDO PERROS -----");
        for (Perro perro : mascotas2) {
            System.out.println(perro);           
        }
        
        //MANEJO DE EXCEPCIONES
        System.out.println("----- ESCOGIENDO UN PERRO PARA IMPRIMIR -----");
        System.out.print("Elige un numero entre 0 y 4: ");
        //CODIGO PARA EL MANEJO DE EXCEPCIONES
        Perro puppy=null;//puppy es un valor de tipo Perro
        int num = 10;
                
        //AGRUPACION DE EXCEPCIONES, DE ACUERDO A SU JERAQUIA
        try{
            int indice = teclado.nextInt();
            num = num / indice;
            puppy = mascotas2.get(indice);
        }catch(IndexOutOfBoundsException ex){
            System.out.println("Ocurrio un error...");
            System.out.println("El valor debe estar entre 0 y 4");
            System.out.println( ex.getMessage() );//Manda a llamar la excepcion
            puppy = mascotas2.get(0); //Si la persona pone un numero mayor al de los arreglos, 
                                      //se imprime el primer elemento
        }catch(InputMismatchException ime){
            System.out.println("Solo deben de ser numeros");
            puppy = mascotas2.get(0);
        }catch(Exception e){
            System.out.println("Ultimo recurso...");
        }finally{//Siempre se ejecuta, no importa si detecta o no excepcion   
            System.out.println("En finally");
            System.out.println(puppy);
        }
        // Un ERROR es diferente a una EXEPCION
        System.out.println("Se alcanzo el fin del programa");
    }
    
}
