import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StudentFormGUI {
 public static void main(String[] args) {
 JFrame frame = new JFrame("STUDENT FORM");
 frame.setSize(400, 300);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JPanel panel = new JPanel();
 frame.add(panel);
 panel.setLayout(new GridLayout(7, 2));
 panel.add(new JLabel("Roll No.:"));
 panel.add(new JTextField());
 panel.add(new JLabel("Name:"));
 panel.add(new JTextField());
 panel.add(new JLabel("Course:"));
 JCheckBox course1 = new JCheckBox("Java");
 JCheckBox course2 = new JCheckBox("Python");
 panel.add(course1);
 panel.add(course2);
 panel.add(new JLabel("Gender:"));
 JRadioButton male = new JRadioButton("Male");
 JRadioButton female = new JRadioButton("Female");
 ButtonGroup genderGroup = new ButtonGroup();
 genderGroup.add(male);
 genderGroup.add(female);
 panel.add(male);
 panel.add(female);
 panel.add(new JLabel("Class:"));
 panel.add(new JTextField());
 panel.add(new JLabel("Address:"));
 panel.add(new JTextArea());
 frame.setVisible(true);
 }
}