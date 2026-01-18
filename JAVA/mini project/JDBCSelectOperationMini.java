//STEP 1. Import required packages
import java.sql.*;
public class JDBCSelectOperationMini {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/collage";
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
      String sql = "Select * from Libary";
      ResultSet rs = stmt.executeQuery(sql);
      // Displaying Table Records
      System.out.println("Book_Name\t "  + "Author_Name\t"+ "Publisher_Name\t");
      while(rs.next()){
         //Retrieve by column name
         String Book_Name = rs.getString("Book_Name");
         String Author_Name = rs.getString("Author_Name");
         String Publisher_Name = rs.getString("Publisher_Name");

         //Display values
         System.out.print(Book_Name + "\t");
         System.out.print(Author_Name + "\t");
         System.out.println(Publisher_Name + "\t");
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