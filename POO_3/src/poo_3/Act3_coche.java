/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_3;

public class Act3_coche {
    public static void main(String[] args) {
        Coche coche1,coche2;
        
        coche1 = new Coche("BMW","El de Aaron mateixa",150,true);
        coche2 = new Coche("Peugeot","208",120,false);
        
        
        coche1.MostrarInformacion();
        coche2.MostrarInformacion();
        coche2.Arrancar();
        coche1.Parar();
        coche1.Acelerar(10);
        coche2.Frenar(30);
        coche1.MostrarInformacion();
        coche2.MostrarInformacion();
    }
}
