/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.LoginValidation;

import javax.swing.JOptionPane;

/**
 *
 * @author guisi
 */
public class ProductNameValidationHandler implements IHandler{

    IHandler NextHandler;
    String ProductName;
    String PrecoInTextField;

    /**
     *
     * @param productName Nome do produto a ser validado
     */
    public ProductNameValidationHandler(String productName) {
        ProductName = productName;
    }
    
    /**
     *
     * @return Se o próximo handler teve uma validação correta
     */
    @Override
    public boolean SetNext() {
        if (NextHandler.Handle()) {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     *
     * @param NextHandler Passa o próximo handler a validar
     */
    public void setNextHandler(IHandler NextHandler) {
        this.NextHandler = NextHandler;
    }

    /**
     *
     * @return Faz a validação do nome do produto
     */
    @Override
    public boolean Handle() {
        String pattern = "^((?=[A-Za-z0-9@ ])(?![_\\\\-]).)*$";
        
        if (ProductName.matches(pattern)) {
            return true;
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Há caracteres inválidos no nome do produto", "Alerta", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
}
