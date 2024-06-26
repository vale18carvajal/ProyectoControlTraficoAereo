package Vista;


import Logica.clsAviones;
import Logica.clsListasAviones;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author valer
 */
public class jfrmPrincipal extends javax.swing.JFrame {
    private clsListasAviones listaCentral;
    private clsListasAviones listasAviones;
    /**
     * Creates new form jfrmPrincipal
     */
    public jfrmPrincipal(clsListasAviones lista) {
        this.listaCentral = lista;
        crearListas();
        initComponents();
        cargarTablas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblConfiguracion = new javax.swing.JLabel();
        TabbedPanel = new javax.swing.JTabbedPane();
        pnlEnvuelo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAvionesEnVuelo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblAniadir1 = new javax.swing.JLabel();
        lblFuncion1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlHangar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAvionesEnHangar = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblAniadir2 = new javax.swing.JLabel();
        lblFuncion2 = new javax.swing.JLabel();
        pnlPistaDespegue = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPistaDespegue = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lblAniadir3 = new javax.swing.JLabel();
        lblFuncion3 = new javax.swing.JLabel();
        pnlPistaAterrizaje = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPistaAterrizaje = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lblAniadir4 = new javax.swing.JLabel();
        lblFuncion4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(53, 79, 100));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Logotipo_pricipal.png"))); // NOI18N

