package com.mycompany.cs.grp8.sd1a;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import res.fonts.FontManager;
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
import java.awt.Dimension;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;

public class HomeInterface extends javax.swing.JFrame {

    pnlHomeInterface roundPanel;

    /**
     * Creates new form HomeInterface
     *
     * @param darkEnabled
     */
    public HomeInterface(boolean darkEnabled) {
        this.darkEnabled = darkEnabled;
        UIManager.put("Button.arc", 999);

        initComponents();

        if (darkEnabled) {
            setToDark();
        } else {
            setToLight();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHelp = new javax.swing.JButton();
        btnInbox = new javax.swing.JButton();
        btnTransactions = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        btnDark = new javax.swing.JToggleButton();
        picLogotype = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        btnProfile = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblBalance = new javax.swing.JLabel();
        lblSideBar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(LightBG);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHelp.setBackground(LightBG);
        btnHelp.setContentAreaFilled(false);
        btnHelp.setFont(new Font(loadFonts(9).getFontName(),Font.PLAIN,12));
        btnHelp.setForeground(defaultDarkText);
        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/cs/grp8/res/images/Help.png"))); // NOI18N
        btnHelp.setText("Help");
        btnHelp.setBorder(null);
        btnHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHelp.setIconTextGap(1);
        btnHelp.setPreferredSize(new Dimension(220,50));
        btnHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 80, 80));

