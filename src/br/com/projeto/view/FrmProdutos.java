/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.projeto.view;

import br.com.projeto.dao.ClienteDAO;
import br.com.projeto.dao.FornecedoresDAO;
import br.com.projeto.dao.FuncionariosDAO;
import br.com.projeto.dao.ProdutosDAO;
import br.com.projeto.model.Clientes;
import br.com.projeto.model.Fornecedores;
import br.com.projeto.model.Produtos;
import br.com.projeto.model.Utilitarios;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jonathan M4CH1NA
 */
public class FrmProdutos extends javax.swing.JFrame {

    public void listar() {
        ProdutosDAO dao = new ProdutosDAO();
        List<Produtos> lista = dao.listarProdutos();
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        dados.setNumRows(0); //Limpar a tabela

        for (Produtos c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
               c.getDescricao(),
               c.getPreco(),
               c.getEstoque(),
               c.getFornecedor().getNome(),
            });
        }
    }

    /**
     * Creates new form Frmcliente
     */
    public FrmProdutos() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painel_dados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtdescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpreco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnbusca = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        cbfornecedor = new javax.swing.JComboBox();
        txtqtdestoque = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtpesquisa = new javax.swing.JTextField();
        btnpesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btndeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Produtos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        painel_dados.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Codigo:");

        txtcodigo.setEditable(false);

        jLabel3.setText("Descricao");

        jLabel4.setText("Preco");

        jLabel5.setText("Qtd. Estoque");

        btnbusca.setText("Buscar");
        btnbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaActionPerformed(evt);
            }
        });

        jLabel17.setText("Fornecedor");

        cbfornecedor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbfornecedorAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbfornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbfornecedorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painel_dadosLayout = new javax.swing.GroupLayout(painel_dados);
        painel_dados.setLayout(painel_dadosLayout);
        painel_dadosLayout.setHorizontalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_dadosLayout.createSequentialGroup()
                                .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtqtdestoque, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painel_dadosLayout.createSequentialGroup()
                                .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnbusca))))
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(455, 760, Short.MAX_VALUE))
        );
        painel_dadosLayout.setVerticalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbusca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtqtdestoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cbfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados do Produto", painel_dados);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setText("Nome:");

        txtpesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpesquisaKeyPressed(evt);
            }
        });

        btnpesquisar.setText("Pesquisar");
        btnpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarActionPerformed(evt);
            }
        });

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descricao:", "Preco:", "Qtd Estoque:", "Fornecedor"
            }
        ));
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnpesquisar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta de Produtos", jPanel3);

        jButton2.setText("Novo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnsalvar.setText("SALVAR");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        btneditar.setText("EDITAR");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btndeletar.setText("DELETAR");
        btndeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnsalvar)
                .addGap(61, 61, 61)
                .addComponent(btneditar)
                .addGap(51, 51, 51)
                .addComponent(btndeletar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btndeletar, btneditar, btnsalvar, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalvar)
                    .addComponent(btneditar)
                    .addComponent(btndeletar)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 102, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btndeletar, btneditar, btnsalvar, jButton2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        // TODO add your handling code here:
        Produtos obj = new Produtos();
        obj.setDescricao(txtdescricao.getText());
        obj.setPreco(Double.parseDouble(txtpreco.getText()));
        obj.setEstoque(Integer.parseInt(txtqtdestoque.getText()));
        
        Fornecedores f = new Fornecedores();
        f = (Fornecedores) cbfornecedor.getSelectedItem();
        obj.setFornecedor(f);
        
        ProdutosDAO dao = new ProdutosDAO();
        dao.cadastrarProduto(obj);
        
        new Utilitarios().limpaTela(painel_dados);

    }//GEN-LAST:event_btnsalvarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0); //troca a guia das abas

        txtcodigo.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0).toString());
        txtdescricao.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 1).toString());
        txtpreco.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 2).toString());
        txtqtdestoque.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 3).toString());
        
        Fornecedores f = new Fornecedores();
        FornecedoresDAO dao = new FornecedoresDAO();
        
        f = dao.consultaPorNome(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 4).toString());
        cbfornecedor.removeAllItems();
        cbfornecedor.getModel().setSelectedItem(f);
    }//GEN-LAST:event_tabelaProdutosMouseClicked

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // TODO add your handling code here:
          Produtos obj = new Produtos();
          obj.setId(Integer.parseInt(txtcodigo.getText()));
          obj.setDescricao(txtdescricao.getText());
          obj.setPreco(Double.parseDouble(txtpreco.getText()));
          obj.setEstoque(Integer.parseInt(txtqtdestoque.getText()));

          Fornecedores f = new Fornecedores();
          f = (Fornecedores) cbfornecedor.getSelectedItem();
          obj.setFornecedor(f);

          ProdutosDAO dao = new ProdutosDAO();
          dao.alterarProduto(obj);

        new Utilitarios().limpaTela(painel_dados);
    }//GEN-LAST:event_btneditarActionPerformed

    private void btndeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletarActionPerformed
        // TODO add your handling code here:
        Produtos obj = new Produtos();

        obj.setId(Integer.parseInt(txtcodigo.getText()));

        ProdutosDAO dao = new ProdutosDAO();
        dao.exluirProduto(obj);
        new Utilitarios().limpaTela(painel_dados);
    }//GEN-LAST:event_btndeletarActionPerformed

    private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarActionPerformed
        // TODO add your handling code here:
        String nome = "%" + txtpesquisa.getText() + "%";

        ProdutosDAO dao = new ProdutosDAO();
        List<Produtos> lista = dao.listarProdutosPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        dados.setNumRows(0); //Limpar a tabela

        for (Produtos c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getDescricao(),
                c.getPreco(),
                c.getEstoque(),
                c.getFornecedor().getNome()
            });

        }
    }//GEN-LAST:event_btnpesquisarActionPerformed

    private void txtpesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisaKeyPressed
        // TODO add your handling code here:
        String nome = "%" + txtpesquisa.getText() + "%";

        ProdutosDAO dao = new ProdutosDAO();
        List<Produtos> lista = dao.listarProdutosPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        dados.setNumRows(0); //Limpar a tabela

        for (Produtos c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getDescricao(),
                c.getPreco(),
                c.getEstoque(),
                c.getFornecedor().getNome()
            });

        }
    }//GEN-LAST:event_txtpesquisaKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Utilitarios().limpaTela(painel_dados);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaActionPerformed
        // TODO add your handling code here:
        String nome = txtdescricao.getText();
        Produtos obj = new Produtos();
        ProdutosDAO dao = new ProdutosDAO();

        obj = dao.consultaPorNome(nome);
        
        if(obj.getDescricao() != null){
            txtcodigo.setText(String.valueOf(obj.getId()));
            txtdescricao.setText(obj.getDescricao());
            txtpreco.setText(String.valueOf(obj.getDescricao()));
            txtqtdestoque.setText(String.valueOf(obj.getEstoque()));
            
            Fornecedores f = new Fornecedores();
            FornecedoresDAO fdao = new FornecedoresDAO();
            
            f = fdao.consultaPorNome(obj.getFornecedor().getNome());
            cbfornecedor.getModel().setSelectedItem(f);
        }else{
            JOptionPane.showMessageDialog(null, "Produto nao encontrado");
        }
        
    }//GEN-LAST:event_btnbuscaActionPerformed

    private void cbfornecedorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbfornecedorAncestorAdded
        // TODO add your handling code here:
        FornecedoresDAO dao = new FornecedoresDAO();
        List<Fornecedores> listadefornecedores = dao.listarFornecedores();
        cbfornecedor.removeAll();
        
        for (Fornecedores f: listadefornecedores){
            cbfornecedor.addItem(f);
        }
    }//GEN-LAST:event_cbfornecedorAncestorAdded

    private void cbfornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbfornecedorMouseClicked
        // TODO add your handling code here:
        FornecedoresDAO dao = new FornecedoresDAO();
        List<Fornecedores> listadefornecedores = dao.listarFornecedores();
        cbfornecedor.removeAllItems();
        
        for(Fornecedores f : listadefornecedores){
            cbfornecedor.addItem(f);
        }
    }//GEN-LAST:event_cbfornecedorMouseClicked

    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbusca;
    private javax.swing.JButton btndeletar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnpesquisar;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JComboBox cbfornecedor;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel painel_dados;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescricao;
    private javax.swing.JTextField txtpesquisa;
    private javax.swing.JTextField txtpreco;
    private javax.swing.JTextField txtqtdestoque;
    // End of variables declaration//GEN-END:variables
}
