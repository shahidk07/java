import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DatePicker {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Date Picker");
        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        frame.add(panel);

        String[] days = new String[31];
        for (int i = 0; i < 31; i++) {
            days[i] = String.valueOf(i + 1);
        }

        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        String[] years = new String[61];
        for (int i = 0; i < 61; i++) {
            years[i] = String.valueOf(1990 + i);
        }

        JComboBox<String> dayCombo = new JComboBox<>(days);
        JComboBox<String> monthCombo = new JComboBox<>(months);
        JComboBox<String> yearCombo = new JComboBox<>(years);

        JLabel dateLabel = new JLabel("Select Date");

        panel.add(new JLabel("Day:"));
        panel.add(dayCombo);
        panel.add(new JLabel("Month:"));
        panel.add(monthCombo);
        panel.add(new JLabel("Year:"));
        panel.add(yearCombo);
        panel.add(dateLabel);

        ActionListener updateDate = e -> {
            String day = (String) dayCombo.getSelectedItem();
            String month = (String) monthCombo.getSelectedItem();
            String year = (String) yearCombo.getSelectedItem();
            dateLabel.setText(day + "/" + month + "/" + year);
        };

        dayCombo.addActionListener(updateDate);
        monthCombo.addActionListener(updateDate);
        yearCombo.addActionListener(updateDate);

        frame.setVisible(true);
    }
}