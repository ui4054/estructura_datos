package uml_facil;

public class Persona {
    private String nombre;
    private int edad;

    // definicion de contructor
    public Persona() {
    }

    // SET DE LA edad VARIABLE, notese que usa void por que no
    // devuelve nada y llama la variable de clase this.edad
    public void setEdad(int val) {
        this.edad = val;
    }

    // GET DE LA edad VARIABLE
    public int getEdad() {
        return edad;
    }

    // set del nombre con void.
    public void setNombre(String val) {
        this.nombre = val;
    }

    // get del nombre variable
    public String getNombre() {
        return nombre;
    }
}
