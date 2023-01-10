/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.EventDataPK;

/**
 *
 * @author jox
 */
public class TableStadiums extends javax.swing.JPanel {

    /**
     * Creates new form Sta
     */
    public TableStadiums() {
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
        tblStadium = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblNameStadium = new javax.swing.JLabel();
        txtNameStadium = new javax.swing.JTextField();
        lblContinent = new javax.swing.JLabel();
        cmbContinent = new javax.swing.JComboBox<>();
        btnInsertStadium = new javax.swing.JButton();
        lblCountry = new javax.swing.JLabel();
        btnDeleteStadium = new javax.swing.JButton();
        btnUpdateStadium = new javax.swing.JButton();
        cmbCanton = new javax.swing.JComboBox<>();
        lblProvince = new javax.swing.JLabel();
        cmbProvince = new javax.swing.JComboBox<>();
        lblCanton = new javax.swing.JLabel();
        cmbCountry = new javax.swing.JComboBox<>();
        lblDistrict = new javax.swing.JLabel();
        cmbDistrict = new javax.swing.JComboBox<>();
        lblAddress = new javax.swing.JLabel();
        cmbAddress = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(94, 4, 32));
        jPanel1.setMaximumSize(new java.awt.Dimension(834, 578));
        jPanel1.setMinimumSize(new java.awt.Dimension(834, 578));

        tblStadium.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblStadium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStadiumMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStadium);

        jPanel2.setBackground(new java.awt.Color(152, 12, 51));

        lblNameStadium.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblNameStadium.setForeground(new java.awt.Color(255, 255, 255));
        lblNameStadium.setText("Name");

        txtNameStadium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameStadiumActionPerformed(evt);
            }
        });

        lblContinent.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblContinent.setForeground(new java.awt.Color(255, 255, 255));
        lblContinent.setText("Continent");

        cmbContinent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbContinent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Admin" }));
        cmbContinent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbContinentActionPerformed(evt);
            }
        });

        btnInsertStadium.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnInsertStadium.setText("INSERT");
        btnInsertStadium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertStadiumActionPerformed(evt);
            }
        });

        lblCountry.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblCountry.setForeground(new java.awt.Color(255, 255, 255));
        lblCountry.setText("Country");

        btnDeleteStadium.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnDeleteStadium.setText("DELETE");
        btnDeleteStadium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStadiumActionPerformed(evt);
            }
        });

        btnUpdateStadium.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnUpdateStadium.setText("UPDATE");
        btnUpdateStadium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStadiumActionPerformed(evt);
            }
        });

        cmbCanton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbCanton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Admin" }));
        cmbCanton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCantonActionPerformed(evt);
            }
        });

        lblProvince.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblProvince.setForeground(new java.awt.Color(255, 255, 255));
        lblProvince.setText("Province");

        cmbProvince.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbProvince.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Admin" }));
        cmbProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProvinceActionPerformed(evt);
            }
        });

        lblCanton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblCanton.setForeground(new java.awt.Color(255, 255, 255));
        lblCanton.setText("Canton");

        cmbCountry.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Admin" }));
        cmbCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCountryActionPerformed(evt);
            }
        });

        lblDistrict.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblDistrict.setForeground(new java.awt.Color(255, 255, 255));
        lblDistrict.setText("District");

        cmbDistrict.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbDistrict.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Admin" }));
        cmbDistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDistrictActionPerformed(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Address");

        cmbAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbAddress.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Admin" }));
        cmbAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAddressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDistrict)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateStadium))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNameStadium)
                        .addGap(63, 63, 63)
                        .addComponent(txtNameStadium, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteStadium))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContinent)
                            .addComponent(lblProvince))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cmbContinent, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(lblCountry))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddress)
                                    .addComponent(lblCanton))))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cmbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                .addComponent(btnInsertStadium))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbCanton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContinent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbContinent)
                    .addComponent(lblCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsertStadium, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(cmbCountry))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProvince, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbProvince)
                    .addComponent(lblCanton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCanton))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnUpdateStadium, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDistrict, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbDistrict)
                            .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbAddress))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNameStadium)
                    .addComponent(txtNameStadium, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteStadium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
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
            .addGap(0, 837, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblStadiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStadiumMouseClicked

    }//GEN-LAST:event_tblStadiumMouseClicked

    private void txtNameStadiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameStadiumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameStadiumActionPerformed

    private void cmbContinentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbContinentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbContinentActionPerformed

    private void btnInsertStadiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertStadiumActionPerformed

    }//GEN-LAST:event_btnInsertStadiumActionPerformed

    private void btnDeleteStadiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteStadiumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteStadiumActionPerformed

    private void btnUpdateStadiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStadiumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateStadiumActionPerformed

    private void cmbCantonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCantonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCantonActionPerformed

    private void cmbProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProvinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProvinceActionPerformed

    private void cmbCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCountryActionPerformed

    private void cmbDistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDistrictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDistrictActionPerformed

    private void cmbAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAddressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteStadium;
    private javax.swing.JButton btnInsertStadium;
    private javax.swing.JButton btnUpdateStadium;
    private javax.swing.JComboBox<String> cmbAddress;
    private javax.swing.JComboBox<String> cmbCanton;
    private javax.swing.JComboBox<String> cmbContinent;
    private javax.swing.JComboBox<String> cmbCountry;
    private javax.swing.JComboBox<String> cmbDistrict;
    private javax.swing.JComboBox<String> cmbProvince;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCanton;
    private javax.swing.JLabel lblContinent;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblDistrict;
    private javax.swing.JLabel lblNameStadium;
    private javax.swing.JLabel lblProvince;
    private javax.swing.JTable tblStadium;
    private javax.swing.JTextField txtNameStadium;
    // End of variables declaration//GEN-END:variables
}