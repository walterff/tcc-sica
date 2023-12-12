package projetotcc.janelas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projetotcc.tabelas.Tblprodutos;
import projetotcc.util.ProdutosDAO;

public class JanelaProdutos extends javax.swing.JFrame {
    // Listas

    List<Tblprodutos> produtos;
    // 

    public JanelaProdutos() {
        initComponents();
        Segurança();
        desabilitaCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelTabulado = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        BarraFerramentasProdutos = new javax.swing.JToolBar();
        BotaoVoltarProduto = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        BotaoNovoProduto = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        BotaoSalvarProduto = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        BotaoDeletarProduto = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        BotaoAlterarProduto = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        BotaoLimparProduto = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        BotaoCancelarProduto = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        BotaoProcurarProduto = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CampoCodigoProduto = new javax.swing.JTextField();
        CampoNomeProduto = new javax.swing.JTextField();
        CampoDescricaoProduto = new javax.swing.JTextField();
        BotaoPrimeiroProduto = new javax.swing.JButton();
        BotaoAnteriorProduto = new javax.swing.JButton();
        BotaoProximoProduto = new javax.swing.JButton();
        BotaoUltimoProduto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        PainelScrollTabelaProdutos = new javax.swing.JScrollPane();
        TabelaProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BarraFerramentasProdutos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BarraFerramentasProdutos.setFloatable(false);
        BarraFerramentasProdutos.setRollover(true);
        BarraFerramentasProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BotaoVoltarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/voltar.png"))); // NOI18N
        BotaoVoltarProduto.setText("Voltar");
        BotaoVoltarProduto.setFocusable(false);
        BotaoVoltarProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoVoltarProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoVoltarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarProdutoActionPerformed(evt);
            }
        });
        BarraFerramentasProdutos.add(BotaoVoltarProduto);
        BarraFerramentasProdutos.add(jSeparator1);

        BotaoNovoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/novo.png"))); // NOI18N
        BotaoNovoProduto.setText("Novo");
        BotaoNovoProduto.setToolTipText("Cadastrar Um Novo Animal!");
        BotaoNovoProduto.setFocusable(false);
        BotaoNovoProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoNovoProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoProdutoActionPerformed(evt);
            }
        });
        BarraFerramentasProdutos.add(BotaoNovoProduto);
        BarraFerramentasProdutos.add(jSeparator9);

        BotaoSalvarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/salvar.png"))); // NOI18N
        BotaoSalvarProduto.setText("Salvar");
        BotaoSalvarProduto.setFocusable(false);
        BotaoSalvarProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoSalvarProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarProdutoActionPerformed(evt);
            }
        });
        BarraFerramentasProdutos.add(BotaoSalvarProduto);
        BarraFerramentasProdutos.add(jSeparator11);

        BotaoDeletarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/dell.png"))); // NOI18N
        BotaoDeletarProduto.setText("Deletar");
        BotaoDeletarProduto.setFocusable(false);
        BotaoDeletarProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoDeletarProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoDeletarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDeletarProdutoActionPerformed(evt);
            }
        });
        BarraFerramentasProdutos.add(BotaoDeletarProduto);
        BarraFerramentasProdutos.add(jSeparator12);

        BotaoAlterarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/alterar.png"))); // NOI18N
        BotaoAlterarProduto.setText("Alterar");
        BotaoAlterarProduto.setFocusable(false);
        BotaoAlterarProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoAlterarProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarProdutoActionPerformed(evt);
            }
        });
        BarraFerramentasProdutos.add(BotaoAlterarProduto);
        BarraFerramentasProdutos.add(jSeparator13);

        BotaoLimparProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/limpar.png"))); // NOI18N
        BotaoLimparProduto.setText("Limpar");
        BotaoLimparProduto.setFocusable(false);
        BotaoLimparProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoLimparProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoLimparProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparProdutoActionPerformed(evt);
            }
        });
        BarraFerramentasProdutos.add(BotaoLimparProduto);
        BarraFerramentasProdutos.add(jSeparator10);

        BotaoCancelarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/deletar.png"))); // NOI18N
        BotaoCancelarProduto.setText("Cancelar");
        BotaoCancelarProduto.setFocusable(false);
        BotaoCancelarProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoCancelarProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoCancelarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarProdutoActionPerformed(evt);
            }
        });
        BarraFerramentasProdutos.add(BotaoCancelarProduto);
        BarraFerramentasProdutos.add(jSeparator14);

        BotaoProcurarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/procurar.png"))); // NOI18N
        BotaoProcurarProduto.setText("Procurar");
        BotaoProcurarProduto.setFocusable(false);
        BotaoProcurarProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoProcurarProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoProcurarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProcurarProdutoActionPerformed(evt);
            }
        });
        BarraFerramentasProdutos.add(BotaoProcurarProduto);
        BarraFerramentasProdutos.add(jSeparator2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("Descrição:");

        CampoCodigoProduto.setFont(new java.awt.Font("Tahoma", 0, 14));

        CampoNomeProduto.setFont(new java.awt.Font("Tahoma", 0, 14));

        CampoDescricaoProduto.setFont(new java.awt.Font("Tahoma", 0, 14));

        BotaoPrimeiroProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_first.png"))); // NOI18N
        BotaoPrimeiroProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoPrimeiroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPrimeiroProdutoActionPerformed(evt);
            }
        });

        BotaoAnteriorProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_previous.png"))); // NOI18N
        BotaoAnteriorProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoAnteriorProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAnteriorProdutoActionPerformed(evt);
            }
        });

        BotaoProximoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_next.png"))); // NOI18N
        BotaoProximoProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoProximoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProximoProdutoActionPerformed(evt);
            }
        });

        BotaoUltimoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_last.png"))); // NOI18N
        BotaoUltimoProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoUltimoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoUltimoProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraFerramentasProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoPrimeiroProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoAnteriorProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoProximoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoUltimoProduto))
                    .addComponent(CampoDescricaoProduto)
                    .addComponent(CampoNomeProduto)
                    .addComponent(CampoCodigoProduto))
                .addContainerGap(731, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(BarraFerramentasProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(CampoCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(CampoNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(CampoDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoPrimeiroProduto)
                    .addComponent(BotaoAnteriorProduto)
                    .addComponent(BotaoProximoProduto)
                    .addComponent(BotaoUltimoProduto))
                .addContainerGap(378, Short.MAX_VALUE))
        );

        PainelTabulado.addTab("Cadastro de Produtos", jPanel1);

        jPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel2ComponentShown(evt);
            }
        });

        TabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Tipo", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaProdutosMouseClicked(evt);
            }
        });
        PainelScrollTabelaProdutos.setViewportView(TabelaProdutos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelScrollTabelaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelScrollTabelaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                .addContainerGap())
        );

        PainelTabulado.addTab("Tabela de Produtos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelTabulado)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelTabulado)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void BotaoNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoProdutoActionPerformed
    BotaoLimparProdutoActionPerformed(evt);
    CampoCodigoProduto.setText("");
    CampoNomeProduto.requestFocus();
    abilitaCampos();
    BotaoSalvarProduto.setEnabled(true);
    BotaoLimparProduto.setEnabled(true);
    BotaoCancelarProduto.setEnabled(true);
    BotaoNovoProduto.setEnabled(false);
}//GEN-LAST:event_BotaoNovoProdutoActionPerformed

