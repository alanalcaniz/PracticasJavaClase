public class Empleado {
    private String nombre;
    private int salario;

    public Empleado(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //--------------------
    public String salarioAnual(){
        return "El salario anual de "+nombre+" es de "+(salario*12)+" al año";
    }

    public String mostrarInfo(){
        return "Nombre: "+nombre+", Salario: "+salario;
    }
}
