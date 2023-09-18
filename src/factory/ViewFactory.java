/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import exceptions.HelloWorldException;
import implementation.ViewFXImplementation;
import implementation.ViewTextImplementation;
import interfaces.View;
import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ViewFactory {

    private final String view = ResourceBundle.getBundle("config").getString("ViewType");

    public View getView() throws HelloWorldException {
        if (view.equalsIgnoreCase("Text")) {
            return new ViewTextImplementation();
        } else if (view.equalsIgnoreCase("Window")) {
            return new ViewFXImplementation();
        } else {
            throw new HelloWorldException("View not charged");
        }
    }
}
