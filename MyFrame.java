import javax.swing.*;
import java.awt.*;

class Mywindow{
    public static void main(String[] args) {
        JFrame f=new JFrame("Student Portal");
        f.setSize(500,400);
        f.setLocation(300,600);

        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);


        JLabel label=new JLabel("Enter your name:");

        f.add(label);
//common Methods:
label.setText("New message");
label.setFont(new Font("Arial",Font.BOLD,16));

    }
    
}
