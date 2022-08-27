
package classroom_management_system.database;
import java.sql.*;
/**
 *
 * @author Tanvir Zaman
 */
public class database{
    public Connection connect;
    private String username = "tanvir"; 
    private String password = "tanvir";
    private String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
    public database(String type){
        if(type.equals("oracle")){
            try {
                this.connect = DriverManager.getConnection(this.jdbc_url, this.username, this.password);
            } catch (SQLException e) {
                System.out.println(e);
            }
        } else if (type.equals("sqlite")){
            try {
                Class.forName("org.sqlite.JDBC");
                this.connect = DriverManager.getConnection("jdbc:sqlite:database.db");
            } catch (SQLException e) {
                System.out.println(e);
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
            }
        }
    }
    public void connect(String username,String password){// same as database constructor
        try {
            this.connect = DriverManager.getConnection(jdbc_url, username, this.password);
            System.out.println("Connected to the database!");
        } catch (SQLException error) {
            System.out.println(error);
        }
    }
    public void close() throws SQLException{
       connect.close(); 
    }
    public static void main(String[] args) throws SQLException { // this is an example for running this project
        database conn= new database("sqlite");
    }
}
    
