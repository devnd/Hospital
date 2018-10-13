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
public class Bill_Ward_Record extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form Doctor
     */
    public Bill_Ward_Record() {
             initComponents();
             con=Connect.ConnectDB();
             Get_Data();
             setLocationRelativeTo(null);
            TblDoc.getTableHeader().setOpaque(false);
             TblDoc.getTableHeader().setForeground(new Color (38, 166, 91));
             TblDoc.getTableHeader().setFont(new Font("URW Palladio L",Font.PLAIN,18)); 
             
    }
 
    private void Get_Data(){
        try{
                 String sql="Select BillNo as 'Bill No.',Patient_Discharge_Ward.ID as 'Discharge ID', Patient_Admit_Ward.AdmitID as 'Admit ID',Patient.PatientID as 'Patient ID',Patient.PatientName as 'Patient Name',Patient.Gender as 'Gender',Patient.BloodGroup as 'Blood Group',Disease,AdmitDate as 'Admit Date',Ward.WardName as 'Ward',Doctor.DoctorID as 'Doctor ID',DoctorName as 'Doctor Name',DischargeDate as 'Discharge Date',Bill_Ward.BedCharges as ' Charges',Bill_Ward.ServiceCharges as 'Service Charges',Bill_Ward.BillingDate as 'Billing Date',PaymentMode as 'Payement Mode',TotalCharges as 'Total Charges',ChargesPaid as 'Charges Paid',DueCharges as 'Due Charges',NoOfDays as 'No. Of Days',TotalBedCharges as 'Total Room Charges' from Ward,Doctor,Patient,Patient_Admit_Ward,Patient_Discharge_Ward,Bill_Ward where Ward.WardName=Patient_Admit_Ward.WardName and Doctor.DoctorID=Patient_Admit_Ward.DoctorID and Patient.PatientID=Patient_Admit_Ward.PatientID  and Patient_Admit_Ward.AdmitID= Patient_Discharge_Ward.AdmitID and Bill_Ward.DischargeID=Patient_Discharge_Ward.ID  order by BillingDate"; 
       pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
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
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Playfair Display Black", 0, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Patient Discharge Room Details");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 0, -1, 40));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, 40, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 40));

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
            .addGap(0, 1330, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 740));

        setSize(new java.awt.Dimension(1315, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TblDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblDocMouseClicked
 try{
            con=Connect.ConnectDB();
            int row= TblDoc.getSelectedRow();
            String table_click= TblDoc.getModel().getValueAt(row, 0).toString(); 
            String sql="Select *,Patient_Discharge_Ward.ID as 'Discharge ID', Patient_Admit_Ward.AdmitID as 'Admit ID',Patient.PatientID as 'Patient ID',Patient.PatientName as 'Patient Name',Patient.Gender as 'Gender',Patient.BloodGroup as 'Blood Group',Disease,AdmitDate as 'Admit Date',Ward.WardName as 'Ward',Doctor.DoctorID as 'Doctor ID',DoctorName as 'Doctor Name',DischargeDate as 'Discharge Date',Bill_Ward.BedCharges as 'Bed Charges',Bill_Ward.ServiceCharges as 'Service Charges',Bill_Ward.BillingDate as 'Billing Date',PaymentMode as 'Payement Mode',TotalCharges as 'Total Charges',ChargesPaid as 'Charges Paid',DueCharges as 'Due Charges',NoOfDays as 'No. Of Days',TotalBedCharges as 'Total Bed Charges' from Ward,Doctor,Patient,Patient_Admit_Ward,Patient_Discharge_Ward,Bill_Ward where Ward.WardName=Patient_Admit_Ward.WardName and Doctor.DoctorID=Patient_Admit_Ward.DoctorID and Patient.PatientID=Patient_Admit_Ward.PatientID  and Patient_Admit_Ward.AdmitID= Patient_Discharge_Ward.AdmitID and Bill_Ward.DischargeID=Patient_Discharge_Ward.ID  order by BillingDate"; 
             pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
            if(rs.next()){
                this.hide();
                Bill_Ward frm = new Bill_Ward();
                frm.setVisible(true);
                String add1=rs.getString("PatientID");
                frm.txtPatientID.setText(add1);
                String add2=rs.getString("PatientName");
                frm.txtPatientName.setText(add2);
                String add3=rs.getString("Gender");
                frm.txtGender.setText(add3);
                String add5=rs.getString("BloodGroup");
                frm.txtBloodGroup.setText(add5);
                String add6=rs.getString("Disease");
                frm.txtDisease.setText(add6);
                String add7=rs.getString("AdmitDate");
                frm.txtAdmitDate.setText(add7);
                String add9=rs.getString("WardName");
                frm.txtWardName.setText(add9);
                String add11=rs.getString("DoctorID");
                frm.txtDoctorID.setText(add11);
                String add14=rs.getString("DoctorName");
                frm.txtDoctorName.setText(add14);
                String add15=rs.getString("DischargeID");
                frm.txtDischargeID.setText(add15);
                String add16=rs.getString("DischargeDate");
                frm.txtDischargeDate.setText(add16);
                String add17=rs.getString("BedCharges");
                frm.txtBedCharges.setText(add17);
                String add18=rs.getString("NoOfDays");
                frm.txtDays.setText(add18);
                String add19=rs.getString("TotalBedCharges");
                frm.txtTBedCharges.setText(add19);
                String add20=rs.getString("ServiceCharges");
                frm.txtServiceCharges.setText(add20);
                String add21=rs.getString("BillingDate");
                frm.txtBillingDate.setText(add21);
                String add22=rs.getString("PaymentMode");
                frm.cmbPaymentMode.setSelectedItem(add22);
                String add23=rs.getString("TotalCharges");
                frm.txtTotalCharges.setText(add23);
                String add24=rs.getString("ChargesPaid");
                frm.txtPaid.setText(add24);
                String add25=rs.getString("DueCharges");
                frm.txtDueCharges.setText(add25);
                String add26=rs.getString("BillNo");
                frm.txtBillNo.setText(add26);
                
                
                  String add27=rs.getString("AdmitID");
                frm.txtAdmitID.setText(add27);
             
                
                
                
                
                frm.btnUpdate.setEnabled(true);
                frm.btnDelete.setEnabled(true);
                frm.btnSave.setEnabled(false);
                 }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }     
    }//GEN-LAST:event_TblDocMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();
        Bill_Ward frm=new Bill_Ward();
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
            java.util.logging.Logger.getLogger(Bill_Ward_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill_Ward_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill_Ward_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill_Ward_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Bill_Ward_Record().setVisible(true);
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