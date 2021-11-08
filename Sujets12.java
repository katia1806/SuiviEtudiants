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
public class Sujets12 extends javax.swing.JFrame {
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    public Sujets12() {
        initComponents();
        affsuj();
    }

        public void affsuj(){
    try {
                conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                stmt = conn.createStatement();
                String sql="SELECT * FROM sujet";
                rs=stmt.executeQuery(sql);
                DefaultTableModel tableModel = (DefaultTableModel)Tet.getModel();
                tableModel.setRowCount(0);
                while(rs.next()){
                    //(Numero_Inscription, Nom, Prenom, Date_Naissance, Numero_Groupe, id_Binome
                    String IdSujet = String.valueOf(rs.getInt("IdSujet"));
                    String Titre = rs.getString("Titre");
                    String Domaine = rs.getString("Domaine");
                    
                    
                    

                    String tbData[] = {IdSujet, Titre,Domaine};
                    tableModel.addRow(tbData);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPmenu = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jP2_1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jP2_3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPdelete = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tet = new javax.swing.JTable();

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

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/undo.png"))); // NOI18N

        javax.swing.GroupLayout jPmenuLayout = new javax.swing.GroupLayout(jPmenu);
        jPmenu.setLayout(jPmenuLayout);
        jPmenuLayout.setHorizontalGroup(
            jPmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPmenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel19)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPmenuLayout.setVerticalGroup(
            jPmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 693, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jP2_1.setBackground(new java.awt.Color(255, 153, 0));
        jP2_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jP2_1.setName(""); // NOI18N
        jP2_1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jP2_1MouseMoved(evt);
            }
        });
        jP2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jP2_1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jP2_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jP2_1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jP2_1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jP2_1MouseReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ajouter un sujet");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/resized.png"))); // NOI18N

        javax.swing.GroupLayout jP2_1Layout = new javax.swing.GroupLayout(jP2_1);
        jP2_1.setLayout(jP2_1Layout);
        jP2_1Layout.setHorizontalGroup(
            jP2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP2_1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jP2_1Layout.setVerticalGroup(
            jP2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP2_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jP2_3.setBackground(new java.awt.Color(255, 153, 0));
        jP2_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jP2_3.setName(""); // NOI18N
        jP2_3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jP2_3MouseMoved(evt);
            }
        });
        jP2_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jP2_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jP2_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jP2_3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jP2_3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jP2_3MouseReleased(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Modifier les sujet");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/resized 2.png"))); // NOI18N

        javax.swing.GroupLayout jP2_3Layout = new javax.swing.GroupLayout(jP2_3);
        jP2_3.setLayout(jP2_3Layout);
        jP2_3Layout.setHorizontalGroup(
            jP2_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP2_3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jP2_3Layout.setVerticalGroup(
            jP2_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP2_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPdelete.setBackground(new java.awt.Color(255, 153, 0));
        jPdelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPdelete.setName(""); // NOI18N
        jPdelete.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPdeleteMouseMoved(evt);
            }
        });
        jPdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPdeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPdeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPdeleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPdeleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPdeleteMouseReleased(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Supprimer des sujet");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/delete.png"))); // NOI18N

        javax.swing.GroupLayout jPdeleteLayout = new javax.swing.GroupLayout(jPdelete);
        jPdelete.setLayout(jPdeleteLayout);
        jPdeleteLayout.setHorizontalGroup(
            jPdeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdeleteLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPdeleteLayout.setVerticalGroup(
            jPdeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPdeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jP2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jP2_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPdelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jP2_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPdelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jP2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        Tet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "ID", "Titre", "Domaine"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
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
        jScrollPane2.setViewportView(Tet);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jP2_1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP2_1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jP2_1MouseMoved

    private void jP2_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP2_1MouseClicked
        addsuj p0 = new addsuj();
        p0.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jP2_1MouseClicked

    private void jP2_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP2_1MouseEntered
        jP2_1.setBackground(new java.awt.Color(255,184,79));        // TODO add your handling code here:
    }//GEN-LAST:event_jP2_1MouseEntered

    private void jP2_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP2_1MouseExited
        jP2_1.setBackground(new java.awt.Color(255,153,0));  // TODO add your handling code here:
    }//GEN-LAST:event_jP2_1MouseExited

    private void jP2_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP2_1MousePressed
        // TODO add your handling code here: 219,98,0
        jP2_1.setBackground(new java.awt.Color(219,98,0));
    }//GEN-LAST:event_jP2_1MousePressed

    private void jP2_1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP2_1MouseReleased
        // TODO add your handling code here:
        jP2_1.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_jP2_1MouseReleased

    private void jP2_3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP2_3MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jP2_3MouseMoved

    private void jP2_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP2_3MouseClicked
        editsuj p = new editsuj();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jP2_3MouseClicked

    private void jP2_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP2_3MouseEntered
        jP2_3.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_jP2_3MouseEntered

    private void jP2_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP2_3MouseExited
        jP2_3.setBackground(new java.awt.Color(255,153,0));
    }//GEN-LAST:event_jP2_3MouseExited

    private void jP2_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP2_3MousePressed
        jP2_3.setBackground(new java.awt.Color(219,98,0));   // TODO add your handling code here:
    }//GEN-LAST:event_jP2_3MousePressed

    private void jP2_3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP2_3MouseReleased
        jP2_3.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_jP2_3MouseReleased

    private void jPdeleteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPdeleteMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPdeleteMouseMoved

    private void jPdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPdeleteMouseClicked
        delsuj p0 = new delsuj();
        p0.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPdeleteMouseClicked

    private void jPdeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPdeleteMouseEntered
        jPdelete.setBackground(new java.awt.Color(255,184,79));        // TODO add your handling code here:
    }//GEN-LAST:event_jPdeleteMouseEntered

    private void jPdeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPdeleteMouseExited
        jPdelete.setBackground(new java.awt.Color(255,153,0));  // TODO add your handling code here:
    }//GEN-LAST:event_jPdeleteMouseExited

    private void jPdeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPdeleteMousePressed
        // TODO add your handling code here: 219,98,0
        jPdelete.setBackground(new java.awt.Color(219,98,0));
    }//GEN-LAST:event_jPdeleteMousePressed

    private void jPdeleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPdeleteMouseReleased
        // TODO add your handling code here:
        jPdelete.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_jPdeleteMouseReleased

    private void TetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TetMouseClicked
 /**       String cell=Tet.getModel().getValueAt(Tet.getSelectedRow(), 0).toString();
        String ttr1=Tet.getModel().getValueAt(Tet.getSelectedRow(), 1).toString();
        String dmn1=Tet.getModel().getValueAt(Tet.getSelectedRow(), 2).toString();
        ttr.setText(ttr1);
        dmn.setText(dmn1);
        try {

            String dsc1 = null;
            String mc1 = null;
            String odd1 = null;
            conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            stmt = conn.createStatement();
            String sql="SELECT * FROM sujet Where IdSujet='"+cell+"'";
            rs=stmt.executeQuery(sql);

            while(rs.next()){

                dsc1 = rs.getString("Description");
                mc1 = rs.getString("MotsCles");
                odd1 = rs.getString("OutilsDev");
            }

            dsc.setText(dsc1);
            mc.setText(mc1);
            odd.setText(odd1);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }   */

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
            java.util.logging.Logger.getLogger(Sujets12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sujets12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sujets12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sujets12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sujets12().setVisible(true);
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
    private javax.swing.JPanel jP2_1;
    private javax.swing.JPanel jP2_3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPdelete;
    private javax.swing.JPanel jPmenu;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
