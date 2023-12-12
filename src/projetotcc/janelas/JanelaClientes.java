package projetotcc.janelas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projetotcc.tabelas.Tblclientes;
import projetotcc.util.ClientesDAO;

public class JanelaClientes extends javax.swing.JFrame {
    // Listas
    List<Tblclientes> clientes;
    //

    public JanelaClientes() {
        initComponents();
        Segurança();
        desabilitaCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelTabulado = new javax.swing.JTabbedPane();
        CadastroClientes = new javax.swing.JPanel();
        BarraFerramentasClientes = new javax.swing.JToolBar();
        BotaoVoltar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        BotaoNovoCliente = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        BotaoSalvarCliente = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        BotaoDeletarCliente = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        BotaoAlterarCliente = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        BotaoLimparCliente = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        BotaoCancelarCliente = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        BotaoProcurarCliente = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CampoCodigoCliente = new javax.swing.JTextField();
        CampoNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoEnderecoCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CampoBairroCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CampoCidadeCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ComboUfCliente = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        CampoNumCliente = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        CampoFone1Cliente = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        CampoFone2Cliente = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        CampoFone3Cliente = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        CampoFone4Cliente = new javax.swing.JFormattedTextField();
        BotaoUltimoCliente = new javax.swing.JButton();
        BotaoProximoCliente = new javax.swing.JButton();
        BotaoAnteriorCliente = new javax.swing.JButton();
        BotaoPrimeiroCliente = new javax.swing.JButton();
        PainelTabela = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaClientes = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        CampoFiltroNomeCliente = new javax.swing.JTextField();
        CampoFiltroCidadeCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ComboFiltroUFCliente = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PainelTabulado.setPreferredSize(new java.awt.Dimension(1024, 768));

        CadastroClientes.setToolTipText("Cadastro de Clientes");

        BarraFerramentasClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BarraFerramentasClientes.setFloatable(false);
        BarraFerramentasClientes.setRollover(true);
        BarraFerramentasClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
        BarraFerramentasClientes.add(BotaoVoltar);
        BarraFerramentasClientes.add(jSeparator1);

        BotaoNovoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/novo.png"))); // NOI18N
        BotaoNovoCliente.setText("Novo");
        BotaoNovoCliente.setToolTipText("Cadastrar Um Novo Animal!");
        BotaoNovoCliente.setFocusable(false);
        BotaoNovoCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoNovoCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoClienteActionPerformed(evt);
            }
        });
        BarraFerramentasClientes.add(BotaoNovoCliente);
        BarraFerramentasClientes.add(jSeparator9);

        BotaoSalvarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/salvar.png"))); // NOI18N
        BotaoSalvarCliente.setText("Salvar");
        BotaoSalvarCliente.setFocusable(false);
        BotaoSalvarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoSalvarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarClienteActionPerformed(evt);
            }
        });
        BarraFerramentasClientes.add(BotaoSalvarCliente);
        BarraFerramentasClientes.add(jSeparator11);

        BotaoDeletarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/dell.png"))); // NOI18N
        BotaoDeletarCliente.setText("Deletar");
        BotaoDeletarCliente.setFocusable(false);
        BotaoDeletarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoDeletarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoDeletarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDeletarClienteActionPerformed(evt);
            }
        });
        BarraFerramentasClientes.add(BotaoDeletarCliente);
        BarraFerramentasClientes.add(jSeparator12);

        BotaoAlterarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/alterar.png"))); // NOI18N
        BotaoAlterarCliente.setText("Alterar");
        BotaoAlterarCliente.setFocusable(false);
        BotaoAlterarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoAlterarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarClienteActionPerformed(evt);
            }
        });
        BarraFerramentasClientes.add(BotaoAlterarCliente);
        BarraFerramentasClientes.add(jSeparator13);

        BotaoLimparCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/limpar.png"))); // NOI18N
        BotaoLimparCliente.setText("Limpar");
        BotaoLimparCliente.setFocusable(false);
        BotaoLimparCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoLimparCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoLimparCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparClienteActionPerformed(evt);
            }
        });
        BarraFerramentasClientes.add(BotaoLimparCliente);
        BarraFerramentasClientes.add(jSeparator10);

        BotaoCancelarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/deletar.png"))); // NOI18N
        BotaoCancelarCliente.setText("Cancelar");
        BotaoCancelarCliente.setFocusable(false);
        BotaoCancelarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoCancelarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarClienteActionPerformed(evt);
            }
        });
        BarraFerramentasClientes.add(BotaoCancelarCliente);
        BarraFerramentasClientes.add(jSeparator14);

        BotaoProcurarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/procurar.png"))); // NOI18N
        BotaoProcurarCliente.setText("Procurar");
        BotaoProcurarCliente.setFocusable(false);
        BotaoProcurarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoProcurarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoProcurarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProcurarClienteActionPerformed(evt);
            }
        });
        BarraFerramentasClientes.add(BotaoProcurarCliente);
        BarraFerramentasClientes.add(jSeparator15);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");

        CampoCodigoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        CampoNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Endereço:");

        CampoEnderecoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Bairro:");

        CampoBairroCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Cidade:");

        CampoCidadeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Estado:");

        ComboUfCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboUfCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        ComboUfCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Nº:");

        CampoNumCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTATOS:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Telefone 1:");

        try {
            CampoFone1Cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoFone1Cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Telefone 2:");

        try {
            CampoFone2Cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoFone2Cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Telefone 3:");

        try {
            CampoFone3Cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoFone3Cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Telefone 4:");

        try {
            CampoFone4Cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoFone4Cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(CampoFone3Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(CampoFone1Cliente))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGap(188, 188, 188))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CampoFone4Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoFone2Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(69, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(CampoFone2Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(CampoFone4Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(CampoFone1Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(CampoFone3Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        BotaoUltimoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_last.png"))); // NOI18N
        BotaoUltimoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoUltimoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoUltimoClienteActionPerformed(evt);
            }
        });

        BotaoProximoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_next.png"))); // NOI18N
        BotaoProximoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoProximoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProximoClienteActionPerformed(evt);
            }
        });

        BotaoAnteriorCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_previous.png"))); // NOI18N
        BotaoAnteriorCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoAnteriorCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAnteriorClienteActionPerformed(evt);
            }
        });

        BotaoPrimeiroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/resultset_first.png"))); // NOI18N
        BotaoPrimeiroCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoPrimeiroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPrimeiroClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CadastroClientesLayout = new javax.swing.GroupLayout(CadastroClientes);
        CadastroClientes.setLayout(CadastroClientesLayout);
        CadastroClientesLayout.setHorizontalGroup(
            CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraFerramentasClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
            .addGroup(CadastroClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroClientesLayout.createSequentialGroup()
                        .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(CampoNumCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(CampoBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6)
                    .addGroup(CadastroClientesLayout.createSequentialGroup()
                        .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(ComboUfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(CampoEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(CampoCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CadastroClientesLayout.createSequentialGroup()
                        .addComponent(BotaoPrimeiroCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoAnteriorCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoProximoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoUltimoCliente))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(434, Short.MAX_VALUE))
        );
        CadastroClientesLayout.setVerticalGroup(
            CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroClientesLayout.createSequentialGroup()
                .addComponent(BarraFerramentasClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CadastroClientesLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(CampoNumCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CadastroClientesLayout.createSequentialGroup()
                        .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(ComboUfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoPrimeiroCliente)
                    .addComponent(BotaoAnteriorCliente)
                    .addComponent(BotaoProximoCliente)
                    .addComponent(BotaoUltimoCliente))
                .addGap(150, 150, 150))
        );

        PainelTabulado.addTab("Cadastro de Clientes", CadastroClientes);

        PainelTabela.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                PainelTabelaComponentShown(evt);
            }
        });

        TabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Endereço", "Bairro", "Cidade", "UF", "Telefone 1", "Telefone 2", "Telefone 3", "Telefone 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaClientes.getTableHeader().setReorderingAllowed(false);
        TabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaClientes);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Nome do Cliente:");

        CampoFiltroNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CampoFiltroNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoFiltroNomeClienteKeyTyped(evt);
            }
        });

        CampoFiltroCidadeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CampoFiltroCidadeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoFiltroCidadeClienteKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Cidade do Cliente:");

        ComboFiltroUFCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboFiltroUFCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        ComboFiltroUFCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ComboFiltroUFCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboFiltroUFClienteItemStateChanged(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("UF:");

        javax.swing.GroupLayout PainelTabelaLayout = new javax.swing.GroupLayout(PainelTabela);
        PainelTabela.setLayout(PainelTabelaLayout);
        PainelTabelaLayout.setHorizontalGroup(
            PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1009, Short.MAX_VALUE)
                    .addGroup(PainelTabelaLayout.createSequentialGroup()
                        .addGroup(PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(CampoFiltroNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoFiltroCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(ComboFiltroUFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 477, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PainelTabelaLayout.setVerticalGroup(
            PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelTabelaLayout.createSequentialGroup()
                        .addGroup(PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(5, 5, 5))
                    .addGroup(PainelTabelaLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoFiltroNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoFiltroCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboFiltroUFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        PainelTabulado.addTab("Tabela de Clientes", PainelTabela);

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
                .addComponent(PainelTabulado, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoClienteActionPerformed
        BotaoCancelarClienteActionPerformed(evt);
        CampoCodigoCliente.setText("");
        CampoNomeCliente.requestFocus();
        BotaoSalvarCliente.setEnabled(true);
        BotaoLimparCliente.setEnabled(true);
        BotaoCancelarCliente.setEnabled(true);
        BotaoNovoCliente.setEnabled(false);
        abilitaCampos();
    }//GEN-LAST:event_BotaoNovoClienteActionPerformed

    private void BotaoSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarClienteActionPerformed
        String nome = CampoNomeCliente.getText().trim();
        if(nome.length()<=0){
            JOptionPane.showMessageDialog(this, "Informe o nome do cliente!", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
            CampoNomeCliente.requestFocus();
        } else {
            ClientesDAO cDAO = new ClientesDAO();
            Tblclientes tblclientes = new Tblclientes();
            tblclientes.setBairroCli(CampoBairroCliente.getText().trim());
            tblclientes.setCidadeCli(CampoCidadeCliente.getText().trim());
            tblclientes.setEnderecoCli(CampoEnderecoCliente.getText().trim());
            tblclientes.setFone1cli(CampoFone1Cliente.getText().trim());
            tblclientes.setFone2cli(CampoFone2Cliente.getText().trim());
            tblclientes.setFone3cli(CampoFone3Cliente.getText().trim());
            tblclientes.setFone4cli(CampoFone4Cliente.getText().trim());
            tblclientes.setNomeCli(CampoNomeCliente.getText().trim());
            tblclientes.setNumCli(CampoNumCliente.getText().trim());
            tblclientes.setUfCli(ComboUfCliente.getSelectedIndex());
            cDAO.salvarCliente(tblclientes);
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado!", "Aviso do Sistema", JOptionPane.INFORMATION_MESSAGE);
            preencheTela(tblclientes);
        }
    }//GEN-LAST:event_BotaoSalvarClienteActionPerformed

    private void BotaoDeletarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDeletarClienteActionPerformed
        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente deletar este cliente?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
        if(opcao == JOptionPane.YES_OPTION){
            ClientesDAO cDAO = new ClientesDAO();
            Tblclientes tblclientes = new Tblclientes();
            String codigo = CampoCodigoCliente.getText().trim();
            tblclientes.setCodCli(Integer.valueOf(codigo));
            cDAO.deletarCliente(tblclientes);
            JOptionPane.showMessageDialog(null, "Cliente Deletado!", "Aviso do Sistema!", JOptionPane.INFORMATION_MESSAGE);
            // Limpa a Tela
            BotaoLimparClienteActionPerformed(evt);
        }
    }//GEN-LAST:event_BotaoDeletarClienteActionPerformed

    private void BotaoAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarClienteActionPerformed
        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar este cliente?", "Confirmar Alteração", JOptionPane.YES_NO_OPTION);
        if(opcao == JOptionPane.YES_OPTION){
            String nome = CampoNomeCliente.getText().trim();
            if(nome.length()<=0){
                JOptionPane.showMessageDialog(this, "Informe o nome do cliente!", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
                CampoNomeCliente.requestFocus();
            } else {
                ClientesDAO cDAO = new ClientesDAO();
                Tblclientes tblclientes = new Tblclientes();
                tblclientes.setBairroCli(CampoBairroCliente.getText().trim());
                tblclientes.setCidadeCli(CampoCidadeCliente.getText().trim());
                tblclientes.setCodCli(Integer.valueOf(CampoCodigoCliente.getText().trim()));
                tblclientes.setEnderecoCli(CampoEnderecoCliente.getText().trim());
                tblclientes.setFone1cli(CampoFone1Cliente.getText().trim());
                tblclientes.setFone2cli(CampoFone2Cliente.getText().trim());
                tblclientes.setFone3cli(CampoFone3Cliente.getText().trim());
                tblclientes.setFone4cli(CampoFone4Cliente.getText().trim());
                tblclientes.setNomeCli(CampoNomeCliente.getText().trim());
                tblclientes.setNumCli(CampoNumCliente.getText().trim());
                tblclientes.setUfCli(ComboUfCliente.getSelectedIndex());
                cDAO.alterarCliente(tblclientes);
                JOptionPane.showMessageDialog(null, "Cliente Alterado!", "Aviso do Sistema!", JOptionPane.INFORMATION_MESSAGE);
                // Atualiza a tela.
                preencheTela(tblclientes);
            }
        }
    }//GEN-LAST:event_BotaoAlterarClienteActionPerformed

    private void BotaoLimparClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparClienteActionPerformed
        CampoBairroCliente.setText("");
        CampoCidadeCliente.setText("");
        CampoEnderecoCliente.setText("");
        CampoFone1Cliente.setText("");
        CampoFone2Cliente.setText("");
        CampoFone3Cliente.setText("");
        CampoFone4Cliente.setText("");
        CampoNomeCliente.setText("");
        CampoNumCliente.setText("");
        ComboUfCliente.setSelectedIndex(0);
        CampoCodigoCliente.setText("");
    }//GEN-LAST:event_BotaoLimparClienteActionPerformed

    private void BotaoCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarClienteActionPerformed
        BotaoLimparClienteActionPerformed(evt);
        CampoCodigoCliente.setText("");
        Segurança();
        desabilitaCampos();
        BotaoNovoCliente.setEnabled(true);
    }//GEN-LAST:event_BotaoCancelarClienteActionPerformed

    private void BotaoProcurarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProcurarClienteActionPerformed
        ClientesDAO cDAO = new ClientesDAO();
        Tblclientes tblclientes = new Tblclientes();
        String buscar = JOptionPane.showInputDialog(null, "Digite um código:", "Procurar um Cliente", JOptionPane.QUESTION_MESSAGE);
        int codigo = Integer.valueOf(buscar);
        if(cDAO.existeCliente(codigo)){
            tblclientes.setCodCli(0);
            tblclientes = cDAO.procurarCliente(codigo);
            abilitaCampos();
            preencheTela(tblclientes);
            BotaoNovoCliente.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Não tem cliente cadastrado com este código!", "Aviso do Sistema!", JOptionPane.ERROR_MESSAGE);
            BotaoProcurarClienteActionPerformed(evt);
        }
    }//GEN-LAST:event_BotaoProcurarClienteActionPerformed

    private void BotaoPrimeiroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPrimeiroClienteActionPerformed
        ClientesDAO cDAO = new ClientesDAO();
        Tblclientes tblclientes;
        int codigo = cDAO.primeiroCliente();
        if(cDAO.existeCliente(codigo)){
            abilitaCampos();
            tblclientes = cDAO.procurarCliente(codigo);
            preencheTela(tblclientes);
            BotaoNovoCliente.setEnabled(true);
        } else {
            // Não faz nada.
        }
    }//GEN-LAST:event_BotaoPrimeiroClienteActionPerformed

    private void BotaoAnteriorClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAnteriorClienteActionPerformed
        ClientesDAO cDAO = new ClientesDAO();
        Tblclientes tblclientes;
        String texto = CampoCodigoCliente.getText();
        if(texto.isEmpty()){
            BotaoUltimoClienteActionPerformed(evt);
        } else {
            int codigo = Integer.valueOf(texto);
            int  primeiro = cDAO.primeiroCliente();
            boolean flag = false;
            while (codigo > primeiro && flag == false) {
                codigo--;
                flag = cDAO.existeCliente(codigo);
                if (flag) {
                    abilitaCampos();
                    tblclientes = cDAO.procurarCliente(codigo);
                    preencheTela(tblclientes);
                    BotaoNovoCliente.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_BotaoAnteriorClienteActionPerformed

    private void BotaoProximoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProximoClienteActionPerformed
//        ClientesDAO cDAO = new ClientesDAO();
//        Tblclientes tblclientes;
//        String texto = CampoCodigoCliente.getText().trim();
//        if(texto.isEmpty()){
//            BotaoPrimeiroClienteActionPerformed(evt);
//        } else {
//            int codigo = Integer.valueOf(texto);
//            int  ultimo = cDAO.ultimoCliente();
//            boolean flag = false;
//            while (codigo > ultimo && flag == false) {
//                codigo--;
//                flag = cDAO.existeCliente(codigo);
//                if (flag) {
//                    abilitaCampos();
//                    tblclientes = cDAO.procurarCliente(codigo);
//                    preencheTela(tblclientes);
//                    BotaoNovoCliente.setEnabled(true);
//                }
//            }
//        }
        
        ClientesDAO cDAO = new ClientesDAO();
        String texto = CampoCodigoCliente.getText().trim();
        if (texto.isEmpty()) {
            BotaoPrimeiroClienteActionPerformed(evt);
        } else {
            int codigo = Integer.valueOf(texto);
            int ultimo = cDAO.ultimoCliente();
            boolean flag = false;
            while (codigo < ultimo && flag == false) {
                codigo++;
                flag = cDAO.existeCliente(codigo);
                if (flag) {
                    Tblclientes tblclientes = cDAO.procurarCliente(codigo);
                    abilitaCampos();
                    preencheTela(tblclientes);
                    BotaoNovoCliente.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_BotaoProximoClienteActionPerformed

    private void BotaoUltimoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoUltimoClienteActionPerformed
        ClientesDAO cDAO = new ClientesDAO();
        Tblclientes tblclientes;
        int codigo = cDAO.ultimoCliente();
        if(cDAO.existeCliente(codigo)){
            abilitaCampos();
            tblclientes = cDAO.procurarCliente(codigo);
            preencheTela(tblclientes);
            BotaoNovoCliente.setEnabled(true);
        } else {
            // Não faz nada.
        }
    }//GEN-LAST:event_BotaoUltimoClienteActionPerformed

    private void PainelTabelaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_PainelTabelaComponentShown
        ClientesDAO cDAO = new ClientesDAO();
        CampoFiltroCidadeCliente.setText("");
        CampoFiltroNomeCliente.setText("");
        ComboFiltroUFCliente.setSelectedIndex(0);
        clientes = cDAO.listarClientes();
        TabelaClientes();
    }//GEN-LAST:event_PainelTabelaComponentShown

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void TabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaClientesMouseClicked
        Tblclientes tblclientes;
        int index = TabelaClientes.getSelectedRow();
        tblclientes = (Tblclientes) clientes.get(index);
        abilitaCampos();
        preencheTela(tblclientes);
        PainelTabulado.setSelectedIndex(0);
    }//GEN-LAST:event_TabelaClientesMouseClicked

    private void CampoFiltroNomeClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoFiltroNomeClienteKeyTyped
        ClientesDAO cDAO = new ClientesDAO();
        CampoFiltroCidadeCliente.setText("");
        ComboFiltroUFCliente.setSelectedIndex(0);
        String nome = CampoFiltroNomeCliente.getText().trim();
        clientes = cDAO.listaNomeClientes(nome);
        TabelaClientes();
    }//GEN-LAST:event_CampoFiltroNomeClienteKeyTyped

    private void CampoFiltroCidadeClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoFiltroCidadeClienteKeyTyped
        ClientesDAO cDAO = new ClientesDAO();
        ComboFiltroUFCliente.setSelectedIndex(0);
        CampoFiltroNomeCliente.setText("");
        String cidade = CampoFiltroCidadeCliente.getText().trim();
        clientes = cDAO.listaCidades(cidade);
        TabelaClientes();
    }//GEN-LAST:event_CampoFiltroCidadeClienteKeyTyped

    private void ComboFiltroUFClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboFiltroUFClienteItemStateChanged
        ClientesDAO cDAO = new ClientesDAO();
        CampoFiltroCidadeCliente.setText("");
        CampoFiltroNomeCliente.setText("");
        int UF = ComboFiltroUFCliente.getSelectedIndex();
        clientes = cDAO.listaUF(UF);
        TabelaClientes();
    }//GEN-LAST:event_ComboFiltroUFClienteItemStateChanged

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
            java.util.logging.Logger.getLogger(JanelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new JanelaClientes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarraFerramentasClientes;
    private javax.swing.JButton BotaoAlterarCliente;
    private javax.swing.JButton BotaoAnteriorCliente;
    private javax.swing.JButton BotaoCancelarCliente;
    private javax.swing.JButton BotaoDeletarCliente;
    private javax.swing.JButton BotaoLimparCliente;
    private javax.swing.JButton BotaoNovoCliente;
    private javax.swing.JButton BotaoPrimeiroCliente;
    private javax.swing.JButton BotaoProcurarCliente;
    private javax.swing.JButton BotaoProximoCliente;
    private javax.swing.JButton BotaoSalvarCliente;
    private javax.swing.JButton BotaoUltimoCliente;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JPanel CadastroClientes;
    private javax.swing.JTextField CampoBairroCliente;
    private javax.swing.JTextField CampoCidadeCliente;
    private javax.swing.JTextField CampoCodigoCliente;
    private javax.swing.JTextField CampoEnderecoCliente;
    private javax.swing.JTextField CampoFiltroCidadeCliente;
    private javax.swing.JTextField CampoFiltroNomeCliente;
    private javax.swing.JFormattedTextField CampoFone1Cliente;
    private javax.swing.JFormattedTextField CampoFone2Cliente;
    private javax.swing.JFormattedTextField CampoFone3Cliente;
    private javax.swing.JFormattedTextField CampoFone4Cliente;
    private javax.swing.JTextField CampoNomeCliente;
    private javax.swing.JTextField CampoNumCliente;
    private javax.swing.JComboBox ComboFiltroUFCliente;
    private javax.swing.JComboBox ComboUfCliente;
    private javax.swing.JPanel PainelTabela;
    private javax.swing.JTabbedPane PainelTabulado;
    private javax.swing.JTable TabelaClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
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
        BotaoSalvarCliente.setEnabled(false);
        BotaoDeletarCliente.setEnabled(false);
        BotaoAlterarCliente.setEnabled(false);
        BotaoLimparCliente.setEnabled(false);
        BotaoCancelarCliente.setEnabled(false);
    }
    
    private void preencheTela(Tblclientes tblclientes){
        CampoBairroCliente.setText(tblclientes.getBairroCli());
        CampoCidadeCliente.setText(tblclientes.getCidadeCli());
        CampoCodigoCliente.setText(String.valueOf(tblclientes.getCodCli()));
        CampoEnderecoCliente.setText(tblclientes.getEnderecoCli());
        CampoFone1Cliente.setText(tblclientes.getFone1cli());
        CampoFone2Cliente.setText(tblclientes.getFone2cli());
        CampoFone3Cliente.setText(tblclientes.getFone3cli());
        CampoFone4Cliente.setText(tblclientes.getFone4cli());
        CampoNomeCliente.setText(tblclientes.getNomeCli());
        CampoNumCliente.setText(tblclientes.getNumCli());
        ComboUfCliente.setSelectedIndex(tblclientes.getUfCli());
        BotaoSalvarCliente.setEnabled(false);
        BotaoDeletarCliente.setEnabled(true);
        BotaoAlterarCliente.setEnabled(true);
        BotaoCancelarCliente.setEnabled(true);
        BotaoLimparCliente.setEnabled(true);
    }
    
    private void desabilitaCampos(){
        CampoBairroCliente.setEnabled(false);
        CampoCidadeCliente.setEnabled(false);
        CampoCodigoCliente.setEditable(false);
        CampoEnderecoCliente.setEnabled(false);
        CampoFone1Cliente.setEnabled(false);
        CampoFone2Cliente.setEnabled(false);
        CampoFone3Cliente.setEnabled(false);
        CampoFone4Cliente.setEnabled(false);
        CampoNomeCliente.setEnabled(false);
        CampoNumCliente.setEnabled(false);
        ComboUfCliente.setEnabled(false);
    }
    
    private void abilitaCampos(){
        CampoBairroCliente.setEnabled(true);
        CampoCidadeCliente.setEnabled(true);
        CampoCodigoCliente.setEditable(false);
        CampoEnderecoCliente.setEnabled(true);
        CampoFone1Cliente.setEnabled(true);
        CampoFone2Cliente.setEnabled(true);
        CampoFone3Cliente.setEnabled(true);
        CampoFone4Cliente.setEnabled(true);
        CampoNomeCliente.setEnabled(true);
        CampoNumCliente.setEnabled(true);
        ComboUfCliente.setEnabled(true);
    }

    private void TabelaClientes() {
        Tblclientes tblclientes;
        DefaultTableModel  modelo = (DefaultTableModel) TabelaClientes.getModel();
        modelo.setNumRows(0);
        for (int i = 0; i < clientes.size(); i++){
            tblclientes = clientes.get(i);

            int codigo = tblclientes.getCodCli();
            String nome = tblclientes.getNomeCli();
            String endereco = tblclientes.getEnderecoCli();
            String bairro = tblclientes.getBairroCli();
            String cidade = tblclientes.getCidadeCli();
            String uf = String.valueOf(tblclientes.getUfCli());
            if(uf.equals("1")){
                uf = "AC";
            }
            if(uf.equals("2")){
                uf = "AL";
            }
            if(uf.equals("3")){
                uf = "AP";
            }
            if(uf.equals("4")){
                uf = "AM";
            }
            if(uf.equals("5")){
                uf = "BA";
            }
            if(uf.equals("6")){
                uf = "CE";
            }
            if(uf.equals("7")){
                uf = "DF";
            }
            if(uf.equals("8")){
                uf = "ES";
            }
            if(uf.equals("9")){
                uf = "GO";
            }
            if(uf.equals("10")){
                uf = "MA";
            }
            if(uf.equals("11")){
                uf = "MT";
            }
            if(uf.equals("12")){
                uf = "MS";
            }
            if(uf.equals("13")){
                uf = "MG";
            }
            if(uf.equals("14")){
                uf = "PA";
            }
            if(uf.equals("15")){
                uf = "PB";
            }
            if(uf.equals("16")){
                uf = "PR";
            }
            if(uf.equals("17")){
                uf = "PE";
            }
            if(uf.equals("18")){
                uf = "PI";
            }
            if(uf.equals("19")){
                uf = "RJ";
            }
            if(uf.equals("20")){
                uf = "RN";
            }
            if(uf.equals("21")){
                uf = "RS";
            }
            if(uf.equals("22")){
                uf = "RO";
            }
            if(uf.equals("23")){
                uf = "RR";
            }
            if(uf.equals("24")){
                uf = "SC";
            }
            if(uf.equals("25")){
                uf = "SP";
            }
            if(uf.equals("26")){
                uf = "SE";
            }
            if(uf.equals("27")){
                uf = "TO";
            }
            String telefone1 = tblclientes.getFone1cli();
            String telefone2 = tblclientes.getFone2cli();
            String telefone3 = tblclientes.getFone3cli();
            String telefone4 = tblclientes.getFone4cli();
            modelo.addRow(new Object[]{codigo, nome, endereco, bairro, cidade, uf, telefone1, telefone2, telefone3, telefone4});
            
            }
        TabelaClientes.repaint();
    }
}