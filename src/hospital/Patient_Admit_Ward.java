/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author dev
 */
public class Patient_Admit_Ward extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form Doctor
     */
    public Patient_Admit_Ward() {
             initComponents();
              con=Connect.ConnectDB();
              cmbWardName.setSelectedIndex(-1);
              cmbWardName1.setVisible(false);
              fill_combobox();
             Get_PTbl();
             Get_DTbl();
             PTblPaint();
             DTblPaint();
             setLocationRelativeTo(null);     
              
            
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbWardName = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDisease = new javax.swing.JTextField();
        txtDoctorID = new javax.swing.JTextField();
        txtAdmitDate = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        cmbBloodGroup = new javax.swing.JComboBox();
        jSeparator11 = new javax.swing.JSeparator();
        txtDoctorName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRemarks = new javax.swing.JTextArea();
        cmbWardName1 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btnDetails = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        Home = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PTbl = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        DTbl = new javax.swing.JTable();
        txtAdmitID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(10, 24, 39));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 254));
        jPanel1.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel3.setText("Patient id:");

        jLabel4.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel4.setText("Patient Name:");

        jLabel5.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel6.setText("Blood Group");

        jLabel7.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel8.setText("Disease");

        jLabel9.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel9.setText("Admit Date");

        jLabel2.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel2.setText("Ward Name");

        jLabel12.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel12.setText("Doctor id");

        cmbWardName.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        cmbWardName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbWardName.setOpaque(false);
        cmbWardName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbWardNameItemStateChanged(evt);
            }
        });
        cmbWardName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbWardNameActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel10.setText("Doctor Name");

        cmbGender.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        cmbGender.setSelectedIndex(-1);
        cmbGender.setBorder(null);
        cmbGender.setOpaque(false);

        jLabel11.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel11.setText("Remarks");

        txtPatientID.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        txtPatientID.setBorder(null);

        txtPatientName.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        txtPatientName.setBorder(null);

        txtEmail.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        txtEmail.setBorder(null);

        txtDisease.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        txtDisease.setBorder(null);

        txtDoctorID.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        txtDoctorID.setBorder(null);

        txtAdmitDate.setBorder(null);
        txtAdmitDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtAdmitDate.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N

        cmbBloodGroup.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        cmbBloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        cmbBloodGroup.setSelectedIndex(-1);
        cmbBloodGroup.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbBloodGroup.setOpaque(false);

        txtDoctorName.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        txtDoctorName.setBorder(null);

        txtRemarks.setColumns(20);
        txtRemarks.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        txtRemarks.setLineWrap(true);
        txtRemarks.setRows(5);
        txtRemarks.setBorder(null);
        jScrollPane1.setViewportView(txtRemarks);

        cmbWardName1.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        cmbWardName1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbWardName1.setOpaque(false);
        cmbWardName1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbWardName1ItemStateChanged(evt);
            }
        });
        cmbWardName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbWardName1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(cmbWardName, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(cmbWardName1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtAdmitDate, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(cmbBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPatientID, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(txtPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(jSeparator1)
                                    .addComponent(jSeparator2)
                                    .addComponent(cmbGender, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEmail, txtPatientID, txtPatientName});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtAdmitDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbWardName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbWardName1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 400, 600));

        jPanel2.setBackground(new java.awt.Color(236, 236, 236));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Playfair Display Black", 0, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Patient Admit Ward");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(924, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, -1));

        jPanel4.setBackground(new java.awt.Color(1, 50, 67));

        jPanel6.setBackground(new java.awt.Color(52, 73, 94));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(52, 73, 94));

        btnSave.setBackground(new java.awt.Color(52, 73, 94));
        btnSave.setFont(new java.awt.Font("Raleway Black", 0, 18)); // NOI18N
        btnSave.setForeground(java.awt.Color.white);
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/save.png"))); // NOI18N
        btnSave.setText("     Save");
        btnSave.setBorderPainted(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setFocusPainted(false);
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSave)
        );

        jPanel8.setBackground(new java.awt.Color(52, 73, 94));

        btnDelete.setBackground(new java.awt.Color(52, 73, 94));
        btnDelete.setFont(new java.awt.Font("Raleway Black", 0, 18)); // NOI18N
        btnDelete.setForeground(java.awt.Color.white);
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/delete.png"))); // NOI18N
        btnDelete.setText("     Delete");
        btnDelete.setBorder(null);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setEnabled(false);
        btnDelete.setFocusPainted(false);
        btnDelete.setPreferredSize(new java.awt.Dimension(132, 44));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(52, 73, 94));

        btnDetails.setBackground(new java.awt.Color(52, 73, 94));
        btnDetails.setFont(new java.awt.Font("Raleway Black", 0, 18)); // NOI18N
        btnDetails.setForeground(java.awt.Color.white);
        btnDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/file.png"))); // NOI18N
        btnDetails.setText("    Details");
        btnDetails.setBorderPainted(false);
        btnDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDetails.setPreferredSize(new java.awt.Dimension(132, 44));
        btnDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDetailsMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDetailsMouseEntered(evt);
            }
        });
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(52, 73, 94));
        jPanel3.setToolTipText("New");
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
        });

        btnNew.setBackground(new java.awt.Color(52, 73, 94));
        btnNew.setFont(new java.awt.Font("Raleway Black", 0, 18)); // NOI18N
        btnNew.setForeground(java.awt.Color.white);
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/edit.png"))); // NOI18N
        btnNew.setText("     New");
        btnNew.setToolTipText("New");
        btnNew.setBorderPainted(false);
        btnNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNew.setFocusPainted(false);
        btnNew.setPreferredSize(new java.awt.Dimension(132, 44));
        btnNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewMouseEntered(evt);
            }
        });
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(52, 73, 94));

        btnUpdate.setBackground(new java.awt.Color(52, 73, 94));
        btnUpdate.setFont(new java.awt.Font("Raleway Black", 0, 18)); // NOI18N
        btnUpdate.setForeground(java.awt.Color.white);
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/update.png"))); // NOI18N
        btnUpdate.setText("     Update");
        btnUpdate.setBorder(null);
        btnUpdate.setBorderPainted(false);
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.setEnabled(false);
        btnUpdate.setFocusPainted(false);
        btnUpdate.setPreferredSize(new java.awt.Dimension(132, 44));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/home.png"))); // NOI18N
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(Home)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Home)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 630));

        PTbl.setBackground(new java.awt.Color(255, 255, 254));
        PTbl.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        PTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "P_ID", "Patient Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PTbl.setGridColor(java.awt.Color.pink);
        PTbl.setRowHeight(25);
        PTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(PTbl);
        if (PTbl.getColumnModel().getColumnCount() > 0) {
            PTbl.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 250, -1));

        DTbl.setBackground(new java.awt.Color(255, 255, 254));
        DTbl.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        DTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "D_ID", "Doctor Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DTbl.setGridColor(java.awt.Color.pink);
        DTbl.setRowHeight(25);
        DTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DTblMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(DTbl);
        if (DTbl.getColumnModel().getColumnCount() > 0) {
            DTbl.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 250, -1));

        txtAdmitID.setBackground(new java.awt.Color(10, 24, 39));
        txtAdmitID.setFont(new java.awt.Font("Norasi", 0, 24)); // NOI18N
        txtAdmitID.setForeground(java.awt.Color.white);
        txtAdmitID.setBorder(null);
        jPanel5.add(txtAdmitID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 620, 80, 40));

        jLabel13.setFont(new java.awt.Font("Norasi", 0, 24)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("AdmitID");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 620, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 670));

        setSize(new java.awt.Dimension(1223, 669));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fill_combobox(){
        try{
            String sql="select distinct WardName from Ward order by WardName";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                String add=rs.getString("WardName");
                cmbWardName.addItem(add);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
    }
    }
    private void Get_PTbl(){
         String sql="select PatientID as 'P_ID', PatientName as 'Patient Name' from Patient order by PatientID";  try{
         pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
         PTbl.setModel(DbUtils.resultSetToTableModel(rs));
         }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
    }
    }
    
    private void Get_DTbl(){
         String sql="select DoctorID as 'D_ID', DoctorName as 'Doctor Name' from Doctor order by DoctorID";  try{
        
         pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
         DTbl.setModel(DbUtils.resultSetToTableModel(rs));
         }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
    }
    }
    
    private void PTblPaint()
    {
            PTbl.getTableHeader().setOpaque(false);
             PTbl.getTableHeader().setForeground(new Color (38, 166, 91));
             PTbl.getTableHeader().setFont(new Font("URW Palladio L",Font.PLAIN,18)); 
    }
    
      private void DTblPaint()
    {
            DTbl.getTableHeader().setOpaque(false);
             DTbl.getTableHeader().setForeground(new Color (38, 166, 91));
             DTbl.getTableHeader().setFont(new Font("URW Palladio L",Font.PLAIN,18)); 
    }
      
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    try{
        con=Connect.ConnectDB();
        if(txtPatientID.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please enter the Patient ID","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(txtPatientName.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please enter the Patient Name","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        if(cmbGender.getSelectedItem().equals("-1")){
            JOptionPane.showMessageDialog(this,"Please select the Gender","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        if(cmbBloodGroup.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(this,"Please select the Blood Group","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        if(txtEmail.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please enter the Disease","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        if(txtDisease.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please enter the Email ID","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        if(txtAdmitDate.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please enter the Admit Date","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
         
        if(cmbWardName.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(this,"Please select the Ward Name","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(txtDoctorID.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please enter Doctor ID","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(txtDoctorName.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please enter the Doctor Name","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        Statement st1;
        st1=con.createStatement();
        String sql2="Select WardName from Ward where WardName= '" + cmbWardName.getSelectedItem()+ "'and NoOfBeds<=0";
        rs=st1.executeQuery(sql2);
        if(rs.next()){
        JOptionPane.showMessageDialog( this, "Beds are not available","Error", JOptionPane.ERROR_MESSAGE);
        cmbWardName.setSelectedItem("");
        cmbWardName.requestDefaultFocus();
        return;
      }
      
        Statement stmt;
       stmt= con.createStatement();
       String sql1="Select PatientID,AdmitDate from Patient_Admit_Ward where PatientID= '" + txtPatientID.getText() + "' and AdmitDate='" + txtAdmitDate + "'";
      rs=stmt.executeQuery(sql1);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "Record already exists","Error", JOptionPane.ERROR_MESSAGE);
        return;
      }
        
      
      String Sql="insert into Patient_Admit_Ward (PatientID, Disease, AdmitDate, WardName, DoctorId, Remarks)values('"+txtPatientID.getText()+"', '"+txtDisease.getText()+"','"+txtAdmitDate.getText()+"','"+cmbWardName.getSelectedItem()+"','"+txtDoctorID.getText()+"','"+txtRemarks.getText()+"')";
      pst=con.prepareStatement(Sql);
      pst.execute();
      String sql="update Ward set NoOfBeds=NoOfBeds - 1 where WardName='" + cmbWardName.getSelectedItem() + "'";;
      pst=con.prepareStatement(sql);
      pst.execute();
     JOptionPane.showMessageDialog(this,"Successfully Saved","Records",JOptionPane.INFORMATION_MESSAGE);
      btnSave.setEnabled(false);
    }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        Reset();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
    this.dispose();
    Patient_Admit_Ward_Record frm=new Patient_Admit_Ward_Record();
    frm.setVisible(true);
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    try{
    int p=JOptionPane.showConfirmDialog(this,"Are you sure want to delete?","Confirm",JOptionPane.YES_NO_OPTION);
    if(p==0){
        String sql="delete from Patient_Admit_Ward where AdmitID='"+txtAdmitID.getText()+"'";
        pst=con.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(this,"Successfully Deleted","Records",JOptionPane.INFORMATION_MESSAGE);
        Reset();
    }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
    }     
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
 try{
       
            con=Connect.ConnectDB();
      
       Statement stmt1;
       stmt1= con.createStatement();
       String s= cmbWardName.getSelectedItem().toString();
       String t= cmbWardName1.getSelectedItem().toString();
       if (!t.equals(s))
       {
       String sql2="Select WardName from Ward where WardName= '" + cmbWardName.getSelectedItem()+ "' and NoOfBeds<=0";
       rs=stmt1.executeQuery(sql2);
       if(rs.next()){
        JOptionPane.showMessageDialog( this, "beds are not available","Error", JOptionPane.ERROR_MESSAGE);
        cmbWardName.setSelectedItem("");
        cmbWardName.requestDefaultFocus();
       return;
      }
      }
      
            String sql= " update Patient_Admit_Ward set PatientID='"+ txtPatientID.getText() + "',Disease='"+ txtDisease.getText() + "',AdmitDate='"+ txtAdmitDate.getText() + "',WardName='"+ cmbWardName.getSelectedItem()+ "',DoctorID='" + txtDoctorID.getText() + "',Remarks='"+ txtRemarks.getText() + "' where AdmitID= '"+ txtAdmitID.getText() +"'";
            pst=con.prepareStatement(sql);
            pst.execute();
           if (!t.equals(s))
       {
             String sql3= "update Ward set NoOfBeds=NoOfBeds - 1 where WardName='" + cmbWardName.getSelectedItem() + "'";
           pst=con.prepareStatement(sql3);
            pst.execute();
       }
            if (!t.equals(s))
       {
             String sql4= "update Ward set NoOfBeds=NoOfBeds + 1 where Wardname='" + cmbWardName1.getSelectedItem() + "'";
             pst=con.prepareStatement(sql4);
            pst.execute();
       }
            JOptionPane.showMessageDialog(this,"Successfully updated","Patient Record",JOptionPane.INFORMATION_MESSAGE);
            btnUpdate.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
   
    }//GEN-LAST:event_jPanel6MouseEntered

    private void btnNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseEntered
        jPanel3.setBackground(new Color(0,102,204));
        btnNew.setBackground(new Color(0,102,204));
    }//GEN-LAST:event_btnNewMouseEntered

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered

    }//GEN-LAST:event_jPanel3MouseEntered

    private void btnNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseExited
       jPanel3.setBackground(new Color(52,73,94));
       btnNew.setBackground(new Color(52,73,94));
    }//GEN-LAST:event_btnNewMouseExited

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        jPanel7.setBackground(new Color(0,102,204));
        btnSave.setBackground(new Color(0,102,204));// TODO add your handling code here:
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
       jPanel7.setBackground(new Color(52,73,94));
       btnSave.setBackground(new Color(52,73,94)); // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        jPanel8.setBackground(new Color(0,102,204));
        btnDelete.setBackground(new Color(0,102,204));
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
       jPanel8.setBackground(new Color(52,73,94));
       btnDelete.setBackground(new Color(52,73,94));// TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
      jPanel9.setBackground(new Color(0,102,204));
        btnUpdate.setBackground(new Color(0,102,204));
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
         jPanel9.setBackground(new Color(52,73,94));
       btnUpdate.setBackground(new Color(52,73,94)); // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnDetailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetailsMouseEntered
    jPanel10.setBackground(new Color(0,102,204));
        btnDetails.setBackground(new Color(0,102,204));
    }//GEN-LAST:event_btnDetailsMouseEntered

    private void btnDetailsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetailsMouseExited
         jPanel10.setBackground(new Color(52,73,94));
       btnDetails.setBackground(new Color(52,73,94));// TODO add your handling code here:
    }//GEN-LAST:event_btnDetailsMouseExited

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        this.dispose();
        Main frm=new Main();
        frm.setVisible(true);
    }//GEN-LAST:event_HomeMouseClicked

    private void PTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PTblMouseClicked
          try{
            con=Connect.ConnectDB();
            int row=PTbl.getSelectedRow();
            String table_click= PTbl.getModel().getValueAt(row, 0).toString();
            String sql= "select * from Patient where PatientID = '" + table_click + "'";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("PatientID");
                txtPatientID.setText(add1);
                String add2=rs.getString("PatientName");
                txtPatientName.setText(add2);
                String add3=rs.getString("Gender");
                cmbGender.setSelectedItem(add3);
                 String add9=rs.getString("BloodGroup"); 
                cmbBloodGroup.setSelectedItem(add9);
                String add5=rs.getString("Email");
                txtEmail.setText(add5);
               
            }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(this, e);
            }
    }//GEN-LAST:event_PTblMouseClicked

    private void DTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DTblMouseClicked
         try{
            con=Connect.ConnectDB();
            int row=DTbl.getSelectedRow();
            String table_click= DTbl.getModel().getValueAt(row, 0).toString();
            String sql= "select * from Doctor where DoctorID = '" + table_click + "'";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("DoctorID");
                txtDoctorID.setText(add1);
                String add2=rs.getString("DoctorName");
                txtDoctorName.setText(add2);
            
            
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }// TODO add your handling code here:
    }//GEN-LAST:event_DTblMouseClicked

    private void cmbWardNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbWardNameItemStateChanged
  
    }//GEN-LAST:event_cmbWardNameItemStateChanged

    private void cmbWardNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbWardNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbWardNameActionPerformed

    private void cmbWardName1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbWardName1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbWardName1ItemStateChanged

    private void cmbWardName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbWardName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbWardName1ActionPerformed
