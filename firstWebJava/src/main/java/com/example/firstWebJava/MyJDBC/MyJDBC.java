package com.example.firstWebJava.MyJDBC;

import java.sql.*;

public class MyJDBC {
    private static Connection connection = null;

    public static Connection getConnection(){

        {
            try {
                connection = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/coffee",
                        "root",
                        "bengi773"
                );
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return connection;
    }
}
