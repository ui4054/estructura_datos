package uml_facil;

public class Profesor extends Persona {

    private String materia;
    private String cargo;

    public Profesor() {
    }

    public void setMateria(String val) {
        this.materia = val;
    }

    public String getMateria() {
        return materia;
    }

    public void setCargo(String val) {
        this.cargo = val;
    }

    public String getCargo() {
        return cargo;
    }
}
