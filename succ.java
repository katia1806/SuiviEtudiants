/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uh;

/**
 *
 * @author Bouguessa
 */
public class succ extends javax.swing.JFrame {

    /**
     * Creates new form succ
     */
    public succ() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Addbutton = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("L'ajout a été effectué");

        Addbutton.setBackground(new java.awt.Color(255, 153, 0));
        Addbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Addbutton.setName(""); // NOI18N
        Addbutton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AddbuttonMouseMoved(evt);
            }
        });
        Addbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddbuttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AddbuttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AddbuttonMouseReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("OK");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/checked.png"))); // NOI18N

        javax.swing.GroupLayout AddbuttonLayout = new javax.swing.GroupLayout(Addbutton);
        Addbutton.setLayout(AddbuttonLayout);
        AddbuttonLayout.setHorizontalGroup(
            AddbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddbuttonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        AddbuttonLayout.setVerticalGroup(
            AddbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddbuttonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel3)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(Addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddbuttonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_AddbuttonMouseMoved

    private void AddbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonMouseClicked

        this.dispose();
    }//GEN-LAST:event_AddbuttonMouseClicked

    private void AddbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonMouseEntered
        Addbutton.setBackground(new java.awt.Color(255,184,79));        // TODO add your handling code here:
    }//GEN-LAST:event_AddbuttonMouseEntered

    private void AddbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonMouseExited
        Addbutton.setBackground(new java.awt.Color(255,153,0));  // TODO add your handling code here:
    }//GEN-LAST:event_AddbuttonMouseExited

    private void AddbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonMousePressed
        // TODO add your handling code here: 219,98,0
        Addbutton.setBackground(new java.awt.Color(219,98,0));
    }//GEN-LAST:event_AddbuttonMousePressed

    private void AddbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonMouseReleased
        // TODO add your handling code here:
        Addbutton.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_AddbuttonMouseReleased

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
            java.util.logging.Logger.getLogger(succ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(succ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(succ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(succ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new succ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Addbutton;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}