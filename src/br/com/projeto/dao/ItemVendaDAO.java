/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Clientes;
import br.com.projeto.model.ItemVenda;
import br.com.projeto.model.Produtos;
import br.com.projeto.model.Vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jonathan
 */
public class ItemVendaDAO {
    private Connection con;
    
    public ItemVendaDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void cadastraItem(ItemVenda obj){
        try {
            String sql = "INSERT INTO tb_itensvendas(venda_id, produto_id, qtd, subtotal) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getVenda().getId());
            stmt.setInt(2, obj.getProduto().getId());
            stmt.setInt(3, obj.getQtd());
            stmt.setDouble(4, obj.getSubtotal());
            
            stmt.execute();
            stmt.close();
            
            //JOptionPane.showMessageDialog(null, "Registrado");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        } 
    }
    
    public List<ItemVenda> listaItensPorVenda(int venda_id){
        List<ItemVenda> list = new ArrayList<>();
        try {
            String sql = "SELECT p.descricao, i.qtd, p.preco, i.subtotal FROM tb_itensvendas AS i " +
                          "INNER JOIN tb_produtos AS p ON(i.produto_id = p.id)  WHERE i.venda_id = ?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, venda_id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                ItemVenda item = new ItemVenda();
                Produtos prod = new Produtos();
                //item.setId(rs.getInt("i.id"));
                prod.setDescricao(rs.getString("p.descricao"));
                item.setQtd(rs.getInt("i.qtd"));
                prod.setPreco(rs.getDouble("p.preco"));
                item.setSubtotal(rs.getDouble("i.subtotal"));
                
                item.setProduto(prod);
                list.add(item);
            }
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }
}
