/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author yojan
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuentahabiente [] lista = new Cuentahabiente[5];
    lista [0] = new Cuentahabiente ( 95761, "Eduardo Garza", 110000);
    lista [1] = new Cuentahabiente ( 87651, "Juan Gonzales", 120000);
    lista [2] = new Cuentahabiente ( 45453, "Orlando Paniagua", 50000);
    lista [3] = new Cuentahabiente ( 34142, "Emilio Cordoba", 36000);
    lista [4] = new Cuentahabiente ( 29510, "Marcos Jimenez", 45000);
   
        for( Cuentahabiente cuentahabiente : lista ){
            System.out.println("=================================================");
            cuentahabiente.evaluarNivelCliente();
            cuentahabiente.retirarDinero(25000);
            
            
        }
    }
}
    

