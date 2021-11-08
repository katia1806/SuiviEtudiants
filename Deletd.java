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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;


public class Deletd extends javax.swing.JFrame {

    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;  
    
    
    public Deletd() {
        initComponents();
        updateetd();
    }

    public void updateetd(){
    try {
                conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                stmt = conn.createStatement();
                String sql="SELECT * FROM etudiant";
                rs=stmt.executeQuery(sql);
                DefaultTableModel tableModel = (DefaultTableModel)Tets.getModel();
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPmenu = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Jpbinome = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ntf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ptf = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tets = new javax.swing.JTable();
        dtf = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        gtf = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();

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

        jLabel8.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Suppression d'un étudiant");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Jpbinome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231)
                .addComponent(jPmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jpbinome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nom :");

        ntf.setEditable(false);
        ntf.setBackground(new java.awt.Color(0, 102, 102));
        ntf.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ntf.setForeground(new java.awt.Color(255, 255, 255));
        ntf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ntf.setBorder(null);
        ntf.setSelectionColor(new java.awt.Color(255, 102, 0));
        ntf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ntfActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date de naissance :");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Groupe :");

        ptf.setEditable(false);
        ptf.setBackground(new java.awt.Color(0, 102, 102));
        ptf.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ptf.setForeground(new java.awt.Color(255, 255, 255));
        ptf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ptf.setBorder(null);
        ptf.setSelectionColor(new java.awt.Color(255, 102, 0));
        ptf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptfActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Prenom :");

        DeleteButton.setBackground(new java.awt.Color(255, 153, 0));
        DeleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteButton.setName(""); // NOI18N
        DeleteButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseMoved(evt);
            }
        });
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DeleteButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Supprimer");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/delete.png"))); // NOI18N

        javax.swing.GroupLayout DeleteButtonLayout = new javax.swing.GroupLayout(DeleteButton);
        DeleteButton.setLayout(DeleteButtonLayout);
        DeleteButtonLayout.setHorizontalGroup(
            DeleteButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteButtonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        DeleteButtonLayout.setVerticalGroup(
            DeleteButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeleteButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Tets.setModel(new javax.swing.table.DefaultTableModel(
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
        Tets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TetsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tets);

        dtf.setEditable(false);
        dtf.setBackground(new java.awt.Color(0, 102, 102));
        dtf.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        dtf.setForeground(new java.awt.Color(255, 255, 255));
        dtf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dtf.setBorder(null);
        dtf.setSelectionColor(new java.awt.Color(255, 102, 0));
        dtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtfActionPerformed(evt);
            }
        });

        gtf.setEditable(false);
        gtf.setBackground(new java.awt.Color(0, 102, 102));
        gtf.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        gtf.setForeground(new java.awt.Color(255, 255, 255));
        gtf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        gtf.setBorder(null);
        gtf.setSelectionColor(new java.awt.Color(255, 102, 0));
        gtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gtfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 99, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(gtf, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(jSeparator5)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dtf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator3)
                                    .addComponent(ptf, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(ntf, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(256, 256, 256))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(ntf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(ptf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(dtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(gtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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
        Etudiants p0 = new Etudiants();
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

    private void ptfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptfActionPerformed

    private void DeleteButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonMouseMoved

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        int row = Tets.getSelectedRow();
        if(row == -1)
                {
                JOptionPane.showMessageDialog(null,"Select votre sujet");   
                }
        else{
        int des = JOptionPane.showConfirmDialog(null, "delete?","supression", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

if(des==0){
        try {    
                String cell=Tets.getModel().getValueAt(Tets.getSelectedRow(), 0).toString();
                conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                stmt = conn.createStatement();
                String sql="DELETE FROM `etudiant` WHERE InsNum='"+cell+"'";
                stmt.executeUpdate(sql);
                updateetd();
                ntf.setText(null);
                ptf.setText(null);
                dtf.setText(null);
                gtf.setText(null);
                
        } 
                
              catch (Exception e) {
             JOptionPane.showMessageDialog(null,"idk");
            }
        }
        }
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void DeleteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseEntered
        DeleteButton.setBackground(new java.awt.Color(220,20,60));        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonMouseEntered

    private void DeleteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseExited
        DeleteButton.setBackground(new java.awt.Color(255,153,0));  // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonMouseExited

    private void DeleteButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMousePressed
        // TODO add your handling code here: 219,98,0
        DeleteButton.setBackground(new java.awt.Color(219,98,0));
    }//GEN-LAST:event_DeleteButtonMousePressed

    private void DeleteButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseReleased
        // TODO add your handling code here:
        DeleteButton.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_DeleteButtonMouseReleased

    private void TetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TetsMouseClicked

        String nf=Tets.getModel().getValueAt(Tets.getSelectedRow(), 1).toString();
        String pf=Tets.getModel().getValueAt(Tets.getSelectedRow(), 2).toString();
        String df=Tets.getModel().getValueAt(Tets.getSelectedRow(), 3).toString();
        String cf=Tets.getModel().getValueAt(Tets.getSelectedRow(), 4).toString();
        ntf.setText(nf);
        ptf.setText(pf);
        dtf.setText(df);
        gtf.setText(cf);
    }//GEN-LAST:event_TetsMouseClicked

    private void dtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dtfActionPerformed

    private void gtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gtfActionPerformed

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
            java.util.logging.Logger.getLogger(Deletd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deletd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deletd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deletd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deletd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DeleteButton;
    private javax.swing.JPanel Jpbinome;
    private javax.swing.JTable Tets;
    private javax.swing.JTextField dtf;
    private javax.swing.JTextField gtf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPmenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField ntf;
    private javax.swing.JTextField ptf;
    // End of variables declaration//GEN-END:variables
}
