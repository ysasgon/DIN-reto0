/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import interfaces.Model;
import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ModelFileImplementation implements Model {

    static ResourceBundle config = ResourceBundle.getBundle("config");
    private final String greeting = config.getString("Greeting");

    @Override
    public String getGreeting() {
        return greeting;
    }

}
