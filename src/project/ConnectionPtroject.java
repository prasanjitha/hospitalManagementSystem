/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class ConnectionPtroject {
    public static Connection getCon()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            return con;
            
        } catch (Exception e) {
            return  null;
            
        }
    }
    
}
