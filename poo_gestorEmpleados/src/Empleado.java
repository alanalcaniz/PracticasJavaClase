public class Empleado {
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String puesto;
    private String salario;

    public Empleado(String dni, String nombre, String apellidos, String direccion, String puesto, String salario){
        this.dni=dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.direccion=direccion;
        this.puesto=puesto;
        this.salario=salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public void MostrarDetalles(){
        System.out.println("DNI: "+this.dni+", Nombre: "+this.nombre+", Apellidos: "+this.apellidos+", Direccion: "+this.direccion+", Puesto: "+this.puesto+", Salario: "+this.salario);
    }

    public void MostrarEmpleado(){
        System.out.println(this.nombre+" "+this.apellidos);
    }
}
