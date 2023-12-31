/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

/**
 *
 * @author Fran, Emil
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public abstract class DBConnection {

    private final ResourceBundle config = ResourceBundle.getBundle("config");
    private final String url = config.getString("url");
    ;
    private final String user = config.getString("user");
    ;
    private final String pass = config.getString("pass");
    ;
    private Connection con = null;
    private PreparedStatement stmt;
    //CONSTRUCTOR

    /**
     * *
     * This method opens a JDB connection using the DriverManager's
     * getConnection method, establishing the DB url and the username and
     * password of one of this DB users
     *
     * @return con
     * @throws SQLException
     */
    public Connection openConnection() throws SQLException {
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            //System.out.println("Error al intentar abrir la BD");
            //Gestión de la excepción
        }
        return con;
    }

    /***
     *  This method ends the DB connection.
     * @throws SQLException 
     */
    
    public void closeConnection() throws SQLException {
        if (stmt != null) {
            stmt.close();
        }
        if (con != null) {
            con.close();
        }
    }
}
