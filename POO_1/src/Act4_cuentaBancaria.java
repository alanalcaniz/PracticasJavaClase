public class Act4_cuentaBancaria {
    public static void main(String[] args) {
        cuantaBancaria anfitrion1,anfitrion2;

        anfitrion1=new cuantaBancaria("Jose",53000);
        anfitrion2=new cuantaBancaria("Pepe",13000);

        System.out.println(anfitrion1.mostrarInfo());
        System.out.println(anfitrion2.mostrarInfo());

        anfitrion1.ingresarSaldo(100);
        anfitrion2.ingresarSaldo(350);

        System.out.println("---------------------");
        System.out.println(anfitrion1.mostrarInfo());
        System.out.println(anfitrion2.mostrarInfo());

        anfitrion1.retirarSaldo(3400);
        anfitrion2.retirarSaldo(5550);

        System.out.println("---------------------");
        System.out.println(anfitrion1.mostrarInfo());
        System.out.println(anfitrion2.mostrarInfo());

    }
}
