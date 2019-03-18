/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codigovago.vista;
 
import com.codigovago.modelo.Usuario;
import com.codigovago.modelo.accesoDatos.Login;
import javax.swing.JOptionPane;

/**
 *
 * @author JEISON
 */
public class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrmLogin
     */
    static Login login = new Login(); 
    Usuario usuario = new Usuario();
    public FrmLogin() {
         this.setUndecorated(true);
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

        btnSalir = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        btnOlvideClave = new javax.swing.JButton();
        FondoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/icons/max.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setDefaultCapable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 0, 50, 50));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/icons/min.png"))); // NOI18N
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 40, 50));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.setOpaque(false);
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 280, 360, 30));

        txtClave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtClave.setBorder(null);
        txtClave.setOpaque(false);
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 420, 360, 30));

        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 540, 380, 80));

        btnOlvideClave.setBorder(null);
        btnOlvideClave.setContentAreaFilled(false);
        btnOlvideClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlvideClaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnOlvideClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 650, 300, 40));

        FondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/Login1.png"))); // NOI18N
        getContentPane().add(FondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        JOptionPane.showMessageDialog(null,"Mensaje de si no cancelar");
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
         char[] clave = txtClave.getPassword();
            String clave1 = new String(clave);

            if (txtUsuario.getText().equals("") || clave1.equals("")) {
                JOptionPane.showMessageDialog(null, "Los campos se encuentran en blanco. \nLlene sus datos");
            }else {
                usuario.setUsuario_uss(txtUsuario.getText());
                usuario.setClave_uss(clave1);
                if ( login.buscarUsuario(txtUsuario.getText(), clave1) ) {
                    this.setVisible(false);
                } 
            }
        
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnOlvideClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlvideClaveActionPerformed
        FrmCorreo ventana = new FrmCorreo();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnOlvideClaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoLogin;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnOlvideClave;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}