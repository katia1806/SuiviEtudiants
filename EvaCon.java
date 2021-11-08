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


public class EvaCon extends javax.swing.JFrame {

    public EvaCon() {
        initComponents();
        affbi();
        affid2();
    }
    
    
    
    
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    Connection con2=null;
    Statement stmt2=null;
    ResultSet rs2=null;
    Connection con3=null;
    Statement stmt3=null;
    ResultSet rs3=null;
    Connection con4=null;
    Statement stmt4=null;
    ResultSet rs4=null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPmenu = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Jpbinome = new javax.swing.JPanel();
        backeditbi = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tet = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tet2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tet1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        enrg = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        note = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        Remarque = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        aa = new javax.swing.JLabel();
        ar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        backeditbi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/undo.png"))); // NOI18N

        javax.swing.GroupLayout JpbinomeLayout = new javax.swing.GroupLayout(Jpbinome);
        Jpbinome.setLayout(JpbinomeLayout);
        JpbinomeLayout.setHorizontalGroup(
            JpbinomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpbinomeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(backeditbi)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        JpbinomeLayout.setVerticalGroup(
            JpbinomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backeditbi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Evaluation Continue");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Jpbinome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(384, 384, 384)
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

        Tet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID binome", "ID sujet", "Etudiant1", "Etudiant2"
            }
        ));
        Tet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TetMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tet);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Selectionner le binôme puis la séance :");

        Tet2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idetd1", "idetd2"
            }
        ));
        Tet2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tet2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(Tet2);
        if (Tet2.getColumnModel().getColumnCount() > 0) {
            Tet2.getColumnModel().getColumn(0).setHeaderValue("idetd1");
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(100, 100, 100))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addContainerGap(125, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        Tet1.setModel(new javax.swing.table.DefaultTableModel(
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
        Tet1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tet1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tet1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        enrg.setBackground(new java.awt.Color(255, 153, 0));
        enrg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enrg.setName(""); // NOI18N
        enrg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                enrgMouseMoved(evt);
            }
        });
        enrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enrgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enrgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enrgMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                enrgMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                enrgMouseReleased(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Enregistrer l'evaluation");

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgspackage/save.png"))); // NOI18N

        javax.swing.GroupLayout enrgLayout = new javax.swing.GroupLayout(enrg);
        enrg.setLayout(enrgLayout);
        enrgLayout.setHorizontalGroup(
            enrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enrgLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        enrgLayout.setVerticalGroup(
            enrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enrgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setPaintLabels(true);
        jSlider1.setToolTipText("");
        jSlider1.setValue(0);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jSlider2.setMajorTickSpacing(10);
        jSlider2.setMinorTickSpacing(5);
        jSlider2.setPaintLabels(true);
        jSlider2.setToolTipText("");
        jSlider2.setValue(0);
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });

        note.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        Remarque.setColumns(20);
        Remarque.setRows(5);
        jScrollPane3.setViewportView(Remarque);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Avancement du rapport :");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Avancement de l'application:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Note :");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Remarque :");

        aa.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        aa.setForeground(new java.awt.Color(255, 255, 255));
        aa.setText("0");

        ar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ar.setForeground(new java.awt.Color(255, 255, 255));
        ar.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(jSlider1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(note, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(enrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(note, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(enrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

           
    

    
   
public void affbi(){
    try {   String Nom1=null;
            String Prenom1=null;
            String Nom2=null;
            String Prenom2=null;
            
            
            
                conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                stmt = conn.createStatement();
                String sql="SELECT * FROM binome";
                rs=stmt.executeQuery(sql);
                DefaultTableModel tableModel = (DefaultTableModel)Tet.getModel();
                tableModel.setRowCount(0);
                while(rs.next()){
                    //(Numero_Inscription, Nom, Prenom, Date_Naissance, Numero_Groupe, id_Binome
                   String IdBinome = String.valueOf(rs.getInt("IdBinome"));
                   String IdSujet = String.valueOf(rs.getInt("IdSujet"));
                   String Idetd1 = String.valueOf(rs.getInt("Idetd1"));
                   String Idetd2 = String.valueOf(rs.getInt("Idetd2"));
                  
                 
                   
                   try {
                        con2=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                        stmt2 = con2.createStatement();
                        sql="SELECT * FROM etudiant Where InsNum='"+Idetd1+"'" ;
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
                        sql="SELECT * FROM etudiant Where InsNum='"+Idetd2+"'" ;
                        rs3=stmt3.executeQuery(sql);
                        while(rs3.next()){
                    
                            Nom2 = rs3.getString("Nom");
                            Prenom2 = rs3.getString("Prenom");
                            
                           
                        }
                   }
                               catch (Exception e) {
                            System.out.println(e.getMessage());
                             }
                 
                                     
                 
                 String tbData[] = {IdBinome, IdSujet,Nom1+ " "+ Prenom1,Nom2+" "+Prenom2,Idetd1};
                 tableModel.addRow(tbData);
                }
                
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
}
    public void affid2(){
    try {   String Nom1=null;
            String Prenom1=null;
            String Nom2=null;
            String Prenom2=null;
            
            
            
                conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                stmt = conn.createStatement();
                String sql="SELECT * FROM binome";
                rs=stmt.executeQuery(sql);
                DefaultTableModel tableModel = (DefaultTableModel)Tet2.getModel();
                tableModel.setRowCount(0);
                while(rs.next()){
  
                   String Idetd1 = String.valueOf(rs.getInt("Idetd1"));
                   String Idetd2 = String.valueOf(rs.getInt("Idetd2"));
               
                 
                                     
                 
                 String tbData[] = {Idetd1,Idetd2};
                 tableModel.addRow(tbData);
                }
                
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
}
    
    
    
    
    
    
    
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

    private void enrgMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrgMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_enrgMouseMoved

    private void enrgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrgMouseClicked
        String t1 = null;
        int row = Tet.getSelectedRow();
        int row2 = Tet1.getSelectedRow();
        if(row == -1 && row2 == -1)
        {
            JOptionPane.showMessageDialog(null,"Select votre Binome et Seance");
        }
        else if(row == -1)
        {
            JOptionPane.showMessageDialog(null,"Select votre Binome");
        }
        else if(row2 == -1)
        {
            JOptionPane.showMessageDialog(null,"Select votre Seance");
        }

        else{
                   
                    String Rem = String.valueOf(Remarque.getText());
                    String Note = String.valueOf(note.getSelectedItem());
                    String avr = String.valueOf(jSlider1.getValue()); //
                    String ava = String.valueOf(jSlider2.getValue()); //String.valueOf(grpcombobox.getSelectedItem());
                    String idbb=Tet.getModel().getValueAt(row, 0).toString();
                    String idss=Tet1.getModel().getValueAt(row2, 0).toString();
                    int IdBinome=Integer.valueOf(idbb);
                    int IdSeance=Integer.valueOf(idss);
                    
                    System.out.println("idb ="+IdBinome+" ids ="+IdSeance);  
                    
        try {   System.out.println("idb ="+IdBinome+" ids ="+IdSeance);  
                con4=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                stmt4 = con4.createStatement();
                String sql="SELECT * FROM evalcontinue WHERE IdBinome='"+IdBinome+"' AND `IdSeance`='"+IdSeance+"'";
                rs4=stmt4.executeQuery(sql);
                while(rs4.next()){
                t1 = String.valueOf(rs4.getInt("IdSeance"));
                System.out.println("t1 ="+t1);
                        }
                

            } catch (Exception e) {
                System.out.println(e.getMessage());
         System.out.println("3");
            }            
                    
                    
                    
    System.out.println(t1);
                    
                    
                    
    if (t1 !=null){JOptionPane.showMessageDialog(null,"Il exist deja une note pour cette Seance");}
        else{
    try {
                conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                stmt = conn.createStatement();
                String sql="INSERT INTO evalcontinue(EvaEtatRap, EvaEtatapli, Remarque, Note, IdBinome, IdSeance) VALUES ('"+avr+"', '"+ava+"', '"+Rem+"', '"+Note+"', '"+IdBinome+"', '"+IdSeance+"')";
                stmt.executeUpdate(sql);
                
                succ p0 = new succ();
                p0.setVisible(true);
            System.out.println("2");

            } catch (Exception e) {
                System.out.println(e.getMessage());
         System.out.println("3");
            }
    }
       
        }
    }//GEN-LAST:event_enrgMouseClicked

    private void enrgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrgMouseEntered
        enrg.setBackground(new java.awt.Color(220,20,60));        // TODO add your handling code here:
    }//GEN-LAST:event_enrgMouseEntered

    private void enrgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrgMouseExited
        enrg.setBackground(new java.awt.Color(255,153,0));  // TODO add your handling code here:
    }//GEN-LAST:event_enrgMouseExited

    private void enrgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrgMousePressed
        // TODO add your handling code here: 219,98,0
        enrg.setBackground(new java.awt.Color(219,98,0));
    }//GEN-LAST:event_enrgMousePressed

    private void enrgMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrgMouseReleased
        // TODO add your handling code here:
        enrg.setBackground(new java.awt.Color(255,184,79));
    }//GEN-LAST:event_enrgMouseReleased

    private void Tet1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tet1MouseClicked

    
        
    }//GEN-LAST:event_Tet1MouseClicked

    private void TetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TetMouseClicked

        String idg=null;
        int srow = Tet.getSelectedRow();
        String ide=Tet2.getModel().getValueAt(srow, 0).toString();
        try {
            con2=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            stmt2 = con2.createStatement();
            String sql ="SELECT * FROM etudiant Where InsNum='"+ide+"'" ;
            rs2=stmt2.executeQuery(sql);
            while(rs2.next()){
                idg = rs2.getString("IdGroupe");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost/pfe?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            stmt = conn.createStatement();
            String sql="SELECT * FROM seance Where Idgroupe='"+idg+"'";
            rs=stmt.executeQuery(sql);
            DefaultTableModel tableModel = (DefaultTableModel)Tet1.getModel();
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
    }//GEN-LAST:event_TetMouseClicked

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
    ar.setText(Integer.toString(jSlider1.getValue()));
    }//GEN-LAST:event_jSlider1StateChanged

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
    aa.setText(Integer.toString(jSlider2.getValue()));
    }//GEN-LAST:event_jSlider2StateChanged

    private void Tet2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tet2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Tet2MouseClicked

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
            java.util.logging.Logger.getLogger(EvaCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EvaCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EvaCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EvaCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EvaCon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpbinome;
    private javax.swing.JTextArea Remarque;
    private javax.swing.JTable Tet;
    private javax.swing.JTable Tet1;
    private javax.swing.JTable Tet2;
    private javax.swing.JLabel aa;
    private javax.swing.JLabel ar;
    private javax.swing.JLabel backeditbi;
    private javax.swing.JPanel enrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPmenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JComboBox<String> note;
    // End of variables declaration//GEN-END:variables
}
