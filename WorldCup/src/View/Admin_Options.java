/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Datos
 */
public class Admin_Options extends javax.swing.JPanel {
    private TableUsers tableUsersPanel = new TableUsers();
    private JPanel pnlContent;
    /**
     * Creates new form Admin_Options
     */
    public Admin_Options(JPanel pnlContent) {
        initComponents();
        this.pnlContent = pnlContent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlConsultData = new javax.swing.JPanel();
        btnConsultData = new javax.swing.JButton();
        pnlManageUsers = new javax.swing.JPanel();
        btnManageUsers = new javax.swing.JButton();
        pnlConsultData1 = new javax.swing.JPanel();
        btnConsultData1 = new javax.swing.JButton();
        pnlConsultData2 = new javax.swing.JPanel();
        btnConsultData2 = new javax.swing.JButton();
        pnlConsultData3 = new javax.swing.JPanel();
        btnConsultData3 = new javax.swing.JButton();
        pnlConsultData6 = new javax.swing.JPanel();
        btnConsultData6 = new javax.swing.JButton();
        pnlConsultData7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pnlConsultData8 = new javax.swing.JPanel();
        btnConsultData8 = new javax.swing.JButton();

        setBackground(new java.awt.Color(94, 4, 32));
        setMaximumSize(new java.awt.Dimension(834, 578));
        setMinimumSize(new java.awt.Dimension(834, 578));
        setPreferredSize(new java.awt.Dimension(834, 578));

        pnlConsultData.setBackground(new java.awt.Color(152, 12, 51));

        btnConsultData.setText("Consult Data");
        btnConsultData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultDataLayout = new javax.swing.GroupLayout(pnlConsultData);
        pnlConsultData.setLayout(pnlConsultDataLayout);
        pnlConsultDataLayout.setHorizontalGroup(
            pnlConsultDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConsultData, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        pnlConsultDataLayout.setVerticalGroup(
            pnlConsultDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConsultData, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

<<<<<<< HEAD
        btnManageUsers.setText("Manage Users");
        btnManageUsers.addActionListener(new java.awt.event.ActionListener() {
=======
        pnlManageUsers.setBackground(new java.awt.Color(152, 12, 51));

        jButton2.setText("Manage Users");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> cd67549d97e880bc3b4bd0965dd28a6dd40d054a
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUsersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlManageUsersLayout = new javax.swing.GroupLayout(pnlManageUsers);
        pnlManageUsers.setLayout(pnlManageUsersLayout);
        pnlManageUsersLayout.setHorizontalGroup(
            pnlManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnManageUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );
        pnlManageUsersLayout.setVerticalGroup(
            pnlManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManageUsersLayout.createSequentialGroup()
                .addComponent(btnManageUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pnlConsultData1.setBackground(new java.awt.Color(152, 12, 51));

        btnConsultData1.setText("Manage Players");

        javax.swing.GroupLayout pnlConsultData1Layout = new javax.swing.GroupLayout(pnlConsultData1);
        pnlConsultData1.setLayout(pnlConsultData1Layout);
        pnlConsultData1Layout.setHorizontalGroup(
            pnlConsultData1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConsultData1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        pnlConsultData1Layout.setVerticalGroup(
            pnlConsultData1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConsultData1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        pnlConsultData2.setBackground(new java.awt.Color(152, 12, 51));

        btnConsultData2.setText("Manage Events");
        btnConsultData2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultData2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultData2Layout = new javax.swing.GroupLayout(pnlConsultData2);
        pnlConsultData2.setLayout(pnlConsultData2Layout);
        pnlConsultData2Layout.setHorizontalGroup(
            pnlConsultData2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConsultData2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        pnlConsultData2Layout.setVerticalGroup(
            pnlConsultData2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConsultData2, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        pnlConsultData3.setBackground(new java.awt.Color(152, 12, 51));

        btnConsultData3.setText("Manage Players");

        javax.swing.GroupLayout pnlConsultData3Layout = new javax.swing.GroupLayout(pnlConsultData3);
        pnlConsultData3.setLayout(pnlConsultData3Layout);
        pnlConsultData3Layout.setHorizontalGroup(
            pnlConsultData3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConsultData3, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        pnlConsultData3Layout.setVerticalGroup(
            pnlConsultData3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConsultData3, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        pnlConsultData6.setBackground(new java.awt.Color(152, 12, 51));

        btnConsultData6.setText("Manage Matches");
        btnConsultData6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultData6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultData6Layout = new javax.swing.GroupLayout(pnlConsultData6);
        pnlConsultData6.setLayout(pnlConsultData6Layout);
        pnlConsultData6Layout.setHorizontalGroup(
            pnlConsultData6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConsultData6, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        pnlConsultData6Layout.setVerticalGroup(
            pnlConsultData6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConsultData6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        pnlConsultData7.setBackground(new java.awt.Color(152, 12, 51));

        jButton1.setText("jButton1");

        javax.swing.GroupLayout pnlConsultData7Layout = new javax.swing.GroupLayout(pnlConsultData7);
        pnlConsultData7.setLayout(pnlConsultData7Layout);
        pnlConsultData7Layout.setHorizontalGroup(
            pnlConsultData7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        pnlConsultData7Layout.setVerticalGroup(
            pnlConsultData7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        pnlConsultData8.setBackground(new java.awt.Color(152, 12, 51));

        btnConsultData8.setText("Manage Players");
        btnConsultData8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultData8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultData8Layout = new javax.swing.GroupLayout(pnlConsultData8);
        pnlConsultData8.setLayout(pnlConsultData8Layout);
        pnlConsultData8Layout.setHorizontalGroup(
            pnlConsultData8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConsultData8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlConsultData8Layout.setVerticalGroup(
            pnlConsultData8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultData8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnConsultData8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlConsultData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlConsultData2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnlConsultData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addComponent(pnlManageUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlConsultData3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlConsultData7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlConsultData8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlConsultData6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlManageUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(pnlConsultData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlConsultData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlConsultData2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlConsultData3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlConsultData6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlConsultData7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlConsultData8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(163, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUsersActionPerformed
        tableUsersPanel.setSize(834, 567);
        tableUsersPanel.setLocation(0,0);
        pnlContent.removeAll();
        pnlContent.add(tableUsersPanel,BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }//GEN-LAST:event_btnManageUsersActionPerformed

    private void btnConsultData2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultData2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultData2ActionPerformed

    private void btnConsultData6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultData6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultData6ActionPerformed

    private void btnConsultDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultDataActionPerformed
    
        
    }//GEN-LAST:event_btnConsultDataActionPerformed

    private void btnConsultData8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultData8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultData8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultData;
    private javax.swing.JButton btnConsultData1;
    private javax.swing.JButton btnConsultData2;
    private javax.swing.JButton btnConsultData3;
    private javax.swing.JButton btnConsultData6;
    private javax.swing.JButton btnConsultData8;
<<<<<<< HEAD
    private javax.swing.JButton btnManageUsers;
=======
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
>>>>>>> cd67549d97e880bc3b4bd0965dd28a6dd40d054a
    private javax.swing.JPanel pnlConsultData;
    private javax.swing.JPanel pnlConsultData1;
    private javax.swing.JPanel pnlConsultData2;
    private javax.swing.JPanel pnlConsultData3;
    private javax.swing.JPanel pnlConsultData6;
    private javax.swing.JPanel pnlConsultData7;
    private javax.swing.JPanel pnlConsultData8;
    private javax.swing.JPanel pnlManageUsers;
    // End of variables declaration//GEN-END:variables
}
