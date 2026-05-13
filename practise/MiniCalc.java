import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiniCalc {

    public static void main(String[] args) {

        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(1000,700);
        JButton[] buttons=new JButton[10];
        
        //x axis for button
        int x=50;int y=50;
        JTextField text=new JTextField();
        text.setBounds(50,30,200,40);
        
        frame.add(text);
        for (int i=0;i<10;i++){
            buttons[i]=new JButton(String.valueOf(i));
            buttons[i].setBounds(x,100,y,50);
            int num=i;

            buttons[i].addActionListener(e->{
                text.setText(text.getText()+num);
            });
            frame.add(buttons[i]);
            ;
            x+=60;
        }
        
        JButton plus=new JButton("+");
        JButton equal=new JButton("=");

        plus.setBounds(250,160,50,50);
        equal.setBounds(310,160,50,50);
        frame.add(plus);
        frame.add(equal);
          
        final int[] num1=new int[1];
        plus.addActionListener(e->{
            num1[0]=Integer.parseInt((text.getText()));
            text.setText("")
        });

        equal.addActionListener(e->{
            int num2=Integer.parseInt(text.getText());
            int result =num1[0]+num2;
            text.setText(String.valueOf(result));
        });

        
        frame.setVisible(true);
        
    }
}

