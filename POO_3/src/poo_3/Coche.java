/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_3;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidadmaxima;
    private boolean arrancado;
    
    public Coche(String marca, String modelo, int velocidadmaxima,boolean arrancado){
        this.marca=marca;
        this.modelo=modelo;
        this.velocidadmaxima=velocidadmaxima;
        this.arrancado=arrancado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadmaxima() {
        return velocidadmaxima;
    }

    public void setVelocidadmaxima(int velocidadmaxima) {
        this.velocidadmaxima = velocidadmaxima;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }
    
    public void Arrancar(){
        if(this.arrancado=true){
            System.out.println("El coche ya estaba arrancado.");
        }
        else{
            this.arrancado=true;
        }
    }
    
    public void Parar(){
        if(this.arrancado=false){
            System.out.println("El coche ya estaba parado.");
        }
        else{
            this.arrancado=false;
        }
    }
    
    public void Acelerar(int num){
        if (this.arrancado=false){
            System.out.println("El coche está parado, arrancalo.");
        }
        else{
            this.velocidadmaxima = this.velocidadmaxima+num;
        }
    }
    
    public void Frenar(int num){
        if (this.arrancado=false){
            System.out.println("El coche está parado, arrancalo.");
        }
        else{
            this.velocidadmaxima = this.velocidadmaxima-num;
            if(this.velocidadmaxima<num){
                System.out.println("Has intentado frenar más km/h de los que ivas");
                System.out.println("Vas a 0, o sea, has parado");
                this.arrancado=false;
            }
        }
    }
    
    public void MostrarInformacion(){
        if(this.arrancado=false){
            System.out.println("El coche es marca "+this.marca+", modelo: "+
                this.modelo+", el cual está parado y tiene una velocidad"
                        + " de "+this.velocidadmaxima);
        }else{
            System.out.println("El coche es marca "+this.marca+", modelo: "+
                this.modelo+", el cual está en movimiento y tiene una velocidad"
                        + " de "+this.velocidadmaxima);
        }
        
    }
}
