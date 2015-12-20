



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


/**
   A simple data source for getting database connections. 
*/
public class SimpleDataSourceV2
{

   private static String dbserver;
   private static String database;
   private static String username;
   private static String password;

   private static Connection activeConn;

   /**
      Initializes the data source.
      Checks if MySQL Driver is found
      contains the database driver,
      Fill variabels dbserver, database, username, and password
    *
    * TODO get variabels from a configuration file!!!
    * Hardcoded is a bad code
   */
   private static void init(){
       
       Properties prop = new Properties(); // klasse is Properties, naam object is prop
       //prop.load(null);

      
       try {
        String driver = "com.mysql.jdbc.Driver";
        Class.forName(driver);
               
        InputStream stream = SimpleDataSourceV2.class.getResourceAsStream("DatabaseAccess.properties");
        //Properties prop = new Properties();
        prop.load(stream);
        
        
        
        
       }
       catch (NullPointerException h){
           System.out.println(h);
        
      }
      catch (ClassNotFoundException e) {
          System.out.println(e);
      }
      catch (FileNotFoundException f){
          System.out.println(f);
      }
       catch (IOException g ){
        System.out.println(g);   
       }
       
      dbserver = prop.getProperty("dbserver");
      database = prop.getProperty("database");
      username = prop.getProperty("username");
      password = prop.getProperty("password");
   }

   /**
      Gets a connection to the database.
      @return the database connection
   */
   public static Connection getConnection() throws SQLException
   {
       if (activeConn==null) {
           init();
           activeConn=createConnection();
       }

       return activeConn;

   }

   private static Connection createConnection() throws SQLException
   {

        String connectionString = "jdbc:mysql://" + dbserver + "/" + database + "?" +
                "user=" + username + "&password=" + password;

       return DriverManager.getConnection(connectionString);
   }
}
