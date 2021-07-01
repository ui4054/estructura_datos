import java.util.Scanner;

class client {
    Scanner sc = new Scanner(System.in);
    double id;
    String name;
    String address;
    double phone;
    String gender;

    public void cedula(String texto) {
        System.out.println(texto);
        this.id = Double.parseDouble((sc.nextLine()));
    }

    public void nombre(String texto) {
        System.out.println(texto);
        this.name = sc.nextLine();
    }

    public void direccion(String texto) {
        System.out.println(texto);
        this.address = sc.nextLine();
    }

    public void telefono(String texto) {
        System.out.println(texto);
        this.phone = Double.parseDouble(sc.nextLine());
    }

    public void genero(String texto) {
        System.out.println(texto);
        this.gender = sc.nextLine();
    }

    public void show() {
        System.out.println("Datos de Cliente");
        System.out.println("Cedula      : " + id);
        System.out.println("Nombre      : " + name);
        System.out.println("Dirección   : " + address);
        System.out.println("Telefono    : " + phone);
        System.out.println("Genero      : " + gender);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Registro de Cliente");
        client cliente = new client();
        cliente.cedula("Ingrese su cedula...");
        cliente.nombre(" Ingrese su nombre...");
        cliente.direccion(" ingrese su dirección...");
        cliente.telefono(" Ingrese su telefono...");
        cliente.genero(" Ingrese su genero H o M");
        cliente.show();
    }
}