private void BotaoSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarProdutoActionPerformed
    String nome = CampoNomeProduto.getText().trim();
    if (nome.length() <= 0) {
        JOptionPane.showMessageDialog(this, "Você tem que informar o nome do Produto!", "Aviso do Sistema!", JOptionPane.INFORMATION_MESSAGE);
        CampoNomeProduto.requestFocus();
    } else {
        ProdutosDAO pDAO = new ProdutosDAO();
        Tblprodutos tblprodutos = new Tblprodutos();
        tblprodutos.setDescricaoProd(CampoDescricaoProduto.getText().trim());
        tblprodutos.setTipoProd(CampoNomeProduto.getText().trim());
        pDAO.salvarProduto(tblprodutos);
        JOptionPane.showMessageDialog(null, "Produto Cadastrado!", "Aviso do Sistema", JOptionPane.INFORMATION_MESSAGE);
        preencheTela(tblprodutos);
    }
    BotaoNovoProduto.setEnabled(true);
}//GEN-LAST:event_BotaoSalvarProdutoActionPerformed

private void BotaoDeletarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDeletarProdutoActionPerformed
    int opcao;
    opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente deletar este Produto?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
    if (opcao == JOptionPane.YES_OPTION) {
        ProdutosDAO pDAO = new ProdutosDAO();
        Tblprodutos tblprodutos = new Tblprodutos();
        tblprodutos.setCodProd(Integer.valueOf(CampoCodigoProduto.getText().trim()));
        pDAO.deletarProduto(tblprodutos);
        JOptionPane.showMessageDialog(null, "Produto Deletado!", "Aviso do Sistema!", JOptionPane.INFORMATION_MESSAGE);
        // Limpa a Tela
        BotaoLimparProdutoActionPerformed(evt);
    }
}//GEN-LAST:event_BotaoDeletarProdutoActionPerformed

