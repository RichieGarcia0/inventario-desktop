/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import static com.itextpdf.text.Annotation.URL;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Richie
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    public Index() {
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
        nombre = new javax.swing.JLabel();
        numTrabajador = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btAltas = new javax.swing.JButton();
        btModificaciones = new javax.swing.JButton();
        btInventario = new javax.swing.JButton();
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
        btInicio.setEnabled(false);
        btInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInicioActionPerformed(evt);
            }
        });

        btModificar.setBackground(new java.awt.Color(255, 255, 255));
        btModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btModificar.setText("Modificar");
        btModificar.setBorderPainted(false);
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        nombre.setText("Bienvenido");

        numTrabajador.setText("12345");

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
                    .addComponent(nombre)
                    .addComponent(numTrabajador))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(128, 128, 128));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Historiales");

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

        jPanel4.setBackground(new java.awt.Color(128, 128, 128));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Resultados");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btAltas.setBackground(new java.awt.Color(85, 86, 90));
        btAltas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btAltas.setForeground(new java.awt.Color(255, 255, 255));
        btAltas.setText("Altas");
        btAltas.setPreferredSize(new java.awt.Dimension(220, 46));
        btAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltasActionPerformed(evt);
            }
        });

        btModificaciones.setBackground(new java.awt.Color(85, 86, 90));
        btModificaciones.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btModificaciones.setForeground(new java.awt.Color(255, 255, 255));
        btModificaciones.setText("Modificaciones");
        btModificaciones.setPreferredSize(new java.awt.Dimension(220, 46));
        btModificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificacionesActionPerformed(evt);
            }
        });

        btInventario.setBackground(new java.awt.Color(85, 86, 90));
        btInventario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btInventario.setForeground(new java.awt.Color(255, 255, 255));
        btInventario.setText("Inventario");
        btInventario.setPreferredSize(new java.awt.Dimension(220, 46));
        btInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInventarioActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Gaceta", "Tipo", "Tomo", "Fecha", "Ejemplares", "Usuario", "Registrado", "Razón | Cliente | Referencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(btAltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btModificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btModificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
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

    private void btAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltasActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            DefaultTableCellRenderer alinearCentro = new DefaultTableCellRenderer();
            alinearCentro.setHorizontalAlignment(SwingConstants.CENTER);

            for (int i = jTable1.getColumnCount() - 1; i >= 0; i--) {
                jTable1.getColumnModel().getColumn(i).setCellRenderer(alinearCentro);
            }
            jTable1.setRowHeight(30);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(200); // Ancho Usuario
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(175); // Ancho Registrado
            LimpiarTabla();

            MySQLConnection bd = new MySQLConnection();
            Connection c = bd.Conectar();
            ResultSet rs;
            PreparedStatement pst;
            String sql = "SELECT * FROM altas";
            pst = c.prepareStatement(sql);

            rs = pst.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    new Integer(rs.getString(1)), // ID
                    new Integer(rs.getString(2)), // Número de Gaceta
                    new String(rs.getString(3)), // Tipo
                    new Integer(rs.getString(4)), // Tomo
                    new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate(5)), //Fecha                                       
                    new Integer(rs.getString(6)), // Número de ejemplares
                    new String(rs.getString(7)), // Nombre
                    new String(rs.getString(8)) //FechaAlta
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAltasActionPerformed

    private void btModificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificacionesActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            DefaultTableCellRenderer alinearCentro = new DefaultTableCellRenderer();
            alinearCentro.setHorizontalAlignment(SwingConstants.CENTER);

            for (int i = jTable1.getColumnCount() - 1; i >= 0; i--) {
                jTable1.getColumnModel().getColumn(i).setCellRenderer(alinearCentro);
            }
            jTable1.setRowHeight(30);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(200); // Ancho Usuario
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(175); // Ancho Registrado
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(250);
            LimpiarTabla();

            MySQLConnection bd = new MySQLConnection();
            Connection c = bd.Conectar();
            ResultSet rs;
            PreparedStatement pst;
            String sql = "SELECT * FROM modificaciones";
            pst = c.prepareStatement(sql);

            rs = pst.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    new Integer(rs.getString(1)), // ID
                    new Integer(rs.getString(2)), // Número de Gaceta
                    new String(rs.getString(3)), // Tipo
                    new Integer(rs.getString(4)), // Tomo
                    new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate(5)), //Fecha                                       
                    new Integer(rs.getString(6)), // Número de ejemplares
                    new String(rs.getString(7)), // Nombre
                    new String(rs.getString(8)), //FechaBaja
                    new String(rs.getString(9) + " | " + rs.getString(10) + " | " + rs.getString(11))
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btModificacionesActionPerformed

    private void btInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInventarioActionPerformed
        // TODO add your handling code here:
        /*
        MySQLConnection bd = new MySQLConnection();
        Connection c = bd.Conectar();
        try {
            JasperReport reporte = null;
            String path = "src\\reportes\\Inventario.jasper";
            JasperReport report = JasperCompileManager.compileReport(path);
            //reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(report,null,c);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    }//GEN-LAST:event_btInventarioActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlta;
    private javax.swing.JButton btAltas;
    private javax.swing.JButton btConsulta;
    private javax.swing.JButton btInicio;
    private javax.swing.JButton btInventario;
    private javax.swing.JButton btModificaciones;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
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
