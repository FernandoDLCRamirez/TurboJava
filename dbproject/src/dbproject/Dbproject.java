/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.sql.rowset.CachedRowSet;
import com.sun.rowset.CachedRowSetImpl;
import java.sql.SQLException;

/**
 *
 * @author fer_h
 */
public class Dbproject 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "", "");
            System.out.println("La armaste perro");
            Statement lectura = con.createStatement();
            ResultSet resultado = lectura.executeQuery("select * from alumnos");
            System.out.println("nombre \t \t \t matricula \t edad");
            
            while(resultado.next())
            {
                System.out.println(resultado.getString("nombre")+ "\t" + "\t" + resultado.getString("matricula") + "\t" + "\t" + resultado.getInt("edad"));
            }
        }
        
        catch (SQLException e)
        {
            System.out.println("Conexion fallida");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            System.out.println("Se ha encontrado el siguiente error: " + e.getMessage());
        }
    }
    
}
