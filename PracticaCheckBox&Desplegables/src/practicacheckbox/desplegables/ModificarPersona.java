package practicacheckbox.desplegables;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lamiae
 */
public class ModificarPersona extends javax.swing.JFrame {

    /**
     * Creates new form ModificarPersona
     */
    public ModificarPersona() {
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

        jCheckBoxAtur = new javax.swing.JCheckBox();
        jCheckBoxEstudiant = new javax.swing.JCheckBox();
        jCheckBoxTreballador = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBoxAtur.setText("Está en atur");
        jCheckBoxAtur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAturActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxAtur, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 32, -1, -1));

        jCheckBoxEstudiant.setText("Estudiant");
        jCheckBoxEstudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxEstudiantActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxEstudiant, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 73, -1, -1));

        jCheckBoxTreballador.setText("Treballador");
        jCheckBoxTreballador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTreballadorActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxTreballador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jCheckBox4.setText("Sexe");
        getContentPane().add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 150, 79, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Metodo que activa solo boton atur.
 * @param evt 
 */
    private void jCheckBoxAturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAturActionPerformed
        jCheckBoxEstudiant.setSelected(false);
        jCheckBoxTreballador.setSelected(false);
        jCheckBoxAtur.setSelected(true);
    }//GEN-LAST:event_jCheckBoxAturActionPerformed

    private void jCheckBoxEstudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxEstudiantActionPerformed
        // TODO add your handling code here:
         jCheckBoxEstudiant.setSelected(true);
        jCheckBoxTreballador.setSelected(false);
        jCheckBoxAtur.setSelected(false);
    }//GEN-LAST:event_jCheckBoxEstudiantActionPerformed

    private void jCheckBoxTreballadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTreballadorActionPerformed
        // TODO add your handling code here:
         jCheckBoxEstudiant.setSelected(false);
        jCheckBoxTreballador.setSelected(true);
        jCheckBoxAtur.setSelected(false);
    }//GEN-LAST:event_jCheckBoxTreballadorActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBoxAtur;
    private javax.swing.JCheckBox jCheckBoxEstudiant;
    private javax.swing.JCheckBox jCheckBoxTreballador;
    // End of variables declaration//GEN-END:variables
}
