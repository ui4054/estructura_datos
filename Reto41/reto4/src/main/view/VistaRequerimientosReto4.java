package main.view;

// se cargan los VO y el controlador
import main.controller.ControladorRequerimientosReto4;
import main.model.vo.LideresMayorSalario;
import main.model.vo.LideresProyectosEmblematicos;
import main.model.vo.MaterialRankeadoImportado;

// arreglos y colecciones
import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto4 {

    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    // vista por consola requerimiento1
    public static void requerimiento1() {
        System.out.println("*** Lideres con mayor salario ***");

        try {

            ArrayList<LideresMayorSalario> rankingLideresMayorSalarios = controlador.consultarLideresMayorSalarios();

            // Encabezado de resultado
            System.out.println("ID_Lider  Nombre  Primer_Apellido");

            // Cada VO cargado, mostrarlo en la vista
            for (LideresMayorSalario lideresMayors : rankingLideresMayorSalarios) {
                System.out.printf("     %d  %s   %s  %n", lideresMayors.getIDLider(), lideresMayors.getNombre(),
                        lideresMayors.getPrimerApellido());
            }
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un erropr!" + e.getMessage());
        }
    }

    // vista por consola requerimiento3
    public static void requerimiento3() {
        System.out.println("*** Lideres proyectos emblemáticos ***");

        try {

            ArrayList<LideresProyectosEmblematicos> rankingProyectosEmblematicos = controlador
                    .consultarLideresProyectosEmblematicos();

            // Encabezado de resultado
            System.out.println("ID_Lider  Nombre  Primer_Apellido");

            // Cada VO cargado, mostrarlo en la vista
            for (LideresProyectosEmblematicos lideresProyectosE : rankingProyectosEmblematicos) {
                System.out.printf("     %d  %s   %s  %n", lideresProyectosE.getIDLider(),
                        lideresProyectosE.getIDProyecto(), lideresProyectosE.getIDTipo());
            }
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    // vista por consola requerimiento4
    public static void requerimiento4() {
        System.out.println("*** Productos importados ***");

        try {

            ArrayList<MaterialRankeadoImportado> rankingMaterialesImportados = controlador
                    .consultarMaterialRankeadoImportados();

            // Encabezado de resultado
            System.out
                    .println("El producto de ID %d de descripcion: %s de tipo importado(a), tiene un precio de %d %n");

            // Cada VO cargado, mostrarlo en la vista
            for (MaterialRankeadoImportado materialesImportados : rankingMaterialesImportados) {
                System.out.printf("     %d  %s   %s  %n", materialesImportados.getIdMaterial(),
                        materialesImportados.getNombreMaterial(), materialesImportados.getPrecioUnidad());
            }
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

}
