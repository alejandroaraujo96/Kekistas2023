/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.visual;

import com.grsc.logica.ejb.UsuarioBean;
import com.grsc.modelo.entities.Roles;
import com.grsc.modelo.entities.Usuarios;
import com.visual.fuentes.FuenteRoboto;
import java.awt.Color;
import java.math.BigInteger;
import javax.swing.JOptionPane;

/**
 *
 * @author fbale
 */
public class VentanaIniciarSesion extends javax.swing.JFrame {

    /**
     * Creates new form VentanaIniciarSesion
     */
    public VentanaIniciarSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        rSLabelImage2 = new rojeru_san.rslabel.RSLabelImage();
        rSPanelShadow3 = new rojeru_san.rspanel.RSPanelShadow();
        jPanel2 = new javax.swing.JPanel();
        txtNomUser = new rojeru_san.RSMTextFull();
        rSLabelSombra2 = new rojeru_san.rslabel.RSLabelSombra();
        txtContrasenia = new rojeru_san.RSMPassView();
        jLabel4 = new javax.swing.JLabel();
        rSButtonGradiente2 = new rsbuttongradiente.RSButtonGradiente();
        rSButtonGradiente3 = new rsbuttongradiente.RSButtonGradiente();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(213, 240, 252));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(105, 190, 228));

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTEC Logo.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel2.setForeground(new java.awt.Color(0, 173, 239));

        txtNomUser.setForeground(new java.awt.Color(0, 69, 95));
        txtNomUser.setBordeColorFocus(new java.awt.Color(0, 173, 239));
        txtNomUser.setBotonColor(new java.awt.Color(0, 173, 239));
        txtNomUser.setPlaceholder("Nombre de Usuario");
        txtNomUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomUserActionPerformed(evt);
            }
        });

        rSLabelSombra2.setForeground(new java.awt.Color(0, 173, 239));
        rSLabelSombra2.setText("Iniciar Sesión");
        rSLabelSombra2.setColorDeSombra(new java.awt.Color(239, 239, 239));
        FuenteRoboto fuenteImport= new FuenteRoboto();
        rSLabelSombra2.setFont(fuenteImport.fuente("Roboto-Bold.ttf",0,28));

        txtContrasenia.setForeground(new java.awt.Color(13, 120, 161));
        txtContrasenia.setText("Contraseña");
        txtContrasenia.setBordeColorFocus(new java.awt.Color(0, 173, 239));
        txtContrasenia.setBotonColor(new java.awt.Color(0, 173, 239));
        txtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(13, 120, 161));
        jLabel4.setText("Contraseña");

        rSButtonGradiente2.setText("Ingresar");
        rSButtonGradiente2.setColorPrimario(new java.awt.Color(213, 240, 252));
        rSButtonGradiente2.setColorPrimarioHover(new java.awt.Color(0, 173, 239));
        rSButtonGradiente2.setColorSecundario(new java.awt.Color(0, 173, 239));
        rSButtonGradiente2.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        rSButtonGradiente2.setFont(fuenteImport.fuente("Roboto-Bold.ttf",0,15));
        rSButtonGradiente2.setGradiente(rsbuttongradiente.RSButtonGradiente.Gradiente.ESQUINA_2);
        rSButtonGradiente2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonGradiente2MouseClicked(evt);
            }
        });
        rSButtonGradiente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonGradiente2ActionPerformed(evt);
            }
        });

        rSButtonGradiente3.setText("Cancelar");
        rSButtonGradiente3.setColorPrimario(new java.awt.Color(213, 240, 252));
        rSButtonGradiente3.setColorPrimarioHover(new java.awt.Color(0, 173, 239));
        rSButtonGradiente3.setColorSecundario(new java.awt.Color(0, 173, 239));
        rSButtonGradiente3.setColorSecundarioHover(new java.awt.Color(213, 240, 252));
        rSButtonGradiente3.setFont(fuenteImport.fuente("Roboto-Bold.ttf",0,15));
        rSButtonGradiente3.setGradiente(rsbuttongradiente.RSButtonGradiente.Gradiente.ESQUINA_2);
        rSButtonGradiente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonGradiente3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(13, 120, 161));
        jLabel5.setText("Nombre de Usuario");

        jLabel1.setForeground(new java.awt.Color(13, 120, 161));
        jLabel1.setText("¿No estás registrado aún? Haz click aquí");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addComponent(txtNomUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(rSLabelSombra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(rSButtonGradiente2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(rSButtonGradiente3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(rSLabelSombra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonGradiente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonGradiente3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );

        rSPanelShadow3.add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(rSLabelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(413, Short.MAX_VALUE))
            .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                    .addGap(308, 308, 308)
                    .addComponent(rSPanelShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(rSLabelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(rSPanelShadow3, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomUserActionPerformed

    private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseniaActionPerformed

    private void rSButtonGradiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonGradiente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonGradiente2ActionPerformed

    private void rSButtonGradiente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonGradiente3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonGradiente3ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
        VentanaReg VentanaReg= new VentanaReg();
        VentanaReg.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
       jLabel1.setForeground(new Color(13,120,161)); 
       jLabel1.setText("¿No estás registrado aún? Haz click aquí");
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
       jLabel1.setForeground(new Color(0,0,51));
       jLabel1.setText("<HTML><u>¿No estás registrado aún? Haz click aquí</u></HTML>");
    }//GEN-LAST:event_jLabel1MouseEntered

    private void rSButtonGradiente2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonGradiente2MouseClicked
        UsuarioBean userBean= new UsuarioBean();
        String nomUser = txtNomUser.getText();
        char[] contrasenia = txtContrasenia.getPassword();
        String password = new String(contrasenia);
        Usuarios user = null;
        if (!nomUser.isBlank() && !password.isBlank()) {
            
            if (userBean.validarLogin(nomUser, password)) {
                user = userBean.usuarioLogeado(nomUser, password);
                
                BigInteger idEstadoValidado = BigInteger.valueOf(2L);
                
                if (user.getIdEstadoUsuario().getIdEstado().equals(idEstadoValidado)) {
                    Home ventana = new Home(user.getIdUsuario());
                    ventana.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showInputDialog(null, "Usuario no ha sido válidado"
                            + "Consulte con secretaría por su activación", "Usuario no Válido", HEIGHT);
                }
                
            } else {
                JOptionPane.showInputDialog(null, "Usuario o contraseña no válidos, usuario con"
                        + "dichas caracteristicas no ha sido encontrado en la base de datos", "Usuario no encontrado", HEIGHT);
            }
            
        } else {
            JOptionPane.showInputDialog(rootPane, "Debe completar los campos obligatorios ", "Campos insuficientes!", HEIGHT);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonGradiente2MouseClicked

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
            java.util.logging.Logger.getLogger(VentanaIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaIniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private rsbuttongradiente.RSButtonGradiente rSButtonGradiente2;
    private rsbuttongradiente.RSButtonGradiente rSButtonGradiente3;
    private rojeru_san.rslabel.RSLabelImage rSLabelImage2;
    private rojeru_san.rslabel.RSLabelSombra rSLabelSombra2;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojeru_san.rspanel.RSPanelShadow rSPanelShadow3;
    private rojeru_san.RSMPassView txtContrasenia;
    private rojeru_san.RSMTextFull txtNomUser;
    // End of variables declaration//GEN-END:variables

    
}
