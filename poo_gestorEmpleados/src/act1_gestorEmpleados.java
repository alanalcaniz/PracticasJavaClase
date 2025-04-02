import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class act1_gestorEmpleados {
    public static void main(String[] args) {
        Globales.empleados = new ArrayList<Empleado>();
        Globales.lector = new Scanner(System.in);
        int respuesta = 100;
        while (respuesta != 0){
            mostrarMenu();
            System.out.println("Elige una opción: ");
            respuesta = Globales.lector.nextInt();
            if (respuesta==1){
                anadirEmpleado();
            }
            else if (respuesta==2){
                mostrarEmp();
            }
            else if (respuesta==3){
                borrarEmpleado();
            }
            else if (respuesta==4){
                costeSalariosTotal();
            }
            else if (respuesta==0){
                break;
            }
            else{
                System.out.println("No me has dado una opción valida");
            }
        }
    }

    public static void anadirEmpleado(){
        String dni;
        String nombre;
        String apellidos;
        String direccion;
        String puesto;
        String salario;
        Globales.lector.nextLine();
        System.out.print("dime el dni: ");
        dni = Globales.lector.nextLine();
        System.out.print("dime el nombre: ");
        nombre = Globales.lector.nextLine();
        System.out.print("dime el apellidos: ");
        apellidos = Globales.lector.nextLine();
        System.out.print("dime el direccion: ");
        direccion = Globales.lector.nextLine();
        System.out.print("dime el puesto: ");
        puesto = Globales.lector.nextLine();
        System.out.print("dime el salario: ");
        salario = Globales.lector.nextLine();

        Empleado e = new Empleado(dni,nombre,apellidos,direccion,puesto,salario);
        Globales.empleados.add(e);
        System.out.println("Empleado añadido.");
    }

    public static void mostrarEmp(){

    }

    public static void borrarEmpleado(){

    }

    public static void costeSalariosTotal(){

    }

    public static void mostrarMenu(){
        System.out.println("QUE DESEA HACER?");
        System.out.println("1. Crear Empleado");
        System.out.println("2. Listar Empleados");
        System.out.println("3. Borrar Empleados");
        System.out.println("4. Calcualar Salario Total");
        System.out.println("0. Salir");
    }
}
