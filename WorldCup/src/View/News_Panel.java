/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import B_Layer.NewsBO;
import B_Layer.UserSaveBO;
import Entities.UserSave;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Datos
 */
public class News_Panel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    private News_Text newsText;

    private final NewsBO newsBO = new NewsBO();
    private final News news = new News();
    private final UserSaveBO userSaveBO = new UserSaveBO();
    private final UserSave userSave = new UserSave();

    private int pagForRecent = 0;
    private int pagForMostVoted = 0;
    private int idSelectedForMostVoted = 0;

    //ATRIBUTES FOR IMAGES
    private String path;

    //Images for photo of news
    private ImageIcon imgIconRecentNews;
    private Icon iconRecentNews;
    private ImageIcon imgIconMostVotedNews;
    private Icon iconMostVotedNews;

    //Images for the button of like
    private ImageIcon imgEmptyHeart;
    private Icon iconEmptyHeart;
    private ImageIcon imgFilledHeart;
    private Icon iconFilledHeart;
    
    private ArrayList<Icon> arrayListOfLikesInIcon;

    /**
     * Creates new form News
     *
     * @param mainFrame
     */
    public News_Panel(MainFrame mainFrame) {
        initComponents();
        initButtonsIcon();
        this.mainFrame = mainFrame;
        this.newsText = new News_Text(mainFrame);
        getRecentNews();
    }

    private void initButtonsIcon() {
        imgEmptyHeart = new ImageIcon("Images/iconForNews/corazonVacio.jfif");
        iconEmptyHeart = new ImageIcon(imgEmptyHeart.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        imgFilledHeart = new ImageIcon("Images/iconForNews/corazonLleno.jfif");
        iconFilledHeart = new ImageIcon(imgFilledHeart.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        
        arrayListOfLikesInIcon = new <Icon>ArrayList();
        btnLikeRecent.setIcon(iconEmptyHeart);
    }
    
    public void resetLikeIcon(){
        btnLikeRecent.setIcon(iconEmptyHeart);
    }

    private void getRecentNews() {
        if (!newsBO.getNews().getDataVector().isEmpty()) {
            this.lblRecentTitle.setText("Title: " + (String) newsBO.getNews().getDataVector().elementAt(pagForRecent).elementAt(3));
            this.lblRecentAuthor.setText("Author: " + (String) newsBO.getNews().getDataVector().elementAt(pagForRecent).elementAt(5));
            this.lblRecentDate.setText("Date: " + (String) newsBO.getNews().getDataVector().elementAt(pagForRecent).elementAt(6));
            getIconRecentNews();
            logicForMostVoted();
        }
    }

    private void getIconRecentNews() {
        try {
            path = (String) newsBO.getNews().getDataVector().elementAt(pagForRecent).elementAt(7);
            imgIconRecentNews = new ImageIcon(path);
            iconRecentNews = new ImageIcon(imgIconRecentNews.getImage().getScaledInstance(150, 165, Image.SCALE_DEFAULT));
            lblRecentNewsImage.setIcon(iconRecentNews);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void logicForMostVoted() {
        boolean flag = false;
        if (!userSaveBO.getUserSaveMostVoted().getDataVector().isEmpty()) {
            System.out.println("id: " + userSaveBO.getUserSaveMostVoted().getDataVector().elementAt(pagForMostVoted).elementAt(0));
            System.out.println("apariciones: " + userSaveBO.getUserSaveMostVoted().getDataVector().elementAt(pagForMostVoted).elementAt(1));
            for (int i = 0; i < userSaveBO.getUserSaveMostVoted().getDataVector().size(); i++) {
                if (newsBO.getNews().getDataVector().elementAt(i).elementAt(0)
                        .equals(userSaveBO.getUserSaveMostVoted().getDataVector()
                                .elementAt(pagForMostVoted).elementAt(0))) {
                    flag = true;
                    idSelectedForMostVoted = i;
                    break;
                }
            }
            System.out.println("Salimos del for jeje");
            if (flag) {
                System.out.println("VAMOS POR LOS MAS VOTADOS");
                getMostVotedNews();
            }
        }
    }

    private void getMostVotedNews() {
        if (!newsBO.getNews().getDataVector().isEmpty()) {
            this.lblMostVotedTitle.setText("Title: " + (String) newsBO.getNews().getDataVector().elementAt(idSelectedForMostVoted).elementAt(3));
            this.lblMostVotedAuthor.setText("Author: " + (String) newsBO.getNews().getDataVector().elementAt(idSelectedForMostVoted).elementAt(5));
            this.lblMostVotedDate.setText("Date: " + (String) newsBO.getNews().getDataVector().elementAt(idSelectedForMostVoted).elementAt(6));
            getIconMostVotedNews();
        }
    }

    private void getIconMostVotedNews() {
        try {
            path = (String) newsBO.getNews().getDataVector().elementAt(idSelectedForMostVoted).elementAt(7);
            imgIconMostVotedNews = new ImageIcon(path);
            iconMostVotedNews = new ImageIcon(imgIconMostVotedNews.getImage().getScaledInstance(150, 165, Image.SCALE_DEFAULT));
            lblMostVotedImage.setIcon(iconMostVotedNews);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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
        pnlScrollDashboard = new javax.swing.JPanel();
        pnlRecentNews = new javax.swing.JPanel();
        pnlRecentNewsHead = new javax.swing.JPanel();
        lblRecentNews = new javax.swing.JLabel();
        pnlRecentNewsImage = new javax.swing.JPanel();
        lblRecentNewsImage = new javax.swing.JLabel();
        pnlRecentTitle = new javax.swing.JPanel();
        lblRecentTitle = new javax.swing.JLabel();
        pnlRecentAuthor = new javax.swing.JPanel();
        lblRecentAuthor = new javax.swing.JLabel();
        pnlRecentDate = new javax.swing.JPanel();
        lblRecentDate = new javax.swing.JLabel();
        btnRecentPrevious = new javax.swing.JButton();
        btnRecentNext = new javax.swing.JButton();
        btnRecentRead = new javax.swing.JButton();
        btnLikeRecent = new javax.swing.JButton();
        btnCommentRecent = new javax.swing.JButton();
        pnlTodaysMatches = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnlFlagTeamA = new javax.swing.JPanel();
        lblFlagTeamA = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        pnlFlagTeamB = new javax.swing.JPanel();
        lblFlagTeamB = new javax.swing.JLabel();
        lblVS = new javax.swing.JLabel();
        lblMatchDate = new javax.swing.JLabel();
        lblMatchDate1 = new javax.swing.JLabel();
        pnlMostVoted = new javax.swing.JPanel();
        pnlMostVotedHead = new javax.swing.JPanel();
        lblMostVoted = new javax.swing.JLabel();
        pnlMostVotedImage = new javax.swing.JPanel();
        lblMostVotedImage = new javax.swing.JLabel();
        pnlMostVotedTitle = new javax.swing.JPanel();
        lblMostVotedTitle = new javax.swing.JLabel();
        pnlMostVotedAuthor = new javax.swing.JPanel();
        lblMostVotedAuthor = new javax.swing.JLabel();
        pnlMostVotedDate = new javax.swing.JPanel();
        lblMostVotedDate = new javax.swing.JLabel();
        btnMostVotedPrevious = new javax.swing.JButton();
        btnMostVotedNext = new javax.swing.JButton();
        btnReadArticle = new javax.swing.JButton();
        btnCommentMostVoted = new javax.swing.JButton();

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

        jScrollPane1.setMaximumSize(new java.awt.Dimension(834, 578));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(834, 578));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(834, 578));

        pnlScrollDashboard.setBackground(new java.awt.Color(152, 12, 51));

        pnlRecentNews.setBackground(new java.awt.Color(255, 255, 255));

        pnlRecentNewsHead.setBackground(new java.awt.Color(255, 255, 255));

        lblRecentNews.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblRecentNews.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecentNews.setText("Recent News");

        javax.swing.GroupLayout pnlRecentNewsHeadLayout = new javax.swing.GroupLayout(pnlRecentNewsHead);
        pnlRecentNewsHead.setLayout(pnlRecentNewsHeadLayout);
        pnlRecentNewsHeadLayout.setHorizontalGroup(
            pnlRecentNewsHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRecentNews, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlRecentNewsHeadLayout.setVerticalGroup(
            pnlRecentNewsHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRecentNews, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        pnlRecentNewsImage.setMaximumSize(new java.awt.Dimension(150, 150));
        pnlRecentNewsImage.setMinimumSize(new java.awt.Dimension(150, 150));
        pnlRecentNewsImage.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout pnlRecentNewsImageLayout = new javax.swing.GroupLayout(pnlRecentNewsImage);
        pnlRecentNewsImage.setLayout(pnlRecentNewsImageLayout);
        pnlRecentNewsImageLayout.setHorizontalGroup(
            pnlRecentNewsImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRecentNewsImage, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        pnlRecentNewsImageLayout.setVerticalGroup(
            pnlRecentNewsImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRecentNewsImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblRecentTitle.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblRecentTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecentTitle.setText("Title");

        javax.swing.GroupLayout pnlRecentTitleLayout = new javax.swing.GroupLayout(pnlRecentTitle);
        pnlRecentTitle.setLayout(pnlRecentTitleLayout);
        pnlRecentTitleLayout.setHorizontalGroup(
            pnlRecentTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRecentTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlRecentTitleLayout.setVerticalGroup(
            pnlRecentTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRecentTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        lblRecentAuthor.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblRecentAuthor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecentAuthor.setText("Author:");

        javax.swing.GroupLayout pnlRecentAuthorLayout = new javax.swing.GroupLayout(pnlRecentAuthor);
        pnlRecentAuthor.setLayout(pnlRecentAuthorLayout);
        pnlRecentAuthorLayout.setHorizontalGroup(
            pnlRecentAuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRecentAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlRecentAuthorLayout.setVerticalGroup(
            pnlRecentAuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRecentAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        lblRecentDate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblRecentDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecentDate.setText("Date:");

        javax.swing.GroupLayout pnlRecentDateLayout = new javax.swing.GroupLayout(pnlRecentDate);
        pnlRecentDate.setLayout(pnlRecentDateLayout);
        pnlRecentDateLayout.setHorizontalGroup(
            pnlRecentDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRecentDate, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
        );
        pnlRecentDateLayout.setVerticalGroup(
            pnlRecentDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRecentDate, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        btnRecentPrevious.setText("Previous");
        btnRecentPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecentPreviousActionPerformed(evt);
            }
        });

        btnRecentNext.setText("Next");
        btnRecentNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecentNextActionPerformed(evt);
            }
        });

        btnRecentRead.setText("Read Article");
        btnRecentRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecentReadActionPerformed(evt);
            }
        });

        btnLikeRecent.setMaximumSize(new java.awt.Dimension(50, 50));
        btnLikeRecent.setMinimumSize(new java.awt.Dimension(50, 50));
        btnLikeRecent.setPreferredSize(new java.awt.Dimension(50, 50));
        btnLikeRecent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLikeRecentActionPerformed(evt);
            }
        });

        btnCommentRecent.setText("Comment");

        javax.swing.GroupLayout pnlRecentNewsLayout = new javax.swing.GroupLayout(pnlRecentNews);
        pnlRecentNews.setLayout(pnlRecentNewsLayout);
        pnlRecentNewsLayout.setHorizontalGroup(
            pnlRecentNewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRecentNewsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRecentNewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRecentNewsLayout.createSequentialGroup()
                        .addComponent(pnlRecentNewsImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRecentNewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRecentNewsLayout.createSequentialGroup()
                                .addComponent(btnLikeRecent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRecentRead)
                                .addGap(9, 9, 9))
                            .addComponent(pnlRecentTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRecentNewsLayout.createSequentialGroup()
                                .addGroup(pnlRecentNewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pnlRecentAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlRecentNewsLayout.createSequentialGroup()
                                        .addComponent(btnRecentPrevious)
                                        .addGap(169, 169, 169)
                                        .addComponent(btnCommentRecent)
                                        .addGap(0, 66, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlRecentNewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnlRecentDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRecentNext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlRecentNewsLayout.createSequentialGroup()
                        .addComponent(pnlRecentNewsHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlRecentNewsLayout.setVerticalGroup(
            pnlRecentNewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRecentNewsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRecentNewsHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRecentNewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRecentNewsLayout.createSequentialGroup()
                        .addComponent(pnlRecentTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRecentNewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlRecentAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRecentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRecentNewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRecentRead)
                            .addComponent(btnLikeRecent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(pnlRecentNewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRecentNewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnRecentPrevious)
                                .addComponent(btnCommentRecent))
                            .addComponent(btnRecentNext, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(pnlRecentNewsImage, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlTodaysMatches.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Todays Matches");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        pnlFlagTeamA.setMaximumSize(new java.awt.Dimension(150, 150));
        pnlFlagTeamA.setMinimumSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout pnlFlagTeamALayout = new javax.swing.GroupLayout(pnlFlagTeamA);
        pnlFlagTeamA.setLayout(pnlFlagTeamALayout);
        pnlFlagTeamALayout.setHorizontalGroup(
            pnlFlagTeamALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFlagTeamA, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        pnlFlagTeamALayout.setVerticalGroup(
            pnlFlagTeamALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFlagTeamALayout.createSequentialGroup()
                .addComponent(lblFlagTeamA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton4.setText("Previous");

        jButton5.setText("Next");

        pnlFlagTeamB.setMaximumSize(new java.awt.Dimension(150, 150));
        pnlFlagTeamB.setMinimumSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout pnlFlagTeamBLayout = new javax.swing.GroupLayout(pnlFlagTeamB);
        pnlFlagTeamB.setLayout(pnlFlagTeamBLayout);
        pnlFlagTeamBLayout.setHorizontalGroup(
            pnlFlagTeamBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFlagTeamB, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        pnlFlagTeamBLayout.setVerticalGroup(
            pnlFlagTeamBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFlagTeamBLayout.createSequentialGroup()
                .addComponent(lblFlagTeamB, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblVS.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblVS.setText("VS");

        lblMatchDate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMatchDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMatchDate.setText("Date:");

        lblMatchDate1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMatchDate1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMatchDate1.setText("Stadium:");

        javax.swing.GroupLayout pnlTodaysMatchesLayout = new javax.swing.GroupLayout(pnlTodaysMatches);
        pnlTodaysMatches.setLayout(pnlTodaysMatchesLayout);
        pnlTodaysMatchesLayout.setHorizontalGroup(
            pnlTodaysMatchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTodaysMatchesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTodaysMatchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTodaysMatchesLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTodaysMatchesLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnlTodaysMatchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlTodaysMatchesLayout.createSequentialGroup()
                                .addComponent(pnlFlagTeamA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                .addGroup(pnlTodaysMatchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTodaysMatchesLayout.createSequentialGroup()
                                        .addComponent(lblVS)
                                        .addGap(172, 172, 172))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTodaysMatchesLayout.createSequentialGroup()
                                        .addGroup(pnlTodaysMatchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblMatchDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblMatchDate1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                                        .addGap(78, 78, 78)))
                                .addComponent(pnlFlagTeamB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlTodaysMatchesLayout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))))
        );
        pnlTodaysMatchesLayout.setVerticalGroup(
            pnlTodaysMatchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTodaysMatchesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTodaysMatchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTodaysMatchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pnlFlagTeamA, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlFlagTeamB, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTodaysMatchesLayout.createSequentialGroup()
                        .addComponent(lblVS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMatchDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMatchDate1)))
                .addGroup(pnlTodaysMatchesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTodaysMatchesLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton5))
                    .addGroup(pnlTodaysMatchesLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton4)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnlMostVoted.setBackground(new java.awt.Color(255, 255, 255));

        pnlMostVotedHead.setBackground(new java.awt.Color(255, 255, 255));

        lblMostVoted.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblMostVoted.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMostVoted.setText("Most Voted");

        javax.swing.GroupLayout pnlMostVotedHeadLayout = new javax.swing.GroupLayout(pnlMostVotedHead);
        pnlMostVotedHead.setLayout(pnlMostVotedHeadLayout);
        pnlMostVotedHeadLayout.setHorizontalGroup(
            pnlMostVotedHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMostVoted, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlMostVotedHeadLayout.setVerticalGroup(
            pnlMostVotedHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMostVoted, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        pnlMostVotedImage.setMaximumSize(new java.awt.Dimension(150, 150));
        pnlMostVotedImage.setMinimumSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout pnlMostVotedImageLayout = new javax.swing.GroupLayout(pnlMostVotedImage);
        pnlMostVotedImage.setLayout(pnlMostVotedImageLayout);
        pnlMostVotedImageLayout.setHorizontalGroup(
            pnlMostVotedImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMostVotedImage, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        pnlMostVotedImageLayout.setVerticalGroup(
            pnlMostVotedImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMostVotedImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblMostVotedTitle.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblMostVotedTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMostVotedTitle.setText("Title");

        javax.swing.GroupLayout pnlMostVotedTitleLayout = new javax.swing.GroupLayout(pnlMostVotedTitle);
        pnlMostVotedTitle.setLayout(pnlMostVotedTitleLayout);
        pnlMostVotedTitleLayout.setHorizontalGroup(
            pnlMostVotedTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMostVotedTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMostVotedTitleLayout.setVerticalGroup(
            pnlMostVotedTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMostVotedTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        lblMostVotedAuthor.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMostVotedAuthor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMostVotedAuthor.setText("Author:");

        javax.swing.GroupLayout pnlMostVotedAuthorLayout = new javax.swing.GroupLayout(pnlMostVotedAuthor);
        pnlMostVotedAuthor.setLayout(pnlMostVotedAuthorLayout);
        pnlMostVotedAuthorLayout.setHorizontalGroup(
            pnlMostVotedAuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMostVotedAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMostVotedAuthorLayout.setVerticalGroup(
            pnlMostVotedAuthorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMostVotedAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        lblMostVotedDate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMostVotedDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMostVotedDate.setText("Date:");

        javax.swing.GroupLayout pnlMostVotedDateLayout = new javax.swing.GroupLayout(pnlMostVotedDate);
        pnlMostVotedDate.setLayout(pnlMostVotedDateLayout);
        pnlMostVotedDateLayout.setHorizontalGroup(
            pnlMostVotedDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMostVotedDate, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
        );
        pnlMostVotedDateLayout.setVerticalGroup(
            pnlMostVotedDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMostVotedDate, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        btnMostVotedPrevious.setText("Previous");
        btnMostVotedPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostVotedPreviousActionPerformed(evt);
            }
        });

        btnMostVotedNext.setText("Next");
        btnMostVotedNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostVotedNextActionPerformed(evt);
            }
        });

        btnReadArticle.setText("Read Article");

        btnCommentMostVoted.setText("Comment");
        btnCommentMostVoted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommentMostVotedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMostVotedLayout = new javax.swing.GroupLayout(pnlMostVoted);
        pnlMostVoted.setLayout(pnlMostVotedLayout);
        pnlMostVotedLayout.setHorizontalGroup(
            pnlMostVotedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMostVotedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMostVotedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMostVotedLayout.createSequentialGroup()
                        .addComponent(pnlMostVotedImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlMostVotedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMostVotedLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlMostVotedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnlMostVotedTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMostVotedLayout.createSequentialGroup()
                                        .addGroup(pnlMostVotedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(pnlMostVotedAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMostVotedLayout.createSequentialGroup()
                                                .addComponent(btnMostVotedPrevious)
                                                .addGap(170, 170, 170)
                                                .addComponent(btnCommentMostVoted)
                                                .addGap(0, 65, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlMostVotedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pnlMostVotedDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnMostVotedNext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMostVotedLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReadArticle)
                                .addGap(9, 9, 9))))
                    .addGroup(pnlMostVotedLayout.createSequentialGroup()
                        .addComponent(pnlMostVotedHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMostVotedLayout.setVerticalGroup(
            pnlMostVotedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMostVotedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMostVotedHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMostVotedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMostVotedLayout.createSequentialGroup()
                        .addComponent(pnlMostVotedTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMostVotedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlMostVotedAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlMostVotedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReadArticle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(pnlMostVotedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMostVotedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnMostVotedPrevious)
                                .addComponent(btnCommentMostVoted))
                            .addComponent(btnMostVotedNext, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(pnlMostVotedImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlScrollDashboardLayout = new javax.swing.GroupLayout(pnlScrollDashboard);
        pnlScrollDashboard.setLayout(pnlScrollDashboardLayout);
        pnlScrollDashboardLayout.setHorizontalGroup(
            pnlScrollDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlScrollDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlScrollDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlRecentNews, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTodaysMatches, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(pnlScrollDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlScrollDashboardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlMostVoted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(63, Short.MAX_VALUE)))
        );
        pnlScrollDashboardLayout.setVerticalGroup(
            pnlScrollDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlScrollDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRecentNews, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addComponent(pnlTodaysMatches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(pnlScrollDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlScrollDashboardLayout.createSequentialGroup()
                    .addGap(228, 228, 228)
                    .addComponent(pnlMostVoted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(275, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(pnlScrollDashboard);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecentNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecentNextActionPerformed
        if (newsBO.getNews().getDataVector().size() - 1 > this.pagForRecent) {
            this.pagForRecent++;
            getRecentNews();
        }
        btnLikeRecent.setIcon(arrayListOfLikesInIcon.get(pagForRecent));
    }//GEN-LAST:event_btnRecentNextActionPerformed

    private void btnRecentReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecentReadActionPerformed
        mainFrame.setVisible(false);
        newsText.setText((String) newsBO.getNews().getDataVector().elementAt(pagForRecent).elementAt(4));
        newsText.setVisible(true);
    }//GEN-LAST:event_btnRecentReadActionPerformed

    private void btnRecentPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecentPreviousActionPerformed
        if (this.pagForRecent > 0) {
            this.pagForRecent--;
            getRecentNews(); 
        }
        btnLikeRecent.setIcon(arrayListOfLikesInIcon.get(pagForRecent));
    }//GEN-LAST:event_btnRecentPreviousActionPerformed

    private void btnMostVotedNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostVotedNextActionPerformed
        if (userSaveBO.getUserSaveMostVoted().getDataVector().size() - 1 > this.pagForMostVoted) {
            this.pagForMostVoted++;
            logicForMostVoted();
        }
    }//GEN-LAST:event_btnMostVotedNextActionPerformed

    private void btnMostVotedPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostVotedPreviousActionPerformed
        if (this.pagForMostVoted > 0) {
            this.pagForMostVoted--;
            logicForMostVoted();
        }
    }//GEN-LAST:event_btnMostVotedPreviousActionPerformed

    private void btnCommentMostVotedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommentMostVotedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCommentMostVotedActionPerformed

    private void btnLikeRecentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLikeRecentActionPerformed
        if (mainFrame.getUser().getIdUser() == -1) {
            JOptionPane.showMessageDialog(null, "First, you have to log in.");
        } else {
            if (btnLikeRecent.getIcon().equals(iconEmptyHeart)) {
                btnLikeRecent.setIcon(iconFilledHeart);
                
                userSave.setIdNews(Integer.parseInt((String)newsBO.getNews().getDataVector().elementAt(pagForRecent).elementAt(0)));
                userSave.setIdUser(mainFrame.getUser().getIdUser());
                
                userSaveBO.insertUserSave(userSave);
                arrayListOfLikesInIcon.remove(pagForRecent);
                arrayListOfLikesInIcon.add(pagForRecent, iconFilledHeart);
            } else {
                btnLikeRecent.setIcon(iconEmptyHeart);
                
                userSave.setIdNews(Integer.parseInt((String)newsBO.getNews().getDataVector().elementAt(pagForRecent).elementAt(0)));
                userSave.setIdUser(mainFrame.getUser().getIdUser());
                
                userSaveBO.deleteNews(userSave);
                arrayListOfLikesInIcon.remove(pagForRecent);
                arrayListOfLikesInIcon.add(pagForRecent, iconEmptyHeart);
            }
        }
    }//GEN-LAST:event_btnLikeRecentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommentMostVoted;
    private javax.swing.JButton btnCommentRecent;
    private javax.swing.JButton btnLikeRecent;
    private javax.swing.JButton btnMostVotedNext;
    private javax.swing.JButton btnMostVotedPrevious;
    private javax.swing.JButton btnReadArticle;
    private javax.swing.JButton btnRecentNext;
    private javax.swing.JButton btnRecentPrevious;
    private javax.swing.JButton btnRecentRead;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFlagTeamA;
    private javax.swing.JLabel lblFlagTeamB;
    private javax.swing.JLabel lblMatchDate;
    private javax.swing.JLabel lblMatchDate1;
    private javax.swing.JLabel lblMostVoted;
    private javax.swing.JLabel lblMostVotedAuthor;
    private javax.swing.JLabel lblMostVotedDate;
    private javax.swing.JLabel lblMostVotedImage;
    private javax.swing.JLabel lblMostVotedTitle;
    private javax.swing.JLabel lblRecentAuthor;
    private javax.swing.JLabel lblRecentDate;
    private javax.swing.JLabel lblRecentNews;
    private javax.swing.JLabel lblRecentNewsImage;
    private javax.swing.JLabel lblRecentTitle;
    private javax.swing.JLabel lblVS;
    private javax.swing.JPanel pnlFlagTeamA;
    private javax.swing.JPanel pnlFlagTeamB;
    private javax.swing.JPanel pnlMostVoted;
    private javax.swing.JPanel pnlMostVotedAuthor;
    private javax.swing.JPanel pnlMostVotedDate;
    private javax.swing.JPanel pnlMostVotedHead;
    private javax.swing.JPanel pnlMostVotedImage;
    private javax.swing.JPanel pnlMostVotedTitle;
    private javax.swing.JPanel pnlRecentAuthor;
    private javax.swing.JPanel pnlRecentDate;
    private javax.swing.JPanel pnlRecentNews;
    private javax.swing.JPanel pnlRecentNewsHead;
    private javax.swing.JPanel pnlRecentNewsImage;
    private javax.swing.JPanel pnlRecentTitle;
    private javax.swing.JPanel pnlScrollDashboard;
    private javax.swing.JPanel pnlTodaysMatches;
    // End of variables declaration//GEN-END:variables
}
