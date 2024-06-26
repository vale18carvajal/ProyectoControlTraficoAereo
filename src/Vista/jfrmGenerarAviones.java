package Vista;

import Logica.clsAviones;
import Logica.clsListasAviones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author valer
 */
public class jfrmGenerarAviones extends javax.swing.JFrame {
    private String nombre;
    
    public jfrmGenerarAviones(String nombre) {
        initComponents();
        this.nombre = nombre; //Se obtiene el nombre del usuario por medio de la instancia de esta clase
        nombreUsuario();
        inicializarPopUpMenu();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuTabla = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAviones = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlBoton = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblNombre.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(68, 115, 142));
        lblNombre.setText("Nombre");

        tblAviones.setBackground(new java.awt.Color(255, 255, 255));
        tblAviones.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        tblAviones.setForeground(new java.awt.Color(0, 0, 0));
        tblAviones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Modelo", "Cantidad pasajeros", "Cantidad sobrecargos", "Nombre Piloto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblAviones.setToolTipText("");
        tblAviones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblAviones.setGridColor(new java.awt.Color(204, 204, 204));
        tblAviones.setRowHeight(22);
        tblAviones.setSelectionBackground(new java.awt.Color(232, 114, 69));
        tblAviones.setShowGrid(true);
        jScrollPane1.setViewportView(tblAviones);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(68, 115, 142));
        jLabel2.setText("¡Hola");

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(53, 79, 100));
        jLabel1.setText("Para empezar la simulación debe añadir información de los aviones a controlar en la tabla.");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(53, 79, 100));
        jLabel3.setText("*Debe ingresar mínimo 10 aviones.");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(53, 79, 100));
        jLabel4.setText("*Para añadir más de 10 aviones puede verlo en las opciones de la tabla presionando click derecho.");

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(53, 79, 100));
        jLabel5.setText("*El máximo de aviones para empezar el simulador es de 25.");

        pnlBoton.setBackground(new java.awt.Color(53, 79, 100));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Iniciar Simulación");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonLayout = new javax.swing.GroupLayout(pnlBoton);
        pnlBoton.setLayout(pnlBotonLayout);
        pnlBotonLayout.setHorizontalGroup(
            pnlBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
        );
        pnlBotonLayout.setVerticalGroup(
            pnlBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(458, 458, 458)
                        .addComponent(pnlBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblNombre))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(pnlBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void nombreUsuario(){
        lblNombre.setText(this.nombre + "!"); //Se muestra el nombre del usuario en pantalla
    }
    
    public void leerDatos() {
        clsListasAviones listaAviones = new clsListasAviones();
        DefaultTableModel modelo = (DefaultTableModel) tblAviones.getModel();
        
        //Obtengo la cantidad de filas de la tabla
        int cantidadFilas = modelo.getRowCount();

        boolean validacion = true; //Cambiará a false en caso de que encuentre alguna fila o celda vacía de la tabla
        for (int i = 0; i < cantidadFilas; i++) {

            if (modelo.getValueAt(i, 0) == null || modelo.getValueAt(i, 0).toString() == ""
                    || modelo.getValueAt(i, 1) == null || modelo.getValueAt(i, 1).toString() == ""
                    || modelo.getValueAt(i, 2) == null || modelo.getValueAt(i, 2).toString() == ""
                    || modelo.getValueAt(i, 3) == null || modelo.getValueAt(i, 3).toString() == "") {
                if (validacion) { //Se valida si anteriormente ya se ha cambiado el valor de la variable.
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Problema", JOptionPane.ERROR_MESSAGE);
                    validacion = false;
                }

            } else {
                String modeloAvion = modelo.getValueAt(i, 0).toString();
                String pasajeros = modelo.getValueAt(i, 1).toString();
                String sobrecargos = modelo.getValueAt(i, 2).toString();
                String nombrePiloto = modelo.getValueAt(i, 3).toString();
                clsAviones avion = new clsAviones(modeloAvion, Integer.parseInt(pasajeros), Integer.parseInt(sobrecargos), nombrePiloto, true);
                //Añado un avión a la lista central
                listaAviones.aniadirCentral(avion);
            }
            
        }
       

        if (validacion) {
            //Se abre la ventana principal del simulador
            jfrmPrincipal ventana = new jfrmPrincipal(listaAviones);
            ventana.setVisible(true);

            //Se cierra la ventana de inicio
            jfrmInicio ventanaAnterior = new jfrmInicio();
            ventanaAnterior.dispose();

            //Se cierra la ventana actual
            this.dispose();
        }
    }

    public boolean validaciones() {
        DefaultTableModel modelo = (DefaultTableModel) tblAviones.getModel();

        if (modelo.getRowCount() < 10) {
            JOptionPane.showMessageDialog(null, "Debe ingresar mínimo 10 aviones", "Problema", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (modelo.getRowCount() > 25) {
            JOptionPane.showMessageDialog(null, "Debe ingresar máximo 25 aviones para el inicio de la simulación", "Problema", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }

    }
    
    public void inicializarPopUpMenu() {
        //Se crean las opciones para el popup menu
        JMenuItem agregar = new JMenuItem("Añadir fila");
        JMenuItem eliminar = new JMenuItem("Borrar fila");

        //Se añaden las opciones creadas al popup menu
        menuTabla.add(agregar);
        menuTabla.addSeparator();
        menuTabla.add(eliminar);

        //Se le añade a la tabla el popup menu
        tblAviones.setComponentPopupMenu(menuTabla);

        //Se le agrega las funcionalidades de agregar y eliminar filas a las opciones del popup menu
        agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel modelo = (DefaultTableModel) tblAviones.getModel();
                String [] fila = null;
                //modelo.addRow(new Object[]{null, null, null, null});//Se añade una fila vacía
                modelo.addRow(fila);//Se añade una fila vacía
            }
        });

        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel modelo = (DefaultTableModel) tblAviones.getModel();
                int fila = tblAviones.getSelectedRow();
                if (fila == -1) {    //Si el método getSelectedRow retorna -1 es porque no hay una fila seleccionada que borrar
                    JOptionPane.showMessageDialog(null, "Para eliminar una fila debe seleccionarla", "Información", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    modelo.removeRow(fila);
                }
            }
        });
    }
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if (validaciones() == true) {
            leerDatos();
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        pnlBoton.setBackground(new java.awt.Color(232, 114, 69));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        pnlBoton.setBackground(new java.awt.Color(53, 79, 100));
    }//GEN-LAST:event_jLabel6MouseExited

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
            java.util.logging.Logger.getLogger(jfrmGenerarAviones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmGenerarAviones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmGenerarAviones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmGenerarAviones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmGenerarAviones("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPopupMenu menuTabla;
    private javax.swing.JPanel pnlBoton;
    private javax.swing.JTable tblAviones;
    // End of variables declaration//GEN-END:variables
}
