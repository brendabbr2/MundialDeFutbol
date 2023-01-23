/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.EventDataPK;

import B_Layer.CantonBO;
import Entities.Canton;
import java.awt.BorderLayout;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author jox
 */
public class TableCantons extends javax.swing.JPanel {
    private JPanel pnlContent;
    private final CantonBO cantonBO = new CantonBO();
    private final Canton canton = new Canton();
    private TableDistricts district ;
    /**
     * Creates new form TableCantons
     */
    public TableCantons(JPanel pnlContent) {
        this.pnlContent = pnlContent;
        this.district = new TableDistricts(pnlContent);
        initComponents();
        getCantons();
    }
    
    public void SetProvinceToCanton(int idProvince){
        canton.setIdProvince(idProvince);
    }
    
    public void getCantons(){
            this.tblCanton.setModel(cantonBO.getCantons());
            TableColumnModel tblModelColumn = this.tblCanton.getColumnModel();
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
        tblCanton = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnManageDistricts = new javax.swing.JButton();
        btnUpdateCanton = new javax.swing.JButton();
        lblNameCanton = new javax.swing.JLabel();
        txtNameCanton = new javax.swing.JTextField();
        btnInsertCanton = new javax.swing.JButton();
        lblCantons = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(94, 4, 32));
        jPanel1.setMaximumSize(new java.awt.Dimension(834, 578));
        jPanel1.setMinimumSize(new java.awt.Dimension(834, 578));

        tblCanton.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblCanton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCantonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCanton);

        jPanel2.setBackground(new java.awt.Color(152, 12, 51));

        btnManageDistricts.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnManageDistricts.setText("Manage Districts");
        btnManageDistricts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDistrictsActionPerformed(evt);
            }
        });

        btnUpdateCanton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnUpdateCanton.setText("UPDATE");
        btnUpdateCanton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCantonActionPerformed(evt);
            }
        });

        lblNameCanton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblNameCanton.setForeground(new java.awt.Color(255, 255, 255));
        lblNameCanton.setText("Name");

        btnInsertCanton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnInsertCanton.setText("INSERT");
        btnInsertCanton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertCantonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInsertCanton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNameCanton)
                .addGap(59, 59, 59)
                .addComponent(txtNameCanton, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(btnUpdateCanton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(btnManageDistricts)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnInsertCanton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateCanton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameCanton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNameCanton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnManageDistricts, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        lblCantons.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCantons.setForeground(new java.awt.Color(255, 255, 255));
        lblCantons.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantons.setText("Cantons");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCantons, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCantons, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 846, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 576, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblCantonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCantonMouseClicked
        int selection = this.tblCanton.rowAtPoint(evt.getPoint());
        String type = this.tblCanton.getValueAt(selection, 0)+"";
        
        this.txtNameCanton.setText(this.tblCanton.getValueAt(selection, 1)+"");
    }//GEN-LAST:event_tblCantonMouseClicked

    private void btnManageDistrictsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDistrictsActionPerformed
        if(this.checkTableSelection(tblCanton, WIDTH) != null ){
            int idCanton = Integer.parseInt((String) checkTableSelection(tblCanton, 0));
            this.district.SetCantonToDistrict(idCanton);
            this.district.setSize(834, 567);
            this.district.setLocation(0,0);
            pnlContent.removeAll();
            pnlContent.add(this.district,BorderLayout.CENTER);
            pnlContent.revalidate();
            pnlContent.repaint();
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Canton");
        }
    }//GEN-LAST:event_btnManageDistrictsActionPerformed

    private void btnUpdateCantonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCantonActionPerformed
        if (this.checkTableSelection(tblCanton,0) != null && !(this.txtNameCanton.getText().isEmpty())){
            int idCanton = Integer.parseInt((String) checkTableSelection(tblCanton, 0));
            this.canton.setIdCanton(idCanton);
            this.canton.setNameCanton(this.txtNameCanton.getText());
            getCantons();
            
            System.out.println(this.cantonBO.updateCanton(canton));
            getCantons();
        }
        else {
            JOptionPane.showMessageDialog(null, "Register not Selected", null, JOptionPane.ERROR_MESSAGE);
        }
       
        
    }//GEN-LAST:event_btnUpdateCantonActionPerformed

    private void btnInsertCantonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertCantonActionPerformed
        if(!this.txtNameCanton.getText().isEmpty()){
            this.canton.setNameCanton(this.txtNameCanton.getText());
            System.out.println(cantonBO.insertCanton(canton));
            getCantons();
        }
        else {
            JOptionPane.showMessageDialog(null, "Error Country not inserted!");
        }
    }//GEN-LAST:event_btnInsertCantonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertCanton;
    private javax.swing.JButton btnManageDistricts;
    private javax.swing.JButton btnUpdateCanton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantons;
    private javax.swing.JLabel lblNameCanton;
    private javax.swing.JTable tblCanton;
    private javax.swing.JTextField txtNameCanton;
    // End of variables declaration//GEN-END:variables
}
