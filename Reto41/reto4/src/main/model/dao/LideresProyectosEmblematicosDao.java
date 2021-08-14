package main.model.dao;
//Encapsulamiento de los datos

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// Clase para la coneción
import main.util.JDBCUtilities;

//Encapsulamiento de los datos;
import main.model.vo.LideresProyectosEmblematicos;

public class LideresProyectosEmblematicosDao {

    // Obtener los 10 p´royectos rankeados según las compras

    public ArrayList<LideresProyectosEmblematicos> rankingLideresProyectosEmblematicos() throws SQLException {
        ArrayList<LideresProyectosEmblematicos> respuesta = new ArrayList<LideresProyectosEmblematicos>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT ID_Lider, ID_Proyecto, ID_Tipo " + "FROM Proyecto "
                    + "WHERE ID_Proyecto >= 180 AND ID_PROYECTO < 195 " + "ORDER BY ID_Lider ";

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
