/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

/**
 *
 * @author Datos
 */
public class News_Panel extends javax.swing.JPanel {

    /**
     * Creates new form News
     */
    public News_Panel() {
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
        pnlNewsTab = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblNewsPhot2 = new javax.swing.JLabel();
        pnlNewsTab1 = new javax.swing.JPanel();
        pnlNewsImg1 = new javax.swing.JPanel();
        lblNoticiaImagen1 = new javax.swing.JLabel();
        btnReadNews1 = new javax.swing.JToggleButton();
        btnReaddNews2 = new javax.swing.JToggleButton();
        btnPrevious = new javax.swing.JToggleButton();
        btnNext = new javax.swing.JToggleButton();
        lblNewsTitle = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(94, 4, 32));
        setMaximumSize(new java.awt.Dimension(834, 578));
        setMinimumSize(new java.awt.Dimension(834, 578));
        setPreferredSize(new java.awt.Dimension(834, 578));

        pnlNewsTab.setBackground(new java.awt.Color(152, 12, 51));
        pnlNewsTab.setMaximumSize(new java.awt.Dimension(740, 180));
        pnlNewsTab.setMinimumSize(new java.awt.Dimension(740, 180));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        lblNewsPhot2.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNewsPhot2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNewsPhot2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlNewsTabLayout = new javax.swing.GroupLayout(pnlNewsTab);
        pnlNewsTab.setLayout(pnlNewsTabLayout);
        pnlNewsTabLayout.setHorizontalGroup(
            pnlNewsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(569, Short.MAX_VALUE))
        );
        pnlNewsTabLayout.setVerticalGroup(
            pnlNewsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNewsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlNewsTab1.setBackground(new java.awt.Color(152, 12, 51));
        pnlNewsTab1.setPreferredSize(new java.awt.Dimension(740, 180));

        pnlNewsImg1.setBackground(new java.awt.Color(0, 255, 255));

        lblNoticiaImagen1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlNewsImg1Layout = new javax.swing.GroupLayout(pnlNewsImg1);
        pnlNewsImg1.setLayout(pnlNewsImg1Layout);
        pnlNewsImg1Layout.setHorizontalGroup(
            pnlNewsImg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNoticiaImagen1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
        );
        pnlNewsImg1Layout.setVerticalGroup(
            pnlNewsImg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNoticiaImagen1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlNewsTab1Layout = new javax.swing.GroupLayout(pnlNewsTab1);
        pnlNewsTab1.setLayout(pnlNewsTab1Layout);
        pnlNewsTab1Layout.setHorizontalGroup(
            pnlNewsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewsTab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlNewsImg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(567, Short.MAX_VALUE))
        );
        pnlNewsTab1Layout.setVerticalGroup(
            pnlNewsTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNewsTab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlNewsImg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnReadNews1.setText("Read Article");
        btnReadNews1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadNews1ActionPerformed(evt);
            }
        });

        btnReaddNews2.setText("Read Article");
        btnReaddNews2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReaddNews2ActionPerformed(evt);
            }
        });

        btnPrevious.setText("Previous");

        btnNext.setText("Next");

        lblNewsTitle.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblNewsTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblNewsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewsTitle.setText("News");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblNewsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                    .addComponent(btnReaddNews2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPrevious)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnReadNews1)
                    .addComponent(pnlNewsTab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlNewsTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblNewsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(pnlNewsTab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReadNews1)
                .addGap(18, 18, 18)
                .addComponent(pnlNewsTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReaddNews2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReadNews1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadNews1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReadNews1ActionPerformed

    private void btnReaddNews2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReaddNews2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReaddNews2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnNext;
    private javax.swing.JToggleButton btnPrevious;
    private javax.swing.JToggleButton btnReadNews1;
    private javax.swing.JToggleButton btnReaddNews2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNewsPhot2;
    private javax.swing.JLabel lblNewsTitle;
    private javax.swing.JLabel lblNoticiaImagen1;
    private javax.swing.JPanel pnlNewsImg1;
    private javax.swing.JPanel pnlNewsTab;
    private javax.swing.JPanel pnlNewsTab1;
    // End of variables declaration//GEN-END:variables
}
