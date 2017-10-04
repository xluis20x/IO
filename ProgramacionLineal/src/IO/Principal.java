package IO;
//import UpperEssential.UpperEssentialLookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(345,469);
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        MetodoSimplex = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IO/Fondo.jpg"))); // NOI18N
        jLabel1.setText("M");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        MetodoSimplex.setFont(new java.awt.Font("Vani", 0, 11)); // NOI18N
        MetodoSimplex.setText("Metodo Simplex Max");
        MetodoSimplex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MetodoSimplexMouseClicked(evt);
            }
        });
        MetodoSimplex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MetodoSimplexActionPerformed(evt);
            }
        });
        getContentPane().add(MetodoSimplex);
        MetodoSimplex.setBounds(10, 10, 140, 30);

        jButton1.setFont(new java.awt.Font("Vani", 0, 11)); // NOI18N
        jButton1.setText("Metodo Simplex Min");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 40, 140, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("1. Escoga el metodo deseado.\n2. Llene la funcion objetivo.\n3. Llene las restricciones.\n4. Obtener la solucion.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 130, 240, 100);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Luis Felipe Sagado Gonzalez 20151020087\nGabriela Fernanda Blanco Peña 20151020094\n\nUniversidad Distrital Fransisco \nJose De Caldas");
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 270, 350, 100);

        jButton2.setFont(new java.awt.Font("Vani", 0, 11)); // NOI18N
        jButton2.setText("Metodo Grafico");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 70, 140, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IO/Fondo.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 350, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MetodoSimplexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MetodoSimplexActionPerformed
      
    }//GEN-LAST:event_MetodoSimplexActionPerformed

    private void MetodoSimplexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MetodoSimplexMouseClicked
           this.setVisible(false);
        
        MetodoSimplex2 metodo = new MetodoSimplex2();
        //metodo.Dibuja();
        metodo.setLocationRelativeTo(null);
        metodo.setResizable(false);
        metodo.setVisible(true);
        //metodo.Dibuja();
    }//GEN-LAST:event_MetodoSimplexMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.setVisible(false);
        
        MetodoSimplexMin metodo = new MetodoSimplexMin();
        //metodo.Dibuja();
        metodo.setLocationRelativeTo(null);
        metodo.setResizable(false);
        metodo.setVisible(true);
        //metodo.Dibuja();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
        
        MetodoGrafico metodo = new MetodoGrafico();
        //metodo.Dibuja();
        metodo.setLocationRelativeTo(null);
        metodo.setResizable(false);
        metodo.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked
    
    
    
    

    public static void main(String args[])  throws UnsupportedLookAndFeelException {
        //UIManager.setLookAndFeel(new UpperEssentialLookAndFeel());
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MetodoSimplex;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
