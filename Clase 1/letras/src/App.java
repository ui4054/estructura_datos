public class App {
    public static void main(String[] args) throws Exception {

        String cadena = "El perro (Canis familiaris o Canis lupus familiaris dependiendo de si se lo considera una especie por derecho"
                + " propio o una subespecie del lobo)";

        // define la cantidad de caracteres
        System.out.println("Cantidad de Carateres...: " + cadena.length());
        // devuelve la oscion de un caracter
        char posicion1 = cadena.charAt(15);
        System.out.println("Letra en posición 15: " + posicion1);

        String subFrase = cadena.substring(10, 15);
        System.out.println("Subfrase: " + subFrase); // devuelve una subcadena desde la posicion x hasta y

        System.out.println(cadena.toLowerCase()); // devuelve la cedena en minusculas

        System.out.println(cadena.toUpperCase()); // devuelve la cadena en mayusculas

        System.out.println(cadena.trim()); // elimina los espacios al principio y al final de la cadena
    }
}
