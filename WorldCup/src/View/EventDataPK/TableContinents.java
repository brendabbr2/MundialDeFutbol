/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.EventDataPK;

import B_Layer.ContinentBO;
import Entities.Continent;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author jox
 */
public class TableContinents extends javax.swing.JPanel {
    private final ContinentBO continentBO = new ContinentBO();
    private final Continent continent = new Continent();
    private TableCountries countries;
    private JPanel pnlContent;
    /**
     * Creates new form TableContinents
     */
    public TableContinents(JPanel pnlContent) {
        initComponents();
        this.pnlContent = pnlContent;
        countries = new TableCountries(pnlContent);
        getContinents();
    }
    
    public void getContinents(){
            this.tblContinents.setModel(continentBO.getTable());
            TableColumnModel tblModelColumn = tblContinents.getColumnModel();
            tblModelColumn.removeColumn(tblModelColumn.getColumn(0));
            
            Object XXX = continentBO.getTable().getDataVector().isEmpty();
            System.out.println(XXX);
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
        tblContinents = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnDeleteContinents = new javax.swing.JButton();
        btnUpdateContinents = new javax.swing.JButton();
        lblNameContinents = new javax.swing.JLabel();
        txtNameContinents = new javax.swing.JTextField();
        btnInsertContinents = new javax.swing.JButton();
        btnManageCountries = new javax.swing.JButton();
        lblContinent = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(94, 4, 32));
        jPanel1.setMaximumSize(new java.awt.Dimension(834, 578));
        jPanel1.setMinimumSize(new java.awt.Dimension(834, 578));

        tblContinents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblContinents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblContinentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblContinents);

        jPanel2.setBackground(new java.awt.Color(152, 12, 51));

        btnDeleteContinents.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnDeleteContinents.setText("DELETE");
        btnDeleteContinents.setEnabled(false);
        btnDeleteContinents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteContinentsActionPerformed(evt);
            }
        });

        btnUpdateContinents.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnUpdateContinents.setText("UPDATE");
        btnUpdateContinents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateContinentsActionPerformed(evt);
            }
        });

        lblNameContinents.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblNameContinents.setForeground(new java.awt.Color(255, 255, 255));
        lblNameContinents.setText("Name");

        btnInsertContinents.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnInsertContinents.setText("INSERT");
        btnInsertContinents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertContinentsActionPerformed(evt);
            }
        });

        btnManageCountries.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnManageCountries.setText("Manage Countries");
        btnManageCountries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCountriesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblNameContinents)
                        .addGap(18, 18, 18)
                        .addComponent(txtNameContinents, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(296, 296, 296))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnManageCountries)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateContinents, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteContinents, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInsertContinents, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnInsertContinents, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateContinents, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNameContinents, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNameContinents)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteContinents, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageCountries, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        lblContinent.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblContinent.setForeground(new java.awt.Color(255, 255, 255));
        lblContinent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContinent.setText("Continents");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContinent, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblContinent, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblContinentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContinentsMouseClicked
        int selection = this.tblContinents.rowAtPoint(evt.getPoint());
        String type = this.tblContinents.getValueAt(selection, 0)+"";
        
        this.txtNameContinents.setText(this.tblContinents.getValueAt(selection, 0)+"");
    }//GEN-LAST:event_tblContinentsMouseClicked

    private void btnDeleteContinentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteContinentsActionPerformed

    }//GEN-LAST:event_btnDeleteContinentsActionPerformed

    private void btnUpdateContinentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateContinentsActionPerformed
        if (this.checkTableSelection(tblContinents,0) != null && !(this.txtNameContinents.getText().isEmpty())){
            int idContinent = Integer.parseInt((String) checkTableSelection(tblContinents, 0));
            this.continent.setIdContinent(idContinent);
            
            this.continent.setNameContinent(this.txtNameContinents.getText());
            
            System.out.println(this.continentBO.updateContinent(continent));
            this.getContinents();
        }
        else {
            JOptionPane.showMessageDialog(null, "Register not Selected", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateContinentsActionPerformed

    private void btnInsertContinentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertContinentsActionPerformed
        if(!this.txtNameContinents.getText().isEmpty()){
            this.continent.setNameContinent(this.txtNameContinents.getText());
            System.out.println(continentBO.insertContinent(continent));
            this.getContinents();
        }
        else {
            JOptionPane.showMessageDialog(null, "Error continent not inserted!");
        }
    }//GEN-LAST:event_btnInsertContinentsActionPerformed

    private void btnManageCountriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCountriesActionPerformed
        if(this.checkTableSelection(tblContinents, WIDTH) != null ){
            int idContinent = Integer.parseInt((String) checkTableSelection(tblContinents, 0));
            this.countries.SetContinentToCountry(idContinent);
            this.countries.setSize(834, 567);
            this.countries.setLocation(0,0);
            pnlContent.removeAll();
            pnlContent.add(this.countries,BorderLayout.CENTER);
            pnlContent.revalidate();
            pnlContent.repaint();
            
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Continent");
        }
    }//GEN-LAST:event_btnManageCountriesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteContinents;
    private javax.swing.JButton btnInsertContinents;
    private javax.swing.JButton btnManageCountries;
    private javax.swing.JButton btnUpdateContinents;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblContinent;
    private javax.swing.JLabel lblNameContinents;
    private javax.swing.JTable tblContinents;
    private javax.swing.JTextField txtNameContinents;
    // End of variables declaration//GEN-END:variables
}
