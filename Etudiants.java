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

/**
 *
 * @author Bouguessa
 */
public class Etudiants extends javax.swing.JFrame {

    /**
     * Creates new form Etudiants
     */
    public Etudiants() {
        initComponents();
        aff();
    }

    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPetd0 = new javax.swing.JPanel();
        backbuttonetd = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPetd1 = new javax.swing.JPanel();
        addbuttonetd = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        editbuttonetd = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        deletebuttonetd = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tet = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPetd0.setBackground(new java.awt.Color(255, 153, 0));

        backbuttonetd.setBackground(new java.awt.Color(255, 153, 0));
        backbuttonetd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbuttonetd.setName(""); // NOI18N
        backbuttonetd.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                backbuttonetdMouseMoved(evt);
            }
        });
        backbuttonetd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbuttonetdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backbuttonetdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backbuttonetdMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backbuttonetdMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backbuttonetdMouseReleased(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/undo.png"))); // NOI18N

        javax.swing.GroupLayout backbuttonetdLayout = new javax.swing.GroupLayout(backbuttonetd);
        backbuttonetd.setLayout(backbuttonetdLayout);
        backbuttonetdLayout.setHorizontalGroup(
            backbuttonetdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backbuttonetdLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel19)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        backbuttonetdLayout.setVerticalGroup(
            backbuttonetdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPetd0Layout = new javax.swing.GroupLayout(jPetd0);
        jPetd0.setLayout(jPetd0Layout);
        jPetd0Layout.setHorizontalGroup(
            jPetd0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPetd0Layout.createSequentialGroup()
                .addComponent(backbuttonetd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPetd0Layout.setVerticalGroup(
            jPetd0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPetd0Layout.createSequentialGroup()
                .addComponent(backbuttonetd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPetd1.setBackground(new java.awt.Color(0, 102, 102));

        addbuttonetd.setBackground(new java.awt.Color(255, 153, 0));
        addbuttonetd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addbuttonetd.setName(""); // NOI18N
        addbuttonetd.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                addbuttonetdMouseMoved(evt);
            }
        });
        addbuttonetd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbuttonetdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addbuttonetdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addbuttonetdMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addbuttonetdMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addbuttonetdMouseReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ajouter un étudiant");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/resized.png"))); // NOI18N

        javax.swing.GroupLayout addbuttonetdLayout = new javax.swing.GroupLayout(addbuttonetd);
        addbuttonetd.setLayout(addbuttonetdLayout);
        addbuttonetdLayout.setHorizontalGroup(
            addbuttonetdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addbuttonetdLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        addbuttonetdLayout.setVerticalGroup(
            addbuttonetdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addbuttonetdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        editbuttonetd.setBackground(new java.awt.Color(255, 153, 0));
        editbuttonetd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editbuttonetd.setName(""); // NOI18N
        editbuttonetd.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                editbuttonetdMouseMoved(evt);
            }
        });
        editbuttonetd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editbuttonetdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editbuttonetdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editbuttonetdMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editbuttonetdMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editbuttonetdMouseReleased(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Modifier un étudiant");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/resized 2.png"))); // NOI18N

        javax.swing.GroupLayout editbuttonetdLayout = new javax.swing.GroupLayout(editbuttonetd);
        editbuttonetd.setLayout(editbuttonetdLayout);
        editbuttonetdLayout.setHorizontalGroup(
            editbuttonetdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editbuttonetdLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        editbuttonetdLayout.setVerticalGroup(
            editbuttonetdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editbuttonetdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        deletebuttonetd.setBackground(new java.awt.Color(255, 153, 0));
        deletebuttonetd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletebuttonetd.setName(""); // NOI18N
        deletebuttonetd.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                deletebuttonetdMouseMoved(evt);
            }
        });
        deletebuttonetd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebuttonetdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deletebuttonetdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deletebuttonetdMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deletebuttonetdMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deletebuttonetdMouseReleased(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Supprimer des étudiants");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/delete.png"))); // NOI18N

        javax.swing.GroupLayout deletebuttonetdLayout = new javax.swing.GroupLayout(deletebuttonetd);
        deletebuttonetd.setLayout(deletebuttonetdLayout);
        deletebuttonetdLayout.setHorizontalGroup(
            deletebuttonetdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletebuttonetdLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        deletebuttonetdLayout.setVerticalGroup(
            deletebuttonetdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletebuttonetdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPetd1Layout = new javax.swing.GroupLayout(jPetd1);
        jPetd1.setLayout(jPetd1Layout);
        jPetd1Layout.setHorizontalGroup(
            jPetd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPetd1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(addbuttonetd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(editbuttonetd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(deletebuttonetd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPetd1Layout.setVerticalGroup(
            jPetd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPetd1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPetd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deletebuttonetd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editbuttonetd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbuttonetd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        Tet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom", "Prenom", "Date ", "Groupe"
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPetd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPetd0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPetd0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPetd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        public void aff(){
    try {
                conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                stmt = conn.createStatement();
                String sql="SELECT * FROM etudiant";
                rs=stmt.executeQuery(sql);
                DefaultTableModel tableModel = (DefaultTableModel)Tet.getModel();
                tableModel.setRowCount(0);
                while(rs.next()){
                    //(Numero_Inscription, Nom, Prenom, Date_Naissance, Numero_Groupe, id_Binome
                    String InsNum = String.valueOf(rs.getInt("InsNum"));
                    String Nom = rs.getString("Nom");
                    String Prenom = rs.getString("Prenom");
                    String DateN = String.valueOf(rs.getDate("DateN"));
                    String IdGroupe = String.valueOf(rs.getInt("IdGroupe"));
                    

                    String tbData[] = {InsNum, Nom, Prenom, DateN, IdGroupe};
                    tableModel.addRow(tbData);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
}
    
    
    
    private void addbuttonetdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbuttonetdMouseReleased
        // TODO add your handling code here:
        addbuttonetd.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_addbuttonetdMouseReleased

    private void addbuttonetdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbuttonetdMousePressed
        // TODO add your handling code here: 219,98,0
        addbuttonetd.setBackground(new java.awt.Color(219,98,0));
    }//GEN-LAST:event_addbuttonetdMousePressed

    private void addbuttonetdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbuttonetdMouseExited
        addbuttonetd.setBackground(new java.awt.Color(255,153,0));  // TODO add your handling code here:
    }//GEN-LAST:event_addbuttonetdMouseExited

    private void addbuttonetdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbuttonetdMouseEntered
        addbuttonetd.setBackground(new java.awt.Color(255,184,79));        // TODO add your handling code here:
    }//GEN-LAST:event_addbuttonetdMouseEntered

    private void addbuttonetdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbuttonetdMouseClicked
        addetd p0 = new addetd();
        p0.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addbuttonetdMouseClicked

    private void addbuttonetdMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbuttonetdMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_addbuttonetdMouseMoved

    private void editbuttonetdMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonetdMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_editbuttonetdMouseMoved

    private void editbuttonetdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonetdMouseClicked
       editetd p = new editetd();
       p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editbuttonetdMouseClicked

    private void editbuttonetdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonetdMouseEntered
      editbuttonetd.setBackground(new java.awt.Color(255,184,79)); 
    }//GEN-LAST:event_editbuttonetdMouseEntered

    private void editbuttonetdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonetdMouseExited
      editbuttonetd.setBackground(new java.awt.Color(255,153,0));
    }//GEN-LAST:event_editbuttonetdMouseExited

    private void editbuttonetdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonetdMousePressed
      editbuttonetd.setBackground(new java.awt.Color(219,98,0));   // TODO add your handling code here:
    }//GEN-LAST:event_editbuttonetdMousePressed

    private void editbuttonetdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbuttonetdMouseReleased
      editbuttonetd.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_editbuttonetdMouseReleased

    private void backbuttonetdMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonetdMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_backbuttonetdMouseMoved

    private void backbuttonetdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonetdMouseClicked
        ok p0 = new ok();
        p0.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_backbuttonetdMouseClicked

    private void backbuttonetdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonetdMouseEntered
        backbuttonetd.setBackground(new java.awt.Color(255,184,79));        // TODO add your handling code here:
    }//GEN-LAST:event_backbuttonetdMouseEntered

    private void backbuttonetdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonetdMouseExited
        backbuttonetd.setBackground(new java.awt.Color(255,153,0));  // TODO add your handling code here:
    }//GEN-LAST:event_backbuttonetdMouseExited

    private void backbuttonetdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonetdMousePressed
        // TODO add your handling code here: 219,98,0
        backbuttonetd.setBackground(new java.awt.Color(219,98,0));
    }//GEN-LAST:event_backbuttonetdMousePressed

    private void backbuttonetdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonetdMouseReleased
        // TODO add your handling code here:
        backbuttonetd.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_backbuttonetdMouseReleased

    private void deletebuttonetdMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebuttonetdMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebuttonetdMouseMoved

    private void deletebuttonetdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebuttonetdMouseClicked
        Deletd p0 = new Deletd();
        p0.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_deletebuttonetdMouseClicked

    private void deletebuttonetdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebuttonetdMouseEntered
        deletebuttonetd.setBackground(new java.awt.Color(255,184,79));        // TODO add your handling code here:
    }//GEN-LAST:event_deletebuttonetdMouseEntered

    private void deletebuttonetdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebuttonetdMouseExited
        deletebuttonetd.setBackground(new java.awt.Color(255,153,0));  // TODO add your handling code here:
    }//GEN-LAST:event_deletebuttonetdMouseExited

    private void deletebuttonetdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebuttonetdMousePressed
        // TODO add your handling code here: 219,98,0
        deletebuttonetd.setBackground(new java.awt.Color(219,98,0));
    }//GEN-LAST:event_deletebuttonetdMousePressed

    private void deletebuttonetdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebuttonetdMouseReleased
        // TODO add your handling code here:
        deletebuttonetd.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_deletebuttonetdMouseReleased

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
            java.util.logging.Logger.getLogger(Etudiants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Etudiants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Etudiants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Etudiants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Etudiants().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tet;
    private javax.swing.JPanel addbuttonetd;
    private javax.swing.JPanel backbuttonetd;
    private javax.swing.JPanel deletebuttonetd;
    private javax.swing.JPanel editbuttonetd;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPetd0;
    private javax.swing.JPanel jPetd1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
