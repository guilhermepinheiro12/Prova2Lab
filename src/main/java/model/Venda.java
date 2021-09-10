/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class Venda {
    
    
    private int id;
    private String nome;
    private double preco;
    private int qtd;

    /**
     *
     * @param id para criar uma venda
     * @param nome para criar uma venda
     * @param preco para criar uma venda
     * @param qtd para criar uma venda
     */
    public Venda(int id, String nome, double preco, int qtd) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    /**
     * Construtor vazio
     */
    public Venda() {
    }

    /**
     * Retorna o ID de uma venda
     * 
     * @return o ID de uma venda
     */
    public int getId() {
        return id;
    }

    /**
     * Altera o ID de uma venda pelo parâmetro passado
     * 
     * @param id a alterar a venda
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retorna o nome de uma venda
     * 
     * @return o nome de uma venda
     */
    public String getNome() {
        return nome;
    }

    /**
     * Altera o nome de uma venda pelo parâmetro passado
     *
     * @param nome a alterar a venda
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o valor de uma venda
     * 
     * @return o valor de uma venda
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Altera o preço de uma venda pelo parâmetro passado
     *
     * @param preco a alterar a venda
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Retorna a quantidade de uma venda
     * 
     * @return a quantidade de uma venda
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * Altera a quantidade de uma venda pelo parâmetro passado
     *
     * @param qtd a alterar a venda
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    
}
