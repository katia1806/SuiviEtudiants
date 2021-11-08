/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uh;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import javax.swing.JOptionPane;
public class sss12 extends javax.swing.JFrame {

    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    
    public sss12() {
        initComponents();
        affsss();
    }

    
            public void affsss(){
    try {
                conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                stmt = conn.createStatement();
                String sql="SELECT * FROM seance";
                rs=stmt.executeQuery(sql);
                DefaultTableModel tableModel = (DefaultTableModel)Tet.getModel();
                tableModel.setRowCount(0);
                while(rs.next()){
                    //(Numero_Inscription, Nom, Prenom, Date_Naissance, Numero_Groupe, id_Binome
                    String IdSeance = String.valueOf(rs.getInt("IdSeance"));
                    String Salle = rs.getString("Salle");
                    String Horaire = String.valueOf(rs.getTime("Horaire"));
                    String DateS = String.valueOf(rs.getDate("DateS"));
                    String IdGroupe = String.valueOf(rs.getInt("IdGroupe"));
                    

                    String tbData[] = {IdSeance,IdGroupe, DateS, Horaire,Salle};
                    tableModel.addRow(tbData);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
}
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPsss1 = new javax.swing.JPanel();
        jpbtmsss = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPsss2 = new javax.swing.JPanel();
        jpaddsss = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jpeditsss = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jpdeletesss = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tet = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPsss1.setBackground(new java.awt.Color(255, 153, 0));

        jpbtmsss.setBackground(new java.awt.Color(255, 153, 0));
        jpbtmsss.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpbtmsss.setName(""); // NOI18N
        jpbtmsss.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jpbtmsssMouseMoved(evt);
            }
        });
        jpbtmsss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpbtmsssMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpbtmsssMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpbtmsssMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpbtmsssMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpbtmsssMouseReleased(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/undo.png"))); // NOI18N

        javax.swing.GroupLayout jpbtmsssLayout = new javax.swing.GroupLayout(jpbtmsss);
        jpbtmsss.setLayout(jpbtmsssLayout);
        jpbtmsssLayout.setHorizontalGroup(
            jpbtmsssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpbtmsssLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel19)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jpbtmsssLayout.setVerticalGroup(
            jpbtmsssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPsss1Layout = new javax.swing.GroupLayout(jPsss1);
        jPsss1.setLayout(jPsss1Layout);
        jPsss1Layout.setHorizontalGroup(
            jPsss1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPsss1Layout.createSequentialGroup()
                .addComponent(jpbtmsss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPsss1Layout.setVerticalGroup(
            jPsss1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPsss1Layout.createSequentialGroup()
                .addComponent(jpbtmsss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPsss2.setBackground(new java.awt.Color(0, 102, 102));

        jpaddsss.setBackground(new java.awt.Color(255, 153, 0));
        jpaddsss.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpaddsss.setName(""); // NOI18N
        jpaddsss.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jpaddsssMouseMoved(evt);
            }
        });
        jpaddsss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpaddsssMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpaddsssMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpaddsssMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpaddsssMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpaddsssMouseReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ajouter une séance");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/resized.png"))); // NOI18N

        javax.swing.GroupLayout jpaddsssLayout = new javax.swing.GroupLayout(jpaddsss);
        jpaddsss.setLayout(jpaddsssLayout);
        jpaddsssLayout.setHorizontalGroup(
            jpaddsssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaddsssLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jpaddsssLayout.setVerticalGroup(
            jpaddsssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpaddsssLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpeditsss.setBackground(new java.awt.Color(255, 153, 0));
        jpeditsss.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpeditsss.setName(""); // NOI18N
        jpeditsss.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jpeditsssMouseMoved(evt);
            }
        });
        jpeditsss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpeditsssMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpeditsssMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpeditsssMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpeditsssMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpeditsssMouseReleased(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Modifier une séance");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/resized 2.png"))); // NOI18N

        javax.swing.GroupLayout jpeditsssLayout = new javax.swing.GroupLayout(jpeditsss);
        jpeditsss.setLayout(jpeditsssLayout);
        jpeditsssLayout.setHorizontalGroup(
            jpeditsssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpeditsssLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jpeditsssLayout.setVerticalGroup(
            jpeditsssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpeditsssLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpdeletesss.setBackground(new java.awt.Color(255, 153, 0));
        jpdeletesss.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpdeletesss.setName(""); // NOI18N
        jpdeletesss.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jpdeletesssMouseMoved(evt);
            }
        });
        jpdeletesss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpdeletesssMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpdeletesssMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpdeletesssMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpdeletesssMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpdeletesssMouseReleased(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Supprimer des séance");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/delete.png"))); // NOI18N

        javax.swing.GroupLayout jpdeletesssLayout = new javax.swing.GroupLayout(jpdeletesss);
        jpdeletesss.setLayout(jpdeletesssLayout);
        jpdeletesssLayout.setHorizontalGroup(
            jpdeletesssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpdeletesssLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jpdeletesssLayout.setVerticalGroup(
            jpdeletesssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpdeletesssLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPsss2Layout = new javax.swing.GroupLayout(jPsss2);
        jPsss2.setLayout(jPsss2Layout);
        jPsss2Layout.setHorizontalGroup(
            jPsss2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPsss2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jpaddsss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jpeditsss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jpdeletesss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPsss2Layout.setVerticalGroup(
            jPsss2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPsss2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPsss2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpeditsss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpdeletesss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpaddsss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        Tet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Groupe", "Date", "Heur", "Salle"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TetMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tet);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPsss1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPsss2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPsss1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPsss2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jpbtmsssMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpbtmsssMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jpbtmsssMouseMoved

    private void jpbtmsssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpbtmsssMouseClicked
        ok p0 = new ok();
        p0.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jpbtmsssMouseClicked

    private void jpbtmsssMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpbtmsssMouseEntered
        jpbtmsss.setBackground(new java.awt.Color(255,184,79));        // TODO add your handling code here:
    }//GEN-LAST:event_jpbtmsssMouseEntered

    private void jpbtmsssMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpbtmsssMouseExited
        jpbtmsss.setBackground(new java.awt.Color(255,153,0));  // TODO add your handling code here:
    }//GEN-LAST:event_jpbtmsssMouseExited

    private void jpbtmsssMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpbtmsssMousePressed
        // TODO add your handling code here: 219,98,0
        jpbtmsss.setBackground(new java.awt.Color(219,98,0));
    }//GEN-LAST:event_jpbtmsssMousePressed

    private void jpbtmsssMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpbtmsssMouseReleased
        // TODO add your handling code here:
        jpbtmsss.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_jpbtmsssMouseReleased

    private void jpaddsssMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpaddsssMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jpaddsssMouseMoved

    private void jpaddsssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpaddsssMouseClicked
        addsss p0 = new addsss();
        p0.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jpaddsssMouseClicked

    private void jpaddsssMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpaddsssMouseEntered
        jpaddsss.setBackground(new java.awt.Color(255,184,79));        // TODO add your handling code here:
    }//GEN-LAST:event_jpaddsssMouseEntered

    private void jpaddsssMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpaddsssMouseExited
        jpaddsss.setBackground(new java.awt.Color(255,153,0));  // TODO add your handling code here:
    }//GEN-LAST:event_jpaddsssMouseExited

    private void jpaddsssMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpaddsssMousePressed
        // TODO add your handling code here: 219,98,0
        jpaddsss.setBackground(new java.awt.Color(219,98,0));
    }//GEN-LAST:event_jpaddsssMousePressed

    private void jpaddsssMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpaddsssMouseReleased
        // TODO add your handling code here:
        jpaddsss.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_jpaddsssMouseReleased

    private void jpeditsssMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpeditsssMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jpeditsssMouseMoved

    private void jpeditsssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpeditsssMouseClicked
        editsss p = new editsss();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jpeditsssMouseClicked

    private void jpeditsssMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpeditsssMouseEntered
        jpeditsss.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_jpeditsssMouseEntered

    private void jpeditsssMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpeditsssMouseExited
        jpeditsss.setBackground(new java.awt.Color(255,153,0));
    }//GEN-LAST:event_jpeditsssMouseExited

    private void jpeditsssMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpeditsssMousePressed
        jpeditsss.setBackground(new java.awt.Color(219,98,0));   // TODO add your handling code here:
    }//GEN-LAST:event_jpeditsssMousePressed

    private void jpeditsssMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpeditsssMouseReleased
        jpeditsss.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_jpeditsssMouseReleased

    private void jpdeletesssMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpdeletesssMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jpdeletesssMouseMoved

    private void jpdeletesssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpdeletesssMouseClicked
        Delsss p4 = new Delsss();
        p4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jpdeletesssMouseClicked

    private void jpdeletesssMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpdeletesssMouseEntered
        jpdeletesss.setBackground(new java.awt.Color(255,184,79));        // TODO add your handling code here:
    }//GEN-LAST:event_jpdeletesssMouseEntered

    private void jpdeletesssMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpdeletesssMouseExited
        jpdeletesss.setBackground(new java.awt.Color(255,153,0));  // TODO add your handling code here:
    }//GEN-LAST:event_jpdeletesssMouseExited

    private void jpdeletesssMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpdeletesssMousePressed
        // TODO add your handling code here: 219,98,0
        jpdeletesss.setBackground(new java.awt.Color(219,98,0));
    }//GEN-LAST:event_jpdeletesssMousePressed

    private void jpdeletesssMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpdeletesssMouseReleased
        // TODO add your handling code here:
        jpdeletesss.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_jpdeletesssMouseReleased

    private void TetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TetMouseClicked

    }//GEN-LAST:event_TetMouseClicked

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
            java.util.logging.Logger.getLogger(sss12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sss12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sss12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sss12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sss12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tet;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPsss1;
    private javax.swing.JPanel jPsss2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpaddsss;
    private javax.swing.JPanel jpbtmsss;
    private javax.swing.JPanel jpdeletesss;
    private javax.swing.JPanel jpeditsss;
    // End of variables declaration//GEN-END:variables
}
