/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizaciondecodigo;

import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.equipos.Computadora;
import ico.fes.herencia.Alumno;
import ico.fes.iu.MiVentana;
/**
 *
 * @author yojan
 */
public class ReutilizacionDeCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String facultad = new String("FES Aragon");
        char letra = facultad.charAt(4);
        System.out.println( letra );
        
        //MiVentana v1 = new MiVentana();
        Computadora compu = new Computadora();
        compu.setMarca("Asus");
        compu.setModelo("VivoBook 2");
        compu.setCpu( new Procesador ("Intel", "i9", 5.0f));
        
        Mouse raton = new Mouse();
        raton.setMarca("Logitech");
        compu.setRaton(raton);
        compu.getRaton().setModelo("GS400");
        
        //Monitor a marca Samsung, 45" y LED
        
        //Metodo 1
        Monitor pantalla = new Monitor();
        pantalla.setMarca("Samsung");
        pantalla.setPulgadas(45f);
        pantalla.setTipo("LED");
        compu.setPantalla( pantalla);
        
        //Metodo 2
        compu.setPantalla(new Monitor("Samsung", "LED", 45f));
        
        //Solo cambiar la marca a "LG" sin alterar lo demas
        compu.getPantalla().setMarca("LG");
        
        
        System.out.println( compu );
        
        //HERENCIA
        System.out.println("------------HERENCIA--------------");
        Alumno alu1 =new Alumno();
        alu1.setNombre("Jose");
        System.out.println( alu1 );
        
        
        Alumno alu2 = new Alumno("121212-5", "Derecho", 2,"Mario", 20);
        System.out.println( alu2 );
        
        
        
    }
    
}
