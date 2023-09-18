/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import interfaces.Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emil
 */
public class ModelDBImplemantation implements Model {

    /**
     * Method getGreeting: this method search in the DB reto0din to get the
     * message "Hello world!" from the table greeting
     *
     * @return String greeting
     */
    @Override
    public String getGreeting() {

        PreparedStatement ctmt;
        ResultSet rset;
        String greeting = null;

        Connection conn = openConnection();

        try {
            ctmt = conn.prepareStatement("SELECT * FROM greetings ");

            rset = ctmt.executeQuery();

            greeting = rset.getString("greeting");

            rset.close();

            ctmt.close();

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
        String url = ResourceBundle.getBundle("config").getString("url");
        String user = ResourceBundle.getBundle("config").getString("user");
        String password = ResourceBundle.getBundle("config").getString("pass");

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(ModelDBImplemantation.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(ModelDBImplemantation.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return conn;
    }

}
