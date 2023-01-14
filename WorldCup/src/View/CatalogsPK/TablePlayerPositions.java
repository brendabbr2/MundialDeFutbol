/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.CatalogsPK;
import B_Layer.PlayerPositionBO;
import Entities.PlayerPosition;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author jox
 */
public class TablePlayerPositions extends javax.swing.JPanel {
    private final PlayerPositionBO playerpositionBO = new PlayerPositionBO();
    private final PlayerPosition playerposition = new PlayerPosition();
    /**
     * Creates new form TablePosition
     */
    public TablePlayerPositions() {
        initComponents();
        getPlayerPosition();
    }
    
    public void getPlayerPosition(){
        tblPlayerPosition.setModel(playerpositionBO.getPlayerPositions());
        TableColumnModel tblModelColumn = tblPlayerPosition.getColumnModel();
        tblModelColumn.removeColumn(tblModelColumn.getColumn(0));
    }
    
    private Object checkTableSelection(JTable table, int column){
        Object playerposition = null;
        if(!table.getSelectionModel().isSelectionEmpty())
        {
            int row = table.getSelectedRow();
            playerposition = table.getModel().getValueAt(row, column);
            //return playerposition;
        }
        return playerposition;
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
        tblPlayerPosition = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnDeletePlayerPosition = new javax.swing.JButton();
        btnUpdatePlayerPosition = new javax.swing.JButton();
        lblNamePosition = new javax.swing.JLabel();
        txtNamePlayerPosition = new javax.swing.JTextField();
        btnInsertPlayerPosition = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(94, 4, 32));
        jPanel1.setMaximumSize(new java.awt.Dimension(834, 578));
        jPanel1.setMinimumSize(new java.awt.Dimension(834, 578));

        tblPlayerPosition.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblPlayerPosition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPlayerPositionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPlayerPosition);

        jPanel2.setBackground(new java.awt.Color(152, 12, 51));

        btnDeletePlayerPosition.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnDeletePlayerPosition.setText("DELETE");
        btnDeletePlayerPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePlayerPositionActionPerformed(evt);
            }
        });

        btnUpdatePlayerPosition.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnUpdatePlayerPosition.setText("UPDATE");
        btnUpdatePlayerPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePlayerPositionActionPerformed(evt);
            }
        });

        lblNamePosition.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblNamePosition.setForeground(new java.awt.Color(255, 255, 255));
        lblNamePosition.setText("Name");

        btnInsertPlayerPosition.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnInsertPlayerPosition.setText("INSERT");
        btnInsertPlayerPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertPlayerPositionActionPerformed(evt);
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
                        .addComponent(lblNamePosition)
                        .addGap(59, 59, 59)
                        .addComponent(txtNamePlayerPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(296, 296, 296)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdatePlayerPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeletePlayerPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInsertPlayerPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnInsertPlayerPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdatePlayerPosition, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNamePosition, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNamePlayerPosition, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnDeletePlayerPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tblPlayerPositionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPlayerPositionMouseClicked
        int selection = this.tblPlayerPosition.rowAtPoint(evt.getPoint());
        this.txtNamePlayerPosition.setText(this.tblPlayerPosition.getValueAt(selection, 0)+"");
    }//GEN-LAST:event_tblPlayerPositionMouseClicked

    private void btnDeletePlayerPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePlayerPositionActionPerformed
        if (this.checkTableSelection(tblPlayerPosition,0) != null){
            int idPlayerPosition = Integer.parseInt((String) checkTableSelection(tblPlayerPosition, 0));
            this.playerposition.setIdPlayerPosition(idPlayerPosition);
            
            System.out.println(this.playerpositionBO.deletePlayerPosition(idPlayerPosition));
            this.getPlayerPosition();
        }
        else {
            JOptionPane.showMessageDialog(null, "Register not Selected", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeletePlayerPositionActionPerformed

    private void btnUpdatePlayerPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePlayerPositionActionPerformed
        if (this.checkTableSelection(tblPlayerPosition,0) != null && !(this.txtNamePlayerPosition.getText().isEmpty())){
            int idPlayerPosition = Integer.parseInt((String) checkTableSelection(tblPlayerPosition, 0));
            this.playerposition.setIdPlayerPosition(idPlayerPosition);
            this.playerposition.setPlayerPositionName(this.txtNamePlayerPosition.getText());
            
            System.out.println(this.playerpositionBO.updatePlayerPosition(playerposition));
            this.getPlayerPosition();
        }
        else {
            JOptionPane.showMessageDialog(null, "Register not Selected", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdatePlayerPositionActionPerformed

    private void btnInsertPlayerPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertPlayerPositionActionPerformed
        if (!(this.txtNamePlayerPosition.getText().isEmpty())){

            this.playerposition.setPlayerPositionName(this.txtNamePlayerPosition.getText());
            
            System.out.println(playerpositionBO.insertPlayerPosition(playerposition));
            this.getPlayerPosition();
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid name, null value encountered");
        }
    }//GEN-LAST:event_btnInsertPlayerPositionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletePlayerPosition;
    private javax.swing.JButton btnInsertPlayerPosition;
    private javax.swing.JButton btnUpdatePlayerPosition;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNamePosition;
    private javax.swing.JTable tblPlayerPosition;
    private javax.swing.JTextField txtNamePlayerPosition;
    // End of variables declaration//GEN-END:variables
}
