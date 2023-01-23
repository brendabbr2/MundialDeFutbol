/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Entities.User;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Datos
 */
public class MainFrame extends javax.swing.JFrame {

    private Login_Panel panelLog = null;
    private News_Panel newsPanel = null;
    private Admin_Options adminOpsPanel = null;
    private User user = new User();
    /**
     * Creates new form TEST
     */
    public MainFrame() {
        initComponents();
        setGuestUser();
        this.panelLog = new Login_Panel(this);
        this.newsPanel = new News_Panel(this);
        this.adminOpsPanel = new Admin_Options(this.pnlContent);
        this.btnLogout.setVisible(false);
        this.btnAdminOptions.setVisible(false);
    }
    
    public void setGuestUser(){
        this.user.setIdUser(-1);
        this.user.setIdUserType(-1);
        this.user.setUsername(null);
        this.user.setPassword(null);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public JPanel getPnlContent() {
        return pnlContent;
    }

    public void setPnlContent(JPanel pnlContent) {
        this.pnlContent = pnlContent;
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(JButton btnLogin) {
        this.btnLogin = btnLogin;
    }

    public JButton getBtnLogout() {
        return btnLogout;
    }

    public void setBtnLogout(JButton btnLogout) {
        this.btnLogout = btnLogout;
    }
    
    public void checkUserPrivileges(int userType){
        System.out.println("tipo de usuarios" + userType);
        if (userType == 2)
            this.btnAdminOptions.setVisible(true);
        else
            this.btnAdminOptions.setVisible(true);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        pnlSidebar = new javax.swing.JPanel();
        pnlLogo = new javax.swing.JPanel();
        pnlNews = new javax.swing.JPanel();
        btnNews = new javax.swing.JButton();
        pnlLikes = new javax.swing.JPanel();
        btnLikes = new javax.swing.JButton();
        pnlMatches = new javax.swing.JPanel();
        btnMatches = new javax.swing.JButton();
        pnlContent = new javax.swing.JPanel();
        pnlLogOut = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        pnlLogIn = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        pnlAdminOpts = new javax.swing.JPanel();
        btnAdminOptions = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1048, 580));

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setMaximumSize(new java.awt.Dimension(33601, 580));
        pnlBackground.setMinimumSize(new java.awt.Dimension(834, 580));
        pnlBackground.setName(""); // NOI18N
        pnlBackground.setPreferredSize(new java.awt.Dimension(1048, 580));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSidebar.setBackground(new java.awt.Color(94, 4, 32));

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );

        pnlNews.setBackground(new java.awt.Color(94, 4, 32));
        pnlNews.setPreferredSize(new java.awt.Dimension(220, 50));

