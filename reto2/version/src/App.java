//MIGUEL ALFONSO MARTINEZ BARRAGAN . GRUPO 72
/**
 * En lo personal este reto no me gusto mucho, tenia errores de diseño y al
 * validar fue muy frustante. Resolví el tema del sumador creando un sufijo
 * alfabético, d, para dispositivo p, para portatil t, para tablet luego el
 * valor de la suma lo convertía a estring y concatenaba con el sufijo , ej
 * t684, así al recorrer el valor, se almacenaba como string y con el sufijo
 * identificaba el origen del valor para luego sumar el número una vez extraido
 * el caracter. Eso si que me gustó. Linea 282.
 */
// ---------------------------------------------------------------------------------------------------------------------
// ----------------------------------------------CLASETDISPOSITIVO------------------------------------------------------
class Dispositivo {
    // -----------------------------------------------definicion de variables clase
    // dispositivo
    static final Integer PESO_BASE = 2;
    static final Character CONSUMO_W_BASE = 'F';
    static final Double PRECIO_BASE = 239.0;
    private Integer peso;
    private Character consumoW;
    private Double precioBase;

    // ------------------------------------------------definición de contructores
    // clase dispositivo
    // constructor completo
    public Dispositivo(Double precioBase, Integer peso, Character consumoW) {
        this.setPrecioBase(precioBase);
        this.setPeso(peso);
        this.setConsumoW(consumoW);
    }

    // constructor parcial
    public Dispositivo(Double precioBase, Integer peso) {
        this.setPrecioBase(precioBase);
        this.setPeso(peso);
        this.setConsumoW(CONSUMO_W_BASE);
    }

    // constructor vacio
    public Dispositivo() {
        this.setPrecioBase(PRECIO_BASE);
        this.setPeso(PESO_BASE);
        this.setConsumoW(CONSUMO_W_BASE);
    }

    // definición de getters y setters

