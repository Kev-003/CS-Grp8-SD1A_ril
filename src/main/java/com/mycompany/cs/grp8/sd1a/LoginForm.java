package com.mycompany.cs.grp8.sd1a;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ItemEvent;
import javax.swing.BorderFactory;
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import res.fonts.FontManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.FontUIResource;

public class LoginForm extends javax.swing.JFrame {
    MainFeatures pnlFeatures = new MainFeatures();

    /**
     * Creates new form LoginForm
     *
     * @throws java.awt.FontFormatException
     * @throws java.io.IOException
     */
    public LoginForm() throws FontFormatException, IOException {
        UIManager.put("OptionPane.messageFont",
                new FontUIResource(new Font(loadFonts(0).getFontName(), Font.PLAIN, 16)));
        UIManager.put("OptionPane.buttonFont",
                new FontUIResource(new Font(loadFonts(0).getFontName(), Font.PLAIN, 16)));
        UIManager.put("OptionPane.errorIcon",
                new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/cs/grp8/res/images/Warning.png")));
        UIManager.put("OptionPane.messageForeground", defaultDarkBtnText);
        UIManager.put("OptionPane.buttonForeground", defaultDarkBtnText);
        initComponents();
    }

    // Variables used for SQL coonnection
    Connection con;
    PreparedStatement insert;
    dbConnection obj = new dbConnection();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        picColorIcon1 = new javax.swing.JLabel();
        btnDark = new javax.swing.JToggleButton();
        pnlLoginFields = new javax.swing.JPanel();
        cbShowHidePass1 = new javax.swing.JCheckBox();
        lblLogin = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        lblNum = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        picFeatures = new javax.swing.JLabel();
        pnlCoverScreen = new javax.swing.JPanel();
        picWhiteLogo = new javax.swing.JLabel();
        lblTagline2 = new javax.swing.JLabel();
        lblTagline1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnLoginPrompt = new javax.swing.JButton();
        btnSignupPrompt = new javax.swing.JButton();
        picBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/com/mycompany/cs/grp8/res/images/FrameIcon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        picColorIcon1.setVisible(false);
        picColorIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/cs/grp8/res/images/ColorLogo.png"))); // NOI18N
        getContentPane().add(picColorIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        btnDark.setVisible(false);
        btnDark.setBackground(new java.awt.Color(242, 242, 242));
        btnDark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/cs/grp8/res/images/moon-stars.png"))); // NOI18N
        btnDark.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(242, 242, 242))); // NOI18N
        btnDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarkActionPerformed(evt);
            }
        });
        getContentPane().add(btnDark, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        pnlLoginFields.setBackground(new java.awt.Color(242, 242, 242));
        pnlLoginFields.setVisible(false);
        pnlLoginFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbShowHidePass1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbShowHidePass1ItemStateChanged(evt);
            }
        });
        pnlLoginFields.add(cbShowHidePass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, -1, -1));

        lblLogin.setFont(new Font(loadFonts(0).getFontName(),Font.BOLD,55));
        lblLogin.setForeground(new java.awt.Color(16, 20, 20));
        lblLogin.setText("Login");
        pnlLoginFields.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 280, 90));

        txtNum.setBackground(new Color(0,0,0,0));
        txtNum.setFont(new Font(loadFonts(20).getFontName(),Font.TRUETYPE_FONT,18));
        txtNum.setForeground(new java.awt.Color(16, 20, 20));
        txtNum.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, grayLightText));
        pnlLoginFields.add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 360, 40));

        lblNum.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblNum.setForeground(grayLightText);
        lblNum.setText("Account Number");
        pnlLoginFields.add(lblNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        lblName.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblName.setForeground(grayLightText);
        lblName.setText("Name");
        pnlLoginFields.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        txtName.setBackground(new Color(0,0,0,0));
        txtName.setFont(new Font(loadFonts(20).getFontName(),Font.TRUETYPE_FONT,18));
        txtName.setForeground(new java.awt.Color(16, 20, 20));
        txtName.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, grayLightText));
        pnlLoginFields.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 360, 40));

        lblPass.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblPass.setForeground(grayLightText);
        lblPass.setText("Password");
        pnlLoginFields.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        txtPass.setBackground(new Color(0,0,0,0));
        txtPass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPass.setForeground(new java.awt.Color(16, 20, 20));
        txtPass.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, grayLightText));
        txtPass.setEchoChar('\u00b7');
        pnlLoginFields.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 360, 40));

        btnLogin.setBackground(defaultLightBtnCol);
        btnLogin.setFont(new Font(loadFonts(9).getFontName(),Font.BOLD,20));
        btnLogin.setForeground(defaultLightBtnText);
        btnLogin.setText("Log In");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnLoginActionPerformed(evt);
                } catch (FontFormatException | IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        pnlLoginFields.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 130, 40));

        pnlFeatures.setVisible(false);
        getContentPane().add(pnlFeatures, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 540, 720));

        getContentPane().add(pnlLoginFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 720));

        picFeatures.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/images/FeaturesBG.png"))); // NOI18N
        picFeatures.setVisible(false);
        getContentPane().add(picFeatures, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, -1));

        pnlCoverScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        picWhiteLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/cs/grp8/res/images/WhiteLogo.png"))); // NOI18N
        pnlCoverScreen.add(picWhiteLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        lblTagline2.setFont(new Font(loadFonts(0).getFontName(),Font.BOLD,75));
        lblTagline2.setForeground(new java.awt.Color(242, 242, 242));
        lblTagline2.setText("Seamless Experience.");
        pnlCoverScreen.add(lblTagline2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 820, 80));

        lblTagline1.setFont(new Font(loadFonts(0).getFontName(),Font.BOLD,75));
        lblTagline1.setForeground(new java.awt.Color(242, 242, 242));
        lblTagline1.setText("Secure Banking,");
        pnlCoverScreen.add(lblTagline1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 850, 90));

        lblTitle.setFont(new Font(loadFonts(0).getFontName(),Font.BOLD,25));
        lblTitle.setForeground(new java.awt.Color(242, 242, 242));
        lblTitle.setText("ShadiFinTech");
        pnlCoverScreen.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 510, 40));

        btnLoginPrompt.setBackground(defaultDarkBtnCol);
        btnLoginPrompt.setFont(new Font(loadFonts(9).getFontName(),Font.BOLD,20));
        btnLoginPrompt.setForeground(defaultDarkBtnText);
        btnLoginPrompt.setText("Log In");
        btnLoginPrompt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginPromptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginPromptMouseExited(evt);
            }
        });
        btnLoginPrompt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginPromptActionPerformed(evt);
            }
        });
        pnlCoverScreen.add(btnLoginPrompt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 160, 40));

        btnSignupPrompt.setBackground(defaultDarkBtnCol);
        btnSignupPrompt.setFont(new Font(loadFonts(9).getFontName(),Font.BOLD,20));
        btnSignupPrompt.setForeground(defaultDarkBtnText);
        btnSignupPrompt.setText("Sign Up");
        btnSignupPrompt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignupPromptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignupPromptMouseExited(evt);
            }
        });
        btnSignupPrompt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupPromptActionPerformed(evt);
            }
        });
        pnlCoverScreen.add(btnSignupPrompt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 160, 40));

        picBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/cs/grp8/res/images/Background.png"))); // NOI18N
        pnlCoverScreen.add(picBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));
        pnlFeatures.setVisible(false);
        getContentPane().add(pnlFeatures, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 540, 720));

        getContentPane().add(pnlCoverScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginPromptMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnLoginPromptMouseEntered
        btnLoginPrompt.setBackground(hoverDarkBtnCol);
    }// GEN-LAST:event_btnLoginPromptMouseEntered

    private void btnLoginPromptMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnLoginPromptMouseExited
        btnLoginPrompt.setBackground(hoverDarkBtnCol);
    }// GEN-LAST:event_btnLoginPromptMouseExited

    private void btnSignupPromptMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnSignupPromptMouseEntered
        btnSignupPrompt.setBackground(hoverDarkBtnCol);
    }// GEN-LAST:event_btnSignupPromptMouseEntered

    private void btnSignupPromptMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnSignupPromptMouseExited
        btnSignupPrompt.setBackground(hoverDarkBtnCol);
    }// GEN-LAST:event_btnSignupPromptMouseExited

    private void btnLoginPromptActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLoginPromptActionPerformed
        pnlCoverScreen.setVisible(false);
        pnlLoginFields.setVisible(true);
        picFeatures.setVisible(true);
        pnlFeatures.setVisible(true);
        btnDark.setVisible(true);
        picColorIcon1.setVisible(true);

    }// GEN-LAST:event_btnLoginPromptActionPerformed

    private void btnSignupPromptActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSignupPromptActionPerformed
        SignupForm signUp = new SignupForm();
        if (darkEnabled) {
            signUp.run(new FlatDarculaLaf());
        } else {
            signUp.run(new FlatLightLaf());
        }
    }// GEN-LAST:event_btnSignupPromptActionPerformed

    private void cbShowHidePass1ItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_cbShowHidePass1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            txtPass.setEchoChar((char) 0);
            txtPass.setFont(new Font(loadFonts(20).getFontName(), Font.TRUETYPE_FONT, 18));
        } else {
            txtPass.setEchoChar('\u00b7');
            txtPass.setFont(new Font("Segoe UI", Font.BOLD, 18));
        }
    }// GEN-LAST:event_cbShowHidePass1ItemStateChanged

    private void btnDarkActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDarkActionPerformed

        if (!darkEnabled) {
            setToDark();
        } else {
            setToLight();
        }

    }// GEN-LAST:event_btnDarkActionPerformed

    private void setToDark() {
        try {
            this.getRootPane().putClientProperty("JRootPane.titleBarBackground", DarkBG);
            this.getRootPane().putClientProperty("JRootPane.titleBarForeground", defaultDarkText);

            btnDark.setBackground(DarkBG);
            btnDark.setIcon(new javax.swing.ImageIcon(
                    getClass().getResource("/com/mycompany/cs/grp8/res/images/moon-stars1.png")));
            picColorIcon1.setIcon(new javax.swing.ImageIcon(
                    getClass().getResource("/com/mycompany/cs/grp8/res/images/ColorLogo.png")));

            darkEnabled = true;
            UIManager.setLookAndFeel(new FlatDarkLaf());
            SwingUtilities.updateComponentTreeUI(pnlLoginFields);
            pnlLoginFields.setBackground(DarkBG);
            lblLogin.setForeground(defaultDarkText);
            txtName.setForeground(defaultDarkText);
            txtNum.setForeground(defaultDarkText);
            txtPass.setForeground(defaultDarkText);

        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setToLight() {
        try {
            this.getRootPane().putClientProperty("JRootPane.titleBarBackground", LightBG);
            this.getRootPane().putClientProperty("JRootPane.titleBarForeground", defaultLightText);

            btnDark.setBackground(LightBG);
            btnDark.setIcon(new javax.swing.ImageIcon(
                    getClass().getResource("/com/mycompany/cs/grp8/res/images/moon-stars.png")));
            picColorIcon1.setIcon(new javax.swing.ImageIcon(
                    getClass().getResource("/com/mycompany/cs/grp8/res/images/ColorLogo.png")));

            darkEnabled = false;
            UIManager.setLookAndFeel(new FlatLightLaf());
            SwingUtilities.updateComponentTreeUI(pnlLoginFields);
            pnlLoginFields.setBackground(LightBG);
            lblLogin.setForeground(defaultLightText);
            txtName.setForeground(defaultLightText);
            txtNum.setForeground(defaultLightText);
            txtPass.setForeground(defaultLightText);

        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnLoginMouseEntered
        btnLogin.setBackground(defaultLightBtnCol);
    }// GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnLoginMouseExited
        btnLogin.setBackground(hoverLightBtnCol);
    }// GEN-LAST:event_btnLoginMouseExited

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) throws FontFormatException, IOException {// GEN-FIRST:event_btnLoginActionPerformed
        String accNum = txtNum.getText();
        String accName = txtName.getText();
        String accPass = txtPass.getText();

        if (darkEnabled) {
            UIManager.put("OptionPane.background", DarkBG);
        } else {
            UIManager.put("OptionPane.background", LightBG);
        }

        if (accNum.isBlank() || accName.isBlank() || accPass.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Fill up all fields", "Missing Information",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        } else if (!isIntegerFormat(accNum)) {
            javax.swing.JOptionPane.showMessageDialog(null, "Enter a valid account number.", "Invalid Account Number",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                con = obj.getConnection();
                String accountNum = txtNum.getText();
                String pass = String.valueOf(txtPass.getPassword());
                String name = txtName.getText();
                // Find a match for the account number given
                String findUser = ("SELECT * FROM tblaccount WHERE accountNum LIKE '%" + accountNum + "%'");
                PreparedStatement user = con.prepareStatement(findUser);
                ResultSet result = user.executeQuery();
                if (result.next()) { // Search the rows with values
                    String userPass = result.getString("userPass"); // Obtain the password on the same row
                    String firstName = result.getString("firstName"); // Obtain the first name on the same row
                    String lastName = result.getString("lastName"); // Obtain the password on the same row
                    if (pass.equals(userPass) && name.equals(firstName + " " + lastName)) {
                        dispose();
                        new HomeInterface(darkEnabled).setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Password do not match");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Account not found");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
            } finally {
                dbConnection.closeConnection(); // Terminate database connection
            }
        }

    }// GEN-LAST:event_btnLoginActionPerformed

    private boolean isIntegerFormat(String text) {
        String integerFormat = "\\d{5}\\s\\d{5}\\s\\d{5}\\s\\d{5}\\s\\d{5}"; // accepts only the format that banks use
                                                                             // for accounts
        return text.matches(integerFormat);
    }

    public static void openForm() {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            UIManager.put("Button.arc", 999);
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println(e);
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new LoginForm().setVisible(true);
            } catch (FontFormatException | IOException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    public boolean getDarkModeSetting(boolean isDark) {
        return isDark;
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
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLoginPrompt;
    private javax.swing.JButton btnSignupPrompt;
    private javax.swing.JCheckBox cbShowHidePass1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblTagline1;
    private javax.swing.JLabel lblTagline2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel picBG;
    private javax.swing.JLabel picColorIcon1;
    private javax.swing.JLabel picFeatures;
    private javax.swing.JLabel picWhiteLogo;
    private javax.swing.JPanel pnlCoverScreen;
    private javax.swing.JPanel pnlLoginFields;
    public javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNum;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables

    private Font loadFonts(int i) {
        FontManager fontManager = new FontManager();

        // Set the desired font for lblTitle
        return fontManager.registerFonts(i);
    }
}
