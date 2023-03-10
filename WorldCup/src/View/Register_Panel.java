/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import B_Layer.AddressBO;
import B_Layer.CantonBO;
import B_Layer.CountryBO;
import B_Layer.DistrictBO;
import B_Layer.GenderBO;
import B_Layer.IdentificationTypeBO;
import B_Layer.ProvinceBO;
import Entities.Canton;
import Entities.Country;
import Entities.District;
import Entities.Gender;
import Entities.IdentificationType;
import Entities.Province;
import View.EventDataPK.TablePeople;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Datos
 */
public class Register_Panel extends javax.swing.JPanel {
    private JPanel pnlContent;
    private final IdentificationTypeBO idType = new IdentificationTypeBO();
    private final GenderBO genderBO = new GenderBO();
    private final CountryBO countryBO = new CountryBO();
    private final ProvinceBO provinceBO = new ProvinceBO();
    private final CantonBO cantonBO = new CantonBO();
    private final DistrictBO districtBO = new DistrictBO();
    private final AddressBO addressBO = new AddressBO();
    /**
     * Creates new form Register_Panel
     */
    public Register_Panel(JPanel pnlContent) {
        initComponents();
        this.pnlContent = pnlContent;
        fillCboxGender();
        fillCboxIdType();
        fillCboxCountry();
    }
    
    public int getCountryID() throws SQLException{
        ArrayList<Country> list = this.countryBO.getList();
        int idCountry = list.get(this.cboxCountry.getSelectedIndex()).getIdCountry();
        return idCountry;
    }
    
    public int getProvinceID() throws SQLException{
        ArrayList<Province> list = this.provinceBO.getList(getCountryID());
        int idProvince = list.get(this.cboxProvince.getSelectedIndex()).getIdProvince();
        return idProvince;
    }
    
    public int getCantonID() throws SQLException{
        ArrayList<Canton> list = this.cantonBO.getList(getProvinceID());
        int idCanton = list.get(this.cboxCanton.getSelectedIndex()).getIdProvince();
        return idCanton;
    }
    
    public int getDistrictID() throws SQLException{
        ArrayList<District> list = this.cantonBO.getList(getProvinceID());
        int idDistrict = list.get(this.cboxDistrict.getSelectedIndex()).getIdDistrict();
        return idDistrict;
    }
    
