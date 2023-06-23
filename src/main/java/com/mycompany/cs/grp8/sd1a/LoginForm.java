package com.mycompany.cs.grp8.sd1a;

import res.fonts.FontManager;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ItemEvent;
import javax.swing.BorderFactory;
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;

public class LoginForm extends javax.swing.JFrame {

    MainFeatures pnlFeatures = new MainFeatures();

    /**
     * Creates new form LoginForm
     *
     * @throws java.awt.FontFormatException
     * @throws java.io.IOException
     */
    public LoginForm() throws FontFormatException, IOException {
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
        pnlInfoFields = new javax.swing.JPanel();
        calBday = new com.toedter.calendar.JDateChooser();
        lblInfo = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblSurname = new javax.swing.JLabel();
        lblBday = new javax.swing.JLabel();
        pnlSignupFields = new javax.swing.JPanel();
        cbShowHidePass2 = new javax.swing.JCheckBox();
        lblSignup = new javax.swing.JLabel();
        txtNum2 = new javax.swing.JTextField();
        txtCreatePass = new javax.swing.JPasswordField();
        lblNum1 = new javax.swing.JLabel();
        lblCreatePass = new javax.swing.JLabel();
        lblConfirmPass = new javax.swing.JLabel();
        txtConfirmPass = new javax.swing.JPasswordField();
        btnNext = new javax.swing.JButton();
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
        picColorIcon1 = new javax.swing.JLabel();
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
        setIconImage(new ImageIcon(getClass().getResource("/res/images/FrameIcon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDark.setVisible(false);
        btnDark.setBackground(new java.awt.Color(242, 242, 242));
        btnDark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/images/moon-stars.png"))); // NOI18N
        btnDark.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(242, 242, 242))); // NOI18N
        btnDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarkActionPerformed(evt);
            }
        });
        getContentPane().add(btnDark, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        pnlInfoFields.setBackground(new java.awt.Color(242, 242, 242));
        pnlInfoFields.setVisible(false);
        pnlInfoFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlInfoFields.add(calBday, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 140, 40));

        lblInfo.setFont(new Font(loadFonts(0).getFontName(),Font.BOLD,55));
        lblInfo.setForeground(new java.awt.Color(16, 20, 20));
        lblInfo.setText("Information");
        pnlInfoFields.add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 400, 90));

        txtSurname.setBackground(new Color(0,0,0,0));
        txtSurname.setFont(new Font(loadFonts(9).getFontName(),Font.TRUETYPE_FONT,18));
        txtSurname.setForeground(new java.awt.Color(16, 20, 20));
        txtSurname.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        pnlInfoFields.add(txtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 360, 40));

        lblFirstName.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblFirstName.setForeground(new java.awt.Color(153, 153, 153));
        lblFirstName.setText("First Name");
        pnlInfoFields.add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        txtFirstName.setBackground(new Color(0,0,0,0));
        txtFirstName.setFont(new Font(loadFonts(9).getFontName(),Font.TRUETYPE_FONT,18));
        txtFirstName.setForeground(new java.awt.Color(16, 20, 20));
        txtFirstName.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        pnlInfoFields.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 360, 40));

        lblSurname.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblSurname.setForeground(new java.awt.Color(153, 153, 153));
        lblSurname.setText("Surname");
        pnlInfoFields.add(lblSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        lblBday.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblBday.setForeground(new java.awt.Color(153, 153, 153));
        lblBday.setText("Birth Date");
        pnlInfoFields.add(lblBday, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        getContentPane().add(pnlFeatures, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 540, 720));

        getContentPane().add(pnlInfoFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 720));

        pnlSignupFields.setBackground(new java.awt.Color(242, 242, 242));
        pnlSignupFields.setVisible(false);
        pnlSignupFields.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbShowHidePass2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbShowHidePass2ItemStateChanged(evt);
            }
        });
        pnlSignupFields.add(cbShowHidePass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        lblSignup.setFont(new Font(loadFonts(0).getFontName(),Font.BOLD,55));
        lblSignup.setForeground(new java.awt.Color(16, 20, 20));
        lblSignup.setText("Create Account");
        pnlSignupFields.add(lblSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 400, 90));

        txtNum2.setBackground(new Color(0,0,0,0));
        txtNum2.setFont(new Font(loadFonts(9).getFontName(),Font.TRUETYPE_FONT,18));
        txtNum2.setForeground(new java.awt.Color(16, 20, 20));
        txtNum2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        pnlSignupFields.add(txtNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 360, 40));

        txtCreatePass.setBackground(new Color(0,0,0,0));
        txtCreatePass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCreatePass.setForeground(new java.awt.Color(16, 20, 20));
        txtCreatePass.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        txtCreatePass.setEchoChar('\u00b7');
        pnlSignupFields.add(txtCreatePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 360, 40));

        lblNum1.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblNum1.setForeground(new java.awt.Color(153, 153, 153));
        lblNum1.setText("Account Number");
        pnlSignupFields.add(lblNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        lblCreatePass.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblCreatePass.setForeground(new java.awt.Color(153, 153, 153));
        lblCreatePass.setText("Create Password");
        pnlSignupFields.add(lblCreatePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        lblConfirmPass.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblConfirmPass.setForeground(new java.awt.Color(153, 153, 153));
        lblConfirmPass.setText("Confirm Password");
        pnlSignupFields.add(lblConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        txtConfirmPass.setBackground(new Color(0,0,0,0));
        txtConfirmPass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtConfirmPass.setForeground(new java.awt.Color(16, 20, 20));
        txtConfirmPass.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        txtConfirmPass.setEchoChar('\u00b7');
        pnlSignupFields.add(txtConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 360, 40));

        btnNext.setBackground(LightBG);
        btnNext.setFont(new Font(loadFonts(9).getFontName(),Font.PLAIN,25));
        btnNext.setForeground(hoverLightTextCol);
        btnNext.setText("Next.");
        btnNext.setBorder(null);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        pnlSignupFields.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 100, 50));

        pnlFeatures.setVisible(false);
        getContentPane().add(pnlFeatures, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 540, 720));

        getContentPane().add(pnlSignupFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 720));

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
        txtNum.setFont(new Font(loadFonts(9).getFontName(),Font.TRUETYPE_FONT,18));
        txtNum.setForeground(new java.awt.Color(16, 20, 20));
        txtNum.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        pnlLoginFields.add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 360, 40));

        lblNum.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblNum.setForeground(new java.awt.Color(153, 153, 153));
        lblNum.setText("Account Number");
        pnlLoginFields.add(lblNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        lblName.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblName.setForeground(new java.awt.Color(153, 153, 153));
        lblName.setText("Name");
        pnlLoginFields.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        txtName.setBackground(new Color(0,0,0,0));
        txtName.setFont(new Font(loadFonts(9).getFontName(),Font.TRUETYPE_FONT,18));
        txtName.setForeground(new java.awt.Color(16, 20, 20));
        txtName.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        pnlLoginFields.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 360, 40));

        lblPass.setFont(new Font(loadFonts(7).getFontName(),Font.PLAIN,16));
        lblPass.setForeground(new java.awt.Color(153, 153, 153));
        lblPass.setText("Password");
        pnlLoginFields.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        txtPass.setBackground(new Color(0,0,0,0));
        txtPass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPass.setForeground(new java.awt.Color(16, 20, 20));
        txtPass.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
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
                btnLoginActionPerformed(evt);
            }
        });
        pnlLoginFields.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 130, 40));

        picColorIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/images/ColorLogo.png"))); // NOI18N
        pnlLoginFields.add(picColorIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        pnlFeatures.setVisible(false);
        getContentPane().add(pnlFeatures, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 540, 720));

        getContentPane().add(pnlLoginFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 720));

        picFeatures.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/images/FeaturesBG.png"))); // NOI18N
        picFeatures.setVisible(false);
        getContentPane().add(picFeatures, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, -1));

        pnlCoverScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        picWhiteLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/images/WhiteLogo.png"))); // NOI18N
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

        picBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/images/Background.png"))); // NOI18N
        pnlCoverScreen.add(picBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));
        pnlFeatures.setVisible(false);
        getContentPane().add(pnlFeatures, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 540, 720));

        getContentPane().add(pnlCoverScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginPromptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginPromptMouseEntered
        btnLoginPrompt.setBackground(hoverDarkBtnCol);
    }//GEN-LAST:event_btnLoginPromptMouseEntered

    private void btnLoginPromptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginPromptMouseExited
        btnLoginPrompt.setBackground(hoverDarkBtnCol);
    }//GEN-LAST:event_btnLoginPromptMouseExited

    private void btnSignupPromptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupPromptMouseEntered
        btnSignupPrompt.setBackground(hoverDarkBtnCol);
    }//GEN-LAST:event_btnSignupPromptMouseEntered

    private void btnSignupPromptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupPromptMouseExited
        btnSignupPrompt.setBackground(hoverDarkBtnCol);
    }//GEN-LAST:event_btnSignupPromptMouseExited

    private void btnLoginPromptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginPromptActionPerformed
        pnlCoverScreen.setVisible(false);
        pnlLoginFields.setVisible(true);
        picFeatures.setVisible(true);
        pnlFeatures.setVisible(true);
        btnDark.setVisible(true);
    }//GEN-LAST:event_btnLoginPromptActionPerformed

    private void btnSignupPromptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupPromptActionPerformed
        pnlCoverScreen.setVisible(false);
        pnlSignupFields.setVisible(true);
        picFeatures.setVisible(true);
        pnlFeatures.setVisible(true);
        btnDark.setVisible(true);
    }//GEN-LAST:event_btnSignupPromptActionPerformed

    private void cbShowHidePass1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbShowHidePass1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            txtPass.setEchoChar((char) 0);
        } else {
            txtPass.setEchoChar('\u00b7');
        }
    }//GEN-LAST:event_cbShowHidePass1ItemStateChanged

    private void btnDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarkActionPerformed

        if (!darkEnabled) {
            setToDark();
        } else {
            setToLight();
        }
        
    }//GEN-LAST:event_btnDarkActionPerformed

    private void setToDark() {
        try {
            btnDark.setBackground(DarkBG);
            btnDark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/images/moon-stars1.png")));
            
            darkEnabled = true;
            UIManager.setLookAndFeel(new FlatDarculaLaf());
            SwingUtilities.updateComponentTreeUI(pnlLoginFields);
            pnlLoginFields.setBackground(DarkBG);
            lblLogin.setForeground(defaultDarkText);
            txtName.setForeground(defaultDarkText);
            txtNum.setForeground(defaultDarkText);
            txtPass.setForeground(defaultDarkText);
            
            SwingUtilities.updateComponentTreeUI(pnlSignupFields);
            pnlSignupFields.setBackground(DarkBG);
            lblSignup.setForeground(defaultDarkText);
            txtNum2.setForeground(defaultDarkText);
            txtCreatePass.setForeground(defaultDarkText);
            txtConfirmPass.setForeground(defaultDarkText);
            
            btnNext.setBorder(null);
            btnNext.setBackground(DarkBG);
            btnNext.setForeground(hoverDarkTextCol);
            
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
            btnDark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/images/moon-stars.png")));
            
            darkEnabled = false;
            UIManager.setLookAndFeel(new FlatLightLaf());
            SwingUtilities.updateComponentTreeUI(pnlLoginFields);
            pnlLoginFields.setBackground(LightBG);
            lblLogin.setForeground(defaultLightText);
            txtName.setForeground(defaultLightText);
            txtNum.setForeground(defaultLightText);
            txtPass.setForeground(defaultLightText);
            
            SwingUtilities.updateComponentTreeUI(pnlSignupFields);
            pnlSignupFields.setBackground(LightBG);
            lblSignup.setForeground(defaultLightText);
            txtNum2.setForeground(defaultLightText);
            txtCreatePass.setForeground(defaultLightText);
            txtConfirmPass.setForeground(defaultLightText);
            
            btnNext.setBorder(null);
            btnNext.setBackground(LightBG);
            btnNext.setForeground(hoverLightTextCol);
            
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

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        btnLogin.setBackground(defaultLightBtnCol);
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        btnLogin.setBackground(hoverLightBtnCol);
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String accNum = txtNum.getText();
        String accName = txtName.getText();
        String accPass = txtPass.getText();
        
        if (accNum.isBlank() || accName.isBlank() || accPass.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Fill up all fields", "Missing Information", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else if (!isIntegerFormat(accNum)) {
            javax.swing.JOptionPane.showMessageDialog(null, "Enter a valid account number.", "Invalid Account Number", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            dispose();
            HomeInterface.main(new String[0]);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void cbShowHidePass2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbShowHidePass2ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            txtCreatePass.setEchoChar((char) 0);
        } else {
            txtCreatePass.setEchoChar('\u00b7');
        }
    }//GEN-LAST:event_cbShowHidePass2ItemStateChanged

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        String accNum = txtNum2.getText();
        
        if (!isIntegerFormat(accNum)) {
            javax.swing.JOptionPane.showMessageDialog(null, "Enter a valid account number.", "Invalid Account Number", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else if (!txtCreatePass.getText().equals(txtConfirmPass.getText())) {
            javax.swing.JOptionPane.showMessageDialog(null, "Passwords do not match.", "Check Entered Password", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else if (accNum.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Fill up all fields", "Missing Information", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            pnlSignupFields.setVisible(false);
            pnlInfoFields.setVisible(true);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private boolean isIntegerFormat(String text) {
        String integerFormat = "\\d{5}\\s\\d{5}\\s\\d{5}\\s\\d{5}\\s\\d{5}"; //accepts only the format that banks use for accounts
        return text.matches(integerFormat);
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            UIManager.put("Button.arc", 999);
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println(e);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new LoginForm().setVisible(true);
            } catch (FontFormatException | IOException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    private final Color defaultLightBtnCol = new Color(51, 57, 140);
    private final Color hoverLightBtnCol = new Color(29, 29, 124);
    private final Color defaultLightBtnText = new Color(242, 242, 242);
    private final Color hoverLightBtnText = new Color(242, 242, 242);
    private final Color hoverLightTextCol = new Color(51, 57, 140);
    private final Color LightBG = new Color(242, 242, 242);
    private final Color defaultLightText = new Color(16, 20, 20);

    private final Color defaultDarkBtnCol = new Color(242, 242, 242);
    private final Color hoverDarkBtnCol = new Color(224, 225, 225);
    private final Color defaultDarkBtnText = new Color(51, 57, 140);
    private final Color hoverDarkBtnText = new Color(242, 242, 242);
    private final Color hoverDarkTextCol = new Color(147,150,191);
    private final Color DarkBG = new Color(30, 31, 31);
    private final Color defaultDarkText = new Color(242, 242, 242);

    public boolean darkEnabled = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDark;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLoginPrompt;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSignupPrompt;
    private com.toedter.calendar.JDateChooser calBday;
    private javax.swing.JCheckBox cbShowHidePass1;
    private javax.swing.JCheckBox cbShowHidePass2;
    private javax.swing.JLabel lblBday;
    private javax.swing.JLabel lblConfirmPass;
    private javax.swing.JLabel lblCreatePass;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblNum1;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblSignup;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblTagline1;
    private javax.swing.JLabel lblTagline2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel picBG;
    private javax.swing.JLabel picColorIcon1;
    private javax.swing.JLabel picFeatures;
    private javax.swing.JLabel picWhiteLogo;
    private javax.swing.JPanel pnlCoverScreen;
    private javax.swing.JPanel pnlInfoFields;
    private javax.swing.JPanel pnlLoginFields;
    private javax.swing.JPanel pnlSignupFields;
    private javax.swing.JPasswordField txtConfirmPass;
    private javax.swing.JPasswordField txtCreatePass;
    private javax.swing.JTextField txtFirstName;
    public javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables

    public Font loadFonts(int i) {
        FontManager fontManager = new FontManager();

        // Set the desired font for lblTitle
        return fontManager.registerFonts(i);
    }
}
