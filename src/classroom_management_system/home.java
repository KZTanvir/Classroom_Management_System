/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package classroom_management_system;

import javax.swing.JFrame;


/**
 *
 * @author Tanvir Zaman
 */
public class home extends javax.swing.JFrame {

    /** Creates new form cms_main_frame */
    public home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        minimized = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        REGISTRATION = new javax.swing.JPanel();
        login_header1 = new javax.swing.JPanel();
        login_title1 = new javax.swing.JLabel();
        student_name_label = new javax.swing.JLabel();
        student_first_name_label = new javax.swing.JLabel();
        student_last_name_lebel = new javax.swing.JLabel();
        student_father_name_label = new javax.swing.JLabel();
        student_mother_name_lable = new javax.swing.JLabel();
        student_address_lebel = new javax.swing.JLabel();
        student_roll_label = new javax.swing.JLabel();
        student_class_label = new javax.swing.JLabel();
        student_year_label = new javax.swing.JLabel();
        student_name_label1 = new javax.swing.JLabel();
        s_year = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(231, 86, 106));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(107, 98, 185));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 1, true));
        jPanel1.setForeground(new java.awt.Color(135, 189, 174));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Classroom Management System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 370, 40));

        jPanel5.setBackground(new java.awt.Color(84, 84, 84));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 1, true));

        minimized.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        minimized.setForeground(new java.awt.Color(255, 255, 255));
        minimized.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimized.setText("__");
        minimized.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizedMouseClicked(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancel.setText("X");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(minimized, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimized))
                .addGap(7, 7, 7))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 80, 30));

        jPanel2.setBackground(new java.awt.Color(40, 34, 63));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 102)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        REGISTRATION.setBackground(new java.awt.Color(107, 98, 185));
        REGISTRATION.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        REGISTRATION.setMinimumSize(new java.awt.Dimension(0, 0));
        REGISTRATION.setPreferredSize(new java.awt.Dimension(420, 380));
        REGISTRATION.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_header1.setBackground(new java.awt.Color(40, 34, 63));
        login_header1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_title1.setBackground(new java.awt.Color(40, 34, 63));
        login_title1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        login_title1.setForeground(new java.awt.Color(107, 98, 185));
        login_title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_title1.setText("Information");
        login_header1.add(login_title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 394, -1));

        REGISTRATION.add(login_header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 418, 60));

        student_name_label.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        student_name_label.setForeground(new java.awt.Color(0, 255, 204));
        student_name_label.setText("Username:");
        REGISTRATION.add(student_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, -1));

        student_first_name_label.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        student_first_name_label.setForeground(new java.awt.Color(0, 255, 204));
        student_first_name_label.setText("First Name");
        REGISTRATION.add(student_first_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 117, -1));

        student_last_name_lebel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        student_last_name_lebel.setForeground(new java.awt.Color(0, 255, 204));
        student_last_name_lebel.setText("Last Name");
        REGISTRATION.add(student_last_name_lebel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 117, -1));

        student_father_name_label.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        student_father_name_label.setForeground(new java.awt.Color(0, 255, 204));
        student_father_name_label.setText("Father Name");
        REGISTRATION.add(student_father_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 117, -1));

        student_mother_name_lable.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        student_mother_name_lable.setForeground(new java.awt.Color(0, 255, 204));
        student_mother_name_lable.setText("Mother Name");
        REGISTRATION.add(student_mother_name_lable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 117, -1));

        student_address_lebel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        student_address_lebel.setForeground(new java.awt.Color(0, 255, 204));
        student_address_lebel.setText("Address");
        REGISTRATION.add(student_address_lebel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 117, -1));

        student_roll_label.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        student_roll_label.setForeground(new java.awt.Color(0, 255, 204));
        student_roll_label.setText("Roll");
        REGISTRATION.add(student_roll_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 117, -1));

        student_class_label.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        student_class_label.setForeground(new java.awt.Color(0, 255, 204));
        student_class_label.setText("Class");
        REGISTRATION.add(student_class_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 117, -1));

        student_year_label.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        student_year_label.setForeground(new java.awt.Color(0, 255, 204));
        student_year_label.setText("Year");
        REGISTRATION.add(student_year_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 117, -1));

        student_name_label1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        student_name_label1.setForeground(new java.awt.Color(0, 255, 204));
        student_name_label1.setText("Name");
        REGISTRATION.add(student_name_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 117, -1));

        s_year.setForeground(new java.awt.Color(239, 247, 50));
        s_year.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        REGISTRATION.add(s_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 260, 20));

        jLabel3.setForeground(new java.awt.Color(239, 247, 50));
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        REGISTRATION.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 260, 20));

        jLabel4.setForeground(new java.awt.Color(239, 247, 50));
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        REGISTRATION.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 260, 20));

        jLabel5.setForeground(new java.awt.Color(239, 247, 50));
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        REGISTRATION.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 260, 20));

        jLabel6.setForeground(new java.awt.Color(239, 247, 50));
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        REGISTRATION.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 260, 20));

        jLabel7.setForeground(new java.awt.Color(239, 247, 50));
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        REGISTRATION.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 260, 20));

        jLabel8.setForeground(new java.awt.Color(239, 247, 50));
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        REGISTRATION.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 260, 20));

        jLabel9.setForeground(new java.awt.Color(239, 247, 50));
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        REGISTRATION.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 260, 20));

        jLabel10.setForeground(new java.awt.Color(239, 247, 50));
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        REGISTRATION.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 260, 20));

        jLabel11.setForeground(new java.awt.Color(239, 247, 50));
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        REGISTRATION.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 260, 20));

        jPanel2.add(REGISTRATION, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cancelMouseClicked

    private void minimizedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizedMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizedMouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel REGISTRATION;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel login_header1;
    private javax.swing.JLabel login_title1;
    private javax.swing.JLabel minimized;
    private javax.swing.JLabel s_year;
    private javax.swing.JLabel student_address_lebel;
    private javax.swing.JLabel student_class_label;
    private javax.swing.JLabel student_father_name_label;
    private javax.swing.JLabel student_first_name_label;
    private javax.swing.JLabel student_last_name_lebel;
    private javax.swing.JLabel student_mother_name_lable;
    private javax.swing.JLabel student_name_label;
    private javax.swing.JLabel student_name_label1;
    private javax.swing.JLabel student_roll_label;
    private javax.swing.JLabel student_year_label;
    // End of variables declaration//GEN-END:variables

}
