/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.EventDataPK;

/**
 *
 * @author jox
 */
public class TableWorkers extends javax.swing.JPanel {

    /**
     * Creates new form TableWorkers
     */
    public TableWorkers() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorker = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnDeleteWorker = new javax.swing.JButton();
        btnUpdateWorker = new javax.swing.JButton();
        btnInsertWorker = new javax.swing.JButton();
        lblWorkerType = new javax.swing.JLabel();
        cmbWorkerType = new javax.swing.JComboBox<>();
        lblHireDate = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(94, 4, 32));
        jPanel1.setMaximumSize(new java.awt.Dimension(834, 578));
        jPanel1.setMinimumSize(new java.awt.Dimension(834, 578));

        tblWorker.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblWorker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblWorkerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblWorker);

        jPanel2.setBackground(new java.awt.Color(152, 12, 51));

        btnDeleteWorker.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnDeleteWorker.setText("DELETE");
        btnDeleteWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteWorkerActionPerformed(evt);
            }
        });

        btnUpdateWorker.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnUpdateWorker.setText("UPDATE");
        btnUpdateWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateWorkerActionPerformed(evt);
            }
        });

        btnInsertWorker.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnInsertWorker.setText("INSERT");
        btnInsertWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertWorkerActionPerformed(evt);
            }
        });

        lblWorkerType.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblWorkerType.setForeground(new java.awt.Color(255, 255, 255));
        lblWorkerType.setText("Worker Type");

        cmbWorkerType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbWorkerType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Admin" }));
        cmbWorkerType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbWorkerTypeActionPerformed(evt);
            }
        });

        lblHireDate.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblHireDate.setForeground(new java.awt.Color(255, 255, 255));
        lblHireDate.setText("Hire Date");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWorkerType)
                    .addComponent(lblHireDate))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDeleteWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnInsertWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cmbWorkerType, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                                .addComponent(btnUpdateWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnInsertWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWorkerType)
                    .addComponent(cmbWorkerType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHireDate))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 869, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblWorkerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWorkerMouseClicked

    }//GEN-LAST:event_tblWorkerMouseClicked

    private void btnDeleteWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteWorkerActionPerformed

    }//GEN-LAST:event_btnDeleteWorkerActionPerformed

    private void btnUpdateWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateWorkerActionPerformed

    }//GEN-LAST:event_btnUpdateWorkerActionPerformed

    private void btnInsertWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertWorkerActionPerformed

    }//GEN-LAST:event_btnInsertWorkerActionPerformed

    private void cmbWorkerTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbWorkerTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbWorkerTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteWorker;
    private javax.swing.JButton btnInsertWorker;
    private javax.swing.JButton btnUpdateWorker;
    private javax.swing.JComboBox<String> cmbWorkerType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHireDate;
    private javax.swing.JLabel lblWorkerType;
    private javax.swing.JTable tblWorker;
    // End of variables declaration//GEN-END:variables
}
