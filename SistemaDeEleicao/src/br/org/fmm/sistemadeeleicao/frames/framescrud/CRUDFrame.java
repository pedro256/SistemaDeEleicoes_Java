package br.org.fmm.sistemadeeleicao.frames.framescrud;


import br.org.fmm.sistemadeeleicao.classesbean.Candidato;
import java.awt.Color;
import java.util.List;


public class CRUDFrame extends javax.swing.JFrame {

    private static List<Candidato> candidatos;
    
    public CRUDFrame(List<Candidato> candidatos) {
        
        initComponents();
        
        this.candidatos = candidatos;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(1,1,23));
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNovo = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lblExcluir = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblSair = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        lblNovo.setBackground(new java.awt.Color(255, 255, 255));
        lblNovo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblNovo.setForeground(new java.awt.Color(255, 255, 255));
        lblNovo.setText("Novo");
        lblNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNovoMousePressed(evt);
            }
        });

        lbl.setBackground(new java.awt.Color(255, 255, 255));
        lbl.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lbl.setForeground(new java.awt.Color(255, 255, 255));
        lbl.setText("Listar");
        lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMousePressed(evt);
            }
        });

        lblExcluir.setBackground(new java.awt.Color(255, 255, 255));
        lblExcluir.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblExcluir.setForeground(new java.awt.Color(255, 255, 255));
        lblExcluir.setText("Excluir");
        lblExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblExcluirMousePressed(evt);
            }
        });

        lblEditar.setBackground(new java.awt.Color(255, 255, 255));
        lblEditar.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setText("Editar");
        lblEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEditarMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

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
            .addComponent(lblSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNovo)
                    .addComponent(lbl)
                    .addComponent(lblEditar)
                    .addComponent(lblExcluir))
                .addContainerGap(88, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(lblNovo)
                .addGap(18, 18, 18)
                .addComponent(lbl)
                .addGap(18, 18, 18)
                .addComponent(lblEditar)
                .addGap(18, 18, 18)
                .addComponent(lblExcluir)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExcluirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExcluirMousePressed
        
        Delete deleteFrame = new Delete(candidatos);
        
        deleteFrame.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_lblExcluirMousePressed

    private void lblNovoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNovoMousePressed
        
        Create createFrame = new Create(candidatos);
        
        createFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblNovoMousePressed

    private void lblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMousePressed
        
        Read readFrame = new Read(candidatos);
        
        readFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblMousePressed

    private void lblEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMousePressed
        Update updateFrame = new Update(candidatos);
        
        updateFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblEditarMousePressed

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
            java.util.logging.Logger.getLogger(CRUDFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDFrame(candidatos).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblExcluir;
    private javax.swing.JLabel lblNovo;
    private javax.swing.JLabel lblSair;
    // End of variables declaration//GEN-END:variables
}
