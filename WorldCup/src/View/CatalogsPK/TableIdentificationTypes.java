/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.CatalogsPK;


import B_Layer.IdentificationTypeBO;
import Entities.IdentificationType;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author jox
 */
public class TableIdentificationTypes extends javax.swing.JPanel {
    
    private final IdentificationTypeBO idTypeBO = new IdentificationTypeBO();
    private final IdentificationType idType = new IdentificationType();
    /**
     * Creates new form IdentificationType
     */
    public TableIdentificationTypes() {
        initComponents();
    }
    
    public void getIdentificationType(){
        tblIdentificationType.setModel(idTypeBO.getIdentificationType());
        TableColumnModel tblModelColumn = tblIdentificationType.getColumnModel();
        tblModelColumn.removeColumn(tblModelColumn.getColumn(0));
    }
    
    private Object checkTableSelection(JTable table, int column){
        Object selection = null;
        if(!table.getSelectionModel().isSelectionEmpty())
        {
            int row = table.getSelectedRow();
            selection = table.getModel().getValueAt(row, column);
        }
        return selection;
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
        tblIdentificationType = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnDeleteIdentificationType = new javax.swing.JButton();
        btnUpdateIdentificationType = new javax.swing.JButton();
        lblNameIdentificationType = new javax.swing.JLabel();
        txtNameIdentificationType = new javax.swing.JTextField();
        btnInsertIdentificationType = new javax.swing.JButton();
        lblMaskIdentificationType = new javax.swing.JLabel();
        txtMaskIdentificationType = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(94, 4, 32));
        jPanel1.setMaximumSize(new java.awt.Dimension(834, 578));
        jPanel1.setMinimumSize(new java.awt.Dimension(834, 578));

        tblIdentificationType.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblIdentificationType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIdentificationTypeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblIdentificationType);

        jPanel2.setBackground(new java.awt.Color(152, 12, 51));

        btnDeleteIdentificationType.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnDeleteIdentificationType.setText("DELETE");
        btnDeleteIdentificationType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteIdentificationTypeActionPerformed(evt);
            }
        });

        btnUpdateIdentificationType.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnUpdateIdentificationType.setText("UPDATE");
        btnUpdateIdentificationType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateIdentificationTypeActionPerformed(evt);
            }
        });

        lblNameIdentificationType.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblNameIdentificationType.setForeground(new java.awt.Color(255, 255, 255));
        lblNameIdentificationType.setText("Name");

        btnInsertIdentificationType.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnInsertIdentificationType.setText("INSERT");
        btnInsertIdentificationType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertIdentificationTypeActionPerformed(evt);
            }
        });

        lblMaskIdentificationType.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblMaskIdentificationType.setForeground(new java.awt.Color(255, 255, 255));
        lblMaskIdentificationType.setText("Mask");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblNameIdentificationType)
                                .addGap(59, 59, 59)
                                .addComponent(txtNameIdentificationType, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblMaskIdentificationType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMaskIdentificationType, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(296, 296, 296)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateIdentificationType, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteIdentificationType, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInsertIdentificationType, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnInsertIdentificationType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateIdentificationType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNameIdentificationType)
                        .addComponent(txtNameIdentificationType, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteIdentificationType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaskIdentificationType)
                    .addComponent(txtMaskIdentificationType, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
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

    private void tblIdentificationTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIdentificationTypeMouseClicked

    }//GEN-LAST:event_tblIdentificationTypeMouseClicked

    private void btnDeleteIdentificationTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteIdentificationTypeActionPerformed
        if(this.checkTableSelection(tblIdentificationType, 0) != null){
            int IdentificationTypeID = Integer.parseInt((String) checkTableSelection(tblIdentificationType, 0));
            this.idType.setIdIdentificationType(IdentificationTypeID);
            System.out.println(this.idTypeBO.deleteIdentificationType(idType.getIdIdentificationType()));
            this.getIdentificationType();
        }
        else {
            JOptionPane.showMessageDialog(null, "Register not Selected", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteIdentificationTypeActionPerformed

    private void btnUpdateIdentificationTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateIdentificationTypeActionPerformed
        if(this.checkTableSelection(tblIdentificationType, 0) != null &&
                !(this.txtMaskIdentificationType.getText().isEmpty()) && 
                !(this.txtNameIdentificationType.getText().isEmpty())){
            int IdentificationTypeID = Integer.parseInt((String) checkTableSelection(tblIdentificationType, 0));
            this.idType.setIdIdentificationType(IdentificationTypeID);
            this.idType.setIdName(this.txtNameIdentificationType.getText());
            this.idType.setIdMask(Integer.parseInt(this.txtMaskIdentificationType.getText()));
            System.out.println(this.idTypeBO.updateIdentificationType(idType));
            this.getIdentificationType();
        }
        else {
            JOptionPane.showMessageDialog(null, "Register not Selected", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateIdentificationTypeActionPerformed

    private void btnInsertIdentificationTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertIdentificationTypeActionPerformed
        if(!(this.txtMaskIdentificationType.getText().isEmpty()) && 
                !(this.txtNameIdentificationType.getText().isEmpty()) ){
            this.idType.setIdName(this.txtNameIdentificationType.getText());
            this.idType.setIdMask(Integer.parseInt(this.txtMaskIdentificationType.getText()));
            System.out.println(idTypeBO.insertIdentificationType(idType));
            this.getIdentificationType();
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid name or mask, null value encountered");
        }
    }//GEN-LAST:event_btnInsertIdentificationTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteIdentificationType;
    private javax.swing.JButton btnInsertIdentificationType;
    private javax.swing.JButton btnUpdateIdentificationType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMaskIdentificationType;
    private javax.swing.JLabel lblNameIdentificationType;
    private javax.swing.JTable tblIdentificationType;
    private javax.swing.JTextField txtMaskIdentificationType;
    private javax.swing.JTextField txtNameIdentificationType;
    // End of variables declaration//GEN-END:variables
}
