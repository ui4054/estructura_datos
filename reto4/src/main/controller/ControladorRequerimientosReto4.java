package main.controller;

// Estructuras de datos (colecciones)
import java.util.ArrayList;
import main.model.dao.LideresMayorSalarioDao;
import main.model.vo.LideresMayorSalario;
import main.model.dao.LideresProyectosEmblematicosDao;
import main.model.vo.LideresProyectosEmblematicos;
import main.model.dao.MaterialRankeadoImportadoDao;
import main.model.vo.MaterialRankeadoImportado;

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
