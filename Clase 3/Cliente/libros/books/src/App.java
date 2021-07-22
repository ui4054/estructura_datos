import java.util.Scanner;

class book {

    double id; // consecutivo del libro
    String autor; // nombre de autor
    String title; // titulo libro
    String editor; // editor libro

    public book(String id, String autor, String title, String editor) {
        this.id = Double.parseDouble(id);
        this.autor = autor;
        this.autor = title;
        this.autor = editor;
    }

    // metodo para cargar el consecutivo manualmente
    public void Consecutivo(String texto, String valor) {
        System.out.println(texto);
        this.id = Double.parseDouble(valor);
    }

    // metodo para cargar el autor manualmente
    public void Autor(String texto, String valor) {
        System.out.println(texto);
        this.autor = valor;
    }

    // metodo para cragar el titulo el libro
    public void Titulo(String texto, String valor) {
        System.out.println(texto);
        this.autor = valor;
    }

    // metodo para cargar la editorial del libro
    public void Editor(String texto, String valor) {
        System.out.println(texto);
        this.editor = valor;
    }

    public void show() {
        System.out.println("Datos de Libro");
        System.out.println("Consecutivo     : " + id);
        System.out.println("Autor           : " + autor);
        System.out.println("Título          : " + title);
        System.out.println("Editorial       : " + editor);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); // instancia de metodo scanner para leer teclado

        System.out.println("Ingrese Datos del Libro individual");
        book librito = new book("0", "no ingresado", "no ingresado", "no ingresado");

        librito.Consecutivo("Ingrese Consecutivo...", sc.nextLine());
        librito.Autor(" Ingrese el Autor...", sc.nextLine());
        librito.Titulo(" ingrese el Título...", sc.nextLine());
        librito.Editor(" Ingrese su Teléfono...", sc.nextLine());

        System.out.println("Ingrese Datos del Libro individual en bloque");
        book libros[] = new book[1];
        libros[0] = librito;
        libros[0].show();
    }
}
