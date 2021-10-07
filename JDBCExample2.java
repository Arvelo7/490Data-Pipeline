import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2 {
   static final String DB_URL = "jdbc:mysql://localhost:3306/?user=root/newsapi";
   static final String USER = "root";
   static final String PASS = "Maxamili@123";

   public static void main(String[] args) {
      System.out.println("Connecting to a selected database...");
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) 
      {		      
         System.out.println("Connected database successfully...");
         Statement stmt = conn.createStatement();
         
         System.out.println("Created table in given database...");
      } 
      catch (SQLException e) 
      {
         e.printStackTrace();
      }
     
   }
}