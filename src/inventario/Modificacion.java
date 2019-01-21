/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Richie
 */
public class Modificacion extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    public Modificacion() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btSalir = new javax.swing.JButton();
        btConsulta = new javax.swing.JButton();
        btAlta = new javax.swing.JButton();
        btInicio = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        numTrabajador = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cNumGac = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cFecRec = new com.toedter.calendar.JDateChooser();
        cFecRec2 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cFecEje = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        cFecEje2 = new com.toedter.calendar.JDateChooser();
        jPanel7 = new javax.swing.JPanel();
        btBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hemeroteca de la Editora de Gobierno");

        btSalir.setBackground(new java.awt.Color(255, 255, 255));
        btSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btSalir.setText("Salir");
        btSalir.setBorderPainted(false);
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        btConsulta.setBackground(new java.awt.Color(255, 255, 255));
        btConsulta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btConsulta.setText("Consulta");
        btConsulta.setBorderPainted(false);
        btConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaActionPerformed(evt);
            }
        });

        btAlta.setBackground(new java.awt.Color(255, 255, 255));
        btAlta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btAlta.setText("Alta");
        btAlta.setBorderPainted(false);
        btAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltaActionPerformed(evt);
            }
        });

        btInicio.setBackground(new java.awt.Color(255, 255, 255));
        btInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btInicio.setText("Inicio");
        btInicio.setBorderPainted(false);
        btInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInicioActionPerformed(evt);
            }
        });

        btModificar.setBackground(new java.awt.Color(255, 255, 255));
        btModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btModificar.setText("Modificar");
        btModificar.setBorderPainted(false);
        btModificar.setEnabled(false);
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        numTrabajador.setText("12345");

        nombre.setText("Bienvenido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 331, Short.MAX_VALUE)
                .addComponent(nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numTrabajador)
                .addGap(18, 18, 18)
                .addComponent(btInicio)
                .addGap(18, 18, 18)
                .addComponent(btAlta)
                .addGap(18, 18, 18)
                .addComponent(btConsulta)
                .addGap(18, 18, 18)
                .addComponent(btModificar)
                .addGap(18, 18, 18)
                .addComponent(btSalir)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalir)
                    .addComponent(jLabel5)
                    .addComponent(btConsulta)
                    .addComponent(btAlta)
                    .addComponent(btInicio)
                    .addComponent(btModificar)
                    .addComponent(numTrabajador)
                    .addComponent(nombre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(128, 128, 128));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos de Consulta");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Número de gaceta:");

        cNumGac.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cNumGac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNumGacKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Fecha de recepción:");

        cFecRec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cFecRec2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("-");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cNumGac, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(cFecRec, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(cFecRec2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cNumGac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cFecRec2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cFecRec, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Fecha del ejemplar:");

        cFecEje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("-");

        cFecEje2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(cFecEje, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(cFecEje2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cFecEje, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(cFecEje2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        btBuscar.setBackground(new java.awt.Color(85, 86, 90));
        btBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btBuscar.setText("Buscar");
        btBuscar.setPreferredSize(new java.awt.Dimension(220, 46));
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(497, 497, 497)
                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Gaceta", "Tipo", "Tomo", "Páginas", "Fecha", "Tiraje", "Existencia", "Recepción", "Acción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInicioActionPerformed
        // TODO add your handling code here:
        Index vent = new Index();
        Index.nombre.setText(nombre.getText());
        Index.numTrabajador.setText(numTrabajador.getText());
        vent.setVisible(true);
        vent.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btInicioActionPerformed

    private void btAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltaActionPerformed
        // TODO add your handling code here:
        Alta vent = new Alta();
        Alta.nombre.setText(nombre.getText());
        Alta.numTrabajador.setText(numTrabajador.getText());
        vent.setVisible(true);
        vent.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btAltaActionPerformed

    private void btConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaActionPerformed
        // TODO add your handling code here:
        Consulta vent = new Consulta();
        Consulta.nombre.setText(nombre.getText());
        Consulta.numTrabajador.setText(numTrabajador.getText());
        vent.setVisible(true);
        vent.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btConsultaActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        // TODO add your handling code here:
        Modificacion vent = new Modificacion();
        Modificacion.nombre.setText(nombre.getText());
        Modificacion.numTrabajador.setText(numTrabajador.getText());
        vent.setVisible(true);
        vent.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btModificarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        Login vent = new Login();
        vent.setVisible(true);
        vent.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void cNumGacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNumGacKeyTyped
        // TODO add your handling code here:
        Character c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_cNumGacKeyTyped

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            DefaultTableCellRenderer alinearCentro = new DefaultTableCellRenderer();
            alinearCentro.setHorizontalAlignment(SwingConstants.CENTER);

            jTable1.setDefaultRenderer(Object.class, new Render());

            for (int i = jTable1.getColumnCount() - 2; i >= 0; i--) {
                jTable1.getColumnModel().getColumn(i).setCellRenderer(alinearCentro);
            }
            jTable1.setRowHeight(30);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50); // Ancho ID
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(50); // Ancho Gaceta
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150); // Ancho Tipo
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50); // Ancho Tomo
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50); // Ancho Página
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(120); // Ancho Fecha
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(50); // Ancho Tiraje
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(50); // Ancho Existencia
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(120); // Ancho Recepción
            //jTable1.getColumnModel().getColumn(9).setPreferredWidth(175); // Ancho Persona
            LimpiarTabla();

            MySQLConnection bd = new MySQLConnection();
            Connection c = bd.Conectar();
            ResultSet rs;
            PreparedStatement pst;

            if (cNumGac.getText().isEmpty() && cFecEje.getDate() == null && cFecRec.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Todos los está vacíos", "ERROR", JOptionPane.ERROR_MESSAGE);
                bd.Desconectar();
                return;
            }
            if (!cNumGac.getText().isEmpty() && cFecEje.getDate() == null && cFecEje2.getDate() == null && cFecRec.getDate() == null && cFecRec2.getDate() == null) {
                String sql = "SELECT * FROM gacetas WHERE numeroGaceta = " + cNumGac.getText();
                pst = c.prepareStatement(sql);
                rs = pst.executeQuery();
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        new Integer(rs.getString(1)), // ID
                        new Integer(rs.getString(2)), // Número de Gaceta
                        new String(rs.getString(4)), // Tipo
                        new Integer(rs.getString(7)), // Tomo
                        new Integer(rs.getString(3)), // Páginas del Ejemplar
                        new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate(5)), // Fecha del Ejemplar
                        new Integer(rs.getString(10)), //NúmeroEjemplares
                        new Integer(rs.getString(11)), //EjemplaresHemeroteca
                        new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate(8)), // Fecha Recepción
                        new JButton("Modificar")

                    //new String(rs.getString(6)) // ArchivoDigital
                    });
                }
                return;
            }
            if (cNumGac.getText().isEmpty() && cFecEje.getDate() != null && cFecEje2.getDate() == null && cFecRec.getDate() == null && cFecRec2.getDate() == null) {
                String sql = "SELECT * FROM gacetas WHERE fechaEjemplar = '" + new SimpleDateFormat("yyyy/MM/dd").format(cFecEje.getDate()) + "'";
                pst = c.prepareStatement(sql);
                rs = pst.executeQuery();
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        new Integer(rs.getString(1)), // ID
                        new Integer(rs.getString(2)), // Número de Gaceta
                        new String(rs.getString(4)), // Tipo
                        new Integer(rs.getString(7)), // Tomo
                        new Integer(rs.getString(3)), // Páginas del Ejemplar
                        new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate(5)), // Fecha del Ejemplar
                        new Integer(rs.getString(10)), //NúmeroEjemplares
                        new Integer(rs.getString(11)), //EjemplaresHemeroteca
                        new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate(8)), // Fecha Recepción
                        new JButton("Modificar")
                    //new String(rs.getString(6)) // ArchivoDigital
                    });
                }
                return;
            }

            // Parámetro de fechas
            if (cNumGac.getText().isEmpty() && cFecEje.getDate() != null && cFecEje2.getDate() != null && cFecRec.getDate() == null && cFecRec2.getDate() == null) {
                System.out.println("Entra?");

                String sql = "SELECT * FROM gacetas WHERE fechaEjemplar BETWEEN '" + new SimpleDateFormat("yyyy/MM/dd").format(cFecEje.getDate())
                        + "' AND '" + new SimpleDateFormat("yyyy/MM/dd").format(cFecEje2.getDate()) + "';";
                pst = c.prepareStatement(sql);
                rs = pst.executeQuery();
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        new Integer(rs.getString(1)), // ID
                        new Integer(rs.getString(2)), // Número de Gaceta
                        new String(rs.getString(4)), // Tipo
                        new Integer(rs.getString(7)), // Tomo
                        new Integer(rs.getString(3)), // Páginas del Ejemplar
                        new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate(5)), // Fecha del Ejemplar
                        new Integer(rs.getString(10)), //NúmeroEjemplares
                        new Integer(rs.getString(11)), //EjemplaresHemeroteca
                        new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate(8)), // Fecha Recepción
                        new JButton("Modificar")
                    //new String(rs.getString(6)) // ArchivoDigital
                    });
                }
                return;
            }
            //

            if (cNumGac.getText().isEmpty() && cFecEje.getDate() == null && cFecEje2.getDate() == null && cFecRec.getDate() != null && cFecRec2.getDate() == null) {
                String sql = "SELECT * FROM gacetas WHERE fechaRecepcion = '" + new SimpleDateFormat("yyyy/MM/dd").format(cFecRec.getDate()) + "'";
                pst = c.prepareStatement(sql);
                rs = pst.executeQuery();
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        new Integer(rs.getString(1)), // ID
                        new Integer(rs.getString(2)), // Número de Gaceta
                        new String(rs.getString(4)), // Tipo
                        new Integer(rs.getString(7)), // Tomo
                        new Integer(rs.getString(3)), // Páginas del Ejemplar
                        new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate(5)), // Fecha del Ejemplar
                        new Integer(rs.getString(10)), //NúmeroEjemplares
                        new Integer(rs.getString(11)), //EjemplaresHemeroteca
                        new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate(8)), // Fecha Recepción
                        new JButton("Modificar")

                    //new String(rs.getString(6)) // ArchivoDigital
                    });
                }
                return;
            }
            if (cNumGac.getText().isEmpty() && cFecEje.getDate() == null && cFecEje2.getDate() == null && cFecRec.getDate() != null && cFecRec2.getDate() != null) {

                String sql = "SELECT * FROM gacetas WHERE fechaRecepcion BETWEEN '" + new SimpleDateFormat("yyyy/MM/dd").format(cFecRec.getDate())
                        + "' AND '" + new SimpleDateFormat("yyyy/MM/dd").format(cFecRec2.getDate()) + "';";
                pst = c.prepareStatement(sql);
                rs = pst.executeQuery();
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        new Integer(rs.getString(1)), // ID
                        new Integer(rs.getString(2)), // Número de Gaceta
                        new String(rs.getString(4)), // Tipo
                        new Integer(rs.getString(7)), // Tomo
                        new Integer(rs.getString(3)), // Páginas del Ejemplar
                        new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate(5)), // Fecha del Ejemplar
                        new Integer(rs.getString(10)), //NúmeroEjemplares
                        new Integer(rs.getString(11)), //EjemplaresHemeroteca
                        new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate(8)), // Fecha Recepción
                        new JButton("Modificar")

                    //new String(rs.getString(6)) // ArchivoDigital
                    });
                }
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Sólo puede consultar por un parámetro", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            bd.Desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int columna = jTable1.getColumnModel().getColumnIndexAtX(evt.getX());
        int fila = evt.getY() / jTable1.getRowHeight();

        if (fila < jTable1.getRowCount() && fila >= 0 && columna < jTable1.getColumnCount() && columna >= 0) {
            Object value = jTable1.getValueAt(fila, columna);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                int id = Integer.parseInt(jTable1.getModel().getValueAt(fila, 0).toString());
                int eje = Integer.parseInt(jTable1.getModel().getValueAt(fila, 7).toString());
                String nom = nombre.getText();
                Actualizar vent = new Actualizar(id, eje, nom);
                Actualizar.idGac.setText(Integer.toString(id));
                Actualizar.cEjeHem.setText(Integer.toString(eje));
                vent.setVisible(true);
                vent.setLocationRelativeTo(null);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Modificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlta;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btConsulta;
    private javax.swing.JButton btInicio;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btSalir;
    private com.toedter.calendar.JDateChooser cFecEje;
    private com.toedter.calendar.JDateChooser cFecEje2;
    private com.toedter.calendar.JDateChooser cFecRec;
    private com.toedter.calendar.JDateChooser cFecRec2;
    private javax.swing.JTextField cNumGac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JLabel nombre;
    public static javax.swing.JLabel numTrabajador;
    // End of variables declaration//GEN-END:variables

    public void LimpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        int a = modelo.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

}
