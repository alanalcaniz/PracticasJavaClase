public class Act2_cuadrado {
    public static void main(String[] args) {
        Cuadrado cuadrado1;

        cuadrado1=new Cuadrado(8,6,"*","0");

        for (int i = 0; i<cuadrado1.getAlto();i++){
            for (int j = 0; j<cuadrado1.getLargo();j++){
                if (j < 1 || j >= cuadrado1.getLargo()-1 || i < 1 || i >= cuadrado1.getAlto()-1){
                    System.out.print(cuadrado1.getBorde());
                }
                else{
                    System.out.print(cuadrado1.getContenido());
                }
            }
            System.out.println();
        }
    }
}
