package util;

import java.io.File; // para verificacipón de longitud de db

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {
    //jdbc:sqlite:D:\estructura_datos\db\ProyectosConstruccion.db
    // Atributos de clase para gestión de conexión con la base de datos
    private static final String UBICACION_BD = "D:\\estructura_datos\\db\\ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + UBICACION_BD;
        return DriverManager.getConnection(url);
    }

    // verificación si está vacia
    public static boolean estaVacia() {
        File archivo = new File(JDBCUtilities.UBICACION_BD);
        return archivo.length() == 0;
    }
}
