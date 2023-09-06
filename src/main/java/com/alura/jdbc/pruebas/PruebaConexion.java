package com.alura.jdbc.pruebas;

import com.alura.jdbc.factory.ConnectionFactory;

import java.sql.SQLException;

public class PruebaConexion {

    public static void main(String[] args) throws SQLException {
        java.sql.Connection connection = new ConnectionFactory().recuperaConexion();

        System.out.println("Cerrando la conexión");

        connection.close();
    }

}
