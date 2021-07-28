public class VehiculoAlquilado {
    private cliente cliente;
    private vehiculo vehiculo;
    private int diaAlquiler;
    private int mesAlquiler;
    private int añoAlquiler;
    private int totalDiasAlquiler;

    public VehiculoAlquilado(cliente cliente, vehiculo vehiculo, int diaAlquiler, int mesAlquiler, int añoAlquiler,
            int totalDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.añoAlquiler = añoAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

    // los métodos ‘get’ de los atributos de tipo objeto
    // Cliente y Vehiculo
    public cliente getCliente() {
        return this.cliente;
    }

    public vehiculo getVehiculo() {
        return this.vehiculo;
    }
}
