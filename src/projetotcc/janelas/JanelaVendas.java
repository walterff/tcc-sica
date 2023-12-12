package projetotcc.janelas;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projetotcc.tabelas.Tblclientes;
import projetotcc.tabelas.Tblitensvendas;
import projetotcc.tabelas.Tblprodutos;
import projetotcc.tabelas.Tblvendas;
import projetotcc.util.ItensVendasDAO;
import projetotcc.util.VendasDAO;

public class JanelaVendas extends javax.swing.JFrame {
    // Listas

    List<Tblclientes> clientes;
    List<Tblprodutos> produtos;
    List<Tblitensvendas> itensvendas;
    // 

    public JanelaVendas() {
        initComponents();
        Segurança();
        desabilitaCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelTabulado = new javax.swing.JTabbedPane();
        CadastroLeites = new javax.swing.JPanel();
        BarraFerramentasVendas = new javax.swing.JToolBar();
        BotaoVoltar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        BotaoNovoVendaLeite = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        BotaoDeletarVendaLeite = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        BotaoAlterarVendaLeite = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        BotaoLimparVendaLeite = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        BotaoCancelarVendaLeite = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        BotaoProcurarVendaLeite = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        CampoCodigoVenda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BotaoUltimoVenda = new javax.swing.JButton();
        BotaoProximoVenda = new javax.swing.JButton();
        BotaoAnteriorVenda = new javax.swing.JButton();
        BotaoPrimeiroVenda = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CampoVencimentoVenda = new com.toedter.calendar.JDateChooser();
        CampoValorTotalVenda = new javax.swing.JTextField();
        CampoValorPagoVenda = new javax.swing.JTextField();
        CampoValorSaldoVenda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaProdutosVenda = new javax.swing.JTable();
        BotaoFinalizarVenda = new javax.swing.JButton();
        CampoCodCliVenda = new javax.swing.JTextField();
        CampoNomeCliVenda = new javax.swing.JTextField();
        PainelScrollListaDeClientes = new javax.swing.JScrollPane();
        ListaDeClientesVenda = new javax.swing.JList();
        PainelProdutosVenda = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        CampoCodProdVenda = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CampoTipoProdVenda = new javax.swing.JTextField();
        BotaoInserirProdVenda = new javax.swing.JButton();
        PainelScrollListaProdVenda = new javax.swing.JScrollPane();
        ListaProdVenda = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        CampoQtdProdVenda = new javax.swing.JTextField();
        CampoPrecoUniVenda = new javax.swing.JTextField();
        CampoTotalProdVenda = new javax.swing.JTextField();
        CampoDataProdVenda = new com.toedter.calendar.JDateChooser();
        BotaoLimparProdVenda = new javax.swing.JButton();
        ComboTipoUniProdVenda = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        CampoQtdTotalVenda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Vendas Produtos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PainelTabulado.setPreferredSize(new java.awt.Dimension(1024, 768));

        CadastroLeites.setToolTipText("Cadastro de Leites");

        BarraFerramentasVendas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BarraFerramentasVendas.setFloatable(false);
        BarraFerramentasVendas.setRollover(true);
        BarraFerramentasVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
        BarraFerramentasVendas.add(BotaoVoltar);
        BarraFerramentasVendas.add(jSeparator1);

        BotaoNovoVendaLeite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/novo.png"))); // NOI18N
        BotaoNovoVendaLeite.setText("Novo");
        BotaoNovoVendaLeite.setToolTipText("Novo");
        BotaoNovoVendaLeite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoNovoVendaLeite.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoNovoVendaLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoVendaLeiteActionPerformed(evt);
            }
        });
        BarraFerramentasVendas.add(BotaoNovoVendaLeite);
        BarraFerramentasVendas.add(jSeparator9);

        BotaoDeletarVendaLeite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/dell.png"))); // NOI18N
        BotaoDeletarVendaLeite.setText("Deletar");
        BotaoDeletarVendaLeite.setToolTipText("Deletar");
        BotaoDeletarVendaLeite.setFocusable(false);
        BotaoDeletarVendaLeite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoDeletarVendaLeite.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoDeletarVendaLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDeletarVendaLeiteActionPerformed(evt);
            }
        });
        BarraFerramentasVendas.add(BotaoDeletarVendaLeite);
        BarraFerramentasVendas.add(jSeparator12);

        BotaoAlterarVendaLeite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/alterar.png"))); // NOI18N
        BotaoAlterarVendaLeite.setText("Alterar");
        BotaoAlterarVendaLeite.setToolTipText("Alterar");
        BotaoAlterarVendaLeite.setFocusable(false);
        BotaoAlterarVendaLeite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoAlterarVendaLeite.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoAlterarVendaLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarVendaLeiteActionPerformed(evt);
            }
        });
        BarraFerramentasVendas.add(BotaoAlterarVendaLeite);
        BarraFerramentasVendas.add(jSeparator13);

        BotaoLimparVendaLeite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/limpar.png"))); // NOI18N
        BotaoLimparVendaLeite.setText("Limpar");
        BotaoLimparVendaLeite.setToolTipText("Limpar");
        BotaoLimparVendaLeite.setFocusable(false);
        BotaoLimparVendaLeite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoLimparVendaLeite.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoLimparVendaLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparVendaLeiteActionPerformed(evt);
            }
        });
        BarraFerramentasVendas.add(BotaoLimparVendaLeite);
        BarraFerramentasVendas.add(jSeparator14);

        BotaoCancelarVendaLeite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/deletar.png"))); // NOI18N
        BotaoCancelarVendaLeite.setText("Cancelar");
        BotaoCancelarVendaLeite.setToolTipText("Cancelar");
        BotaoCancelarVendaLeite.setFocusable(false);
        BotaoCancelarVendaLeite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoCancelarVendaLeite.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoCancelarVendaLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarVendaLeiteActionPerformed(evt);
            }
        });
        BarraFerramentasVendas.add(BotaoCancelarVendaLeite);
        BarraFerramentasVendas.add(jSeparator15);

        BotaoProcurarVendaLeite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/procurar.png"))); // NOI18N
        BotaoProcurarVendaLeite.setText("Procurar");
        BotaoProcurarVendaLeite.setToolTipText("Procurar");
        BotaoProcurarVendaLeite.setFocusable(false);
        BotaoProcurarVendaLeite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoProcurarVendaLeite.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoProcurarVendaLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProcurarVendaLeiteActionPerformed(evt);
            }
        });
        BarraFerramentasVendas.add(BotaoProcurarVendaLeite);
        BarraFerramentasVendas.add(jSeparator10);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Código:");

        CampoCodigoVenda.setFont(new java.awt.Font("Tahoma", 0, 14));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setText("Código do Cliente:");

        BotaoUltimoVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_last.png"))); // NOI18N
        BotaoUltimoVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoUltimoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoUltimoVendaActionPerformed(evt);
            }
        });

        BotaoProximoVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_next.png"))); // NOI18N
        BotaoProximoVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoProximoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProximoVendaActionPerformed(evt);
            }
        });

        BotaoAnteriorVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_previous.png"))); // NOI18N
        BotaoAnteriorVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoAnteriorVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAnteriorVendaActionPerformed(evt);
            }
        });

        BotaoPrimeiroVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_first.png"))); // NOI18N
        BotaoPrimeiroVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoPrimeiroVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPrimeiroVendaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setText("Valor total da Venda:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel8.setText("Nome do Cliente:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setText("Vencimento:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel10.setText("Valor Pago:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel11.setText("Saldo:");

        CampoVencimentoVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CampoVencimentoVenda.setFont(new java.awt.Font("Tahoma", 0, 14));

        CampoValorTotalVenda.setFont(new java.awt.Font("Tahoma", 0, 14));

        CampoValorPagoVenda.setFont(new java.awt.Font("Tahoma", 0, 14));
        CampoValorPagoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoValorPagoVendaActionPerformed(evt);
            }
        });
        CampoValorPagoVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoValorPagoVendaFocusLost(evt);
            }
        });

        CampoValorSaldoVenda.setEditable(false);
        CampoValorSaldoVenda.setFont(new java.awt.Font("Tahoma", 0, 14));

        TabelaProdutosVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.Item", "Cod.Venda", "Cod.Produto", "Tipo Prod.", "Data:", "Qtd.Prod.", "Tipo Uni.", "Preço Uni.", "Total Item"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaProdutosVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaProdutosVenda.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TabelaProdutosVenda);

        BotaoFinalizarVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoFinalizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/coins.png"))); // NOI18N
        BotaoFinalizarVenda.setText("Finalizar Venda");
        BotaoFinalizarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFinalizarVendaActionPerformed(evt);
            }
        });

        CampoCodCliVenda.setFont(new java.awt.Font("Tahoma", 0, 14));

        CampoNomeCliVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CampoNomeCliVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoNomeCliVendaKeyTyped(evt);
            }
        });

        PainelScrollListaDeClientes.setViewportBorder(javax.swing.BorderFactory.createEtchedBorder());

        ListaDeClientesVenda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ListaDeClientesVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ListaDeClientesVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaDeClientesVendaMouseClicked(evt);
            }
        });
        PainelScrollListaDeClientes.setViewportView(ListaDeClientesVenda);

        PainelProdutosVenda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produtos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 0, 51))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setText("Código:");

        CampoCodProdVenda.setFont(new java.awt.Font("Tahoma", 0, 14));
        CampoCodProdVenda.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        CampoCodProdVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoCodProdVendaKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel12.setText("Tipo do Produto:");

        CampoTipoProdVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CampoTipoProdVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoTipoProdVendaKeyTyped(evt);
            }
        });

        BotaoInserirProdVenda.setFont(new java.awt.Font("Tahoma", 0, 14));
        BotaoInserirProdVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/inserir.png"))); // NOI18N
        BotaoInserirProdVenda.setText("Inserir");
        BotaoInserirProdVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoInserirProdVenda.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotaoInserirProdVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoInserirProdVendaActionPerformed(evt);
            }
        });

        ListaProdVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ListaProdVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ListaProdVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaProdVendaMouseClicked(evt);
            }
        });
        PainelScrollListaProdVenda.setViewportView(ListaProdVenda);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Quantidade:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("Unidade de Medida:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("Preço Unitário:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel13.setText("Data da Venda:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel14.setText("Total do Item:");

        CampoQtdProdVenda.setFont(new java.awt.Font("Tahoma", 0, 14));

        CampoPrecoUniVenda.setFont(new java.awt.Font("Tahoma", 0, 14));
        CampoPrecoUniVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoPrecoUniVendaActionPerformed(evt);
            }
        });
        CampoPrecoUniVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoPrecoUniVendaFocusLost(evt);
            }
        });

        CampoTotalProdVenda.setFont(new java.awt.Font("Tahoma", 0, 14));

        CampoDataProdVenda.setFont(new java.awt.Font("Tahoma", 0, 14));

        BotaoLimparProdVenda.setFont(new java.awt.Font("Tahoma", 0, 14));
        BotaoLimparProdVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/limpar16.png"))); // NOI18N
        BotaoLimparProdVenda.setText("Limpar");
        BotaoLimparProdVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparProdVendaActionPerformed(evt);
            }
        });

        ComboTipoUniProdVenda.setFont(new java.awt.Font("Tahoma", 0, 14));
        ComboTipoUniProdVenda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Litros", "Mililitros", "Quilos", "Quilogramas", "Gramas", "Unidade", "Meia-Dúzia", "Uma-Dúzia" }));

        javax.swing.GroupLayout PainelProdutosVendaLayout = new javax.swing.GroupLayout(PainelProdutosVenda);
        PainelProdutosVenda.setLayout(PainelProdutosVendaLayout);
        PainelProdutosVendaLayout.setHorizontalGroup(
            PainelProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProdutosVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelScrollListaProdVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addGroup(PainelProdutosVendaLayout.createSequentialGroup()
                        .addGroup(PainelProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(CampoPrecoUniVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(CampoQtdProdVenda, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(PainelProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboTipoUniProdVenda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CampoTotalProdVenda)))
                    .addGroup(PainelProdutosVendaLayout.createSequentialGroup()
                        .addComponent(BotaoInserirProdVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(BotaoLimparProdVenda))
                    .addGroup(PainelProdutosVendaLayout.createSequentialGroup()
                        .addGroup(PainelProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoCodProdVenda)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PainelProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoTipoProdVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(jLabel12)))
                    .addComponent(jLabel13)
                    .addComponent(CampoDataProdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PainelProdutosVendaLayout.setVerticalGroup(
            PainelProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProdutosVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoCodProdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoTipoProdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PainelScrollListaProdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PainelProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelProdutosVendaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CampoPrecoUniVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelProdutosVendaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoQtdProdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboTipoUniProdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CampoTotalProdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(CampoDataProdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PainelProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotaoLimparProdVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoInserirProdVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel15.setText("Lista de Compras");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel16.setText("Quantidade Total:");

        CampoQtdTotalVenda.setFont(new java.awt.Font("Tahoma", 0, 14));

        javax.swing.GroupLayout CadastroLeitesLayout = new javax.swing.GroupLayout(CadastroLeites);
        CadastroLeites.setLayout(CadastroLeitesLayout);
        CadastroLeitesLayout.setHorizontalGroup(
            CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraFerramentasVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
            .addGroup(CadastroLeitesLayout.createSequentialGroup()
                .addGroup(CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroLeitesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastroLeitesLayout.createSequentialGroup()
                                .addGroup(CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CadastroLeitesLayout.createSequentialGroup()
                                        .addComponent(BotaoPrimeiroVenda)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotaoAnteriorVenda)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotaoProximoVenda)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotaoUltimoVenda))
                                    .addGroup(CadastroLeitesLayout.createSequentialGroup()
                                        .addGroup(CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CampoCodigoVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(CampoCodCliVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(PainelScrollListaDeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CampoNomeCliVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(CadastroLeitesLayout.createSequentialGroup()
                                        .addGroup(CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel10))
                                        .addGap(18, 18, 18)
                                        .addGroup(CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(CampoVencimentoVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                            .addComponent(CampoValorPagoVenda)
                                            .addComponent(CampoQtdTotalVenda))
                                        .addGap(58, 58, 58)
                                        .addGroup(CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(BotaoFinalizarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(CampoValorTotalVenda)
                                            .addComponent(CampoValorSaldoVenda))))
                                .addGap(8, 85, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroLeitesLayout.createSequentialGroup()
                        .addGap(0, 292, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(291, 291, 291)))
                .addComponent(PainelProdutosVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CadastroLeitesLayout.setVerticalGroup(
            CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLeitesLayout.createSequentialGroup()
                .addComponent(BarraFerramentasVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CadastroLeitesLayout.createSequentialGroup()
                        .addGroup(CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoCodigoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoCodCliVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoNomeCliVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BotaoPrimeiroVenda)
                                .addComponent(BotaoAnteriorVenda)
                                .addComponent(BotaoProximoVenda)
                                .addComponent(BotaoUltimoVenda))
                            .addComponent(PainelScrollListaDeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PainelProdutosVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(CampoQtdTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(CampoValorTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroLeitesLayout.createSequentialGroup()
                        .addGroup(CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(CampoValorPagoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(CampoVencimentoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CadastroLeitesLayout.createSequentialGroup()
                        .addGroup(CadastroLeitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(CampoValorSaldoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BotaoFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 16, Short.MAX_VALUE))
        );

        PainelTabulado.addTab("Vendas de Produtos", CadastroLeites);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelTabulado, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelTabulado, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("Cadastro de Vendas Produtos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoNovoVendaLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoVendaLeiteActionPerformed
        BotaoCancelarVendaLeiteActionPerformed(evt);
        CampoCodigoVenda.setText("");
        CampoCodCliVenda.setText("");
        abilitaCampos();
        CampoNomeCliVenda.requestFocus();
        BotaoLimparVendaLeite.setEnabled(true);
        BotaoCancelarVendaLeite.setEnabled(true);
        BotaoNovoVendaLeite.setEnabled(false);
        CampoQtdTotalVenda.setText("0");
        CampoValorTotalVenda.setText("0");
        CampoValorPagoVenda.setText("0");
        CampoValorSaldoVenda.setText("0");
        CampoVencimentoVenda.setDate(null);
        DefaultTableModel modelo = (DefaultTableModel) TabelaProdutosVenda.getModel();
        modelo.setNumRows(0);
    }//GEN-LAST:event_BotaoNovoVendaLeiteActionPerformed

    private void BotaoDeletarVendaLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDeletarVendaLeiteActionPerformed
        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente deletar esta venda?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            VendasDAO vDAO = new VendasDAO();
            Tblvendas tblvendas = new Tblvendas();
            tblvendas.setCodVenda(Integer.valueOf(CampoCodigoVenda.getText().trim()));
            vDAO.deletarVenda(tblvendas);
            JOptionPane.showMessageDialog(null, "Venda Deletada!", "Aviso do Sistema!", JOptionPane.INFORMATION_MESSAGE);
            // Limpa a Tela
            BotaoLimparVendaLeiteActionPerformed(evt);
        }
    }//GEN-LAST:event_BotaoDeletarVendaLeiteActionPerformed

    private void BotaoAlterarVendaLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarVendaLeiteActionPerformed
        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar esta venda?", "Confirmar Alteração", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            String nome = CampoNomeCliVenda.getText().trim();
            if (nome.length() <= 0) {
                JOptionPane.showMessageDialog(this, "Informe o nome do cliente!", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
                CampoNomeCliVenda.requestFocus();
            } else {
                VendasDAO vDAO = new VendasDAO();
                Tblvendas tblvendas = new Tblvendas();
                tblvendas.setCodVenda(Integer.valueOf(CampoCodigoVenda.getText().trim()));
                tblvendas.setVencimentoVenda(CampoVencimentoVenda.getDate());
                tblvendas.setTblClientesCodCli(Integer.valueOf(CampoCodCliVenda.getText().trim()));
                tblvendas.setNomeCli(CampoNomeCliVenda.getText().trim());
                tblvendas.setPagoVenda(Float.valueOf(CampoValorPagoVenda.getText().trim()));
                tblvendas.setSaldoVenda(Float.valueOf(CampoValorSaldoVenda.getText().trim()));
                tblvendas.setTotalVenda(Float.valueOf(CampoValorTotalVenda.getText().trim()));
                vDAO.salvarVenda(tblvendas);
                JOptionPane.showMessageDialog(null, "Venda Cadastrada!", "Aviso do Sistema", JOptionPane.INFORMATION_MESSAGE);
                preencheTela(tblvendas);
                BotaoNovoVendaLeite.setEnabled(true);
            }
        }
    }//GEN-LAST:event_BotaoAlterarVendaLeiteActionPerformed

    private void BotaoLimparVendaLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparVendaLeiteActionPerformed
        CampoValorPagoVenda.setText("");
        CampoVencimentoVenda.setDate(null);
        CampoValorSaldoVenda.setText("");
        BotaoLimparProdVendaActionPerformed(evt);
    }//GEN-LAST:event_BotaoLimparVendaLeiteActionPerformed

    private void BotaoCancelarVendaLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarVendaLeiteActionPerformed
        BotaoLimparVendaLeiteActionPerformed(evt);
        BotaoLimparProdVendaActionPerformed(evt);
        Segurança();
        desabilitaCampos();
        CampoCodigoVenda.setText("");
        CampoCodCliVenda.setText("");
        CampoNomeCliVenda.setText("");
        CampoQtdTotalVenda.setText("");
        CampoValorTotalVenda.setText("");
        BotaoNovoVendaLeite.setEnabled(true);
        BotaoNovoVendaLeite.requestFocus();
        DefaultTableModel modelo = (DefaultTableModel) TabelaProdutosVenda.getModel();
        modelo.setNumRows(0);
    }//GEN-LAST:event_BotaoCancelarVendaLeiteActionPerformed

    private void BotaoProcurarVendaLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProcurarVendaLeiteActionPerformed
        VendasDAO vDAO = new VendasDAO();
        Tblvendas tblvendas = new Tblvendas();
        String buscar = JOptionPane.showInputDialog(this, "Digite o código da venda:", "Procurar uma Venda", JOptionPane.QUESTION_MESSAGE);
        int codigo = Integer.valueOf(buscar);
        if (vDAO.existeVenda(codigo)) {
            abilitaCampos();
            tblvendas.setCodVenda(0);
            tblvendas = vDAO.procurarVenda(codigo);
            preencheTela(tblvendas);
            BotaoNovoVendaLeite.setEnabled(true);
            abilitaInserir();
            listarItensVendas();
        } else {
            JOptionPane.showMessageDialog(this, "Não há venda cadastrada com este código!", "Aviso do Sistema!", JOptionPane.ERROR_MESSAGE);
            BotaoProcurarVendaLeiteActionPerformed(evt);
        }
    }//GEN-LAST:event_BotaoProcurarVendaLeiteActionPerformed

    private void BotaoPrimeiroVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPrimeiroVendaActionPerformed
        VendasDAO vDAO = new VendasDAO();
        int codigo = vDAO.primeiroVenda();
        if (vDAO.existeVenda(codigo)) {
            Tblvendas tblvendas = vDAO.procurarVenda(codigo);
            abilitaCampos();
            preencheTela(tblvendas);
            BotaoNovoVendaLeite.setEnabled(true);
            abilitaInserir();
            listarItensVendas();
        } else {
            // Não faz nada.
        }
    }//GEN-LAST:event_BotaoPrimeiroVendaActionPerformed

    private void BotaoAnteriorVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAnteriorVendaActionPerformed
        VendasDAO vDAO = new VendasDAO();
        String texto = CampoCodigoVenda.getText().trim();
        if (texto.isEmpty()) {
            BotaoPrimeiroVendaActionPerformed(evt);
        } else {
            int codigo = Integer.valueOf(texto);
            int primeiro = vDAO.primeiroVenda();
            boolean flag = false;
            while (codigo > primeiro && flag == false) {
                codigo--;
                flag = vDAO.existeVenda(codigo);
                if (flag) {
                    Tblvendas tblvendas = vDAO.procurarVenda(codigo);
                    abilitaCampos();
                    preencheTela(tblvendas);
                    BotaoNovoVendaLeite.setEnabled(true);
                    abilitaInserir();
                    listarItensVendas();
                }
            }
        }
    }//GEN-LAST:event_BotaoAnteriorVendaActionPerformed

    private void BotaoProximoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProximoVendaActionPerformed
        VendasDAO vDAO = new VendasDAO();
        String texto = CampoCodigoVenda.getText().trim();
        if (texto.isEmpty()) {
            BotaoPrimeiroVendaActionPerformed(evt);
        } else {
            int codigo = Integer.valueOf(texto);
            int ultimo = vDAO.ultimoVenda();
            boolean flag = false;
            while (codigo < ultimo && flag == false) {
                codigo++;
                flag = vDAO.existeVenda(codigo);
                if (flag) {
                    Tblvendas tblvendas = vDAO.procurarVenda(codigo);
                    abilitaCampos();
                    preencheTela(tblvendas);
                    BotaoNovoVendaLeite.setEnabled(true);
                    abilitaInserir();
                    listarItensVendas();
                }
            }
        }
    }//GEN-LAST:event_BotaoProximoVendaActionPerformed

    private void BotaoUltimoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoUltimoVendaActionPerformed
        VendasDAO vDAO = new VendasDAO();
        int codigo = vDAO.ultimoVenda();
        if (vDAO.existeVenda(codigo)) {
            Tblvendas tblvendas = vDAO.procurarVenda(codigo);
            abilitaCampos();
            preencheTela(tblvendas);
            BotaoNovoVendaLeite.setEnabled(true);
            abilitaInserir();
            listarItensVendas();
        } else {
            // Não faz nada.
        }
    }//GEN-LAST:event_BotaoUltimoVendaActionPerformed

    private void BotaoInserirProdVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoInserirProdVendaActionPerformed
        String a, b, c;
        a = CampoPrecoUniVenda.getText().trim();
        a = a.replace(",", ".");
        b = CampoQtdProdVenda.getText().trim();
        b = b.replace(",", ".");
        c = CampoTotalProdVenda.getText().trim();
        c = c.replace(",", ".");
        ItensVendasDAO ivDAO = new ItensVendasDAO();
        Tblitensvendas tblitensvendas = new Tblitensvendas();
        tblitensvendas.setDataVendaProd(CampoDataProdVenda.getDate());
        tblitensvendas.setPrecoUniProd(Float.valueOf(a));
        tblitensvendas.setQuantidadeProd(Float.valueOf(b));
        tblitensvendas.setTblProdutosCodProd(Integer.valueOf(CampoCodProdVenda.getText().trim()));
        tblitensvendas.setTblVendasCodVenda(Integer.valueOf(CampoCodigoVenda.getText().trim()));
        tblitensvendas.setTipoProdVenda(CampoTipoProdVenda.getText().trim());
        tblitensvendas.setTipoUni(String.valueOf(ComboTipoUniProdVenda.getSelectedItem()));
        tblitensvendas.setTotalVendaProd(Float.valueOf(c));
        ivDAO.salvarItenVenda(tblitensvendas);
        listarItensVendas();
        BotaoLimparProdVendaActionPerformed(evt);
    }//GEN-LAST:event_BotaoInserirProdVendaActionPerformed

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void BotaoFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFinalizarVendaActionPerformed
        String a, b, c;
        a = CampoValorPagoVenda.getText().trim();
        a = a.replace(",", ".");
        b = CampoValorSaldoVenda.getText().trim();
        b = b.replace(",", ".");
        c = CampoValorTotalVenda.getText().trim();
        c = c.replace(",", ".");
        VendasDAO vDAO = new VendasDAO();
        Tblvendas tblvendas = new Tblvendas();
        tblvendas.setCodVenda(Integer.valueOf(CampoCodigoVenda.getText().trim()));
        tblvendas.setVencimentoVenda(CampoVencimentoVenda.getDate());
        tblvendas.setTblClientesCodCli(Integer.valueOf(CampoCodCliVenda.getText().trim()));
        tblvendas.setNomeCli(CampoNomeCliVenda.getText().trim());
        tblvendas.setPagoVenda(Float.valueOf(a));
        tblvendas.setSaldoVenda(Float.valueOf(b));
        tblvendas.setTotalVenda(Float.valueOf(c));
        vDAO.alterarVenda(tblvendas);
        JOptionPane.showMessageDialog(null, "Venda Finalizada!", "Aviso do Sistema", JOptionPane.INFORMATION_MESSAGE);
        preencheTela(tblvendas);
        BotaoNovoVendaLeite.setEnabled(true);
    }//GEN-LAST:event_BotaoFinalizarVendaActionPerformed

    private void CampoNomeCliVendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoNomeCliVendaKeyTyped
        VendasDAO vDAO = new VendasDAO();
        PainelScrollListaDeClientes.setVisible(true);
        //
        this.repaint();
        //limpa
        ListaDeClientesVenda.removeAll();
        String nome = CampoNomeCliVenda.getText().trim();
        clientes = vDAO.listaNomeClientes(nome);
        DefaultListModel lista = new DefaultListModel();
        for (int i = 0; i < clientes.size(); i++) {
            Tblclientes tblclientes = (Tblclientes) clientes.get(i);
            int codigocliente = tblclientes.getCodCli();
            String nomecliente = tblclientes.getNomeCli();
            lista.add(i, codigocliente + " - " + nomecliente);
        }
        ListaDeClientesVenda.setModel(lista);
        ListaDeClientesVenda.repaint();
    }//GEN-LAST:event_CampoNomeCliVendaKeyTyped

    private void ListaDeClientesVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaDeClientesVendaMouseClicked
        int index = ListaDeClientesVenda.getSelectedIndex();
        Tblclientes tblclientes = (Tblclientes) clientes.get(index);
        CampoCodCliVenda.setText(String.valueOf(tblclientes.getCodCli()));
        CampoNomeCliVenda.setText(tblclientes.getNomeCli());
        PainelScrollListaDeClientes.setVisible(false);
        String nome = CampoNomeCliVenda.getText().trim();
        if (nome.length() <= 0) {
            JOptionPane.showMessageDialog(this, "Informe o nome do cliente!", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
            CampoNomeCliVenda.requestFocus();
        } else {
            VendasDAO vDAO = new VendasDAO();
            Tblvendas tblvendas = new Tblvendas();
            tblvendas.setVencimentoVenda(CampoVencimentoVenda.getDate());
            tblvendas.setTblClientesCodCli(Integer.valueOf(CampoCodCliVenda.getText().trim()));
            tblvendas.setNomeCli(CampoNomeCliVenda.getText().trim());
            tblvendas.setPagoVenda(Float.valueOf(CampoValorPagoVenda.getText().trim()));
            tblvendas.setSaldoVenda(Float.valueOf(CampoValorSaldoVenda.getText().trim()));
            tblvendas.setTotalVenda(Float.valueOf(CampoValorTotalVenda.getText().trim()));
            vDAO.salvarVenda(tblvendas);
            preencheTela(tblvendas);
            BotaoNovoVendaLeite.setEnabled(true);
            abilitaInserir();
        }
    }//GEN-LAST:event_ListaDeClientesVendaMouseClicked

    private void CampoCodProdVendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoCodProdVendaKeyTyped
        VendasDAO vDAO = new VendasDAO();
        PainelScrollListaProdVenda.setVisible(true);
        //
        this.repaint();
        //limpa
        ListaProdVenda.removeAll();
        String codigo = CampoCodCliVenda.getText().trim();
        produtos = vDAO.listaCodProdutos(codigo);
        DefaultListModel lista = new DefaultListModel();
        for (int i = 0; i < produtos.size(); i++) {
            Tblprodutos tblprodutos = (Tblprodutos) produtos.get(i);
            lista.add(i, tblprodutos.getCodProd() + " - " + tblprodutos.getTipoProd());
        }
        ListaProdVenda.setModel(lista);
        ListaProdVenda.repaint();
    }//GEN-LAST:event_CampoCodProdVendaKeyTyped

    private void CampoTipoProdVendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoTipoProdVendaKeyTyped
        VendasDAO vDAO = new VendasDAO();
        PainelScrollListaProdVenda.setVisible(true);
        //
        this.repaint();
        //limpa
        ListaProdVenda.removeAll();
        String tipo = CampoTipoProdVenda.getText().trim();
        produtos = vDAO.listaTipoProdutos(tipo);
        DefaultListModel lista = new DefaultListModel();
        for (int i = 0; i < produtos.size(); i++) {
            Tblprodutos tblprodutos = (Tblprodutos) produtos.get(i);
            lista.add(i, tblprodutos.getCodProd() + " - " + tblprodutos.getTipoProd());
        }
        ListaProdVenda.setModel(lista);
        ListaProdVenda.repaint();
    }//GEN-LAST:event_CampoTipoProdVendaKeyTyped

    private void ListaProdVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaProdVendaMouseClicked
        int index = ListaProdVenda.getSelectedIndex();
        Tblprodutos tblprodutos = (Tblprodutos) produtos.get(index);
        CampoCodProdVenda.setText(String.valueOf(tblprodutos.getCodProd()));
        CampoTipoProdVenda.setText(tblprodutos.getTipoProd());
        PainelScrollListaProdVenda.setVisible(false);
    }//GEN-LAST:event_ListaProdVendaMouseClicked

    private void BotaoLimparProdVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparProdVendaActionPerformed
        CampoCodProdVenda.setText("");
        CampoTipoProdVenda.setText("");
        CampoQtdProdVenda.setText("");
        ComboTipoUniProdVenda.setSelectedIndex(0);
        CampoPrecoUniVenda.setText("");
        CampoTotalProdVenda.setText("");
        CampoDataProdVenda.setDate(null);
    }//GEN-LAST:event_BotaoLimparProdVendaActionPerformed

    private void CampoValorPagoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoValorPagoVendaActionPerformed
        DecimalFormat df = new DecimalFormat("0.00##");
        float valortotal, valorpago, resultado;
        String a, b;
        a = CampoValorTotalVenda.getText().trim();
        a = a.replace(",", ".");
        b = CampoValorPagoVenda.getText();
        b = b.replace(",", ".");
        valortotal = Float.valueOf("-"+a);
        valorpago = Float.valueOf(b);
        resultado = valortotal + valorpago;
        CampoValorSaldoVenda.setText(df.format(resultado));
    }//GEN-LAST:event_CampoValorPagoVendaActionPerformed

    private void CampoPrecoUniVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoPrecoUniVendaActionPerformed
        DecimalFormat df = new DecimalFormat("0.00##");
        float quantidade, preçounidade, resultado;
        String a, b;
        a = CampoQtdProdVenda.getText().trim();
        a = a.replace(",", ".");
        b = CampoPrecoUniVenda.getText().trim();
        b = b.replace(",", ".");
        quantidade = Float.valueOf(a);
        preçounidade = Float.valueOf(b);
        resultado = quantidade * preçounidade;
        CampoTotalProdVenda.setText(df.format(resultado));
    }//GEN-LAST:event_CampoPrecoUniVendaActionPerformed

    private void CampoPrecoUniVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoPrecoUniVendaFocusLost
        DecimalFormat df = new DecimalFormat("0.00##");
        float quantidade, preçounidade, resultado;
        String a, b;
        a = CampoQtdProdVenda.getText().trim();
        a = a.replace(",", ".");
        b = CampoPrecoUniVenda.getText().trim();
        b = b.replace(",", ".");
        quantidade = Float.valueOf(a);
        preçounidade = Float.valueOf(b);
        resultado = quantidade * preçounidade;
        CampoTotalProdVenda.setText(df.format(resultado));
    }//GEN-LAST:event_CampoPrecoUniVendaFocusLost

    private void CampoValorPagoVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoValorPagoVendaFocusLost
        DecimalFormat df = new DecimalFormat("0.00##");
        float valortotal, valorpago, resultado;
        String a, b;
        a = CampoValorTotalVenda.getText();
        a = a.replace(",", ".");
        b = CampoValorPagoVenda.getText();
        b = b.replace(",", ".");
        valortotal = Float.valueOf("-"+a);
        valorpago = Float.valueOf(b);
        resultado = valortotal + valorpago;
        CampoValorSaldoVenda.setText(df.format(resultado));
    }//GEN-LAST:event_CampoValorPagoVendaFocusLost

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
            java.util.logging.Logger.getLogger(JanelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new JanelaVendas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarraFerramentasVendas;
    private javax.swing.JButton BotaoAlterarVendaLeite;
    private javax.swing.JButton BotaoAnteriorVenda;
    private javax.swing.JButton BotaoCancelarVendaLeite;
    private javax.swing.JButton BotaoDeletarVendaLeite;
    private javax.swing.JButton BotaoFinalizarVenda;
    private javax.swing.JButton BotaoInserirProdVenda;
    private javax.swing.JButton BotaoLimparProdVenda;
    private javax.swing.JButton BotaoLimparVendaLeite;
    private javax.swing.JButton BotaoNovoVendaLeite;
    private javax.swing.JButton BotaoPrimeiroVenda;
    private javax.swing.JButton BotaoProcurarVendaLeite;
    private javax.swing.JButton BotaoProximoVenda;
    private javax.swing.JButton BotaoUltimoVenda;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JPanel CadastroLeites;
    private javax.swing.JTextField CampoCodCliVenda;
    private javax.swing.JTextField CampoCodProdVenda;
    private javax.swing.JTextField CampoCodigoVenda;
    private com.toedter.calendar.JDateChooser CampoDataProdVenda;
    private javax.swing.JTextField CampoNomeCliVenda;
    private javax.swing.JTextField CampoPrecoUniVenda;
    private javax.swing.JTextField CampoQtdProdVenda;
    private javax.swing.JTextField CampoQtdTotalVenda;
    private javax.swing.JTextField CampoTipoProdVenda;
    private javax.swing.JTextField CampoTotalProdVenda;
    private javax.swing.JTextField CampoValorPagoVenda;
    private javax.swing.JTextField CampoValorSaldoVenda;
    private javax.swing.JTextField CampoValorTotalVenda;
    private com.toedter.calendar.JDateChooser CampoVencimentoVenda;
    private javax.swing.JComboBox ComboTipoUniProdVenda;
    private javax.swing.JList ListaDeClientesVenda;
    private javax.swing.JList ListaProdVenda;
    private javax.swing.JPanel PainelProdutosVenda;
    private javax.swing.JScrollPane PainelScrollListaDeClientes;
    private javax.swing.JScrollPane PainelScrollListaProdVenda;
    private javax.swing.JTabbedPane PainelTabulado;
    private javax.swing.JTable TabelaProdutosVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JToolBar.Separator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator9;
    // End of variables declaration//GEN-END:variables

    private void Segurança() {
        BotaoDeletarVendaLeite.setEnabled(false);
        BotaoAlterarVendaLeite.setEnabled(false);
        BotaoLimparVendaLeite.setEnabled(false);
        BotaoCancelarVendaLeite.setEnabled(false);
        BotaoInserirProdVenda.setEnabled(false);
    }

    private void abilitaInserir() {
        CampoCodProdVenda.setEnabled(true);
        CampoTipoProdVenda.setEnabled(true);
        CampoQtdProdVenda.setEnabled(true);
        CampoPrecoUniVenda.setEnabled(true);
        ComboTipoUniProdVenda.setEnabled(true);
        CampoTotalProdVenda.setEnabled(true);
        CampoDataProdVenda.setEnabled(true);
        CampoCodProdVenda.setEnabled(true);
        BotaoInserirProdVenda.setEnabled(true);
        BotaoLimparProdVenda.setEnabled(true);
        BotaoFinalizarVenda.setEnabled(true);
        BotaoDeletarVendaLeite.setEnabled(true);
        BotaoAlterarVendaLeite.setEnabled(true);
        BotaoLimparVendaLeite.setEnabled(true);
        BotaoCancelarVendaLeite.setEnabled(true);
    }

    private void abilitaCampos() {
        CampoCodigoVenda.setEditable(false);
        CampoCodCliVenda.setEditable(false);
        CampoNomeCliVenda.setEnabled(true);
        CampoVencimentoVenda.setEnabled(true);
        CampoValorPagoVenda.setEnabled(true);
        CampoValorSaldoVenda.setEnabled(true);
        CampoValorTotalVenda.setEnabled(true);
        CampoQtdTotalVenda.setEnabled(true);
    }

    private void desabilitaCampos() {
        CampoCodigoVenda.setEditable(false);
        CampoCodCliVenda.setEditable(false);
        CampoNomeCliVenda.setEnabled(false);
        CampoVencimentoVenda.setEnabled(false);
        CampoValorPagoVenda.setEnabled(false);
        CampoValorSaldoVenda.setEnabled(false);
        CampoValorTotalVenda.setEnabled(false);
        CampoQtdTotalVenda.setEnabled(false);
        PainelScrollListaDeClientes.setVisible(false);
        PainelScrollListaProdVenda.setVisible(false);
        CampoCodProdVenda.setEnabled(false);
        CampoTipoProdVenda.setEnabled(false);
        CampoQtdProdVenda.setEnabled(false);
        CampoPrecoUniVenda.setEnabled(false);
        ComboTipoUniProdVenda.setEnabled(false);
        CampoTotalProdVenda.setEnabled(false);
        CampoDataProdVenda.setEnabled(false);
        CampoCodProdVenda.setEnabled(false);
        BotaoInserirProdVenda.setEnabled(false);
        BotaoLimparProdVenda.setEnabled(false);
        BotaoFinalizarVenda.setEnabled(false);
    }

    private void preencheTela(Tblvendas tblvendas) {
        DecimalFormat df = new DecimalFormat("0.00##");
        CampoCodigoVenda.setText(String.valueOf(tblvendas.getCodVenda()));
        CampoCodCliVenda.setText(String.valueOf(tblvendas.getTblClientesCodCli()));
        CampoNomeCliVenda.setText(tblvendas.getNomeCli());
        CampoValorTotalVenda.setText(df.format(tblvendas.getTotalVenda()));
        CampoValorPagoVenda.setText(df.format(tblvendas.getPagoVenda()));
        CampoValorSaldoVenda.setText(df.format(tblvendas.getSaldoVenda()));
        CampoVencimentoVenda.setDate(tblvendas.getVencimentoVenda());
    }

    private void listarItensVendas() {
        ItensVendasDAO ivDAO = new ItensVendasDAO();
        int codigovenda = Integer.valueOf(CampoCodigoVenda.getText().trim());
        itensvendas = ivDAO.listarItensVendasCod(codigovenda);
        DefaultTableModel modelo = (DefaultTableModel) TabelaProdutosVenda.getModel();
        modelo.setNumRows(0);
        float calculaquantidade = 0;
        float calculatotal = 0;
        for (int i = 0; i <= itensvendas.size(); i++) {
            Tblitensvendas tblitensvendas = (Tblitensvendas) itensvendas.get(i);
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            DecimalFormat decf = new DecimalFormat("0.00##");
            int coditen = tblitensvendas.getCodItemVenda();
            int codvenda = tblitensvendas.getTblVendasCodVenda();
            int codprod = tblitensvendas.getTblProdutosCodProd();
            String tipoprod = tblitensvendas.getTipoProdVenda();
            String datavenda = String.valueOf(df.format(tblitensvendas.getDataVendaProd()));
            calculaquantidade = calculaquantidade + tblitensvendas.getQuantidadeProd();
            String quantidadeprod = decf.format(tblitensvendas.getQuantidadeProd());
            String tipouni = tblitensvendas.getTipoUni();
            String preçouni = decf.format(tblitensvendas.getPrecoUniProd());
            calculatotal = calculatotal + tblitensvendas.getTotalVendaProd();
            String total = decf.format(tblitensvendas.getTotalVendaProd());
            modelo.addRow(new Object[]{
                        coditen,
                        codvenda,
                        codprod,
                        tipoprod,
                        datavenda,
                        quantidadeprod,
                        tipouni,
                        preçouni,
                        total
                    });
            CampoQtdTotalVenda.setText(decf.format(calculaquantidade));
            CampoValorTotalVenda.setText(decf.format(calculatotal));
            CampoValorPagoVendaActionPerformed(null);
            CampoValorPagoVendaFocusLost(null);
            Date hoje = new Date();
            String datavencimento = df.format(CampoVencimentoVenda.getDate());
            String dataatual = df.format(hoje);
            if(datavencimento.equals(dataatual)){
                JOptionPane.showMessageDialog(this, "O dia de vencimento da venda é hoje!", "Aviso do Sistema!", JOptionPane.WARNING_MESSAGE);
                CampoVencimentoVenda.requestFocus();
                
            }
        }
        TabelaProdutosVenda.repaint();
    }
}