    public void fillCboxGender(){
        try {
            ArrayList<Gender> list = genderBO.getList();
            for(int i =0; i < list.size();i++){
                cboxGender.addItem(list.get(i).getGenderDescription());
            }
        } catch (SQLException ex) {
            Logger.getLogger(TablePeople.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fillCboxIdType(){
        try {
            ArrayList<IdentificationType> list = idType.getList();
            for(int i =0; i < list.size();i++){
                this.cboxIdType.addItem(list.get(i).getIdName());
            }
        } catch (SQLException ex) {
            Logger.getLogger(TablePeople.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fillCboxCountry(){
        try {
            ArrayList<Country> list = countryBO.getList();
            for(int i =0; i < list.size();i++){
                this.cboxCountry.addItem(list.get(i).getNameCountry());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Register_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fillCboxProvince(){
        this.cboxProvince.removeAllItems();
        try {
            ArrayList<Province> list = provinceBO.getList(getCountryID());
            for(int i =0; i < list.size();i++){
                this.cboxProvince.addItem(list.get(i).getNameProvince());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Register_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fillCboxCanton(){
        this.cboxCanton.removeAllItems();
        try {
            ArrayList<Canton> list = cantonBO.getList(getProvinceID());
            for(int i =0; i < list.size();i++){
                this.cboxCanton.addItem(list.get(i).getNameCanton());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Register_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fillCboxDistrict(){
        this.cboxDistrict.removeAllItems();
        try {
            ArrayList<District> list = districtBO.getList(getCantonID());
            for(int i =0; i < list.size();i++){
                this.cboxDistrict.addItem(list.get(i).getNameDistrict());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Register_Panel.class.getName()).log(Level.SEVERE, null, ex);
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

        pnlHeader = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        pnlName = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txfName = new javax.swing.JTextField();
        pnlLastName = new javax.swing.JPanel();
        lblLastName = new javax.swing.JLabel();
        txfLastName = new javax.swing.JTextField();
        pnlPhoto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlPhone = new javax.swing.JPanel();
        lblPhone = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        pnlEmail = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        btnSelectPicture = new javax.swing.JButton();
        pnlIdType = new javax.swing.JPanel();
        lblLastName1 = new javax.swing.JLabel();
        cboxIdType = new javax.swing.JComboBox<>();
        pnlID = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        pnlCountry = new javax.swing.JPanel();
        lblCountry = new javax.swing.JLabel();
        cboxCountry = new javax.swing.JComboBox<>();
        pnlProvince = new javax.swing.JPanel();
        lblProvince = new javax.swing.JLabel();
        cboxProvince = new javax.swing.JComboBox<>();
        pnlCanton = new javax.swing.JPanel();
        lblCanton = new javax.swing.JLabel();
        cboxCanton = new javax.swing.JComboBox<>();
        pnlDistrict = new javax.swing.JPanel();
        lblDistrict = new javax.swing.JLabel();
        cboxDistrict = new javax.swing.JComboBox<>();
        pnlID1 = new javax.swing.JPanel();
        lblAdress = new javax.swing.JLabel();
        txfID1 = new javax.swing.JTextField();
        pnlID2 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        txfID2 = new javax.swing.JTextField();
        pnlID3 = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        txfID3 = new javax.swing.JTextField();
        pnlGender = new javax.swing.JPanel();
        lblGender = new javax.swing.JLabel();
        cboxGender = new javax.swing.JComboBox<>();
        pnlBirthday = new javax.swing.JPanel();
        lblBirthday = new javax.swing.JLabel();
        ftxfBirthday = new javax.swing.JFormattedTextField();
        btnFinish = new javax.swing.JButton();

        setBackground(new java.awt.Color(94, 4, 32));
        setMaximumSize(new java.awt.Dimension(834, 578));
        setMinimumSize(new java.awt.Dimension(834, 578));

        pnlHeader.setBackground(new java.awt.Color(152, 12, 51));

        lblHeader.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Register");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        lblName.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name:");

        javax.swing.GroupLayout pnlNameLayout = new javax.swing.GroupLayout(pnlName);
        pnlName.setLayout(pnlNameLayout);
        pnlNameLayout.setHorizontalGroup(
            pnlNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNameLayout.createSequentialGroup()
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfName, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
        );
        pnlNameLayout.setVerticalGroup(
            pnlNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(txfName)
        );

        lblLastName.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblLastName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLastName.setText("Last Name:");

        txfLastName.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        javax.swing.GroupLayout pnlLastNameLayout = new javax.swing.GroupLayout(pnlLastName);
        pnlLastName.setLayout(pnlLastNameLayout);
        pnlLastNameLayout.setHorizontalGroup(
            pnlLastNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLastNameLayout.createSequentialGroup()
                .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlLastNameLayout.setVerticalGroup(
            pnlLastNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txfLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnlPhoto.setMaximumSize(new java.awt.Dimension(250, 250));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Profile Picture");

        javax.swing.GroupLayout pnlPhotoLayout = new javax.swing.GroupLayout(pnlPhoto);
        pnlPhoto.setLayout(pnlPhotoLayout);
        pnlPhotoLayout.setHorizontalGroup(
            pnlPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlPhotoLayout.setVerticalGroup(
            pnlPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );

        lblPhone.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhone.setText("Phone:");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlPhoneLayout = new javax.swing.GroupLayout(pnlPhone);
        pnlPhone.setLayout(pnlPhoneLayout);
        pnlPhoneLayout.setHorizontalGroup(
            pnlPhoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPhoneLayout.createSequentialGroup()
                .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
        );
        pnlPhoneLayout.setVerticalGroup(
            pnlPhoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jFormattedTextField1)
        );

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Email:");

        jTextField7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        javax.swing.GroupLayout pnlEmailLayout = new javax.swing.GroupLayout(pnlEmail);
        pnlEmail.setLayout(pnlEmailLayout);
        pnlEmailLayout.setHorizontalGroup(
            pnlEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmailLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
        );
        pnlEmailLayout.setVerticalGroup(
            pnlEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        btnSelectPicture.setText("Select Picture");

        lblLastName1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblLastName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLastName1.setText("Id Type");

        cboxIdType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxIdTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlIdTypeLayout = new javax.swing.GroupLayout(pnlIdType);
        pnlIdType.setLayout(pnlIdTypeLayout);
        pnlIdTypeLayout.setHorizontalGroup(
            pnlIdTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdTypeLayout.createSequentialGroup()
                .addComponent(lblLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxIdType, 0, 175, Short.MAX_VALUE))
        );
        pnlIdTypeLayout.setVerticalGroup(
            pnlIdTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblLastName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboxIdType, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblId.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblId.setText("ID:");

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout pnlIDLayout = new javax.swing.GroupLayout(pnlID);
        pnlID.setLayout(pnlIDLayout);
        pnlIDLayout.setHorizontalGroup(
            pnlIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIDLayout.createSequentialGroup()
                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
        );
        pnlIDLayout.setVerticalGroup(
            pnlIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jFormattedTextField2)
        );

        lblCountry.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblCountry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountry.setText("Country");

        cboxCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxCountryItemStateChanged(evt);
            }
        });
        cboxCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCountryActionPerformed(evt);
            }
        });
        cboxCountry.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cboxCountryPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnlCountryLayout = new javax.swing.GroupLayout(pnlCountry);
        pnlCountry.setLayout(pnlCountryLayout);
        pnlCountryLayout.setHorizontalGroup(
            pnlCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCountryLayout.createSequentialGroup()
                .addComponent(lblCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxCountry, 0, 175, Short.MAX_VALUE))
        );
        pnlCountryLayout.setVerticalGroup(
            pnlCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCountryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboxCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblProvince.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblProvince.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProvince.setText("Province");

        cboxProvince.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxProvinceItemStateChanged(evt);
            }
        });
        cboxProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxProvinceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlProvinceLayout = new javax.swing.GroupLayout(pnlProvince);
        pnlProvince.setLayout(pnlProvinceLayout);
        pnlProvinceLayout.setHorizontalGroup(
            pnlProvinceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProvinceLayout.createSequentialGroup()
                .addComponent(lblProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxProvince, 0, 175, Short.MAX_VALUE))
        );
        pnlProvinceLayout.setVerticalGroup(
            pnlProvinceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProvinceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblProvince, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboxProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblCanton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblCanton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCanton.setText("Canton");

        cboxCanton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCantonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCantonLayout = new javax.swing.GroupLayout(pnlCanton);
        pnlCanton.setLayout(pnlCantonLayout);
        pnlCantonLayout.setHorizontalGroup(
            pnlCantonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCantonLayout.createSequentialGroup()
                .addComponent(lblCanton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxCanton, 0, 175, Short.MAX_VALUE))
        );
        pnlCantonLayout.setVerticalGroup(
            pnlCantonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCantonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblCanton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboxCanton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblDistrict.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblDistrict.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDistrict.setText("District");

        cboxDistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxDistrictActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDistrictLayout = new javax.swing.GroupLayout(pnlDistrict);
        pnlDistrict.setLayout(pnlDistrictLayout);
        pnlDistrictLayout.setHorizontalGroup(
            pnlDistrictLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDistrictLayout.createSequentialGroup()
                .addComponent(lblDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxDistrict, 0, 175, Short.MAX_VALUE))
        );
        pnlDistrictLayout.setVerticalGroup(
            pnlDistrictLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDistrictLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblDistrict, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboxDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblAdress.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblAdress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdress.setText("Adress:");

        txfID1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        javax.swing.GroupLayout pnlID1Layout = new javax.swing.GroupLayout(pnlID1);
        pnlID1.setLayout(pnlID1Layout);
        pnlID1Layout.setHorizontalGroup(
            pnlID1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlID1Layout.createSequentialGroup()
                .addComponent(lblAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfID1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE))
        );
        pnlID1Layout.setVerticalGroup(
            pnlID1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAdress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txfID1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        lblUsername.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Username:");

        txfID2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        javax.swing.GroupLayout pnlID2Layout = new javax.swing.GroupLayout(pnlID2);
        pnlID2.setLayout(pnlID2Layout);
        pnlID2Layout.setHorizontalGroup(
            pnlID2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlID2Layout.createSequentialGroup()
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfID2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
        );
        pnlID2Layout.setVerticalGroup(
            pnlID2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txfID2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        lblPassword.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Password:");

        txfID3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        javax.swing.GroupLayout pnlID3Layout = new javax.swing.GroupLayout(pnlID3);
        pnlID3.setLayout(pnlID3Layout);
        pnlID3Layout.setHorizontalGroup(
            pnlID3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlID3Layout.createSequentialGroup()
                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfID3, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
        );
        pnlID3Layout.setVerticalGroup(
            pnlID3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlID3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txfID3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblGender.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGender.setText("Gender:");

        cboxGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxGenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlGenderLayout = new javax.swing.GroupLayout(pnlGender);
        pnlGender.setLayout(pnlGenderLayout);
        pnlGenderLayout.setHorizontalGroup(
            pnlGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGenderLayout.createSequentialGroup()
                .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxGender, 0, 175, Short.MAX_VALUE))
        );
        pnlGenderLayout.setVerticalGroup(
            pnlGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblBirthday.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblBirthday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBirthday.setText("Birthday:");

        try {
            ftxfBirthday.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxfBirthday.setText("    ");

        javax.swing.GroupLayout pnlBirthdayLayout = new javax.swing.GroupLayout(pnlBirthday);
        pnlBirthday.setLayout(pnlBirthdayLayout);
        pnlBirthdayLayout.setHorizontalGroup(
            pnlBirthdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBirthdayLayout.createSequentialGroup()
                .addComponent(lblBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftxfBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
        );
        pnlBirthdayLayout.setVerticalGroup(
            pnlBirthdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(ftxfBirthday)
        );

        btnFinish.setText("Finish");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pnlID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(pnlID3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(pnlName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(pnlLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(pnlPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(pnlEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(pnlCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(pnlProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(pnlCanton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(pnlDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pnlIdType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pnlID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 62, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSelectPicture, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelectPicture))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlIdType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCanton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlID3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinish, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboxIdTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxIdTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxIdTypeActionPerformed

    private void cboxCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCountryActionPerformed

    }//GEN-LAST:event_cboxCountryActionPerformed

    private void cboxProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxProvinceActionPerformed

    }//GEN-LAST:event_cboxProvinceActionPerformed

    private void cboxCantonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCantonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxCantonActionPerformed

    private void cboxDistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxDistrictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxDistrictActionPerformed

    private void cboxGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxGenderActionPerformed

    private void cboxCountryPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cboxCountryPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxCountryPropertyChange

    private void cboxProvinceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxProvinceItemStateChanged
        fillCboxCanton();
    }//GEN-LAST:event_cboxProvinceItemStateChanged

    private void cboxCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxCountryItemStateChanged
        fillCboxProvince();
    }//GEN-LAST:event_cboxCountryItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnSelectPicture;
    private javax.swing.JComboBox<String> cboxCanton;
    private javax.swing.JComboBox<String> cboxCountry;
    private javax.swing.JComboBox<String> cboxDistrict;
    private javax.swing.JComboBox<String> cboxGender;
    private javax.swing.JComboBox<String> cboxIdType;
    private javax.swing.JComboBox<String> cboxProvince;
    private javax.swing.JFormattedTextField ftxfBirthday;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblAdress;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblCanton;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblDistrict;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLastName1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblProvince;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlBirthday;
    private javax.swing.JPanel pnlCanton;
    private javax.swing.JPanel pnlCountry;
    private javax.swing.JPanel pnlDistrict;
    private javax.swing.JPanel pnlEmail;
    private javax.swing.JPanel pnlGender;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlID;
    private javax.swing.JPanel pnlID1;
    private javax.swing.JPanel pnlID2;
    private javax.swing.JPanel pnlID3;
    private javax.swing.JPanel pnlIdType;
    private javax.swing.JPanel pnlLastName;
    private javax.swing.JPanel pnlName;
    private javax.swing.JPanel pnlPhone;
    private javax.swing.JPanel pnlPhoto;
    private javax.swing.JPanel pnlProvince;
    private javax.swing.JTextField txfID1;
    private javax.swing.JTextField txfID2;
    private javax.swing.JTextField txfID3;
    private javax.swing.JTextField txfLastName;
    private javax.swing.JTextField txfName;
    // End of variables declaration//GEN-END:variables
}
