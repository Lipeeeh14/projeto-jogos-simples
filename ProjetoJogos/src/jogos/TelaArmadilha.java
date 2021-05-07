/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogos;

import javax.swing.JOptionPane;

/**
 *
 * @author MINEIRO
 */
public class TelaArmadilha extends javax.swing.JFrame {

    private int numSort = 0, numTentativa, numInferior, numSuperior;
    private boolean acertou;
    
    /**
     * Creates new form TelaArmadilha
     */
    public TelaArmadilha() {
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
        txtLimInferior = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLimSuperior = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMensagem = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAjuda = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenu();
        menuTelaInicial = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Armadilha");

        jLabel1.setText("Limite Inferior:");

        jLabel2.setText("Limite Superior:");

        txtLimSuperior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimSuperiorActionPerformed(evt);
            }
        });

        jLabel3.setText("Mensagem:");

        txtMensagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtLimInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtLimSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLimInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLimSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(txtMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        menuAjuda.setText("Ajuda");
        menuAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAjudaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuAjuda);

        menuSobre.setText("Sobre");
        menuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSobre);

        menuTelaInicial.setText("Tela Inicial");
        menuTelaInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTelaInicialMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuTelaInicial);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //==================
        MetodosGerais inst = new MetodosGerais();        
        numSort = inst.sorteiaNum(1, 100);
        txtMensagem.setText("Número sorteado, capture-o!");
        
        numTentativa = 0;
        acertou = false;
        //==================
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtLimSuperiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimSuperiorActionPerformed
        //==================
        try{
            int troca;
            boolean valida;
            numInferior = Integer.parseInt(txtLimInferior.getText());
            numSuperior = Integer.parseInt(txtLimSuperior.getText());
        
            valida = validarJogo();
            if(valida){
                numTentativa++;
                if(numInferior > numSuperior){ // Caso os limites sejam digitados de forma invertida
                    troca = numInferior;
                    numInferior = numSuperior;
                    numSuperior = troca;
                }
                // Verificando resultado
                if(numSort == numInferior && numSort == numSuperior){
                    JOptionPane.showMessageDialog(null, "O número caiu na armadilha, parabéns você ganhou!");
                    txtMensagem.setText("Quantidade de tentativas: "+ numTentativa);
                    numSort = 0; // reseta a variável do número sorteado
                    acertou = true;
                } else if(numSort >= numInferior && numSort <= numSuperior){
                    txtMensagem.setText("O número está entre os limites!");
                } else{ 
                    txtMensagem.setText("O número não está entre os limites, mas não desista!");
                }    
            }
        } catch(Exception e){
            // Tratando algo digitado pelo usuário que não seja número
            JOptionPane.showMessageDialog(null, "Limites inválidos! Digite novamente!");
        }    
        //==================
    }//GEN-LAST:event_txtLimSuperiorActionPerformed

    private void menuTelaInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTelaInicialMouseClicked
        //==================
        new TelaInicial().setVisible(true);
        this.dispose();
        //==================
    }//GEN-LAST:event_menuTelaInicialMouseClicked

    private void menuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSobreMouseClicked
        //==================
        JOptionPane.showMessageDialog(null, "Joguinho bem simples desenvolvido por Luiz Felipe.");
        //==================
    }//GEN-LAST:event_menuSobreMouseClicked

    private void menuAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAjudaMouseClicked
        //==================
        JOptionPane.showMessageDialog(null, "Neste jogo é sorteado um número entre 1 e 100; \n"
                + "Seu objetivo é capturar este número usando os campos de limite inferior e superior; \n"
                + "Limite inferior: posição miníma em que você acha que o número está; \n"
                + "Limite superior: posição máxima em que você acha que o número está; \n"
                + "Caso você já saiba qual é o número, digite-o nos dois campos dos limites.");
        //==================
    }//GEN-LAST:event_menuAjudaMouseClicked

    private boolean validarJogo(){
        boolean situacao = true;
        
        if((numInferior < 1 || numSuperior < 1) || (numInferior > 100 || numSuperior > 100)){
            txtMensagem.setText("Limites inválidos! Digite novamente.");
            situacao = false;
        } else if(numSort == 0){
            txtMensagem.setText("O número não foi gerado!");
            JOptionPane.showMessageDialog(null, "Clique no botão Iniciar para começar o jogo :)");
            situacao = false;
        } else if(acertou){
            txtMensagem.setText("O número já foi capturado!");
            situacao = false;
        }
        
        return situacao;
    }
    
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
            java.util.logging.Logger.getLogger(TelaArmadilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaArmadilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaArmadilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaArmadilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaArmadilha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenu menuTelaInicial;
    private javax.swing.JTextField txtLimInferior;
    private javax.swing.JTextField txtLimSuperior;
    private javax.swing.JLabel txtMensagem;
    // End of variables declaration//GEN-END:variables
}
