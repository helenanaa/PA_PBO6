/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

/**
 *
 * @author USER
 */
public class Rolelogin extends javax.swing.JFrame {

    /**
     * Creates new form Rolelogin
     */
    public Rolelogin() {
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

        OWNER = new javax.swing.JButton();
        ADMIN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OWNER.setText("OWNER");
        OWNER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OWNERActionPerformed(evt);
            }
        });
        getContentPane().add(OWNER, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 120, 50));

        ADMIN.setText("ADMIN");
        ADMIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMINActionPerformed(evt);
            }
        });
        getContentPane().add(ADMIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 120, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Rolelogin.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OWNERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OWNERActionPerformed
        // TODO add your handling code here:
        this.dispose(); // Menutup jendela Rolelogin
        Loginowner login = new Loginowner();
        login.setVisible(true);
    }//GEN-LAST:event_OWNERActionPerformed

    private void ADMINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMINActionPerformed
        // TODO add your handling code here:
        this.dispose(); // Menutup jendela Rolelogin
        Loginadmin login = new Loginadmin();
        login.setVisible(true);
    }//GEN-LAST:event_ADMINActionPerformed

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
            java.util.logging.Logger.getLogger(Rolelogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rolelogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rolelogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rolelogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rolelogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADMIN;
    private javax.swing.JButton OWNER;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