        btnInbox.setBackground(LightBG);
        btnInbox.setContentAreaFilled(false);
        btnInbox.setFont(new Font(loadFonts(9).getFontName(),Font.PLAIN,12));
        btnInbox.setForeground(defaultDarkText);
        btnInbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/cs/grp8/res/images/Inbox.png"))); // NOI18N
        btnInbox.setText("Inbox");
        btnInbox.setBorder(null);
        btnInbox.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInbox.setIconTextGap(1);
        btnInbox.setPreferredSize(new Dimension(220,50));
        btnInbox.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnInbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 80, 80));

        btnTransactions.setBackground(LightBG);
        btnTransactions.setContentAreaFilled(false);
        btnTransactions.setFont(new Font(loadFonts(9).getFontName(),Font.PLAIN,12));
        btnTransactions.setForeground(defaultDarkText);
        btnTransactions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/cs/grp8/res/images/Transac.png"))); // NOI18N
        btnTransactions.setText("Transactions");
        btnTransactions.setBorder(null);
        btnTransactions.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTransactions.setIconTextGap(1);
        btnTransactions.setPreferredSize(new Dimension(220,50));
        btnTransactions.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTransactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransactionsActionPerformed(evt);
            }
        });
        getContentPane().add(btnTransactions, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 80, 80));

        btnDashboard.setContentAreaFilled(false);
        btnDashboard.setBackground(LightBG);
        btnDashboard.setFont(new Font(loadFonts(9).getFontName(),Font.PLAIN,12));
        btnDashboard.setForeground(defaultDarkText);
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/cs/grp8/res/images/Home.png"))); // NOI18N
        btnDashboard.setText("Dashboard");
        btnDashboard.setBorder(null);
        btnDashboard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDashboard.setIconTextGap(1);
        btnDashboard.setPreferredSize(new Dimension(220,50));
        btnDashboard.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 80));

        btnDark.setBackground(new java.awt.Color(242, 242, 242));
        btnDark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/cs/grp8/res/images/moon-stars.png"))); // NOI18N
        btnDark.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(242, 242, 242))); // NOI18N
        btnDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarkActionPerformed(evt);
            }
        });
        getContentPane().add(btnDark, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 40, 40));

        roundPanel = new pnlHomeInterface(panelLightCol,0,50,16,pnlMain);
        picLogotype.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/cs/grp8/res/images/WhiteLogo2_1.png"))); // NOI18N
        getContentPane().add(picLogotype, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        pnlMain.setBorder(roundPanel);
        pnlMain.setForeground(panelLightCol);
        pnlMain.setOpaque(false);
        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProfile.setBackground(LightBG);
        btnProfile.setContentAreaFilled(false);
        btnProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/cs/grp8/res/images/rickroll.png"))); // NOI18N
        btnProfile.setBorder(null);
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        pnlMain.add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, -1, -1));

        lblUser.setFont(new Font(loadFonts(0).getFontName(),Font.BOLD,16));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUser.setText("User Name");
        lblUser.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pnlMain.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 110, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBalance.setFont(new Font(loadFonts(0).getFontName(),Font.BOLD,16));
        lblBalance.setForeground(defaultDarkText);
        lblBalance.setText("Balance");
        jPanel1.add(lblBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        pnlMain.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 490, 280));

        getContentPane().add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 970, 720));

        lblSideBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/cs/grp8/res/images/SideBar.png"))); // NOI18N
        getContentPane().add(lblSideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarkActionPerformed

        if (!darkEnabled) {
            setToDark();
        } else {
            setToLight();
        }

    }//GEN-LAST:event_btnDarkActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnTransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransactionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTransactionsActionPerformed

    private void setToDark() {
        try {
            btnDark.setBackground(DarkBG);
            btnDark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/cs/grp8/res/images/moon-stars1.png")));

            darkEnabled = true;
            UIManager.setLookAndFeel(new FlatDarculaLaf());
            SwingUtilities.updateComponentTreeUI(pnlMain);
            pnlMain.setBackground(null);
            roundPanel.setColor(panelDarkCol);
            getContentPane().setBackground(DarkBG);
            
            btnDashboard.setBackground(DarkBG);
            btnTransactions.setBackground(DarkBG);
            btnInbox.setBackground(DarkBG);
            btnHelp.setBackground(DarkBG);
            
            lblUser.setForeground(defaultDarkText);
            btnProfile.setBackground(DarkBG);

        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setToLight() {
        try {
            btnDark.setBackground(LightBG);
            btnDark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/cs/grp8/res/images/moon-stars.png")));

            darkEnabled = false;
            UIManager.setLookAndFeel(new FlatLightLaf());
            SwingUtilities.updateComponentTreeUI(pnlMain);
            pnlMain.setBackground(null);
            roundPanel.setColor(panelLightCol);
            getContentPane().setBackground(LightBG);
            
            btnDashboard.setBackground(LightBG);
            btnTransactions.setBackground(LightBG);
            btnInbox.setBackground(LightBG);
            btnHelp.setBackground(LightBG);
            
            lblUser.setForeground(defaultLightText);
            btnProfile.setBackground(LightBG);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean getPreviousFrameColor(boolean isDarkModeEnabled) {
        return isDarkModeEnabled;
    }

    private final Color defaultLightBtnCol = new Color(51, 57, 140);
    private final Color hoverLightBtnCol = new Color(29, 29, 124);
    private final Color defaultLightBtnText = new Color(242, 242, 242);
    private final Color hoverLightBtnText = new Color(242, 242, 242);
    private final Color hoverLightTextCol = new Color(51, 57, 140);
    private final Color LightBG = new Color(242, 242, 242);
    private final Color defaultLightText = new Color(16, 20, 20);
    private final Color panelLightCol = new Color(253, 253, 253);

    private final Color grayLightText = new Color(129, 131, 131);

    private final Color defaultDarkBtnCol = new Color(242, 242, 242);
    private final Color hoverDarkBtnCol = new Color(224, 225, 225);
    private final Color defaultDarkBtnText = new Color(51, 57, 140);
    private final Color hoverDarkBtnText = new Color(242, 242, 242);
    private final Color hoverDarkTextCol = new Color(147, 150, 191);
    private final Color DarkBG = new Color(30, 31, 31);
    private final Color defaultDarkText = new Color(242, 242, 242);
    private final Color panelDarkCol = new Color(60, 60, 60);

    public boolean darkEnabled;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDark;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnInbox;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnTransactions;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblSideBar;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel picLogotype;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables

    public Font loadFonts(int i) {
        FontManager fontManager = new FontManager();

        // Set the desired font for lblTitle
        return fontManager.registerFonts(i);
    }
}
