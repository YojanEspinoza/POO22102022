/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu.tarea.swing;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author yojan
 */
public class VentanaCifradoCesar extends JFrame{
    private FlowLayout layout;
    private JTextField cuadro1,cuadro2,cuadro3;
    private JButton boton;
    private JLabel eti1,eti2,eti3;

    public VentanaCifradoCesar() throws HeadlessException {
        //CREAMOS LOS COMPONENTES
        this.setTitle("Cifrado Cesar");
        this.setSize(1800,600);
        this.setVisible(true);
        
        layout = new FlowLayout();
        this.setLayout(layout);
        
        cuadro1 = new JTextField(2);
        cuadro2 = new JTextField(30);
        cuadro3 = new JTextField(30);
        
        boton = new JButton("Cifrar");
        eti1 = new JLabel("Desplazamiento:");
        eti2 = new JLabel("Ingresa el mensaje:");
        eti3 = new JLabel("El mensaje cifrado es: "); 
        
        //AGREGAMOS LOS COMPONENTES 
        this.getContentPane().add(eti1);
        this.getContentPane().add(cuadro1);
        this.getContentPane().add(eti2);
        this.getContentPane().add(cuadro2);
        this.getContentPane().add(boton);
        this.getContentPane().add(eti3);
        this.getContentPane().add(cuadro3);
        
        this.pack();
        this.setVisible(true);

        
        //EVENTO PARA CERRA LA VENTANA 
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //CIERRA EL PROGRAMA
                System.exit(0);
            }
            
        });
        
        //EVENTO PARA CIFRAR LA FRASE 
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //CONVERTIMOS EL STRING EN UN INT PARA PODER TRABAJARLO 
                int desplazamiento = Integer.parseInt( cuadro1.getText() );
                
                String frase = cuadro2.getText();
                String codificacion = "";
                String resultado;
                
                //LAS LETRAS MAYUSCULAS INTRODUCIDAS LAS CONVERTIMOS EN MINUSCULAS 
                frase = frase.toLowerCase();
                
                String letras = "abcdefghijklmnñopqrstuvwxyz";
                
                char uni;
                
                //PROCEDIMIENTO PARA CIFRAR
                for (int i = 0; i < frase.length(); i++) {
                    //EN CASO DE INTRODUCIR CARACTERES ESPECIALES SE PUEDEN CONSERVAR 
                    uni = frase.charAt(i);
                    int pos = letras.indexOf(uni);
                    if( pos == -1)
                        codificacion += uni;
                    for (int j = 0; j < letras.length(); j++) {
                        if (frase.charAt(i)==letras.charAt(j)){
                            codificacion += letras.charAt( ( j + desplazamiento )% letras.length() );
                        }
                        
                    }
                    
                }
                //IMPRESION DE RESULTADOS
                resultado = codificacion;
                cuadro3.setText( resultado );
            }
            
        });
        
        
        
    }
        
        
}
    
  
