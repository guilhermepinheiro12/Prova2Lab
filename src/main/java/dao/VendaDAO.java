package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Produto;
import model.Venda;
import view.TelaPrincipalView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


/**
 *
 * @author chris
 */

/**
 *
 * @author guisi
 */

public class VendaDAO {

    private static final VendaDAO instance = new VendaDAO();

    /**
     * Retorna instância SINGLETON da classe
     *
     * @return Retorna instância SINGLETON
     */
    public static VendaDAO getInstance() {
        return instance;
    }

    /**
     * Insere uma nova venda na aplicação
     *
     * @param nome a ser inserido
     * @param preco a ser inserido
     * @param Qtd a ser inserido
     */
    public void insert(String nome, double preco, int Qtd) {

        try {
            Connection conexao = new Conexao().getConnection();

            String sql = "insert into venda(nome,preco,qtd) values('" + nome + "', " + preco + ", " +Qtd+ ")";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.execute();

            conexao.close();

        } catch (SQLException ex) {

            System.out.printf("Erro ao alterar adicionar %s\n%s\n\n", nome, ex.getMessage());
            Logger.getLogger(TelaPrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Remove uma venda da aplicação com base no seu ID
     *
     * @param id que irá encontrar o remover a venda
     */
    public void remove(int id) {

        try {
            Connection conexao = new Conexao().getConnection();

            String sql = "delete from venda where id=" + id + "";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.execute();

            conexao.close();

        } catch (SQLException ex) {
            System.out.printf("Erro ao alterar remover %s\n%s\n\n", ex.getMessage());
            Logger.getLogger(TelaPrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Remove todas as vendas cadastradas
     *
     */
    public void removerTudo() {

        try {
            Connection conexao = new Conexao().getConnection();

            String sql = "delete from venda ";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.execute();

            conexao.close();

        } catch (SQLException ex) {
            System.out.printf("Erro ao alterar remover %s\n%s\n\n", ex.getMessage());
            Logger.getLogger(TelaPrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Retorna todas as vendas cadastradas
     *
     * @return Retorna todas as vendas cadastradas
     */
    public ArrayList<Venda> getVenda() {
    ArrayList<Venda> resultado = new ArrayList<>();
        try {
            Connection conexao = new Conexao().getConnection();

            String sql = "select * from venda";

            PreparedStatement statement = conexao.prepareStatement(sql);   
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                Venda v = new Venda();
                v.setId(rs.getInt(1));
                v.setNome(rs.getString(2));
                v.setPreco(rs.getDouble(3));
                v.setQtd(rs.getInt(4));
                resultado.add(v);
            }


            conexao.close();
            return  resultado;

        } catch (SQLException ex) {
            System.out.printf("Erro ao receber produtos %s\n%s\n\n", ex.getMessage());
            Logger.getLogger(TelaPrincipalView.class.getName()).log(Level.SEVERE, null, ex);
            return  resultado;
        }

    }
}
