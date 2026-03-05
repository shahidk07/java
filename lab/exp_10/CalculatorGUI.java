import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalculatorGUI {
 public static void main(String[] args) {
 JFrame frame = new JFrame("Calculator");
 frame.setSize(300, 400);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JPanel panel = new JPanel();
 panel.setLayout(new GridLayout(4, 4));
 String[] buttons = {"7", "8", "9", "/",
 "4", "5", "6", "*",
 "1", "2", "3", "-",
 "0", ".", "=", "+"};
 for (String button : buttons) {
 panel.add(new JButton(button));
 }
 frame.add(panel);
 frame.setVisible(true);
 }
}