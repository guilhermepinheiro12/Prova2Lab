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

    public ProductNameValidationHandler(String productName) {
        ProductName = productName;
    }
    
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
    
    public void setNextHandler(IHandler NextHandler) {
        this.NextHandler = NextHandler;
    }

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
