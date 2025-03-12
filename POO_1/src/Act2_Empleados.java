public class Act2_Empleados {
    public static void main(String[] args) {
        Empleado empleado1,empleado2;

        empleado1 = new Empleado("Pepe", 2000);
        empleado2 = new Empleado("Juan", 3000);

        System.out.println(empleado1.mostrarInfo());
        System.out.println(empleado2.mostrarInfo());

        System.out.println(empleado1.salarioAnual());
        System.out.println(empleado2.salarioAnual());
    }
}
