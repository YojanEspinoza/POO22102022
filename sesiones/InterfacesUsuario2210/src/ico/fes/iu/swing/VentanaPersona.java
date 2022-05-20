/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu.swing;

import ico.fes.iu.swing.modelos.ModeloPersonaCombo;
import ico.fes.iu.swing.modelos.Persona;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class VentanaPersona extends JFrame {
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblEdad;
    private JTextField txtEdad;
    private JButton btnAgregar;
    private JComboBox<Persona> lista;
    private ModeloPersonaCombo modelo;
    private ArrayList<Persona> info;
    
    public VentanaPersona() {
        lblNombre = new JLabel("Nombre: ");
        txtNombre = new JTextField(15);
        lblEdad = new JLabel ("Edad: ");
        txtEdad = new JTextField(3);
        btnAgregar = new JButton("Agregar: ");
        lista = new JComboBox<Persona>();
         
        info = new ArrayList();
        info.add(new Persona("Jose", 22));
        info.add(new Persona("Maria", 23));
        info.add(new Persona("Jesus", 33));
        
        modelo = new ModeloPersonaCombo(info, null);
        lista.setModel(modelo);
        
        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(lblNombre);
        this.getContentPane().add(txtNombre);
        this.getContentPane().add(lblEdad);
        this.getContentPane().add(txtEdad);
        this.getContentPane().add(btnAgregar);
        this.getContentPane().add(lista);
        
        this.setSize(400,300);
        this.validate();
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        
        });
        
        btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //true -- ok       false -- algunos de los campos esta vacio
                if (validarFormulario()){
                modelo.agregarPersona(new Persona(txtNombre.getText(), 
                                                  Integer.parseInt(txtEdad.getText())));
                lista.repaint();
                borrarFormulario();
                }else{
                    JOptionPane.showMessageDialog(null, "No puedes dejar vacios los campos", 
                                                        "Error del formulario", JOptionPane.ERROR_MESSAGE);
                }
            }
        
        });
        
        this.lista.addItemListener(new ItemAdapter() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                
            }
        
        });
    }

    public VentanaPersona(JLabel lblNombre, JTextField txtNombre, JLabel lblEdad, JTextField txtEdad, JButton btnAgregar, JComboBox<Persona> lista) {
        this.lblNombre = lblNombre;
        this.txtNombre = txtNombre;
        this.lblEdad = lblEdad;
        this.txtEdad = txtEdad;
        this.btnAgregar = btnAgregar;
        this.lista = lista;
    }
    
    private void borrarFormulario(){
        this.txtNombre.setText("");
        this.txtEdad.setText("");
    }
    
    private boolean validarFormulario(){
        boolean valido = true;
        if(txtEdad.getText().equals("")||txtNombre.getText().equals("")){
            valido = false;
        }
        
        return valido;
    }
}
