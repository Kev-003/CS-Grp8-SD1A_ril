package com.mycompany.cs.grp8.sd1a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class dbConnection {

    private Connection con;
    private static dbConnection instance;

    dbConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "");
            System.out.println("Connection Established");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Cannot access database");
        }
    }

    public static dbConnection getDatabaseConnection() {
        if (instance == null) {
            instance = new dbConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        return con;
    }

    public static void closeConnection() {
        instance = null;
    }
}
