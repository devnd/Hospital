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
public class Doctor_Record extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form Doctor
     */
    public Doctor_Record() {
             initComponents();
             con=Connect.ConnectDB();
             Get_Data();
             setLocationRelativeTo(null);
            TblDoc.getTableHeader().setOpaque(false);
             TblDoc.getTableHeader().setForeground(new Color (38, 166, 91));
             TblDoc.getTableHeader().setFont(new Font("URW Palladio L",Font.PLAIN,18)); 
             
    }
 
    private void Get_Data(){
       String sql="select DoctorID as 'D_ ID', DoctorName as 'Doctor Name',FathersName as 'Father Name',Address,ContactNo as 'Contact No',Email as 'Email ID',Qualifications,Specialization,Gender,Bloodgroup as 'Blood Group',DateOfJoining as 'Joining Date' from Doctor order by DoctorName"; 
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
        jLabel1.setText("Doctors Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(1098, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
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
            .addGap(0, 1320, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 740));

        setSize(new java.awt.Dimension(1325, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TblDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblDocMouseClicked
            try{
            con=Connect.ConnectDB();
            int row=TblDoc.getSelectedRow();
            String table_click= TblDoc.getModel().getValueAt(row, 0).toString();
            String sql= "select * from Doctor where DoctorID = '" + table_click + "'";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                this.hide();
                Doctor d=new Doctor();
                d.setVisible(true);
                String add1=rs.getString("DoctorID");
                d.txtDoctorID.setText(add1);
                String add2=rs.getString("DoctorName");
                d.txtDoctorName.setText(add2);
                String add3=rs.getString("Fathersname");
                d.txtDoctorFName.setText(add3);
                String add5=rs.getString("Email");
                d.txtEmail.setText(add5);
                String add6=rs.getString("Qualifications");
                d.txtQualification.setText(add6);
                String add7=rs.getString("Specialization");
                d.txtSpecialization.setText(add7);
                String add9=rs.getString("BloodGroup");
                d.cmbBloodGroup.setSelectedItem(add9);
                String add11=rs.getString("Gender");
                d.cmbGender.setSelectedItem(add11);
                String add14=rs.getString("DateOfJoining");
                d.txtDateOfJoining.setText(add14);
                String add15=rs.getString("Address");
                d.txtAddress.setText(add15);
                String add16=rs.getString("ContactNo");
                d.txtContact.setText(add16);
                d.btnUpdate.setEnabled(true);
                d.btnDelete.setEnabled(true);
                d.btnSave.setEnabled(false);
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
    }//GEN-LAST:event_TblDocMouseClicked


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
            java.util.logging.Logger.getLogger(Doctor_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Doctor_Record().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
