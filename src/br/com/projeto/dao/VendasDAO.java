/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Clientes;
import br.com.projeto.model.Vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
    
    //Metodo que filtra venda por datas
    public List<Vendas> listarVendasPorPeriodo(LocalDate data_inicio, LocalDate data_fim){
        try {
            List<Vendas> list = new ArrayList<>();
            String sql = "SELECT v.id, date_format(v.data_venda, '%d/%m/%y') as data_formatada, c.nome, v.total_venda, v.observacoes from tb_vendas AS v " +
                         "INNER JOIN tb_clientes AS c on(v.cliente_id = c.id) WHERE v.data_venda BETWEEN ? AND ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, data_inicio.toString());
            stmt.setString(2, data_fim.toString());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Vendas obj = new Vendas();
                Clientes c = new Clientes();
                
                obj.setId(rs.getInt("v.id"));
                obj.setData_venda(rs.getString("data_formatada"));
                c.setNome(rs.getString("c.nome"));
                obj.setTotal_venda(rs.getDouble("v.total_venda"));
                obj.setObs(rs.getString("v.observacoes"));
                obj.setCliente(c);
                list.add(obj);
            }
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }
    
    //Tela TotalVenda 
    public double retornaTotalVendaPorData(LocalDate data_venda){
        try {
            double total_venda = 0;
        
            String sql = "SELECT SUM(total_venda) AS total FROM tb_vendas WHERE data_venda = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, data_venda.toString());
            ResultSet rs = stmt.executeQuery();
        
            if(rs.next()){
                total_venda = rs.getDouble("total");
            }
            
            return total_venda;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
}
