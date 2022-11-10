/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SistemaHotel.View;
import javax.swing.ImageIcon;


/**
 *
 * @author Marques
 */
public class JFrameTelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFrameTelaPrincipal
     */
    public JFrameTelaPrincipal() {
        initComponents();
        
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItemCadCadastrarHosp = new javax.swing.JMenuItem();
        jMenuItemCadConsultarHosp = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItemCadCadastrarQuar = new javax.swing.JMenuItem();
        jMenuItemCadConsultarQuar = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItemCadCadastrarFunc = new javax.swing.JMenuItem();
        jMenuItemCadConsultarFunc = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItemCadCadastrarFornec = new javax.swing.JMenuItem();
        jMenuItemCadConsultarFornec = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItemCadCadastrarProd = new javax.swing.JMenuItem();
        jMenuItemCadConsultarProd = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItemCadCadastrarServ = new javax.swing.JMenuItem();
        jMenuItemCadConsultarServ = new javax.swing.JMenuItem();
        jMenuVendasProdutos = new javax.swing.JMenu();
        jMenuItemVendasCadReservas = new javax.swing.JMenuItem();
        jMenuItemVendasConReservas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemFinanceiroContaPagarCad = new javax.swing.JMenuItem();
        jMenuItemFinanceiroContasPagarCon = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemFinanceiroContasReceberCad = new javax.swing.JMenuItem();
        jMenuItemFinanceiroContasReceberCon = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setIconImage(new ImageIcon(getClass().getResource("/br/com/SistemaHotel/Imagem/frame.png")).getImage());
        setResizable(false);

        jMenu1.setText("Cadastros   |");

        jMenu9.setText("Hospedes");

        jMenuItemCadCadastrarHosp.setText("Cadastrar");
        jMenu9.add(jMenuItemCadCadastrarHosp);

        jMenuItemCadConsultarHosp.setText("Consultar");
        jMenu9.add(jMenuItemCadConsultarHosp);

        jMenu1.add(jMenu9);

        jMenu10.setText("Quartos");

        jMenuItemCadCadastrarQuar.setText("Cadastrar");
        jMenu10.add(jMenuItemCadCadastrarQuar);

        jMenuItemCadConsultarQuar.setText("Consultar");
        jMenu10.add(jMenuItemCadConsultarQuar);

        jMenu1.add(jMenu10);

        jMenu11.setText("Funcionarios");

        jMenuItemCadCadastrarFunc.setText("Cadastrar");
        jMenu11.add(jMenuItemCadCadastrarFunc);

        jMenuItemCadConsultarFunc.setText("Consultar");
        jMenu11.add(jMenuItemCadConsultarFunc);

        jMenu1.add(jMenu11);

        jMenu12.setText("Fornecedores");

        jMenuItemCadCadastrarFornec.setText("Cadastrar");
        jMenu12.add(jMenuItemCadCadastrarFornec);

        jMenuItemCadConsultarFornec.setText("Consultar");
        jMenu12.add(jMenuItemCadConsultarFornec);

        jMenu1.add(jMenu12);

        jMenu13.setText("Produtos");

        jMenuItemCadCadastrarProd.setText("Cadastrar");
        jMenu13.add(jMenuItemCadCadastrarProd);

        jMenuItemCadConsultarProd.setText("Consultar");
        jMenu13.add(jMenuItemCadConsultarProd);

        jMenu1.add(jMenu13);

        jMenu14.setText("Serviços");

        jMenuItemCadCadastrarServ.setText("Cadastrar");
        jMenu14.add(jMenuItemCadCadastrarServ);

        jMenuItemCadConsultarServ.setText("Consultar");
        jMenu14.add(jMenuItemCadConsultarServ);

        jMenu1.add(jMenu14);

        jMenuBar1.add(jMenu1);

        jMenuVendasProdutos.setText("Vendas   |");

        jMenuItemVendasCadReservas.setText("Cadastrar Reservas");
        jMenuVendasProdutos.add(jMenuItemVendasCadReservas);

        jMenuItemVendasConReservas.setText("Consultar Reservas");
        jMenuVendasProdutos.add(jMenuItemVendasConReservas);

        jMenuBar1.add(jMenuVendasProdutos);

        jMenu4.setText("Financeiro   |");

        jMenu2.setText("Contas a Pagar");

        jMenuItemFinanceiroContaPagarCad.setText("Cadastrar");
        jMenu2.add(jMenuItemFinanceiroContaPagarCad);

        jMenuItemFinanceiroContasPagarCon.setText("Consultar");
        jMenu2.add(jMenuItemFinanceiroContasPagarCon);

        jMenu4.add(jMenu2);

        jMenu3.setText("Contas a Receber");

        jMenuItemFinanceiroContasReceberCad.setText("Cadastrar");
        jMenu3.add(jMenuItemFinanceiroContasReceberCad);

        jMenuItemFinanceiroContasReceberCon.setText("Consultar");
        jMenu3.add(jMenuItemFinanceiroContasReceberCon);

        jMenu4.add(jMenu3);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Relatórios   |");
        jMenuBar1.add(jMenu5);

        jMenu7.setText("Segurança   |");
        jMenuBar1.add(jMenu7);

        jMenu8.setText("Ferramentas   |");
        jMenuBar1.add(jMenu8);

        jMenuSair.setText("Sair");
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(729, 471));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCadCadastrarFornec;
    private javax.swing.JMenuItem jMenuItemCadCadastrarFunc;
    private javax.swing.JMenuItem jMenuItemCadCadastrarHosp;
    private javax.swing.JMenuItem jMenuItemCadCadastrarProd;
    private javax.swing.JMenuItem jMenuItemCadCadastrarQuar;
    private javax.swing.JMenuItem jMenuItemCadCadastrarServ;
    private javax.swing.JMenuItem jMenuItemCadConsultarFornec;
    private javax.swing.JMenuItem jMenuItemCadConsultarFunc;
    private javax.swing.JMenuItem jMenuItemCadConsultarHosp;
    private javax.swing.JMenuItem jMenuItemCadConsultarProd;
    private javax.swing.JMenuItem jMenuItemCadConsultarQuar;
    private javax.swing.JMenuItem jMenuItemCadConsultarServ;
    private javax.swing.JMenuItem jMenuItemFinanceiroContaPagarCad;
    private javax.swing.JMenuItem jMenuItemFinanceiroContasPagarCon;
    private javax.swing.JMenuItem jMenuItemFinanceiroContasReceberCad;
    private javax.swing.JMenuItem jMenuItemFinanceiroContasReceberCon;
    private javax.swing.JMenuItem jMenuItemVendasCadReservas;
    private javax.swing.JMenuItem jMenuItemVendasConReservas;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuVendasProdutos;
    // End of variables declaration//GEN-END:variables

  }
