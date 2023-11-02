/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prueba1progra2;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    BlockBuster bb = new BlockBuster();
    
    public main() {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarPaneles();
    }

    public void iniciarPaneles() {
        this.PanelPrincipal.setVisible(true);
        this.PanelAgregar.setVisible(false);
        this.setLocation(300, 300);
        this.setSize(650, 600);
        grupo_agregar.add(RadioGame);
        grupo_agregar.add(RadioMovie);
        this.PANELbuscar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_agregar = new javax.swing.ButtonGroup();
        PanelPrincipal = new javax.swing.JPanel();
        BotonAgregar = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        BotonRentar = new javax.swing.JButton();
        BotonAuditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PanelAgregar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RadioMovie = new javax.swing.JRadioButton();
        RadioGame = new javax.swing.JRadioButton();
        TextCodigo = new javax.swing.JTextField();
        TextNombre = new javax.swing.JTextField();
        BotonAgregarItem = new javax.swing.JButton();
        PANELbuscar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Textobuscaer = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BuscarBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonAgregar.setText("Agregar");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        BotonRentar.setText("Rentar");
        BotonRentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRentarActionPerformed(evt);
            }
        });

        BotonAuditar.setText("Auditar");
        BotonAuditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAuditarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("BLOCK BUSTER");

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonAgregar)
                    .addComponent(BotonBuscar))
                .addGap(58, 58, 58)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonAuditar)
                    .addComponent(BotonRentar))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(175, 175, 175))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAgregar)
                    .addComponent(BotonRentar))
                .addGap(27, 27, 27)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonBuscar)
                    .addComponent(BotonAuditar))
                .addGap(213, 213, 213))
        );

        jLabel2.setText("Agregar");

        jLabel3.setText("Codigo:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Tipo");

        RadioMovie.setText("Movie");
        RadioMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioMovieActionPerformed(evt);
            }
        });

        RadioGame.setText("Game");
        RadioGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioGameActionPerformed(evt);
            }
        });

        BotonAgregarItem.setText("Agregar");
        BotonAgregarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAgregarLayout = new javax.swing.GroupLayout(PanelAgregar);
        PanelAgregar.setLayout(PanelAgregarLayout);
        PanelAgregarLayout.setHorizontalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel2))
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(53, 53, 53)
                                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RadioGame)
                                    .addComponent(RadioMovie)))
                            .addGroup(PanelAgregarLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)
                                .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(BotonAgregarItem)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        PanelAgregarLayout.setVerticalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(RadioMovie))
                .addGap(18, 18, 18)
                .addComponent(RadioGame)
                .addGap(51, 51, 51)
                .addComponent(BotonAgregarItem)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jLabel6.setText("Buscar");

        Textobuscaer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextobuscaerActionPerformed(evt);
            }
        });

        jLabel7.setText("Codigo");

        BuscarBoton.setText("BUscar Boton");
        BuscarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANELbuscarLayout = new javax.swing.GroupLayout(PANELbuscar);
        PANELbuscar.setLayout(PANELbuscarLayout);
        PANELbuscarLayout.setHorizontalGroup(
            PANELbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELbuscarLayout.createSequentialGroup()
                .addGroup(PANELbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PANELbuscarLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(Textobuscaer, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PANELbuscarLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(PANELbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PANELbuscarLayout.createSequentialGroup()
                                .addComponent(BuscarBoton)
                                .addGap(42, 42, 42))
                            .addGroup(PANELbuscarLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(59, 59, 59)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PANELbuscarLayout.setVerticalGroup(
            PANELbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELbuscarLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel6)
                .addGap(48, 48, 48)
                .addGroup(PANELbuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Textobuscaer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(36, 36, 36)
                .addComponent(BuscarBoton)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PANELbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(81, 81, 81)
                .addComponent(PanelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(PANELbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        // TODO add your handling code here:
        this.PanelPrincipal.setVisible(false);
        this.PanelAgregar.setVisible(true);


    }//GEN-LAST:event_BotonAgregarActionPerformed

    private void RadioGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioGameActionPerformed

    private void RadioMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioMovieActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_RadioMovieActionPerformed

    private void BotonAgregarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarItemActionPerformed
        // TODO add your handling code here:
        String tipo = "";

        if (RadioGame.isSelected()) {
            tipo = "MOVIE";
        } else if (RadioMovie.isSelected()) {
            tipo = "GAME";
        }
        bb.agregarItem(Integer.parseInt(TextCodigo.getText()), TextNombre.getText(), "PLAYSTATION"); //perdonnnbn sinono sirve pipipipi
        this.PanelPrincipal.setVisible(true);
        this.PanelAgregar.setVisible(false);
        
        TextCodigo.setText("");
        TextNombre.setText("");
    }//GEN-LAST:event_BotonAgregarItemActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        // TODO add your handling code here:
        this.PANELbuscar.setVisible(true);
        this.PanelPrincipal.setVisible(false);
        
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void TextobuscaerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextobuscaerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextobuscaerActionPerformed

    private void BuscarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBotonActionPerformed
        // TODO add your handling code here:
        bb.buscarItem(Integer.parseInt(Textobuscaer.getText()), "PLAYSTATION");
        JOptionPane.showMessageDialog(null, "se ha buscado el objeto con exito o");
        this.PANELbuscar.setVisible(false);
        this.PanelPrincipal.setVisible(true);
    }//GEN-LAST:event_BuscarBotonActionPerformed

    private void BotonAuditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAuditarActionPerformed
        // TODO add your handling code here:
                JOptionPane.showMessageDialog(null, "proximamente");

    }//GEN-LAST:event_BotonAuditarActionPerformed

    private void BotonRentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRentarActionPerformed
        // TODO add your handling code here:
        
        
                JOptionPane.showMessageDialog(null, "opcion en mantenimiento");

    }//GEN-LAST:event_BotonRentarActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonAgregarItem;
    private javax.swing.JButton BotonAuditar;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonRentar;
    private javax.swing.JButton BuscarBoton;
    private javax.swing.JPanel PANELbuscar;
    private javax.swing.JPanel PanelAgregar;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JRadioButton RadioGame;
    private javax.swing.JRadioButton RadioMovie;
    private javax.swing.JTextField TextCodigo;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField Textobuscaer;
    private javax.swing.ButtonGroup grupo_agregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
