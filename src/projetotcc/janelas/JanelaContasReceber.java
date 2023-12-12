package projetotcc.janelas;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projetotcc.tabelas.Tblclientes;
import projetotcc.tabelas.Tblcontasrecebe;
import projetotcc.tabelas.Tblvendas;
import projetotcc.util.ContasReceberDAO;

public class JanelaContasReceber extends javax.swing.JFrame {

    List<Tblvendas> vendas;
    List<Tblclientes> clientes;

    public JanelaContasReceber() {
        initComponents();
        Segurança();
        listaNomeClientes();
        desabilitaCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraFerramentasContas = new javax.swing.JToolBar();
        BotaoVoltar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        BotaoNovoConta = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        BotaoSalvarConta = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        BotaoDeletarConta = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        BotaoAlterarConta = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        BotaoLimparConta = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        BotaoCancelarConta = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        BotaoProcurarConta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CampoCodigoConta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CampoDataVencimentoInicio = new com.toedter.calendar.JDateChooser();
        CampoDataVencimentoFinal = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        ComboNomeCliente = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaContas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        CampoTotalVenda = new javax.swing.JTextField();
        BotaoBuscarConta = new javax.swing.JButton();
        BotaoPrimeiroConta = new javax.swing.JButton();
        BotaoAnteriorConta = new javax.swing.JButton();
        BotaoProximoConta = new javax.swing.JButton();
        BotaoUltimoConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venda de Leite - Contas a receber");

        BarraFerramentasContas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BarraFerramentasContas.setFloatable(false);
        BarraFerramentasContas.setRollover(true);
        BarraFerramentasContas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BotaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/voltar.png"))); // NOI18N
        BotaoVoltar.setText("Voltar");
        BotaoVoltar.setToolTipText("Voltar");
        BotaoVoltar.setFocusable(false);
        BotaoVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });
        BarraFerramentasContas.add(BotaoVoltar);
        BarraFerramentasContas.add(jSeparator1);

        BotaoNovoConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/novo.png"))); // NOI18N
        BotaoNovoConta.setText("Novo");
        BotaoNovoConta.setToolTipText("Novo");
        BotaoNovoConta.setFocusable(false);
        BotaoNovoConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoNovoConta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoNovoConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoContaActionPerformed(evt);
            }
        });
        BarraFerramentasContas.add(BotaoNovoConta);
        BarraFerramentasContas.add(jSeparator9);

        BotaoSalvarConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/salvar.png"))); // NOI18N
        BotaoSalvarConta.setText("Salvar");
        BotaoSalvarConta.setToolTipText("Salvar");
        BotaoSalvarConta.setFocusable(false);
        BotaoSalvarConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoSalvarConta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoSalvarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarContaActionPerformed(evt);
            }
        });
        BarraFerramentasContas.add(BotaoSalvarConta);
        BarraFerramentasContas.add(jSeparator11);

        BotaoDeletarConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/dell.png"))); // NOI18N
        BotaoDeletarConta.setText("Deletar");
        BotaoDeletarConta.setToolTipText("Deletar");
        BotaoDeletarConta.setFocusable(false);
        BotaoDeletarConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoDeletarConta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoDeletarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDeletarContaActionPerformed(evt);
            }
        });
        BarraFerramentasContas.add(BotaoDeletarConta);
        BarraFerramentasContas.add(jSeparator12);

        BotaoAlterarConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/alterar.png"))); // NOI18N
        BotaoAlterarConta.setText("Alterar");
        BotaoAlterarConta.setToolTipText("Alterar");
        BotaoAlterarConta.setFocusable(false);
        BotaoAlterarConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoAlterarConta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoAlterarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarContaActionPerformed(evt);
            }
        });
        BarraFerramentasContas.add(BotaoAlterarConta);
        BarraFerramentasContas.add(jSeparator13);

        BotaoLimparConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/limpar.png"))); // NOI18N
        BotaoLimparConta.setText("Limpar");
        BotaoLimparConta.setToolTipText("Limpar");
        BotaoLimparConta.setFocusable(false);
        BotaoLimparConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoLimparConta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoLimparConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparContaActionPerformed(evt);
            }
        });
        BarraFerramentasContas.add(BotaoLimparConta);
        BarraFerramentasContas.add(jSeparator14);

        BotaoCancelarConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/deletar.png"))); // NOI18N
        BotaoCancelarConta.setText("Cancelar");
        BotaoCancelarConta.setToolTipText("Cancelar");
        BotaoCancelarConta.setFocusable(false);
        BotaoCancelarConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoCancelarConta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoCancelarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarContaActionPerformed(evt);
            }
        });
        BarraFerramentasContas.add(BotaoCancelarConta);
        BarraFerramentasContas.add(jSeparator15);

        BotaoProcurarConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/procurar.png"))); // NOI18N
        BotaoProcurarConta.setText("Procurar");
        BotaoProcurarConta.setToolTipText("Procurar");
        BotaoProcurarConta.setFocusable(false);
        BotaoProcurarConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoProcurarConta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoProcurarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProcurarContaActionPerformed(evt);
            }
        });
        BarraFerramentasContas.add(BotaoProcurarConta);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Codigo:");

        CampoCodigoConta.setEditable(false);
        CampoCodigoConta.setFont(new java.awt.Font("Tahoma", 0, 14));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Data Inicial:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("Data Final:");

        CampoDataVencimentoInicio.setFont(new java.awt.Font("Tahoma", 0, 14));

        CampoDataVencimentoFinal.setFont(new java.awt.Font("Tahoma", 0, 14));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("Cliente:");

        ComboNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboNomeCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione..." }));
        ComboNomeCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        TabelaContas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód. Venda", "Nome do Cliente", "Saldo"
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
        TabelaContas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TabelaContas);
        TabelaContas.getColumnModel().getColumn(0).setMinWidth(75);
        TabelaContas.getColumnModel().getColumn(0).setPreferredWidth(75);
        TabelaContas.getColumnModel().getColumn(0).setMaxWidth(75);
        TabelaContas.getColumnModel().getColumn(1).setMinWidth(350);
        TabelaContas.getColumnModel().getColumn(1).setPreferredWidth(350);
        TabelaContas.getColumnModel().getColumn(1).setMaxWidth(350);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel5.setText("Total:");

        CampoTotalVenda.setEditable(false);
        CampoTotalVenda.setFont(new java.awt.Font("Tahoma", 0, 24));
        CampoTotalVenda.setForeground(new java.awt.Color(0, 102, 0));

        BotaoBuscarConta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoBuscarConta.setText("Buscar");
        BotaoBuscarConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoBuscarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscarContaActionPerformed(evt);
            }
        });

        BotaoPrimeiroConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_first.png"))); // NOI18N
        BotaoPrimeiroConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoPrimeiroConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPrimeiroContaActionPerformed(evt);
            }
        });

        BotaoAnteriorConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_previous.png"))); // NOI18N
        BotaoAnteriorConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoAnteriorConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAnteriorContaActionPerformed(evt);
            }
        });

        BotaoProximoConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_next.png"))); // NOI18N
        BotaoProximoConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoProximoConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProximoContaActionPerformed(evt);
            }
        });

        BotaoUltimoConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_last.png"))); // NOI18N
        BotaoUltimoConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoUltimoConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoUltimoContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraFerramentasContas, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CampoCodigoConta, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoDataVencimentoInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(BotaoBuscarConta))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(CampoDataVencimentoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 222, Short.MAX_VALUE))
                            .addComponent(ComboNomeCliente, 0, 274, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(BotaoPrimeiroConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoAnteriorConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoProximoConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoUltimoConta)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BarraFerramentasContas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoCodigoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CampoDataVencimentoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(BotaoBuscarConta))
                    .addComponent(CampoDataVencimentoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotaoPrimeiroConta)
                    .addComponent(BotaoAnteriorConta)
                    .addComponent(BotaoProximoConta)
                    .addComponent(BotaoUltimoConta)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CampoTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoBuscarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscarContaActionPerformed
        ContasReceberDAO crDAO = new ContasReceberDAO();
        Date vencimentoInicio = CampoDataVencimentoInicio.getDate();
        Date vencimentoFinal = CampoDataVencimentoFinal.getDate();
        String cliente = String.valueOf(ComboNomeCliente.getSelectedItem());
        if ((vencimentoInicio == null) && (vencimentoFinal == null) && (cliente.equals("Selecione..."))) {
            vendas = crDAO.listaTodosSaldos();
            TabelaContas();
        } else if ((vencimentoInicio != null) && (vencimentoFinal != null) && (cliente.equals("Selecione..."))) {
            vendas = crDAO.listaVendasData(vencimentoInicio, vencimentoFinal);
            TabelaContas();
        } else {
            vendas = crDAO.listaVendas(vencimentoInicio, vencimentoFinal, cliente);
            TabelaContas();
        }
    }//GEN-LAST:event_BotaoBuscarContaActionPerformed

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void BotaoNovoContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoContaActionPerformed
        BotaoLimparContaActionPerformed(evt);
        CampoCodigoConta.setText("");
        abilitaCampos();
        BotaoCancelarConta.setEnabled(true);
        BotaoSalvarConta.setEnabled(true);
        BotaoLimparConta.setEnabled(true);
        BotaoNovoConta.setEnabled(false);
        BotaoAlterarConta.setEnabled(false);
        BotaoDeletarConta.setEnabled(false);
    }//GEN-LAST:event_BotaoNovoContaActionPerformed

    private void BotaoSalvarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarContaActionPerformed
        ContasReceberDAO crDAO = new ContasReceberDAO();
        Tblcontasrecebe tblcontasrecebe = new Tblcontasrecebe();
        tblcontasrecebe.setDataInicial(CampoDataVencimentoInicio.getDate());
        tblcontasrecebe.setDataFinal(CampoDataVencimentoFinal.getDate());
        tblcontasrecebe.setNomeCli(String.valueOf(ComboNomeCliente.getSelectedItem()));
        String totalVenda;
        totalVenda = CampoTotalVenda.getText().trim();
        totalVenda = totalVenda.replace(",", ".");
        tblcontasrecebe.setValorTotalReceb(Float.valueOf(totalVenda));
        crDAO.salvarConta(tblcontasrecebe);
        JOptionPane.showMessageDialog(null, "Conta Cadastrada!", "Aviso do Sistema", JOptionPane.INFORMATION_MESSAGE);
        preencheTela(tblcontasrecebe);
    }//GEN-LAST:event_BotaoSalvarContaActionPerformed

    private void BotaoDeletarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDeletarContaActionPerformed
        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente deletar esta conta?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            ContasReceberDAO crDAO = new ContasReceberDAO();
            Tblcontasrecebe tblcontasrecebe = new Tblcontasrecebe();
            tblcontasrecebe.setCodConta(Integer.valueOf(CampoCodigoConta.getText().trim()));
            crDAO.deletarConta(tblcontasrecebe);
            JOptionPane.showMessageDialog(null, "Conta Deletada!", "Aviso do Sistema!", JOptionPane.INFORMATION_MESSAGE);
            // Limpa a Tela
            BotaoLimparContaActionPerformed(evt);
        }
    }//GEN-LAST:event_BotaoDeletarContaActionPerformed

    private void BotaoAlterarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarContaActionPerformed
        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar esta conta?", "Confirmar Alteração", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            ContasReceberDAO crDAO = new ContasReceberDAO();
            Tblcontasrecebe tblcontasrecebe = new Tblcontasrecebe();
            tblcontasrecebe.setCodConta(Integer.valueOf(CampoCodigoConta.getText().trim()));
            crDAO.deletarConta(tblcontasrecebe);
            JOptionPane.showMessageDialog(null, "Conta Alterada!", "Aviso do Sistema!", JOptionPane.INFORMATION_MESSAGE);
            preencheTela(tblcontasrecebe);
        }
    }//GEN-LAST:event_BotaoAlterarContaActionPerformed

    private void BotaoLimparContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparContaActionPerformed
        CampoDataVencimentoFinal.setDate(null);
        CampoDataVencimentoInicio.setDate(null);
        CampoTotalVenda.setText("");
        ComboNomeCliente.setSelectedIndex(0);
        DefaultTableModel modelo = (DefaultTableModel) TabelaContas.getModel();
        modelo.setNumRows(0);
        CampoCodigoConta.setText("");
    }//GEN-LAST:event_BotaoLimparContaActionPerformed

    private void BotaoCancelarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarContaActionPerformed
        BotaoLimparContaActionPerformed(evt);
        CampoCodigoConta.setText("");
        Segurança();
        desabilitaCampos();
        BotaoNovoConta.setEnabled(true);
    }//GEN-LAST:event_BotaoCancelarContaActionPerformed

    private void BotaoProcurarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProcurarContaActionPerformed
        ContasReceberDAO crDAO = new ContasReceberDAO();
        Tblcontasrecebe tblcontasrecebe = new Tblcontasrecebe();
        String buscar = JOptionPane.showInputDialog(this, "Digite o código da conta:", "Procurar uma Conta", JOptionPane.QUESTION_MESSAGE);
        int codigo = Integer.valueOf(buscar);
        if (crDAO.existeConta(codigo)) {
            abilitaCampos();
            tblcontasrecebe.setCodConta(0);
            tblcontasrecebe = crDAO.procurarConta(codigo);
            preencheTela(tblcontasrecebe);
            BotaoNovoConta.setEnabled(true);
            BotaoDeletarConta.setEnabled(true);
            BotaoAlterarConta.setEnabled(true);
            BotaoLimparConta.setEnabled(true);
            BotaoCancelarConta.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Não há conta cadastrada com este código!", "Aviso do Sistema!", JOptionPane.ERROR_MESSAGE);
            BotaoProcurarContaActionPerformed(evt);
        }
    }//GEN-LAST:event_BotaoProcurarContaActionPerformed

    private void BotaoPrimeiroContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPrimeiroContaActionPerformed
        ContasReceberDAO crDAO = new ContasReceberDAO();
        int codigo = crDAO.primeiroConta();
        if (crDAO.existeConta(codigo)) {
            Tblcontasrecebe tblanimais = crDAO.procurarConta(codigo);
            abilitaCampos();
            preencheTela(tblanimais);
            BotaoNovoConta.setEnabled(true);
            BotaoDeletarConta.setEnabled(true);
            BotaoAlterarConta.setEnabled(true);
            BotaoLimparConta.setEnabled(true);
            BotaoCancelarConta.setEnabled(true);
        } else {
            // Não faz nada.
        }
    }//GEN-LAST:event_BotaoPrimeiroContaActionPerformed

    private void BotaoAnteriorContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAnteriorContaActionPerformed
        ContasReceberDAO crDAO = new ContasReceberDAO();
        String texto = CampoCodigoConta.getText().trim();
        if (texto.isEmpty()) {
            BotaoPrimeiroContaActionPerformed(evt);
        } else {
            int codigo = Integer.valueOf(texto);
            int primeiro = crDAO.primeiroConta();
            boolean flag = false;
            while (codigo > primeiro && flag == false) {
                codigo--;
                flag = crDAO.existeConta(codigo);
                if (flag) {
                    Tblcontasrecebe tblcontasrecebe = crDAO.procurarConta(codigo);
                    abilitaCampos();
                    preencheTela(tblcontasrecebe);
                    BotaoNovoConta.setEnabled(true);
                    BotaoDeletarConta.setEnabled(true);
                    BotaoAlterarConta.setEnabled(true);
                    BotaoLimparConta.setEnabled(true);
                    BotaoCancelarConta.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_BotaoAnteriorContaActionPerformed

    private void BotaoProximoContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProximoContaActionPerformed
        ContasReceberDAO crDAO = new ContasReceberDAO();
        String texto = CampoCodigoConta.getText().trim();
        if (texto.isEmpty()) {
            BotaoPrimeiroContaActionPerformed(evt);
        } else {
            int codigo = Integer.valueOf(texto);
            int ultimo = crDAO.ultimoConta();
            boolean flag = false;
            while (codigo < ultimo && flag == false) {
                codigo++;
                flag = crDAO.existeConta(codigo);
                if (flag) {
                    Tblcontasrecebe tblcontasrecebe = crDAO.procurarConta(codigo);
                    abilitaCampos();
                    preencheTela(tblcontasrecebe);
                    BotaoNovoConta.setEnabled(true);
                    BotaoDeletarConta.setEnabled(true);
                    BotaoAlterarConta.setEnabled(true);
                    BotaoLimparConta.setEnabled(true);
                    BotaoCancelarConta.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_BotaoProximoContaActionPerformed

    private void BotaoUltimoContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoUltimoContaActionPerformed
        ContasReceberDAO crDAO = new ContasReceberDAO();
        int codigo = crDAO.ultimoConta();
        if (crDAO.existeConta(codigo)) {
            Tblcontasrecebe tblcontasrecebe = crDAO.procurarConta(codigo);
            abilitaCampos();
            preencheTela(tblcontasrecebe);
            BotaoNovoConta.setEnabled(true);
            BotaoDeletarConta.setEnabled(true);
            BotaoAlterarConta.setEnabled(true);
            BotaoLimparConta.setEnabled(true);
            BotaoCancelarConta.setEnabled(true);
        } else {
            // Não faz nada.
        }
    }//GEN-LAST:event_BotaoUltimoContaActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new JanelaContasReceber().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarraFerramentasContas;
    private javax.swing.JButton BotaoAlterarConta;
    private javax.swing.JButton BotaoAnteriorConta;
    private javax.swing.JButton BotaoBuscarConta;
    private javax.swing.JButton BotaoCancelarConta;
    private javax.swing.JButton BotaoDeletarConta;
    private javax.swing.JButton BotaoLimparConta;
    private javax.swing.JButton BotaoNovoConta;
    private javax.swing.JButton BotaoPrimeiroConta;
    private javax.swing.JButton BotaoProcurarConta;
    private javax.swing.JButton BotaoProximoConta;
    private javax.swing.JButton BotaoSalvarConta;
    private javax.swing.JButton BotaoUltimoConta;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JTextField CampoCodigoConta;
    private com.toedter.calendar.JDateChooser CampoDataVencimentoFinal;
    private com.toedter.calendar.JDateChooser CampoDataVencimentoInicio;
    private javax.swing.JTextField CampoTotalVenda;
    private javax.swing.JComboBox ComboNomeCliente;
    private javax.swing.JTable TabelaContas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JToolBar.Separator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator9;
    // End of variables declaration//GEN-END:variables

    private void Segurança() {
        BotaoSalvarConta.setEnabled(false);
        BotaoDeletarConta.setEnabled(false);
        BotaoAlterarConta.setEnabled(false);
        BotaoLimparConta.setEnabled(false);
        BotaoCancelarConta.setEnabled(false);
    }

    private void abilitaCampos() {
        CampoCodigoConta.setEditable(false);
        CampoDataVencimentoFinal.setEnabled(true);
        CampoDataVencimentoInicio.setEnabled(true);
        CampoTotalVenda.setEditable(false);
        ComboNomeCliente.setEnabled(true);
    }

    private void desabilitaCampos() {
        CampoCodigoConta.setEditable(false);
        CampoDataVencimentoFinal.setEnabled(false);
        CampoDataVencimentoInicio.setEnabled(false);
        CampoTotalVenda.setEditable(false);
        ComboNomeCliente.setEnabled(false);
    }

    private void listaNomeClientes() {
        ContasReceberDAO crDAO = new ContasReceberDAO();
        String cliente = CampoCodigoConta.getText().trim();
        clientes = crDAO.listaNomeCliente(cliente);
        for (int i = 0; i < clientes.size(); i++) {
            Tblclientes tblclientes = (Tblclientes) clientes.get(i);
            ComboNomeCliente.addItem(tblclientes.getNomeCli());
        }
        ComboNomeCliente.repaint();
    }

    private void TabelaContas() {
        DefaultTableModel modelo = (DefaultTableModel) TabelaContas.getModel();
        modelo.setNumRows(0);
        float calculasaldo = 0;
        for (int i = 0; i < vendas.size(); i++) {
            Tblvendas tblvendas = (Tblvendas) vendas.get(i);
            DecimalFormat df = new DecimalFormat("0.00##");
            int codigovenda = tblvendas.getCodVenda();
            String nomeCliente = tblvendas.getNomeCli();
            calculasaldo = calculasaldo + tblvendas.getSaldoVenda();
            String saldo = df.format(tblvendas.getSaldoVenda());
            modelo.addRow(new Object[]{codigovenda, nomeCliente, saldo});
            CampoTotalVenda.setText(df.format(calculasaldo));
        }
        TabelaContas.repaint();
    }

    private void preencheTela(Tblcontasrecebe tblcontasrecebe) {
        DecimalFormat df = new DecimalFormat("0.00##");
        CampoCodigoConta.setText(String.valueOf(tblcontasrecebe.getCodConta()));
        ComboNomeCliente.setSelectedItem(tblcontasrecebe.getNomeCli());
        CampoDataVencimentoInicio.setDate(tblcontasrecebe.getDataInicial());
        CampoDataVencimentoFinal.setDate(tblcontasrecebe.getDataFinal());
        CampoTotalVenda.setText(df.format(tblcontasrecebe.getValorTotalReceb()));
        listarContas();
    }

    private void listarContas() {
        ContasReceberDAO crDAO = new ContasReceberDAO();
        Date vencimentoInicio = CampoDataVencimentoInicio.getDate();
        Date vencimentoFinal = CampoDataVencimentoFinal.getDate();
        String cliente = String.valueOf(ComboNomeCliente.getSelectedItem());
        if ((vencimentoInicio == null) && (vencimentoFinal == null) && (cliente.equals("Selecione..."))) {
            vendas = crDAO.listaTodosSaldos();
            TabelaContas();
        } else if ((vencimentoInicio != null) && (vencimentoFinal != null) && (cliente.equals("Selecione..."))) {
            vendas = crDAO.listaVendasData(vencimentoInicio, vencimentoFinal);
            TabelaContas();
        } else {
            vendas = crDAO.listaVendas(vencimentoInicio, vencimentoFinal, cliente);
            TabelaContas();
        }
    }
}