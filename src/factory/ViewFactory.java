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
 * @author Emil
 */
public class ViewFactory {

    private final String view = ResourceBundle.getBundle("config").getString("ViewType");

    /**
     * *
     * This method searches inside the configuration file to decide how to
     * display the greeting(printing the message by console or inside a JavaFX
     * window)
     *
     * @return View
     * @throws HelloWorldException
     */
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
