
package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectorBD {
    Statement st;
    Connection cn;
    public Connection Conexion (){
        
       try {
           Class.forName("org.gjt.mm.mysql.Driver");
           cn = DriverManager.getConnection("jdbc:mysql://localhost/sistemadeventas","root","");
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println(e.getMessage());
       }
       return cn;
    }
}
