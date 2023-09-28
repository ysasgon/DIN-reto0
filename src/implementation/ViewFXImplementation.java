/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import interfaces.View;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Fran
 */
public class ViewFXImplementation extends javafx.application.Application implements View {

    private static String greeting;

    @FXML
    private Label label;

    /**
     * This method obtains the greeting and calls the start method using
     * launch()
     *
     * @param greeting
     */
    @Override
    public void showGreeting(String greeting) {
        try {
            this.greeting = greeting;
            launch(this.greeting);
        } catch (Exception ex) {
            Logger.getLogger(ViewFXImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * *
     * This method creates and launches a JavaFX window (previously defined in
     * the FXMLDocument) and the controller of it.
     *
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        //Charge loader
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));

        Parent root = (Parent) loader.load();

        ViewFXImplementation viewController = (ViewFXImplementation) loader.getController();

        viewController.label.setText(greeting);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

}
