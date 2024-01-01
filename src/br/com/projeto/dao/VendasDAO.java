/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jonathan
 */
public class VendasDAO {
    private Connection con;
    
    public VendasDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void cadastrarVenda(Vendas obj){
        try {
            String sql = "INSERT INTO tb_vendas(cliente_id, data_venda, total_venda, observacoes) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCliente().getId());
            stmt.setString(2, obj.getData_venda());
            stmt.setDouble(3, obj.getTotal_venda());
            stmt.setString(4, obj.getObs());
            
            stmt.execute();
            stmt.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        } 
    }
    
    public int retornaUltimaVenda(){
        try {
            int idvenda = 0;
            String sql = "SELECT MAX(id) id FROM tb_vendas";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
        
            if(rs.next()){
                Vendas p = new Vendas();
                p.setId(rs.getInt("id"));
                idvenda = p.getId();
            }
            return idvenda;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
