public class Act1_Persona {
    public static void main(String[] args) {
        Persona Alan, Izan;

        Alan = new Persona("Alan",19,"alancorreo@gmail.com");
        Izan = new Persona("Izan",18,"izancorreo@gmail.com");

        System.out.println(Alan.infoPersona());
        System.out.println(Izan.infoPersona());

        Alan.cumplirAños();
        Izan.cumplirAños();

        System.out.println("-------------------");
        System.out.println(Alan.infoPersona());
        System.out.println(Izan.infoPersona());
    }
}
