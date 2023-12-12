package projetotcc.janelas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.w3c.dom.events.MouseEvent;
import projetotcc.tabelas.Tbltema;
import projetotcc.util.TemasDAO;

public class Main {

    JFrame JanelaPrincipal = new JanelaPrincipal();
    Image image = Toolkit.getDefaultToolkit().getImage("vaca.png");

    public Main() {
        final TrayIcon trayIcon;

        JanelaPrincipal.setLocationRelativeTo(null);
        JanelaPrincipal.setVisible(true);
        JanelaPrincipal.setExtendedState(JFrame.NORMAL);
        JanelaPrincipal.setIconImage(image);

        if (SystemTray.isSupported()) {
            SystemTray tray = SystemTray.getSystemTray();
            MouseAdapter mouseAdapter = new MouseAdapter() {

                public void mouseClicked(MouseEvent e) {
                    JOptionPane.showMessageDialog(null, "Tray Icon - Clicado!");
                }
            };

            ActionListener exitListener = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do sistema?", "Aviso do Sistema!", JOptionPane.YES_NO_OPTION);
                    if (opcao == JOptionPane.YES_OPTION) {
                        System.exit(0);
                    }
                }
            };

            ActionListener maxListener = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    JanelaPrincipal.setLocationRelativeTo(null);
                    JanelaPrincipal.setVisible(true);
                    JanelaPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
                }
            };

            ActionListener normalListener = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    JanelaPrincipal.setLocationRelativeTo(null);
                    JanelaPrincipal.setVisible(true);
                    JanelaPrincipal.setExtendedState(JFrame.NORMAL);
                }
            };

            ActionListener minListener = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    JanelaPrincipal.setLocationRelativeTo(null);
                    JanelaPrincipal.setVisible(true);
                    JanelaPrincipal.setExtendedState(JFrame.ICONIFIED);
                }
            };

            ActionListener JanelaAnimais = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    JFrame Janela = new JanelaAnimais();
                    Janela.setIconImage(image);
                    Janela.setLocationRelativeTo(null);
                    Janela.setVisible(true);
                    Janela.pack();
                }
            };

            ActionListener JanelaVacinas = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    JFrame Janela = new JanelaVacinas();
                    Janela.setIconImage(image);
                    Janela.setLocationRelativeTo(null);
                    Janela.setVisible(true);
                    Janela.pack();
                }
            };

            ActionListener JanelaLeite = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    JFrame Janela = new JanelaLeite();
                    Janela.setIconImage(image);
                    Janela.setLocationRelativeTo(null);
                    Janela.setVisible(true);
                    Janela.pack();
                }
            };

            ActionListener JanelaClientes = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    JFrame Janela = new JanelaClientes();
                    Janela.setIconImage(image);
                    Janela.setLocationRelativeTo(null);
                    Janela.setVisible(true);
                    Janela.pack();
                }
            };

            ActionListener JanelaProdutos = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    JFrame Janela = new JanelaProdutos();
                    Janela.setIconImage(image);
                    Janela.setLocationRelativeTo(null);
                    Janela.setVisible(true);
                    Janela.pack();
                }
            };

            PopupMenu popupMenu = new PopupMenu();
            Menu cadastros = new Menu("Cadastros");
            MenuItem animais = new MenuItem("Animais");
            animais.addActionListener(JanelaAnimais);
            MenuItem vacinas = new MenuItem("Vacinas");
            vacinas.addActionListener(JanelaVacinas);
            MenuItem leite = new MenuItem("Leite");
            leite.addActionListener(JanelaLeite);
            MenuItem clientes = new MenuItem("Clientes");
            clientes.addActionListener(JanelaClientes);
            MenuItem produtos = new MenuItem("Produtos");
            produtos.addActionListener(JanelaProdutos);
            //
            cadastros.add(animais);
            cadastros.add(vacinas);
            cadastros.add(leite);
            cadastros.add(clientes);
            cadastros.add(produtos);
            //
            MenuItem maximizar = new MenuItem("Maximizar");
            maximizar.addActionListener(maxListener);
            MenuItem normal = new MenuItem("Normal");
            normal.addActionListener(normalListener);
            MenuItem minimizar = new MenuItem("Minimizar");
            minimizar.addActionListener(minListener);
            MenuItem sair = new MenuItem("Sair");
            sair.addActionListener(exitListener);
            //
            popupMenu.add(cadastros);
            popupMenu.add(maximizar);
            popupMenu.add(normal);
            popupMenu.add(minimizar);
            popupMenu.add(sair);
            //
            trayIcon = new TrayIcon(image, "Venda de Leite", popupMenu);
            trayIcon.setImageAutoSize(true);
            trayIcon.addActionListener(normalListener);
            trayIcon.addMouseListener(mouseAdapter);
            try {
                tray.add(trayIcon);
            } catch (AWTException e) {
            }
        } else {
            System.err.println("System tray não suportado.");
        }
    }

    public static void main(String[] args) {
        TemasDAO tDAO = new TemasDAO();
        Tbltema tbltema;
        int codigo = tDAO.primeiroTema();
        tbltema = tDAO.carregaTema(codigo);
        String tema = tbltema.getNomeTema();
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.Synthetica" + tema + "LookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Main main = new Main();
    }
}