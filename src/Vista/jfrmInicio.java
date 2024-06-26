package Vista;


/**
 *
 * @author valer
 */
public class jfrmInicio extends javax.swing.JFrame {

    
    public jfrmInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlBoton = new javax.swing.JPanel();
        lblBoton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(28, 33, 53));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setBackground(new java.awt.Color(28, 33, 53));
        txtNombre.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, 220, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Logotipo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 370, 380));

        jPanel2.setBackground(new java.awt.Color(232, 114, 69));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 3, 540));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingrese su nombre:");
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 304, 170, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, 220, 10));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bienvenido al Simulador de Control ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 430, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("de Tráfico Aéreo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 430, -1));

        pnlBoton.setBackground(new java.awt.Color(232, 114, 69));

        lblBoton.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        lblBoton.setForeground(new java.awt.Color(255, 255, 255));
        lblBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBoton.setText("Deseo comenzar");
        lblBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonLayout = new javax.swing.GroupLayout(pnlBoton);
        pnlBoton.setLayout(pnlBotonLayout);
        pnlBotonLayout.setHorizontalGroup(
            pnlBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBotonLayout.setVerticalGroup(
            pnlBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(pnlBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, 160, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonMouseEntered
        pnlBoton.setBackground(new java.awt.Color(53, 79, 100));
    }//GEN-LAST:event_lblBotonMouseEntered

    private void lblBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonMouseExited
        pnlBoton.setBackground(new java.awt.Color(232, 114, 69));
    }//GEN-LAST:event_lblBotonMouseExited

    private void lblBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonMouseClicked
        jfrmGenerarAviones ventana = new jfrmGenerarAviones(txtNombre.getText());
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBotonMouseClicked

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
            java.util.logging.Logger.getLogger(jfrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBoton;
    private javax.swing.JPanel pnlBoton;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
