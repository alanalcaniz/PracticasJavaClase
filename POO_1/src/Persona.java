public class Persona {
    private String nombre;
    private int edad;
    private String correo;

    public Persona(String name, int age, String mail){
        this.nombre = name;
        this.edad = age;
        this.correo = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

//-------------------------------
    public String infoPersona(){
        return "Nombre: "+nombre+", Edad: "+edad+", Correo: "+correo;
    }

    public void cumplirAños(){
        this.edad=edad+1;
    }
}
