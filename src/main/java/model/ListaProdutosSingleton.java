/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author guisi
 */
public class ListaProdutosSingleton 
{
    private static ListaProdutosSingleton Instance = new ListaProdutosSingleton();
    private ArrayList<Produto> ProdutoList;

    private ListaProdutosSingleton() {
        ProdutoList = new ArrayList<>();
    }
    
    /**
     * Função para chamar classe singleton
     * 
     * @return uma instância singleton
     */
    public static ListaProdutosSingleton getInstance()
    {
        if (Instance == null)
            Instance = new ListaProdutosSingleton();
 
        return Instance;
    }

    /**
     * Retorna a lista de produtos do carrinho
     * 
     * @return Arraylist do carrinho
     */
    public ArrayList<Produto> getProductsList() {
        return ProdutoList;
    }
    
    /**
     * Adiciona um produto à lista de produtos do carrinho
     * 
     * @param product a ser adicionado na lista
     */
    public void AddProductToCart(Produto product)
    {
        ProdutoList.add(product);
    }
    
    /**
     * Remove um produto do carrinho pelo index passado
     * 
     * @param index que será utilizado para remover o produto
     */
    public void RemoveProductFromCart(int index)
    {
        ProdutoList.remove(index);
    }
    
    /**
     * Remove todos os itens do carrinho
     */
    public void CleanCart()
    {
        ProdutoList.clear();
    }
}