private void BotaoAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarProdutoActionPerformed
    String nome = CampoNomeProduto.getText().trim();
    if (nome.length() <= 0) {
        JOptionPane.showMessageDialog(this, "Você deve informar o nome do Produto!", "Aviso do Sistema!", JOptionPane.INFORMATION_MESSAGE);
        CampoNomeProduto.requestFocus();
    } else {
        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar este produto?", "Confirmar Alteração", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            ProdutosDAO pDAO = new ProdutosDAO();
            Tblprodutos tblprodutos = new Tblprodutos();
            tblprodutos.setCodProd(Integer.valueOf(CampoCodigoProduto.getText().trim()));
            tblprodutos.setDescricaoProd(CampoDescricaoProduto.getText().trim());
            tblprodutos.setTipoProd(CampoNomeProduto.getText().trim());
            pDAO.alterarProduto(tblprodutos);
            JOptionPane.showMessageDialog(null, "Produto Alterado!", "Aviso do Sistema!", JOptionPane.INFORMATION_MESSAGE);
            // Atualiza a Tela
            preencheTela(tblprodutos);
        }
    }
}//GEN-LAST:event_BotaoAlterarProdutoActionPerformed

private void BotaoLimparProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparProdutoActionPerformed
    CampoNomeProduto.setText("");
    CampoDescricaoProduto.setText("");
    CampoCodigoProduto.setText("");
}//GEN-LAST:event_BotaoLimparProdutoActionPerformed

private void BotaoCancelarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarProdutoActionPerformed
    BotaoLimparProdutoActionPerformed(evt);
    CampoCodigoProduto.setText("");
    desabilitaCampos();
    Segurança();
    BotaoNovoProduto.setEnabled(true);
}//GEN-LAST:event_BotaoCancelarProdutoActionPerformed

private void BotaoProcurarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProcurarProdutoActionPerformed
    ProdutosDAO pDAO = new ProdutosDAO();
    Tblprodutos tblprodutos = new Tblprodutos();
    String buscar = JOptionPane.showInputDialog(null, "Digite um código:", "Procurar um Produto", JOptionPane.QUESTION_MESSAGE);
    int codigo = Integer.valueOf(buscar);
    if (pDAO.existeProduto(codigo)) {
        abilitaCampos();
        tblprodutos.setCodProd(0);
        tblprodutos = pDAO.procurarProduto(codigo);
        preencheTela(tblprodutos);
        BotaoNovoProduto.setEnabled(true);
    } else {
        JOptionPane.showMessageDialog(this, "Não há produto com este código!", "Aviso do Sistema!", JOptionPane.ERROR_MESSAGE);
        BotaoProcurarProdutoActionPerformed(evt);
    }
}//GEN-LAST:event_BotaoProcurarProdutoActionPerformed

private void BotaoPrimeiroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPrimeiroProdutoActionPerformed
    ProdutosDAO pDAO = new ProdutosDAO();
    Tblprodutos tblprodutos;
    int codigo = pDAO.primeiroProduto();
    if (pDAO.existeProduto(codigo)) {
        tblprodutos = pDAO.procurarProduto(codigo);
        abilitaCampos();
        preencheTela(tblprodutos);
        BotaoNovoProduto.setEnabled(true);
    } else {
        // Não faz nada.
    }
}//GEN-LAST:event_BotaoPrimeiroProdutoActionPerformed

private void BotaoAnteriorProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAnteriorProdutoActionPerformed
    ProdutosDAO pDAO = new ProdutosDAO();
    Tblprodutos tblprodutos;
    String texto = CampoCodigoProduto.getText().trim();
    if (texto.equals("")) {
        BotaoPrimeiroProdutoActionPerformed(evt);
    } else {
        int codigo = Integer.valueOf(texto);
        int primeiro = pDAO.primeiroProduto();
        boolean flag = false;
        while (codigo > primeiro && flag == false) {
            codigo--;
            flag = pDAO.existeProduto(codigo);
            if (flag) {
                tblprodutos = pDAO.procurarProduto(codigo);
                abilitaCampos();
                preencheTela(tblprodutos);
            }
        }
    }
}//GEN-LAST:event_BotaoAnteriorProdutoActionPerformed

private void BotaoProximoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProximoProdutoActionPerformed
    ProdutosDAO pDAO = new ProdutosDAO();
    Tblprodutos tblprodutos;
    String texto = CampoCodigoProduto.getText().trim();
    if (texto.equals("")) {
        BotaoPrimeiroProdutoActionPerformed(evt);
    } else {
        int codigo = Integer.valueOf(texto);
        int ultimo = pDAO.ultimoProduto();
        boolean flag = false;
        while (codigo < ultimo && flag == false) {
            codigo++;
            flag = pDAO.existeProduto(codigo);
            if (flag) {
                tblprodutos = pDAO.procurarProduto(codigo);
                abilitaCampos();
                preencheTela(tblprodutos);
            }
        }
    }
}//GEN-LAST:event_BotaoProximoProdutoActionPerformed

