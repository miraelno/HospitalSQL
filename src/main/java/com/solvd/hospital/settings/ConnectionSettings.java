package com.solvd.hospital.settings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class ConnectionSettings {
    private static final Logger logger = LogManager.getLogger(ConnectionSettings.class);
    public  static Connection getConnection(){
        Connection cn = null;
        try (FileInputStream f = new FileInputStream("src/main/resources/db.properties")) {

            Properties properties = new Properties();
            properties.load(f);
            String url = properties.getProperty("db.url");
            String user = properties.getProperty("db.user");
            String password = properties.getProperty("db.password");

            cn = DriverManager.getConnection(url, user, password);
        } catch (IOException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return cn;
    }

    public static void close (Connection c){
        try{
            if(c!= null)
                c.close();
        } catch (SQLException e) {
            logger.error(e.getMessage());
        }
    }

    public static void close (PreparedStatement ps){
        try{
            if(ps!=null)
                ps.close();
        }catch (SQLException e){
            logger.error(e.getMessage());
        }
    }

    public static void close (Statement s){
        try{
            if(s!=null)
                s.close();
        }catch (SQLException e){
            logger.error(e.getMessage());
        }
    }

    public static void close (ResultSet rs){
        try{
            if(rs!=null)
                rs.close();
        } catch (SQLException e){
            logger.error(e.getMessage());
        }
    }
}

