package projetotcc.janelas;

import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import projetotcc.tabelas.Tblleite;
import projetotcc.util.LeiteDAO;

public class JanelaLeite extends javax.swing.JFrame {
    
    public JanelaLeite() {
        initComponents();
        Segurança();
        desabilitaCampos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelTabulado = new javax.swing.JTabbedPane();
        CadastroProdutos = new javax.swing.JPanel();
        BarraFerramentasLeite = new javax.swing.JToolBar();
        BotaoVoltar5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        BotaoNovoLeite = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        BotaoSalvarLeite = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        BotaoDeletarLeite = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        BotaoAlterarLeite = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        BotaoLimparLeite = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        BotaoCancelarLeite = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        BotaoProcurarLeite = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        CampoCodigoLeite = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CampoQuantidadeLeite = new javax.swing.JTextField();
        BotaoUltimoLeite = new javax.swing.JButton();
        BotaoProximoLeite = new javax.swing.JButton();
        BotaoAnteriorLeite = new javax.swing.JButton();
        BotaoPrimeiroLeite = new javax.swing.JButton();
        CampoDataTiradoLeite = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Leite");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PainelTabulado.setPreferredSize(new java.awt.Dimension(1024, 768));

        CadastroProdutos.setToolTipText("Cadastro de Leites");

        BarraFerramentasLeite.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BarraFerramentasLeite.setFloatable(false);
        BarraFerramentasLeite.setRollover(true);
        BarraFerramentasLeite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BotaoVoltar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/voltar.png"))); // NOI18N
        BotaoVoltar5.setText("Voltar");
        BotaoVoltar5.setToolTipText("Voltar");
        BotaoVoltar5.setFocusable(false);
        BotaoVoltar5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoVoltar5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoVoltar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltar5ActionPerformed(evt);
            }
        });
        BarraFerramentasLeite.add(BotaoVoltar5);
        BarraFerramentasLeite.add(jSeparator1);

        BotaoNovoLeite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/novo.png"))); // NOI18N
        BotaoNovoLeite.setText("Novo");
        BotaoNovoLeite.setToolTipText("Novo");
        BotaoNovoLeite.setFocusable(false);
        BotaoNovoLeite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoNovoLeite.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoNovoLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoLeiteActionPerformed(evt);
            }
        });
        BarraFerramentasLeite.add(BotaoNovoLeite);
        BarraFerramentasLeite.add(jSeparator9);

        BotaoSalvarLeite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/salvar.png"))); // NOI18N
        BotaoSalvarLeite.setText("Salvar");
        BotaoSalvarLeite.setToolTipText("Salvar");
        BotaoSalvarLeite.setFocusable(false);
        BotaoSalvarLeite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoSalvarLeite.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoSalvarLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarLeiteActionPerformed(evt);
            }
        });
        BarraFerramentasLeite.add(BotaoSalvarLeite);
        BarraFerramentasLeite.add(jSeparator11);

        BotaoDeletarLeite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/dell.png"))); // NOI18N
        BotaoDeletarLeite.setText("Deletar");
        BotaoDeletarLeite.setToolTipText("Deletar");
        BotaoDeletarLeite.setFocusable(false);
        BotaoDeletarLeite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoDeletarLeite.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoDeletarLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDeletarLeiteActionPerformed(evt);
            }
        });
        BarraFerramentasLeite.add(BotaoDeletarLeite);
        BarraFerramentasLeite.add(jSeparator12);

        BotaoAlterarLeite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/alterar.png"))); // NOI18N
        BotaoAlterarLeite.setText("Alterar");
        BotaoAlterarLeite.setToolTipText("Alterar");
        BotaoAlterarLeite.setFocusable(false);
        BotaoAlterarLeite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoAlterarLeite.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoAlterarLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarLeiteActionPerformed(evt);
            }
        });
        BarraFerramentasLeite.add(BotaoAlterarLeite);
        BarraFerramentasLeite.add(jSeparator13);

        BotaoLimparLeite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/limpar.png"))); // NOI18N
        BotaoLimparLeite.setText("Limpar");
        BotaoLimparLeite.setToolTipText("Limpar");
        BotaoLimparLeite.setFocusable(false);
        BotaoLimparLeite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoLimparLeite.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoLimparLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparLeiteActionPerformed(evt);
            }
        });
        BarraFerramentasLeite.add(BotaoLimparLeite);
        BarraFerramentasLeite.add(jSeparator14);

        BotaoCancelarLeite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/deletar.png"))); // NOI18N
        BotaoCancelarLeite.setText("Cancelar");
        BotaoCancelarLeite.setToolTipText("Cancelar");
        BotaoCancelarLeite.setFocusable(false);
        BotaoCancelarLeite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoCancelarLeite.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoCancelarLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarLeiteActionPerformed(evt);
            }
        });
        BarraFerramentasLeite.add(BotaoCancelarLeite);
        BarraFerramentasLeite.add(jSeparator15);

        BotaoProcurarLeite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/procurar.png"))); // NOI18N
        BotaoProcurarLeite.setText("Procurar");
        BotaoProcurarLeite.setToolTipText("Procurar");
        BotaoProcurarLeite.setFocusable(false);
        BotaoProcurarLeite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoProcurarLeite.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoProcurarLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProcurarLeiteActionPerformed(evt);
            }
        });
        BarraFerramentasLeite.add(BotaoProcurarLeite);
        BarraFerramentasLeite.add(jSeparator10);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Código:");

        CampoCodigoLeite.setFont(new java.awt.Font("Tahoma", 0, 14));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Data:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("Quantidade:");

        CampoQuantidadeLeite.setFont(new java.awt.Font("Tahoma", 0, 14));

        BotaoUltimoLeite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_last.png"))); // NOI18N
        BotaoUltimoLeite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoUltimoLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoUltimoLeiteActionPerformed(evt);
            }
        });

        BotaoProximoLeite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_next.png"))); // NOI18N
        BotaoProximoLeite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoProximoLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProximoLeiteActionPerformed(evt);
            }
        });

        BotaoAnteriorLeite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_previous.png"))); // NOI18N
        BotaoAnteriorLeite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoAnteriorLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAnteriorLeiteActionPerformed(evt);
            }
        });

        BotaoPrimeiroLeite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_first.png"))); // NOI18N
        BotaoPrimeiroLeite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoPrimeiroLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPrimeiroLeiteActionPerformed(evt);
            }
        });

        CampoDataTiradoLeite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout CadastroProdutosLayout = new javax.swing.GroupLayout(CadastroProdutos);
        CadastroProdutos.setLayout(CadastroProdutosLayout);
        CadastroProdutosLayout.setHorizontalGroup(
            CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraFerramentasLeite, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
            .addGroup(CadastroProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CampoCodigoLeite, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CampoDataTiradoLeite, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CampoQuantidadeLeite, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CadastroProdutosLayout.createSequentialGroup()
                            .addComponent(BotaoPrimeiroLeite)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BotaoAnteriorLeite)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BotaoProximoLeite)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BotaoUltimoLeite)))
                    .addComponent(jLabel1))
                .addContainerGap(731, Short.MAX_VALUE))
        );
        CadastroProdutosLayout.setVerticalGroup(
            CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroProdutosLayout.createSequentialGroup()
                .addComponent(BarraFerramentasLeite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(CampoCodigoLeite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(CampoDataTiradoLeite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(CampoQuantidadeLeite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoPrimeiroLeite)
                    .addComponent(BotaoAnteriorLeite)
                    .addComponent(BotaoProximoLeite)
                    .addComponent(BotaoUltimoLeite))
                .addContainerGap(363, Short.MAX_VALUE))
        );

        PainelTabulado.addTab("Cadastro de Leite", CadastroProdutos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelTabulado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelTabulado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoNovoLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoLeiteActionPerformed
        BotaoCancelarLeiteActionPerformed(evt);
        CampoCodigoLeite.setText("");
        abilitaCampos();
        Date hoje = new Date();
        CampoDataTiradoLeite.setDate(hoje);
        BotaoSalvarLeite.setEnabled(true);
        BotaoLimparLeite.setEnabled(true);
        BotaoCancelarLeite.setEnabled(true);
        BotaoNovoLeite.setEnabled(false);
    }//GEN-LAST:event_BotaoNovoLeiteActionPerformed

    private void BotaoSalvarLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarLeiteActionPerformed
        Date data = CampoDataTiradoLeite.getDate();
        String quantidade = CampoQuantidadeLeite.getText().trim();
        if(data == null){
            JOptionPane.showMessageDialog(this, "Informe a data que foi tirado o leite!", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
            CampoDataTiradoLeite.requestFocus();
        }
        else if(quantidade.length()<=0){
            JOptionPane.showMessageDialog(this, "Informe a quantidade!", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
            CampoQuantidadeLeite.requestFocus();
        }
        else{
            LeiteDAO lDAO = new LeiteDAO();
            Tblleite tblleite = new Tblleite();
            tblleite.setDataTiradoLeite(data);
            quantidade = quantidade.replace(",", ".");
            tblleite.setQuantidadeLeite(Float.valueOf(quantidade));
            lDAO.salvarLeite(tblleite);
            JOptionPane.showMessageDialog(null, "Leite Cadastrado!", "Aviso do Sistema", JOptionPane.INFORMATION_MESSAGE);
            preencheTela(tblleite);
            BotaoNovoLeite.setEnabled(true);
        }
    }//GEN-LAST:event_BotaoSalvarLeiteActionPerformed

    private void BotaoDeletarLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDeletarLeiteActionPerformed
        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente deletar este leite?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
        if(opcao == JOptionPane.YES_OPTION){
            LeiteDAO lDAO = new LeiteDAO();
            Tblleite tblleite = new Tblleite();
            lDAO.deletarLeite(tblleite);
            JOptionPane.showMessageDialog(null, "Leite Deletado!", "Aviso do Sistema!", JOptionPane.INFORMATION_MESSAGE);
            // Limpa a Tela
            BotaoLimparLeiteActionPerformed(evt);
            BotaoNovoLeite.setEnabled(true);
        }
    }//GEN-LAST:event_BotaoDeletarLeiteActionPerformed

    private void BotaoAlterarLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarLeiteActionPerformed
        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar este leite?", "Confirmar Alteração", JOptionPane.YES_NO_OPTION);
        if(opcao == JOptionPane.YES_OPTION){
            LeiteDAO lDAO = new LeiteDAO();
            Tblleite tblleite = new Tblleite();
            lDAO.deletarLeite(tblleite);
            // Limpa a Tela
            preencheTela(tblleite);
        }
    }//GEN-LAST:event_BotaoAlterarLeiteActionPerformed

    private void BotaoLimparLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparLeiteActionPerformed
        CampoDataTiradoLeite.setDate(null);
        CampoQuantidadeLeite.setText("");
        CampoCodigoLeite.setText("");
    }//GEN-LAST:event_BotaoLimparLeiteActionPerformed

    private void BotaoCancelarLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarLeiteActionPerformed
        BotaoLimparLeiteActionPerformed(evt);
        CampoCodigoLeite.setText("");
        desabilitaCampos();
        Segurança();
        BotaoNovoLeite.setEnabled(true);
    }//GEN-LAST:event_BotaoCancelarLeiteActionPerformed

    private void BotaoProcurarLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProcurarLeiteActionPerformed
        LeiteDAO lDAO = new LeiteDAO();
        Tblleite tblleite = new Tblleite();
        String buscar = JOptionPane.showInputDialog(null, "Digite um código:", "Procurar um Leite", JOptionPane.QUESTION_MESSAGE);
        int codigo = Integer.valueOf(buscar);
        if(lDAO.existeLeite(codigo)){
            tblleite.setCodLeite(0);
            tblleite = lDAO.procurarLeite(codigo);
            abilitaCampos();
            preencheTela(tblleite);
            BotaoNovoLeite.setEnabled(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Não tem leite cadastrado com este código!", "Aviso do Sistema!", JOptionPane.ERROR_MESSAGE);
            BotaoProcurarLeiteActionPerformed(evt);
        }
    }//GEN-LAST:event_BotaoProcurarLeiteActionPerformed

    private void BotaoPrimeiroLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPrimeiroLeiteActionPerformed
        LeiteDAO lDAO = new LeiteDAO();
        Tblleite tblleite;
        int codigo = lDAO.primeiroLeite();
        if(lDAO.existeLeite(codigo)){
            tblleite = lDAO.procurarLeite(codigo);
            abilitaCampos();
            preencheTela(tblleite);
            BotaoNovoLeite.setEnabled(true);
        } else {
            
        }
    }//GEN-LAST:event_BotaoPrimeiroLeiteActionPerformed

    private void BotaoAnteriorLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAnteriorLeiteActionPerformed
        String texto = CampoCodigoLeite.getText().trim();
        LeiteDAO lDAO = new LeiteDAO();
        Tblleite tblleite;
        if(texto.isEmpty()){
            BotaoUltimoLeiteActionPerformed(evt);
        } else {
            int codigo = Integer.valueOf(texto);
            int  primeiro = lDAO.primeiroLeite();
            boolean flag = false;
            while (codigo > primeiro && flag == false) {
                codigo--;
                flag = lDAO.existeLeite(codigo);
                if (flag){
                    tblleite = lDAO.procurarLeite(codigo);
                    abilitaCampos();
                    preencheTela(tblleite);
                    BotaoNovoLeite.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_BotaoAnteriorLeiteActionPerformed

    private void BotaoProximoLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProximoLeiteActionPerformed
        String texto = CampoCodigoLeite.getText().trim();
        LeiteDAO lDAO = new LeiteDAO();
        Tblleite tblleite;
        if(texto.isEmpty()){
            BotaoPrimeiroLeiteActionPerformed(evt);
        } else {
            int codigo = Integer.valueOf(texto);
            int ultimo = lDAO.ultimoLeite();
            boolean flag = false;
            while (codigo < ultimo && flag == false) {
                codigo++;
                flag = lDAO.existeLeite(codigo);
                if(flag){
                    tblleite = lDAO.procurarLeite(codigo);
                    abilitaCampos();
                    preencheTela(tblleite);
                    BotaoNovoLeite.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_BotaoProximoLeiteActionPerformed

    private void BotaoUltimoLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoUltimoLeiteActionPerformed
        LeiteDAO lDAO = new LeiteDAO();
        Tblleite tblleite;
        int codigo = lDAO.ultimoLeite();
        if(lDAO.existeLeite(codigo)){
            tblleite = lDAO.procurarLeite(codigo);
            abilitaCampos();
            preencheTela(tblleite);
            BotaoNovoLeite.setEnabled(true);
        }
    }//GEN-LAST:event_BotaoUltimoLeiteActionPerformed

    private void BotaoVoltar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltar5ActionPerformed
        dispose();
    }//GEN-LAST:event_BotaoVoltar5ActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaLeite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaLeite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaLeite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaLeite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new JanelaLeite().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarraFerramentasLeite;
    private javax.swing.JButton BotaoAlterarLeite;
    private javax.swing.JButton BotaoAnteriorLeite;
    private javax.swing.JButton BotaoCancelarLeite;
    private javax.swing.JButton BotaoDeletarLeite;
    private javax.swing.JButton BotaoLimparLeite;
    private javax.swing.JButton BotaoNovoLeite;
    private javax.swing.JButton BotaoPrimeiroLeite;
    private javax.swing.JButton BotaoProcurarLeite;
    private javax.swing.JButton BotaoProximoLeite;
    private javax.swing.JButton BotaoSalvarLeite;
    private javax.swing.JButton BotaoUltimoLeite;
    private javax.swing.JButton BotaoVoltar5;
    private javax.swing.JPanel CadastroProdutos;
    private javax.swing.JTextField CampoCodigoLeite;
    private com.toedter.calendar.JDateChooser CampoDataTiradoLeite;
    private javax.swing.JTextField CampoQuantidadeLeite;
    private javax.swing.JTabbedPane PainelTabulado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JToolBar.Separator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator9;
    // End of variables declaration//GEN-END:variables
    private void Segurança(){
        BotaoSalvarLeite.setEnabled(false);
        BotaoDeletarLeite.setEnabled(false);
        BotaoAlterarLeite.setEnabled(false);
        BotaoLimparLeite.setEnabled(false);
        BotaoCancelarLeite.setEnabled(false);
    }
    
    private void preencheTela(Tblleite tblleite){
        DecimalFormat df = new DecimalFormat("0.00##");
        CampoCodigoLeite.setText(String.valueOf(tblleite.getCodLeite()));   
        CampoDataTiradoLeite.setDate(tblleite.getDataTiradoLeite());
        CampoQuantidadeLeite.setText(df.format(tblleite.getQuantidadeLeite()));
        BotaoSalvarLeite.setEnabled(false);
        BotaoDeletarLeite.setEnabled(true);
        BotaoAlterarLeite.setEnabled(true);
        BotaoCancelarLeite.setEnabled(true);
    }
    
    private void abilitaCampos(){
        CampoCodigoLeite.setEditable(false);
        CampoDataTiradoLeite.setEnabled(true);
        CampoQuantidadeLeite.setEnabled(true);
    }
    
    private void desabilitaCampos(){
        CampoCodigoLeite.setEditable(false);
        CampoDataTiradoLeite.setEnabled(false);
        CampoQuantidadeLeite.setEnabled(false);
    }
    
}