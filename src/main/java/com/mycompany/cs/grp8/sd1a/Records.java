package com.mycompany.cs.grp8.sd1a;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

// Class for encapsulting values - TO DO
public class Records extends SignupForm {
    /*
     * private String accountNum, userPass, firstName, lastName, birthDate, street,
     * baranggay, city,
     * province;
     * private int bldgNo, zipCode;
     * Connection con;
     * PreparedStatement insert;
     * dbConnection obj = new dbConnection();
     * 
     * try
     * {
     * con = obj.getConnection(); // Establish database connection
     * String accountNum = txtNum2.getText();
     * String userPass = String.valueOf(txtConfirmPass.getPassword());
     * String firstName = txtFirstName1.getText();
     * String lastName = txtSurname1.getText();
     * String birthDate = String.valueOf(calBday1.getDate());
     * int bldgNo = Integer.parseInt(txtNo1.getText());
     * String street = txtStrt1.getText();
     * String baranggay = txtBrgy1.getText();
     * String city = txtCity1.getText();
     * String province = txtProvince1.getText();
     * int zipCode = Integer.parseInt(txtZip1.getText());
     * 
     * insert = con.prepareStatement(
     * "insert into tblaccount(accountNum,userPass,firstName,lastName,birthDate,bldgNo,street,baranggay,city,province,zipCode)values(?,?,?,?,?,?,?,?,?,?,?)"
     * );
     * insert.setString(1, accountNum);
     * insert.setString(2, userPass);
     * insert.setString(3, firstName);
     * insert.setString(4, lastName);
     * insert.setString(5, birthDate);
     * insert.setInt(6, bldgNo);
     * insert.setString(7, street);
     * insert.setString(8, baranggay);
     * insert.setString(9, city);
     * insert.setString(10, province);
     * insert.setInt(11, zipCode);
     * insert.executeUpdate();
     * JOptionPane.showMessageDialog(this, "Record Added!"); // For testing
     * new HomeInterface(darkEnabled).setVisible(true);
     * }catch(SQLException|
     * NumberFormatException ex)
     * {
     * JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage()); //
     * Display a user-friendly error
     * // message
     * }catch(FontFormatException|
     * IOException ex)
     * {
     * Logger.getLogger(SignupForm.class.getName()).log(Level.SEVERE, null, ex);
     * }finally
     * {
     * dbConnection.closeConnection(); // Terminate connection
     * }
     */
}
