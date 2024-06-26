package Vista;


import Logica.clsAviones;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author valer
 */
public class jfrmAniadirAvion extends javax.swing.JFrame {
    private jfrmPrincipal principal;
    private int xMouse, yMouse; //Variables para coordenadas del mouse
    
    public jfrmAniadirAvion(jfrmPrincipal princial) {
        this.principal = princial;
        initComponents();
        crearGrupoBotones();
        cargarTabla();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAvionesInactivos = new javax.swing.JTable();
        pnlBarra = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlSalida = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        rbtnVuelo = new javax.swing.JRadioButton();
        rbtnHangar = new javax.swing.JRadioButton();
        rbtnPistaDespegue = new javax.swing.JRadioButton();
        rbtnPistaAterrizaje = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlBotonAniadir = new javax.swing.JPanel();
        lblBtnAniadir = new javax.swing.JLabel();
        pnlBontonAleatorio = new javax.swing.JPanel();
        lblBontonAleatorio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(28, 33, 53), 5, true));

        tblAvionesInactivos.setBackground(new java.awt.Color(255, 255, 255));
        tblAvionesInactivos.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        tblAvionesInactivos.setForeground(new java.awt.Color(0, 0, 0));
        tblAvionesInactivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Pasajeros", "Sobrecargos", "Nombre de Piloto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAvionesInactivos.setGridColor(new java.awt.Color(204, 204, 204));
        tblAvionesInactivos.setRowHeight(22);
        tblAvionesInactivos.setSelectionBackground(new java.awt.Color(232, 114, 69));
        tblAvionesInactivos.setShowGrid(true);
        jScrollPane1.setViewportView(tblAvionesInactivos);

        pnlBarra.setBackground(new java.awt.Color(68, 115, 142));
        pnlBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlBarraMouseDragged(evt);
            }
        });
        pnlBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlBarraMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aviones Inactivos");

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

        javax.swing.GroupLayout pnlBarraLayout = new javax.swing.GroupLayout(pnlBarra);
        pnlBarra.setLayout(pnlBarraLayout);
        pnlBarraLayout.setHorizontalGroup(
            pnlBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 674, Short.MAX_VALUE)
                .addComponent(pnlSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBarraLayout.setVerticalGroup(
            pnlBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        rbtnVuelo.setBackground(new java.awt.Color(255, 255, 255));
        rbtnVuelo.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        rbtnVuelo.setForeground(new java.awt.Color(68, 115, 142));
        rbtnVuelo.setText("Aviones en vuelo");

        rbtnHangar.setBackground(new java.awt.Color(255, 255, 255));
        rbtnHangar.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        rbtnHangar.setForeground(new java.awt.Color(68, 115, 142));
        rbtnHangar.setText("Aviones en hangar");

        rbtnPistaDespegue.setBackground(new java.awt.Color(255, 255, 255));
        rbtnPistaDespegue.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        rbtnPistaDespegue.setForeground(new java.awt.Color(68, 115, 142));
        rbtnPistaDespegue.setText("Pista de despegue");

        rbtnPistaAterrizaje.setBackground(new java.awt.Color(255, 255, 255));
        rbtnPistaAterrizaje.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        rbtnPistaAterrizaje.setForeground(new java.awt.Color(68, 115, 142));
        rbtnPistaAterrizaje.setText("Pista de aterrizaje");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(53, 79, 100));
        jLabel3.setText("Si desea elegir un avión para añadirlo a alguna lista, seleccione en la tabla el avión que desea añadir:");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(53, 79, 100));
        jLabel4.setText("Si ha seleccionado un avión, debe elegir el escenario donde desea añadirlo:");

        pnlBotonAniadir.setBackground(new java.awt.Color(68, 115, 142));

        lblBtnAniadir.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        lblBtnAniadir.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnAniadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnAniadir.setText("Añadir Selección");
        lblBtnAniadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnAniadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnAniadirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnAniadirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnAniadirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonAniadirLayout = new javax.swing.GroupLayout(pnlBotonAniadir);
        pnlBotonAniadir.setLayout(pnlBotonAniadirLayout);
        pnlBotonAniadirLayout.setHorizontalGroup(
            pnlBotonAniadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnAniadir, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        pnlBotonAniadirLayout.setVerticalGroup(
            pnlBotonAniadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnAniadir, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        pnlBontonAleatorio.setBackground(new java.awt.Color(68, 115, 142));

        lblBontonAleatorio.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        lblBontonAleatorio.setForeground(new java.awt.Color(255, 255, 255));
        lblBontonAleatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBontonAleatorio.setText("Añadir aleatoriamente");
        lblBontonAleatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBontonAleatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBontonAleatorioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBontonAleatorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBontonAleatorioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlBontonAleatorioLayout = new javax.swing.GroupLayout(pnlBontonAleatorio);
        pnlBontonAleatorio.setLayout(pnlBontonAleatorioLayout);
        pnlBontonAleatorioLayout.setHorizontalGroup(
            pnlBontonAleatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBontonAleatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
        );
        pnlBontonAleatorioLayout.setVerticalGroup(
            pnlBontonAleatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBontonAleatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlBotonAniadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(337, 337, 337))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(rbtnVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(83, 83, 83)
                            .addComponent(rbtnHangar)
                            .addGap(85, 85, 85)
                            .addComponent(rbtnPistaDespegue)
                            .addGap(85, 85, 85)
                            .addComponent(rbtnPistaAterrizaje)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(92, 92, 92)
                        .addComponent(pnlBontonAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(pnlBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(pnlBontonAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnVuelo)
                    .addComponent(rbtnHangar)
                    .addComponent(rbtnPistaDespegue)
                    .addComponent(rbtnPistaAterrizaje))
                .addGap(37, 37, 37)
                .addComponent(pnlBotonAniadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    //Método que muestra en la tabla los aviones que no se encuentran activos (Que no están en ninguna de las 4 listas)
    public void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tblAvionesInactivos.getModel();
        clsAviones[] auxAviones = this.principal.getCentral();
        String[] datosAvion = new String[4];

        if (auxAviones != null) {
            for (clsAviones avion : auxAviones) {
                if (avion.isActivo() == false) { //Se validan los aviones inactivos
                    datosAvion[0] = avion.getModelo();
                    datosAvion[1] = String.valueOf(avion.getCantidadPasajeros());
                    datosAvion[2] = String.valueOf(avion.getCantidadSobrecargos());
                    datosAvion[3] = avion.getNombrePiloto();

                    modelo.addRow(datosAvion);
                }
            }
        }
    }
    
    
    public void aniadirLista() {
        DefaultTableModel modelo = (DefaultTableModel) tblAvionesInactivos.getModel();
        int fila = tblAvionesInactivos.getSelectedRow();
        if (fila != -1) {
            String modeloAvion = modelo.getValueAt(fila, 0).toString();
            String pasajeros = modelo.getValueAt(fila, 1).toString();
            String sobrecargos = modelo.getValueAt(fila, 2).toString();
            String nombrePiloto = modelo.getValueAt(fila, 3).toString();
            clsAviones avion = new clsAviones(modeloAvion, Integer.parseInt(pasajeros), Integer.parseInt(sobrecargos), nombrePiloto, true);
            if (rbtnVuelo.isSelected()) {
                this.principal.aniadirAvionesVuelo(avion);
                JOptionPane.showMessageDialog(null, "El avión seleccionado se ha añadido a aviones en vuelo", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else if (rbtnHangar.isSelected()) {
                this.principal.aniadirAvionesHangar(avion);
                JOptionPane.showMessageDialog(null, "El avión seleccionado se ha añadido a aviones en el hangar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else if (rbtnPistaDespegue.isSelected()) {
                this.principal.aniadirAvionesPistaDespegue(avion);
                JOptionPane.showMessageDialog(null, "El avión seleccionado se ha añadido a pista de despegue", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else if (rbtnPistaAterrizaje.isSelected()) {
                this.principal.aniadirAvionesPistaAterrizaje(avion);
                JOptionPane.showMessageDialog(null, "El avión seleccionado se ha añadido a pista de aterrizaje", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar dónde desea añadir el avión", "Problema", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un avión en la tabla", "Problema", JOptionPane.ERROR_MESSAGE);
        }
       
        borrarTabla();
        cargarTabla();
    }
    
    public void aniadirListaAleatoria(){
        DefaultTableModel modelo = (DefaultTableModel) tblAvionesInactivos.getModel();
        int max = tblAvionesInactivos.getRowCount();
        int aleatorio = (int) (Math.random() * max);
        String modeloAvion = modelo.getValueAt(aleatorio, 0).toString();
        String pasajeros = modelo.getValueAt(aleatorio, 1).toString();
        String sobrecargos = modelo.getValueAt(aleatorio, 2).toString();
        String nombrePiloto = modelo.getValueAt(aleatorio, 3).toString();
        clsAviones avion = new clsAviones(modeloAvion, Integer.parseInt(pasajeros), Integer.parseInt(sobrecargos), nombrePiloto, true);

        aleatorio = (int) (Math.random() * 4);

        if (aleatorio == 0) {
            this.principal.aniadirAvionesVuelo(avion);
            JOptionPane.showMessageDialog(null, "El avión de " + nombrePiloto + " se ha añadido a 'Aviones en vuelo'", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else if (aleatorio == 1) {
            this.principal.aniadirAvionesHangar(avion);
            JOptionPane.showMessageDialog(null, "El avión de " + nombrePiloto + " se ha añadido a 'Aviones en Hangar'", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else if (aleatorio == 2) {
            this.principal.aniadirAvionesPistaDespegue(avion);
            JOptionPane.showMessageDialog(null, "El avión de " + nombrePiloto + " se ha añadido a 'Pista de Despegue'", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            this.principal.aniadirAvionesPistaAterrizaje(avion);
            JOptionPane.showMessageDialog(null, "El avión de " + nombrePiloto + " se ha añadido a 'Pista de Aterrizaje'", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        borrarTabla();
        cargarTabla();
    }
    
    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        pnlSalida.setBackground(new java.awt.Color(237, 0, 0));
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        pnlSalida.setBackground(new java.awt.Color(68, 115, 142));
    }//GEN-LAST:event_lblSalirMouseExited

    private void lblBtnAniadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnAniadirMouseEntered
        pnlBotonAniadir.setBackground(new java.awt.Color(232, 114, 69));//[232,114,69]
    }//GEN-LAST:event_lblBtnAniadirMouseEntered

    private void lblBtnAniadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnAniadirMouseExited
        pnlBotonAniadir.setBackground(new java.awt.Color(68, 115, 142));
    }//GEN-LAST:event_lblBtnAniadirMouseExited

    private void lblBtnAniadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnAniadirMouseClicked
        if (tblAvionesInactivos.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No hay aviones disponibles, puede agregar aviones en Configuración", "Problema", JOptionPane.ERROR_MESSAGE);
        } else {
            aniadirLista();
        }
    }//GEN-LAST:event_lblBtnAniadirMouseClicked

    private void lblBontonAleatorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBontonAleatorioMouseEntered
        pnlBontonAleatorio.setBackground(new java.awt.Color(232, 114, 69));
    }//GEN-LAST:event_lblBontonAleatorioMouseEntered

    private void lblBontonAleatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBontonAleatorioMouseExited
        pnlBontonAleatorio.setBackground(new java.awt.Color(68, 115, 142));
    }//GEN-LAST:event_lblBontonAleatorioMouseExited

    private void lblBontonAleatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBontonAleatorioMouseClicked
        if (tblAvionesInactivos.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No hay aviones disponibles, puede agregar aviones en Configuración", "Problema", JOptionPane.ERROR_MESSAGE);
        } else {
            aniadirListaAleatoria();
        }
    }//GEN-LAST:event_lblBontonAleatorioMouseClicked

    private void pnlBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBarraMousePressed
        //Valores de las cordenadas del mouse al presionar la "barra" superior de la ventan
        this.xMouse = evt.getX();
        this.yMouse = evt.getY();
    }//GEN-LAST:event_pnlBarraMousePressed

    private void pnlBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBarraMouseDragged
        //Se capatan los valores actuales de las coordenadas del mouse al desplazar el mouse con el evento de arrastre
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        //Se ajusta la ventan a como se va a arrastrando el mouse
        this.setLocation(x - this.xMouse, y - this.yMouse);
    }//GEN-LAST:event_pnlBarraMouseDragged

    public void crearGrupoBotones(){
        grupoBotones.add(rbtnVuelo);
        grupoBotones.add(rbtnHangar);
        grupoBotones.add(rbtnPistaDespegue);
        grupoBotones.add(rbtnPistaAterrizaje);
    }

    public void borrarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tblAvionesInactivos.getModel();
        while (modelo.getRowCount() != 0) {
            modelo.removeRow(0);
        }
    }

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
            java.util.logging.Logger.getLogger(jfrmAniadirAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmAniadirAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmAniadirAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmAniadirAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmAniadirAvion(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBontonAleatorio;
    private javax.swing.JLabel lblBtnAniadir;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel pnlBarra;
    private javax.swing.JPanel pnlBontonAleatorio;
    private javax.swing.JPanel pnlBotonAniadir;
    private javax.swing.JPanel pnlSalida;
    private javax.swing.JRadioButton rbtnHangar;
    private javax.swing.JRadioButton rbtnPistaAterrizaje;
    private javax.swing.JRadioButton rbtnPistaDespegue;
    private javax.swing.JRadioButton rbtnVuelo;
    private javax.swing.JTable tblAvionesInactivos;
    // End of variables declaration//GEN-END:variables
}
