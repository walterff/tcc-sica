package projetotcc.janelas;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projetotcc.tabelas.Tblanimais;
import projetotcc.tabelas.Tblitensvacinas;
import projetotcc.tabelas.Tblvacinas;
import projetotcc.util.AnimaisDAO;
import projetotcc.util.ItensVacinasDAO;
import projetotcc.util.VacinasDAO;

public class JanelaAnimais extends javax.swing.JFrame {
    // Listas

    List<Tblanimais> animais;
    List<Tblitensvacinas> itensvacinas;

    public JanelaAnimais() {
        initComponents();
        Segurança();
        desabilitaCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelTabulado = new javax.swing.JTabbedPane();
        CadastroAnimais = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CampoCodigoAnimal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaItensVacinasAnimal = new javax.swing.JTable();
        BarraFerramentasContas = new javax.swing.JToolBar();
        BotaoVoltar = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        BotaoNovoAnimal = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        BotaoSalvarAnimal = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        BotaoDeletarAnimal = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        BotaoAlterarAnimal = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        BotaoLimparAnimal = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        BotaoCancelarAnimal = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        BotaoProcurarAnimal = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jLabel2 = new javax.swing.JLabel();
        CampoNomeAnimal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CampoDescricaoAnimal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ComboTipoAnimal = new javax.swing.JComboBox();
        CampoCodVaciAni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BotaoProcurarVacina = new javax.swing.JButton();
        CampoNomeVaciAni = new javax.swing.JTextField();
        BotaoInserirVacina = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        CampoIdadeAnimal = new javax.swing.JTextField();
        BotaoPrimeiroAnimal = new javax.swing.JButton();
        BotaoAnteriorAnimal = new javax.swing.JButton();
        BotaoProximoAnimal = new javax.swing.JButton();
        BotaoUltimoAnimal = new javax.swing.JButton();
        CampoDataNascAnimal = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        CampoDataProximaVacina = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        CampoDescricaoVacina = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        PainelTabela = new javax.swing.JPanel();
        PainelScrollTabelaAnimais = new javax.swing.JScrollPane();
        TabelaAnimais = new javax.swing.JTable();
        ComboFiltroTipoAnimal = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ComboFiltroIdadeAnimal = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        CampoFiltroNomeAnimal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Animais");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Código do Animal:");

        CampoCodigoAnimal.setFont(new java.awt.Font("Tahoma", 0, 14));

        TabelaItensVacinasAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Item:", "Nome Vacina:", "Ultima aplicação:", "Descrição ultima:", "Próxima aplicação:", "Descrição próxima:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaItensVacinasAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaItensVacinasAnimal.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TabelaItensVacinasAnimal);

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
        BarraFerramentasContas.add(jSeparator7);

        BotaoNovoAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/novo.png"))); // NOI18N
        BotaoNovoAnimal.setText("Novo");
        BotaoNovoAnimal.setToolTipText("Novo");
        BotaoNovoAnimal.setFocusable(false);
        BotaoNovoAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoNovoAnimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoNovoAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoAnimalActionPerformed(evt);
            }
        });
        BarraFerramentasContas.add(BotaoNovoAnimal);
        BarraFerramentasContas.add(jSeparator9);

        BotaoSalvarAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/salvar.png"))); // NOI18N
        BotaoSalvarAnimal.setText("Salvar");
        BotaoSalvarAnimal.setToolTipText("Salvar");
        BotaoSalvarAnimal.setFocusable(false);
        BotaoSalvarAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoSalvarAnimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoSalvarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarAnimalActionPerformed(evt);
            }
        });
        BarraFerramentasContas.add(BotaoSalvarAnimal);
        BarraFerramentasContas.add(jSeparator1);

        BotaoDeletarAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/dell.png"))); // NOI18N
        BotaoDeletarAnimal.setText("Deletar");
        BotaoDeletarAnimal.setToolTipText("Deletar");
        BotaoDeletarAnimal.setFocusable(false);
        BotaoDeletarAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoDeletarAnimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoDeletarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDeletarAnimalActionPerformed(evt);
            }
        });
        BarraFerramentasContas.add(BotaoDeletarAnimal);
        BarraFerramentasContas.add(jSeparator2);

        BotaoAlterarAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/alterar.png"))); // NOI18N
        BotaoAlterarAnimal.setText("Alterar");
        BotaoAlterarAnimal.setToolTipText("Alterar");
        BotaoAlterarAnimal.setFocusable(false);
        BotaoAlterarAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoAlterarAnimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoAlterarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarAnimalActionPerformed(evt);
            }
        });
        BarraFerramentasContas.add(BotaoAlterarAnimal);
        BarraFerramentasContas.add(jSeparator5);

        BotaoLimparAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/limpar.png"))); // NOI18N
        BotaoLimparAnimal.setText("Limpar");
        BotaoLimparAnimal.setToolTipText("Limpar");
        BotaoLimparAnimal.setFocusable(false);
        BotaoLimparAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoLimparAnimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoLimparAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparAnimalActionPerformed(evt);
            }
        });
        BarraFerramentasContas.add(BotaoLimparAnimal);
        BarraFerramentasContas.add(jSeparator3);

        BotaoCancelarAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/deletar.png"))); // NOI18N
        BotaoCancelarAnimal.setText("Cancelar");
        BotaoCancelarAnimal.setToolTipText("Cancelar");
        BotaoCancelarAnimal.setFocusable(false);
        BotaoCancelarAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoCancelarAnimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoCancelarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarAnimalActionPerformed(evt);
            }
        });
        BarraFerramentasContas.add(BotaoCancelarAnimal);
        BarraFerramentasContas.add(jSeparator4);

        BotaoProcurarAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/procurar.png"))); // NOI18N
        BotaoProcurarAnimal.setText("Procurar");
        BotaoProcurarAnimal.setToolTipText("Procurar");
        BotaoProcurarAnimal.setFocusable(false);
        BotaoProcurarAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoProcurarAnimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoProcurarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProcurarAnimalActionPerformed(evt);
            }
        });
        BarraFerramentasContas.add(BotaoProcurarAnimal);
        BarraFerramentasContas.add(jSeparator6);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Nome do Animal:");

        CampoNomeAnimal.setFont(new java.awt.Font("Tahoma", 0, 14));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("Nascimento do Animal:");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("Descrição do Animal:");

        CampoDescricaoAnimal.setFont(new java.awt.Font("Tahoma", 0, 14));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setText("Tipo do Animal:");
        jLabel5.setToolTipText("");

        ComboTipoAnimal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboTipoAnimal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Bezerro", "Novilha", "Boi", "Vaca", "Ave" }));
        ComboTipoAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        CampoCodVaciAni.setFont(new java.awt.Font("Tahoma", 0, 14));
        CampoCodVaciAni.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        CampoCodVaciAni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodVaciAniActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setText("Código da Vacina:");

        BotaoProcurarVacina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoProcurarVacina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/localizar.png"))); // NOI18N
        BotaoProcurarVacina.setText("Procurar");
        BotaoProcurarVacina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoProcurarVacina.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotaoProcurarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProcurarVacinaActionPerformed(evt);
            }
        });

        CampoNomeVaciAni.setFont(new java.awt.Font("Tahoma", 0, 14));

        BotaoInserirVacina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoInserirVacina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/inserir.png"))); // NOI18N
        BotaoInserirVacina.setText("Inserir");
        BotaoInserirVacina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoInserirVacina.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotaoInserirVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoInserirVacinaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setText("Idade:");

        CampoIdadeAnimal.setFont(new java.awt.Font("Tahoma", 0, 14));
        CampoIdadeAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIdadeAnimalActionPerformed(evt);
            }
        });
        CampoIdadeAnimal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CampoIdadeAnimalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoIdadeAnimalFocusLost(evt);
            }
        });

        BotaoPrimeiroAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_first.png"))); // NOI18N
        BotaoPrimeiroAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoPrimeiroAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPrimeiroAnimalActionPerformed(evt);
            }
        });

        BotaoAnteriorAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_previous.png"))); // NOI18N
        BotaoAnteriorAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoAnteriorAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAnteriorAnimalActionPerformed(evt);
            }
        });

        BotaoProximoAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_next.png"))); // NOI18N
        BotaoProximoAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoProximoAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProximoAnimalActionPerformed(evt);
            }
        });

        BotaoUltimoAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_last.png"))); // NOI18N
        BotaoUltimoAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoUltimoAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoUltimoAnimalActionPerformed(evt);
            }
        });

        CampoDataNascAnimal.setNextFocusableComponent(CampoIdadeAnimal);
        CampoDataNascAnimal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoDataNascAnimalFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel8.setText("Nome da Vacina:");

        CampoDataProximaVacina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CampoDataProximaVacina.setFont(new java.awt.Font("Tahoma", 0, 14));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel11.setText("Próxima:");

        CampoDescricaoVacina.setFont(new java.awt.Font("Tahoma", 0, 14));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel12.setText("Descrição:");

        javax.swing.GroupLayout CadastroAnimaisLayout = new javax.swing.GroupLayout(CadastroAnimais);
        CadastroAnimais.setLayout(CadastroAnimaisLayout);
        CadastroAnimaisLayout.setHorizontalGroup(
            CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraFerramentasContas, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
            .addGroup(CadastroAnimaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
                    .addGroup(CadastroAnimaisLayout.createSequentialGroup()
                        .addGroup(CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastroAnimaisLayout.createSequentialGroup()
                                .addGroup(CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CampoCodVaciAni, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoProcurarVacina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CampoNomeVaciAni, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(CadastroAnimaisLayout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CadastroAnimaisLayout.createSequentialGroup()
                                        .addComponent(CampoDataProximaVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoDescricaoVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoInserirVacina))
                            .addGroup(CadastroAnimaisLayout.createSequentialGroup()
                                .addGroup(CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CadastroAnimaisLayout.createSequentialGroup()
                                        .addComponent(BotaoPrimeiroAnimal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotaoAnteriorAnimal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotaoProximoAnimal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotaoUltimoAnimal))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CadastroAnimaisLayout.createSequentialGroup()
                                        .addGroup(CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CampoCodigoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addGap(18, 18, 18)
                                        .addGroup(CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CampoNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CadastroAnimaisLayout.createSequentialGroup()
                                        .addGroup(CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CampoDescricaoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(CampoDataNascAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoIdadeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(ComboTipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addGap(0, 236, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CadastroAnimaisLayout.setVerticalGroup(
            CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroAnimaisLayout.createSequentialGroup()
                .addComponent(BarraFerramentasContas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoCodigoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboTipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CadastroAnimaisLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(CampoDescricaoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CadastroAnimaisLayout.createSequentialGroup()
                        .addGroup(CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoIdadeAnimal)
                            .addComponent(CampoDataNascAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoPrimeiroAnimal)
                    .addComponent(BotaoAnteriorAnimal)
                    .addComponent(BotaoProximoAnimal)
                    .addComponent(BotaoUltimoAnimal))
                .addGap(18, 18, 18)
                .addGroup(CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CadastroAnimaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CampoCodVaciAni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotaoProcurarVacina)
                        .addComponent(CampoNomeVaciAni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotaoInserirVacina)
                        .addComponent(CampoDescricaoVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CampoDataProximaVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        PainelTabulado.addTab("Cadastro de Animais", CadastroAnimais);

        PainelTabela.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                PainelTabelaComponentShown(evt);
            }
        });

        TabelaAnimais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TabelaAnimais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do Animal", "Nome do Animal", "Nascimento do Animal", "Idade", "Descrição do Animal", "Tipo do Animal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaAnimais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TabelaAnimais.getTableHeader().setReorderingAllowed(false);
        TabelaAnimais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaAnimaisMouseClicked(evt);
            }
        });
        PainelScrollTabelaAnimais.setViewportView(TabelaAnimais);

        ComboFiltroTipoAnimal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboFiltroTipoAnimal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Bezerro", "Novilha", "Boi", "Vaca", "Ave" }));
        ComboFiltroTipoAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComboFiltroTipoAnimal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboFiltroTipoAnimalItemStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setText("Nome do Animal:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel10.setText("Tipo do Animal:");

        ComboFiltroIdadeAnimal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboFiltroIdadeAnimal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Até 10 anos.", "Até 20 anos.", "Até 30 anos.", "Até 40 anos.", "Até 50 anos.", "Até 60 anos.", "Até 70 anos.", "Até 80 anos.", "Até 90 anos.", "Até 100 anos." }));
        ComboFiltroIdadeAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComboFiltroIdadeAnimal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboFiltroIdadeAnimalItemStateChanged(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel13.setText("Idade:");

        CampoFiltroNomeAnimal.setFont(new java.awt.Font("Tahoma", 0, 14));
        CampoFiltroNomeAnimal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoFiltroNomeAnimalKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout PainelTabelaLayout = new javax.swing.GroupLayout(PainelTabela);
        PainelTabela.setLayout(PainelTabelaLayout);
        PainelTabelaLayout.setHorizontalGroup(
            PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelScrollTabelaAnimais, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
                    .addGroup(PainelTabelaLayout.createSequentialGroup()
                        .addGroup(PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoFiltroNomeAnimal)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboFiltroTipoAnimal, 0, 200, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboFiltroIdadeAnimal, 0, 200, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 379, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PainelTabelaLayout.setVerticalGroup(
            PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboFiltroTipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboFiltroIdadeAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoFiltroNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(PainelScrollTabelaAnimais, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                .addGap(62, 62, 62))
        );

        PainelTabulado.addTab("Tabela de Animais", PainelTabela);

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

    private void BotaoNovoAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoAnimalActionPerformed
        BotaoCancelarAnimalActionPerformed(evt);
        CampoCodigoAnimal.setText("");
        abilitaCampos();
        CampoNomeAnimal.requestFocus();
        BotaoSalvarAnimal.setEnabled(true);
        BotaoLimparAnimal.setEnabled(true);
        BotaoCancelarAnimal.setEnabled(true);
        BotaoNovoAnimal.setEnabled(false);
        CampoCodVaciAni.setEnabled(false);
        BotaoProcurarVacina.setEnabled(false);
        CampoNomeVaciAni.setEnabled(false);
        CampoDataProximaVacina.setEnabled(false);
        CampoDescricaoVacina.setEnabled(false);
        BotaoInserirVacina.setEnabled(false);
    }//GEN-LAST:event_BotaoNovoAnimalActionPerformed

    private void BotaoSalvarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarAnimalActionPerformed
        String nome = CampoNomeAnimal.getText().trim();
        int tipo = ComboTipoAnimal.getSelectedIndex();
        Date datanasc = CampoDataNascAnimal.getDate();
        if (nome.length() <= 0) {
            JOptionPane.showMessageDialog(this, "Informe o nome do animal!", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
            CampoNomeAnimal.requestFocus();
        } else if (tipo == 0) {
            JOptionPane.showMessageDialog(this, "Informe o tipo do animal!", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
            ComboTipoAnimal.requestFocus();
        } else if (datanasc == null) {
            JOptionPane.showMessageDialog(this, "Informe a data de nascimento do animal!", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
            CampoDataNascAnimal.requestFocus();
        } else {
            AnimaisDAO aDAO = new AnimaisDAO();
            Tblanimais tblanimais = new Tblanimais();
            tblanimais.setDescricaoAni(CampoDescricaoAnimal.getText().trim());
            tblanimais.setDataNasc(CampoDataNascAnimal.getDate());
            tblanimais.setNomeAni(CampoNomeAnimal.getText().trim());
            tblanimais.setTipoAni(String.valueOf(ComboTipoAnimal.getSelectedItem()));
            tblanimais.setIdadeAni(Integer.valueOf(CampoIdadeAnimal.getText().trim()));
            aDAO.salvarAnimal(tblanimais);
            JOptionPane.showMessageDialog(null, "Animal Cadastrado!", "Aviso do Sistema", JOptionPane.INFORMATION_MESSAGE);
            preencheTela(tblanimais);
            BotaoNovoAnimal.setEnabled(true);
            CampoCodVaciAni.setEnabled(true);
            BotaoProcurarVacina.setEnabled(true);
            CampoNomeVaciAni.setEnabled(true);
            CampoDataProximaVacina.setEnabled(true);
            CampoDescricaoVacina.setEnabled(true);
            BotaoInserirVacina.setEnabled(true);
        }
    }//GEN-LAST:event_BotaoSalvarAnimalActionPerformed

    private void BotaoDeletarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDeletarAnimalActionPerformed
        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente deletar este animal?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            AnimaisDAO aDAO = new AnimaisDAO();
            Tblanimais tblanimais = new Tblanimais();
            tblanimais.setCodAni(Integer.valueOf(CampoCodigoAnimal.getText().trim()));
            aDAO.deletarAnimal(tblanimais);
            JOptionPane.showMessageDialog(null, "Animal Deletado!", "Aviso do Sistema!", JOptionPane.INFORMATION_MESSAGE);
            // Limpa a Tela
            BotaoLimparAnimalActionPerformed(evt);
        }
    }//GEN-LAST:event_BotaoDeletarAnimalActionPerformed

    private void BotaoAlterarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarAnimalActionPerformed
        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar este animal?", "Confirmar Alteração", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            String codigo = CampoCodigoAnimal.getText().trim();
            String nome = CampoNomeAnimal.getText().trim();
            int tipo = ComboTipoAnimal.getSelectedIndex();
            Date datanasc = CampoDataNascAnimal.getDate();
            if (codigo.length() <= 0) {
                JOptionPane.showMessageDialog(this, "Informe o código do animal!", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
                CampoCodigoAnimal.requestFocus();
            } else if (nome.length() <= 0) {
                JOptionPane.showMessageDialog(this, "Informe o nome do animal!", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
                CampoNomeAnimal.requestFocus();
            } else if (tipo == 0) {
                JOptionPane.showMessageDialog(this, "Informe o tipo do animal!", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
                ComboTipoAnimal.requestFocus();
            } else if (datanasc == null) {
                JOptionPane.showMessageDialog(this, "Informe a data de nascimento do animal!", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
                CampoDataNascAnimal.requestFocus();
            } else {
                AnimaisDAO aDAO = new AnimaisDAO();
                Tblanimais tblanimais = new Tblanimais();
                tblanimais.setCodAni(Integer.valueOf(CampoCodigoAnimal.getText().trim()));
                tblanimais.setDescricaoAni(CampoDescricaoAnimal.getText().trim());
                tblanimais.setDataNasc(CampoDataNascAnimal.getDate());
                tblanimais.setNomeAni(CampoNomeAnimal.getText().trim());
                tblanimais.setTipoAni(String.valueOf(ComboTipoAnimal.getSelectedItem()));
                tblanimais.setIdadeAni(Integer.valueOf(CampoIdadeAnimal.getText().trim()));
                aDAO.alterarAnimal(tblanimais);
                JOptionPane.showMessageDialog(null, "Animal Alterado!", "Aviso do Sistema!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_BotaoAlterarAnimalActionPerformed

    private void BotaoLimparAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparAnimalActionPerformed
        BotaoNovoAnimal.requestFocus();
        CampoDataNascAnimal.setDate(null);
        CampoDataProximaVacina.setDate(null);
        CampoCodVaciAni.setText("");
        CampoDescricaoAnimal.setText("");
        CampoIdadeAnimal.setText("");
        CampoNomeAnimal.setText("");
        CampoNomeVaciAni.setText("");
        ComboTipoAnimal.setSelectedIndex(0);
        DefaultTableModel modelo = (DefaultTableModel) TabelaItensVacinasAnimal.getModel();
        modelo.setNumRows(0);
        CampoCodigoAnimal.setText("");
    }//GEN-LAST:event_BotaoLimparAnimalActionPerformed

    private void BotaoCancelarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarAnimalActionPerformed
        BotaoLimparAnimalActionPerformed(evt);
        CampoCodigoAnimal.setText("");
        Segurança();
        desabilitaCampos();
        BotaoNovoAnimal.setEnabled(true);
    }//GEN-LAST:event_BotaoCancelarAnimalActionPerformed

    private void BotaoProcurarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProcurarAnimalActionPerformed
        AnimaisDAO aDAO = new AnimaisDAO();
        Tblanimais tblanimais = new Tblanimais();
        String buscar = JOptionPane.showInputDialog(this, "Digite o código do animal:", "Procurar um Animal", JOptionPane.QUESTION_MESSAGE);
        int codigo = Integer.valueOf(buscar);
        if (aDAO.existeAnimal(codigo)) {
            abilitaCampos();
            tblanimais.setCodAni(0);
            tblanimais = aDAO.procurarAnimal(codigo);
            preencheTela(tblanimais);
            BotaoNovoAnimal.setEnabled(true);
            listarVacinasAnimal();
        } else {
            JOptionPane.showMessageDialog(this, "Não há animal cadastrado com este código!", "Aviso do Sistema!", JOptionPane.ERROR_MESSAGE);
            BotaoProcurarAnimalActionPerformed(evt);
        }
    }//GEN-LAST:event_BotaoProcurarAnimalActionPerformed

    private void BotaoPrimeiroAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPrimeiroAnimalActionPerformed
        AnimaisDAO aDAO = new AnimaisDAO();
        int codigo = aDAO.primeiroAnimal();
        if (aDAO.existeAnimal(codigo)) {
            Tblanimais tblanimais = aDAO.procurarAnimal(codigo);
            abilitaCampos();
            preencheTela(tblanimais);
            BotaoNovoAnimal.setEnabled(true);
            listarVacinasAnimal();
        } else {
            // Não faz nada.
        }
    }//GEN-LAST:event_BotaoPrimeiroAnimalActionPerformed

    private void BotaoAnteriorAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAnteriorAnimalActionPerformed
        AnimaisDAO aDAO = new AnimaisDAO();
        String texto = CampoCodigoAnimal.getText().trim();
        if (texto.isEmpty()) {
            BotaoPrimeiroAnimalActionPerformed(evt);
        } else {
            int codigo = Integer.valueOf(texto);
            int primeiro = aDAO.primeiroAnimal();
            boolean flag = false;
            while (codigo > primeiro && flag == false) {
                codigo--;
                flag = aDAO.existeAnimal(codigo);
                if (flag) {
                    Tblanimais tblanimais = aDAO.procurarAnimal(codigo);
                    abilitaCampos();
                    preencheTela(tblanimais);
                    BotaoNovoAnimal.setEnabled(true);
                    listarVacinasAnimal();
                }
            }
        }
    }//GEN-LAST:event_BotaoAnteriorAnimalActionPerformed

    private void BotaoProximoAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProximoAnimalActionPerformed
        AnimaisDAO aDAO = new AnimaisDAO();
        String texto = CampoCodigoAnimal.getText().trim();
        if (texto.isEmpty()) {
            BotaoPrimeiroAnimalActionPerformed(evt);
        } else {
            int codigo = Integer.valueOf(texto);
            int ultimo = aDAO.ultimoAnimal();
            boolean flag = false;
            while (codigo < ultimo && flag == false) {
                codigo++;
                flag = aDAO.existeAnimal(codigo);
                if (flag) {
                    Tblanimais tblanimais = aDAO.procurarAnimal(codigo);
                    abilitaCampos();
                    preencheTela(tblanimais);
                    BotaoNovoAnimal.setEnabled(true);
                    listarVacinasAnimal();
                }
            }
        }
    }//GEN-LAST:event_BotaoProximoAnimalActionPerformed

    private void BotaoUltimoAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoUltimoAnimalActionPerformed
        AnimaisDAO aDAO = new AnimaisDAO();
        int codigo = aDAO.ultimoAnimal();
        if (aDAO.existeAnimal(codigo)) {
            Tblanimais tblanimais = aDAO.procurarAnimal(codigo);
            abilitaCampos();
            preencheTela(tblanimais);
            BotaoNovoAnimal.setEnabled(true);
            listarVacinasAnimal();
        } else {
            // Não faz nada.
        }
    }//GEN-LAST:event_BotaoUltimoAnimalActionPerformed

    private void PainelTabelaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_PainelTabelaComponentShown
        AnimaisDAO aDAO = new AnimaisDAO();
        ComboFiltroIdadeAnimal.setSelectedIndex(0);
        CampoFiltroNomeAnimal.setText("");
        ComboFiltroTipoAnimal.setSelectedIndex(0);
        animais = aDAO.listarAnimais();
        TabelaAnimais();
    }//GEN-LAST:event_PainelTabelaComponentShown

    private void BotaoProcurarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProcurarVacinaActionPerformed
        VacinasDAO vDAO = new VacinasDAO();
        Tblvacinas tblvacinas = new Tblvacinas();
        int codigo = Integer.valueOf(CampoCodVaciAni.getText().trim());
        tblvacinas.setCodVacina(0);
        tblvacinas = vDAO.procurarVacina(codigo);
        if (vDAO.existeVacina(codigo)) {
            CampoNomeVaciAni.setText(tblvacinas.getNomeVacina());
            CampoDescricaoVacina.setText(tblvacinas.getDescricaoVacina());
            BotaoSalvarAnimal.setEnabled(false);
            BotaoDeletarAnimal.setEnabled(true);
            BotaoAlterarAnimal.setEnabled(true);
            BotaoCancelarAnimal.setEnabled(true);
        } else {
            // Não faz nada.
        }
    }//GEN-LAST:event_BotaoProcurarVacinaActionPerformed

    private void BotaoInserirVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoInserirVacinaActionPerformed
        String nomevacina = CampoNomeVaciAni.getText().trim();
        Date proxima = CampoDataProximaVacina.getDate();
        String descricao = CampoDescricaoVacina.getText().trim();
        if (nomevacina.length() <= 0) {
            JOptionPane.showMessageDialog(this, "Informe o nome da vacina!", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
            CampoNomeVaciAni.requestFocus();
        } else if (proxima == null) {
            JOptionPane.showMessageDialog(this, "Informe o data da próxima vacina!", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
            CampoDataProximaVacina.requestFocus();
        } else if (descricao.length() <= 0) {
            JOptionPane.showMessageDialog(this, "Informe a descrição da vacina!", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
            CampoDescricaoVacina.requestFocus();
        } else {
            ItensVacinasDAO ivDAO = new ItensVacinasDAO();
            Tblitensvacinas tblitensvacinas = new Tblitensvacinas();
            Date hoje = new Date();
            tblitensvacinas.setTblAnimaisCodAni(Integer.valueOf(CampoCodigoAnimal.getText().trim()));
            tblitensvacinas.setTblVacinasCodVacina(Integer.valueOf(CampoCodVaciAni.getText().trim()));
            tblitensvacinas.setNomeItemVacina(CampoNomeVaciAni.getText());
            tblitensvacinas.setDataAplic(hoje);
            tblitensvacinas.setDescrUltVacina(CampoDescricaoVacina.getText().trim());
            tblitensvacinas.setDataProxAplic(CampoDataProximaVacina.getDate());
            tblitensvacinas.setDescrProxVacina(CampoDescricaoVacina.getText().trim());
            ivDAO.salvarItenVacina(tblitensvacinas);
            CampoCodVaciAni.setText("");
            CampoNomeVaciAni.setText("");
            CampoDataProximaVacina.setDate(null);
            CampoDescricaoVacina.setText("");
            //
            listarVacinasAnimal();
        }
    }//GEN-LAST:event_BotaoInserirVacinaActionPerformed

    private void TabelaAnimaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaAnimaisMouseClicked
        int index = TabelaAnimais.getSelectedRow();
        Tblanimais tblanimais = (Tblanimais) animais.get(index);
        abilitaCampos();
        preencheTela(tblanimais);
        PainelTabulado.setSelectedIndex(0);
        listarVacinasAnimal();
    }//GEN-LAST:event_TabelaAnimaisMouseClicked

    private void CampoCodVaciAniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodVaciAniActionPerformed
        BotaoProcurarVacinaActionPerformed(evt);
    }//GEN-LAST:event_CampoCodVaciAniActionPerformed

    private void ComboFiltroTipoAnimalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboFiltroTipoAnimalItemStateChanged
        AnimaisDAO aDAO = new AnimaisDAO();
        String filtro = String.valueOf(ComboFiltroTipoAnimal.getSelectedItem());
        animais = aDAO.listaTipoAnimais(filtro);
        CampoFiltroNomeAnimal.setText("");
        ComboFiltroIdadeAnimal.setSelectedIndex(0);
        TabelaAnimais();
    }//GEN-LAST:event_ComboFiltroTipoAnimalItemStateChanged

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void ComboFiltroIdadeAnimalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboFiltroIdadeAnimalItemStateChanged
        AnimaisDAO aDAO = new AnimaisDAO();
        int idade = ComboFiltroIdadeAnimal.getSelectedIndex();
        if (idade == 1) {
            String filtro = "10";
            animais = aDAO.listaIdadeAnimais(filtro);
            CampoFiltroNomeAnimal.setText("");
            ComboFiltroTipoAnimal.setSelectedIndex(0);
            TabelaAnimais();
        }
        if (idade == 2) {
            String filtro = "20";
            animais = aDAO.listaIdadeAnimais(filtro);
            CampoFiltroNomeAnimal.setText("");
            ComboFiltroTipoAnimal.setSelectedIndex(0);
            TabelaAnimais();
        }
        if (idade == 3) {
            String filtro = "30";
            animais = aDAO.listaIdadeAnimais(filtro);
            CampoFiltroNomeAnimal.setText("");
            ComboFiltroTipoAnimal.setSelectedIndex(0);
            TabelaAnimais();
        }
        if (idade == 4) {
            String filtro = "40";
            animais = aDAO.listaIdadeAnimais(filtro);
            CampoFiltroNomeAnimal.setText("");
            ComboFiltroTipoAnimal.setSelectedIndex(0);
            TabelaAnimais();
        }
        if (idade == 5) {
            String filtro = "50";
            animais = aDAO.listaIdadeAnimais(filtro);
            CampoFiltroNomeAnimal.setText("");
            ComboFiltroTipoAnimal.setSelectedIndex(0);
            TabelaAnimais();
        }
        if (idade == 6) {
            String filtro = "60";
            animais = aDAO.listaIdadeAnimais(filtro);
            CampoFiltroNomeAnimal.setText("");
            ComboFiltroTipoAnimal.setSelectedIndex(0);
            TabelaAnimais();
        }
        if (idade == 7) {
            String filtro = "70";
            animais = aDAO.listaIdadeAnimais(filtro);
            CampoFiltroNomeAnimal.setText("");
            ComboFiltroTipoAnimal.setSelectedIndex(0);
            TabelaAnimais();
        }
        if (idade == 8) {
            String filtro = "80";
            animais = aDAO.listaIdadeAnimais(filtro);
            CampoFiltroNomeAnimal.setText("");
            ComboFiltroTipoAnimal.setSelectedIndex(0);
            TabelaAnimais();
        }
        if (idade == 9) {
            String filtro = "90";
            animais = aDAO.listaIdadeAnimais(filtro);
            CampoFiltroNomeAnimal.setText("");
            ComboFiltroTipoAnimal.setSelectedIndex(0);
            TabelaAnimais();
        }
        if (idade == 10) {
            String filtro = "100";
            animais = aDAO.listaIdadeAnimais(filtro);
            CampoFiltroNomeAnimal.setText("");
            ComboFiltroTipoAnimal.setSelectedIndex(0);
            TabelaAnimais();
        }
    }//GEN-LAST:event_ComboFiltroIdadeAnimalItemStateChanged

    private void CampoFiltroNomeAnimalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoFiltroNomeAnimalKeyTyped
        AnimaisDAO aDAO = new AnimaisDAO();
        String nome = CampoFiltroNomeAnimal.getText().trim();
        animais = aDAO.listaNomeAnimais(nome);
        ComboFiltroTipoAnimal.setSelectedIndex(0);
        ComboFiltroIdadeAnimal.setSelectedIndex(0);
        TabelaAnimais();
    }//GEN-LAST:event_CampoFiltroNomeAnimalKeyTyped

    private void CampoDataNascAnimalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoDataNascAnimalFocusLost
        Date hoje = new Date();
        Date dataNascimento = CampoDataNascAnimal.getDate();
        Date dataAtual = hoje;
        long calculaIdade = dataAtual.getTime() - dataNascimento.getTime();
        int tempoDia = 1000 * 60 * 60 * 24;
        long calculaDias = (calculaIdade / tempoDia);
        int calculo = (int) (calculaDias / 365);
        CampoIdadeAnimal.setText("" + calculo);
    }//GEN-LAST:event_CampoDataNascAnimalFocusLost

    private void CampoIdadeAnimalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoIdadeAnimalFocusGained
        Date hoje = new Date();
        Date dataNascimento = CampoDataNascAnimal.getDate();
        Date dataAtual = hoje;
        long calculaIdade = dataAtual.getTime() - dataNascimento.getTime();
        int tempoDia = 1000 * 60 * 60 * 24;
        long calculaDias = (calculaIdade / tempoDia);
        int calculo = (int) (calculaDias / 365);
        CampoIdadeAnimal.setText("" + calculo);
    }//GEN-LAST:event_CampoIdadeAnimalFocusGained

    private void CampoIdadeAnimalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoIdadeAnimalFocusLost
        Date hoje = new Date();
        Date dataNascimento = CampoDataNascAnimal.getDate();
        Date dataAtual = hoje;
        long calculaIdade = dataAtual.getTime() - dataNascimento.getTime();
        int tempoDia = 1000 * 60 * 60 * 24;
        long calculaDias = (calculaIdade / tempoDia);
        int calculo = (int) (calculaDias / 365);
        CampoIdadeAnimal.setText("" + calculo);
    }//GEN-LAST:event_CampoIdadeAnimalFocusLost

    private void CampoIdadeAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIdadeAnimalActionPerformed
        Date hoje = new Date();
        Date dataNascimento = CampoDataNascAnimal.getDate();
        Date dataAtual = hoje;
        long calculaIdade = dataAtual.getTime() - dataNascimento.getTime();
        int tempoDia = 1000 * 60 * 60 * 24;
        long calculaDias = (calculaIdade / tempoDia);
        int calculo = (int) (calculaDias / 365);
        CampoIdadeAnimal.setText("" + calculo);
    }//GEN-LAST:event_CampoIdadeAnimalActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new JanelaAnimais().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarraFerramentasContas;
    private javax.swing.JButton BotaoAlterarAnimal;
    private javax.swing.JButton BotaoAnteriorAnimal;
    private javax.swing.JButton BotaoCancelarAnimal;
    private javax.swing.JButton BotaoDeletarAnimal;
    private javax.swing.JButton BotaoInserirVacina;
    private javax.swing.JButton BotaoLimparAnimal;
    private javax.swing.JButton BotaoNovoAnimal;
    private javax.swing.JButton BotaoPrimeiroAnimal;
    private javax.swing.JButton BotaoProcurarAnimal;
    private javax.swing.JButton BotaoProcurarVacina;
    private javax.swing.JButton BotaoProximoAnimal;
    private javax.swing.JButton BotaoSalvarAnimal;
    private javax.swing.JButton BotaoUltimoAnimal;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JPanel CadastroAnimais;
    private javax.swing.JTextField CampoCodVaciAni;
    private javax.swing.JTextField CampoCodigoAnimal;
    private com.toedter.calendar.JDateChooser CampoDataNascAnimal;
    private com.toedter.calendar.JDateChooser CampoDataProximaVacina;
    private javax.swing.JTextField CampoDescricaoAnimal;
    private javax.swing.JTextField CampoDescricaoVacina;
    private javax.swing.JTextField CampoFiltroNomeAnimal;
    private javax.swing.JTextField CampoIdadeAnimal;
    private javax.swing.JTextField CampoNomeAnimal;
    private javax.swing.JTextField CampoNomeVaciAni;
    private javax.swing.JComboBox ComboFiltroIdadeAnimal;
    private javax.swing.JComboBox ComboFiltroTipoAnimal;
    private javax.swing.JComboBox ComboTipoAnimal;
    private javax.swing.JScrollPane PainelScrollTabelaAnimais;
    private javax.swing.JPanel PainelTabela;
    private javax.swing.JTabbedPane PainelTabulado;
    private javax.swing.JTable TabelaAnimais;
    private javax.swing.JTable TabelaItensVacinasAnimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator9;
    // End of variables declaration//GEN-END:variables

    private void Segurança() {
        BotaoSalvarAnimal.setEnabled(false);
        BotaoDeletarAnimal.setEnabled(false);
        BotaoAlterarAnimal.setEnabled(false);
        BotaoLimparAnimal.setEnabled(false);
        BotaoCancelarAnimal.setEnabled(false);
    }

    private void desabilitaCampos() {
        CampoDescricaoVacina.setEnabled(false);
        CampoDataProximaVacina.setEnabled(false);
        CampoDataNascAnimal.setEnabled(false);
        CampoCodVaciAni.setEnabled(false);
        CampoCodigoAnimal.setEditable(false);
        CampoDescricaoAnimal.setEnabled(false);
        CampoIdadeAnimal.setEnabled(false);
        CampoNomeAnimal.setEnabled(false);
        CampoNomeVaciAni.setEnabled(false);
        ComboTipoAnimal.setEnabled(false);
        CampoCodVaciAni.setEnabled(false);
        CampoNomeVaciAni.setEnabled(false);
        BotaoProcurarVacina.setEnabled(false);
        BotaoInserirVacina.setEnabled(false);
    }

    private void abilitaCampos() {
        CampoDescricaoVacina.setEnabled(true);
        CampoDataProximaVacina.setEnabled(true);
        CampoDataNascAnimal.setEnabled(true);
        CampoCodVaciAni.setEnabled(true);
        CampoCodigoAnimal.setEditable(false);
        CampoDescricaoAnimal.setEnabled(true);
        CampoIdadeAnimal.setEnabled(true);
        CampoNomeAnimal.setEnabled(true);
        CampoNomeVaciAni.setEnabled(true);
        ComboTipoAnimal.setEnabled(true);
        CampoNomeVaciAni.setEnabled(true);
        BotaoProcurarVacina.setEnabled(true);
        BotaoInserirVacina.setEnabled(true);
    }

    private void preencheTela(Tblanimais tblanimais) {
        CampoCodigoAnimal.setText(String.valueOf(tblanimais.getCodAni()));
        CampoDataNascAnimal.setDate(tblanimais.getDataNasc());
        CampoDescricaoAnimal.setText(tblanimais.getDescricaoAni());
        CampoIdadeAnimal.setText(String.valueOf(tblanimais.getIdadeAni()));
        CampoNomeAnimal.setText(tblanimais.getNomeAni());
        String tipo = tblanimais.getTipoAni();
        if (tipo.equals("Bezerro")) {
            ComboTipoAnimal.setSelectedIndex(1);
        }
        if (tipo.equals("Novilha")) {
            ComboTipoAnimal.setSelectedIndex(2);
        }
        if (tipo.equals("Boi")) {
            ComboTipoAnimal.setSelectedIndex(3);
        }
        if (tipo.equals("Vaca")) {
            ComboTipoAnimal.setSelectedIndex(4);
        }
        if (tipo.equals("Ave")) {
            ComboTipoAnimal.setSelectedIndex(5);
        }
        BotaoSalvarAnimal.setEnabled(false);
        BotaoDeletarAnimal.setEnabled(true);
        BotaoAlterarAnimal.setEnabled(true);
        BotaoCancelarAnimal.setEnabled(true);
        BotaoLimparAnimal.setEnabled(true);
    }

    private void listarVacinasAnimal() {
        ItensVacinasDAO ivDAO = new ItensVacinasDAO();
        int codigoanimal = Integer.valueOf(CampoCodigoAnimal.getText().trim());
        itensvacinas = ivDAO.listarItensVacinasCod(codigoanimal);
        DefaultTableModel modelo = (DefaultTableModel) TabelaItensVacinasAnimal.getModel();
        modelo.setNumRows(0);
        for (int i = 0; i <= itensvacinas.size(); i++) {
            Tblitensvacinas tblitensvacinas = (Tblitensvacinas) itensvacinas.get(i);
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            int codigo = tblitensvacinas.getCodItemVacina();
            String nome = tblitensvacinas.getNomeItemVacina();
            String ultima = String.valueOf(df.format(tblitensvacinas.getDataAplic()));
            String descricaoultima = tblitensvacinas.getDescrProxVacina();
            String proximaaplic = String.valueOf(df.format(tblitensvacinas.getDataProxAplic()));
            String descricaoproxima = tblitensvacinas.getDescrProxVacina();
            //
            modelo.addRow(new Object[]{
                        codigo,
                        nome,
                        ultima,
                        descricaoultima,
                        proximaaplic,
                        descricaoproxima});
            //
            Date hoje = new Date();
            Date proxima = tblitensvacinas.getDataProxAplic();
            long calculaData = proxima.getTime() - hoje.getTime();
            int tempoDia = 1000 * 60 * 60 * 24;
            long calculaDias = (calculaData / tempoDia);
            String datahoje = String.valueOf(df.format(hoje));
            if (proximaaplic.equals(datahoje)) {
                String nomeanimal = CampoNomeAnimal.getText();
                TabelaItensVacinasAnimal.setForeground(Color.RED);
                JOptionPane.showMessageDialog(this, "Há uma vacina para ser aplicada no(a) " + nomeanimal + "!", "Aviso do Sistema!", JOptionPane.WARNING_MESSAGE);
            } else if (calculaDias == 3) {
                String nomeanimal = CampoNomeAnimal.getText();
                JOptionPane.showMessageDialog(this, "Há uma vacina para ser aplicada em 3 dias no(a) " + nomeanimal + "!", "Aviso do Sistema!", JOptionPane.WARNING_MESSAGE);
            } else {
                TabelaItensVacinasAnimal.setForeground(Color.BLACK);
            }
        }
        TabelaItensVacinasAnimal.repaint();
    }

    private void TabelaAnimais() {
        DefaultTableModel modelo = (DefaultTableModel) TabelaAnimais.getModel();
        modelo.setNumRows(0);
        for (int i = 0; i < animais.size(); i++) {
            Tblanimais tblanimais = (Tblanimais) animais.get(i);
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            int codigo = tblanimais.getCodAni();
            String nome = tblanimais.getNomeAni();
            String nascimento = String.valueOf(df.format(tblanimais.getDataNasc()));
            String idade = String.valueOf(tblanimais.getIdadeAni());
            String descricao = tblanimais.getDescricaoAni();
            String tipo = tblanimais.getTipoAni();
            modelo.addRow(new Object[]{codigo, nome, nascimento, idade, descricao, tipo});
        }
        TabelaAnimais.repaint();
    }
}