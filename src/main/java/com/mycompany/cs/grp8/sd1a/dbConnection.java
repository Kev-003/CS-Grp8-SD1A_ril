package com.mycompany.cs.grp8.sd1a;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class dbConnection {
    
    public static Connection con() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shadifin tech","root","");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }
}
