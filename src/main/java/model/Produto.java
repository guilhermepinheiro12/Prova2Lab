/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author chris
 */
public class Produto {
    private int id;
    private String nome;
    private double  preco;

    /**
     *
     * @param id para criar um produto
     * @param nome para criar um produto
     * @param preco para criar um produto
     */
    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    
    /**
     * Construtor vazio
     */
    public Produto() {
        
    }

    /**
     * Retorna ID de um produto
     * 
     * @return id de um produto
     */
    public int getId() {
        return id;
    }

    /**
     * Altera o valor de um ID pelo que é passado no parâmetro
     * 
     * @param id que será utilizado para alteração
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retorna o nome de um produto
     * 
     * @return nome de um produto
     */
    public String getNome() {
        return nome;
    }

    /**
     * Altera o valor de um nome pelo que é passado no parâmetro
     * 
     * @param nome que será utilizado para alteração
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o valor de um produto
     * 
     * @return retorna o preço de um produto
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Altera o valor o preço do produto pelo valor que é passado no parâmetro
     * 
     * @param preco que será utilizado para alteração
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
