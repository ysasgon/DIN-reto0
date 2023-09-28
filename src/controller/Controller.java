/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import interfaces.Model;
import interfaces.View;

/**
 *
 * @author Emil
 */
public class Controller {

    /**
     * *
     * run method: method that recieves a Model object and a View object and
     * uses the showGreeting view method and getGreeting model method to obtain
     * and show the greeting message to the user.
     *
     * @param m
     * @param v
     */
    public void run(Model m, View v) {
        v.showGreeting(m.getGreeting());
    }

}
