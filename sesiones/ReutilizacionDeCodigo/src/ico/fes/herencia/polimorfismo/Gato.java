/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia.polimorfismo;

/**
 *
 * @author yojan
 */
public class Gato extends Animal{
    private String raza;

    public Gato() {
    }

    public Gato(String raza) {
        this.raza = raza;
    }

    public Gato(String raza, int numeroPatas) {
        super(numeroPatas);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() +"Gato{" + "raza=" + raza + '}';
    }
    
    //Sobreescritura de metodo
    @Override
    public void hablar(){
        System.out.println("El gato de raza "+ this.raza + " está maullando");
        System.out.println("Miauuuuu...!!");
    }
   
    //Sobrecarga de metodo
    public void hablar(int veces){
        for( int i = 0 ; i < veces ; i++ ){
                System.out.print("Miauuuu... ");
        }
        System.out.println("...");
    }
}
