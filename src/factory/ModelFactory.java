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
 * @author 2dam
 */
public class ModelFactory {

    static ResourceBundle config = ResourceBundle.getBundle("config");
    private final String access = config.getString("AccessType");
    public Model m;

    public Model getModel() throws HelloWorldException {
        if (!access.isEmpty()) {
            if (access.equalsIgnoreCase("File")) {
                return m = new ModelFileImplementation();
            } else {
                return m = new ModelDBImplemantation();
            }
        } else {
            throw new HelloWorldException("not found");
        }
    }
}
