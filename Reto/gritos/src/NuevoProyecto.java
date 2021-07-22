import java.lang.Math;

public class NuevoProyecto {
    private Integer pPeriodo = null; // Priodos de prestamo
    private Double pMonto = null;// valor de prestamo
    private Double pInteres = null; // tasa de interés

    public NuevoProyecto() {
        this.pPeriodo = 0; // vacio en cero
        this.pMonto = 0.0;
        this.pInteres = 0.0;
    }

    // Creación del Contructor con validación de null
    public NuevoProyecto(Integer Periodos, Double Valores, Double Intereses) {
        this.pPeriodo = (Periodos == null) ? 0 : Periodos; // valida si persiste null
        this.pMonto = (Valores == null) ? 0.0 : Double.parseDouble(Valores.toString());
        this.pInteres = (Intereses == null) ? 0 : Intereses;
    }

    // Creación del Contructor con validación de null
    public NuevoProyecto(Integer Periodos, Integer Valores, Double Intereses) {
        this.pPeriodo = (Periodos == null) ? 0 : Periodos; // valida si persiste null
        this.pMonto = (Valores == null) ? 0.0 : Double.parseDouble(Valores.toString());
        this.pInteres = (Intereses == null) ? 0 : Intereses;
    }

    // Método para calcular el interes simple
    public double calcularInteresSimple() {
        double interesSimple = this.pMonto * (this.pInteres / 100) * this.pPeriodo;
        return Math.round(interesSimple);
    }

    // metodo para calcular el interes compuesto
    public double calcularInteresCompuesto() {
        double interesCompuesto = this.pMonto * ((Math.pow((1 + (this.pInteres / 100)), this.pPeriodo)) - 1);
        return Math.round(interesCompuesto);
    }

    // metodo para comparar interes simple e interés compuesto
    public double compararInversion(Integer Periodos, Integer Valores, Double Intereses) {

        NuevoProyecto i = new NuevoProyecto(Periodos, Valores, Intereses);
        double diferencia = i.calcularInteresCompuesto() - i.calcularInteresSimple();
        return Math.round(diferencia);
    }

    public double compararInversion(Integer Periodos, Double Valores, Double Intereses) {

        NuevoProyecto i = new NuevoProyecto(Periodos, Valores, Intereses);
        double diferencia = i.calcularInteresCompuesto() - i.calcularInteresSimple();
        return Math.round(diferencia);
    }

    public double compararInversion() {
        double diferencia = this.calcularInteresCompuesto() - this.calcularInteresSimple();
        return Math.round(diferencia);
    }

    public static void main(String[] args) throws Exception {
        NuevoProyecto np = new NuevoProyecto(6, 10000000, 1.2);
        System.out.println(np.calcularInteresSimple());
        System.out.println(np.calcularInteresCompuesto());
        System.out.println(np.compararInversion(6, 10000000, 1.2));
    }
}
