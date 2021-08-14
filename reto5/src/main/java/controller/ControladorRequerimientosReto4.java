package controller;

// Estructuras de datos (colecciones)
import java.util.ArrayList;
import model.dao.*;
import model.vo.*;

// librerias para bases de datos
import java.sql.SQLException;

public class ControladorRequerimientosReto4 {
    // instanciamos los objetos DAO para la gestión de las lalamdas de datos
    private final LideresMayorSalarioDao lideresMayorSalarioDao;
    private final LideresProyectosEmblematicosDao lideresProyectosEmblematicosDao;
    private final MaterialRankeadoImportadoDao materialRankeadoImportadoDao;

    public ControladorRequerimientosReto4() {
        this.lideresMayorSalarioDao = new LideresMayorSalarioDao();
        this.lideresProyectosEmblematicosDao = new LideresProyectosEmblematicosDao();
        this.materialRankeadoImportadoDao = new MaterialRankeadoImportadoDao();
    }

    // metodo para llamar los datos del DAO
    public ArrayList<LideresMayorSalario> consultarLideresMayorSalarios() throws SQLException {
        return this.lideresMayorSalarioDao.rankingLideresMayorSalario();
    }

    public ArrayList<LideresProyectosEmblematicos> consultarLideresProyectosEmblematicos() throws SQLException {
        return this.lideresProyectosEmblematicosDao.rankingLideresProyectosEmblematicos();
    }

    public ArrayList<MaterialRankeadoImportado> consultarMaterialRankeadoImportados() throws SQLException {
        return this.materialRankeadoImportadoDao.rankingMaterialRankeadoImportado();
    }
}
