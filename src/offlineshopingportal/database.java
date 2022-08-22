
package offlineshopingportal;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class database {
    Connection connect = null;
    
    public void connectDatabase(){
        try{
            
            //Database Connection
            connect = DriverManager.getConnection("jdbc:mysql://localhost/shop","root","");
            System.out.println("Successfully Connected to Mysql");

        }catch(Exception e){
            System.out.println("Not Connected..");
            e.printStackTrace();
        }
    }
    
    
    public void insertData(String userId,String name, String password){
        try{
            String query = "INSERT INTO user (userId,name,password) values(?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);
            pStatement.setString(1, userId);
            pStatement.setString(2, name);
            pStatement.setString(3, password);
           
            
            
            
            pStatement.executeUpdate();
            
            System.out.println("Successfully Inserted..");
            
            
        }catch(Exception e){
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
        
     }
    
    public ResultSet testQuery(){
            ResultSet resultSet = null;
        try{
            String query = "SELECT * FROM user";
            Statement statement ;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
 
            
            System.out.println("Successfully Done Query..");
           
        }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
        }           
        return resultSet;
    }
    
 
    
    
}
