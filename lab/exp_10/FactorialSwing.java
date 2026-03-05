import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FactorialSwing {
 public static void main(String[] args) {
 JFrame frame = new JFrame("Factorial Calculator");
 frame.setSize(300, 200);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JPanel panel = new JPanel();
 frame.add(panel);
 panel.setLayout(new FlowLayout());
 JTextField textField = new JTextField(10);
 JButton button = new JButton("Calculate Factorial");
 JTextField resultField = new JTextField(10);
 resultField.setEditable(false);
 panel.add(new JLabel("Enter a number:"));
 panel.add(textField);
 panel.add(button);
 panel.add(new JLabel("Factorial:"));
 panel.add(resultField);
 button.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 try {
 int num = Integer.parseInt(textField.getText());
 long fact = 1;
 for (int i = 1; i <= num; i++) {
 fact *= i;
 }
 resultField.setText(String.valueOf(fact));
 } catch (NumberFormatException ex) {
 resultField.setText("Invalid input");
 }
 }
 });
 frame.setVisible(true);
 }
}