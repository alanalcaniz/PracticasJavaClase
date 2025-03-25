/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_3;

public class Act1_cancion {
    public static void main(String[] args) {
        Cancion cancion1;
        
        cancion1 = new Cancion("The Rise Of Fox Hero","Josep Monzonis",5000);
        
        cancion1.dameTitulo();
        cancion1.dameAutor();
        cancion1.dameDuracion();
        System.out.println("Actualizaremos toda la información (no se mostrará)");
        cancion1.ponTitulo("Horned Knigth");
        cancion1.ponAutor("Josep altra volta");
        cancion1.ponDuracion(200);
        System.out.println("Mostraremos toda la información: ");
        cancion1.mostrarInformacion();
    }
}
