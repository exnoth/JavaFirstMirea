package ru.mirea.task15;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator extends JFrame
{
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button1 = new JButton("Add");
    JButton button2 = new JButton("Extract");
    JButton button3 = new JButton("Multiply");
    JButton button4 = new JButton("Divide");
    Font fnt = new Font("Comic Sans", Font.BOLD, 20);

    Calculator()
    {
        super("Calculator");
        setLayout(new FlowLayout());
        setSize(250,150);

        add(new JLabel("First number"));
        add(jta1);

        add(new JLabel("Second number"));
        add(jta2);

        add(button1);
        add(button2);
        add(button3);
        add(button4);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2)
                                                    , "Alert", JOptionPane.INFORMATION_MESSAGE);
                }catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Error in Numbers!"
                                                    , "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 - x2)
                            , "Alert", JOptionPane.INFORMATION_MESSAGE);
                }catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Error in Numbers!"
                            , "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 * x2)
                            , "Alert", JOptionPane.INFORMATION_MESSAGE);
                }catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Error in Numbers!"
                            , "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1/x2)
                            , "Alert", JOptionPane.INFORMATION_MESSAGE);
                }catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Error in Numbers!"
                            , "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Calculator();
    }


}
