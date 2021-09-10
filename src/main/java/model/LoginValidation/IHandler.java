/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.LoginValidation;

/**
 *
 * @author guisi
 */
public interface IHandler {
    
    /**
     * Passa o handler que será utilizado após
     *
     * @return se o próximo handler teve uma validação correta
     */
    public boolean SetNext();

    /**
     * Faz a validação em si
     *
     * @return se a validação foi correta
     */
    public boolean Handle();
}
