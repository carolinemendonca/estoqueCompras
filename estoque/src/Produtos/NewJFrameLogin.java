package Produtos;

import Produtos.NewJFrameExcluir;
import Produtos.NewJFrameCadastrar;
import Conexao.Clientes;
import javax.swing.JFrame;

/**
 *
 * @author caroline.mendonca
 */
public class NewJFrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrameLogin() {
        initComponents();
        setSize(500,500);

    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        acessoFunc = new javax.swing.JButton();
        acessoGerente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jInternalFrame1.setBackground(new java.awt.Color(255, 255, 255));
        jInternalFrame1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jInternalFrame1.setVisible(true);

        sair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sair.setForeground(new java.awt.Color(0, 153, 153));
        sair.setText("SAIR");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("SISTEMA GESTÃO ESTOQUE");

        acessoFunc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        acessoFunc.setForeground(new java.awt.Color(0, 153, 153));
        acessoFunc.setText("FUNCIONÁRIO");
        acessoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acessoFuncActionPerformed(evt);
            }
        });

        acessoGerente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        acessoGerente.setForeground(new java.awt.Color(0, 153, 153));
        acessoGerente.setText("GERENTE");
        acessoGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acessoGerenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(acessoGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(acessoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(423, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acessoFunc)
                    .addComponent(acessoGerente))
                .addGap(66, 66, 66)
                .addComponent(sair)
                .addContainerGap(508, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jInternalFrame1);

        getContentPane().add(jScrollPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acessoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acessoFuncActionPerformed
       JFrame telaInicio = new NewJFrameInicioFunc(); 
       telaInicio.setVisible(true);
       telaInicio.setSize(500,500);
        
    
    }//GEN-LAST:event_acessoFuncActionPerformed

    private void acessoGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acessoGerenteActionPerformed
        JFrame telaInicio = new NewJFrameInicioGerente(); 
        telaInicio.setVisible(true);
        telaInicio.setSize(500,500);
           
    }//GEN-LAST:event_acessoGerenteActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acessoFunc;
    private javax.swing.JButton acessoGerente;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
