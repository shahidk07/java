import java.sql.*;
import javax.swing.*;
public class StudentDatabase {
 public static void main(String[] args) {
 String url = "jdbc:mysql://localhost:3306/testdb";
 String username = "root";
 String password = "password";
 try (Connection conn = DriverManager.getConnection(url, username, password)) {
 Statement stmt = conn.createStatement();
 String insertQuery = "INSERT INTO Student (name, age) VALUES ('John Doe', 25)";
 stmt.executeUpdate(insertQuery);
 System.out.println("Inserted data into Student table");
 String selectQuery = "SELECT * FROM Student";
 ResultSet rs = stmt.executeQuery(selectQuery);
 while (rs.next()) {
 System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
 }
 JFrame frame = new JFrame("Student Form");
 frame.setSize(400, 300);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JPanel panel = new JPanel();
 frame.add(panel);
 panel.setLayout(new GridLayout(2, 2));
 panel.add(new JLabel("Name:"));
 panel.add(new JTextField());
 panel.add(new JLabel("Age:"));
 panel.add(new JTextField());
 frame.setVisible(true);
 } catch (SQLException e) {
 System.out.println("Database error: " + e.getMessage());
 }
 }
}