package uml_facil;

public class Estudiante extends Persona {

    private String carrera;
    private int legajo;

    public Estudiante() {
    }

    public void setCarrera(String val) {
        this.carrera = val;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setLegajo(int val) {
        this.legajo = val;
    }

    public int getLegajo() {
        return legajo;
    }
}
