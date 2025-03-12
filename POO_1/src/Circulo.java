public class Circulo {
    private int radio;
    public int area=0;
    public int perimetro=0;

    public Circulo(int radio){
        this.radio=radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    //---------------
    public int calcularArea(){
        return area=(int)3.1416*(radio*radio);
    }

    public int calcularPerimetro(){
        return perimetro=2*(int)3.1416*radio;
    }
}
