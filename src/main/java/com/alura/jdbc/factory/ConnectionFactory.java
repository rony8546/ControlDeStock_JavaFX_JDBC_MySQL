package com.alura.jdbc.factory;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionFactory {

    private DataSource dataSource;
    public ConnectionFactory() {
        var comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/control_de_stock?useTimeZone=True&serverTimeZone=UTC");
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("123456");
        comboPooledDataSource.setMaxPoolSize(10);

        this.dataSource = comboPooledDataSource;
    }
    public Connection recuperaConexion() {
        try {
            return this.dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
