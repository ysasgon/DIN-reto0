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
 * @author 
 */
public class Controller {
    
    public void run(Model m, View v){
        v.showGreeting(m.getGreeting());
    }

    
}
