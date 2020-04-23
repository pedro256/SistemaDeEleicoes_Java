package br.org.fmm.sistemadeeleicao.frames.framescrud;


import br.org.fmm.sistemadeeleicao.classesbean.Candidato;
import br.org.fmm.sistemadeeleicao.frames.MainFrame;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


    public class Update extends javax.swing.JFrame {

    private static List<Candidato> candidatos;
    
    public Update(List<Candidato> candidatos) {
        initComponents();
        
        btnSalvar.setEnabled(false);
        
        this.candidatos = candidatos;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(1,1,23));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        txtNumeroNovo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblCaminhoFoto = new javax.swing.JLabel();
        btnLocalizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Antigo número");

        txtNumero.setBackground(new java.awt.Color(1, 1, 23));
        txtNumero.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(255, 255, 255));
        txtNumero.setText("insira o número do candidato aqui");
        txtNumero.setBorder(null);
        txtNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumeroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumeroFocusLost(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");

        txtNome.setBackground(new java.awt.Color(1, 1, 23));
        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setText("insira o nome do candidato aqui");
        txtNome.setBorder(null);
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Novo número");

        btnSalvar.setBackground(new java.awt.Color(144, 0, 55));
        btnSalvar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(null);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtNumeroNovo.setBackground(new java.awt.Color(1, 1, 23));
        txtNumeroNovo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNumeroNovo.setForeground(new java.awt.Color(255, 255, 255));
        txtNumeroNovo.setText("insira o número do candidato aqui");
        txtNumeroNovo.setBorder(null);
        txtNumeroNovo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumeroNovoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumeroNovoFocusLost(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Caminho da foto");

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        lblCaminhoFoto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCaminhoFoto.setForeground(new java.awt.Color(255, 255, 255));
        lblCaminhoFoto.setText("insira o novo caminho da foto aqui");

        btnLocalizar.setBackground(new java.awt.Color(144, 0, 55));
        btnLocalizar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnLocalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnLocalizar.setText("Localizar");
        btnLocalizar.setBorder(null);
        btnLocalizar.setFocusable(false);
        btnLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jSeparator1)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(txtNumero)
                            .addComponent(jSeparator2)
                            .addComponent(txtNumeroNovo)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4)
                            .addComponent(lblCaminhoFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCaminhoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void atualizarDados(int numero,String nome,String caminhoFoto){
        
        MainFrame mainFrame;
        List<Candidato> lista = new ArrayList<>();
        boolean achou = false;
        
        for(Candidato candidato : candidatos){
            
            if(candidato.getNumero() == Integer.parseInt(txtNumero.getText())){
                
                achou = true;
                
                candidato.setNome(nome);
                candidato.setNumero(numero);
                candidato.setCaminhoFoto(caminhoFoto);
               
            }
            
            lista.add(candidato);
        } 
        
        if(!achou){
            
            JOptionPane.showMessageDialog(null,"Candidato não encontrado","Erro!",JOptionPane.ERROR_MESSAGE);
        
        }else{
            
            candidatos = lista;

            mainFrame = new MainFrame(candidatos);
            mainFrame.setVisible(true);
            this.dispose();
            
        }
    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        int numero = Integer.parseInt(txtNumeroNovo.getText());
        String nome = txtNome.getText();
        String caminhoFoto = lblCaminhoFoto.getText();
        
        atualizarDados(numero,nome,caminhoFoto);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroFocusGained
        
        if(txtNumero.getText().equals("insira o número do candidato aqui")){
            txtNumero.setText("");
        }
        
    }//GEN-LAST:event_txtNumeroFocusGained

    private void btnLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarActionPerformed
       
        JFileChooser fileChooser = new JFileChooser();
        
        fileChooser.setDialogTitle("Procurar foto");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("imagem","jpg");
        
        fileChooser.setFileFilter(filter);
        
        int res = fileChooser.showOpenDialog(this);
        
        if(res == JFileChooser.APPROVE_OPTION){
            
            File file = fileChooser.getSelectedFile();
            
            lblCaminhoFoto.setText(file.getPath());
        }
    }//GEN-LAST:event_btnLocalizarActionPerformed

    private void txtNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroFocusLost
        if(txtNumero.getText().isEmpty()){
            
            txtNumero.setText("insira o número do candidato aqui");
        
        }else{
            
            boolean achou = false;
            
            for(Candidato c : candidatos){
                
                if(c.getNumero() == Integer.parseInt(txtNumero.getText())){
                    
                    achou = true;
                    
                    txtNome.setText(c.getNome());
                    lblCaminhoFoto.setText(c.getCaminhoFoto());
                    
                }
            }
            
            if(!achou){
                JOptionPane.showMessageDialog(null,"Candidato não cadastrado");
            }else{
                btnSalvar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_txtNumeroFocusLost

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained

        if(txtNome.equals("insira o nome do candidato aqui")){
            txtNome.setText("");
        }
        
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        
        if(txtNome.equals("")){
            txtNome.setText("insira o nome do candidato aqui");
        }
        
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtNumeroNovoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroNovoFocusGained
        if(txtNumero.equals("insira o numero do candidato aqui")){
            txtNumeroNovo.setText("");
        }
    }//GEN-LAST:event_txtNumeroNovoFocusGained

    private void txtNumeroNovoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroNovoFocusLost
        if(txtNumero.equals("")){
            txtNumeroNovo.setText("insira o numero do candidato aqui");
        }
    }//GEN-LAST:event_txtNumeroNovoFocusLost

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel5MousePressed

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update(candidatos).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblCaminhoFoto;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumeroNovo;
    // End of variables declaration//GEN-END:variables
}
