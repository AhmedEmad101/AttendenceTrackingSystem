/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package attendencemanagementsystem;

import static attendencemanagementsystem.TestConnection.connect;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
/**
 *
 * @author ahmed emad
 */
public class AttendenceManagementSystem {
    private static final String JDBC_URL = "jdbc:sqlserver://localhost:1433;databaseName=AttendenceTrackingSystem";
    private static final String USERNAME = "ahmedemad";
    private static final String PASSWORD = "123456";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       // connect();
       Login login = new Login();
       login.setVisible(true);
       TestConnection.connect();
    }
}

