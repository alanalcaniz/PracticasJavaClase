public class Act3_Circulo {
    public static void main(String[] args) {
        Circulo circulo1,circulo2;

        circulo1 = new Circulo(5);
        circulo2 = new Circulo(8);

        System.out.println("El area del circulo 1 es: "+circulo1.calcularArea());
        System.out.println("El area del circulo 2 es: "+circulo2.calcularArea());

        System.out.println("El perimetro del circulo 1 es: "+circulo1.calcularPerimetro());
        System.out.println("El perimetro circulo 2 es: "+circulo2.calcularPerimetro());
    }
}
