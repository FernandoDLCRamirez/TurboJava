/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iais;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando
 */
public class IAIS 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try
        {
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306";
            String database = "test";
            Class.forName("com.mysql.jdbc.Driver");                                 //Host -- Puerto - BD
            try {
                //Connection conn = (Connection) DriverManager.getConnection(url + "user=" + user + "& password=" + pass);
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test" + "root & password=");
            } catch (SQLException ex) {
                Logger.getLogger(IAIS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(IAIS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
