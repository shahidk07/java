import java.sql.*;
public class JDBCConnection {
 public static void main(String[] args) {
 String url = "jdbc:mysql://localhost:3306/testdb";
 String username = "root";
 String password = "password";
 try (Connection conn = DriverManager.getConnection(url, username, password)) {
 System.out.println("Connected to the database!");
 } catch (SQLException e) {
 System.out.println("Database connection error: " + e.getMessage());
 }
 }
}