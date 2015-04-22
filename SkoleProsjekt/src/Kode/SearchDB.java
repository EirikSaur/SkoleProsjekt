import java.sql.*;
import java.util.ArrayList;

public class SearchDB {
    private String dbURL = "jdbc:derby://localhost:1527/korwpgjre";
    private String dbDriver = "org.apache.derby.jdbc.ClientDriver";
    private Connection conn;
    private Statement stmt;

    public SearchDB(){
        try{
            Class.forName(dbDriver);
            conn = DriverManager.getConnection(dbURL);
        }catch(Exception e){
            System.out.print(e);
        }

    }
    


    public ArrayList<String> SearchColumn(String columnName,String tableName){
        try{
            stmt = conn.createStatement();
            ResultSet r = stmt.executeQuery("select  " + columnName + " from " + tableName);
            String s = "";
            ArrayList<String> list = new ArrayList<String>();

            while(r.next()){
                list.add(r.getString(columnName));
            }
            return list;

            }catch (SQLException e){
                System.out.println("**** SYSTEM ERROR ****");
                System.out.println(e);
            }
        return null;
    }

    public String returnRows(String tableName){
        try {
            stmt = conn.createStatement();
            ResultSet r = stmt.executeQuery("select * from " + tableName);
            String s = "";

            while(r.next()){
                System.out.println(r.getString(1));
            }
            return s;
        }catch (SQLException e){

        }
        return null;
    }

    public boolean logIn(String username, String password){
        try {
            stmt = conn.createStatement();
            ResultSet r = stmt.executeQuery("select username,password from administrator");


            while (r.next()) {
                if (r.getString("username").equals(username) && r.getString("password").equals(password)){
                    System.out.print("logget inn");
                    return true;
                }
            }
            ResultSet r1 = stmt.executeQuery("select username,password from centremanager");
            while (r1.next()) {
                if (r1.getString("username").equals(username) && r1.getString("password").equals(password)){
                    System.out.print("logget inn");
                    return true;
                }
            }
            ResultSet r2 = stmt.executeQuery("select username,password from storeowner");
            while (r.next()) {
                if (r2.getString("username").equals(username) && r2.getString("password").equals(password)){
                    System.out.print("logget inn");
                    return true;
                }
            }
            ResultSet r3 = stmt.executeQuery("select username,password from serviceworker");
            while (r3.next()) {
                if (r3.getString("username").equals(username) && r3.getString("password").equals(password)){
                    System.out.print("logget inn");
                    return true;
                }
            }
        }catch (SQLException e){
            System.out.println("error");
        }
        return false;
    }

    //ADMIN
    public void addCentreManager(int manager_id,String centremanager_name, String username,String password, int phonenumber, String email){
        try {
            stmt = conn.createStatement();
            String insert = "insert into centremanager (MANAGER_ID,CENTREMANAGER_NAME,USERNAME,PASSWORD,PHONENUMBER,EMAIL) VALUES(" + manager_id +", '" + centremanager_name + "', '" + username + "', '" + password + "', " +phonenumber + ", '" +email +"')";
            stmt.executeUpdate(insert);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public void editUser(){

    }
}




