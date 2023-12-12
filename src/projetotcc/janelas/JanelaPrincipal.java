package projetotcc.janelas;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import projetotcc.tabelas.Tbltema;
import projetotcc.util.AnimaisDAO;
import projetotcc.util.TemasDAO;

public class JanelaPrincipal extends javax.swing.JFrame {

    Image image = Toolkit.getDefaultToolkit().getImage("vaca.png");

    public JanelaPrincipal() {
        initComponents();
        Mensagem();
        Thread threadRelogio = new Thread() {

            @Override
            public void run() {
                Relógio();
            }

            private void Relógio() {
                try {
                    while (true) {
                        Date hoje = new Date();
                        SimpleDateFormat df = new SimpleDateFormat("EEEE - dd/MM/yyyy");
                        Relógio.setToolTipText(df.format(hoje));
                        Calendário.setText(df.format(hoje));
                        //Formata a hora
                        df = new SimpleDateFormat("HH:mm:ss");
                        Relógio.setText(df.format(hoje));
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException ex) {
                }
            }
        };
        threadRelogio.start();
    }

    ;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JPanel();
        PainelTabulado = new javax.swing.JTabbedPane();
        PainelInício = new javax.swing.JPanel();
        BarraBotoes = new javax.swing.JToolBar();
        BotaoCalculadora = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        BotaoInternet = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        BotaoWord = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        BotaoExcel = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        BotaoSair = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        PainelCadastros = new javax.swing.JPanel();
        BarraFerramentasCadastros = new javax.swing.JToolBar();
        BotaoCadastrarAnimais = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        BotaoCadastrarVacinas = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        BotaoCadastrarLeites = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        BotaoCadastrarClientes = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        BotaoCadastrarProdutos = new javax.swing.JButton();
        jSeparator23 = new javax.swing.JToolBar.Separator();
        PainelVendas = new javax.swing.JPanel();
        BarraFerramentasVendas = new javax.swing.JToolBar();
        BotaoVendas = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        PainelContas = new javax.swing.JPanel();
        BarraFerramentasContas = new javax.swing.JToolBar();
        BotaoContas = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        PainelRelatórios = new javax.swing.JPanel();
        BarraFerramentasRelatórios = new javax.swing.JToolBar();
        BotaoRelatoriosAnimais = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        BotaoRelatoriosVacinas = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        BotaoRelatoriosClientes = new javax.swing.JButton();
        jSeparator16 = new javax.swing.JToolBar.Separator();
        BotaoRelatoriosLeites = new javax.swing.JButton();
        jSeparator17 = new javax.swing.JToolBar.Separator();
        BotaoRelatoriosVendasLeites = new javax.swing.JButton();
        jSeparator19 = new javax.swing.JToolBar.Separator();
        BotaoRelatoriosContas = new javax.swing.JButton();
        jSeparator20 = new javax.swing.JToolBar.Separator();
        PainelBackup = new javax.swing.JPanel();
        BarraFerramentasBackup = new javax.swing.JToolBar();
        BotaoBackup = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        BotaoRestaurar = new javax.swing.JButton();
        jSeparator18 = new javax.swing.JToolBar.Separator();
        BackGround = new javax.swing.JLayeredPane();
        Imagem = new javax.swing.JLabel();
        BarraFerramentas = new javax.swing.JToolBar();
        Mensagem = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        Calendário = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JToolBar.Separator();
        Relógio = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        TemaAtual = new javax.swing.JLabel();
        BarraMenu = new javax.swing.JMenuBar();
        MenuArquivo = new javax.swing.JMenu();
        SubMenuInício = new javax.swing.JMenuItem();
        SubMenuCadastros = new javax.swing.JMenuItem();
        SubMenuVendas = new javax.swing.JMenuItem();
        SubMenuContas = new javax.swing.JMenuItem();
        SubMenuRelatórios = new javax.swing.JMenuItem();
        SubMenuBackup = new javax.swing.JMenuItem();
        jSeparator25 = new javax.swing.JPopupMenu.Separator();
        MenuAplicativosSistema = new javax.swing.JMenu();
        SubMenuCalculadora = new javax.swing.JMenuItem();
        SubMenuInternet = new javax.swing.JMenuItem();
        SubMenuMSOfficeWord = new javax.swing.JMenuItem();
        SubMenuMSOfficeExcel = new javax.swing.JMenuItem();
        jSeparator24 = new javax.swing.JPopupMenu.Separator();
        SubMenuSair = new javax.swing.JMenuItem();
        MenuOpções = new javax.swing.JMenu();
        Temas = new javax.swing.JMenu();
        Synthetica = new javax.swing.JMenu();
        AluOxide = new javax.swing.JMenuItem();
        BlackEye = new javax.swing.JMenuItem();
        BlackMoon = new javax.swing.JMenuItem();
        BlackStar = new javax.swing.JMenuItem();
        BlueIce = new javax.swing.JMenuItem();
        BlueMoon = new javax.swing.JMenuItem();
        BlueSteel = new javax.swing.JMenuItem();
        Classy = new javax.swing.JMenuItem();
        GreenDream = new javax.swing.JMenuItem();
        MauveMetallic = new javax.swing.JMenuItem();
        OrangeMetallic = new javax.swing.JMenuItem();
        SilverMoon = new javax.swing.JMenuItem();
        Simple2D = new javax.swing.JMenuItem();
        SkyMetallic = new javax.swing.JMenuItem();
        WhiteVision = new javax.swing.JMenuItem();
        MenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venda de Leite - Tela Principal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Painel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PainelTabulado.setToolTipText("");
        PainelTabulado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        PainelInício.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BarraBotoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BarraBotoes.setFloatable(false);
        BarraBotoes.setRollover(true);
        BarraBotoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BotaoCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/calculadora.png"))); // NOI18N
        BotaoCalculadora.setText("Calculadora (Alt + C)");
        BotaoCalculadora.setToolTipText("Calculadora (Alt + C)");
        BotaoCalculadora.setFocusable(false);
        BotaoCalculadora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoCalculadora.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCalculadoraActionPerformed(evt);
            }
        });
        BarraBotoes.add(BotaoCalculadora);
        BarraBotoes.add(jSeparator1);

        BotaoInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/internet.png"))); // NOI18N
        BotaoInternet.setText("Internet (Alt + I)");
        BotaoInternet.setToolTipText("Internet (Alt + I)");
        BotaoInternet.setFocusable(false);
        BotaoInternet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoInternet.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoInternet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoInternetActionPerformed(evt);
            }
        });
        BarraBotoes.add(BotaoInternet);
        BarraBotoes.add(jSeparator2);

        BotaoWord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/word.png"))); // NOI18N
        BotaoWord.setText("Texto (Alt + W)");
        BotaoWord.setToolTipText("Texto (Alt + W)");
        BotaoWord.setFocusable(false);
        BotaoWord.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoWord.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoWordActionPerformed(evt);
            }
        });
        BarraBotoes.add(BotaoWord);
        BarraBotoes.add(jSeparator3);

        BotaoExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/excel.png"))); // NOI18N
        BotaoExcel.setText("Planilha (Alt + E)");
        BotaoExcel.setToolTipText("Planilha (Alt + E)");
        BotaoExcel.setFocusable(false);
        BotaoExcel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoExcel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcelActionPerformed(evt);
            }
        });
        BarraBotoes.add(BotaoExcel);
        BarraBotoes.add(jSeparator4);

        BotaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/sair.png"))); // NOI18N
        BotaoSair.setText("Sair (ESC)");
        BotaoSair.setToolTipText("Sair (ESC)");
        BotaoSair.setFocusable(false);
        BotaoSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });
        BarraBotoes.add(BotaoSair);
        BarraBotoes.add(jSeparator5);

        javax.swing.GroupLayout PainelInícioLayout = new javax.swing.GroupLayout(PainelInício);
        PainelInício.setLayout(PainelInícioLayout);
        PainelInícioLayout.setHorizontalGroup(
            PainelInícioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
        );
        PainelInícioLayout.setVerticalGroup(
            PainelInícioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        PainelTabulado.addTab("Início (F1)", new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/home_page.png")), PainelInício); // NOI18N

        PainelCadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BarraFerramentasCadastros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BarraFerramentasCadastros.setFloatable(false);
        BarraFerramentasCadastros.setRollover(true);
        BarraFerramentasCadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BotaoCadastrarAnimais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/vaca.png"))); // NOI18N
        BotaoCadastrarAnimais.setText("Animais");
        BotaoCadastrarAnimais.setToolTipText("Cadastro de Animais!");
        BotaoCadastrarAnimais.setFocusable(false);
        BotaoCadastrarAnimais.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoCadastrarAnimais.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoCadastrarAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarAnimaisActionPerformed(evt);
            }
        });
        BarraFerramentasCadastros.add(BotaoCadastrarAnimais);
        BarraFerramentasCadastros.add(jSeparator7);

        BotaoCadastrarVacinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/vacina.png"))); // NOI18N
        BotaoCadastrarVacinas.setText("Vacinas");
        BotaoCadastrarVacinas.setToolTipText("Cadastro de Vacinas!");
        BotaoCadastrarVacinas.setFocusable(false);
        BotaoCadastrarVacinas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoCadastrarVacinas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoCadastrarVacinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarVacinasActionPerformed(evt);
            }
        });
        BarraFerramentasCadastros.add(BotaoCadastrarVacinas);
        BarraFerramentasCadastros.add(jSeparator11);

        BotaoCadastrarLeites.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/leite.png"))); // NOI18N
        BotaoCadastrarLeites.setText("Leite");
        BotaoCadastrarLeites.setToolTipText("Cadastro de Leite!");
        BotaoCadastrarLeites.setFocusable(false);
        BotaoCadastrarLeites.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoCadastrarLeites.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoCadastrarLeites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarLeitesActionPerformed(evt);
            }
        });
        BarraFerramentasCadastros.add(BotaoCadastrarLeites);
        BarraFerramentasCadastros.add(jSeparator12);

        BotaoCadastrarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/cliente.png"))); // NOI18N
        BotaoCadastrarClientes.setText("Clientes");
        BotaoCadastrarClientes.setToolTipText("Cadastro de Clientes!");
        BotaoCadastrarClientes.setFocusable(false);
        BotaoCadastrarClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoCadastrarClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoCadastrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarClientesActionPerformed(evt);
            }
        });
        BarraFerramentasCadastros.add(BotaoCadastrarClientes);
        BarraFerramentasCadastros.add(jSeparator13);

        BotaoCadastrarProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/produtos.png"))); // NOI18N
        BotaoCadastrarProdutos.setText("Produtos");
        BotaoCadastrarProdutos.setToolTipText("Cadastro de Produtos!");
        BotaoCadastrarProdutos.setFocusable(false);
        BotaoCadastrarProdutos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoCadastrarProdutos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarProdutosActionPerformed(evt);
            }
        });
        BarraFerramentasCadastros.add(BotaoCadastrarProdutos);
        BarraFerramentasCadastros.add(jSeparator23);

        javax.swing.GroupLayout PainelCadastrosLayout = new javax.swing.GroupLayout(PainelCadastros);
        PainelCadastros.setLayout(PainelCadastrosLayout);
        PainelCadastrosLayout.setHorizontalGroup(
            PainelCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraFerramentasCadastros, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
        );
        PainelCadastrosLayout.setVerticalGroup(
            PainelCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraFerramentasCadastros, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        PainelTabulado.addTab("Cadastros (F2)", new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/application_form_edit.png")), PainelCadastros); // NOI18N

        PainelVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BarraFerramentasVendas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BarraFerramentasVendas.setFloatable(false);
        BarraFerramentasVendas.setRollover(true);
        BarraFerramentasVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BotaoVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/leite.png"))); // NOI18N
        BotaoVendas.setText("Vendas");
        BotaoVendas.setToolTipText("Vendas!");
        BotaoVendas.setFocusable(false);
        BotaoVendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoVendas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVendasActionPerformed(evt);
            }
        });
        BarraFerramentasVendas.add(BotaoVendas);
        BarraFerramentasVendas.add(jSeparator8);

        javax.swing.GroupLayout PainelVendasLayout = new javax.swing.GroupLayout(PainelVendas);
        PainelVendas.setLayout(PainelVendasLayout);
        PainelVendasLayout.setHorizontalGroup(
            PainelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraFerramentasVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
        );
        PainelVendasLayout.setVerticalGroup(
            PainelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraFerramentasVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        PainelTabulado.addTab("Vendas (F3)", new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/coins.png")), PainelVendas); // NOI18N

        PainelContas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BarraFerramentasContas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BarraFerramentasContas.setFloatable(false);
        BarraFerramentasContas.setRollover(true);
        BarraFerramentasContas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BotaoContas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/financeiro.png"))); // NOI18N
        BotaoContas.setText("A Receber");
        BotaoContas.setToolTipText("Contas a Receber!");
        BotaoContas.setFocusable(false);
        BotaoContas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoContas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoContasActionPerformed(evt);
            }
        });
        BarraFerramentasContas.add(BotaoContas);
        BarraFerramentasContas.add(jSeparator9);

        javax.swing.GroupLayout PainelContasLayout = new javax.swing.GroupLayout(PainelContas);
        PainelContas.setLayout(PainelContasLayout);
        PainelContasLayout.setHorizontalGroup(
            PainelContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraFerramentasContas, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
        );
        PainelContasLayout.setVerticalGroup(
            PainelContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraFerramentasContas, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        PainelTabulado.addTab("Contas (F4)", new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/finance.png")), PainelContas); // NOI18N

        PainelRelatórios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BarraFerramentasRelatórios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BarraFerramentasRelatórios.setFloatable(false);
        BarraFerramentasRelatórios.setRollover(true);
        BarraFerramentasRelatórios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BotaoRelatoriosAnimais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/relatorio-animais.png"))); // NOI18N
        BotaoRelatoriosAnimais.setText("Animais");
        BotaoRelatoriosAnimais.setToolTipText("Relatório de Animais!");
        BotaoRelatoriosAnimais.setFocusable(false);
        BotaoRelatoriosAnimais.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoRelatoriosAnimais.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoRelatoriosAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRelatoriosAnimaisActionPerformed(evt);
            }
        });
        BarraFerramentasRelatórios.add(BotaoRelatoriosAnimais);
        BarraFerramentasRelatórios.add(jSeparator10);

        BotaoRelatoriosVacinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/relatorio-vacinas.png"))); // NOI18N
        BotaoRelatoriosVacinas.setText("Vacinas");
        BotaoRelatoriosVacinas.setToolTipText("Relatório de Vacinas!");
        BotaoRelatoriosVacinas.setFocusable(false);
        BotaoRelatoriosVacinas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoRelatoriosVacinas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoRelatoriosVacinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRelatoriosVacinasActionPerformed(evt);
            }
        });
        BarraFerramentasRelatórios.add(BotaoRelatoriosVacinas);
        BarraFerramentasRelatórios.add(jSeparator15);

        BotaoRelatoriosClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/relatorio-clientes.png"))); // NOI18N
        BotaoRelatoriosClientes.setText("Clientes");
        BotaoRelatoriosClientes.setToolTipText("Relatório de Clientes!");
        BotaoRelatoriosClientes.setFocusable(false);
        BotaoRelatoriosClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoRelatoriosClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoRelatoriosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRelatoriosClientesActionPerformed(evt);
            }
        });
        BarraFerramentasRelatórios.add(BotaoRelatoriosClientes);
        BarraFerramentasRelatórios.add(jSeparator16);

        BotaoRelatoriosLeites.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/relatorio-leites.png"))); // NOI18N
        BotaoRelatoriosLeites.setText("Leites");
        BotaoRelatoriosLeites.setToolTipText("Relatório de Leites!");
        BotaoRelatoriosLeites.setFocusable(false);
        BotaoRelatoriosLeites.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoRelatoriosLeites.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoRelatoriosLeites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRelatoriosLeitesActionPerformed(evt);
            }
        });
        BarraFerramentasRelatórios.add(BotaoRelatoriosLeites);
        BarraFerramentasRelatórios.add(jSeparator17);

        BotaoRelatoriosVendasLeites.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/relatorio-vendas-leite.png"))); // NOI18N
        BotaoRelatoriosVendasLeites.setText("Vendas de Leites");
        BotaoRelatoriosVendasLeites.setToolTipText("Relatório de Vendas de Leite!");
        BotaoRelatoriosVendasLeites.setFocusable(false);
        BotaoRelatoriosVendasLeites.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoRelatoriosVendasLeites.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoRelatoriosVendasLeites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRelatoriosVendasLeitesActionPerformed(evt);
            }
        });
        BarraFerramentasRelatórios.add(BotaoRelatoriosVendasLeites);
        BarraFerramentasRelatórios.add(jSeparator19);

        BotaoRelatoriosContas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/relatorio-financeiro.png"))); // NOI18N
        BotaoRelatoriosContas.setText("Contas à receber");
        BotaoRelatoriosContas.setToolTipText("Relatório de Contas à Receber!");
        BotaoRelatoriosContas.setFocusable(false);
        BotaoRelatoriosContas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoRelatoriosContas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoRelatoriosContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRelatoriosContasActionPerformed(evt);
            }
        });
        BarraFerramentasRelatórios.add(BotaoRelatoriosContas);
        BarraFerramentasRelatórios.add(jSeparator20);

        javax.swing.GroupLayout PainelRelatóriosLayout = new javax.swing.GroupLayout(PainelRelatórios);
        PainelRelatórios.setLayout(PainelRelatóriosLayout);
        PainelRelatóriosLayout.setHorizontalGroup(
            PainelRelatóriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraFerramentasRelatórios, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
        );
        PainelRelatóriosLayout.setVerticalGroup(
            PainelRelatóriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraFerramentasRelatórios, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        PainelTabulado.addTab("Relatórios (F5)", new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/page_paste.png")), PainelRelatórios); // NOI18N

        PainelBackup.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BarraFerramentasBackup.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BarraFerramentasBackup.setFloatable(false);
        BarraFerramentasBackup.setRollover(true);
        BarraFerramentasBackup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BotaoBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/dataBackup.png"))); // NOI18N
        BotaoBackup.setText("Backup");
        BotaoBackup.setToolTipText("Backup");
        BotaoBackup.setFocusable(false);
        BotaoBackup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoBackup.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBackupActionPerformed(evt);
            }
        });
        BarraFerramentasBackup.add(BotaoBackup);
        BarraFerramentasBackup.add(jSeparator14);

        BotaoRestaurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/dataRestore.png"))); // NOI18N
        BotaoRestaurar.setText("Restaurar");
        BotaoRestaurar.setToolTipText("Restaurar");
        BotaoRestaurar.setFocusable(false);
        BotaoRestaurar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoRestaurar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotaoRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRestaurarActionPerformed(evt);
            }
        });
        BarraFerramentasBackup.add(BotaoRestaurar);
        BarraFerramentasBackup.add(jSeparator18);

        javax.swing.GroupLayout PainelBackupLayout = new javax.swing.GroupLayout(PainelBackup);
        PainelBackup.setLayout(PainelBackupLayout);
        PainelBackupLayout.setHorizontalGroup(
            PainelBackupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraFerramentasBackup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
        );
        PainelBackupLayout.setVerticalGroup(
            PainelBackupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraFerramentasBackup, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        PainelTabulado.addTab("Backup (F6)", new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/dataBackup 16x16.png")), PainelBackup); // NOI18N

        BackGround.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Imagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/background.png"))); // NOI18N
        Imagem.setBounds(0, -6, 1020, 580);
        BackGround.add(Imagem, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelTabulado)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addComponent(PainelTabulado, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE))
        );

        BarraFerramentas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BarraFerramentas.setFloatable(false);
        BarraFerramentas.setRollover(true);

        Mensagem.setFont(new java.awt.Font("Tahoma", 0, 14));
        Mensagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/mensagem.gif"))); // NOI18N
        BarraFerramentas.add(Mensagem);
        BarraFerramentas.add(jSeparator6);

        Calendário.setFont(new java.awt.Font("Tahoma", 0, 14));
        Calendário.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/calendário.png"))); // NOI18N
        BarraFerramentas.add(Calendário);
        BarraFerramentas.add(jSeparator21);

        Relógio.setFont(new java.awt.Font("Tahoma", 0, 14));
        Relógio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/relóginho.png"))); // NOI18N
        Relógio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BarraFerramentas.add(Relógio);
        BarraFerramentas.add(jSeparator22);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("Tema Atual: ");
        BarraFerramentas.add(jLabel1);

        TemaAtual.setFont(new java.awt.Font("Tahoma", 1, 14));
        BarraFerramentas.add(TemaAtual);

        BarraMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        MenuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/arquivo.png"))); // NOI18N
        MenuArquivo.setText("Arquivo");
        MenuArquivo.setToolTipText("Arquivo");
        MenuArquivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        SubMenuInício.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        SubMenuInício.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/home_page.png"))); // NOI18N
        SubMenuInício.setText("Início");
        SubMenuInício.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SubMenuInício.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuInícioActionPerformed(evt);
            }
        });
        MenuArquivo.add(SubMenuInício);

        SubMenuCadastros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        SubMenuCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/application_form_edit.png"))); // NOI18N
        SubMenuCadastros.setText("Cadastros");
        SubMenuCadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SubMenuCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuCadastrosActionPerformed(evt);
            }
        });
        MenuArquivo.add(SubMenuCadastros);

        SubMenuVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        SubMenuVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/coins.png"))); // NOI18N
        SubMenuVendas.setText("Vendas");
        SubMenuVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SubMenuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuVendasActionPerformed(evt);
            }
        });
        MenuArquivo.add(SubMenuVendas);

        SubMenuContas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        SubMenuContas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/finance.png"))); // NOI18N
        SubMenuContas.setText("Contas");
        SubMenuContas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SubMenuContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuContasActionPerformed(evt);
            }
        });
        MenuArquivo.add(SubMenuContas);

        SubMenuRelatórios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        SubMenuRelatórios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/page_paste.png"))); // NOI18N
        SubMenuRelatórios.setText("Relatórios");
        SubMenuRelatórios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SubMenuRelatórios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuRelatóriosActionPerformed(evt);
            }
        });
        MenuArquivo.add(SubMenuRelatórios);

        SubMenuBackup.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        SubMenuBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/dataBackup 16x16.png"))); // NOI18N
        SubMenuBackup.setText("Backup");
        SubMenuBackup.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SubMenuBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuBackupActionPerformed(evt);
            }
        });
        MenuArquivo.add(SubMenuBackup);
        MenuArquivo.add(jSeparator25);

        MenuAplicativosSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/windows.png"))); // NOI18N
        MenuAplicativosSistema.setText("Aplicativos do Sistema");
        MenuAplicativosSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        SubMenuCalculadora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        SubMenuCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/calculadora 16x16.png"))); // NOI18N
        SubMenuCalculadora.setText("Calculadora");
        SubMenuCalculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SubMenuCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuCalculadoraActionPerformed(evt);
            }
        });
        MenuAplicativosSistema.add(SubMenuCalculadora);

        SubMenuInternet.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        SubMenuInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/internet 16x16.png"))); // NOI18N
        SubMenuInternet.setText("Internet");
        SubMenuInternet.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SubMenuInternet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuInternetActionPerformed(evt);
            }
        });
        MenuAplicativosSistema.add(SubMenuInternet);

        SubMenuMSOfficeWord.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_MASK));
        SubMenuMSOfficeWord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/word 16x16.png"))); // NOI18N
        SubMenuMSOfficeWord.setText("MS Office Word");
        SubMenuMSOfficeWord.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SubMenuMSOfficeWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuMSOfficeWordActionPerformed(evt);
            }
        });
        MenuAplicativosSistema.add(SubMenuMSOfficeWord);

        SubMenuMSOfficeExcel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        SubMenuMSOfficeExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/excel 16x16.png"))); // NOI18N
        SubMenuMSOfficeExcel.setText("MS Office Excel");
        SubMenuMSOfficeExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SubMenuMSOfficeExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuMSOfficeExcelActionPerformed(evt);
            }
        });
        MenuAplicativosSistema.add(SubMenuMSOfficeExcel);

        MenuArquivo.add(MenuAplicativosSistema);
        MenuArquivo.add(jSeparator24);

        SubMenuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        SubMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/sair 16x16.png"))); // NOI18N
        SubMenuSair.setText("Sair");
        SubMenuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SubMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuSairActionPerformed(evt);
            }
        });
        MenuArquivo.add(SubMenuSair);

        BarraMenu.add(MenuArquivo);

        MenuOpções.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/opções.png"))); // NOI18N
        MenuOpções.setText("Opções");
        MenuOpções.setToolTipText("Personalizar o Sistema");
        MenuOpções.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Temas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/temas.png"))); // NOI18N
        Temas.setText("Temas");
        Temas.setToolTipText("Temas");
        Temas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Synthetica.setText("Synthetica");
        Synthetica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        AluOxide.setText("Alu Oxide");
        AluOxide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AluOxideActionPerformed(evt);
            }
        });
        Synthetica.add(AluOxide);

        BlackEye.setText("Black Eye");
        BlackEye.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BlackEye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlackEyeActionPerformed(evt);
            }
        });
        Synthetica.add(BlackEye);

        BlackMoon.setText("Black Moon");
        BlackMoon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BlackMoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlackMoonActionPerformed(evt);
            }
        });
        Synthetica.add(BlackMoon);

        BlackStar.setText("Black Star");
        BlackStar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BlackStar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlackStarActionPerformed(evt);
            }
        });
        Synthetica.add(BlackStar);

        BlueIce.setText("Blue Ice");
        BlueIce.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BlueIce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlueIceActionPerformed(evt);
            }
        });
        Synthetica.add(BlueIce);

        BlueMoon.setText("Blue Moon");
        BlueMoon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BlueMoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlueMoonActionPerformed(evt);
            }
        });
        Synthetica.add(BlueMoon);

        BlueSteel.setText("Blue Steel");
        BlueSteel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BlueSteel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlueSteelActionPerformed(evt);
            }
        });
        Synthetica.add(BlueSteel);

        Classy.setText("Classy");
        Classy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Classy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassyActionPerformed(evt);
            }
        });
        Synthetica.add(Classy);

        GreenDream.setText("Green Dream");
        GreenDream.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        GreenDream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreenDreamActionPerformed(evt);
            }
        });
        Synthetica.add(GreenDream);

        MauveMetallic.setText("Mauve Metallic");
        MauveMetallic.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MauveMetallic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MauveMetallicActionPerformed(evt);
            }
        });
        Synthetica.add(MauveMetallic);

        OrangeMetallic.setText("Orange Metallic");
        OrangeMetallic.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        OrangeMetallic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrangeMetallicActionPerformed(evt);
            }
        });
        Synthetica.add(OrangeMetallic);

        SilverMoon.setText("Silver Moon");
        SilverMoon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SilverMoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SilverMoonActionPerformed(evt);
            }
        });
        Synthetica.add(SilverMoon);

        Simple2D.setText("Simple 2D");
        Simple2D.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Simple2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Simple2DActionPerformed(evt);
            }
        });
        Synthetica.add(Simple2D);

        SkyMetallic.setText("Sky Metallic");
        SkyMetallic.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SkyMetallic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkyMetallicActionPerformed(evt);
            }
        });
        Synthetica.add(SkyMetallic);

        WhiteVision.setText("White Vision");
        WhiteVision.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        WhiteVision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WhiteVisionActionPerformed(evt);
            }
        });
        Synthetica.add(WhiteVision);

        Temas.add(Synthetica);

        MenuOpções.add(Temas);

        BarraMenu.add(MenuOpções);

        MenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetotcc/imagens/information.png"))); // NOI18N
        MenuSobre.setText("Sobre");
        MenuSobre.setToolTipText("Sobre");
        MenuSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSobreMouseClicked(evt);
            }
        });
        BarraMenu.add(MenuSobre);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraFerramentas, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BarraFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleDescription("Venda de Leite - Tela Principal");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do sistema?", "Aviso do Sistema!", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            AtualizaTema();
            System.exit(0);
        }
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void BotaoCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCalculadoraActionPerformed
        // Incializa a Calculadora do Windows
        try {
            Runtime.getRuntime().exec("calc");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro! \nNão foi possível executar a Calculadora!", "Aviso do Sistema!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotaoCalculadoraActionPerformed

    private void BotaoInternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoInternetActionPerformed
        // Inicializa o navegador padrão do PC
        try {
            Runtime.getRuntime().exec("cmd.exe /C start http://www.google.com.br");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro! \nNão foi possível abrir o navegador de web!", "Aviso do Sistema!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotaoInternetActionPerformed

    private void BotaoWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoWordActionPerformed
        // Inicializa o Microsoft Office Word
        try {
            Runtime.getRuntime().exec("cmd.exe /C start winword.exe");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro! \nNão foi possível abrir o Microsoft Word!", "Aviso do Sistema!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotaoWordActionPerformed

    private void BotaoExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcelActionPerformed
        // Inicializa o Microsoft Office Excel
        try {
            Runtime.getRuntime().exec("cmd.exe /C start excel.exe");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro! \nNão foi possível abrir o Microsoft Excel!", "Aviso do Sistema!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotaoExcelActionPerformed

    private void BotaoCadastrarAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarAnimaisActionPerformed
        JFrame Janela = new JanelaAnimais();
        Janela.setIconImage(image);
        Janela.setLocationRelativeTo(null);
        Janela.setVisible(true);
    }//GEN-LAST:event_BotaoCadastrarAnimaisActionPerformed

    private void BotaoCadastrarVacinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarVacinasActionPerformed
        JFrame Janela = new JanelaVacinas();
        Janela.setIconImage(image);
        Janela.setLocationRelativeTo(null);
        Janela.setVisible(true);
    }//GEN-LAST:event_BotaoCadastrarVacinasActionPerformed

    private void BotaoCadastrarLeitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarLeitesActionPerformed
        JFrame Janela = new JanelaLeite();
        Janela.setIconImage(image);
        Janela.setLocationRelativeTo(null);
        Janela.setVisible(true);
    }//GEN-LAST:event_BotaoCadastrarLeitesActionPerformed

    private void BotaoCadastrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarClientesActionPerformed
        JFrame Janela = new JanelaClientes();
        Janela.setIconImage(image);
        Janela.setLocationRelativeTo(null);
        Janela.setVisible(true);
    }//GEN-LAST:event_BotaoCadastrarClientesActionPerformed

    private void BotaoVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVendasActionPerformed
        JFrame Janela = new JanelaVendas();
        Janela.setIconImage(image);
        Janela.setLocationRelativeTo(null);
        Janela.setVisible(true);
    }//GEN-LAST:event_BotaoVendasActionPerformed

    private void BotaoContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoContasActionPerformed
        JFrame Janela = new JanelaContasReceber();
        Janela.setIconImage(image);
        Janela.setLocationRelativeTo(null);
        Janela.setVisible(true);
    }//GEN-LAST:event_BotaoContasActionPerformed

    private void BotaoRelatoriosAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRelatoriosAnimaisActionPerformed
