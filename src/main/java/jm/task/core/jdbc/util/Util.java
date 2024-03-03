package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_test";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";

    public static Connection getConnection() {
        try (Connection connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD)){
            Class.forName(DB_DRIVER);
            return connection;
        } catch(ClassNotFoundException | SQLException e){
            throw new RuntimeException(e);
        }
    }
}
