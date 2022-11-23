package ru.mirea.task16;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontMenu extends JFrame
{
    FontMenu()
    {
        super("The menu");
        String[] colorch = {"blue", "red", "black"};
        String[] fontch = {"Times New Roman", "MS Sans Serif", "Courier New"};
        Color[] colors = {Color.BLUE, Color.RED, Color.BLACK};
        Font[] fonts =
                {
                        new Font(fontch[0], Font.PLAIN, 14),
                        new Font(fontch[1], Font.ITALIC, 14),
                        new Font(fontch[2], Font.BOLD, 14),};
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JComboBox<String> jComboColorBox = new JComboBox<>(colorch);
        jComboColorBox.setBounds(10, 50, 100, 20);

        JComboBox<String> jComboFontBox = new JComboBox<>(fontch);
        jComboFontBox.setBounds(120, 50, 150, 20);

        JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(17, 100, 300, 100);

        add(jComboColorBox);
        add(jComboFontBox);
        add(jTextArea);

        setLayout(null);
        setSize(350, 250);
        setVisible(true);

        jComboColorBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setForeground(colors[jComboColorBox.getSelectedIndex()]);
            }
        });

        jComboFontBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setFont(fonts[jComboFontBox.getSelectedIndex()]);
            }
        });
    }

    public static void main(String[] args) {
        new FontMenu();
    }
}