        btnNews.setBackground(new java.awt.Color(152, 12, 51));
        btnNews.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnNews.setForeground(new java.awt.Color(255, 255, 255));
        btnNews.setText("News");
        btnNews.setBorder(null);
        btnNews.setMaximumSize(new java.awt.Dimension(220, 50));
        btnNews.setMinimumSize(new java.awt.Dimension(220, 50));
        btnNews.setPreferredSize(new java.awt.Dimension(220, 50));
        btnNews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNewsLayout = new javax.swing.GroupLayout(pnlNews);
        pnlNews.setLayout(pnlNewsLayout);
        pnlNewsLayout.setHorizontalGroup(
            pnlNewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNews, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );
        pnlNewsLayout.setVerticalGroup(
            pnlNewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNews, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlLikes.setBackground(new java.awt.Color(94, 4, 32));
        pnlLikes.setMaximumSize(new java.awt.Dimension(220, 50));
        pnlLikes.setMinimumSize(new java.awt.Dimension(220, 50));
        pnlLikes.setPreferredSize(new java.awt.Dimension(220, 50));

        btnLikes.setBackground(new java.awt.Color(152, 12, 51));
        btnLikes.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnLikes.setForeground(new java.awt.Color(255, 255, 255));
        btnLikes.setText("Likes");
        btnLikes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLikes.setMaximumSize(new java.awt.Dimension(220, 50));
        btnLikes.setMinimumSize(new java.awt.Dimension(220, 50));
        btnLikes.setPreferredSize(new java.awt.Dimension(220, 50));

        javax.swing.GroupLayout pnlLikesLayout = new javax.swing.GroupLayout(pnlLikes);
        pnlLikes.setLayout(pnlLikesLayout);
        pnlLikesLayout.setHorizontalGroup(
            pnlLikesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLikes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlLikesLayout.setVerticalGroup(
            pnlLikesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLikes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlMatches.setBackground(new java.awt.Color(152, 12, 51));

        btnMatches.setBackground(new java.awt.Color(152, 12, 51));
        btnMatches.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnMatches.setForeground(new java.awt.Color(255, 255, 255));
        btnMatches.setText("Matches");
        btnMatches.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMatches.setMaximumSize(new java.awt.Dimension(45, 18));
        btnMatches.setMinimumSize(new java.awt.Dimension(45, 18));
        btnMatches.setPreferredSize(new java.awt.Dimension(45, 18));
        btnMatches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatchesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMatchesLayout = new javax.swing.GroupLayout(pnlMatches);
        pnlMatches.setLayout(pnlMatchesLayout);
        pnlMatchesLayout.setHorizontalGroup(
            pnlMatchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMatches, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMatchesLayout.setVerticalGroup(
            pnlMatchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMatches, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        pnlContent.setBackground(new java.awt.Color(94, 4, 32));
        pnlContent.setMaximumSize(new java.awt.Dimension(834, 578));
        pnlContent.setMinimumSize(new java.awt.Dimension(834, 578));
        pnlContent.setPreferredSize(new java.awt.Dimension(834, 578));

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        pnlLogOut.setBackground(new java.awt.Color(94, 4, 32));
        pnlLogOut.setPreferredSize(new java.awt.Dimension(73, 54));

        btnLogout.setBackground(new java.awt.Color(152, 12, 51));
        btnLogout.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Log Out");
        btnLogout.setBorder(null);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLogOutLayout = new javax.swing.GroupLayout(pnlLogOut);
        pnlLogOut.setLayout(pnlLogOutLayout);
        pnlLogOutLayout.setHorizontalGroup(
            pnlLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );
        pnlLogOutLayout.setVerticalGroup(
            pnlLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        pnlLogIn.setBackground(new java.awt.Color(94, 4, 32));
        pnlLogIn.setPreferredSize(new java.awt.Dimension(73, 54));

        btnLogin.setBackground(new java.awt.Color(152, 12, 51));
        btnLogin.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Log in");
        btnLogin.setBorder(null);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLogInLayout = new javax.swing.GroupLayout(pnlLogIn);
        pnlLogIn.setLayout(pnlLogInLayout);
        pnlLogInLayout.setHorizontalGroup(
            pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );
        pnlLogInLayout.setVerticalGroup(
            pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlAdminOpts.setBackground(new java.awt.Color(94, 4, 32));

        btnAdminOptions.setBackground(new java.awt.Color(152, 12, 51));
        btnAdminOptions.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnAdminOptions.setForeground(new java.awt.Color(255, 255, 255));
        btnAdminOptions.setText("Administrator Options");
        btnAdminOptions.setBorder(null);
        btnAdminOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminOptionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAdminOptsLayout = new javax.swing.GroupLayout(pnlAdminOpts);
        pnlAdminOpts.setLayout(pnlAdminOptsLayout);
        pnlAdminOptsLayout.setHorizontalGroup(
            pnlAdminOptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAdminOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlAdminOptsLayout.setVerticalGroup(
            pnlAdminOptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAdminOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlSidebarLayout = new javax.swing.GroupLayout(pnlSidebar);
        pnlSidebar.setLayout(pnlSidebarLayout);
        pnlSidebarLayout.setHorizontalGroup(
            pnlSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addGroup(pnlSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSidebarLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(pnlLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(pnlLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlSidebarLayout.createSequentialGroup()
                        .addGroup(pnlSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlNews, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(pnlLikes, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(pnlMatches, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlAdminOpts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(pnlContent, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        pnlSidebarLayout.setVerticalGroup(
            pnlSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addComponent(pnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNews, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlLikes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlMatches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(pnlAdminOpts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlBackground.add(pnlSidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewsActionPerformed
        newsPanel.setSize(834, 567);
        newsPanel.setLocation(0,0);
        pnlContent.removeAll();
        pnlContent.add(newsPanel,BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }//GEN-LAST:event_btnNewsActionPerformed

    private void btnAdminOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminOptionsActionPerformed
        adminOpsPanel.setSize(834, 567);
        adminOpsPanel.setLocation(0,0);
        pnlContent.removeAll();
        pnlContent.add(adminOpsPanel,BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }//GEN-LAST:event_btnAdminOptionsActionPerformed

    private void btnMatchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatchesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMatchesActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.setGuestUser();
        this.btnLogout.setVisible(false);
        this.btnLogin.setVisible(true);
        this.btnAdminOptions.setVisible(false);
        pnlContent.removeAll();
        pnlContent.revalidate();
        pnlContent.repaint();
        
        newsPanel.resetLikeIcon();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        panelLog.setSize(834, 567);
        panelLog.setLocation(0,0);
        pnlContent.removeAll();
        pnlContent.add(panelLog,BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminOptions;
    private javax.swing.JButton btnLikes;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMatches;
    private javax.swing.JButton btnNews;
    private javax.swing.JPanel pnlAdminOpts;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlLikes;
    private javax.swing.JPanel pnlLogIn;
    private javax.swing.JPanel pnlLogOut;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlMatches;
    private javax.swing.JPanel pnlNews;
    private javax.swing.JPanel pnlSidebar;
    // End of variables declaration//GEN-END:variables
}