        lblSalir.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(255, 255, 255));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("Salir");
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        lblConfiguracion.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        lblConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        lblConfiguracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConfiguracion.setText("Configuración");
        lblConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConfiguracionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblConfiguracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblConfiguracionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblConfiguracion)
                .addGap(18, 18, 18)
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfiguracion)
                    .addComponent(lblSalir))
                .addGap(23, 23, 23))
        );

        TabbedPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(168, 194, 208), 1, true));
        TabbedPanel.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N

        pnlEnvuelo.setBackground(new java.awt.Color(255, 255, 255));
        pnlEnvuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlEnvueloMousePressed(evt);
            }
        });

        tblAvionesEnVuelo.setBackground(new java.awt.Color(255, 255, 255));
        tblAvionesEnVuelo.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        tblAvionesEnVuelo.setForeground(new java.awt.Color(0, 0, 0));
        tblAvionesEnVuelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Cantidad pasajeros", "Cantidad sobrecargos", "Nombre Piloto"
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
        tblAvionesEnVuelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblAvionesEnVuelo.setGridColor(new java.awt.Color(204, 204, 204));
        tblAvionesEnVuelo.setRowHeight(28);
        tblAvionesEnVuelo.setSelectionBackground(new java.awt.Color(28, 33, 53));
        tblAvionesEnVuelo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblAvionesEnVuelo.setShowGrid(true);
        tblAvionesEnVuelo.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblAvionesEnVuelo);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(68, 115, 142));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de aviones en vuelo");

        lblAniadir1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        lblAniadir1.setForeground(new java.awt.Color(68, 115, 142));
        lblAniadir1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAniadir1.setText("Añadir avión");
        lblAniadir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAniadir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAniadir1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAniadir1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAniadir1MouseExited(evt);
            }
        });

        lblFuncion1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        lblFuncion1.setForeground(new java.awt.Color(68, 115, 142));
        lblFuncion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFuncion1.setText("Aterrizar avión");
        lblFuncion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFuncion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFuncion1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFuncion1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblFuncion1MouseExited(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(53, 79, 100));
        jLabel6.setText("*Para aterrizar un avión debe seleccionarlo primero. ");

        javax.swing.GroupLayout pnlEnvueloLayout = new javax.swing.GroupLayout(pnlEnvuelo);
        pnlEnvuelo.setLayout(pnlEnvueloLayout);
        pnlEnvueloLayout.setHorizontalGroup(
            pnlEnvueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlEnvueloLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlEnvueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnvueloLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlEnvueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFuncion1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAniadir1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(626, 626, 626))
                    .addGroup(pnlEnvueloLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))))
        );
        pnlEnvueloLayout.setVerticalGroup(
            pnlEnvueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnvueloLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(pnlEnvueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAniadir1)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(lblFuncion1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        TabbedPanel.addTab("Aviones en Vuelo", pnlEnvuelo);

        pnlHangar.setBackground(new java.awt.Color(255, 255, 255));

        tblAvionesEnHangar.setBackground(new java.awt.Color(255, 255, 255));
        tblAvionesEnHangar.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        tblAvionesEnHangar.setForeground(new java.awt.Color(0, 0, 0));
        tblAvionesEnHangar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Cantidad pasajeros", "Cantidad sobrecargos", "Nombre Piloto"
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
        tblAvionesEnHangar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblAvionesEnHangar.setGridColor(new java.awt.Color(204, 204, 204));
        tblAvionesEnHangar.setRowHeight(28);
        tblAvionesEnHangar.setRowSelectionAllowed(false);
        tblAvionesEnHangar.setSelectionBackground(new java.awt.Color(28, 33, 53));
        tblAvionesEnHangar.setShowGrid(true);
        tblAvionesEnHangar.setShowVerticalLines(false);
        jScrollPane2.setViewportView(tblAvionesEnHangar);

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(68, 115, 142));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lista de aviones en el hangar");

        lblAniadir2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        lblAniadir2.setForeground(new java.awt.Color(68, 115, 142));
        lblAniadir2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAniadir2.setText("Añadir avión");
        lblAniadir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAniadir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAniadir2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAniadir2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAniadir2MouseExited(evt);
            }
        });

        lblFuncion2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        lblFuncion2.setForeground(new java.awt.Color(68, 115, 142));
        lblFuncion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFuncion2.setText("Trasladar a pista de despegue");
        lblFuncion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFuncion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFuncion2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFuncion2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblFuncion2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlHangarLayout = new javax.swing.GroupLayout(pnlHangar);
        pnlHangar.setLayout(pnlHangarLayout);
        pnlHangarLayout.setHorizontalGroup(
            pnlHangarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlHangarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHangarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAniadir2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(629, 629, 629))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHangarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFuncion2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHangarLayout.setVerticalGroup(
            pnlHangarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHangarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblAniadir2)
                .addGap(18, 18, 18)
                .addComponent(lblFuncion2)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        TabbedPanel.addTab("Aviones en hangar", pnlHangar);

        pnlPistaDespegue.setBackground(new java.awt.Color(255, 255, 255));

        tblPistaDespegue.setBackground(new java.awt.Color(255, 255, 255));
        tblPistaDespegue.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        tblPistaDespegue.setForeground(new java.awt.Color(0, 0, 0));
        tblPistaDespegue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Cantidad pasajeros", "Cantidad sobrecargos", "Nombre Piloto"
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
        tblPistaDespegue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblPistaDespegue.setGridColor(new java.awt.Color(204, 204, 204));
        tblPistaDespegue.setRowHeight(28);
        tblPistaDespegue.setRowSelectionAllowed(false);
        tblPistaDespegue.setSelectionBackground(new java.awt.Color(28, 33, 53));
        tblPistaDespegue.setShowGrid(true);
        tblPistaDespegue.setShowVerticalLines(false);
        jScrollPane3.setViewportView(tblPistaDespegue);

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(68, 115, 142));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lista de aviones en pista de despegue");

        lblAniadir3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        lblAniadir3.setForeground(new java.awt.Color(68, 115, 142));
        lblAniadir3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAniadir3.setText("Añadir avión");
        lblAniadir3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAniadir3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAniadir3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAniadir3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAniadir3MouseExited(evt);
            }
        });

        lblFuncion3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        lblFuncion3.setForeground(new java.awt.Color(68, 115, 142));
        lblFuncion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFuncion3.setText("Despegar avión");
        lblFuncion3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFuncion3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFuncion3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFuncion3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblFuncion3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlPistaDespegueLayout = new javax.swing.GroupLayout(pnlPistaDespegue);
        pnlPistaDespegue.setLayout(pnlPistaDespegueLayout);
        pnlPistaDespegueLayout.setHorizontalGroup(
            pnlPistaDespegueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPistaDespegueLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPistaDespegueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPistaDespegueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPistaDespegueLayout.createSequentialGroup()
                        .addComponent(lblAniadir3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(629, 629, 629))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPistaDespegueLayout.createSequentialGroup()
                        .addComponent(lblFuncion3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(618, 618, 618))))
        );
        pnlPistaDespegueLayout.setVerticalGroup(
            pnlPistaDespegueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPistaDespegueLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblAniadir3)
                .addGap(18, 18, 18)
                .addComponent(lblFuncion3)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        TabbedPanel.addTab("Pista de despegue", pnlPistaDespegue);

        pnlPistaAterrizaje.setBackground(new java.awt.Color(255, 255, 255));

        tblPistaAterrizaje.setBackground(new java.awt.Color(255, 255, 255));
        tblPistaAterrizaje.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        tblPistaAterrizaje.setForeground(new java.awt.Color(0, 0, 0));
        tblPistaAterrizaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Cantidad pasajeros", "Cantidad sobrecargos", "Nombre Piloto"
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
        tblPistaAterrizaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblPistaAterrizaje.setGridColor(new java.awt.Color(204, 204, 204));
        tblPistaAterrizaje.setRowHeight(28);
        tblPistaAterrizaje.setRowSelectionAllowed(false);
        tblPistaAterrizaje.setSelectionBackground(new java.awt.Color(28, 33, 53));
        tblPistaAterrizaje.setShowGrid(true);
        tblPistaAterrizaje.setShowVerticalLines(false);
        jScrollPane4.setViewportView(tblPistaAterrizaje);

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(68, 115, 142));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Lista de aviones en pista de aterrizaje");

        lblAniadir4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        lblAniadir4.setForeground(new java.awt.Color(68, 115, 142));
        lblAniadir4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAniadir4.setText("Añadir avión");
        lblAniadir4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAniadir4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAniadir4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAniadir4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAniadir4MouseExited(evt);
            }
        });

        lblFuncion4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        lblFuncion4.setForeground(new java.awt.Color(68, 115, 142));
        lblFuncion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFuncion4.setText("Trasladar avión al hangar");
        lblFuncion4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFuncion4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFuncion4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFuncion4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblFuncion4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlPistaAterrizajeLayout = new javax.swing.GroupLayout(pnlPistaAterrizaje);
        pnlPistaAterrizaje.setLayout(pnlPistaAterrizajeLayout);
        pnlPistaAterrizajeLayout.setHorizontalGroup(
            pnlPistaAterrizajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPistaAterrizajeLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPistaAterrizajeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAniadir4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(629, 629, 629))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPistaAterrizajeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFuncion4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPistaAterrizajeLayout.setVerticalGroup(
            pnlPistaAterrizajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPistaAterrizajeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblAniadir4)
                .addGap(18, 18, 18)
                .addComponent(lblFuncion4)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        TabbedPanel.addTab("Pista de aterrizaje", pnlPistaAterrizaje);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(TabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(TabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
     //Método que inicializa las 4 listas de aviones y de manera aleatoria se agregan aviones con base a la lista central.
    public void crearListas(){
        this.listasAviones= new clsListasAviones(this.listaCentral);
        this.listasAviones.repartoAleatorio();
    }
    
    //Método utilizado en el formulario de configuración que se accede por medio de una instancia de esta clase.
    public void setCentral(clsAviones avion){
        //this.listasAviones.getCentral().inserccionFinal(avion);
        this.listasAviones.aniadirCentral(avion);
    }
    
    //Método utilizado en el formulario de añadir avión que se accede por medio de una instancia de esta clase.
    public clsAviones[] getCentral(){
        return this.listasAviones.obtenerCentral();
    }
    
    public void aniadirAvionesVuelo(clsAviones avion){
        this.listasAviones.aniadirVuelo(avion);
        borrarTablas();
        cargarTablas();
    }
    
    public void aniadirAvionesHangar(clsAviones avion){
        this.listasAviones.aniadirHangar(avion);
        borrarTablas();
        cargarTablas();
    }
    
    public void aniadirAvionesPistaDespegue(clsAviones avion){
        this.listasAviones.aniadirPistaDespegue(avion);
        borrarTablas();
        cargarTablas();
    }
    
    public void aniadirAvionesPistaAterrizaje(clsAviones avion){
        this.listasAviones.aniadirPistaAterrizaje(avion);
        borrarTablas();
        cargarTablas();
    }
    
    public void cargarTablas() {
        //Añadir los datos de aviones en vuelo en la primera tabla:
        DefaultTableModel modelo = (DefaultTableModel) tblAvionesEnVuelo.getModel();
        
        clsAviones[] auxAviones = listasAviones.obtenerAvionesEnVuelo(); //Vector que recibe el vector de aviones
        String[] datosAvion = new String[4];
        if(auxAviones != null){
            for (clsAviones avion : auxAviones) {
                datosAvion[0] = avion.getModelo();
                datosAvion[1] = String.valueOf(avion.getCantidadPasajeros());
                datosAvion[2] = String.valueOf(avion.getCantidadSobrecargos());
                datosAvion[3] = avion.getNombrePiloto();

                modelo.addRow(datosAvion);
            }
        }

        auxAviones = listasAviones.obtenerAvionesEnHangar();
        modelo =(DefaultTableModel) tblAvionesEnHangar.getModel();
        if(auxAviones != null){
            for (clsAviones avion : auxAviones) {
                datosAvion[0] = avion.getModelo();
                datosAvion[1] = String.valueOf(avion.getCantidadPasajeros());
                datosAvion[2] = String.valueOf(avion.getCantidadSobrecargos());
                datosAvion[3] = avion.getNombrePiloto();

                modelo.addRow(datosAvion);

            }
        }

        auxAviones = listasAviones.obtenerrAvionesPistaDespegue();
        modelo =(DefaultTableModel) tblPistaDespegue.getModel();
        if(auxAviones != null){
            for (clsAviones avion : auxAviones) {
                datosAvion[0] = avion.getModelo();
                datosAvion[1] = String.valueOf(avion.getCantidadPasajeros());
                datosAvion[2] = String.valueOf(avion.getCantidadSobrecargos());
                datosAvion[3] = avion.getNombrePiloto();

                modelo.addRow(datosAvion);

            }
        }
        
        auxAviones = listasAviones.obtenerAvionesPistaAterrizaje();
        modelo = (DefaultTableModel) tblPistaAterrizaje.getModel();
        if(auxAviones != null){
            for (clsAviones avion : auxAviones) {
                datosAvion[0] = avion.getModelo();
                datosAvion[1] = String.valueOf(avion.getCantidadPasajeros());
                datosAvion[2] = String.valueOf(avion.getCantidadSobrecargos());
                datosAvion[3] = avion.getNombrePiloto();

                modelo.addRow(datosAvion);

            }
        }
    }
    
    public void borrarTablas() {
        //Borrado de tabla aviones en vuelo
        DefaultTableModel modelo = (DefaultTableModel) tblAvionesEnVuelo.getModel();
        while (modelo.getRowCount() != 0) {
            modelo.removeRow(0);
        }
        //Borrado de tabla aviones en el hangar
        modelo = (DefaultTableModel) tblAvionesEnHangar.getModel();
        while (modelo.getRowCount() != 0) {
            modelo.removeRow(0);
        }
        //Borrado de tabla aviones en pista de despegue
        modelo = (DefaultTableModel) tblPistaDespegue.getModel();
        while (modelo.getRowCount() != 0) {
            modelo.removeRow(0);
        }
        //Borrado de tabla aviones en pista de aterrizaje
        modelo = (DefaultTableModel) tblPistaAterrizaje.getModel();
        while (modelo.getRowCount() != 0) {
            modelo.removeRow(0);
        }
        
    }

    private void lblAniadir1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAniadir1MouseEntered
        lblAniadir1.setForeground(new java.awt.Color(232, 114, 69));
    }//GEN-LAST:event_lblAniadir1MouseEntered

    private void lblAniadir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAniadir1MouseExited
         lblAniadir1.setForeground(new java.awt.Color(68, 115, 142));
    }//GEN-LAST:event_lblAniadir1MouseExited

    private void lblAniadir2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAniadir2MouseEntered
        lblAniadir2.setForeground(new java.awt.Color(232, 114, 69));
    }//GEN-LAST:event_lblAniadir2MouseEntered

    private void lblAniadir2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAniadir2MouseExited
       lblAniadir2.setForeground(new java.awt.Color(68, 115, 142));
    }//GEN-LAST:event_lblAniadir2MouseExited

    private void lblAniadir3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAniadir3MouseEntered
        lblAniadir3.setForeground(new java.awt.Color(232, 114, 69));
    }//GEN-LAST:event_lblAniadir3MouseEntered

    private void lblAniadir3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAniadir3MouseExited
        lblAniadir3.setForeground(new java.awt.Color(68, 115, 142));
    }//GEN-LAST:event_lblAniadir3MouseExited

    private void lblAniadir4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAniadir4MouseEntered
        lblAniadir4.setForeground(new java.awt.Color(232, 114, 69));
    }//GEN-LAST:event_lblAniadir4MouseEntered

    private void lblAniadir4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAniadir4MouseExited
        lblAniadir4.setForeground(new java.awt.Color(68, 115, 142));
    }//GEN-LAST:event_lblAniadir4MouseExited

    private void lblFuncion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncion1MouseEntered
        lblFuncion1.setForeground(new java.awt.Color(232, 114, 69));
    }//GEN-LAST:event_lblFuncion1MouseEntered

    private void lblFuncion1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncion1MouseExited
        lblFuncion1.setForeground(new java.awt.Color(68, 115, 142));
    }//GEN-LAST:event_lblFuncion1MouseExited

    private void lblFuncion2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncion2MouseEntered
        lblFuncion2.setForeground(new java.awt.Color(232, 114, 69));
    }//GEN-LAST:event_lblFuncion2MouseEntered

    private void lblFuncion2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncion2MouseExited
        lblFuncion2.setForeground(new java.awt.Color(68, 115, 142));
    }//GEN-LAST:event_lblFuncion2MouseExited

    private void lblFuncion3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncion3MouseEntered
        lblFuncion3.setForeground(new java.awt.Color(232, 114, 69));
    }//GEN-LAST:event_lblFuncion3MouseEntered

    private void lblFuncion3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncion3MouseExited
        lblFuncion3.setForeground(new java.awt.Color(68, 115, 142));
    }//GEN-LAST:event_lblFuncion3MouseExited

    private void lblFuncion4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncion4MouseEntered
        lblFuncion4.setForeground(new java.awt.Color(232, 114, 69));
    }//GEN-LAST:event_lblFuncion4MouseEntered

    private void lblFuncion4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncion4MouseExited
        lblFuncion4.setForeground(new java.awt.Color(68, 115, 142));
    }//GEN-LAST:event_lblFuncion4MouseExited

    private void lblAniadir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAniadir1MouseClicked
        jfrmAniadirAvion ventana = new jfrmAniadirAvion(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_lblAniadir1MouseClicked

    private void lblFuncion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncion2MouseClicked
        if (tblAvionesEnHangar.getRowCount() != 0) {
            String nombreAvion = tblAvionesEnHangar.getValueAt(0, 3).toString();
            int opc = JOptionPane.showConfirmDialog(null, "¿Desea que el avión de "
                    + nombreAvion + " sea trasladado a pista de despegue?", "Confirmación", JOptionPane.OK_CANCEL_OPTION);
            if (opc == 0) { //Si el usuario presiona Si el valor de opc es 0 sino, el valor de opc es 1
                
                this.listasAviones.TrasladarAvionPistaDespegue();
                borrarTablas();
                cargarTablas();
            }    
        }
    }//GEN-LAST:event_lblFuncion2MouseClicked

    private void lblFuncion3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncion3MouseClicked
        if (tblPistaDespegue.getRowCount() != 0) {
            String nombreAvion = tblPistaDespegue.getValueAt(0, 3).toString();
            int opc = JOptionPane.showConfirmDialog(null, "¿Desea despegar el avión de "
                    + nombreAvion + " ?", "Confirmación", JOptionPane.OK_CANCEL_OPTION);
            if (opc == 0) { //Si el usuario presiona Si el valor de opc es 0 sino, el valor de opc es 1
                
                this.listasAviones.despegarAvion();
                borrarTablas();
                cargarTablas();
            }
        }
    }//GEN-LAST:event_lblFuncion3MouseClicked

    private void lblFuncion4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncion4MouseClicked
        if (tblPistaAterrizaje.getRowCount() != 0) {
            String nombreAvion = tblPistaAterrizaje.getValueAt(0, 3).toString();
            int opc = JOptionPane.showConfirmDialog(null, "¿Desea que el avión de "
                    + nombreAvion + " sea traslado al hangar?", "Confirmación", JOptionPane.OK_CANCEL_OPTION);
            if (opc == 0) { //Si el usuario presiona Si el valor de opc es 0 sino, el valor de opc es 1
                this.listasAviones.trasladarAvionHangar();
                borrarTablas();
                cargarTablas();
            }
        }
    }//GEN-LAST:event_lblFuncion4MouseClicked

    private void lblAniadir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAniadir2MouseClicked
        jfrmAniadirAvion ventana = new jfrmAniadirAvion(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_lblAniadir2MouseClicked

    private void lblAniadir3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAniadir3MouseClicked
        jfrmAniadirAvion ventana = new jfrmAniadirAvion(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_lblAniadir3MouseClicked

    private void lblAniadir4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAniadir4MouseClicked
        jfrmAniadirAvion ventana = new jfrmAniadirAvion(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_lblAniadir4MouseClicked

    private void lblFuncion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncion1MouseClicked
        int fila = tblAvionesEnVuelo.getSelectedRow();
        if (fila != -1 && tblAvionesEnVuelo.getRowCount() != 0) {
            String nombreAvion = tblAvionesEnVuelo.getValueAt(fila, 3).toString();
            int opc = JOptionPane.showConfirmDialog(null, "¿Desea aterrizar el avión de " + 
                    nombreAvion + " ?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opc == 0){ //Si el usuario presiona Si el valor de opc es 0 sino, el valor de opc es 1
              
                this.listasAviones.aterrizarAvion(nombreAvion);
                borrarTablas();
                cargarTablas();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila", "Problema", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_lblFuncion1MouseClicked

    private void lblConfiguracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfiguracionMouseEntered
        lblConfiguracion.setForeground(new java.awt.Color(28, 33, 53));
    }//GEN-LAST:event_lblConfiguracionMouseEntered

    private void lblConfiguracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfiguracionMouseExited
        lblConfiguracion.setForeground(Color.white);
    }//GEN-LAST:event_lblConfiguracionMouseExited

    private void lblConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfiguracionMouseClicked
        jfrmConfigurar ventana = new jfrmConfigurar(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_lblConfiguracionMouseClicked

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        lblSalir.setForeground(new java.awt.Color(28, 33, 53));
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        lblSalir.setForeground(Color.white);
    }//GEN-LAST:event_lblSalirMouseExited

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        int opc = JOptionPane.showConfirmDialog(null, "La información actual no se almacenará, ¿Seguro que desea salir?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opc == 0) {
            jfrmInicio ventanaInicial = new jfrmInicio();
            ventanaInicial.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lblSalirMouseClicked

    private void pnlEnvueloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEnvueloMousePressed
        borrarTablas();
        cargarTablas();
    }//GEN-LAST:event_pnlEnvueloMousePressed

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
            java.util.logging.Logger.getLogger(jfrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmPrincipal(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabbedPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblAniadir1;
    private javax.swing.JLabel lblAniadir2;
    private javax.swing.JLabel lblAniadir3;
    private javax.swing.JLabel lblAniadir4;
    private javax.swing.JLabel lblConfiguracion;
    private javax.swing.JLabel lblFuncion1;
    private javax.swing.JLabel lblFuncion2;
    private javax.swing.JLabel lblFuncion3;
    private javax.swing.JLabel lblFuncion4;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel pnlEnvuelo;
    private javax.swing.JPanel pnlHangar;
    private javax.swing.JPanel pnlPistaAterrizaje;
    private javax.swing.JPanel pnlPistaDespegue;
    private javax.swing.JTable tblAvionesEnHangar;
    private javax.swing.JTable tblAvionesEnVuelo;
    private javax.swing.JTable tblPistaAterrizaje;
    private javax.swing.JTable tblPistaDespegue;
    // End of variables declaration//GEN-END:variables
}
