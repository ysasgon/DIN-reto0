/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import interfaces.Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emil
 */
public class ModelDBImplemantation extends DBConnection implements Model {

    Connection con;
    PreparedStatement stmt;

    final String getGreet = "SELECT greeting FROM greetings LIMIT 100";

    @Override
    public String getGreeting() {
        String greeting = null;
        ResultSet rs = null;

        try {
            con = openConnection();
            stmt = con.prepareStatement(getGreet);
            rs = stmt.executeQuery();
            if (rs.next()) {
                greeting = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelDBImplemantation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                closeConnection();
            } catch (SQLException ex) {

            }
        }
        return greeting;
    }
}
