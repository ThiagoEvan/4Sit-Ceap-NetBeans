/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Alunos
 */
public class Tela_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Tela_GUI
     */
    public Tela_GUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Altura_txt = new javax.swing.JTextField();
        Peso_txt = new javax.swing.JTextField();
        ImagemMagro_lbl = new javax.swing.JLabel();
        Mensagem_lbl1 = new javax.swing.JLabel();
        Fechar_btn = new javax.swing.JButton();
        Calcular_btn1 = new javax.swing.JButton();
        Limpar_btn1 = new javax.swing.JButton();
        ImagemNormal_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Altura:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 50, 70, 50);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Peso:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 10, 70, 50);

        Altura_txt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Altura_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Altura_txtActionPerformed(evt);
            }
        });
        jPanel1.add(Altura_txt);
        Altura_txt.setBounds(80, 60, 140, 30);

        Peso_txt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Peso_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Peso_txtActionPerformed(evt);
            }
        });
        jPanel1.add(Peso_txt);
        Peso_txt.setBounds(80, 20, 140, 30);

        ImagemMagro_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/peitorais.png"))); // NOI18N
        ImagemMagro_lbl.setInheritsPopupMenu(false);
        jPanel1.add(ImagemMagro_lbl);
        ImagemMagro_lbl.setBounds(270, 130, 64, 64);
        jPanel1.add(Mensagem_lbl1);
        Mensagem_lbl1.setBounds(30, 130, 190, 80);

        Fechar_btn.setText("Fechar");
        Fechar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fechar_btnActionPerformed(evt);
            }
        });
        jPanel1.add(Fechar_btn);
        Fechar_btn.setBounds(260, 240, 80, 40);

        Calcular_btn1.setText("Calcular");
        Calcular_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calcular_btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(Calcular_btn1);
        Calcular_btn1.setBounds(30, 240, 80, 40);

        Limpar_btn1.setText("Limpar");
        Limpar_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpar_btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(Limpar_btn1);
        Limpar_btn1.setBounds(130, 240, 80, 40);

        ImagemNormal_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/magro.png"))); // NOI18N
        ImagemNormal_lbl.setInheritsPopupMenu(false);
        jPanel1.add(ImagemNormal_lbl);
        ImagemNormal_lbl.setBounds(270, 130, 64, 64);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(366, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Altura_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Altura_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Altura_txtActionPerformed

    private void Peso_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Peso_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Peso_txtActionPerformed

    private void Fechar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fechar_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fechar_btnActionPerformed

    private void Calcular_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calcular_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Calcular_btn1ActionPerformed

    private void Limpar_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpar_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Limpar_btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Altura_txt;
    private javax.swing.JButton Calcular_btn1;
    private javax.swing.JButton Fechar_btn;
    private javax.swing.JLabel ImagemMagro_lbl;
    private javax.swing.JLabel ImagemNormal_lbl;
    private javax.swing.JButton Limpar_btn1;
    private javax.swing.JLabel Mensagem_lbl1;
    private javax.swing.JTextField Peso_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
