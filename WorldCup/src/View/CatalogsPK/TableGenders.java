/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.CatalogsPK;

import B_Layer.GenderBO;
import Entities.Gender;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author jox
 */
public class TableGenders extends javax.swing.JPanel {
    private final GenderBO genderBO = new GenderBO();
    private final Gender gender = new Gender();
    
    public TableGenders() {
        initComponents();
        getGenders();
    }

    public void getGenders(){
            tblGender.setModel(genderBO.getGenders());
            TableColumnModel tblModelColumn = tblGender.getColumnModel();
            tblModelColumn.removeColumn(tblModelColumn.getColumn(0));
    }
    
    private Object checkTableSelection(JTable table, int column){
        Object user = null;
        if(!table.getSelectionModel().isSelectionEmpty())
        {
            int row = table.getSelectedRow();
            user = table.getModel().getValueAt(row, column);
            //return user;
        }
        return user;
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
        tblGender = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnDeleteGender = new javax.swing.JButton();
        btnUpdateGender = new javax.swing.JButton();
        lblNameGender = new javax.swing.JLabel();
        txtNameGender = new javax.swing.JTextField();
        btnInsertGender = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(94, 4, 32));
        jPanel1.setMaximumSize(new java.awt.Dimension(834, 578));
        jPanel1.setMinimumSize(new java.awt.Dimension(834, 578));

        tblGender.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblGender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGenderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGender);

        jPanel2.setBackground(new java.awt.Color(152, 12, 51));

        btnDeleteGender.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnDeleteGender.setText("DELETE");
        btnDeleteGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteGenderActionPerformed(evt);
            }
        });

        btnUpdateGender.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnUpdateGender.setText("UPDATE");
        btnUpdateGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateGenderActionPerformed(evt);
            }
        });

        lblNameGender.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblNameGender.setForeground(new java.awt.Color(255, 255, 255));
        lblNameGender.setText("Name");

        btnInsertGender.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnInsertGender.setText("INSERT");
        btnInsertGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertGenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNameGender)
                        .addGap(59, 59, 59)
                        .addComponent(txtNameGender, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(296, 296, 296)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateGender, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteGender, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInsertGender, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnInsertGender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameGender, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNameGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnDeleteGender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE))
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
            .addGap(0, 834, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblGenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGenderMouseClicked
        int selection = this.tblGender.rowAtPoint(evt.getPoint());
        this.txtNameGender.setText(this.tblGender.getValueAt(selection, 1)+"");
    }//GEN-LAST:event_tblGenderMouseClicked

    private void btnDeleteGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteGenderActionPerformed
        if (this.checkTableSelection(tblGender,0) != null){
            int idGender = Integer.parseInt((String) checkTableSelection(tblGender, 0));
            this.gender.setIdGender(idGender);
            
            System.out.println(this.genderBO.deleteGender(idGender));
            this.getGenders();
        }
    }//GEN-LAST:event_btnDeleteGenderActionPerformed

    private void btnUpdateGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateGenderActionPerformed
        if (this.checkTableSelection(tblGender,0) != null && !(this.txtNameGender.getText().isEmpty())){
            int idGender = Integer.parseInt((String) checkTableSelection(tblGender, 0));
            this.gender.setIdGender(idGender);
            
            this.gender.setGenderDescription(this.txtNameGender.getText());
            
            System.out.println(this.genderBO.updateGender(gender));
            this.getGenders();
        }
    }//GEN-LAST:event_btnUpdateGenderActionPerformed

    private void btnInsertGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertGenderActionPerformed
        if (!(this.txtNameGender.getText().isEmpty())){
            this.gender.setGenderDescription(this.txtNameGender.getText());
            System.out.println(genderBO.insertGender(gender));
            this.getGenders();
        }
    }//GEN-LAST:event_btnInsertGenderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteGender;
    private javax.swing.JButton btnInsertGender;
    private javax.swing.JButton btnUpdateGender;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNameGender;
    private javax.swing.JTable tblGender;
    private javax.swing.JTextField txtNameGender;
    // End of variables declaration//GEN-END:variables
}
