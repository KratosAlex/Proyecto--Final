/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author KratosAlex
 */
public class InicioAplicacion extends javax.swing.JFrame {

    /**
     * Creates new form InicioAplicacion
     */
    public InicioAplicacion() {
        initComponents();
        setSize(400,300);
        setLocationRelativeTo(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        AdminButton = new javax.swing.JButton();
        InicioButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inicio de aplicacion:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 40, 284, 40);

        AdminButton.setBackground(new java.awt.Color(0, 0, 0));
        AdminButton.setForeground(new java.awt.Color(0, 102, 0));
        AdminButton.setText("Administrar");
        AdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AdminButton);
        AdminButton.setBounds(150, 130, 87, 23);

        InicioButton.setBackground(new java.awt.Color(0, 0, 0));
        InicioButton.setForeground(new java.awt.Color(0, 102, 0));
        InicioButton.setText("Inicio Test");
        InicioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(InicioButton);
        InicioButton.setBounds(150, 180, 87, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\KratosAlex\\Documents\\NetBeansProjects23\\ProyectoTest\\proyectoTest\\src\\vista\\fondoproyecto.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -26, 390, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InicioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        TestAplicacion test = new TestAplicacion();
        test.setVisible(true);
    }//GEN-LAST:event_InicioButtonActionPerformed

    private void AdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        AdministracionAplicacion admin = new AdministracionAplicacion();
        admin.setVisible(true);
    }//GEN-LAST:event_AdminButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InicioAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioAplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminButton;
    private javax.swing.JButton InicioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
