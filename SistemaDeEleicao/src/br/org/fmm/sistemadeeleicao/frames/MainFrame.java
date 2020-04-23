package br.org.fmm.sistemadeeleicao.frames;


import br.org.fmm.sistemadeeleicao.classesbean.Candidato;
import br.org.fmm.sistemadeeleicao.frames.framescrud.CRUDFrame;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;


public class MainFrame extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    private int votoNulo;
    private int votoBranco;
    private int total;
    private List<Candidato> candidatos;
    
    
    public MainFrame() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(1,1,23));
        this.candidatos = new ArrayList<>();
        this.votoBranco = 0;
        this.votoNulo = 0;
        this.total = 0;
        
    }
    
    public MainFrame(List<Candidato> candidatos){
        initComponents();
        
        this.candidatos = candidatos;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(1,1,23));
    }
    
    public MainFrame(List<Candidato> candidatos,int votoBranco,int votoNulo,int total){
        initComponents();
        
        this.candidatos = candidatos;
        this.votoBranco = votoBranco;
        this.votoNulo = votoNulo;
        this.total = total;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(1,1,23));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn1 = new javax.swing.JPanel();
        lblSair = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        btnAvancar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pn1.setBackground(new java.awt.Color(255, 255, 255));
        pn1.setForeground(new java.awt.Color(50, 49, 41));
        pn1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pn1MouseDragged(evt);
            }
        });
        pn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pn1MousePressed(evt);
            }
        });

        lblSair.setBackground(new java.awt.Color(0, 0, 0));
        lblSair.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblSair.setForeground(new java.awt.Color(0, 0, 0));
        lblSair.setText("X");
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSairMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSair)
                .addGap(10, 10, 10))
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSair, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEMA ELEITORAL");

        jScrollPane1.setBorder(null);

        lista.setBackground(new java.awt.Color(1, 1, 23));
        lista.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lista.setForeground(new java.awt.Color(255, 255, 255));
        lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Manter candidatos", "Votar", "Emitir Relatório de apuração de voto" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lista.setToolTipText("");
        lista.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(lista);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selecione uma das opções abaixo:");

        btnAvancar.setBackground(new java.awt.Color(144, 0, 55));
        btnAvancar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnAvancar.setForeground(new java.awt.Color(255, 255, 255));
        btnAvancar.setText("Avançar");
        btnAvancar.setBorder(null);
        btnAvancar.setFocusable(false);
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMousePressed
        System.exit(0);
    }//GEN-LAST:event_lblSairMousePressed

    private void pn1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn1MouseDragged
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_pn1MouseDragged

    private void pn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn1MousePressed
        
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_pn1MousePressed

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        
        String opcao = lista.getSelectedValue();
        
        if(opcao.equals("Manter candidatos")){
            
            CRUDFrame crud = new CRUDFrame(candidatos);
            
            crud.setVisible(true);
            this.dispose();
            
        }else if(opcao.equals("Votar")){
            
            UrnaEletronicaFrame urnaEletronica = new UrnaEletronicaFrame(candidatos,votoBranco,votoNulo,total);
            
            urnaEletronica.setVisible(true);
            this.dispose();
            
        }else{
            ApuracaoFrame apuracaoFrame = new ApuracaoFrame(candidatos,total);
            
            apuracaoFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnAvancarActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvancar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSair;
    private javax.swing.JList<String> lista;
    private javax.swing.JPanel pn1;
    // End of variables declaration//GEN-END:variables
}
