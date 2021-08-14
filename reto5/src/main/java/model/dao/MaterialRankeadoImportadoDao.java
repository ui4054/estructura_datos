package model.dao;
//Encapsulamiento de los datos

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



// Clase para la coneción
import util.JDBCUtilities;

//Encapsulamiento de los datos;
import model.vo.*;


public class MaterialRankeadoImportadoDao {
    // Obtener los 10 p´royectos rankeados según las compras

    
    public ArrayList<MaterialRankeadoImportado> rankingMaterialRankeadoImportado() throws SQLException {
        ArrayList<MaterialRankeadoImportado> respuesta = new ArrayList<MaterialRankeadoImportado>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT ID_MaterialConstruccion, Nombre_Material, Precio_Unidad "
                    + "FROM MaterialConstruccion " + "WHERE Importado = 'Si' AND Precio_Unidad >= 2000 "
                    + "ORDER BY ID_MaterialConstruccion DESC";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            // Recorrer los registros VO específicos
            while (resultSet.next()) {
                MaterialRankeadoImportado materialRankeadoImportado = new MaterialRankeadoImportado();
                materialRankeadoImportado.setIdMaterial(resultSet.getInt("ID_MaterialConstruccion"));
                materialRankeadoImportado.setNombreMaterial(resultSet.getString("Nombre_Material"));
                materialRankeadoImportado.setPrecioUnidad(resultSet.getInt("Precio_Unidad"));

                // se agrega cada registro como un objeto del ArrayList que continene la
                // consulta
                respuesta.add(materialRankeadoImportado);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println("Error consultando ranking de los 10 proyectos con mayor gasto por compras: " + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }
        // retonar la conelcción de VO
        return respuesta;
    }
}
