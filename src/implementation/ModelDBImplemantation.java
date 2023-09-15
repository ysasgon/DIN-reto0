/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import interfaces.Model;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2dam
 */
public class ModelDBImplemantation implements Model {

    /**
     * Method getGreeting: this method search in the DB reto0din to get the message "Hello world!" from the table greeting
     *
     * @return String greeting
     */
    @Override
    public String getGreeting() {

        CallableStatement ctmt;
        ResultSet rset;
        String greeting = null;

        Connection conn = openConnection();

        try {
            ctmt = conn.prepareCall("SELECT * FROM reto0din.greetings");

            rset = ctmt.executeQuery();

            greeting = rset.getString("greeting");

        } catch (SQLException ex) {
            Logger.getLogger(ModelDBImplemantation.class.getName()).log(Level.SEVERE, "Message not found in DB");
        }

        closeConnection(conn);

        return greeting;

    }

    /**
     * *
     * openConnection method that connects with reto0din database, into
     * greetings table, with root user
     *
     * @return Connection conn
     */
    public Connection openConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(ResourceBundle.getBundle("config").getString("URL"), ResourceBundle.getBundle("config").getString("User"), ResourceBundle.getBundle("config").getString("Password"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    
    /**
     * closeConnection method that close the connecttion with reto0din database
     *
     * @return Connection conn
     */
    public Connection closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

}
