package uml_facil;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // el constructor sirve para instanciar
        Persona p = new Persona();
        Estudiante e = new Estudiante();
        Profesor pro = new Profesor();

        // carga de prueba para persona

        p.setNombre("Persona sin sombre");
        p.setEdad(25);

        e.setNombre("Estudiante sin nombre");
        e.setEdad(25);
        e.setLegajo(22);
        e.setCarrera("Ingeniería de Sistemas");

    }
}
