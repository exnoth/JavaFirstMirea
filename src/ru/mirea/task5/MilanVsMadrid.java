package ru.mirea.task5;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//Порядок работы:
// 1) Создайте пользовательское JFrame приложение, у которого есть следующие
//компоненты GUI:
// •одна кнопка JButtonподписана “ACMilan”
// •другая JButtonподписана “RealMadrid”
// •надпись JLabel содержит текст “Result: 0 X 0”
// •надпись JLabel содержиттекст“Last Scorer: N/A”
// •надпись Label содержит текст “Winner: DRAW”;
// Всякийраз,  когда  пользователь  нажимает  на  кнопку  AC  Milan,
// результат будет увеличиваться для Милана, сначала 1 X 0, затем 2 X 0 и так далее.
// Last Scorer означает последнюю забившую команду. В этом случае: AC  Milan.
// Если пользователь нажимает кнопку для команды Мадрид, то счет приписывается ей.
// Победителем становится команда, которая имеет больше кликов кнопку на соответствующую, чем другая.
public class MilanVsMadrid extends JFrame
{
    JLabel label1, label2, label3, label4, label5, label6, label7, label8;
    JButton button1, button2;
    JTextField tf1, tf2;
    int a = 0, a1 = 0;
    String x, y, str1 = "AC Milan", str2 ="Real Madrid" ;
    eHandler handler = new eHandler();

    public MilanVsMadrid(String str)
    {
        super();
        setLayout(new FlowLayout());
        button1 = new JButton("AC Milan");
        button2 = new JButton("Real Madrid");
        label8 = new JLabel("        ");
        label1 = new JLabel("Result");
        label2 = new JLabel("Last Scorer: ");
        label3 = new JLabel("Winner: ");
        label4 = new JLabel("x");
        tf1 = new JTextField("0", 3);
        tf2 = new JTextField("0", 3);
        label5 = new JLabel("No goals yet");
        label6 = new JLabel("        ");
        label7 = new JLabel("No goals yet");
        add(button1);
        add(button2);
        add(label8);
        add(label1);
        add(tf1);
        add(label4);
        add(tf2);
        add(label6);
        add(label2);
        add(label5);
        add(label6);
        add(label3);
        add(label7);
        button1.addActionListener(handler);
        button2.addActionListener(handler);
    }

    public class eHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {

            if(e.getSource() == button1)
            {
                a = Integer.parseInt(tf1.getText());
                a++;
                x =""+a;
                tf1.setText(null);
                tf1.setText(x);
                label5.setText(null);
                label5.setText(str1);
                if(a>a1)
                {
                    label7.setText(null);
                    label7.setText(str1);
                }

            }
            else if(e.getSource() == button2)
            {
                a1 = Integer.parseInt(tf2.getText());
                a1++;
                y =""+a1;
                tf2.setText(null);
                tf2.setText(y);
                label5.setText(null);
                label5.setText(str2);
                if(a1>a)
                {
                    label7.setText(null);
                    label7.setText(str2);
                }
            }
        }
    }

}
