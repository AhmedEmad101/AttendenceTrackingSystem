package attendencemanagementsystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ahmed emad
 */
class TestConnection {
 private static final String JDBC_URL = "jdbc:sqlserver://localhost:1433;databaseName=AttendenceTrackingSystem;user=ahmedemad;password=123456;encrypt=true;trustServerCertificate=true;";
    public static void connect() {
        try {
            // Load the SQLServer JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Establish a connection
            Connection connection = DriverManager.getConnection(JDBC_URL);

            System.out.println("Connected to the database.");

            
            connection.close();
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    

}