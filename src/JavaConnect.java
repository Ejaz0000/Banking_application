/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ejaz
 */
import java.sql.*;
import javax.swing.*;

public class JavaConnect {
    
    Connection conn = null;
    
    public static Connection ConnecrDb(){
    try{
     Class.forName("com.mysql.jdbc.Driver");
     
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank");
     return conn;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null,"problemm");
    }
    return null;
    }
    
}
