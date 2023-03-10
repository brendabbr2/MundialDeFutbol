/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.EventDataPK;

import B_Layer.AddressBO;
import Entities.Address;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author jox
 */
public class TableAddresses extends javax.swing.JPanel {
    private final AddressBO addressBO = new AddressBO();
    private final Address address = new Address();
    
    /**
     * Creates new form TableAddresses
     */
    public TableAddresses() {
        initComponents();
        getAddresses();
    }

    public void getAddresses(){
            this.tblAddress.setModel(addressBO.getAddresss());
            TableColumnModel tblModelColumn = this.tblAddress.getColumnModel();
            tblModelColumn.removeColumn(tblModelColumn.getColumn(0));
    }
    
    public void SetDistrictToAddress(int id){
        address.setIdDistrict(id);
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
        tblAddress = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnDeleteAddress = new javax.swing.JButton();
        btnUpdateAddress = new javax.swing.JButton();
        lblNameAddress = new javax.swing.JLabel();
        txtNameAddress = new javax.swing.JTextField();
        btnInsertAddress = new javax.swing.JButton();
        lblAdresses = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(94, 4, 32));
        jPanel1.setMaximumSize(new java.awt.Dimension(834, 578));
        jPanel1.setMinimumSize(new java.awt.Dimension(834, 578));

        tblAddress.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAddressMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAddress);

        jPanel2.setBackground(new java.awt.Color(152, 12, 51));

        btnDeleteAddress.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnDeleteAddress.setText("DELETE");
        btnDeleteAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAddressActionPerformed(evt);
            }
        });

        btnUpdateAddress.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnUpdateAddress.setText("UPDATE");
        btnUpdateAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAddressActionPerformed(evt);
            }
        });

        lblNameAddress.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblNameAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblNameAddress.setText("Address");

        btnInsertAddress.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnInsertAddress.setText("INSERT");
        btnInsertAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertAddressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInsertAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblNameAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNameAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnInsertAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameAddress)
                    .addComponent(btnUpdateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnDeleteAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        lblAdresses.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblAdresses.setForeground(new java.awt.Color(255, 255, 255));
        lblAdresses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdresses.setText("Addresses");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdresses, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAdresses, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 849, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 576, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblAddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAddressMouseClicked
        int selection = this.tblAddress.rowAtPoint(evt.getPoint());
        String type = this.tblAddress.getValueAt(selection, 0)+"";
        
        this.txtNameAddress.setText(this.tblAddress.getValueAt(selection, 1)+"");
    }//GEN-LAST:event_tblAddressMouseClicked

    private void btnDeleteAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAddressActionPerformed

    }//GEN-LAST:event_btnDeleteAddressActionPerformed

    private void btnUpdateAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAddressActionPerformed
        if (this.checkTableSelection(tblAddress,0) != null && !(this.txtNameAddress.getText().isEmpty())){
            int idAddress = Integer.parseInt((String) checkTableSelection(tblAddress, 0));
            this.address.setIdAddress(idAddress);
            this.address.setNameAddress(this.txtNameAddress.getText());
            System.out.println(this.addressBO.updateAddress(address));
            getAddresses();
        }
        else {
            JOptionPane.showMessageDialog(null, "Register not Selected", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateAddressActionPerformed

    private void btnInsertAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertAddressActionPerformed
        if(!this.txtNameAddress.getText().isEmpty()){
            this.address.setNameAddress(this.txtNameAddress.getText());
            System.out.println(addressBO.insertAddress(address));
            getAddresses();
        }
        else {
            JOptionPane.showMessageDialog(null, "Error Address not inserted!");
        }
    }//GEN-LAST:event_btnInsertAddressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteAddress;
    private javax.swing.JButton btnInsertAddress;
    private javax.swing.JButton btnUpdateAddress;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdresses;
    private javax.swing.JLabel lblNameAddress;
    private javax.swing.JTable tblAddress;
    private javax.swing.JTextField txtNameAddress;
    // End of variables declaration//GEN-END:variables
}
