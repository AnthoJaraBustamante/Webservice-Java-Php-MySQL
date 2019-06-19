
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antho
 */
public class GUI_Login extends javax.swing.JFrame {

    /**
     * Creates new form REGISTRAR_USUARIO
     */
    public static String contrasena, correo;

    public GUI_Login() {
        initComponents();
        TextInfo.setVisible(false);
        jPanel1.setFocusable(true);
        TextCorreo.setForeground(Color.GRAY);
        TextContrasena.setForeground(Color.GRAY);
        //TextAreaResultado.setVisible(false);
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
        jLabel3 = new javax.swing.JLabel();
        TextCorreo = new javax.swing.JTextField();
        TextContrasena = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        bAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextInfo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel3.setText("LOGIN DE USUARIO");

        TextCorreo.setText("Correo electrónico");
        TextCorreo.setToolTipText("");
        TextCorreo.setMinimumSize(new java.awt.Dimension(66, 26));
        TextCorreo.setName(""); // NOI18N
        TextCorreo.setPreferredSize(new java.awt.Dimension(140, 26));
        TextCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextCorreoFocusLost(evt);
            }
        });

        TextContrasena.setText("Contraseña");
        TextContrasena.setToolTipText("");
        TextContrasena.setMinimumSize(new java.awt.Dimension(66, 26));
        TextContrasena.setName(""); // NOI18N
        TextContrasena.setPreferredSize(new java.awt.Dimension(140, 26));
        TextContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextContrasenaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextContrasenaFocusLost(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Impact", 1, 15)); // NOI18N
        jButton2.setText("INGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        bAtras.setFont(new java.awt.Font("Impact", 1, 15)); // NOI18N
        bAtras.setText("Atrás");
        bAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtrasActionPerformed(evt);
            }
        });

        TextInfo.setColumns(20);
        TextInfo.setRows(5);
        jScrollPane1.setViewportView(TextInfo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TextContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(TextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(bAtras))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jLabel3.getAccessibleContext().setAccessibleName("LOGIN DE USUARIO");

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        correo = TextCorreo.getText();
        contrasena = TextContrasena.getText();
        Login.Login_JSON();
        TextInfo.append("Nombre del Usuario: "+ Login.nombreUsuario + "\nClave API: "+ Login.claveAPI);
        
        TextInfo.setVisible(true);
       
       /* TextAreaResultado.setText(Login.result);
        TextAreaResultado.setVisible(true);
        */
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtrasActionPerformed
        // TODO add your handling code here:
        new GUI_Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bAtrasActionPerformed

    private void TextCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextCorreoFocusGained
        // TODO add your handling code here:
        if (TextCorreo.getText().trim().equals("Correo electrónico")) {
            TextCorreo.setText("");
        }

        TextCorreo.setForeground(Color.BLACK);
    }//GEN-LAST:event_TextCorreoFocusGained

    private void TextCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextCorreoFocusLost
        // TODO add your handling code here:
        if (TextCorreo.getText().trim().equals("")) {
            TextCorreo.setText("Correo electrónico");
        }
        TextCorreo.setForeground(Color.GRAY);
    }//GEN-LAST:event_TextCorreoFocusLost

    private void TextContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextContrasenaFocusGained
        // TODO add your handling code here:
        if (TextContrasena.getText().trim().equals("Contraseña")) {
            TextContrasena.setText("");

        }

        TextContrasena.setForeground(Color.BLACK);
    }//GEN-LAST:event_TextContrasenaFocusGained

    private void TextContrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextContrasenaFocusLost
        // TODO add your handling code here:
        if (TextContrasena.getText().trim().equals("")) {
            TextContrasena.setText("Contraseña");
        }
        TextContrasena.setForeground(Color.GRAY);
    }//GEN-LAST:event_TextContrasenaFocusLost

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
            java.util.logging.Logger.getLogger(GUI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Login().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextContrasena;
    private javax.swing.JTextField TextCorreo;
    private javax.swing.JTextArea TextInfo;
    private javax.swing.JButton bAtras;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
