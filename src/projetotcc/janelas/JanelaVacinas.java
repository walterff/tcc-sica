package projetotcc.janelas;

import java.util.List;
import javax.swing.JOptionPane;
import projetotcc.tabelas.Tblvacinas;
import projetotcc.util.VacinasDAO;

public class JanelaVacinas extends javax.swing.JFrame {
    // Listas

    List<Tblvacinas> vacinas;
    // 

    public JanelaVacinas() {
        initComponents();
        Segurança();
        desabilitaCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelTabulado = new javax.swing.JTabbedPane();
        CadastroVacinas = new javax.swing.JPanel();
        BarraFerramentasVacinas = new javax.swing.JToolBar();
        BotaoVoltar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        BotaoNovoVacina = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        BotaoSalvarVacina = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        BotaoDeletarVacina = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        BotaoAlterarVacina = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        BotaoLimparVacina = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        BotaoCancelarVacina = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        BotaoProcurarVacina = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CampoCodigoVacina = new javax.swing.JTextField();
        CampoNomeVacina = new javax.swing.JTextField();
        CampoDescricaoVacina = new javax.swing.JTextField();
        BotaoProximoVacina = new javax.swing.JButton();
        BotaoPrimeiroVacina = new javax.swing.JButton();
        BotaoUltimoVacina = new javax.swing.JButton();
        BotaoAnteriorVacina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Vacinas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PainelTabulado.setPreferredSize(new java.awt.Dimension(1024, 768));

        CadastroVacinas.setToolTipText("Cadastro de Vacinas");

        BarraFerramentasVacinas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BarraFerramentasVacinas.setFloatable(false);
        BarraFerramentasVacinas.setRollover(true);
        BarraFerramentasVacinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BotaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/voltar.png"))); // NOI18N
        BotaoVoltar.setText("Voltar");
        BotaoVoltar.setFocusable(false);
        BotaoVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });
        BarraFerramentasVacinas.add(BotaoVoltar);
        BarraFerramentasVacinas.add(jSeparator1);

        BotaoNovoVacina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/novo.png"))); // NOI18N
        BotaoNovoVacina.setText("Novo");
        BotaoNovoVacina.setToolTipText("Novo");
        BotaoNovoVacina.setFocusable(false);
        BotaoNovoVacina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoNovoVacina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoNovoVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoVacinaActionPerformed(evt);
            }
        });
        BarraFerramentasVacinas.add(BotaoNovoVacina);
        BarraFerramentasVacinas.add(jSeparator9);

        BotaoSalvarVacina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/salvar.png"))); // NOI18N
        BotaoSalvarVacina.setText("Salvar");
        BotaoSalvarVacina.setToolTipText("Salvar");
        BotaoSalvarVacina.setFocusable(false);
        BotaoSalvarVacina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoSalvarVacina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoSalvarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarVacinaActionPerformed(evt);
            }
        });
        BarraFerramentasVacinas.add(BotaoSalvarVacina);
        BarraFerramentasVacinas.add(jSeparator11);

        BotaoDeletarVacina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/dell.png"))); // NOI18N
        BotaoDeletarVacina.setText("Deletar");
        BotaoDeletarVacina.setToolTipText("Deletar");
        BotaoDeletarVacina.setFocusable(false);
        BotaoDeletarVacina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoDeletarVacina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoDeletarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDeletarVacinaActionPerformed(evt);
            }
        });
        BarraFerramentasVacinas.add(BotaoDeletarVacina);
        BarraFerramentasVacinas.add(jSeparator12);

        BotaoAlterarVacina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/alterar.png"))); // NOI18N
        BotaoAlterarVacina.setText("Alterar");
        BotaoAlterarVacina.setToolTipText("Alterar");
        BotaoAlterarVacina.setFocusable(false);
        BotaoAlterarVacina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoAlterarVacina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoAlterarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarVacinaActionPerformed(evt);
            }
        });
        BarraFerramentasVacinas.add(BotaoAlterarVacina);
        BarraFerramentasVacinas.add(jSeparator13);

        BotaoLimparVacina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/limpar.png"))); // NOI18N
        BotaoLimparVacina.setText("Limpar");
        BotaoLimparVacina.setToolTipText("Limpar");
        BotaoLimparVacina.setFocusable(false);
        BotaoLimparVacina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoLimparVacina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoLimparVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparVacinaActionPerformed(evt);
            }
        });
        BarraFerramentasVacinas.add(BotaoLimparVacina);
        BarraFerramentasVacinas.add(jSeparator14);

        BotaoCancelarVacina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/deletar.png"))); // NOI18N
        BotaoCancelarVacina.setText("Cancelar");
        BotaoCancelarVacina.setToolTipText("Cancelar");
        BotaoCancelarVacina.setFocusable(false);
        BotaoCancelarVacina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoCancelarVacina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoCancelarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarVacinaActionPerformed(evt);
            }
        });
        BarraFerramentasVacinas.add(BotaoCancelarVacina);
        BarraFerramentasVacinas.add(jSeparator15);

        BotaoProcurarVacina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/procurar.png"))); // NOI18N
        BotaoProcurarVacina.setText("Procurar");
        BotaoProcurarVacina.setToolTipText("Procurar");
        BotaoProcurarVacina.setFocusable(false);
        BotaoProcurarVacina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoProcurarVacina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoProcurarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProcurarVacinaActionPerformed(evt);
            }
        });
        BarraFerramentasVacinas.add(BotaoProcurarVacina);
        BarraFerramentasVacinas.add(jSeparator10);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Nome da Vacina:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("Descrição da Vacina:");

        CampoCodigoVacina.setFont(new java.awt.Font("Tahoma", 0, 14));

        CampoNomeVacina.setFont(new java.awt.Font("Tahoma", 0, 14));

        CampoDescricaoVacina.setFont(new java.awt.Font("Tahoma", 0, 14));

        BotaoProximoVacina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_next.png"))); // NOI18N
        BotaoProximoVacina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoProximoVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProximoVacinaActionPerformed(evt);
            }
        });

        BotaoPrimeiroVacina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_first.png"))); // NOI18N
        BotaoPrimeiroVacina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoPrimeiroVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPrimeiroVacinaActionPerformed(evt);
            }
        });

        BotaoUltimoVacina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_last.png"))); // NOI18N
        BotaoUltimoVacina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoUltimoVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoUltimoVacinaActionPerformed(evt);
            }
        });

        BotaoAnteriorVacina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_previous.png"))); // NOI18N
        BotaoAnteriorVacina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoAnteriorVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAnteriorVacinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CadastroVacinasLayout = new javax.swing.GroupLayout(CadastroVacinas);
        CadastroVacinas.setLayout(CadastroVacinasLayout);
        CadastroVacinasLayout.setHorizontalGroup(
            CadastroVacinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraFerramentasVacinas, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
            .addGroup(CadastroVacinasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroVacinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CadastroVacinasLayout.createSequentialGroup()
                        .addComponent(BotaoPrimeiroVacina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoAnteriorVacina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoProximoVacina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoUltimoVacina))
                    .addComponent(CampoDescricaoVacina)
                    .addComponent(CampoNomeVacina)
                    .addComponent(CampoCodigoVacina)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(731, Short.MAX_VALUE))
        );
        CadastroVacinasLayout.setVerticalGroup(
            CadastroVacinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroVacinasLayout.createSequentialGroup()
                .addComponent(BarraFerramentasVacinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(CampoCodigoVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(CampoNomeVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(CampoDescricaoVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CadastroVacinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoPrimeiroVacina)
                    .addComponent(BotaoAnteriorVacina)
                    .addComponent(BotaoProximoVacina)
                    .addComponent(BotaoUltimoVacina))
                .addGap(0, 360, Short.MAX_VALUE))
        );

        PainelTabulado.addTab("Cadastro de Vacinas", CadastroVacinas);

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

    private void BotaoNovoVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoVacinaActionPerformed
        BotaoLimparVacinaActionPerformed(evt);
        CampoCodigoVacina.setText("");
        abilitaCampos();
        CampoNomeVacina.requestFocus();
        BotaoSalvarVacina.setEnabled(true);
        BotaoLimparVacina.setEnabled(true);
        BotaoCancelarVacina.setEnabled(true);
        BotaoNovoVacina.setEnabled(false);
        BotaoAlterarVacina.setEnabled(false);
        BotaoDeletarVacina.setEnabled(false);
    }//GEN-LAST:event_BotaoNovoVacinaActionPerformed

    private void BotaoSalvarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarVacinaActionPerformed
        String nome = CampoNomeVacina.getText().trim();
        String descricao = CampoDescricaoVacina.getText().trim();
        if (nome.length() <= 0) {
            JOptionPane.showMessageDialog(this, "Você tem que informar o nome da vacina!", "Aviso do Sistema!", JOptionPane.INFORMATION_MESSAGE);
            CampoNomeVacina.requestFocus();
        } else if (descricao.length() <= 0) {
            JOptionPane.showMessageDialog(this, "Você tem que informar a descrição da vacina!", "Aviso do Sistema!", JOptionPane.INFORMATION_MESSAGE);
            CampoDescricaoVacina.requestFocus();
        } else {
            VacinasDAO vDAO = new VacinasDAO();
            Tblvacinas tblvacinas = new Tblvacinas();
            tblvacinas.setDescricaoVacina(CampoDescricaoVacina.getText().trim());
            tblvacinas.setNomeVacina(CampoNomeVacina.getText().trim());
            vDAO.salvarVacina(tblvacinas);
            JOptionPane.showMessageDialog(null, "Vacina Cadastrada!", "Aviso do Sistema", JOptionPane.INFORMATION_MESSAGE);
            preencheTela(tblvacinas);
        }
    }//GEN-LAST:event_BotaoSalvarVacinaActionPerformed

    private void BotaoDeletarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDeletarVacinaActionPerformed
        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente deletar esta vacina?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            VacinasDAO vDAO = new VacinasDAO();
            Tblvacinas tblvacinas = new Tblvacinas();
            tblvacinas.setCodVacina(Integer.valueOf(CampoCodigoVacina.getText().trim()));
            vDAO.deletarVacina(tblvacinas);
            JOptionPane.showMessageDialog(null, "Vacina Deletada!", "Aviso do Sistema!", JOptionPane.INFORMATION_MESSAGE);
            // Limpa a Tela
            BotaoLimparVacinaActionPerformed(evt);
        }
    }//GEN-LAST:event_BotaoDeletarVacinaActionPerformed

    private void BotaoAlterarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarVacinaActionPerformed
        String nome = CampoNomeVacina.getText().trim();
        String descricao = CampoDescricaoVacina.getText().trim();
        if (nome.length() <= 0) {
            JOptionPane.showMessageDialog(this, "Você tem que informar o nome da vacina!", "Aviso do Sistema!", JOptionPane.INFORMATION_MESSAGE);
            CampoNomeVacina.requestFocus();
        } else if (descricao.length() <= 0) {
            JOptionPane.showMessageDialog(this, "Você tem que informar a descrição da vacina!", "Aviso do Sistema!", JOptionPane.INFORMATION_MESSAGE);
            CampoDescricaoVacina.requestFocus();
        } else {
            int opcao;
            opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar esta vacina?", "Confirmar Alteração", JOptionPane.YES_NO_OPTION);
            if (opcao == JOptionPane.YES_OPTION) {
                VacinasDAO vDAO = new VacinasDAO();
                Tblvacinas tblvacinas = new Tblvacinas();
                tblvacinas.setCodVacina(Integer.valueOf(CampoCodigoVacina.getText().trim()));
                tblvacinas.setDescricaoVacina(CampoDescricaoVacina.getText().trim());
                tblvacinas.setNomeVacina(CampoDescricaoVacina.getText().trim());
                vDAO.alterarVacina(tblvacinas);
                JOptionPane.showMessageDialog(null, "Vacina Alterada!", "Aviso do Sistema!", JOptionPane.INFORMATION_MESSAGE);
                // Atualiza a Tela
                preencheTela(tblvacinas);
            }
        }
    }//GEN-LAST:event_BotaoAlterarVacinaActionPerformed

    private void BotaoLimparVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparVacinaActionPerformed
        CampoDescricaoVacina.setText("");
        CampoNomeVacina.setText("");
        CampoCodigoVacina.setText("");
    }//GEN-LAST:event_BotaoLimparVacinaActionPerformed

    private void BotaoCancelarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarVacinaActionPerformed
        BotaoLimparVacinaActionPerformed(evt);
        CampoCodigoVacina.setText("");
        desabilitaCampos();
        Segurança();
        BotaoNovoVacina.setEnabled(true);
    }//GEN-LAST:event_BotaoCancelarVacinaActionPerformed

    private void BotaoProcurarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProcurarVacinaActionPerformed
        VacinasDAO vDAO = new VacinasDAO();
        Tblvacinas tblvacinas = new Tblvacinas();
        String buscar = JOptionPane.showInputDialog(null, "Digite um código:", "Procurar uma Vacina", JOptionPane.QUESTION_MESSAGE);
        int codigo = Integer.valueOf(buscar);
        if (vDAO.existeVacina(codigo)) {
            abilitaCampos();
            tblvacinas.setCodVacina(0);
            tblvacinas = vDAO.procurarVacina(codigo);
            preencheTela(tblvacinas);
            BotaoNovoVacina.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Não tem vacina cadastrada com este código!", "Aviso do Sistema!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotaoProcurarVacinaActionPerformed

    private void BotaoPrimeiroVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPrimeiroVacinaActionPerformed
        VacinasDAO vDAO = new VacinasDAO();
        int codigo = vDAO.primeiroVacina();
        if (vDAO.existeVacina(codigo)) {
            Tblvacinas tblvacinas = vDAO.procurarVacina(codigo);
            abilitaCampos();
            preencheTela(tblvacinas);
            BotaoNovoVacina.setEnabled(true);
        } else {
            // Não faz nada.
        }
    }//GEN-LAST:event_BotaoPrimeiroVacinaActionPerformed

    private void BotaoAnteriorVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAnteriorVacinaActionPerformed
        VacinasDAO vDAO = new VacinasDAO();
        String texto = CampoCodigoVacina.getText().trim();
        if (texto.isEmpty()) {
            BotaoPrimeiroVacinaActionPerformed(evt);
        } else {
            int codigo = Integer.valueOf(texto);
            int primeiro = vDAO.primeiroVacina();
            boolean flag = false;
            while (codigo > primeiro && flag == false) {
                codigo--;
                flag = vDAO.existeVacina(codigo);
                if (flag) {
                    Tblvacinas tblvacinas = vDAO.procurarVacina(codigo);
                    abilitaCampos();
                    preencheTela(tblvacinas);
                    BotaoNovoVacina.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_BotaoAnteriorVacinaActionPerformed

    private void BotaoProximoVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProximoVacinaActionPerformed
        VacinasDAO vDAO = new VacinasDAO();
        String texto = CampoCodigoVacina.getText().trim();
        if (texto.isEmpty()) {
            BotaoPrimeiroVacinaActionPerformed(evt);
        } else {
            int codigo = Integer.valueOf(texto);
            int ultimo = vDAO.ultimoVacina();
            boolean flag = false;
            while (codigo < ultimo && flag == false) {
                codigo++;
                flag = vDAO.existeVacina(codigo);
                if (flag) {
                    Tblvacinas tblvacinas = vDAO.procurarVacina(codigo);
                    abilitaCampos();
                    preencheTela(tblvacinas);
                    BotaoNovoVacina.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_BotaoProximoVacinaActionPerformed

    private void BotaoUltimoVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoUltimoVacinaActionPerformed
        VacinasDAO vDAO = new VacinasDAO();
        int codigo = vDAO.ultimoVacina();
        if (vDAO.existeVacina(codigo)) {
            Tblvacinas tblvacinas = vDAO.procurarVacina(codigo);
            abilitaCampos();
            preencheTela(tblvacinas);
            BotaoNovoVacina.setEnabled(true);
        } else {
            // Não faz nada.
        }
    }//GEN-LAST:event_BotaoUltimoVacinaActionPerformed

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_BotaoVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaVacinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaVacinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaVacinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaVacinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new JanelaVacinas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarraFerramentasVacinas;
    private javax.swing.JButton BotaoAlterarVacina;
    private javax.swing.JButton BotaoAnteriorVacina;
    private javax.swing.JButton BotaoCancelarVacina;
    private javax.swing.JButton BotaoDeletarVacina;
    private javax.swing.JButton BotaoLimparVacina;
    private javax.swing.JButton BotaoNovoVacina;
    private javax.swing.JButton BotaoPrimeiroVacina;
    private javax.swing.JButton BotaoProcurarVacina;
    private javax.swing.JButton BotaoProximoVacina;
    private javax.swing.JButton BotaoSalvarVacina;
    private javax.swing.JButton BotaoUltimoVacina;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JPanel CadastroVacinas;
    private javax.swing.JTextField CampoCodigoVacina;
    private javax.swing.JTextField CampoDescricaoVacina;
    private javax.swing.JTextField CampoNomeVacina;
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

    private void Segurança() {
        BotaoSalvarVacina.setEnabled(false);
        BotaoDeletarVacina.setEnabled(false);
        BotaoAlterarVacina.setEnabled(false);
        BotaoLimparVacina.setEnabled(false);
        BotaoCancelarVacina.setEnabled(false);
    }

    private void preencheTela(Tblvacinas tblvacinas) {
        CampoCodigoVacina.setText(String.valueOf(tblvacinas.getCodVacina()));
        CampoDescricaoVacina.setText(tblvacinas.getDescricaoVacina());
        CampoNomeVacina.setText(tblvacinas.getNomeVacina());
        BotaoSalvarVacina.setEnabled(false);
        BotaoDeletarVacina.setEnabled(true);
        BotaoAlterarVacina.setEnabled(true);
        BotaoCancelarVacina.setEnabled(true);
        BotaoLimparVacina.setEnabled(true);
    }

    private void abilitaCampos() {
        CampoCodigoVacina.setEditable(false);
        CampoNomeVacina.setEnabled(true);
        CampoDescricaoVacina.setEnabled(true);
    }

    private void desabilitaCampos() {
        CampoCodigoVacina.setEditable(false);
        CampoNomeVacina.setEnabled(false);
        CampoDescricaoVacina.setEnabled(false);
    }
}