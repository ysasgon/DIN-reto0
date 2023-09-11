/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author 2dam
 */
public class HelloWorldException extends Exception {

    private static final long serialVersionUID = 1L;

    public HelloWorldException(){
        super();
    }
    
    public HelloWorldException(String message){
        super(message);
    }
    
}
