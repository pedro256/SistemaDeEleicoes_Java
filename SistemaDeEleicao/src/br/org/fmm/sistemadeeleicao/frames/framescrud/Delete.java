package br.org.fmm.sistemadeeleicao.frames.framescrud;


import br.org.fmm.sistemadeeleicao.classesbean.Candidato;
import br.org.fmm.sistemadeeleicao.frames.MainFrame;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;


public class Delete extends javax.swing.JFrame {

    private static List<Candidato> candidatos;
    
    public Delete(List<Candidato> candidatos) {
        
        initComponents();
        
        this.candidatos = candidatos;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(1,1,23));
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnConcluido = new javax.swing.JButton();
        lblVoltar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Número do candidato");

        txtNum.setBackground(new java.awt.Color(1, 1, 23));
        txtNum.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNum.setForeground(new java.awt.Color(255, 255, 255));
        txtNum.setText("informe o número do candidato");
        txtNum.setBorder(null);
        txtNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumFocusLost(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnConcluido.setBackground(new java.awt.Color(144, 0, 55));
        btnConcluido.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnConcluido.setForeground(new java.awt.Color(255, 255, 255));
        btnConcluido.setText("Concluído");
        btnConcluido.setAutoscrolls(true);
        btnConcluido.setBorder(null);
        btnConcluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluidoActionPerformed(evt);
            }
        });

        lblVoltar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblVoltar.setForeground(new java.awt.Color(51, 153, 255));
        lblVoltar.setText("<html>\n<b>\n<u>Voltar</u>\n</b>\n</html>");
        lblVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblVoltarMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtNum, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean temVotos(Candidato candidato){
        return candidato.getNumeroVotos()>0;
    }
    
    private void excluir(Candidato candidato){
        
        boolean removeu  = candidatos.remove(candidato);

        if(removeu){

            JOptionPane.showMessageDialog(null,"Candidato removido com sucesso!");

            MainFrame mainFrame = new MainFrame(candidatos);

            mainFrame.setVisible(true);
            this.dispose();

        }else{

            JOptionPane.showMessageDialog(null,"Ocorreu um erro ao remover!","Erro!",JOptionPane.ERROR_MESSAGE);

        }
        
    }
    
    private void btnConcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluidoActionPerformed
        
        if(candidatos.isEmpty()){
            
            JOptionPane.showMessageDialog(null,"Nenhum candidato cadastrado!","Erro!",JOptionPane.ERROR_MESSAGE);
        
        }else{
        
            for(int i=0;i<candidatos.size();i++){

                Candidato candidato = candidatos.get(i);
                
                if(candidato.getNumero() == Integer.parseInt(txtNum.getText())){

                    int resp = JOptionPane.showConfirmDialog(null,"Deseja mesmo apagar o candidato "+candidato.getNome()+"?",
                        "Atenção!!!",JOptionPane.YES_NO_OPTION);

                    if(resp == JOptionPane.YES_OPTION){

                        if(!temVotos(candidato)){

                            excluir(candidato);

                        }else{

                            JOptionPane.showMessageDialog(null,"O candidato já possui votos","Não foi possível excluir!",JOptionPane.ERROR_MESSAGE);

                        }

                    }

                }else{

                    JOptionPane.showMessageDialog(null,"Candidato não cadastrado!","Erro!",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnConcluidoActionPerformed

    private void lblVoltarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarMousePressed
        MainFrame mainFrame = new MainFrame(candidatos);
        
        mainFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVoltarMousePressed

    private void txtNumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumFocusGained
        if(txtNum.getText().equals("informe o número do candidato")){
            txtNum.setText("");
        }
    }//GEN-LAST:event_txtNumFocusGained

    private void txtNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumFocusLost
        if(txtNum.getText().equals("")){
            txtNum.setText("informe o número do candidato");
        }
    }//GEN-LAST:event_txtNumFocusLost

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel2MousePressed

    
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
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete(candidatos).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConcluido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblVoltar;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}
