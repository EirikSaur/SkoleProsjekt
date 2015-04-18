/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Kode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Eirik Saur
 * Denne Klassen er laget for å åpne og lukke koblingen til databasen
 * Det er også mulig å legge inn generelle søkemetoder her.
 */
public class Database {
    
    private String dbURL = "jdbc:derby://localhost:1527/Kjøpesenter";
    private String dbDriver = "org.apache.derby.jdbc.ClientDriver";
    private Connection conn;
    private Statement stmt;
    
    public Connection kobleTil(){
        try{
            Class.forName(dbDriver);
            conn = DriverManager.getConnection(dbURL);
            return conn;
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Klarte ikke å koble til databasen");
            return null;
        }
    }
    
    public boolean kobleFra(){
        try {
            if (conn != null) {
                conn.close();
        
            }
            return true;
        } catch (SQLException e) {
            System.err.println("*** Feil oppstått: " + e + ". ***");
            e.printStackTrace(System.err);
            return false;
        }
    }
}
    
