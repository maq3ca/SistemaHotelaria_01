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
        
  /* Comando para fazer com que a tela fique no tamanho do      
   * monitor que estiver sendo utilizado. 
  */
        setExtendedState(MAXIMIZED_BOTH);
  
        
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
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
        jMenu20 = new javax.swing.JMenu();
        jMenuReservasCadastrar = new javax.swing.JMenu();
        jMenuReservasConsultar = new javax.swing.JMenu();
        jMenuReservasFinalizar = new javax.swing.JMenu();
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
        jMenu6 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuSewgurancaFazerBackup = new javax.swing.JMenu();
        jMenuSegurancaRestaurarBackup = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuFerramentasTelaFundo = new javax.swing.JMenu();
        jMenuFerramentasSobreSistema = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaHotel/Imagem/Hotel-256.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(new ImageIcon(getClass().getResource("/br/com/SistemaHotel/Imagem/frame.png")).getImage());
        setResizable(false);

        jLabel1.setText("Sistema Hotel - Desenvolvido por Ricardo Marques - todos os direitos reservado - 2022 ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(273, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(282, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));

        jPanel2.setPreferredSize(new java.awt.Dimension(132, 300));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 174, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaHotel/Imagem/Report-Edit-32.png"))); // NOI18N
        jMenu1.setText("Cadastros   |");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaHotel/Imagem/User_20.png"))); // NOI18N
        jMenu9.setText("Hospedes");

        jMenuItemCadCadastrarHosp.setText("Cadastrar");
        jMenu9.add(jMenuItemCadCadastrarHosp);

        jMenuItemCadConsultarHosp.setText("Consultar");
        jMenu9.add(jMenuItemCadConsultarHosp);

        jMenu1.add(jMenu9);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaHotel/Imagem/Bed-20.png"))); // NOI18N
        jMenu10.setText("Quartos");

        jMenuItemCadCadastrarQuar.setText("Cadastrar");
        jMenu10.add(jMenuItemCadCadastrarQuar);

        jMenuItemCadConsultarQuar.setText("Consultar");
        jMenu10.add(jMenuItemCadConsultarQuar);

        jMenu1.add(jMenu10);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaHotel/Imagem/Red-Stripes-Tie-32.png"))); // NOI18N
        jMenu11.setText("Funcionarios");

        jMenuItemCadCadastrarFunc.setText("Cadastrar");
        jMenu11.add(jMenuItemCadCadastrarFunc);

        jMenuItemCadConsultarFunc.setText("Consultar");
        jMenu11.add(jMenuItemCadConsultarFunc);

        jMenu1.add(jMenu11);

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaHotel/Imagem/User-32 (2).png"))); // NOI18N
        jMenu12.setText("Fornecedores");

        jMenuItemCadCadastrarFornec.setText("Cadastrar");
        jMenu12.add(jMenuItemCadCadastrarFornec);

        jMenuItemCadConsultarFornec.setText("Consultar");
        jMenu12.add(jMenuItemCadConsultarFornec);

        jMenu1.add(jMenu12);

        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaHotel/Imagem/Shopcart_32.png"))); // NOI18N
        jMenu13.setText("Produtos");

        jMenuItemCadCadastrarProd.setText("Cadastrar");
        jMenu13.add(jMenuItemCadCadastrarProd);

        jMenuItemCadConsultarProd.setText("Consultar");
        jMenu13.add(jMenuItemCadConsultarProd);

        jMenu1.add(jMenu13);

        jMenu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaHotel/Imagem/Services_32.png"))); // NOI18N
        jMenu14.setText("Serviços");

        jMenuItemCadCadastrarServ.setText("Cadastrar");
        jMenu14.add(jMenuItemCadCadastrarServ);

        jMenuItemCadConsultarServ.setText("Consultar");
        jMenu14.add(jMenuItemCadConsultarServ);

        jMenu1.add(jMenu14);

        jMenuBar1.add(jMenu1);

        jMenu20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaHotel/Imagem/Calendar-32.png"))); // NOI18N
        jMenu20.setText("Reservas   |");
        jMenu20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuReservasCadastrar.setText("Cadastrar Reservas");
        jMenu20.add(jMenuReservasCadastrar);

        jMenuReservasConsultar.setText("Consultar Reservas");
        jMenu20.add(jMenuReservasConsultar);

        jMenuReservasFinalizar.setText("Finalizar Reservas");
        jMenu20.add(jMenuReservasFinalizar);

        jMenuBar1.add(jMenu20);

        jMenuVendasProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaHotel/Imagem/Custom-reports-32.png"))); // NOI18N
        jMenuVendasProdutos.setText("Vendas   |");
        jMenuVendasProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItemVendasCadReservas.setText("Cadastrar Reservas");
        jMenuVendasProdutos.add(jMenuItemVendasCadReservas);

        jMenuItemVendasConReservas.setText("Consultar Reservas");
        jMenuVendasProdutos.add(jMenuItemVendasConReservas);

        jMenuBar1.add(jMenuVendasProdutos);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaHotel/Imagem/money_32.png"))); // NOI18N
        jMenu4.setText("Financeiro   |");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaHotel/Imagem/Report-32.png"))); // NOI18N
        jMenu5.setText("Relatórios   |");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenu6.setText("Financeiros");
        jMenu5.add(jMenu6);

        jMenu15.setText("Reservas");
        jMenu5.add(jMenu15);

        jMenu16.setText("Vendas");
        jMenu5.add(jMenu16);

        jMenu17.setText("Hospedes");
        jMenu5.add(jMenu17);

        jMenu18.setText("Funcionários");
        jMenu5.add(jMenu18);

        jMenu19.setText("Fornecedores");
        jMenu5.add(jMenu19);

        jMenuBar1.add(jMenu5);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaHotel/Imagem/Open-safety-box-32.png"))); // NOI18N
        jMenu7.setText("Segurança   |");
        jMenu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuSewgurancaFazerBackup.setText("Fazer Backup");
        jMenu7.add(jMenuSewgurancaFazerBackup);

        jMenuSegurancaRestaurarBackup.setText("Restaurar Backup");
        jMenu7.add(jMenuSegurancaRestaurarBackup);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaHotel/Imagem/Gear_32.png"))); // NOI18N
        jMenu8.setText("Ferramentas   |");
        jMenu8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuFerramentasTelaFundo.setText("Tela Fundo");
        jMenu8.add(jMenuFerramentasTelaFundo);

        jMenuFerramentasSobreSistema.setText("Sobre o Sistema");
        jMenu8.add(jMenuFerramentasSobreSistema);

        jMenuBar1.add(jMenu8);

        jMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/SistemaHotel/Imagem/Exit-32 (1).png"))); // NOI18N
        jMenuSair.setText("Sair");
        jMenuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1029, 437));
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFerramentasSobreSistema;
    private javax.swing.JMenu jMenuFerramentasTelaFundo;
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
    private javax.swing.JMenu jMenuReservasCadastrar;
    private javax.swing.JMenu jMenuReservasConsultar;
    private javax.swing.JMenu jMenuReservasFinalizar;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuSegurancaRestaurarBackup;
    private javax.swing.JMenu jMenuSewgurancaFazerBackup;
    private javax.swing.JMenu jMenuVendasProdutos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

  }
