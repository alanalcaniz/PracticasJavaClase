public class Cuadrado {
    private int largo;
    private int alto;
    private String contenido;
    private String borde;

    public Cuadrado(int largo, int alto, String contenido, String borde){
        this.largo=largo;
        this.alto=alto;
        this.contenido=contenido;
        this.borde=borde;
    }

    public String getBorde() {
        return borde;
    }

    public String getContenido() {
        return contenido;
    }

    public int getAlto() {
        return alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setBorde(String borde) {
        this.borde = borde;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }


    //------------

}
