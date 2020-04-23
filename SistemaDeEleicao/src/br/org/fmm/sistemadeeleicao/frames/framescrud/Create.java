package br.org.fmm.sistemadeeleicao.frames.framescrud;


import br.org.fmm.sistemadeeleicao.classesbean.Candidato;
import br.org.fmm.sistemadeeleicao.frames.MainFrame;
import java.awt.Color;
import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Create extends javax.swing.JFrame {
    
    private static List<Candidato> candidatos;
    
    public Create(List<Candidato> candidatos) {
        
        initComponents();
        
        this.candidatos = candidatos;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(1,1,23));
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSair = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnSalvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblCaminhoFoto = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnLocalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblSair.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
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
            .addComponent(lblSair, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");

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

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Número");

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

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

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

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Caminho da foto:");

        lblCaminhoFoto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCaminhoFoto.setForeground(new java.awt.Color(255, 255, 255));
        lblCaminhoFoto.setText("selecione uma foto .jpg");

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        btnLocalizar.setBackground(new java.awt.Color(144, 0, 55));
        btnLocalizar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnLocalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnLocalizar.setText("Localizar");
        btnLocalizar.setBorder(null);
        btnLocalizar.setFocusable(false);
        btnLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txtNome)
                            .addComponent(jSeparator1)
                            .addComponent(jLabel2)
                            .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(lblCaminhoFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3)
                            .addComponent(btnLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCaminhoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean jaRegistrado(int num){
        
        for(Candidato c : candidatos){
            
            if(c.getNumero() == num) return true;
        
        }
        
        return false;
    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        MainFrame mainFrame;
        Candidato candidato = new Candidato();
        
        if(!jaRegistrado(Integer.parseInt(txtNumero.getText()))){
            
            candidato.setNome(txtNome.getText());
            candidato.setNumero(Integer.parseInt(txtNumero.getText()));
            candidato.setCaminhoFoto(lblCaminhoFoto.getText());
            candidato.setNumeroVotos(0);
            
            candidatos.add(candidato);

            mainFrame = new MainFrame(candidatos);
            mainFrame.setVisible(true);
            this.dispose();
            
        }else{
            
            JOptionPane.showMessageDialog(null,"Número do candidato já cadastrado","Erro!",JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void lblSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMousePressed
        System.exit(0);
    }//GEN-LAST:event_lblSairMousePressed

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

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        if(txtNome.getText().equals("insira o nome do candidato aqui")){
            txtNome.setText("");
        }
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        if(txtNome.getText().equals("")){
            txtNome.setText("insira o nome do candidato aqui");
        }
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtNumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroFocusGained
        if(txtNumero.getText().equals("insira o número do candidato aqui")){
            txtNumero.setText("");
        }
    }//GEN-LAST:event_txtNumeroFocusGained

    private void txtNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroFocusLost
        if(txtNumero.getText().equals("")){
            txtNumero.setText("insira o número do candidato aqui");
        }
    }//GEN-LAST:event_txtNumeroFocusLost

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
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create(candidatos).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblCaminhoFoto;
    private javax.swing.JLabel lblSair;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
