/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_3;

public class Act2_libro {
    public static void main(String[] args) {
        Libro libro1,libro2;
        
        libro1 = new Libro(1,"Titulo 1","Autor 1",89);
        libro2 = new Libro(2,"Titulo 2","Autor 2",244);
        
        libro1.MostrarInformacion();
        libro2.MostrarInformacion();
        if (libro1.paginas>libro2.paginas){
            System.out.println("El libro con más páginas es "+libro1.titulo);
        }
        else if (libro1.paginas>libro2.paginas){
            System.out.println("El libro con más páginas es "+libro1.titulo);
        }
        else{
            System.out.println("Tienen el mismo número de páginas");
        }
    }
}
