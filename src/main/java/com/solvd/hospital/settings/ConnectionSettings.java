package com.solvd.hospital.settings;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionSettings {
    public  static Connection getConnection(){
        Connection connection = null;
        try (FileInputStream f = new FileInputStream("src/main/resources/db.properties")) {

            Properties properties = new Properties();
            properties.load(f);
            String url = properties.getProperty("db.url");
            String user = properties.getProperty("db.user");
            String password = properties.getProperty("db.password");

            connection = DriverManager.getConnection(url, user, password);
        } catch (IOException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}

