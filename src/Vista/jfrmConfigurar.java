package Vista;

import Logica.clsAviones;
import java.awt.Color;
import java.lang.NumberFormatException;


public class jfrmConfigurar extends javax.swing.JFrame {
    private jfrmPrincipal principal;
    private int xMouse, yMouse;
    
    public jfrmConfigurar(jfrmPrincipal princial) {
        this.principal = princial;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlSalida = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtPasajeros = new javax.swing.JTextField();
        txtSobrecargos = new javax.swing.JTextField();
        txtPiloto = new javax.swing.JTextField();
        pnlBotonGuardar = new javax.swing.JPanel();
        lblGuardar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(28, 33, 53));

        jPanel2.setBackground(new java.awt.Color(68, 115, 142));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Configuración");

        pnlSalida.setBackground(new java.awt.Color(68, 115, 142));

        lblSalir.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(255, 255, 255));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("X");
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlSalidaLayout = new javax.swing.GroupLayout(pnlSalida);
        pnlSalida.setLayout(pnlSalidaLayout);
        pnlSalidaLayout.setHorizontalGroup(
            pnlSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        pnlSalidaLayout.setVerticalGroup(
            pnlSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(53, 79, 100));
        jLabel3.setText("Para generar aviones por favor llene todos los campos:");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(53, 79, 100));
        jLabel4.setText("Modelo");

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(53, 79, 100));
        jLabel5.setText("Cantidad de pasajeros");

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(53, 79, 100));
        jLabel6.setText("Cantidad de Sobrecargos");

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(53, 79, 100));
        jLabel7.setText("Nombre del piloto");

        txtModelo.setBackground(new java.awt.Color(255, 255, 255));
        txtModelo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(204, 204, 204));
        txtModelo.setText("  Texto");
        txtModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtModelo.setMargin(new java.awt.Insets(5, 5, 5, 5));
        txtModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtModeloMousePressed(evt);
            }
        });

        txtPasajeros.setBackground(new java.awt.Color(255, 255, 255));
        txtPasajeros.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        txtPasajeros.setForeground(new java.awt.Color(204, 204, 204));
        txtPasajeros.setText("  Cantidad");
        txtPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtPasajeros.setMargin(new java.awt.Insets(5, 5, 5, 5));
        txtPasajeros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPasajerosMousePressed(evt);
            }
        });

        txtSobrecargos.setBackground(new java.awt.Color(255, 255, 255));
        txtSobrecargos.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        txtSobrecargos.setForeground(new java.awt.Color(204, 204, 204));
        txtSobrecargos.setText("  Cantidad");
        txtSobrecargos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtSobrecargos.setMargin(new java.awt.Insets(5, 5, 5, 5));
        txtSobrecargos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtSobrecargosMousePressed(evt);
            }
        });

        txtPiloto.setBackground(new java.awt.Color(255, 255, 255));
        txtPiloto.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 13)); // NOI18N
        txtPiloto.setForeground(new java.awt.Color(204, 204, 204));
        txtPiloto.setText("  Texto");
        txtPiloto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtPiloto.setMargin(new java.awt.Insets(5, 5, 5, 5));
        txtPiloto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPilotoMousePressed(evt);
            }
        });

        pnlBotonGuardar.setBackground(new java.awt.Color(28, 33, 53));

        lblGuardar.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        lblGuardar.setForeground(new java.awt.Color(255, 255, 255));
        lblGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGuardar.setText("Guardar");
        lblGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGuardarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonGuardarLayout = new javax.swing.GroupLayout(pnlBotonGuardar);
        pnlBotonGuardar.setLayout(pnlBotonGuardarLayout);
        pnlBotonGuardarLayout.setHorizontalGroup(
            pnlBotonGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnlBotonGuardarLayout.setVerticalGroup(
            pnlBotonGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSobrecargos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlBotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSobrecargos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(pnlBotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents
    //El siguiente método corresponde a una serie de validaciones antes de guardar un avión nuevo
    public boolean validaciones() {
        byte estado = 1;
        if (txtModelo.getText().compareTo("  Texto") == 0 || txtModelo.getText().compareTo("") == 0) { //Verificación de que la casilla Modelo no esté vacía
            txtModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 0, 0)));
            estado = 0;
        } else {
            txtModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (txtPasajeros.getText().compareTo("  Cantidad") == 0 || txtPasajeros.getText().compareTo("") == 0) { //Verificación de que la casilla pasajetos no esté vacía
            txtPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 0, 0)));
            estado = 0;
        } else {
            try {
                txtPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
                Integer.valueOf(txtPasajeros.getText()); //Validamos si los valores de la casilla son realmente numéricos de lo contrario se ejecurará la excepecion NumberFormatException
            } catch (NumberFormatException ex) {
                estado = 0;
                txtPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 0, 0)));
            }
        }
        if (txtSobrecargos.getText().compareTo("  Cantidad") == 0 || txtSobrecargos.getText().compareTo("") == 0) { //Verificación de que la casilla sobrecargos no esté vacía
            txtSobrecargos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 0, 0)));
            estado = 0;
        } else {
            try {
                txtSobrecargos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
                Integer.valueOf(txtSobrecargos.getText()); //Validamos si los valores de la casilla son realmente numéricos de lo contrario se ejecurará la excepecion NumberFormatException
            } catch (NumberFormatException ex) {
                estado = 0;
                txtSobrecargos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 0, 0)));
            }
        }
        if (txtPiloto.getText().compareTo("  Texto") == 0 || txtPiloto.getText().compareTo("") == 0) {
            txtPiloto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 0, 0)));
            estado = 0;
        } else {
            txtPiloto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        
        //Si la variable "Estado" ha cambiado su valos es porque hay por lo menos un dato que no es válido para crear un avión nuevo
        if (estado == 0) {
            return false;
        } else {
            return true;
        }
    }
    
    public void iniciarCampos() {
        //Formatos iniciales de cajas de texto vacías
        txtModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtModelo.setForeground(new java.awt.Color(204, 204, 204));
        txtModelo.setText("  Texto");
        
        txtPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtPasajeros.setForeground(new java.awt.Color(204, 204, 204));
        txtPasajeros.setText("  Cantidad");
        
        txtSobrecargos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtSobrecargos.setForeground(new java.awt.Color(204, 204, 204));
        txtSobrecargos.setText("  Cantidad");
        
        txtPiloto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtPiloto.setForeground(new java.awt.Color(204, 204, 204));
        txtPiloto.setText("  Texto");
    }
      
    public void agregarAvion(){
        //Creación de lo objeto enviado a la lista central de la ventana principal
        clsAviones avion = new clsAviones(txtModelo.getText(), Integer.parseInt(txtPasajeros.getText()), Integer.parseInt(txtSobrecargos.getText()), txtPiloto.getText(), false);
        principal.setCentral(avion);
    }
      
    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        pnlSalida.setBackground(new java.awt.Color(237, 0, 0)); //Formato de color botón de salida
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        pnlSalida.setBackground(new java.awt.Color(68, 115, 142)); //Formato de color botón de salida
    }//GEN-LAST:event_lblSalirMouseExited

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        this.dispose(); //Botón de salida
    }//GEN-LAST:event_lblSalirMouseClicked
        //Formato de colores de bordes y fuente al presionar caja de texto Modelo
    private void txtModeloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModeloMousePressed
        txtModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 115, 142)));
        txtPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtSobrecargos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtPiloto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        if (txtModelo.getText().equals("  Texto")) {
            txtModelo.setText("");
            txtModelo.setForeground(Color.BLACK);

            txtPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
            txtSobrecargos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
            txtPiloto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
        if (txtPasajeros.getText().equals("")) {
            txtPasajeros.setText("  Cantidad");
            txtPasajeros.setForeground(new java.awt.Color(204, 204, 204));
            txtPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (txtSobrecargos.getText().equals("")) {
            txtSobrecargos.setText("  Cantidad");
            txtSobrecargos.setForeground(new java.awt.Color(204, 204, 204));
            txtSobrecargos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (txtPiloto.getText().equals("")) {
            txtPiloto.setText("  Texto");
            txtPiloto.setForeground(new java.awt.Color(204, 204, 204));
            txtPiloto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
    }//GEN-LAST:event_txtModeloMousePressed
    //Formato de colores de bordes y fuente al presionar caja de texto Pasajeros
    private void txtPasajerosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasajerosMousePressed
        txtPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 115, 142)));
        txtSobrecargos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtPiloto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        if (txtPasajeros.getText().equals("  Cantidad")) {
            txtPasajeros.setText("");
            txtPasajeros.setForeground(Color.BLACK);

            txtSobrecargos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
            txtPiloto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
            txtModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (txtSobrecargos.getText().equals("")) {
            txtSobrecargos.setText("  Cantidad");
            txtSobrecargos.setForeground(new java.awt.Color(204, 204, 204));
            txtSobrecargos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (txtPiloto.getText().equals("")) {
            txtPiloto.setText("  Texto");
            txtPiloto.setForeground(new java.awt.Color(204, 204, 204));
            txtPiloto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (txtModelo.getText().equals("")) {
            txtModelo.setText("  Texto");
            txtModelo.setForeground(new java.awt.Color(204, 204, 204));
            txtModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
    }//GEN-LAST:event_txtPasajerosMousePressed
    //Formato de colores de bordes y fuente al presionar caja de texto Sobrecargos
    private void txtSobrecargosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSobrecargosMousePressed
        txtSobrecargos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 115, 142)));
        txtPiloto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        if (txtSobrecargos.getText().equals("  Cantidad")) {
            txtSobrecargos.setText("");
            txtSobrecargos.setForeground(Color.BLACK);

            txtPiloto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
            txtModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
            txtPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (txtPiloto.getText().equals("")) {
            txtPiloto.setText("  Texto");
            txtPiloto.setForeground(new java.awt.Color(204, 204, 204));
            txtPiloto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (txtModelo.getText().equals("")) {
            txtModelo.setText("  Texto");
            txtModelo.setForeground(new java.awt.Color(204, 204, 204));
            txtModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (txtPasajeros.getText().equals("")) {
            txtPasajeros.setText("  Cantidad");
            txtPasajeros.setForeground(new java.awt.Color(204, 204, 204));
            txtPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
    }//GEN-LAST:event_txtSobrecargosMousePressed
    //Formato de colores de bordes y fuente al presionar caja de texto NombrePiloto
    private void txtPilotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPilotoMousePressed
        txtPiloto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 115, 142)));
        txtModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtSobrecargos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        if (txtPiloto.getText().equals("  Texto")) {
            txtPiloto.setText("");
            txtPiloto.setForeground(Color.BLACK);

            txtModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
            txtPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
            txtSobrecargos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (txtModelo.getText().equals("")) {
            txtModelo.setText("  Texto");
            txtModelo.setForeground(new java.awt.Color(204, 204, 204));
            txtModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (txtPasajeros.getText().equals("")) {
            txtPasajeros.setText("  Cantidad");
            txtPasajeros.setForeground(new java.awt.Color(204, 204, 204));
            txtPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }

        if (txtSobrecargos.getText().equals("")) {
            txtSobrecargos.setText("  Cantidad");
            txtSobrecargos.setForeground(new java.awt.Color(204, 204, 204));
            txtSobrecargos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        }
    }//GEN-LAST:event_txtPilotoMousePressed

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        if (validaciones()) {
            agregarAvion();
            iniciarCampos(); //Reiniciar las cajas de texto
        }
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void lblGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseEntered
        pnlBotonGuardar.setBackground(new java.awt.Color(68, 115, 142));
    }//GEN-LAST:event_lblGuardarMouseEntered

    private void lblGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseExited
        pnlBotonGuardar.setBackground(new java.awt.Color(28, 33, 53));
    }//GEN-LAST:event_lblGuardarMouseExited

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        //Valores de las cordenadas del mouse al presionar la "barra" superior de la ventan
        this.xMouse = evt.getX();
        this.yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        //Se capatan los valores actuales de las coordenadas del mouse al desplazar el mouse con el evento de arrastre
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        //Se ajusta la ventan a como se va a arrastrando el mouse
        this.setLocation(x - this.xMouse, y - this.yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

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
            java.util.logging.Logger.getLogger(jfrmConfigurar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmConfigurar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmConfigurar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmConfigurar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmConfigurar(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel pnlBotonGuardar;
    private javax.swing.JPanel pnlSalida;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPasajeros;
    private javax.swing.JTextField txtPiloto;
    private javax.swing.JTextField txtSobrecargos;
    // End of variables declaration//GEN-END:variables
}
