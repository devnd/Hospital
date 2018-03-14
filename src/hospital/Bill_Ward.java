/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author dev
 */
public class Bill_Ward extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form Doctor
     */
    public Bill_Ward() {
             initComponents();
    
             con=Connect.ConnectDB();
              setLocationRelativeTo(null);     
              
              
             
            
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
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
        jPanel12 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        btnSave1 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        btnDelete1 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        btnDetails1 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        btnNew1 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        btnUpdate1 = new javax.swing.JButton();
        Home1 = new javax.swing.JLabel();
        txtAdmitID = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        txtBedCharges = new javax.swing.JTextField();
        txtDays = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtTBedCharges = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtServiceCharges = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtBillingDate = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        cmbPaymentMode = new javax.swing.JComboBox();
        jLabel41 = new javax.swing.JLabel();
        txtTotalCharges = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtPaid = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jSeparator32 = new javax.swing.JSeparator();
        txtDueCharges = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jSeparator33 = new javax.swing.JSeparator();
        jSeparator34 = new javax.swing.JSeparator();
        jSeparator35 = new javax.swing.JSeparator();
        jSeparator36 = new javax.swing.JSeparator();
        jSeparator37 = new javax.swing.JSeparator();
        jSeparator38 = new javax.swing.JSeparator();
        jSeparator39 = new javax.swing.JSeparator();
        jSeparator40 = new javax.swing.JSeparator();
        txtDischargeID = new javax.swing.JTextField();
        bill = new javax.swing.JLabel();
        discharge = new javax.swing.JLabel();
        txtBillNo = new javax.swing.JTextField();
        admit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtDisease = new javax.swing.JTextField();
        txtDoctorID = new javax.swing.JTextField();
        txtDoctorName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtGender = new javax.swing.JTextField();
        txtBloodGroup = new javax.swing.JTextField();
        txtAdmitDate = new javax.swing.JTextField();
        txtWardName = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtDischargeDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(10, 24, 39));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(236, 236, 236));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Playfair Display Black", 0, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Bill (Ward)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(974, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));

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
                .addContainerGap(332, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 770));

        jPanel12.setBackground(new java.awt.Color(10, 24, 39));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(236, 236, 236));

        jLabel34.setBackground(java.awt.Color.white);
        jLabel34.setFont(new java.awt.Font("Playfair Display Black", 0, 24)); // NOI18N
        jLabel34.setForeground(java.awt.Color.black);
        jLabel34.setText("Bill (Room)");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(974, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));

        jPanel15.setBackground(new java.awt.Color(1, 50, 67));

        jPanel16.setBackground(new java.awt.Color(52, 73, 94));
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel16MouseEntered(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(52, 73, 94));

        btnSave1.setBackground(new java.awt.Color(52, 73, 94));
        btnSave1.setFont(new java.awt.Font("Raleway Black", 0, 18)); // NOI18N
        btnSave1.setForeground(java.awt.Color.white);
        btnSave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/save.png"))); // NOI18N
        btnSave1.setText("     Save");
        btnSave1.setBorderPainted(false);
        btnSave1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave1.setFocusPainted(false);
        btnSave1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSave1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSave1MouseEntered(evt);
            }
        });
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSave1)
        );

        jPanel18.setBackground(new java.awt.Color(52, 73, 94));

        btnDelete1.setBackground(new java.awt.Color(52, 73, 94));
        btnDelete1.setFont(new java.awt.Font("Raleway Black", 0, 18)); // NOI18N
        btnDelete1.setForeground(java.awt.Color.white);
        btnDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/delete.png"))); // NOI18N
        btnDelete1.setText("     Delete");
        btnDelete1.setBorder(null);
        btnDelete1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete1.setEnabled(false);
        btnDelete1.setFocusPainted(false);
        btnDelete1.setPreferredSize(new java.awt.Dimension(132, 44));
        btnDelete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDelete1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDelete1MouseEntered(evt);
            }
        });
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(52, 73, 94));

        btnDetails1.setBackground(new java.awt.Color(52, 73, 94));
        btnDetails1.setFont(new java.awt.Font("Raleway Black", 0, 18)); // NOI18N
        btnDetails1.setForeground(java.awt.Color.white);
        btnDetails1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/file.png"))); // NOI18N
        btnDetails1.setText("    Details");
        btnDetails1.setBorderPainted(false);
        btnDetails1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDetails1.setPreferredSize(new java.awt.Dimension(132, 44));
        btnDetails1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDetails1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDetails1MouseEntered(evt);
            }
        });
        btnDetails1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetails1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDetails1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel20.setBackground(new java.awt.Color(52, 73, 94));
        jPanel20.setToolTipText("New");
        jPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel20MouseEntered(evt);
            }
        });

        btnNew1.setBackground(new java.awt.Color(52, 73, 94));
        btnNew1.setFont(new java.awt.Font("Raleway Black", 0, 18)); // NOI18N
        btnNew1.setForeground(java.awt.Color.white);
        btnNew1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/edit.png"))); // NOI18N
        btnNew1.setText("     New");
        btnNew1.setToolTipText("New");
        btnNew1.setBorderPainted(false);
        btnNew1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNew1.setFocusPainted(false);
        btnNew1.setPreferredSize(new java.awt.Dimension(132, 44));
        btnNew1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNew1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNew1MouseEntered(evt);
            }
        });
        btnNew1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNew1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNew1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNew1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel21.setBackground(new java.awt.Color(52, 73, 94));

        btnUpdate1.setBackground(new java.awt.Color(52, 73, 94));
        btnUpdate1.setFont(new java.awt.Font("Raleway Black", 0, 18)); // NOI18N
        btnUpdate1.setForeground(java.awt.Color.white);
        btnUpdate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/update.png"))); // NOI18N
        btnUpdate1.setText("     Update");
        btnUpdate1.setBorder(null);
        btnUpdate1.setBorderPainted(false);
        btnUpdate1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate1.setEnabled(false);
        btnUpdate1.setFocusPainted(false);
        btnUpdate1.setPreferredSize(new java.awt.Dimension(132, 44));
        btnUpdate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdate1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdate1MouseEntered(evt);
            }
        });
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        Home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/home.png"))); // NOI18N
        Home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(Home1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Home1)
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );

        jPanel12.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 770));

        txtAdmitID.setBackground(new java.awt.Color(10, 24, 39));
        txtAdmitID.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtAdmitID.setForeground(java.awt.Color.white);
        txtAdmitID.setBorder(null);
        txtAdmitID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdmitIDActionPerformed(evt);
            }
        });
        jPanel12.add(txtAdmitID, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 130, 80, 30));

        jPanel22.setBackground(new java.awt.Color(255, 255, 254));
        jPanel22.setPreferredSize(new java.awt.Dimension(1190, 800));

        jLabel35.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel35.setText("Bed Charges");

        txtBedCharges.setBackground(new java.awt.Color(255, 255, 254));
        txtBedCharges.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtBedCharges.setBorder(null);

        txtDays.setBackground(new java.awt.Color(255, 255, 254));
        txtDays.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtDays.setBorder(null);
        txtDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDaysActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel36.setText("No.of Days");

        jLabel37.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel37.setText("Total Bed Charges");

        txtTBedCharges.setBackground(new java.awt.Color(255, 255, 254));
        txtTBedCharges.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        txtTBedCharges.setBorder(null);

        jLabel38.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel38.setText("Service Charges");

        txtServiceCharges.setBackground(new java.awt.Color(255, 255, 254));
        txtServiceCharges.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtServiceCharges.setBorder(null);
        txtServiceCharges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServiceChargesActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel39.setText("Billing Date");

        txtBillingDate.setBackground(new java.awt.Color(255, 255, 254));
        txtBillingDate.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtBillingDate.setBorder(null);

        jLabel40.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel40.setText("Payment Mode");

        cmbPaymentMode.setBackground(new java.awt.Color(255, 255, 254));
        cmbPaymentMode.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        cmbPaymentMode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "by Cash", "by DD", "by Cheque", "by Credit Card", "by Debit Card" }));
        cmbPaymentMode.setSelectedIndex(-1);
        cmbPaymentMode.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbPaymentMode.setOpaque(false);
        cmbPaymentMode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPaymentModeItemStateChanged(evt);
            }
        });
        cmbPaymentMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaymentModeActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel41.setText("Total Charges");

        txtTotalCharges.setBackground(new java.awt.Color(255, 255, 254));
        txtTotalCharges.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtTotalCharges.setBorder(null);

        jLabel42.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel42.setText("Paid");

        txtPaid.setBackground(new java.awt.Color(255, 255, 254));
        txtPaid.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtPaid.setBorder(null);
        txtPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaidActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel43.setText("Payment Details");

        txtDueCharges.setBackground(new java.awt.Color(255, 255, 254));
        txtDueCharges.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtDueCharges.setBorder(null);

        jLabel44.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel44.setText("Due Charges");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel38))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator34)
                                    .addComponent(txtBedCharges, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(txtServiceCharges, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(jSeparator33))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36)
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel39)
                                            .addComponent(jLabel42))
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDays, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator35, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBillingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator37, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator39, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addComponent(jLabel37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTBedCharges, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                            .addComponent(jSeparator36)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                        .addComponent(jLabel44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator40)
                                            .addComponent(txtDueCharges, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel40))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotalCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbPaymentMode, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator38, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator32))))
                .addGap(916, 916, 916))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator32, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtBedCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(txtTBedCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(txtDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator33, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator35, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator36, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtServiceCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(txtBillingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator34, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(cmbPaymentMode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel44)
                        .addComponent(txtDueCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel41)
                        .addComponent(txtTotalCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel42)
                        .addComponent(txtPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator38, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator39, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator40, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel12.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 910, 210));

        txtDischargeID.setBackground(new java.awt.Color(10, 24, 39));
        txtDischargeID.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtDischargeID.setForeground(java.awt.Color.white);
        txtDischargeID.setBorder(null);
        jPanel12.add(txtDischargeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 170, 80, 30));

        bill.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        bill.setForeground(java.awt.Color.white);
        bill.setText("Bill No.");
        jPanel12.add(bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, -1, -1));

        discharge.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        discharge.setForeground(java.awt.Color.white);
        discharge.setText("Discharge ID");
        jPanel12.add(discharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 170, -1, -1));

        txtBillNo.setBackground(new java.awt.Color(10, 24, 39));
        txtBillNo.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtBillNo.setForeground(java.awt.Color.white);
        txtBillNo.setBorder(null);
        jPanel12.add(txtBillNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 210, 80, 30));

        admit.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        admit.setForeground(java.awt.Color.white);
        admit.setText("AdmitID");
        jPanel12.add(admit, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 254));
        jPanel1.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel3.setText("Patient id:");

        jLabel4.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel4.setText("Patient Name:");

        jLabel5.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel6.setText("Blood Group");

        jLabel8.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel8.setText("Disease");

        jLabel9.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel9.setText("Admit Date");

        jLabel2.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel2.setText("Ward Name");

        jLabel12.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel12.setText("Doctor id");

        jLabel10.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel10.setText("Doctor Name");

        txtPatientID.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtPatientID.setBorder(null);

        txtPatientName.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtPatientName.setBorder(null);

        txtDisease.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtDisease.setBorder(null);

        txtDoctorID.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtDoctorID.setBorder(null);

        txtDoctorName.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtDoctorName.setBorder(null);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtGender.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtGender.setBorder(null);

        txtBloodGroup.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtBloodGroup.setBorder(null);

        txtAdmitDate.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtAdmitDate.setBorder(null);

        txtWardName.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtWardName.setBorder(null);

        jLabel22.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        jLabel22.setText("Discharge Date");

        txtDischargeDate.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        txtDischargeDate.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(57, 57, 57))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel22))
                                .addGap(22, 22, 22)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtGender, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBloodGroup, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                            .addComponent(txtPatientID, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDischargeDate, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDoctorID, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(txtDisease, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(txtAdmitDate, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(txtWardName, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(20, 20, 20))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPatientID, txtPatientName});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtAdmitDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWardName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtDischargeDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel12.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 420, -1));

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 790));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 800));

        setSize(new java.awt.Dimension(1188, 723));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
 
    
 
      
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
   try{
            con=Connect.ConnectDB();
              if (txtPatientID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve Patient ID","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtDays.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter no. of days","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           if (txtServiceCharges.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve service charges","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
            if (txtBillingDate.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter billing date","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtPaid.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter total paid","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
                double add1 = Double.parseDouble(txtTotalCharges.getText());
                double add2 = Double.parseDouble(txtPaid.getText());
             if (add2 > add1) {
                JOptionPane.showMessageDialog( this, "Total Paid is more than total Charges","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        Statement stmt;
       stmt= con.createStatement();
       String sql1="Select DischargeID from Bill_Ward where DischargeID= " + txtDischargeID.getText() + "";
      rs=stmt.executeQuery(sql1);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "Record already exists","Error", JOptionPane.ERROR_MESSAGE);
        return;
      }
     
            String sql= "insert into Bill_Ward(`DischargeID`, `BillingDate`, `NoOfDays`, `BedCharges`, `TotalBedCharges`, `ServiceCharges`, `TotalCharges`, `PaymentMode`, `ChargesPaid`, `DueCharges`)values('"+txtDischargeID.getText()+"','"+txtBillingDate.getText()+"','"+txtDays.getText()+"','"+txtBedCharges.getText()+"','"+txtTBedCharges.getText()+"','"+txtServiceCharges.getText()+"','"+txtTotalCharges.getText()+"','"+cmbPaymentMode.getSelectedItem()+"','"+txtPaid.getText() +"','"+txtDueCharges.getText() +"')";
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully saved","Record",JOptionPane.INFORMATION_MESSAGE);
            btnSave.setEnabled(false);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }   
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        Reset();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        this.dispose();
        Bill_Ward_Record frm= new Bill_Ward_Record();
        frm.setVisible(true);
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
 try{
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from Bill_Ward where BillNo = '"+txtDischargeID.getText()+"'";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);
                Reset();
                cmbPaymentMode.setSelectedIndex(-1);
                txtAdmitID.setText("");
                txtBillNo.setText("");
                txtDischargeID.setText("");
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }       
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    try{
            con=Connect.ConnectDB();
            String sql= "update Bill_Ward set DischargeID="+ txtDischargeID.getText() + ",BillingDate='"+ txtBillingDate.getText() + "',BedCharges="+ txtBedCharges.getText() + ",ServiceCharges="+ txtServiceCharges.getText() + ",PaymentMode='" + cmbPaymentMode.getSelectedItem()+ "',ChargesPaid="+ txtPaid.getText() + ",DueCharges="+ txtDueCharges.getText() + ",TotalCharges="+ txtTotalCharges.getText() + ",NoOfDays="+ txtDays.getText() +",TotalBedCharges=" + txtTBedCharges.getText() + " where BillNo= " + txtBillNo.getText() +"";
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully Updated","Record",JOptionPane.INFORMATION_MESSAGE);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Patient_Discharge_Ward_Record1 frm=new Patient_Discharge_Ward_Record1();
        frm.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSave1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSave1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSave1MouseExited

    private void btnSave1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSave1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSave1MouseEntered

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnDelete1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelete1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelete1MouseExited

    private void btnDelete1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelete1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelete1MouseEntered

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnDetails1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetails1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDetails1MouseExited

    private void btnDetails1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetails1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDetails1MouseEntered

    private void btnDetails1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetails1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDetails1ActionPerformed

    private void btnNew1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNew1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNew1MouseExited

    private void btnNew1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNew1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNew1MouseEntered

    private void btnNew1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNew1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNew1ActionPerformed

    private void jPanel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel20MouseEntered

    private void btnUpdate1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdate1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdate1MouseExited

    private void btnUpdate1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdate1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdate1MouseEntered

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void jPanel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel16MouseEntered

    private void Home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Home1MouseClicked

    private void txtDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDaysActionPerformed
       
        double add1 = Double.parseDouble(txtBedCharges.getText());
        double add = Double.parseDouble(txtDays.getText());
        double add2= add * add1;
        String add3= Double.toString(add2);
        txtTBedCharges.setText(add3);
    }//GEN-LAST:event_txtDaysActionPerformed

    private void txtServiceChargesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServiceChargesActionPerformed
        double add4=Double.parseDouble(txtTBedCharges.getText());
        double add5 = Double.parseDouble(txtServiceCharges.getText());
        double add6= add4 + add5;
        String add7= Double.toString(add6);
        txtTotalCharges.setText(add7);  
    }//GEN-LAST:event_txtServiceChargesActionPerformed

    private void cmbPaymentModeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPaymentModeItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPaymentModeItemStateChanged

    private void cmbPaymentModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaymentModeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPaymentModeActionPerformed

    private void txtPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaidActionPerformed
       
        double add8=Double.parseDouble(txtTotalCharges.getText());
        double add9 = Double.parseDouble(txtPaid.getText());
        double add10= add8 - add9;
        String add11= Double.toString(add10);
        txtDueCharges.setText(add11);// TODO add your handling code here:
    }//GEN-LAST:event_txtPaidActionPerformed

    private void txtAdmitIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdmitIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdmitIDActionPerformed
private void Reset()
{
    txtPatientID.setText("");
    txtPatientName.setText("");
    txtBloodGroup.setText("");
    txtGender.setText("");
    txtDisease.setText("");
    txtAdmitDate.setText("");
    txtWardName.setText("");
    txtDoctorID.setText("");
    txtDoctorName.setText("");
    
    txtDischargeDate.setText("");
    txtBedCharges.setText("");
    txtDays.setText("");
    txtTBedCharges.setText("");
    txtServiceCharges.setText("");
    txtBillingDate.setText("");
    cmbPaymentMode.setSelectedItem(-1);
    txtTotalCharges.setText("");
    txtPaid.setText("");
    txtDueCharges.setText("");
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
            java.util.logging.Logger.getLogger(Bill_Ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill_Ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill_Ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill_Ward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill_Ward().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Home1;
    public javax.swing.JLabel admit;
    public javax.swing.JLabel bill;
    public javax.swing.JButton btnDelete;
    public javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnDetails1;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNew1;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnSave1;
    public javax.swing.JButton btnUpdate;
    public javax.swing.JButton btnUpdate1;
    public javax.swing.JComboBox cmbPaymentMode;
    public javax.swing.JLabel discharge;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator40;
    public javax.swing.JTextField txtAdmitDate;
    public javax.swing.JTextField txtAdmitID;
    public javax.swing.JTextField txtBedCharges;
    public javax.swing.JTextField txtBillNo;
    public javax.swing.JTextField txtBillingDate;
    public javax.swing.JTextField txtBloodGroup;
    public javax.swing.JTextField txtDays;
    public javax.swing.JTextField txtDischargeDate;
    public javax.swing.JTextField txtDischargeID;
    public javax.swing.JTextField txtDisease;
    public javax.swing.JTextField txtDoctorID;
    public javax.swing.JTextField txtDoctorName;
    public javax.swing.JTextField txtDueCharges;
    public javax.swing.JTextField txtGender;
    public javax.swing.JTextField txtPaid;
    public javax.swing.JTextField txtPatientID;
    public javax.swing.JTextField txtPatientName;
    public javax.swing.JTextField txtServiceCharges;
    public javax.swing.JTextField txtTBedCharges;
    public javax.swing.JTextField txtTotalCharges;
    public javax.swing.JTextField txtWardName;
    // End of variables declaration//GEN-END:variables

    private void Get_Data() {
            
} //To change body of generated methods, choose Tools | Templates.
    }

