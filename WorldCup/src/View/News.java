/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

/**
 *
 * @author Datos
 */
public class News extends javax.swing.JPanel {

    /**
     * Creates new form News
     */
    public News() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        pnlNewsContent = new javax.swing.JPanel();
        pnlNewsImage = new javax.swing.JPanel();
        lblNewsImage = new javax.swing.JLabel();
        pnlAuthor = new javax.swing.JPanel();
        lblAuthor = new javax.swing.JLabel();
        pnlTitle = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        spnlNewsBody = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pnlNewsDate = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnFavorite = new javax.swing.JButton();
        btnRate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaComment1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaComment2 = new javax.swing.JTextArea();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLeaveComment = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setBackground(new java.awt.Color(94, 4, 32));
        setMaximumSize(new java.awt.Dimension(834, 578));
        setMinimumSize(new java.awt.Dimension(834, 578));

        pnlNewsContent.setBackground(new java.awt.Color(152, 12, 51));

        javax.swing.GroupLayout pnlNewsImageLayout = new javax.swing.GroupLayout(pnlNewsImage);
        pnlNewsImage.setLayout(pnlNewsImageLayout);
        pnlNewsImageLayout.setHorizontalGroup(
            pnlNewsImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNewsImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlNewsImageLayout.setVerticalGroup(
            pnlNewsImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNewsImage, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );

        lblAuthor.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblAuthor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAuthor.setText("Author:");

        javax.swing.GroupLayout pnlAuthorLayout = new javax.swing.GroupLayout(pnlAuthor);
        pnlAuthor.setLayout(pnlAuthorLayout);
        pnlAuthorLayout.setHorizontalGroup(
            pnlAuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );
        pnlAuthorLayout.setVerticalGroup(
            pnlAuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Title");

        javax.swing.GroupLayout pnlTitleLayout = new javax.swing.GroupLayout(pnlTitle);
        pnlTitle.setLayout(pnlTitleLayout);
        pnlTitleLayout.setHorizontalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlTitleLayout.setVerticalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("SAMPLE TEXT");
        jTextArea1.setEnabled(false);
        spnlNewsBody.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Date:");

        javax.swing.GroupLayout pnlNewsDateLayout = new javax.swing.GroupLayout(pnlNewsDate);
        pnlNewsDate.setLayout(pnlNewsDateLayout);
        pnlNewsDateLayout.setHorizontalGroup(
            pnlNewsDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );
        pnlNewsDateLayout.setVerticalGroup(
            pnlNewsDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        btnFavorite.setText("Favorite");
        btnFavorite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavoriteActionPerformed(evt);
            }
        });

        btnRate.setText("Rate");

        javax.swing.GroupLayout pnlNewsContentLayout = new javax.swing.GroupLayout(pnlNewsContent);
        pnlNewsContent.setLayout(pnlNewsContentLayout);
        pnlNewsContentLayout.setHorizontalGroup(
            pnlNewsContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNewsContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNewsContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlNewsContentLayout.createSequentialGroup()
                        .addComponent(btnFavorite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlNewsDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNewsContentLayout.createSequentialGroup()
                        .addGroup(pnlNewsContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnlAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlNewsImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlNewsContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnlNewsBody, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlNewsContentLayout.setVerticalGroup(
            pnlNewsContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewsContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNewsContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNewsContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnlNewsBody, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlNewsImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlNewsContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNewsDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNewsContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFavorite)
                        .addComponent(btnRate)))
                .addContainerGap())
        );

        txaComment1.setColumns(20);
        txaComment1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txaComment1.setRows(5);
        txaComment1.setText("SAMPLE TEXT");
        jScrollPane1.setViewportView(txaComment1);

        txaComment2.setColumns(20);
        txaComment2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txaComment2.setRows(5);
        txaComment2.setText("SAMPLE TEXT");
        jScrollPane2.setViewportView(txaComment2);

        btnPrevious.setText("Previous");

        btnNext.setText("Next");

        btnLeaveComment.setText("Leave a Comment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNewsContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217)
                        .addComponent(btnLeaveComment, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlNewsContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLeaveComment, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFavoriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavoriteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFavoriteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFavorite;
    private javax.swing.JButton btnLeaveComment;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnRate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblNewsImage;
    private javax.swing.JPanel pnlAuthor;
    private javax.swing.JPanel pnlNewsContent;
    private javax.swing.JPanel pnlNewsDate;
    private javax.swing.JPanel pnlNewsImage;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JScrollPane spnlNewsBody;
    private javax.swing.JTextArea txaComment1;
    private javax.swing.JTextArea txaComment2;
    // End of variables declaration//GEN-END:variables
}
