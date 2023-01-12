/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.CatalogsPK;

import B_Layer.UserTypeBO;
import Entities.UserType;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author jox
 */
public class TableUserTypes extends javax.swing.JPanel {
    private final UserTypeBO usertypeBO = new UserTypeBO();
    private final UserType usertype = new UserType();
    
    
    
    public TableUserTypes() {
        initComponents();
    }
    
    public void getUserType(){
            tblUserType.setModel(usertypeBO.getUserTypes());
            TableColumnModel tblModelColumn = tblUserType.getColumnModel();
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
        tblUserType = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnDeleteUserType = new javax.swing.JButton();
        btnUpdateUserType = new javax.swing.JButton();
        lblNameUserType = new javax.swing.JLabel();
        txtNameUserType = new javax.swing.JTextField();
        btnInsertUserType = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(94, 4, 32));
        jPanel1.setMaximumSize(new java.awt.Dimension(834, 578));
        jPanel1.setMinimumSize(new java.awt.Dimension(834, 578));

        tblUserType.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblUserType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserTypeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUserType);

        jPanel2.setBackground(new java.awt.Color(152, 12, 51));

        btnDeleteUserType.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnDeleteUserType.setText("DELETE");
        btnDeleteUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserTypeActionPerformed(evt);
            }
        });

        btnUpdateUserType.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnUpdateUserType.setText("UPDATE");
        btnUpdateUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserTypeActionPerformed(evt);
            }
        });

        lblNameUserType.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblNameUserType.setForeground(new java.awt.Color(255, 255, 255));
        lblNameUserType.setText("Name");

        btnInsertUserType.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnInsertUserType.setText("INSERT");
        btnInsertUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertUserTypeActionPerformed(evt);
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
                        .addComponent(lblNameUserType)
                        .addGap(59, 59, 59)
                        .addComponent(txtNameUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(296, 296, 296)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInsertUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnInsertUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateUserType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameUserType, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNameUserType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnDeleteUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tblUserTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserTypeMouseClicked
        int selection = this.tblUserType.rowAtPoint(evt.getPoint());
        this.txtNameUserType.setText(this.tblUserType.getValueAt(selection, 0)+"");
    }//GEN-LAST:event_tblUserTypeMouseClicked

    private void btnDeleteUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserTypeActionPerformed
        if (this.checkTableSelection(tblUserType,0) != null){
            int idUserType = Integer.parseInt((String) checkTableSelection(tblUserType, 0));
            this.usertype.setIdUserType(idUserType);
            
            System.out.println(this.usertypeBO.deleteUserType(idUserType));
            this.getUserType();
        }
    }//GEN-LAST:event_btnDeleteUserTypeActionPerformed

    private void btnUpdateUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserTypeActionPerformed
        if (this.checkTableSelection(tblUserType,0) != null &&
           !(this.txtNameUserType.getText().isEmpty())){
            int idUserType = Integer.parseInt((String) checkTableSelection(tblUserType, 0));
            this.usertype.setIdUserType(idUserType);
            this.usertype.setNameUserType(this.txtNameUserType.getText());
            
            System.out.println(this.usertypeBO.updateUserType(usertype));
            this.getUserType();
        }
    }//GEN-LAST:event_btnUpdateUserTypeActionPerformed

    private void btnInsertUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertUserTypeActionPerformed
        if (!(this.txtNameUserType.getText().isEmpty())){
            this.usertype.setNameUserType(this.txtNameUserType.getText());
            
            System.out.println(usertypeBO.insertUserType(usertype));
            this.getUserType();
        }
    }//GEN-LAST:event_btnInsertUserTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteUserType;
    private javax.swing.JButton btnInsertUserType;
    private javax.swing.JButton btnUpdateUserType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNameUserType;
    private javax.swing.JTable tblUserType;
    private javax.swing.JTextField txtNameUserType;
    // End of variables declaration//GEN-END:variables
}
