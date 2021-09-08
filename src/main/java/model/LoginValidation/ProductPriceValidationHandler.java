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
public class ProductPriceValidationHandler implements IHandler{

    String PrecoInTextField;
    IHandler NextHandler;

    public ProductPriceValidationHandler(String preco) {
        PrecoInTextField = preco;
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
        try
        {
            double numericPreco = Double.parseDouble(PrecoInTextField);
            return true;
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Valor inválido", "Alerta", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Um erro ocorreu, por favor, verifique os valores inseridos", "Alerta", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
}
