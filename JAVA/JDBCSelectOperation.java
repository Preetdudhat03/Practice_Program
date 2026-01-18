//STEP 1. Import required packages
import java.sql.*;
public class JDBCSelectOperation {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/collage/student";
   //  Database credentials
   static final String USER = "root";
   static final String PASS = "";
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Driver Loaded Successfully...");
      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      // Creating a statement
      stmt = conn.createStatement();
      String sql = "Select * from student";
      ResultSet rs = stmt.executeQuery(sql);
      // Displaying Table Records
      System.out.println("ID\t "  + "Name\t"+ "Sem \t  city");
      while(rs.next()){
         //Retrieve by column name
         int id  = rs.getInt("id");
         String name = rs.getString("name");
         int sem = rs.getInt("sem");
         String city= rs.getString("city");

         //Display values
         System.out.print(id + "\t");
         System.out.print(name+ "\t");
         System.out.print(sem+ "\t");
         System.out.println(city);
      }
      //STEP 5: close the connection
      rs.close();
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }
   System.out.println("Goodbye!");
}//end main
}//end of JDBCSelectOperation class