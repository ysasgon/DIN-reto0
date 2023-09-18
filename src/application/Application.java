/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import controller.Controller;
import exceptions.HelloWorldException;
import factory.ModelFactory;
import factory.ViewFactory;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emil and Fran
 */
public class Application {

    public static void main(String[] args) {

        try {
            run();
        } catch (HelloWorldException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void run() throws HelloWorldException {
        new Controller().run(new ModelFactory().getModel(), new ViewFactory().getView());
    }

}