private void BotaoUltimoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoUltimoProdutoActionPerformed
    ProdutosDAO pDAO = new ProdutosDAO();
    Tblprodutos tblprodutos;
    int codigo = pDAO.ultimoProduto();
    if (pDAO.existeProduto(codigo)) {
        tblprodutos = pDAO.procurarProduto(codigo);
        abilitaCampos();
        preencheTela(tblprodutos);
        BotaoNovoProduto.setEnabled(true);
    } else {
        // Não faz nada.
    }
}//GEN-LAST:event_BotaoUltimoProdutoActionPerformed

    private void BotaoVoltarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarProdutoActionPerformed
        dispose();
    }//GEN-LAST:event_BotaoVoltarProdutoActionPerformed

private void jPanel2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel2ComponentShown
    ProdutosDAO pDAO = new ProdutosDAO();
    produtos = pDAO.listarProdutos();
    TabelaProdutos();
}//GEN-LAST:event_jPanel2ComponentShown

private void TabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProdutosMouseClicked
    Tblprodutos tblprodutos;
    int index = TabelaProdutos.getSelectedRow();
    tblprodutos = (Tblprodutos) produtos.get(index);
    abilitaCampos();
    preencheTela(tblprodutos);
    PainelTabulado.setSelectedIndex(0);
}//GEN-LAST:event_TabelaProdutosMouseClicked

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
            java.util.logging.Logger.getLogger(JanelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new JanelaProdutos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarraFerramentasProdutos;
    private javax.swing.JButton BotaoAlterarProduto;
    private javax.swing.JButton BotaoAnteriorProduto;
    private javax.swing.JButton BotaoCancelarProduto;
    private javax.swing.JButton BotaoDeletarProduto;
    private javax.swing.JButton BotaoLimparProduto;
    private javax.swing.JButton BotaoNovoProduto;
    private javax.swing.JButton BotaoPrimeiroProduto;
    private javax.swing.JButton BotaoProcurarProduto;
    private javax.swing.JButton BotaoProximoProduto;
    private javax.swing.JButton BotaoSalvarProduto;
    private javax.swing.JButton BotaoUltimoProduto;
    private javax.swing.JButton BotaoVoltarProduto;
    private javax.swing.JTextField CampoCodigoProduto;
    private javax.swing.JTextField CampoDescricaoProduto;
    private javax.swing.JTextField CampoNomeProduto;
    private javax.swing.JScrollPane PainelScrollTabelaProdutos;
    private javax.swing.JTabbedPane PainelTabulado;
    private javax.swing.JTable TabelaProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator9;
    // End of variables declaration//GEN-END:variables

    private void preencheTela(Tblprodutos tblprodutos) {
        CampoCodigoProduto.setText(String.valueOf(tblprodutos.getCodProd()));
        CampoDescricaoProduto.setText(tblprodutos.getDescricaoProd());
        CampoNomeProduto.setText(tblprodutos.getTipoProd());
        BotaoSalvarProduto.setEnabled(false);
        BotaoDeletarProduto.setEnabled(true);
        BotaoAlterarProduto.setEnabled(true);
        BotaoCancelarProduto.setEnabled(true);
        BotaoLimparProduto.setEnabled(true);
    }

    private void Segurança() {
        BotaoSalvarProduto.setEnabled(false);
        BotaoDeletarProduto.setEnabled(false);
        BotaoAlterarProduto.setEnabled(false);
        BotaoLimparProduto.setEnabled(false);
        BotaoCancelarProduto.setEnabled(false);
    }

    private void abilitaCampos() {
        CampoCodigoProduto.setEditable(false);
        CampoNomeProduto.setEnabled(true);
        CampoDescricaoProduto.setEnabled(true);
    }

    private void desabilitaCampos() {
        CampoCodigoProduto.setEditable(false);
        CampoNomeProduto.setEnabled(false);
        CampoDescricaoProduto.setEnabled(false);
    }

    private void TabelaProdutos() {
        Tblprodutos tblprodutos;
        DefaultTableModel modelo = (DefaultTableModel) TabelaProdutos.getModel();
        modelo.setNumRows(0);
        for (int i = 0; i < produtos.size(); i++) {
            tblprodutos = (Tblprodutos) produtos.get(i);
            int codigo = tblprodutos.getCodProd();
            String tipo = tblprodutos.getTipoProd();
            String descricao = tblprodutos.getDescricaoProd();
            modelo.addRow(new Object[]{codigo, tipo, descricao});
        }
        TabelaProdutos.repaint();
    }
}
