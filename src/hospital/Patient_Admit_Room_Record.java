/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author dev
 */
public class Patient_Admit_Room_Record extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form Doctor
     */
    public Patient_Admit_Room_Record() {
             initComponents();
             con=Connect.ConnectDB();
             Get_Data();
             setLocationRelativeTo(null);
            TblDoc.getTableHeader().setOpaque(false);
             TblDoc.getTableHeader().setForeground(new Color (38, 166, 91));
             TblDoc.getTableHeader().setFont(new Font("URW Palladio L",Font.PLAIN,18)); 
             
    }
 
    private void Get_Data(){
       String sql="Select AdmitID as 'Admit ID',Patient.PatientID as 'Patient ID',Patient.PatientName as 'Patient Name',Patient.Gender as 'Gender',Patient.BloodGroup as 'Blood Group',Disease,AdmitDate as 'Admit Date',Room.RoomNo as 'Room No',Doctor.DoctorID as 'Doctor ID',DoctorName as 'Doctor Name',Patient_Admit_Room.Remarks as 'Remarks' from Room,Doctor,Patient,Patient_Admit_Room where Room.RoomNo=Patient_Admit_Room.RoomNo and Doctor.DoctorID=Patient_Admit_Room.DoctorID and Patient.PatientID=Patient_Admit_Room.PatientID order by AdmitID";
         try{
               pst=con.prepareStatement(sql);
               rs=pst.executeQuery();
               TblDoc.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblDoc = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(10, 24, 39));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(236, 236, 236));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Playfair Display Black", 0, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Patient Admit Room Details");

        jPanel5.setBackground(new java.awt.Color(47, 50, 176));
        jPanel5.setPreferredSize(new java.awt.Dimension(40, 30));

        jLabel7.setFont(new java.awt.Font("URW Palladio L", 1, 24)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jLabel7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel7KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 917, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 40));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 1, true));

        TblDoc.setAutoCreateRowSorter(true);
        TblDoc.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        TblDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TblDoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TblDoc.setGridColor(java.awt.Color.pink);
        TblDoc.setRowHeight(25);
        TblDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblDocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblDoc);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 1230, 528));

        jPanel1.setBackground(new java.awt.Color(10, 24, 39));
        jPanel1.setForeground(new java.awt.Color(10, 24, 39));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1310, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 740));

        setSize(new java.awt.Dimension(1306, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TblDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblDocMouseClicked
            try{
            con=Connect.ConnectDB();
            int row=TblDoc.getSelectedRow();
            String table_click= TblDoc.getModel().getValueAt(row, 0).toString();
            String sql="Select * from Room,Doctor,Patient,Patient_Admit_Room where Room.RoomNo=Patient_Admit_Room.RoomNo and Doctor.DoctorID=Patient_Admit_Room.DoctorID and Patient.PatientID=Patient_Admit_Room.PatientID and AdmitID=" + table_click + ""; 
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                this.hide();
                Patient_Admit_Room d=new Patient_Admit_Room();
                d.setVisible(true);
                d.txtAdmitID.setVisible(true);
                 String add1=rs.getString("AdmitID");
                d.txtAdmitID.setText(add1);
                String add2=rs.getString("PatientID");
                d.txtPatientID.setText(add2);
                String add12=rs.getString("PatientName");
                d.txtPatientName.setText(add12);
                 String add4=rs.getString("Gender");
                d.cmbGender.setSelectedItem(add4);
                String add8=rs.getString("BloodGroup");
                d.cmbBloodGroup.setSelectedItem(add8);
                 String add10=rs.getString("Email");
                d.txtEmail.setText(add10);
                String add3=rs.getString("Disease");
                d.txtDisease.setText(add3);
                String add5=rs.getString("AdmitDate");
                d.txtAdmitDate.setText(add5);
                String add6=rs.getString("RoomNo");
                d.cmbRoomNo.setSelectedItem(add6);
                String add7=rs.getString("DoctorID");
                d.txtDoctorID.setText(add7);
                String add11=rs.getString("DoctorName");
                d.txtDoctorName.setText(add11);
                String add9=rs.getString("Remarks");
                d.txtRemarks.setText(add9);
      
                d.admit.setVisible(false);
                d.txtAdmitID.setVisible(false);
                d.btnUpdate.setEnabled(true);
                d.btnDelete.setEnabled(true);
                d.btnSave.setEnabled(false);
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
    }//GEN-LAST:event_TblDocMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.hide();
        Patient_Admit_Room frm=new Patient_Admit_Room();
        frm.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel7KeyPressed

    }//GEN-LAST:event_jLabel7KeyPressed


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
            java.util.logging.Logger.getLogger(Patient_Admit_Room_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_Admit_Room_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_Admit_Room_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_Admit_Room_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Patient_Admit_Room_Record().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
