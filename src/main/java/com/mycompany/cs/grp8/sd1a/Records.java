package com.mycompany.cs.grp8.sd1a;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Records {
    private static String name, accountNum;
    private static Double balance;

    static Connection con;
    static PreparedStatement insert;
    static dbConnection obj = new dbConnection();

    // Setters
    public void setName(String nameValue) {
        name = nameValue;
    }

    public void setAccountNum(String accountNumVal) {
        accountNum = accountNumVal;
    }

    public static void setBalance(Double balanceValue) {
        balance = balanceValue;
    }

    // Getters
    public static String getName() {
        return name;
    }

    public static String getAccountNum() {
        return accountNum;
    }

    public static Double getBalance() {
        try {
            con = obj.getConnection();
            insert = con.prepareStatement("SELECT balance FROM tblaccount WHERE accountNum = ?");
            insert.setString(1, accountNum);
            ResultSet result = insert.executeQuery();
            if (result.next()) {
                // Check if the balance column is not null
                if (result.getObject("balance") != null) {
                    balance = result.getDouble("balance");
                } else {
                    // Handle the case when balance is null
                    balance = 0.00; // Set balance to 0
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
        } finally {
            dbConnection.closeConnection();
        }
        return balance;
    }
}
