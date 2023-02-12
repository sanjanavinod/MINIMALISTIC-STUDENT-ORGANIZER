/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author skasr
 */
public class MySqlConnect {
    Connection conn = null;
    public static Connection ConnectDB()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/loginrec","root","");
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MySqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
