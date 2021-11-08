/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uh;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;
public class addgrp extends javax.swing.JFrame {

    /**
     * Creates new form addgrp
     */
    public addgrp() {
        initComponents();
    }
    
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    
    
    
    
    @SuppressWarnings("unchecked")
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPmenu = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Jpbinome = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ntf = new javax.swing.JTextField();
        Addbuttonetd = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jPmenu.setBackground(new java.awt.Color(255, 153, 0));
        jPmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPmenu.setName(""); // NOI18N
        jPmenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPmenuMouseMoved(evt);
            }
        });
        jPmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPmenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPmenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPmenuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPmenuMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPmenuMouseReleased(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Menu");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/home (1).png"))); // NOI18N

        javax.swing.GroupLayout jPmenuLayout = new javax.swing.GroupLayout(jPmenu);
        jPmenu.setLayout(jPmenuLayout);
        jPmenuLayout.setHorizontalGroup(
            jPmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPmenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPmenuLayout.setVerticalGroup(
            jPmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPmenuLayout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Jpbinome.setBackground(new java.awt.Color(255, 153, 0));
        Jpbinome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jpbinome.setName(""); // NOI18N
        Jpbinome.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JpbinomeMouseMoved(evt);
            }
        });
        Jpbinome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JpbinomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JpbinomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JpbinomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JpbinomeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JpbinomeMouseReleased(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/undo.png"))); // NOI18N

        javax.swing.GroupLayout JpbinomeLayout = new javax.swing.GroupLayout(Jpbinome);
        Jpbinome.setLayout(JpbinomeLayout);
        JpbinomeLayout.setHorizontalGroup(
            JpbinomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpbinomeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel21)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        JpbinomeLayout.setVerticalGroup(
            JpbinomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Jpbinome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jpbinome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Numero du groupe :");

        ntf.setBackground(new java.awt.Color(0, 102, 102));
        ntf.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ntf.setForeground(new java.awt.Color(255, 255, 255));
        ntf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ntf.setBorder(null);
        ntf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ntfActionPerformed(evt);
            }
        });
        ntf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ntfKeyPressed(evt);
            }
        });

        Addbuttonetd.setBackground(new java.awt.Color(255, 153, 0));
        Addbuttonetd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Addbuttonetd.setName(""); // NOI18N
        Addbuttonetd.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AddbuttonetdMouseMoved(evt);
            }
        });
        Addbuttonetd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddbuttonetdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddbuttonetdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddbuttonetdMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AddbuttonetdMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AddbuttonetdMouseReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ajouter");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/resized.png"))); // NOI18N

        javax.swing.GroupLayout AddbuttonetdLayout = new javax.swing.GroupLayout(Addbuttonetd);
        Addbuttonetd.setLayout(AddbuttonetdLayout);
        AddbuttonetdLayout.setHorizontalGroup(
            AddbuttonetdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddbuttonetdLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        AddbuttonetdLayout.setVerticalGroup(
            AddbuttonetdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddbuttonetdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/student-with-graduation-cap.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ntf, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(jSeparator1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(Addbuttonetd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel6)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel6)
                .addGap(92, 92, 92)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ntf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(Addbuttonetd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPmenuMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPmenuMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPmenuMouseMoved

    private void jPmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPmenuMouseClicked
        ok p0 = new ok();
        p0.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPmenuMouseClicked

    private void jPmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPmenuMouseEntered
        jPmenu.setBackground(new java.awt.Color(255,184,79));        // TODO add your handling code here:
    }//GEN-LAST:event_jPmenuMouseEntered

    private void jPmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPmenuMouseExited
        jPmenu.setBackground(new java.awt.Color(255,153,0));  // TODO add your handling code here:
    }//GEN-LAST:event_jPmenuMouseExited

    private void jPmenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPmenuMousePressed
        // TODO add your handling code here: 219,98,0
        jPmenu.setBackground(new java.awt.Color(219,98,0));
    }//GEN-LAST:event_jPmenuMousePressed

    private void jPmenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPmenuMouseReleased
        // TODO add your handling code here:
        jPmenu.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_jPmenuMouseReleased

    private void JpbinomeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpbinomeMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_JpbinomeMouseMoved

    private void JpbinomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpbinomeMouseClicked
        grp p0 = new grp();
        p0.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JpbinomeMouseClicked

    private void JpbinomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpbinomeMouseEntered
        Jpbinome.setBackground(new java.awt.Color(255,184,79));        // TODO add your handling code here:
    }//GEN-LAST:event_JpbinomeMouseEntered

    private void JpbinomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpbinomeMouseExited
        Jpbinome.setBackground(new java.awt.Color(255,153,0));  // TODO add your handling code here:
    }//GEN-LAST:event_JpbinomeMouseExited

    private void JpbinomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpbinomeMousePressed
        // TODO add your handling code here: 219,98,0
        Jpbinome.setBackground(new java.awt.Color(219,98,0));
    }//GEN-LAST:event_JpbinomeMousePressed

    private void JpbinomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpbinomeMouseReleased
        // TODO add your handling code here:
        Jpbinome.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_JpbinomeMouseReleased

    private void ntfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ntfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ntfActionPerformed

    private void AddbuttonetdMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonetdMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_AddbuttonetdMouseMoved

    private void AddbuttonetdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonetdMouseClicked
        
        String test = String.valueOf(ntf.getText());
        String t=null;
        try {   //get InsNum number from table and make it an ineger 

                int id1 = Integer.parseInt(test);
                
                
                conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                stmt = conn.createStatement();
                String sql="SELECT * FROM groupe Where IdGroupe='"+id1+"'";
                rs=stmt.executeQuery(sql);
                while(rs.next()){
                    t = String.valueOf(rs.getInt("IdGroupe"));  
                }
                

            } catch (Exception e) {
                System.out.println(e.getMessage());
         
            }
        
        
        
        System.out.println(t);
        
        
     
        
       
       if (t==null){
        String Nom = String.valueOf(ntf.getText());
        

        try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            stmt = conn.createStatement();
            String sql="INSERT INTO groupe(IdGroupe) VALUES ('"+Nom+"')";
            stmt.executeUpdate(sql);

            JOptionPane.showMessageDialog(null,"L'ajout a été effectuée");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Tous les champs n'ont pas ete renseignés");
        }}else{
       JOptionPane.showMessageDialog(null,"Le groupe "+test+" éxiste déja!");
       }

    }//GEN-LAST:event_AddbuttonetdMouseClicked

    private void AddbuttonetdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonetdMouseEntered
        Addbuttonetd.setBackground(new java.awt.Color(255,184,79));        // TODO add your handling code here:
    }//GEN-LAST:event_AddbuttonetdMouseEntered

    private void AddbuttonetdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonetdMouseExited
        Addbuttonetd.setBackground(new java.awt.Color(255,153,0));  // TODO add your handling code here:
    }//GEN-LAST:event_AddbuttonetdMouseExited

    private void AddbuttonetdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonetdMousePressed
        // TODO add your handling code here: 219,98,0
        Addbuttonetd.setBackground(new java.awt.Color(219,98,0));
    }//GEN-LAST:event_AddbuttonetdMousePressed

    private void AddbuttonetdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonetdMouseReleased
        // TODO add your handling code here:
        Addbuttonetd.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_AddbuttonetdMouseReleased

    private void ntfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ntfKeyPressed
    char nnn = evt.getKeyChar();
        if (Character.isDigit(nnn)||Character.isISOControl(nnn)){
        ntf.setEditable(true);
        }
        else  {
        ntf.setEditable(false);
        } 
    }//GEN-LAST:event_ntfKeyPressed

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
            java.util.logging.Logger.getLogger(addgrp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addgrp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addgrp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addgrp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addgrp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Addbuttonetd;
    private javax.swing.JPanel Jpbinome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPmenu;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField ntf;
    // End of variables declaration//GEN-END:variables
}
