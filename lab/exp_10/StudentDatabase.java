import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class StudentDatabase implements ActionListener {
    JButton btn;
    JLabel lbl;

    StudentDatabase() {
        JFrame f = new JFrame("Click Demo");
        btn = new JButton("Click Me");
        lbl = new JLabel("Waiting...");

        btn.setBounds(80, 50, 120, 30);
        lbl.setBounds(80, 100, 200, 30);

        btn.addActionListener(this);

        f.add(btn);
        f.add(lbl);

        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "shahid",
                "sqlpass123"
            );

            System.out.println("Connected successfully!");

            // Update label AFTER connection
            lbl.setText("Connected to DB!");

        } catch (Exception ex) {
            System.out.println("Database error: " + ex.getMessage());
            lbl.setText("Connection Failed!");
        }
    }

    public static void main(String[] args) {
        new StudentDatabase();
    }
}