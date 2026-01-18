import java.sql.*;
public class JDBCUpdateOperationMini {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost";
   //  Database credentials
   static final String USER = "root";
   static final String PASS = "";
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //Register JDBC driver
      Class.forName(JDBC_DRIVER);
      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      //Execute an update query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      //Updating the table record
      String sql = "UPDATE student " + "SET sem = 2 WHERE id=1";
      int rows_updated=stmt.executeUpdate(sql);
      System.out.println("Total Rows Updated="+rows_updated);
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
     
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end of JDBCUpdateOperation class