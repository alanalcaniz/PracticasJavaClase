/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_3;

public class Libro {
    private int isbn;
    public String titulo;
    private String autor;
    public int paginas;
    
    public Libro(int isbn, String titulo, String autor, int paginas){
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.paginas=paginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void MostrarInformacion(){
        System.out.println("El libro con el ISBN "+this.isbn+" con el nombre "+this.titulo+" es del"
                + " autor "+this.autor+" y tiene "+this.paginas+" páginas");
    }
    
}
