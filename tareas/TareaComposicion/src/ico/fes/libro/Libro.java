/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.libro;

import ico.fes.datos.Autor;
import ico.fes.datos.Editorial;

/**
 *
 * @author yojan
 */
public class Libro {
    //Aplicamos composicion
    private String titulo;
    private String tipopasta;
    private int paginas;
    private Autor autor;
    private Editorial editorial;

    public Libro() {
    }

    public Libro(String titulo, String tipopasta, int paginas, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.tipopasta = tipopasta;
        this.paginas = paginas;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipopasta() {
        return tipopasta;
    }

    public void setTipopasta(String tipopasta) {
        this.tipopasta = tipopasta;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", tipopasta=" + tipopasta + ", paginas=" + paginas + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
    
}
