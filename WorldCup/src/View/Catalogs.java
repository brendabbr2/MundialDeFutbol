/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import View.CatalogsPK.TableEventTypes;
import View.CatalogsPK.TableGenders;
import View.CatalogsPK.TableDemonyms;
import View.CatalogsPK.TableHelperType;
import View.CatalogsPK.TableIdentificationTypes;
import View.CatalogsPK.TableLineups;
import View.CatalogsPK.TableParameters;
import View.CatalogsPK.TablePositions;
import View.CatalogsPK.TableUserTypes;
import View.CatalogsPK.TableWorkerTypes;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author jox
 */
public class Catalogs extends javax.swing.JPanel {
    private TableEventTypes tableEventType = new TableEventTypes();
    private TableGenders tableGenders = new TableGenders();
    private TableDemonyms tableDemonyms = new TableDemonyms();
    private TableHelperType tableHelperType = new TableHelperType();
    private TableIdentificationTypes tableIdentificationType = new TableIdentificationTypes();
    private TableLineups tableLineups = new TableLineups();
    private TableParameters tableParameters = new TableParameters();
    private TablePositions tablePostions = new TablePositions();
    private TableUserTypes tableUserTypes = new TableUserTypes();
    private TableWorkerTypes tableWorkerTypes = new TableWorkerTypes();
    
    private JPanel pnlContent;
    /**
     * Creates new form Catalogs
     */
    public Catalogs(JPanel pnlContent) {
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

        jPanel1 = new javax.swing.JPanel();
        btnWorkerType = new javax.swing.JButton();
        btnEventType = new javax.swing.JButton();
        btnHelperType = new javax.swing.JButton();
        btnIdentificationType = new javax.swing.JButton();
        btnPosition = new javax.swing.JButton();
        btnUserType = new javax.swing.JButton();
        btnGender = new javax.swing.JButton();
        btnLineup = new javax.swing.JButton();
        btnDemonym = new javax.swing.JButton();
        btnParameters = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(94, 4, 32));
        jPanel1.setMaximumSize(new java.awt.Dimension(834, 578));
        jPanel1.setMinimumSize(new java.awt.Dimension(834, 578));

