/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu.swing;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author yojan
 */
public class VentanaSwing extends JFrame {
    private FlowLayout layout;
    private JTextField cuadroTexto;
    private JButton boton;
    private JLabel resultado;
    private JComboBox<String> lista;
    

    public VentanaSwing() throws HeadlessException {
        this.setTitle("Mi ventanas Swing");
        this.setSize(300, 220);
        this.setVisible(true);
        layout = new FlowLayout();
        this.setLayout(layout);
        cuadroTexto = new JTextField(15);
        boton = new JButton("Convertir a F.");
        resultado = new JLabel("grados F.");
        
        //ComboBox
        lista = new JComboBox<String>();
        //Usando DefaultComboBoxModel
        lista.addItem("Rojo");
        lista.addItem("Verde");
        lista.addItem("Azul");
        lista.addItem("Blanco");
       
        
        this.getContentPane().add(cuadroTexto);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        
        //ComboBox
        this.getContentPane().add(lista);
        
        this.pack();
        this.setVisible(true);

        //REGENERA LA INTERFAZ GRAFICA
        //this.validate();
        
        //Evento para cerrar la ventana 
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //Cierra el programa
                System.exit(0);
                
                //Este otro es para cerrar solo una ventana
                //((JFrame)e.getSource()).setVisible(false);
            }
            
        });
        
        //Evento para convertir grados C a grados F
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Convertir String de entrada en float
                //A esta situacion le van a faltar excepcines 
                
                //Con este codigo se convierte el String a un float
                float centigrados = Float.parseFloat( cuadroTexto.getText() );
                
                //??F = (??C x 9/5) + 32
                float farenheit = (centigrados * (9.0f/5.0f))+32.0f;
                resultado.setText(farenheit + " ??F");
            }
            
        });
        
        //Creamos ItemAdpater, implementandolo en la clase creada con su mismo nombre
        this.lista.addItemListener(new ItemAdapter() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Cambi?? el item");
                System.out.println( e.getItem() ); //Imprimiendo el contenido del item  seleccionado 
            }
            
        });
        
    }
    
    
}
