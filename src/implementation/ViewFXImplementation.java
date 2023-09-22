/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import interfaces.View;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Fran
 */
public class ViewFXImplementation extends javafx.application.Application implements View{

    /**
     *
     * @param greeting
     */
    @Override
    public void showGreeting(String greeting) {
        try {
            launch(greeting);
        } catch (Exception ex) {
            Logger.getLogger(ViewFXImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //Charge loader
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        
        Parent root = (Parent) loader.load();
        
        FXMLController viewController = loader.getController();
        
//        viewController.setGreeting(greeting);
        
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);

        primaryStage.showAndWait();

    }

}
