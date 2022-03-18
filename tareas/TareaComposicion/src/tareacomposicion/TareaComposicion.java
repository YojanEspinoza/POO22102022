/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacomposicion;

import ico.fes.datos.Autor;
import ico.fes.datos.Editorial;
import ico.fes.libro.Libro;
/**
 *
 * @author yojan
 */
public class TareaComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Atributos del Libro
        Libro libro = new Libro();
        libro.setTitulo("Trapos");
        libro.setTipopasta("Blanda");
        libro.setPaginas(144);
        
        //Atributos del autor
        Autor autor = new Autor();
        autor.setNombres("Juan Carlos");
        autor.setApellidos("Quezadas");
        autor.setAñonacimiento(1970);
        autor.setNacionalidad("Mexicana");
        libro.setAutor(autor);
        
        //Atributos de la editorial
        Editorial editorial = new Editorial();
        editorial.setNombre("Progreso");
        editorial.setPais("México");
        editorial.setAño(1899);
        libro.setEditorial(editorial);
        
        //imprimimos los datos
        System.out.println(libro);
    }
    
}