//        JFrame Janela = new JanRelAnimais();
//        Janela.setIconImage(image);
//        Janela.setLocationRelativeTo(null);
//        Janela.setVisible(true);
        AnimaisDAO aDAO = new AnimaisDAO();
    
    aDAO.relatorioAnimais();
    }//GEN-LAST:event_BotaoRelatoriosAnimaisActionPerformed

    private void BotaoRelatoriosVacinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRelatoriosVacinasActionPerformed
        JFrame Janela = new JanRelVacinas();
        Janela.setIconImage(image);
        Janela.setLocationRelativeTo(null);
        Janela.setVisible(true);
    }//GEN-LAST:event_BotaoRelatoriosVacinasActionPerformed

    private void BotaoRelatoriosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRelatoriosClientesActionPerformed
        JFrame Janela = new JanRelClientes();
        Janela.setIconImage(image);
        Janela.setLocationRelativeTo(null);
        Janela.setVisible(true);
    }//GEN-LAST:event_BotaoRelatoriosClientesActionPerformed

    private void BotaoRelatoriosLeitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRelatoriosLeitesActionPerformed
        JFrame Janela = new JanRelLeite();
        Janela.setIconImage(image);
        Janela.setLocationRelativeTo(null);
        Janela.setVisible(true);
    }//GEN-LAST:event_BotaoRelatoriosLeitesActionPerformed

    private void BotaoRelatoriosVendasLeitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRelatoriosVendasLeitesActionPerformed
        JFrame Janela = new JanRelVendas();
        Janela.setIconImage(image);
        Janela.setLocationRelativeTo(null);
        Janela.setVisible(true);
    }//GEN-LAST:event_BotaoRelatoriosVendasLeitesActionPerformed

    private void BotaoRelatoriosContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRelatoriosContasActionPerformed
        JFrame Janela = new JanRelContasRecebe();
        Janela.setIconImage(image);
        Janela.setLocationRelativeTo(null);
        Janela.setVisible(true);
    }//GEN-LAST:event_BotaoRelatoriosContasActionPerformed

    private void BlackEyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlackEyeActionPerformed
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        TemaAtual.setText("BlackEye");
        AtualizaTema();
    }//GEN-LAST:event_BlackEyeActionPerformed

    private void BlackMoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlackMoonActionPerformed
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        TemaAtual.setText("BlackMoon");
        AtualizaTema();
    }//GEN-LAST:event_BlackMoonActionPerformed

    private void BlackStarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlackStarActionPerformed
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        TemaAtual.setText("BlackStar");
        AtualizaTema();
    }//GEN-LAST:event_BlackStarActionPerformed

    private void BlueIceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlueIceActionPerformed
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        TemaAtual.setText("BlueIce");
        AtualizaTema();
    }//GEN-LAST:event_BlueIceActionPerformed

    private void BlueMoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlueMoonActionPerformed
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlueMoonLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        TemaAtual.setText("BlueMoon");
        AtualizaTema();
    }//GEN-LAST:event_BlueMoonActionPerformed

    private void BlueSteelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlueSteelActionPerformed
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlueSteelLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        TemaAtual.setText("BlueSteel");
        AtualizaTema();
    }//GEN-LAST:event_BlueSteelActionPerformed

    private void ClassyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassyActionPerformed
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaClassyLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        TemaAtual.setText("Classy");
        AtualizaTema();
    }//GEN-LAST:event_ClassyActionPerformed

    private void GreenDreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreenDreamActionPerformed
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaGreenDreamLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        TemaAtual.setText("GreenDream");
        AtualizaTema();
    }//GEN-LAST:event_GreenDreamActionPerformed

    private void MauveMetallicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MauveMetallicActionPerformed
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaMauveMetallicLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        TemaAtual.setText("MauveMetallic");
        AtualizaTema();
    }//GEN-LAST:event_MauveMetallicActionPerformed

    private void OrangeMetallicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrangeMetallicActionPerformed
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        TemaAtual.setText("OrangeMetallic");
        AtualizaTema();
    }//GEN-LAST:event_OrangeMetallicActionPerformed

    private void SilverMoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SilverMoonActionPerformed
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaSilverMoonLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        TemaAtual.setText("SilverMoon");
        AtualizaTema();
    }//GEN-LAST:event_SilverMoonActionPerformed

    private void Simple2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Simple2DActionPerformed
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaSimple2DLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        TemaAtual.setText("Simple2D");
        AtualizaTema();
    }//GEN-LAST:event_Simple2DActionPerformed

    private void SkyMetallicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkyMetallicActionPerformed
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaSkyMetallicLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        TemaAtual.setText("SkyMetallic");
        AtualizaTema();
    }//GEN-LAST:event_SkyMetallicActionPerformed

    private void WhiteVisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WhiteVisionActionPerformed
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaWhiteVisionLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        TemaAtual.setText("WhiteVision");
        AtualizaTema();
    }//GEN-LAST:event_WhiteVisionActionPerformed

    private void BotaoCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarProdutosActionPerformed
        JFrame Janela = new JanelaProdutos();
        Janela.setIconImage(image);
        Janela.setLocationRelativeTo(null);
        Janela.setVisible(true);
    }//GEN-LAST:event_BotaoCadastrarProdutosActionPerformed

    private void BotaoBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBackupActionPerformed
        try {
            String mysqldump = "C:\\xampp\\mysql\\bin\\mysqldump.exe";
            Date hoje = new Date();
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            String databackup = String.valueOf(df.format(hoje));
            ProcessBuilder pb = new ProcessBuilder(mysqldump, "--user=root", "--password=", "bdleite", "--result-file=backup\\backupbdleite" + databackup + ".sql");
            pb.start();
        } catch (IOException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoBackupActionPerformed

    private void BotaoRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRestaurarActionPerformed
        try {
            JFileChooser jfc = new JFileChooser();
            jfc.setCurrentDirectory(new java.io.File("."));
            jfc.setDialogTitle("Escolha o backup para Restaurar");
            jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                String diretorio = jfc.getCurrentDirectory().getAbsolutePath();
                String arquivo = jfc.getSelectedFile().getName();
                Runtime.getRuntime().exec("cmd.exe /C start C:\\xampp\\mysql\\bin\\mysqldump.exe -hlocalhost -uroot -p bdleite < " + diretorio + "\\" + arquivo);
            }
        } catch (IOException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoRestaurarActionPerformed

    private void SubMenuInícioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuInícioActionPerformed
        PainelTabulado.setSelectedIndex(0);
    }//GEN-LAST:event_SubMenuInícioActionPerformed

    private void SubMenuCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuCadastrosActionPerformed
        PainelTabulado.setSelectedIndex(1);
    }//GEN-LAST:event_SubMenuCadastrosActionPerformed

    private void SubMenuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuVendasActionPerformed
        PainelTabulado.setSelectedIndex(2);
    }//GEN-LAST:event_SubMenuVendasActionPerformed

    private void SubMenuContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuContasActionPerformed
        PainelTabulado.setSelectedIndex(3);
    }//GEN-LAST:event_SubMenuContasActionPerformed

    private void SubMenuRelatóriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuRelatóriosActionPerformed
        PainelTabulado.setSelectedIndex(4);
    }//GEN-LAST:event_SubMenuRelatóriosActionPerformed

    private void SubMenuBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuBackupActionPerformed
        PainelTabulado.setSelectedIndex(5);
    }//GEN-LAST:event_SubMenuBackupActionPerformed

    private void SubMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuSairActionPerformed
        BotaoSairActionPerformed(evt);
    }//GEN-LAST:event_SubMenuSairActionPerformed

    private void SubMenuCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuCalculadoraActionPerformed
        BotaoCalculadoraActionPerformed(evt);
    }//GEN-LAST:event_SubMenuCalculadoraActionPerformed

    private void SubMenuInternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuInternetActionPerformed
        BotaoInternetActionPerformed(evt);
    }//GEN-LAST:event_SubMenuInternetActionPerformed

    private void SubMenuMSOfficeWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuMSOfficeWordActionPerformed
        BotaoWordActionPerformed(evt);
    }//GEN-LAST:event_SubMenuMSOfficeWordActionPerformed

    private void SubMenuMSOfficeExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuMSOfficeExcelActionPerformed
        BotaoExcelActionPerformed(evt);
    }//GEN-LAST:event_SubMenuMSOfficeExcelActionPerformed

    private void AluOxideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AluOxideActionPerformed
       UIManager.put("Synthetica.window.decoration", Boolean.FALSE);
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        TemaAtual.setText("AluOxide");
        AtualizaTema();
    }//GEN-LAST:event_AluOxideActionPerformed

    private void MenuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSobreMouseClicked
        JFrame Janela = new JanelaSobre();
        Janela.setIconImage(image);
        Janela.setLocationRelativeTo(null);
        Janela.setVisible(true);
    }//GEN-LAST:event_MenuSobreMouseClicked

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AluOxide;
    private javax.swing.JLayeredPane BackGround;
    private javax.swing.JToolBar BarraBotoes;
    private javax.swing.JToolBar BarraFerramentas;
    private javax.swing.JToolBar BarraFerramentasBackup;
    private javax.swing.JToolBar BarraFerramentasCadastros;
    private javax.swing.JToolBar BarraFerramentasContas;
    private javax.swing.JToolBar BarraFerramentasRelatórios;
    private javax.swing.JToolBar BarraFerramentasVendas;
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenuItem BlackEye;
    private javax.swing.JMenuItem BlackMoon;
    private javax.swing.JMenuItem BlackStar;
    private javax.swing.JMenuItem BlueIce;
    private javax.swing.JMenuItem BlueMoon;
    private javax.swing.JMenuItem BlueSteel;
    private javax.swing.JButton BotaoBackup;
    private javax.swing.JButton BotaoCadastrarAnimais;
    private javax.swing.JButton BotaoCadastrarClientes;
    private javax.swing.JButton BotaoCadastrarLeites;
    private javax.swing.JButton BotaoCadastrarProdutos;
    private javax.swing.JButton BotaoCadastrarVacinas;
    private javax.swing.JButton BotaoCalculadora;
    private javax.swing.JButton BotaoContas;
    private javax.swing.JButton BotaoExcel;
    private javax.swing.JButton BotaoInternet;
    private javax.swing.JButton BotaoRelatoriosAnimais;
    private javax.swing.JButton BotaoRelatoriosClientes;
    private javax.swing.JButton BotaoRelatoriosContas;
    private javax.swing.JButton BotaoRelatoriosLeites;
    private javax.swing.JButton BotaoRelatoriosVacinas;
    private javax.swing.JButton BotaoRelatoriosVendasLeites;
    private javax.swing.JButton BotaoRestaurar;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JButton BotaoVendas;
    private javax.swing.JButton BotaoWord;
    private javax.swing.JLabel Calendário;
    private javax.swing.JMenuItem Classy;
    private javax.swing.JMenuItem GreenDream;
    private javax.swing.JLabel Imagem;
    private javax.swing.JMenuItem MauveMetallic;
    private javax.swing.JLabel Mensagem;
    private javax.swing.JMenu MenuAplicativosSistema;
    private javax.swing.JMenu MenuArquivo;
    private javax.swing.JMenu MenuOpções;
    private javax.swing.JMenu MenuSobre;
    private javax.swing.JMenuItem OrangeMetallic;
    private javax.swing.JPanel Painel;
    private javax.swing.JPanel PainelBackup;
    private javax.swing.JPanel PainelCadastros;
    private javax.swing.JPanel PainelContas;
    private javax.swing.JPanel PainelInício;
    private javax.swing.JPanel PainelRelatórios;
    private javax.swing.JTabbedPane PainelTabulado;
    private javax.swing.JPanel PainelVendas;
    private javax.swing.JLabel Relógio;
    private javax.swing.JMenuItem SilverMoon;
    private javax.swing.JMenuItem Simple2D;
    private javax.swing.JMenuItem SkyMetallic;
    private javax.swing.JMenuItem SubMenuBackup;
    private javax.swing.JMenuItem SubMenuCadastros;
    private javax.swing.JMenuItem SubMenuCalculadora;
    private javax.swing.JMenuItem SubMenuContas;
    private javax.swing.JMenuItem SubMenuInternet;
    private javax.swing.JMenuItem SubMenuInício;
    private javax.swing.JMenuItem SubMenuMSOfficeExcel;
    private javax.swing.JMenuItem SubMenuMSOfficeWord;
    private javax.swing.JMenuItem SubMenuRelatórios;
    private javax.swing.JMenuItem SubMenuSair;
    private javax.swing.JMenuItem SubMenuVendas;
    private javax.swing.JMenu Synthetica;
    private javax.swing.JLabel TemaAtual;
    private javax.swing.JMenu Temas;
    private javax.swing.JMenuItem WhiteVision;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JToolBar.Separator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator16;
    private javax.swing.JToolBar.Separator jSeparator17;
    private javax.swing.JToolBar.Separator jSeparator18;
    private javax.swing.JToolBar.Separator jSeparator19;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator20;
    private javax.swing.JToolBar.Separator jSeparator21;
    private javax.swing.JToolBar.Separator jSeparator22;
    private javax.swing.JToolBar.Separator jSeparator23;
    private javax.swing.JPopupMenu.Separator jSeparator24;
    private javax.swing.JPopupMenu.Separator jSeparator25;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    // End of variables declaration//GEN-END:variables

    private void Mensagem() {
        String usuario = System.getProperty("user.name");
        Mensagem.setText("Bem vindo ao Sistema " + usuario + "!");
        TemasDAO tDAO = new TemasDAO();
        Tbltema tbltema;
        int codigo = tDAO.primeiroTema();
        tbltema = tDAO.carregaTema(codigo);
        String tema = tbltema.getNomeTema();
        TemaAtual.setText("" + tema);
    }

    private void AtualizaTema() {
        TemasDAO tDAO = new TemasDAO();
        Tbltema tbltema = new Tbltema();
        tbltema.setCodTema(1);
        tbltema.setNomeTema(TemaAtual.getText().trim());
        tDAO.atulizaTema(tbltema);
    }
}