private void Reset()
{
    txtAdmitID.setText("");
    txtPatientID.setText("");
    txtPatientName.setText("");
    cmbBloodGroup.setSelectedIndex(-1);
    cmbGender.setSelectedIndex(-1);
    txtEmail.setText("");
    txtDisease.setText("");
    txtAdmitDate.setText("");
    cmbWardName.setSelectedIndex(-1);
    txtDoctorID.setText("");
    txtDoctorName.setText("");
    txtRemarks.setText("");
    btnSave.setEnabled(true);
    btnUpdate.setEnabled(false);
    btnDelete.setEnabled(false);
    txtPatientID.requestDefaultFocus();

}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Patient_Admit_Ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_Admit_Ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_Admit_Ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_Admit_Ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_Admit_Ward().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DTbl;
    private javax.swing.JLabel Home;
    private javax.swing.JTable PTbl;
    public javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnNew;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnUpdate;
    public javax.swing.JComboBox cmbBloodGroup;
    public javax.swing.JComboBox cmbGender;
    public javax.swing.JComboBox cmbWardName;
    public javax.swing.JComboBox cmbWardName1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    public javax.swing.JFormattedTextField txtAdmitDate;
    public javax.swing.JTextField txtAdmitID;
    public javax.swing.JTextField txtDisease;
    public javax.swing.JTextField txtDoctorID;
    public javax.swing.JTextField txtDoctorName;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtPatientID;
    public javax.swing.JTextField txtPatientName;
    public javax.swing.JTextArea txtRemarks;
    // End of variables declaration//GEN-END:variables
}
