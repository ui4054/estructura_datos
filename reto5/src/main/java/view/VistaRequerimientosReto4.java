package view;

// se cargan los VO y el controlador
import controller.ControladorRequerimientosReto4;
import model.vo.LideresMayorSalario;
import model.vo.LideresProyectosEmblematicos;
import model.vo.MaterialRankeadoImportado;

// arreglos y colecciones
import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto4 {

    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    // vista por consola requerimiento1
    public static String requerimiento1() {
        String salida;
        salida = "";
        
        try {

            ArrayList<LideresMayorSalario> rankingLideresMayorSalarios = new ArrayList<LideresMayorSalario>();
            rankingLideresMayorSalarios = controlador.consultarLideresMayorSalarios();

            

            // Cada VO cargado, mostrarlo en la vista
            for (LideresMayorSalario lideresMayors : rankingLideresMayorSalarios) {
                salida = "\n"+"     "+lideresMayors.getIDLider()+"        "+lideresMayors.getNombre()+"         "+ lideresMayors.getPrimerApellido()+salida;
            }
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un erropr!" + e.getMessage());
        }
        //Encabezado de Resultado
        salida ="\n"+ "ID_Lider  Nombre  Primer_Apellido" + salida;
        return salida;
    }

    // vista por consola requerimiento3
    public static String requerimiento3() {
        String salida;
        salida = "";
        //System.out.println("*** Lideres proyectos emblemáticos ***");

        try {

            ArrayList<LideresProyectosEmblematicos> rankingProyectosEmblematicos = controlador.consultarLideresProyectosEmblematicos();

            // Encabezado de resultado
            

            // Cada VO cargado, mostrarlo en la vista
            for (LideresProyectosEmblematicos lideresProyectosE : rankingProyectosEmblematicos) {
                salida = "\n"+"        "+lideresProyectosE.getIDLider()+"            "+ lideresProyectosE.getIDProyecto()+"                   "+ lideresProyectosE.getIDTipo() + salida;
                        
            }
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
        salida = "\n"+"ID_Lider  ID_Proyecto  ID_Tipo" +salida;
        return salida;
    }

    // vista por consola requerimiento4
    public static String requerimiento4() {
        String salida;
        salida = "";
        
        try {

            ArrayList<MaterialRankeadoImportado> rankingMaterialesImportados = controlador.consultarMaterialRankeadoImportados();

            // Encabezado de resultado
            //System.out.println("El producto de ID %d de descripcion: %s de tipo importado(a), tiene un precio de %d %n");

            // Cada VO cargado, mostrarlo en la vista
            for (MaterialRankeadoImportado materialesImportados : rankingMaterialesImportados) {
                salida =  "El producto de ID "+ materialesImportados.getIdMaterial()+ " de descripción: "+ materialesImportados.getNombreMaterial()+" de tipo importado(a), tiene un precio de "+ materialesImportados.getPrecioUnidad()+ "\r\n" +salida ;
            }
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
        return salida;
    }

}
