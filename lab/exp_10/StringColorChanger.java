import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StringColorChanger {
 public static void main(String[] args) {
 JFrame frame = new JFrame("String Color Changer");
 frame.setSize(400, 200);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JPanel panel = new JPanel();
 frame.add(panel);
 panel.setLayout(new FlowLayout());
 String[] colors = {"Red", "Green", "Blue"};
 String[] sizes = {"12", "16", "20"};
 String[] types = {"Serif", "SansSerif", "Monospaced"};
 JLabel label = new JLabel("This is a string");
 JComboBox<String> colorCombo = new JComboBox<>(colors);
 JComboBox<String> sizeCombo = new JComboBox<>(sizes);
 JComboBox<String> typeCombo = new JComboBox<>(types);
 panel.add(label);
 panel.add(new JLabel("Choose Color:"));
 panel.add(colorCombo);
 panel.add(new JLabel("Choose Size:"));
 panel.add(sizeCombo);
 panel.add(new JLabel("Choose Font Type:"));
 panel.add(typeCombo);
 colorCombo.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 String color = (String) colorCombo.getSelectedItem();
 switch (color) {
 case "Red": label.setForeground(Color.RED); break;
 case "Green": label.setForeground(Color.GREEN); break;
 case "Blue": label.setForeground(Color.BLUE); break;
 }
 }
 });
 sizeCombo.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 int size = Integer.parseInt((String) sizeCombo.getSelectedItem());
 label.setFont(new Font(label.getFont().getName(), Font.PLAIN, size));
 }
 });
 typeCombo.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 String type = (String) typeCombo.getSelectedItem();
 label.setFont(new Font(type, Font.PLAIN, label.getFont().getSize()));
 }
 });
 frame.setVisible(true);
 }
}