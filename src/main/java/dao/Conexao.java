/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author chris
 */
public class Conexao {

    /**
     * Faz a conexão com o banco de dados do PostGree
     * 
     * @return retorna a conexão com o banco
     * @throws SQLException se houver falha na conexão
     */
    public Connection getConnection() throws SQLException {
      
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/LojaLP", "postgres", "125156cm");
        return conexao;

    }

}
