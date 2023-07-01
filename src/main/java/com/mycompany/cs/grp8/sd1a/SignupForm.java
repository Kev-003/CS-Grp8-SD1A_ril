package com.mycompany.cs.grp8.sd1a;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.event.ItemEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import res.fonts.FontManager;

public class SignupForm extends javax.swing.JFrame {
    Connection con = null;
    MainFeatures pnlFeatures = new MainFeatures();
    /**
     * Creates new form SignupForm
     */
    public SignupForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDark = new javax.swing.JToggleButton();
        picColorIcon1 = new javax.swing.JLabel();
        pnlAddressFields = new javax.swing.JPanel();
        txtCity = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        lblStrt = new javax.swing.JLabel();
        txtStrt = new javax.swing.JTextField();
        lblInfo1 = new javax.swing.JLabel();
        txtBrgy = new javax.swing.JTextField();
        lblBrgy = new javax.swing.JLabel();
        lblNo = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        btnNext3 = new javax.swing.JButton();
        pnlInfoFields = new javax.swing.JPanel();
        calBday = new com.toedter.calendar.JDateChooser();
        lblInfo = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblSurname = new javax.swing.JLabel();
        lblBday = new javax.swing.JLabel();
        btnNext2 = new javax.swing.JButton();
        pnlSignupFields = new javax.swing.JPanel();
        cbShowHidePass2 = new javax.swing.JCheckBox();
        lblSignup = new javax.swing.JLabel();
        txtNum2 = new javax.swing.JTextField();
        txtCreatePass = new javax.swing.JPasswordField();
        lblNum1 = new javax.swing.JLabel();
        lblCreatePass = new javax.swing.JLabel();
        lblConfirmPass = new javax.swing.JLabel();
        txtConfirmPass = new javax.swing.JPasswordField();
        btnNext1 = new javax.swing.JButton();
        picFeatures = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDark.setBackground(new java.awt.Color(242, 242, 242));
        btnDark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/cs/grp8/res/images/moon-stars.png"))); // NOI18N
        btnDark.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(242, 242, 242))); // NOI18N
        btnDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarkActionPerformed(evt);
            }
        });
        getContentPane().add(btnDark, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        picColorIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/cs/grp8/res/images/ColorLogo.png"))); // NOI18N
        getContentPane().add(picColorIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        pnlAddressFields.setBackground(new java.awt.Color(242, 242, 242));
        pnlInfoFields.setVisible(false);
        pnlAddressFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCity.setBackground(new Color(0,0,0,0));
        txtCity.setFont(new Font(loadFonts(9).getFontName(),Font.TRUETYPE_FONT,18));
        txtCity.setForeground(new java.awt.Color(16, 20, 20));
        txtCity.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, grayLightText));
        pnlAddressFields.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 170, 40));

        lblCity.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblCity.setForeground(grayLightText);
        lblCity.setText("City/Town");
        pnlAddressFields.add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        lblStrt.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblStrt.setForeground(grayLightText);
        lblStrt.setText("Street/Village/Subdivision");
        pnlAddressFields.add(lblStrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        txtStrt.setBackground(new Color(0,0,0,0));
        txtStrt.setFont(new Font(loadFonts(9).getFontName(),Font.TRUETYPE_FONT,18));
        txtStrt.setForeground(new java.awt.Color(16, 20, 20));
        txtStrt.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, grayLightText));
        pnlAddressFields.add(txtStrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 270, 40));

        lblInfo1.setFont(new Font(loadFonts(0).getFontName(),Font.BOLD,55));
        lblInfo1.setForeground(new java.awt.Color(16, 20, 20));
        lblInfo1.setText("Information");
        pnlAddressFields.add(lblInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 400, 90));

        txtBrgy.setBackground(new Color(0,0,0,0));
        txtBrgy.setFont(new Font(loadFonts(9).getFontName(),Font.TRUETYPE_FONT,18));
        txtBrgy.setForeground(new java.awt.Color(16, 20, 20));
        txtBrgy.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, grayLightText));
        pnlAddressFields.add(txtBrgy, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 170, 40));

        lblBrgy.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblBrgy.setForeground(grayLightText);
        lblBrgy.setText("Barangay");
        pnlAddressFields.add(lblBrgy, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        lblNo.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblNo.setForeground(grayLightText);
        lblNo.setText("Bldg. No.");
        pnlAddressFields.add(lblNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        txtNo.setBackground(new Color(0,0,0,0));
        txtNo.setFont(new Font(loadFonts(9).getFontName(),Font.TRUETYPE_FONT,18));
        txtNo.setForeground(new java.awt.Color(16, 20, 20));
        txtNo.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, grayLightText));
        pnlAddressFields.add(txtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 70, 40));

        btnNext3.setBackground(LightBG);
        btnNext3.setFont(new Font(loadFonts(9).getFontName(),Font.PLAIN,25));
        btnNext3.setForeground(hoverLightTextCol);
        btnNext3.setText("Next.");
        btnNext3.setBorder(null);
        btnNext3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext3ActionPerformed(evt);
            }
        });
        pnlAddressFields.add(btnNext3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 100, 50));

        getContentPane().add(pnlFeatures, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 540, 720));

        getContentPane().add(pnlAddressFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 720));

        pnlInfoFields.setBackground(new java.awt.Color(242, 242, 242));
        pnlInfoFields.setVisible(false);
        pnlInfoFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlInfoFields.add(calBday, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 140, 40));

        lblInfo.setFont(new Font(loadFonts(0).getFontName(),Font.BOLD,55));
        lblInfo.setForeground(new java.awt.Color(16, 20, 20));
        lblInfo.setText("Information");
        pnlInfoFields.add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 400, 90));

        txtSurname.setBackground(new Color(0,0,0,0));
        txtSurname.setFont(new Font(loadFonts(9).getFontName(),Font.TRUETYPE_FONT,18));
        txtSurname.setForeground(new java.awt.Color(16, 20, 20));
        txtSurname.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, grayLightText));
        pnlInfoFields.add(txtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 360, 40));

        lblFirstName.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblFirstName.setForeground(grayLightText);
        lblFirstName.setText("First Name");
        pnlInfoFields.add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        txtFirstName.setBackground(new Color(0,0,0,0));
        txtFirstName.setFont(new Font(loadFonts(9).getFontName(),Font.TRUETYPE_FONT,18));
        txtFirstName.setForeground(new java.awt.Color(16, 20, 20));
        txtFirstName.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, grayLightText));
        pnlInfoFields.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 360, 40));

        lblSurname.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblSurname.setForeground(grayLightText);
        lblSurname.setText("Surname");
        pnlInfoFields.add(lblSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        lblBday.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblBday.setForeground(grayLightText);
        lblBday.setText("Birth Date");
        pnlInfoFields.add(lblBday, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        btnNext2.setBackground(LightBG);
        btnNext2.setFont(new Font(loadFonts(9).getFontName(),Font.PLAIN,25));
        btnNext2.setForeground(hoverLightTextCol);
        btnNext2.setText("Next.");
        btnNext2.setBorder(null);
        btnNext2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext2ActionPerformed(evt);
            }
        });
        pnlInfoFields.add(btnNext2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 100, 50));

        getContentPane().add(pnlFeatures, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 540, 720));

        getContentPane().add(pnlInfoFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 720));

        pnlSignupFields.setBackground(new java.awt.Color(242, 242, 242));
        pnlSignupFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbShowHidePass2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbShowHidePass2ItemStateChanged(evt);
            }
        });
        pnlSignupFields.add(cbShowHidePass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, -1));

        lblSignup.setFont(new Font(loadFonts(0).getFontName(),Font.BOLD,55));
        lblSignup.setForeground(new java.awt.Color(16, 20, 20));
        lblSignup.setText("Create Account");
        pnlSignupFields.add(lblSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 400, 90));

        txtNum2.setBackground(new Color(0,0,0,0));
        txtNum2.setFont(new Font(loadFonts(9).getFontName(),Font.TRUETYPE_FONT,18));
        txtNum2.setForeground(new java.awt.Color(16, 20, 20));
        txtNum2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, grayLightText));
        pnlSignupFields.add(txtNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 360, 40));

        txtCreatePass.setBackground(new Color(0,0,0,0));
        txtCreatePass.setForeground(new java.awt.Color(16, 20, 20));
        txtCreatePass.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0,grayLightText));
        txtCreatePass.setEchoChar('\u00b7');
        pnlSignupFields.add(txtCreatePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 360, 40));

        lblNum1.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblNum1.setForeground(grayLightText);
        lblNum1.setText("Account Number");
        pnlSignupFields.add(lblNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        lblCreatePass.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblCreatePass.setForeground(grayLightText);
        lblCreatePass.setText("Create Password");
        pnlSignupFields.add(lblCreatePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        lblConfirmPass.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblConfirmPass.setForeground(grayLightText);
        lblConfirmPass.setText("Confirm Password");
        pnlSignupFields.add(lblConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        txtConfirmPass.setBackground(new Color(0,0,0,0));
        txtConfirmPass.setForeground(new java.awt.Color(16, 20, 20));
        txtConfirmPass.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, grayLightText));
        txtConfirmPass.setEchoChar('\u00b7');
        pnlSignupFields.add(txtConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 360, 40));

        btnNext1.setBackground(LightBG);
        btnNext1.setFont(new Font(loadFonts(9).getFontName(),Font.PLAIN,25));
        pnlFeatures.setVisible(false);
        getContentPane().add(pnlFeatures, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 540, 720));
        btnNext1.setForeground(hoverLightTextCol);
        btnNext1.setText("Next.");
        btnNext1.setBorder(null);
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });
        pnlSignupFields.add(btnNext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 100, 50));

        getContentPane().add(pnlFeatures, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 540, 720));

        getContentPane().add(pnlSignupFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 720));

        picFeatures.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/images/FeaturesBG.png"))); // NOI18N
        getContentPane().add(picFeatures, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbShowHidePass2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbShowHidePass2ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            txtCreatePass.setEchoChar((char) 0);
            txtCreatePass.setFont(new Font(loadFonts(9).getFontName(),Font.TRUETYPE_FONT,18));
        } else {
            txtCreatePass.setEchoChar('\u00b7');
            txtCreatePass.setFont(new Font("Segoe UI",Font.BOLD,12));
        }
    }//GEN-LAST:event_cbShowHidePass2ItemStateChanged

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        String accNum = txtNum2.getText();

        if (!isIntegerFormat(accNum)) {
            javax.swing.JOptionPane.showMessageDialog(null, "Enter a valid account number.", "Invalid Account Number",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        } else if (!txtCreatePass.getText().equals(txtConfirmPass.getText())) {
            javax.swing.JOptionPane.showMessageDialog(null, "Passwords do not match.", "Check Entered Password",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        } else if (accNum.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Fill up all fields", "Missing Information",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            pnlSignupFields.setVisible(false);
            pnlInfoFields.setVisible(true);
        }
    }//GEN-LAST:event_btnNext1ActionPerformed
    
    private boolean isIntegerFormat(String text) {
        String integerFormat = "\\d{5}\\s\\d{5}\\s\\d{5}\\s\\d{5}\\s\\d{5}"; // accepts only the format that banks use
                                                                             // for accounts
        return text.matches(integerFormat);
    }
    
    private void btnDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarkActionPerformed
        if (!darkEnabled) {
            setToDark();
        } else {
            setToLight();
        }
    }//GEN-LAST:event_btnDarkActionPerformed

    private void btnNext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNext2ActionPerformed

    private void btnNext3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNext3ActionPerformed

    private void setToDark() {
        try {
            btnDark.setBackground(DarkBG);
            btnDark.setIcon(new javax.swing.ImageIcon(
                    getClass().getResource("/com/mycompany/cs/grp8/res/images/moon-stars1.png")));
            picColorIcon1.setIcon(new javax.swing.ImageIcon(
                    getClass().getResource("/com/mycompany/cs/grp8/res/images/ColorLogo.png")));

            darkEnabled = true;
            UIManager.setLookAndFeel(new FlatDarculaLaf());

            SwingUtilities.updateComponentTreeUI(pnlSignupFields);
            pnlSignupFields.setBackground(DarkBG);
            lblSignup.setForeground(defaultDarkText);
            txtNum2.setForeground(defaultDarkText);
            txtCreatePass.setForeground(defaultDarkText);
            txtConfirmPass.setForeground(defaultDarkText);

            btnNext1.setBorder(null);
            btnNext1.setBackground(DarkBG);
            btnNext1.setForeground(hoverDarkTextCol);

            SwingUtilities.updateComponentTreeUI(pnlInfoFields);
            pnlInfoFields.setBackground(DarkBG);
            lblInfo.setForeground(defaultDarkText);
            txtFirstName.setForeground(defaultDarkText);
            txtSurname.setForeground(defaultDarkText);
            calBday.setForeground(defaultDarkText);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setToLight() {
        try {
            btnDark.setBackground(LightBG);
            btnDark.setIcon(new javax.swing.ImageIcon(
                    getClass().getResource("/com/mycompany/cs/grp8/res/images/moon-stars.png")));
            picColorIcon1.setIcon(new javax.swing.ImageIcon(
                    getClass().getResource("/com/mycompany/cs/grp8/res/images/ColorLogo.png")));

            darkEnabled = false;
            UIManager.setLookAndFeel(new FlatLightLaf());

            SwingUtilities.updateComponentTreeUI(pnlSignupFields);
            pnlSignupFields.setBackground(LightBG);
            lblSignup.setForeground(defaultLightText);
            txtNum2.setForeground(defaultLightText);
            txtCreatePass.setForeground(defaultLightText);
            txtConfirmPass.setForeground(defaultLightText);

            btnNext1.setBorder(null);
            btnNext1.setBackground(LightBG);
            btnNext1.setForeground(hoverLightTextCol);

            SwingUtilities.updateComponentTreeUI(pnlInfoFields);
            pnlInfoFields.setBackground(LightBG);
            lblInfo.setForeground(defaultLightText);
            txtFirstName.setForeground(defaultLightText);
            txtSurname.setForeground(defaultLightText);
            calBday.setForeground(defaultLightText);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void run(LookAndFeel theme) {
        try {
            UIManager.setLookAndFeel(theme);
            UIManager.put("Button.arc", 999);
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println(e);
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SignupForm().setVisible(true);
        });
    }
    
    
    private final Color defaultLightBtnCol = new Color(51, 57, 140);
    private final Color hoverLightBtnCol = new Color(29, 29, 124);
    private final Color defaultLightBtnText = new Color(242, 242, 242);
    private final Color hoverLightBtnText = new Color(242, 242, 242);
    private final Color hoverLightTextCol = new Color(51, 57, 140);
    private final Color LightBG = new Color(242, 242, 242);
    private final Color defaultLightText = new Color(16, 20, 20);
    private final Color grayLightText = new Color(129, 131, 131);

    private final Color defaultDarkBtnCol = new Color(242, 242, 242);
    private final Color hoverDarkBtnCol = new Color(224, 225, 225);
    private final Color defaultDarkBtnText = new Color(51, 57, 140);
    private final Color hoverDarkBtnText = new Color(242, 242, 242);
    private final Color hoverDarkTextCol = new Color(147, 150, 191);
    private final Color DarkBG = new Color(30, 31, 31);
    private final Color defaultDarkText = new Color(242, 242, 242);

    public boolean darkEnabled = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDark;
    private javax.swing.JButton btnNext1;
    private javax.swing.JButton btnNext2;
    private javax.swing.JButton btnNext3;
    private com.toedter.calendar.JDateChooser calBday;
    private javax.swing.JCheckBox cbShowHidePass2;
    private javax.swing.JLabel lblBday;
    private javax.swing.JLabel lblBrgy;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblConfirmPass;
    private javax.swing.JLabel lblCreatePass;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblInfo1;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblNum1;
    private javax.swing.JLabel lblSignup;
    private javax.swing.JLabel lblStrt;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel picColorIcon1;
    private javax.swing.JLabel picFeatures;
    private javax.swing.JPanel pnlAddressFields;
    private javax.swing.JPanel pnlInfoFields;
    private javax.swing.JPanel pnlSignupFields;
    private javax.swing.JTextField txtBrgy;
    private javax.swing.JTextField txtCity;
    private javax.swing.JPasswordField txtConfirmPass;
    private javax.swing.JPasswordField txtCreatePass;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtStrt;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables

    public Font loadFonts(int i) {
        FontManager fontManager = new FontManager();

        // Set the desired font for lblTitle
        return fontManager.registerFonts(i);
    }
}