        btnWorkerType.setBackground(new java.awt.Color(152, 12, 51));
        btnWorkerType.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnWorkerType.setForeground(new java.awt.Color(255, 255, 255));
        btnWorkerType.setText("Worker Type");
        btnWorkerType.setBorder(null);
        btnWorkerType.setMaximumSize(new java.awt.Dimension(220, 50));
        btnWorkerType.setMinimumSize(new java.awt.Dimension(220, 50));
        btnWorkerType.setPreferredSize(new java.awt.Dimension(220, 50));
        btnWorkerType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkerTypeActionPerformed(evt);
            }
        });

        btnEventType.setBackground(new java.awt.Color(152, 12, 51));
        btnEventType.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnEventType.setForeground(new java.awt.Color(255, 255, 255));
        btnEventType.setText("Event Type");
        btnEventType.setBorder(null);
        btnEventType.setMaximumSize(new java.awt.Dimension(220, 50));
        btnEventType.setMinimumSize(new java.awt.Dimension(220, 50));
        btnEventType.setPreferredSize(new java.awt.Dimension(220, 50));
        btnEventType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventTypeActionPerformed(evt);
            }
        });

        btnHelperType.setBackground(new java.awt.Color(152, 12, 51));
        btnHelperType.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnHelperType.setForeground(new java.awt.Color(255, 255, 255));
        btnHelperType.setText("Helper Type");
        btnHelperType.setBorder(null);
        btnHelperType.setMaximumSize(new java.awt.Dimension(220, 50));
        btnHelperType.setMinimumSize(new java.awt.Dimension(220, 50));
        btnHelperType.setPreferredSize(new java.awt.Dimension(220, 50));
        btnHelperType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelperTypeActionPerformed(evt);
            }
        });

        btnIdentificationType.setBackground(new java.awt.Color(152, 12, 51));
        btnIdentificationType.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnIdentificationType.setForeground(new java.awt.Color(255, 255, 255));
        btnIdentificationType.setText("Identification Type");
        btnIdentificationType.setBorder(null);
        btnIdentificationType.setMaximumSize(new java.awt.Dimension(220, 50));
        btnIdentificationType.setMinimumSize(new java.awt.Dimension(220, 50));
        btnIdentificationType.setPreferredSize(new java.awt.Dimension(220, 50));
        btnIdentificationType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdentificationTypeActionPerformed(evt);
            }
        });

        btnPosition.setBackground(new java.awt.Color(152, 12, 51));
        btnPosition.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnPosition.setForeground(new java.awt.Color(255, 255, 255));
        btnPosition.setText("Position");
        btnPosition.setBorder(null);
        btnPosition.setMaximumSize(new java.awt.Dimension(220, 50));
        btnPosition.setMinimumSize(new java.awt.Dimension(220, 50));
        btnPosition.setPreferredSize(new java.awt.Dimension(220, 50));
        btnPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPositionActionPerformed(evt);
            }
        });

        btnUserType.setBackground(new java.awt.Color(152, 12, 51));
        btnUserType.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnUserType.setForeground(new java.awt.Color(255, 255, 255));
        btnUserType.setText("User Type");
        btnUserType.setBorder(null);
        btnUserType.setMaximumSize(new java.awt.Dimension(220, 50));
        btnUserType.setMinimumSize(new java.awt.Dimension(220, 50));
        btnUserType.setPreferredSize(new java.awt.Dimension(220, 50));
        btnUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserTypeActionPerformed(evt);
            }
        });

        btnGender.setBackground(new java.awt.Color(152, 12, 51));
        btnGender.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnGender.setForeground(new java.awt.Color(255, 255, 255));
        btnGender.setText("Gender");
        btnGender.setBorder(null);
        btnGender.setMaximumSize(new java.awt.Dimension(220, 50));
        btnGender.setMinimumSize(new java.awt.Dimension(220, 50));
        btnGender.setPreferredSize(new java.awt.Dimension(220, 50));
        btnGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenderActionPerformed(evt);
            }
        });

        btnLineup.setBackground(new java.awt.Color(152, 12, 51));
        btnLineup.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnLineup.setForeground(new java.awt.Color(255, 255, 255));
        btnLineup.setText("Lineup");
        btnLineup.setBorder(null);
        btnLineup.setMaximumSize(new java.awt.Dimension(220, 50));
        btnLineup.setMinimumSize(new java.awt.Dimension(220, 50));
        btnLineup.setPreferredSize(new java.awt.Dimension(220, 50));
        btnLineup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineupActionPerformed(evt);
            }
        });

        btnDemonym.setBackground(new java.awt.Color(152, 12, 51));
        btnDemonym.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnDemonym.setForeground(new java.awt.Color(255, 255, 255));
        btnDemonym.setText("Demonym");
        btnDemonym.setBorder(null);
        btnDemonym.setMaximumSize(new java.awt.Dimension(220, 50));
        btnDemonym.setMinimumSize(new java.awt.Dimension(220, 50));
        btnDemonym.setPreferredSize(new java.awt.Dimension(220, 50));
        btnDemonym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDemonymActionPerformed(evt);
            }
        });

        btnParameters.setBackground(new java.awt.Color(152, 12, 51));
        btnParameters.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnParameters.setForeground(new java.awt.Color(255, 255, 255));
        btnParameters.setText("Parameters");
        btnParameters.setBorder(null);
        btnParameters.setMaximumSize(new java.awt.Dimension(220, 50));
        btnParameters.setMinimumSize(new java.awt.Dimension(220, 50));
        btnParameters.setPreferredSize(new java.awt.Dimension(220, 50));
        btnParameters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParametersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEventType, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIdentificationType, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLineup, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnParameters, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHelperType, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(btnWorkerType, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGender, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDemonym, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWorkerType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHelperType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEventType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIdentificationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLineup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDemonym, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(btnParameters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 834, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnWorkerTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkerTypeActionPerformed
        this.tableWorkerTypes.setSize(834, 567);
        this.tableWorkerTypes.setLocation(0,0);
        pnlContent.removeAll();
        pnlContent.add(this.tableWorkerTypes,BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }//GEN-LAST:event_btnWorkerTypeActionPerformed

    private void btnEventTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventTypeActionPerformed
        this.tableEventType.setSize(834, 567);
        this.tableEventType.setLocation(0,0);
        pnlContent.removeAll();
        pnlContent.add(this.tableEventType,BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }//GEN-LAST:event_btnEventTypeActionPerformed

    private void btnHelperTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelperTypeActionPerformed
        this.tableHelperType.setSize(834, 567);
        this.tableHelperType.setLocation(0,0);
        pnlContent.removeAll();
        pnlContent.add(this.tableHelperType,BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }//GEN-LAST:event_btnHelperTypeActionPerformed

    private void btnIdentificationTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdentificationTypeActionPerformed
        this.tableIdentificationType.setSize(834, 567);
        this.tableIdentificationType.setLocation(0,0);
        pnlContent.removeAll();
        pnlContent.add(this.tableIdentificationType,BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }//GEN-LAST:event_btnIdentificationTypeActionPerformed

    private void btnPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPositionActionPerformed
        this.tablePostions.setSize(834, 567);
        this.tablePostions.setLocation(0,0);
        pnlContent.removeAll();
        pnlContent.add(this.tablePostions,BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }//GEN-LAST:event_btnPositionActionPerformed

    private void btnUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserTypeActionPerformed
        this.tableUserTypes.setSize(834, 567);
        this.tableUserTypes.setLocation(0,0);
        pnlContent.removeAll();
        pnlContent.add(this.tableUserTypes,BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }//GEN-LAST:event_btnUserTypeActionPerformed

    private void btnGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenderActionPerformed
        this.tableGenders.setSize(834, 567);
        this.tableGenders.setLocation(0,0);
        pnlContent.removeAll();
        pnlContent.add(this.tableGenders,BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }//GEN-LAST:event_btnGenderActionPerformed

    private void btnLineupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineupActionPerformed
        this.tableLineups.setSize(834, 567);
        this.tableLineups.setLocation(0,0);
        pnlContent.removeAll();
        pnlContent.add(this.tableLineups,BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }//GEN-LAST:event_btnLineupActionPerformed

    private void btnDemonymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDemonymActionPerformed
        this.tableDemonyms.setSize(834, 567);
        this.tableDemonyms.setLocation(0,0);
        pnlContent.removeAll();
        pnlContent.add(this.tableDemonyms,BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }//GEN-LAST:event_btnDemonymActionPerformed

    private void btnParametersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParametersActionPerformed
        this.tableParameters.setSize(834, 567);
        this.tableParameters.setLocation(0,0);
        pnlContent.removeAll();
        pnlContent.add(this.tableParameters,BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }//GEN-LAST:event_btnParametersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDemonym;
    private javax.swing.JButton btnEventType;
    private javax.swing.JButton btnGender;
    private javax.swing.JButton btnHelperType;
    private javax.swing.JButton btnIdentificationType;
    private javax.swing.JButton btnLineup;
    private javax.swing.JButton btnParameters;
    private javax.swing.JButton btnPosition;
    private javax.swing.JButton btnUserType;
    private javax.swing.JButton btnWorkerType;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}