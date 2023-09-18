/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import exceptions.HelloWorldException;
import implementation.ModelDBImplemantation;
import implementation.ModelFileImplementation;
import interfaces.Model;
import java.util.ResourceBundle;

/**
 *
 * @author Fran
 */
public class ModelFactory {

    // static ResourceBundle config = ResourceBundle.getBundle("config");
    private final String access = ResourceBundle.getBundle("config").getString("AccessType");

    
    /***
     * This method distinguish between File and DB access to get "Hello world!" message 
     * @return Model
     * @throws HelloWorldException
     */
    public Model getModel() throws HelloWorldException {
        if (access.equalsIgnoreCase("File")) {
            return new ModelFileImplementation();
        } else if (access.equalsIgnoreCase("DB")) {
            return new ModelDBImplemantation();
        } else {
            throw new HelloWorldException("not found");
        }
    }
}
