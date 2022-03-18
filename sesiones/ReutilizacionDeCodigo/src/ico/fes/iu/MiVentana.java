/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author yojan
 */
public class MiVentana extends JFrame{
    public MiVentana() throws HeadlessException {
        this.setSize(600, 400);//Se configura el tamaño de la ventana
        this.setVisible(true);//Hace visible la ventana con el true
        this.setTitle("Hola Mundo De Reutilizacion"); //Agrega titulo a la ventana
    } 
    
}
