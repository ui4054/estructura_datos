public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // se crean dos instancias de la clase Vehiculo
        vehiculo vehiculo1 = new vehiculo("4050 ABJ", "VW", "GTI", "Blanco", 100.0);
        vehiculo vehiculo2 = new vehiculo("2345 JVM", "SEAT", "León", "Negro", 80.0);
        // se crea una instancia de la clase Cliente
        cliente cliente1 = new cliente("30435624X", "Juan", "Pérez");
        // se crea una instancia de la clase VehiculoAlquilado que
        // relaciona al cliente1 con el vehiculo1, el vehículo se
        // alquila con fecha 11/11/2011 durante 2 días
        VehiculoAlquilado alquiler1 = new VehiculoAlquilado(cliente1, vehiculo1, 11, 11, 2011, 2);

        alquiler1.getCliente().getNIF();
        alquiler1.getVehiculo().getMatricula();

        System.out.println("Vehículo alquilado");

        System.out.println("Cliente : " + alquiler1.getCliente().getNIF() + " " + alquiler1.getCliente().getNombre()
                + " " + alquiler1.getCliente().getApellidos());
        System.out.println("Vehículo: " + alquiler1.getVehiculo().getMatricula());
    }
}
