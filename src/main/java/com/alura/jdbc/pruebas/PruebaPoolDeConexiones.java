package com.alura.jdbc.pruebas;

import com.alura.jdbc.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class PruebaPoolDeConexiones {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory conenctionFactory = new ConnectionFactory();

        for (int i = 0; i < 20; i++) {
            Connection conexion = conenctionFactory.recuperaConexion();
            System.out.println("Abriendo la conexion de número: " + (i + 1));
        }
    }
}