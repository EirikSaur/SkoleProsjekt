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
    
    private String dbURL = "jdbc:derby://localhost:1527/skoleprosjekt";
    private String dbDriver = "org.apache.derby.jdbc.ClientDriver";
    private Connection conn;
    private Statement stmt;
    
    public Connection kobleTil(){
        try{
            Class.forName(dbDriver);
            conn = DriverManager.getConnection(dbURL);
            return conn;
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Klarte ikke å koble til databasen " + e);
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
    
        public void createView(){
        try{
            Statement setning = kobleTil().createStatement();
            setning.executeUpdate("create view AlleBrukere as " +
"select administrator.username as username, " +
"administrator.password as password, " +
"admin_id as ID, " +
"administrator.admin_name as Name, " +
"administrator.phonenumber as Phonenumber, " +
"administrator.email as email " +
"from administrator " +
"union " +
"select centremanager.username as username, " +
"centremanager.password as password, " +
"centremanager.manager_id as ID, " +
"centremanager.centremanager_name as Name, " +
"centremanager.phonenumber as Phonenumber, " +
"centremanager.email as email " +
"from centremanager " +
"union " +
"select storeowner.username as username, " +
"storeowner.password as password, " +
"owner_id as ID, " +
"storeowner.owner_name as Name, " +
"storeowner.phonenumber as Phonenumber, " +
"storeowner.email as email " +
"from storeowner " +
"union " +
"select serviceworker.username as username, " +
"serviceworker.password as password, " +
"serviceworker_id as ID, " +
"serviceworker.serviceworker_name as Name, " +
"serviceworker.phonenumber as Phonenumber, " +
"serviceworker.email as email " +
"from serviceworker ");
        } catch(Exception e) {
            System.out.println("Her gikk det galt "+ e);
        }
    }
    
    public void destroyView(){
        try{
            Statement setning = kobleTil().createStatement();
            setning.executeUpdate("drop view AlleBrukere");
        }catch(Exception e){
            System.out.println("Her gikk det galt "+ e);
        }
    }
}
    
