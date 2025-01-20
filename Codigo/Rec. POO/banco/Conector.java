package banco;
import java.sql.*;

public class Conector {
    
    public static Connection getConexao(Connection conn) {
        conn = null;
try {
    conn =
       DriverManager.getConnection("jdbc:mysql://localhost:3306/superbiblioteca", "root", "euamothaumcraft1!");

    // Do something with the Connection
    return conn;
} catch (SQLException ex) {
    // handle any errors
    System.out.println("SQLException: " + ex.getMessage());
    System.out.println("SQLState: " + ex.getSQLState());
    System.out.println("VendorError: " + ex.getErrorCode());
    return null;
}
    
}}

