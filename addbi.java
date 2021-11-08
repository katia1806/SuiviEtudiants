/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uh;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class addbi extends javax.swing.JFrame {

    Connection con2=null;
    Statement stmt2=null;
    ResultSet rs2=null;
    Connection con3=null;
    Statement stmt3=null;
    ResultSet rs3=null;
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    
    
    public addbi() {
        initComponents();
        fillgrpcombobox();
        updateetd();
        fillsujcombobox();
    }
    
 
            public void fillsujcombobox(){
    try {
                conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                stmt = conn.createStatement();
                String sql="SELECT * FROM sujet";
                rs=stmt.executeQuery(sql);
                while(rs.next()){
                    //(Numero_Inscription, Nom, Prenom, Date_Naissance, Numero_Groupe, id_Binome
                    
                    String IdSujet = String.valueOf(rs.getInt("IdSujet"));
                    sujcombobox.addItem(IdSujet);

                    
                    
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
}
    
    
    
    
    
    
    
    
    
    
        public void updateetd(){
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
        
        
        
                public void etd(){
    try {       
                
                String IdGroupe = String.valueOf(grpcombobox.getSelectedItem());
                conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                stmt = conn.createStatement();
                String sql="SELECT * FROM etudiant Where IdGroupe='"+IdGroupe+"'";
                rs=stmt.executeQuery(sql);
                DefaultTableModel tableModel = (DefaultTableModel)Tet.getModel();
                tableModel.setRowCount(0);
                while(rs.next()){
                    //(Numero_Inscription, Nom, Prenom, Date_Naissance, Numero_Groupe, id_Binome
                    String InsNum = String.valueOf(rs.getInt("InsNum"));
                    String Nom = rs.getString("Nom");
                    String Prenom = rs.getString("Prenom");
                    String DateN = String.valueOf(rs.getDate("DateN"));
                    IdGroupe = String.valueOf(rs.getInt("IdGroupe"));
                    

                    String tbData[] = {InsNum, Nom, Prenom, DateN, IdGroupe};
                    tableModel.addRow(tbData);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
}
    
    
        public void fillgrpcombobox(){
    try {
                conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                stmt = conn.createStatement();
                String sql="SELECT * FROM groupe";
                rs=stmt.executeQuery(sql);
                while(rs.next()){
                    //(Numero_Inscription, Nom, Prenom, Date_Naissance, Numero_Groupe, id_Binome
                    
                    String IdGroupe = String.valueOf(rs.getInt("IdGroupe"));
                    grpcombobox.addItem(IdGroupe);

                    
                    
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
}
        
       

        
        public void filletdcombobox(){
    try {
        
        
                etd1combobox.removeAllItems();
                etd2combobox.removeAllItems();
                conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                stmt = conn.createStatement();
                

                String IdGroupe = String.valueOf(grpcombobox.getSelectedItem());
                String sql="SELECT * FROM etudiant Where IdGroupe='"+IdGroupe+"'";
                rs=stmt.executeQuery(sql);
                while(rs.next()){
                    //(Numero_Inscription, Nom, Prenom, Date_Naissance, Numero_Groupe, id_Binome
                    
                    IdGroupe = String.valueOf(grpcombobox.getSelectedItem());
                    String Nom = rs.getString("Nom");
                    String Prenom = rs.getString("Prenom");
                    
                    etd1combobox.addItem(Nom +" "+ Prenom);
                    etd2combobox.addItem(Nom +" "+ Prenom);
                    
                    
                    
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
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

        jp1addbi = new javax.swing.JPanel();
        menuaddbi = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        backbuttonbiadd = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Addbuttonbi = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        grpcombobox = new javax.swing.JComboBox<>();
        etd1combobox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        etd2combobox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ch = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        sujcombobox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tet = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jp1addbi.setBackground(new java.awt.Color(255, 153, 0));

        menuaddbi.setBackground(new java.awt.Color(255, 153, 0));
        menuaddbi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuaddbi.setName(""); // NOI18N
        menuaddbi.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                menuaddbiMouseMoved(evt);
            }
        });
        menuaddbi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuaddbiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuaddbiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuaddbiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuaddbiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuaddbiMouseReleased(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Menu");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/home (1).png"))); // NOI18N

        javax.swing.GroupLayout menuaddbiLayout = new javax.swing.GroupLayout(menuaddbi);
        menuaddbi.setLayout(menuaddbiLayout);
        menuaddbiLayout.setHorizontalGroup(
            menuaddbiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuaddbiLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        menuaddbiLayout.setVerticalGroup(
            menuaddbiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuaddbiLayout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        backbuttonbiadd.setBackground(new java.awt.Color(255, 153, 0));
        backbuttonbiadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbuttonbiadd.setName(""); // NOI18N
        backbuttonbiadd.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                backbuttonbiaddMouseMoved(evt);
            }
        });
        backbuttonbiadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbuttonbiaddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backbuttonbiaddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backbuttonbiaddMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backbuttonbiaddMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backbuttonbiaddMouseReleased(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/undo.png"))); // NOI18N

        javax.swing.GroupLayout backbuttonbiaddLayout = new javax.swing.GroupLayout(backbuttonbiadd);
        backbuttonbiadd.setLayout(backbuttonbiaddLayout);
        backbuttonbiaddLayout.setHorizontalGroup(
            backbuttonbiaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backbuttonbiaddLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel21)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        backbuttonbiaddLayout.setVerticalGroup(
            backbuttonbiaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Création des binômes");

        javax.swing.GroupLayout jp1addbiLayout = new javax.swing.GroupLayout(jp1addbi);
        jp1addbi.setLayout(jp1addbiLayout);
        jp1addbiLayout.setHorizontalGroup(
            jp1addbiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1addbiLayout.createSequentialGroup()
                .addComponent(backbuttonbiadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247)
                .addComponent(menuaddbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jp1addbiLayout.setVerticalGroup(
            jp1addbiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1addbiLayout.createSequentialGroup()
                .addGroup(jp1addbiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp1addbiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp1addbiLayout.createSequentialGroup()
                        .addComponent(menuaddbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(backbuttonbiadd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        Addbuttonbi.setBackground(new java.awt.Color(255, 153, 0));
        Addbuttonbi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Addbuttonbi.setName(""); // NOI18N
        Addbuttonbi.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AddbuttonbiMouseMoved(evt);
            }
        });
        Addbuttonbi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddbuttonbiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddbuttonbiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddbuttonbiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AddbuttonbiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AddbuttonbiMouseReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ajouter");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/resized.png"))); // NOI18N

        javax.swing.GroupLayout AddbuttonbiLayout = new javax.swing.GroupLayout(Addbuttonbi);
        Addbuttonbi.setLayout(AddbuttonbiLayout);
        AddbuttonbiLayout.setHorizontalGroup(
            AddbuttonbiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddbuttonbiLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        AddbuttonbiLayout.setVerticalGroup(
            AddbuttonbiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddbuttonbiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selectioner un sujet :");

        grpcombobox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grpcomboboxMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                grpcomboboxMouseExited(evt);
            }
        });
        grpcombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grpcomboboxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("1er étudiant :");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Selectionner les étudiants :");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("2eme étudiant :");

        ch.setBackground(new java.awt.Color(255, 153, 0));
        ch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ch.setName(""); // NOI18N
        ch.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                chMouseMoved(evt);
            }
        });
        ch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                chMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                chMouseReleased(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Rechercher");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/loupe.png"))); // NOI18N

        javax.swing.GroupLayout chLayout = new javax.swing.GroupLayout(ch);
        ch.setLayout(chLayout);
        chLayout.setHorizontalGroup(
            chLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        chLayout.setVerticalGroup(
            chLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sujcombobox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sujcomboboxMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sujcomboboxMouseExited(evt);
            }
        });
        sujcombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sujcomboboxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selectionner un groupe et cliquer sur rechercher :");

        Tet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom", "Prenom", "Date ", "Groupe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(sujcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(235, 235, 235))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(etd1combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(66, 66, 66)
                                            .addComponent(etd2combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grpcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(249, 249, 249)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Addbuttonbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grpcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(ch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel8)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etd1combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etd2combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sujcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Addbuttonbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jp1addbi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp1addbi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuaddbiMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuaddbiMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_menuaddbiMouseMoved

    private void menuaddbiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuaddbiMouseClicked
        ok p0 = new ok();
        p0.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuaddbiMouseClicked

    private void menuaddbiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuaddbiMouseEntered
        menuaddbi.setBackground(new java.awt.Color(255,184,79));        // TODO add your handling code here:
    }//GEN-LAST:event_menuaddbiMouseEntered

    private void menuaddbiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuaddbiMouseExited
        menuaddbi.setBackground(new java.awt.Color(255,153,0));  // TODO add your handling code here:
    }//GEN-LAST:event_menuaddbiMouseExited

    private void menuaddbiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuaddbiMousePressed
        // TODO add your handling code here: 219,98,0
        menuaddbi.setBackground(new java.awt.Color(219,98,0));
    }//GEN-LAST:event_menuaddbiMousePressed

    private void menuaddbiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuaddbiMouseReleased
        // TODO add your handling code here:
        menuaddbi.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_menuaddbiMouseReleased

    private void backbuttonbiaddMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonbiaddMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_backbuttonbiaddMouseMoved

    private void backbuttonbiaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonbiaddMouseClicked
        bi12 p12 = new bi12();
        p12.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbuttonbiaddMouseClicked

    private void backbuttonbiaddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonbiaddMouseEntered
        backbuttonbiadd.setBackground(new java.awt.Color(255,184,79));        // TODO add your handling code here:
    }//GEN-LAST:event_backbuttonbiaddMouseEntered

    private void backbuttonbiaddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonbiaddMouseExited
        backbuttonbiadd.setBackground(new java.awt.Color(255,153,0));  // TODO add your handling code here:
    }//GEN-LAST:event_backbuttonbiaddMouseExited

    private void backbuttonbiaddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonbiaddMousePressed
        // TODO add your handling code here: 219,98,0
        backbuttonbiadd.setBackground(new java.awt.Color(219,98,0));
    }//GEN-LAST:event_backbuttonbiaddMousePressed

    private void backbuttonbiaddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonbiaddMouseReleased
        // TODO add your handling code here:
        backbuttonbiadd.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_backbuttonbiaddMouseReleased

    private void AddbuttonbiMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonbiMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_AddbuttonbiMouseMoved

    private void AddbuttonbiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonbiMouseClicked
        
        String tst1 = null;
        String tst2 = null;
        try {   //get InsNum number from table and make it an ineger 
                int n1 = etd1combobox.getSelectedIndex();
                int n2 = etd2combobox.getSelectedIndex();
                String Insnum1 = Tet.getModel().getValueAt(n1, 0).toString();
                String Insnum2 = Tet.getModel().getValueAt(n2, 0).toString();
                int id1 = Integer.parseInt(Insnum1);
                int id2 = Integer.parseInt(Insnum2);
                
                conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                stmt = conn.createStatement();
                String sql="SELECT * FROM binome Where Idetd1='"+id1+"' OR Idetd2='"+id1+"'OR Idetd1='"+id2+"' OR Idetd2='"+id2+"'";
                rs=stmt.executeQuery(sql);
                while(rs.next()){
                    tst1 = String.valueOf(rs.getInt("Idetd1"));
                    tst2 = String.valueOf(rs.getInt("Idetd2"));
                                }
} catch (Exception e) {
                System.out.println(e.getMessage());}
       if (tst1==null && tst2==null){
       
       
        int n1 = etd1combobox.getSelectedIndex();
        int n2 = etd2combobox.getSelectedIndex();
        String IdSujet = String.valueOf(sujcombobox.getSelectedItem());
        
        String Insnum1 = Tet.getModel().getValueAt(n1, 0).toString();
        String Insnum2 = Tet.getModel().getValueAt(n2, 0).toString();
        int id1 = Integer.parseInt(Insnum1);
        int id2 = Integer.parseInt(Insnum2);
        
            try {
                conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                stmt = conn.createStatement();
                String sql="INSERT INTO binome(IdSujet, Idetd1, Idetd2) VALUES ('"+IdSujet+"', '"+id1+"', '"+id2+"')";
                stmt.executeUpdate(sql);
                succ p0 = new succ();
                p0.setVisible(true);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
}
       else{
            String Nom1=null;
            String Prenom1=null;
            String Nom2=null;
            String Prenom2=null;
//Find id from tabel
try {
               
                        con2=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                        stmt2 = con2.createStatement();
                        String sql="SELECT * FROM etudiant Where InsNum='"+tst1+"'" ;
                        rs2=stmt2.executeQuery(sql);
                        while(rs2.next()){
                            Nom1 = rs2.getString("Nom");
                            Prenom1 = rs2.getString("Prenom");
                        }
                   }
                   catch (Exception e) {
                System.out.println(e.getMessage());
                 }
                        try {
                        con3=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                        stmt3 = con3.createStatement();
                        String sql="SELECT * FROM etudiant Where InsNum='"+tst2+"'" ;
                        rs3=stmt3.executeQuery(sql);
                        while(rs3.next()){
                            Nom2 = rs3.getString("Nom");
                            Prenom2 = rs3.getString("Prenom"); 
                        }
                   }
                               catch (Exception e) {
                            System.out.println(e.getMessage());
                             }
              System.out.println(Nom1 +" "+Prenom1+" et "+Nom2 +" "+Prenom2+" sont deja un binome !");
              JOptionPane.showMessageDialog(null,Nom1 +" "+Prenom1+" et "+Nom2 +" "+Prenom2+" sont deja un binome !");
       }
     
        
       // succ p0 = new succ();
       // p0.setVisible(true);
    }//GEN-LAST:event_AddbuttonbiMouseClicked

    private void AddbuttonbiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonbiMouseEntered
        Addbuttonbi.setBackground(new java.awt.Color(255,184,79));        // TODO add your handling code here:
    }//GEN-LAST:event_AddbuttonbiMouseEntered

    private void AddbuttonbiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonbiMouseExited
        Addbuttonbi.setBackground(new java.awt.Color(255,153,0));  // TODO add your handling code here:
    }//GEN-LAST:event_AddbuttonbiMouseExited

    private void AddbuttonbiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonbiMousePressed
        // TODO add your handling code here: 219,98,0
        Addbuttonbi.setBackground(new java.awt.Color(219,98,0));
    }//GEN-LAST:event_AddbuttonbiMousePressed

    private void AddbuttonbiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddbuttonbiMouseReleased
        // TODO add your handling code here:
        Addbuttonbi.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_AddbuttonbiMouseReleased

    private void grpcomboboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grpcomboboxMouseClicked
    
    }//GEN-LAST:event_grpcomboboxMouseClicked

    private void grpcomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grpcomboboxActionPerformed
   
    }//GEN-LAST:event_grpcomboboxActionPerformed

    private void grpcomboboxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grpcomboboxMouseExited
    
    }//GEN-LAST:event_grpcomboboxMouseExited

    private void chMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_chMouseMoved

    private void chMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chMouseClicked
    filletdcombobox();
    etd();
    }//GEN-LAST:event_chMouseClicked

    private void chMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chMouseEntered
        ch.setBackground(new java.awt.Color(255,184,79));        // TODO add your handling code here:
    }//GEN-LAST:event_chMouseEntered

    private void chMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chMouseExited
        ch.setBackground(new java.awt.Color(255,153,0));  // TODO add your handling code here:
    }//GEN-LAST:event_chMouseExited

    private void chMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chMousePressed
        // TODO add your handling code here: 219,98,0
        ch.setBackground(new java.awt.Color(219,98,0));
    }//GEN-LAST:event_chMousePressed

    private void chMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chMouseReleased
        // TODO add your handling code here:
        ch.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_chMouseReleased

    private void TetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TetMouseClicked

    }//GEN-LAST:event_TetMouseClicked

    private void sujcomboboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sujcomboboxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sujcomboboxMouseClicked

    private void sujcomboboxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sujcomboboxMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_sujcomboboxMouseExited

    private void sujcomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sujcomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sujcomboboxActionPerformed

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
            java.util.logging.Logger.getLogger(addbi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addbi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addbi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addbi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addbi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Addbuttonbi;
    private javax.swing.JTable Tet;
    private javax.swing.JPanel backbuttonbiadd;
    private javax.swing.JPanel ch;
    private javax.swing.JComboBox<String> etd1combobox;
    private javax.swing.JComboBox<String> etd2combobox;
    private javax.swing.JComboBox<String> grpcombobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp1addbi;
    private javax.swing.JPanel menuaddbi;
    private javax.swing.JComboBox<String> sujcombobox;
    // End of variables declaration//GEN-END:variables
}
