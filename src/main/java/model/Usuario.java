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
public class Usuario {
    private String nome;
    private String login;
    private String senha;
    private boolean admin;

    /**
     *
     * @param nome para criar um usuário
     * @param login para criar um usuário
     * @param senha para criar um usuário
     * @param admin para criar um usuário
     */
    public Usuario(String nome, String login, String senha, boolean admin) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.admin = admin;
    }

    /**
     * Construtor vazio
     */
    public Usuario() {
    }
    
    /**
     * Retorna o nome de um usuário
     * 
     * @return o nome de um usuário
     */
    public String getNome() {
        return nome;
    }

    /**
     * Altera o nome de um usuário pelo parâmetro passado
     * 
     * @param nome para alterar o usuário 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o login de um usuário
     * 
     * @return o login de um usuário
     */
    public String getLogin() {
        return login;
    }

    /**
     * Altera o login de um usuário pelo parâmetro passado
     * 
     * @param login para alterar o usuário 
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Retorna a senha de um usuário
     * 
     * @return a senha de um usuário
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Altera a senha de um usuário pelo parâmetro passado
     * 
     * @param senha para alterar o usuário 
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Retorna se o usuário é admin ou não
     * 
     * @return se o usuário é admin ou não
     */
    public boolean isAdmin() {
        return admin;
    }

    /**
     * Altera se um usuário é admin ou não
     * 
     * @param admin se o usuário será admin ou não
     */
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
}
