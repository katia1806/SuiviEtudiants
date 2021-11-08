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
public class statistics extends javax.swing.JFrame {
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;    
    
    public statistics() {
        initComponents();
        updateetd();
    }
    public void updateetd(){
    try {
        conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        stmt = conn.createStatement();
        String sql="SELECT `IdSujet` AS id, COUNT(`IdSujet`) AS count FROM binome GROUP BY `IdSujet` ORDER BY count DESC LIMIT 1";
        rs=stmt.executeQuery(sql);
        DefaultTableModel tableModel = (DefaultTableModel)Tet.getModel();
        tableModel.setRowCount(0);
        while(rs.next()){
            //(Numero_Inscription, Nom, Prenom, Date_Naissance, Numero_Groupe, id_Binome
            String id = String.valueOf(rs.getInt("id"));
            String count = String.valueOf(rs.getInt("count"));


            String tbData[] = {id, count};
            tableModel.addRow(tbData);
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    try {
        conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        stmt = conn.createStatement();
        String sql="SELECT `EvaRapF` FROM evalfinal WHERE `EvaRapF` = (SELECT MAX(`EvaRapF`) FROM evalfinal)";
        rs=stmt.executeQuery(sql);

        while(rs.next()){
            //(Numero_Inscription, Nom, Prenom, Date_Naissance, Numero_Groupe, id_Binome
            String nr = String.valueOf(rs.getInt("EvaRapF"));
            bna.setText(nr);
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    try {
        conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        stmt = conn.createStatement();
        String sql="SELECT `EvaApliF` FROM evalfinal WHERE `EvaApliF` = (SELECT MAX(`EvaApliF`) FROM evalfinal)";
        rs=stmt.executeQuery(sql);

        while(rs.next()){
            //(Numero_Inscription, Nom, Prenom, Date_Naissance, Numero_Groupe, id_Binome
            String nr = String.valueOf(rs.getInt("EvaApliF"));
            bnr.setText(nr);
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    try {
        conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        stmt = conn.createStatement();
        String sql="SELECT `EvaRapF` FROM evalfinal WHERE `EvaRapF` = (SELECT MIN(`EvaRapF`) FROM evalfinal)";
        rs=stmt.executeQuery(sql);

        while(rs.next()){
            //(Numero_Inscription, Nom, Prenom, Date_Naissance, Numero_Groupe, id_Binome
            String nr = String.valueOf(rs.getInt("EvaRapF"));
            wna.setText(nr);
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    try {
        conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
        stmt = conn.createStatement();
        String sql="SELECT `EvaApliF` FROM evalfinal WHERE `EvaApliF` = (SELECT MIN(`EvaApliF`) FROM evalfinal)";
        rs=stmt.executeQuery(sql);

        while(rs.next()){
            //(Numero_Inscription, Nom, Prenom, Date_Naissance, Numero_Groupe, id_Binome
            String nr = String.valueOf(rs.getInt("EvaApliF"));
            wnr.setText(nr);
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        bna = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        bnr = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        wna = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        wnr = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tet = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Jpbinome = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Meilleure de l'application :");

        bna.setEditable(false);
        bna.setBackground(new java.awt.Color(0, 102, 102));
        bna.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        bna.setForeground(new java.awt.Color(255, 255, 255));
        bna.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        bna.setBorder(null);
        bna.setSelectionColor(new java.awt.Color(255, 102, 0));
        bna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Meilleure note du rapport :");

        bnr.setEditable(false);
        bnr.setBackground(new java.awt.Color(0, 102, 102));
        bnr.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        bnr.setForeground(new java.awt.Color(255, 255, 255));
        bnr.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        bnr.setBorder(null);
        bnr.setSelectionColor(new java.awt.Color(255, 102, 0));
        bnr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnrActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pire note de l'application :");

        wna.setEditable(false);
        wna.setBackground(new java.awt.Color(0, 102, 102));
        wna.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        wna.setForeground(new java.awt.Color(255, 255, 255));
        wna.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        wna.setBorder(null);
        wna.setSelectionColor(new java.awt.Color(255, 102, 0));
        wna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wnaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pire note du rapport :");

        wnr.setEditable(false);
        wnr.setBackground(new java.awt.Color(0, 102, 102));
        wnr.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        wnr.setForeground(new java.awt.Color(255, 255, 255));
        wnr.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        wnr.setBorder(null);
        wnr.setSelectionColor(new java.awt.Color(255, 102, 0));
        wnr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wnrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bna, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bnr, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(jSeparator3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wna, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(wnr, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel5)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel10)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        Tet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Sujet", "combien de fois il a été choisi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" les sujets les plus choisis ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(180, 366, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(602, 602, 602))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

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
            .addGroup(JpbinomeLayout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Statistiques");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Jpbinome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(409, 409, 409))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jpbinome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
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

    private void bnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnaActionPerformed

    private void bnrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnrActionPerformed

    private void TetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TetMouseClicked

       /* int srow = Tet.getSelectedRow();

        String nf=Tet.getModel().getValueAt(srow, 1).toString();
        String pf=Tet.getModel().getValueAt(srow, 2).toString();
        //String dt=Tet.getModel().getValueAt(srow, 3).toString();
        String cf=Tet.getModel().getValueAt(srow, 4).toString();
        nomtextfield.setText(nf);
        prentextfield.setText(pf); **/
    }//GEN-LAST:event_TetMouseClicked

    private void JpbinomeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpbinomeMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_JpbinomeMouseMoved

    private void JpbinomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpbinomeMouseClicked
        ok p0 = new ok();
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

    private void wnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wnaActionPerformed

    private void wnrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wnrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wnrActionPerformed

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
            java.util.logging.Logger.getLogger(statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new statistics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpbinome;
    private javax.swing.JTable Tet;
    private javax.swing.JTextField bna;
    private javax.swing.JTextField bnr;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField wna;
    private javax.swing.JTextField wnr;
    // End of variables declaration//GEN-END:variables
}