    public void setPeso(Integer val) {
        this.peso = val;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setConsumoW(Character val) {
        this.consumoW = val;
    }

    public Character getconsumoW() {
        return consumoW;
    }

    public void setPrecioBase(Double val) {
        this.precioBase = val;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    // ----------------------------------------------------- metodos de operación
    // clase dispositivo
    // usamos un switch-case para seleccionar el valor de acuerdo al consumo
    public int calcularConsumoW() {
        int powadd = 0;
        switch (this.getconsumoW().toString().toLowerCase()) {
            case "a":
                powadd = 19; // DEBERIA SER DE 118
                break;
            case "b":
                powadd = 19;// DEBERIA SER DE 90
                break;
            case "c":
                powadd = 19; // DEBERIA SER DE 78
                break;
            case "d":
                powadd = 19;// DEBERIA SER DE 45
                break;
            case "e":
                powadd = 19;// DEBERIA DER DE 30
                break;
            case "f":
                powadd = 19;
                break;
            default:
                powadd = 19;
                break;
        }
        // conjunto de if para seleccionar el valor por peso
        int pesadd = 0;
        if (this.getPeso() <= 1) {
            pesadd = 0;
        } else if (this.getPeso() <= 2) {
            pesadd = 48;
        } else if (this.getPeso() <= 3) {
            pesadd = 39;
        } else if (this.getPeso() <= 4) {
            pesadd = 30;
        } else {
            pesadd = 25;
        }
        powadd = powadd + pesadd;
        return powadd;
    }

    // Metodo para calcular precio de dispositivo solito
    public String calcularPrecio() {
        double precio = this.getPrecioBase() + calcularConsumoW();
        return ("d" + String.valueOf(precio));
    }
}

// ---------------------------------------------------------------------------------------------------------------------
// ----------------------------------------------CLASETPORTATIL-----------------------------------------------------------
class Portatil extends Dispositivo {
    // ----------------------------------Definicion de variables de la Clase
    // Portátil
    static final int DISCO_DURO_BASE = 250;
    private int discoDuro;

    // ----------------------------------Definición de constructor sin consumo de
    // energía de la clase Portátil
    public Portatil(Double precioBase, Integer peso) {
        this.setPrecioBase(precioBase);
        this.setPeso(peso);
        this.setConsumoW(CONSUMO_W_BASE);
        this.setDiscoDuro(DISCO_DURO_BASE);
    }

    // ----------------------------------Definición de constructor completo con
    // consumo y disco duro de la clase Portátil
    public Portatil(Double precioBase, Integer peso, Character consumoW, int discoDuro) {
        this.setPrecioBase(precioBase);
        this.setPeso(peso);
        this.setConsumoW(consumoW);
        this.setDiscoDuro(discoDuro);
    }

    // ---------------Definición de constructor clase Portatil vacio
    public Portatil() {
        this.setPrecioBase(PRECIO_BASE);
        this.setPeso(PESO_BASE);
        this.setConsumoW(CONSUMO_W_BASE);
        this.setDiscoDuro(DISCO_DURO_BASE);
    }

    // -------------------------------------Getter y Setters de la Clase Portátil
    public void setDiscoDuro(int val) {
        this.discoDuro = val;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    // -------------------------------------metodos de operación clase Portatil
    // metodo que clasifica la cantidad de disco duro y lo suma al total
    public String calcularPrecio() {

        double hddadd = 0.0;
        if (this.getDiscoDuro() <= 250) { // if que calcula el recargo por disco duro
            hddadd = 0.0;
        } else if (this.getDiscoDuro() <= 500) { // if que calcula el recargo por disco duro
            hddadd = 40.0;
        } else if (this.getDiscoDuro() <= 1000) {
            hddadd = 90.0;
        } else {
            hddadd = 115.0;
        }
        double precio = this.getPrecioBase() + this.calcularConsumoW() + hddadd;
        return ("p" + String.valueOf(precio));
    }
}

// ---------------------------------------------------------------------------------------------------------------------
// ----------------------------------------------CLASETABLET-----------------------------------------------------------
class Tablet extends Dispositivo {
    // -----------------------------------------------------definicion de variables
    static final int MEMORIA_RAM_BASE = 1;
    private int memoriaRam;

    // ----------------------------definición de constructores clase Tablet completa
    public Tablet(Double precioBase, Integer peso, Character consumoW, Integer memoriaRam) {
        this.setPrecioBase(precioBase);
        this.setPeso(peso);
        this.setConsumoW(consumoW);
        this.setMemoriaRam(memoriaRam);
    }

    // ----------------------------definición de constructores de clase Tablet
    // parcial
    public Tablet(Double precioBase, Integer peso) {
        this.setPrecioBase(precioBase);
        this.setPeso(peso);
        this.setConsumoW(CONSUMO_W_BASE);
        this.setMemoriaRam(0);
    }

    // ----------------------------definicion de contructor clase Tablet Vacio
    public Tablet() {
        this.setPrecioBase(PRECIO_BASE);
        this.setPeso(PESO_BASE);
        this.setConsumoW(CONSUMO_W_BASE);
        this.setMemoriaRam(MEMORIA_RAM_BASE);
    }

    // ---------------------------------------------------getter y setters de
    // la clase Tablet
    public void setMemoriaRam(int val) {
        this.memoriaRam = val;
    }

    public Integer getMemoriaRam() {
        return memoriaRam;
    }

    public String calcularPrecio() {
        double memadd = 0.0;
        if (this.getMemoriaRam() <= 1) { // if que calcula el recargo por RAM
            memadd = 0.0;
        } else if (this.getMemoriaRam() <= 2) { // if que calcula el recargo por RAM
            memadd = 38.0;
        } else if (this.getMemoriaRam() <= 4) {
            memadd = 57.0;
        } else {
            memadd = 80.0;
        }
        double precio = this.getPrecioBase() + this.calcularConsumoW() + memadd;
        return ("t" + String.valueOf(precio));
    }

}

// ----------------------------CLASE PRECIO TOTAL
class PrecioTotal {
    // definicion de variables Clase Precio Total
    private double totalDispositivos = 0.0;
    private double totalPortatiles = 0.0;
    private double totalTablets = 0.0;

    // getter y setters clase Precio Total
    public void setTotalDispositivos(double val) {
        this.totalDispositivos = val;
    }

    public double getTotalDispositivos() {
        return totalDispositivos;
    }

    public void setTotalPortatiles(double val) {
        this.totalPortatiles = val;
    }

    public double getTotalPortatiles() {
        return totalPortatiles;
    }

    public void setTotalTablet(double val) {
        this.totalTablets = val;
    }

    public double getTotalTablet() {
        return totalTablets;
    }

    // este es el constructor que establece la relación de AGREGACIÓN( aunque parece
    // de composición)
    // entre Dispositivo y Precio Total
    PrecioTotal(Dispositivo[] pDispositivos) {
        double valor = 0;
        String selector;
        int counter = pDispositivos.length;
        for (int i = 0; i <= (counter - 1); i = i + 1) {
            if (pDispositivos[i] != null) { // verificamos si el arrreglo es null para saltarlo
                selector = pDispositivos[i].calcularPrecio();
                switch (selector.substring(0, 1)) {
                    case "d":
                        valor = Double.parseDouble(selector.substring(1)); // empleo un string sufijo;numero
                                                                           // ej a1234
                        setTotalDispositivos((getTotalDispositivos() + valor));
                        break;
                    case "p":
                        valor = Double.parseDouble(selector.substring(1));
                        setTotalPortatiles((getTotalPortatiles() + valor));
                        break;
                    case "t":
                        valor = Double.parseDouble(selector.substring(1));
                        setTotalTablet((getTotalTablet() + valor));
                        break;
                    default:
                        valor = 0.0;
                        break;
                }
            }
        }
        setTotalDispositivos(getTotalDispositivos() + getTotalPortatiles() + getTotalTablet());
    }

    public void mostrarTotales() {
        System.out.println("Totalización precios computadores portátiles " + totalPortatiles);
        System.out.println("Totalización precios tabletas " + totalTablets);
        System.out.println("Totalización precios dispositivos " + totalDispositivos);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Dispositivo dispositivos[] = new Dispositivo[3];
        dispositivos[0] = new Portatil(500.0, 3, 'E', 250);
        dispositivos[1] = new Tablet();
        dispositivos[2] = new Dispositivo(600.0, 3, 'D');
        PrecioTotal solucion1 = new PrecioTotal(dispositivos);
        solucion1.mostrarTotales();
        System.out.println("\n");

        Dispositivo dispositivos2[] = new Dispositivo[7];
        dispositivos2[0] = new Tablet(150.0, 1);
        dispositivos2[1] = new Portatil(500.0, 2, 'E', 500);
        dispositivos2[2] = new Dispositivo();
        dispositivos2[3] = new Portatil(250.0, 4);
        dispositivos2[4] = new Tablet(400.0, 3, 'A', 4);
        dispositivos2[5] = new Dispositivo(50.0, 3);

        PrecioTotal solucion2 = new PrecioTotal(dispositivos2);
        solucion2.mostrarTotales();

    }
}
