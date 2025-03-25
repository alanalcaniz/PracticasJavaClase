/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_3;

public class Cancion {
    private String titulo;
    private String autor;
    private int duracion;
    
    public Cancion(String titulo, String autor, int duracion){
        this.titulo=titulo;
        this.autor=autor;
        this.duracion=duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    //-----
    
    public void dameTitulo(){
        String nombre = this.titulo;
        System.out.println(nombre);
    }
    
    public void dameAutor(){
        String autor = this.autor;
        System.out.println(autor);
    }
    
    public void dameDuracion(){
        System.out.println(this.duracion);
    }
    
    public void ponTitulo(String tit){
        this.titulo=tit;
    }
    
    public void ponAutor(String aut){
        this.autor=aut;
    }
    
    public void ponDuracion(int dur){
        this.duracion=dur;
    }
    
    public void mostrarInformacion(){
        System.out.println("El autor es: "+this.autor+", El titol es: "+this.titulo+", La duracion es: "+this.duracion);
    }
}
