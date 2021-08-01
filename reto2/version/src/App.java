//MIGUEL ALFONSO MARTINEZ BARRAGAN . GRUPO 72
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
                powadd = 118;
                break;
            case "b":
                powadd = 90;
                break;
            case "c":
                powadd = 78;
                break;
            case "d":
                powadd = 45;
                break;
            case "e":
                powadd = 30;
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
        if (this.getPeso() > 4) {
            pesadd = 25;
        } else if (this.getPeso() >= 3) {
            pesadd = 30;
        } else if (this.getPeso() >= 2) {
            pesadd = 39;
        } else {
            pesadd = 48;
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
        if (this.getDiscoDuro() > 1000) { // if que calcula el recargo por disco duro
            hddadd = 25.0;
        } else if (this.getDiscoDuro() >= 500) {
            hddadd = 30.0;
        } else {
            hddadd = 39.0;
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
        this.setMemoriaRam(MEMORIA_RAM_BASE);
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
        if (this.getMemoriaRam() > 4) { // if que calcula el recargo por RAM
            memadd = 80.0;
        } else if (this.getMemoriaRam() >= 2) {
            memadd = 57.0;
        } else {
            memadd = 38.0;
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
            selector = pDispositivos[i].calcularPrecio().substring(0, 1);
            switch (selector) {
                case "d":
                    valor = Double.parseDouble(pDispositivos[i].calcularPrecio().substring(1));
                    setTotalDispositivos((getTotalDispositivos() + valor));
                    break;
                case "p":
                    valor = Double.parseDouble(pDispositivos[i].calcularPrecio().substring(1));
                    setTotalPortatiles((getTotalPortatiles() + valor));
                    break;
                case "t":
                    valor = Double.parseDouble(pDispositivos[i].calcularPrecio().substring(1));
                    setTotalTablet((getTotalTablet() + valor));
                    break;
                default:
                    valor = 0.0;
                    break;
            }
            setTotalDispositivos((getTotalPortatiles() + getTotalTablet()));
        }
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

        Dispositivo dispositivos2[] = new Dispositivo[6];
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
