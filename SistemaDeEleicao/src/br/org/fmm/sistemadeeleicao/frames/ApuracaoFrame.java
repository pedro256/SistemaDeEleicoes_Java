package br.org.fmm.sistemadeeleicao.frames;

import br.org.fmm.sistemadeeleicao.classesbean.Candidato;
import java.awt.Color;
import java.util.List;

public class ApuracaoFrame extends javax.swing.JFrame {
    
    private static List<Candidato> candidatos;
    private static int total;
    
    public ApuracaoFrame(List<Candidato> candidatos,int total) {
        
        initComponents();
        
        this.candidatos = candidatos;
        this.total = total;
        this.getContentPane().setBackground(new Color(1,1,23));
        this.setLocationRelativeTo(null);
        
        calcularVencedor(candidatos,total);
    }
    
    private void calcularVencedor(List<Candidato> candidatos,int total){
        
        int maior = 0;
        Candidato vencedor = new Candidato();
        for(Candidato c : candidatos){
            if(c.getNumeroVotos() > maior){
                vencedor = c;
                maior = c.getNumeroVotos();
            }
        }
        
        double porcentagem = maior*100/total;
        
        lblNumero.setText(lblNumero.getText()+vencedor.getNumero());
        lblNome.setText(lblNome.getText()+vencedor.getNome());
        lblNumeroVotos.setText(lblNumeroVotos.getText()+vencedor.getNumeroVotos());
        lblPorcentagem.setText(lblPorcentagem.getText()+porcentagem);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblNumeroVotos = new javax.swing.JLabel();
        lblPorcentagem = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblSair = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CANDIDATO ELEITO");

        lblNome.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("NOME: ");

        lblNumero.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setText("NÚMERO: ");

        lblNumeroVotos.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblNumeroVotos.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroVotos.setText("NÚMERO DE VOTOS: ");

        lblPorcentagem.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblPorcentagem.setForeground(new java.awt.Color(255, 255, 255));
        lblPorcentagem.setText("PORCENTAGEM DE VOTOS: ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblSair.setBackground(new java.awt.Color(0, 0, 0));
        lblSair.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblSair.setForeground(new java.awt.Color(0, 0, 0));
        lblSair.setText("X");
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSairMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSair)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSair)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 49, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumero)
                    .addComponent(lblNome)
                    .addComponent(lblNumeroVotos)
                    .addComponent(lblPorcentagem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(88, 88, 88)
                .addComponent(lblNumero)
                .addGap(28, 28, 28)
                .addComponent(lblNome)
                .addGap(28, 28, 28)
                .addComponent(lblNumeroVotos)
                .addGap(28, 28, 28)
                .addComponent(lblPorcentagem)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMousePressed
        System.exit(0);
    }//GEN-LAST:event_lblSairMousePressed

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
            java.util.logging.Logger.getLogger(ApuracaoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApuracaoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApuracaoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApuracaoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApuracaoFrame(candidatos,total).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumeroVotos;
    private javax.swing.JLabel lblPorcentagem;
    private javax.swing.JLabel lblSair;
    // End of variables declaration//GEN-END:variables
}
