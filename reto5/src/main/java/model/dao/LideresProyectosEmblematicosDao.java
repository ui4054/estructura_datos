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
import model.vo.*;
import util.JDBCUtilities;

//Encapsulamiento de los datos;


public class LideresProyectosEmblematicosDao {

    // Obtener los 10 p´royectos rankeados según las compras

    public ArrayList<LideresProyectosEmblematicos> rankingLideresProyectosEmblematicos() throws SQLException {
        ArrayList<LideresProyectosEmblematicos> respuesta = new ArrayList<LideresProyectosEmblematicos>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT ID_Lider, ID_Proyecto, ID_Tipo " + "FROM Proyecto "
                    + "WHERE (ID_Proyecto BETWEEN 180 AND 195) " + "GROUP BY ID_lider ORDER BY ID_Lider DESC";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            // Recorrer los registros VO específicos
            while (resultSet.next()) {
                LideresProyectosEmblematicos lideresProyectosEmblematicos = new LideresProyectosEmblematicos();
                lideresProyectosEmblematicos.setIDLider(resultSet.getInt("ID_Lider"));
                lideresProyectosEmblematicos.setIDProyecto(resultSet.getInt("ID_Proyecto"));
                lideresProyectosEmblematicos.setIDTipo(resultSet.getInt("ID_Tipo"));

                // se agrega cada registro como un objeto del ArrayList que continene la
                // consulta
                respuesta.add(lideresProyectosEmblematicos);
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
