/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.CatalogsPK;

import B_Layer.DemonymBO;
import Entities.Demonym;
import Entities.User;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author jox
 */
public class TableDemonyms extends javax.swing.JPanel {
    
    private final DemonymBO demoBO = new DemonymBO();
    private final Demonym demo = new Demonym();
    /**
     * Creates new form TableDemonyms
     */
    public TableDemonyms() {
        initComponents();
        getDemonym();
    }

    public void getDemonym(){
        tblEventDemonym.setModel(demoBO.getTable());
        TableColumnModel tblModelColumn = tblEventDemonym.getColumnModel();
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
        tblEventDemonym = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnDeleteDemonym = new javax.swing.JButton();
        btnUpdateDemonym = new javax.swing.JButton();
        lblNameDemonym = new javax.swing.JLabel();
        txtNameDemonym = new javax.swing.JTextField();
        btnInsertDemonym = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(94, 4, 32));
        jPanel1.setMaximumSize(new java.awt.Dimension(834, 578));
        jPanel1.setMinimumSize(new java.awt.Dimension(834, 578));

        tblEventDemonym.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblEventDemonym.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEventDemonymMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEventDemonym);

        jPanel2.setBackground(new java.awt.Color(152, 12, 51));

        btnDeleteDemonym.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnDeleteDemonym.setText("DELETE");
        btnDeleteDemonym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDemonymActionPerformed(evt);
            }
        });

        btnUpdateDemonym.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnUpdateDemonym.setText("UPDATE");
        btnUpdateDemonym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDemonymActionPerformed(evt);
            }
        });

        lblNameDemonym.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblNameDemonym.setForeground(new java.awt.Color(255, 255, 255));
        lblNameDemonym.setText("Name");

        btnInsertDemonym.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnInsertDemonym.setText("INSERT");
        btnInsertDemonym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertDemonymActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblNameDemonym)
                .addGap(27, 27, 27)
                .addComponent(txtNameDemonym, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateDemonym, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteDemonym, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInsertDemonym, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnInsertDemonym, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateDemonym, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNameDemonym, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNameDemonym)))
                .addGap(36, 36, 36)
                .addComponent(btnDeleteDemonym, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGap(0, 836, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblEventDemonymMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEventDemonymMouseClicked

    }//GEN-LAST:event_tblEventDemonymMouseClicked

    private void btnDeleteDemonymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDemonymActionPerformed
        if(this.checkTableSelection(tblEventDemonym, 0) != null){
            int idDemonym = Integer.parseInt((String) checkTableSelection(tblEventDemonym, 0));
            this.demo.setIdDemonym(idDemonym);
            System.out.println(this.demoBO.deleteDemonym(demo.getIdDemonym()));
            this.getDemonym();
        }
        else {
            JOptionPane.showMessageDialog(null, "Register not Selected", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteDemonymActionPerformed

    private void btnUpdateDemonymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDemonymActionPerformed
        if(this.checkTableSelection(tblEventDemonym,0) != null && 
                !(this.txtNameDemonym.getText().isEmpty())){
            int idDemonym = Integer.parseInt((String) checkTableSelection(tblEventDemonym, 0));
            this.demo.setIdDemonym(idDemonym);
            this.demo.setNameDemonym(this.txtNameDemonym.getText());
            System.out.println(demoBO.updateDemonym(demo));
            this.getDemonym();
        }
        else {
            JOptionPane.showMessageDialog(null, "Register not Selected", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateDemonymActionPerformed

    private void btnInsertDemonymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertDemonymActionPerformed
        if(!(this.txtNameDemonym.getText().isEmpty())){
            this.demo.setNameDemonym(this.txtNameDemonym.getText());
            System.out.println(demoBO.insertDemonym(demo));
            this.getDemonym();
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid name, null value encountered");
        }
    }//GEN-LAST:event_btnInsertDemonymActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteDemonym;
    private javax.swing.JButton btnInsertDemonym;
    private javax.swing.JButton btnUpdateDemonym;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNameDemonym;
    private javax.swing.JTable tblEventDemonym;
    private javax.swing.JTextField txtNameDemonym;
    // End of variables declaration//GEN-END:variables
}
