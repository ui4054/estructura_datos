public class vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;
    // se omiten los métodos ‘get’ y ‘set’ de la clase

    public vehiculo(String matricula, String marca, String modelo, String color, double tarifa) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }

    public void setMatricula(String val) {
        this.matricula = val;
    }

    public String getMatricula() {
        return matricula;
    }
}
