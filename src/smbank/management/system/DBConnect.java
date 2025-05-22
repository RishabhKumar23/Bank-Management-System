package smbank.management.system;

import java.sql.*;

import io.github.cdimascio.dotenv.Dotenv;

public class DBConnect {
    Connection connection;
    Statement statement;

    public DBConnect() {
        try {
            Dotenv dotenv = Dotenv.load();
            String dbUrl = dotenv.get("DB_CONNECTION_STRING");
            String dbUser = dotenv.get("DB_USERNAME");
            String dbPass = dotenv.get("DB_PASSWORD");
            connection = DriverManager.getConnection("dbUrl", "dbUser", "dbPass");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}