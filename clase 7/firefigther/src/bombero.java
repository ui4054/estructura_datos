public class bombero {

    // declaración de variables
    private String nombre;
    private String apellido;
    private String edad;

    // definición de constructor y parametros

    public bombero(String nombreRecibido, String apellidoRecibido, String edadRecibido) {
        nombre = nombreRecibido;
        apellido = apellidoRecibido;
        edad = edadRecibido;
    }// cierre del contructor

    // descriptor de mutación del setter, leer variables de clase
    public void setNombre(String valorNombre) {
        nombre = valorNombre;
    }

    public void setApellido(String valorApellido) {
        nombre = valorApellido;
    }

    public void setEdad(String valorEdad) {
        nombre = valorEdad;
    }

    // Descriptor de Acceso Getter. Cambiar contenidos de variables de clase
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEdad() {
        return edad;
    }

    public static void main(String[] args) throws Exception {
        bombero estacionNorte = new bombero("Luis", "Wayne", "45");
        System.out.println("El Registro es: \n * Nombre : " + estacionNorte.getNombre() + " \n * Apellido : "
                + estacionNorte.getApellido() + "\n * Edad :" + estacionNorte.getEdad());
    }

}
