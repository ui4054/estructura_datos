public class cliente {

    private String nif;
    private String nombre;
    private String apellidos;

    // se omiten los métodos ‘get’ y ‘set’ de la clase
    public cliente(String nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public void setNif(String val) {
        this.nif = val;
    }

    public String getNIF() {
        return nif;
    }

    public void setNombre(String val) {
        this.nombre = val;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String val) {
        this.apellidos = val;
    }

    public String getApellidos() {
        return apellidos;
    }

}
