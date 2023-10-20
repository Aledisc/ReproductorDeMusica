/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package programacion2.lab1progra2;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Agencia extends javax.swing.JFrame {
private int num=0;
Banco banco ;
Banco op = new Banco();
CuentaBancaria cuentabanc;
//CuentaBancaria cu = new CuentaBancaria();
    /**
     * Creates new form Agencia
     */
    public Agencia() {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarPaneles();
        
    }

    public void iniciarPaneles(){
        this.MenuPrincipal.setVisible(true);
        this.PanelAgregar.setVisible(false);
        this.PanelLista.setVisible(false);
        this.PanelTransferir.setVisible(false);
        this.MenuTransacciones.setVisible(false);
        this.DepositoRetiro.setVisible(false);
        this.setLocation(300, 300);
        this.setSize(520, 480);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPrincipal = new javax.swing.JPanel();
        AgregarMenu = new javax.swing.JButton();
        InteresMenu = new javax.swing.JButton();
        ListaMenu = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PanelAgregar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        NombreAgregar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CodigoAgregar = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        PanelTransferir = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cOrigenTransferir = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cDestinoTransferir = new javax.swing.JTextField();
        Transferir = new javax.swing.JButton();
        Monto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PanelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Regresar = new javax.swing.JButton();
        MenuTransacciones = new javax.swing.JPanel();
        TransferenciaMenu = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        DepositoRetiro = new javax.swing.JPanel();
        MontoDeposito = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AgregarMenu.setText("Agregar cuenta");
        AgregarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarMenuActionPerformed(evt);
            }
        });

        InteresMenu.setText("Agregar intereses");
        InteresMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InteresMenuActionPerformed(evt);
            }
        });

        ListaMenu.setText("Lista");
        ListaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaMenuActionPerformed(evt);
            }
        });

        jButton3.setText("Transacciones");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuPrincipalLayout = new javax.swing.GroupLayout(MenuPrincipal);
        MenuPrincipal.setLayout(MenuPrincipalLayout);
        MenuPrincipalLayout.setHorizontalGroup(
            MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPrincipalLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InteresMenu)
                    .addGroup(MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AgregarMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ListaMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        MenuPrincipalLayout.setVerticalGroup(
            MenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPrincipalLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(AgregarMenu)
                .addGap(41, 41, 41)
                .addComponent(jButton3)
                .addGap(46, 46, 46)
                .addComponent(InteresMenu)
                .addGap(35, 35, 35)
                .addComponent(ListaMenu)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setText("Banrobar");

        jLabel2.setText("Nombre");

        NombreAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreAgregarActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo");

        CodigoAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoAgregarActionPerformed(evt);
            }
        });

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAgregarLayout = new javax.swing.GroupLayout(PanelAgregar);
        PanelAgregar.setLayout(PanelAgregarLayout);
        PanelAgregarLayout.setHorizontalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21)
                        .addComponent(NombreAgregar))
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Agregar)
                            .addComponent(CodigoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        PanelAgregarLayout.setVerticalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NombreAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CodigoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(Agregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Cuenta origen");

        cOrigenTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cOrigenTransferirActionPerformed(evt);
            }
        });

        jLabel5.setText("Cuenta destino");

        Transferir.setText("Transferir");
        Transferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferirActionPerformed(evt);
            }
        });

        Monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MontoActionPerformed(evt);
            }
        });

        jLabel6.setText("Monto");

        javax.swing.GroupLayout PanelTransferirLayout = new javax.swing.GroupLayout(PanelTransferir);
        PanelTransferir.setLayout(PanelTransferirLayout);
        PanelTransferirLayout.setHorizontalGroup(
            PanelTransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTransferirLayout.createSequentialGroup()
                .addGroup(PanelTransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTransferirLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(Transferir))
                    .addGroup(PanelTransferirLayout.createSequentialGroup()
                        .addGroup(PanelTransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTransferirLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(PanelTransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)))
                            .addGroup(PanelTransferirLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel6)))
                        .addGap(28, 28, 28)
                        .addGroup(PanelTransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cOrigenTransferir)
                            .addComponent(cDestinoTransferir, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        PanelTransferirLayout.setVerticalGroup(
            PanelTransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTransferirLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(PanelTransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cOrigenTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cDestinoTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(Monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(Transferir)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jList1);

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelListaLayout = new javax.swing.GroupLayout(PanelLista);
        PanelLista.setLayout(PanelListaLayout);
        PanelListaLayout.setHorizontalGroup(
            PanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListaLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(PanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelListaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelListaLayout.createSequentialGroup()
                        .addComponent(Regresar)
                        .addGap(122, 122, 122))))
        );
        PanelListaLayout.setVerticalGroup(
            PanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Regresar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        TransferenciaMenu.setText("Transferencia");
        TransferenciaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferenciaMenuActionPerformed(evt);
            }
        });

        jButton6.setText("Retiro y deposito");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuTransaccionesLayout = new javax.swing.GroupLayout(MenuTransacciones);
        MenuTransacciones.setLayout(MenuTransaccionesLayout);
        MenuTransaccionesLayout.setHorizontalGroup(
            MenuTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuTransaccionesLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(MenuTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TransferenciaMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuTransaccionesLayout.setVerticalGroup(
            MenuTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuTransaccionesLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(TransferenciaMenu)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        MontoDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MontoDepositoActionPerformed(evt);
            }
        });

        jLabel7.setText("Monto");

        jButton4.setText("Depositar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Retirar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DepositoRetiroLayout = new javax.swing.GroupLayout(DepositoRetiro);
        DepositoRetiro.setLayout(DepositoRetiroLayout);
        DepositoRetiroLayout.setHorizontalGroup(
            DepositoRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepositoRetiroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DepositoRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addGap(71, 71, 71))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DepositoRetiroLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(MontoDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addGap(61, 61, 61))
        );
        DepositoRetiroLayout.setVerticalGroup(
            DepositoRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepositoRetiroLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(DepositoRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MontoDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(PanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(MenuTransacciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PanelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(PanelTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(DepositoRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelTransferir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PanelAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MenuTransacciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DepositoRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InteresMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InteresMenuActionPerformed
        // TODO add your handling code here:
        op.intereses();
        JOptionPane.showMessageDialog(null,"Intereses agregados con exito." );
    }//GEN-LAST:event_InteresMenuActionPerformed

    private void AgregarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarMenuActionPerformed
        // TODO add your handling code here:
        this.MenuPrincipal.setVisible(false);
        this.PanelAgregar.setVisible(true);
    }//GEN-LAST:event_AgregarMenuActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
        op.agregar(Integer.parseInt(CodigoAgregar.getText()), NombreAgregar.getText());
        
        
        NombreAgregar.setText("");
        CodigoAgregar.setText("");
        this.PanelAgregar.setVisible(false);
        this.MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_AgregarActionPerformed

    private void TransferenciaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferenciaMenuActionPerformed
        // TODO add your handling code here:
        this.MenuPrincipal.setVisible(false);
        this.PanelTransferir.setVisible(true);
    }//GEN-LAST:event_TransferenciaMenuActionPerformed

    private void ListaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaMenuActionPerformed
        // TODO add your handling code here:
        this.MenuPrincipal.setVisible(false);
        this.PanelLista.setVisible(true);
    }//GEN-LAST:event_ListaMenuActionPerformed

    private void TransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferirActionPerformed
        // TODO add your handling code here:
        op.transferir(Integer.parseInt(cOrigenTransferir.getText()), Integer.parseInt(cDestinoTransferir.getText()), Integer.parseInt(Monto.getText()));
        cOrigenTransferir.setText("");
        cDestinoTransferir.setText("");
        this.PanelTransferir.setVisible(false);
        this.MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_TransferirActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
        this.PanelLista.setVisible(false);
        this.MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_RegresarActionPerformed

    private void NombreAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreAgregarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_NombreAgregarActionPerformed

    private void CodigoAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoAgregarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.DepositoRetiro.setVisible(true);
        this.MenuTransacciones.setVisible(false);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        cuentabanc.depositar(Integer.parseInt(MontoDeposito.getText()));
        this.DepositoRetiro.setVisible(false);
        this.MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void MontoDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MontoDepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MontoDepositoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        cuentabanc.retirar(Integer.parseInt(MontoDeposito.getText()));
        this.DepositoRetiro.setVisible(false);
        this.MenuPrincipal.setVisible(true);
        MontoDeposito.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.MenuPrincipal.setVisible(false);
        this.MenuTransacciones.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cOrigenTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cOrigenTransferirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cOrigenTransferirActionPerformed

    private void MontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MontoActionPerformed
    
            
 
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
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agencia().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton AgregarMenu;
    private javax.swing.JTextField CodigoAgregar;
    private javax.swing.JPanel DepositoRetiro;
    private javax.swing.JButton InteresMenu;
    private javax.swing.JButton ListaMenu;
    private javax.swing.JPanel MenuPrincipal;
    private javax.swing.JPanel MenuTransacciones;
    private javax.swing.JTextField Monto;
    private javax.swing.JTextField MontoDeposito;
    private javax.swing.JTextField NombreAgregar;
    private javax.swing.JPanel PanelAgregar;
    private javax.swing.JPanel PanelLista;
    private javax.swing.JPanel PanelTransferir;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton TransferenciaMenu;
    private javax.swing.JButton Transferir;
    private javax.swing.JTextField cDestinoTransferir;
    private javax.swing.JTextField cOrigenTransferir;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}