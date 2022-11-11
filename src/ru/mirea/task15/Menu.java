package ru.mirea.task15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Menu extends JFrame
{
    Menu()
    {
        super("Menu");

        String[] options = {"Russia", "China", "Japan", "Australia"};
        String[] descr = {
                "<html>Russia is the biggest country on our planet.<BR> " +
                        "Also it is the origin of popular 'doomer' memes/aesthetic trend.<BR>" +
                        "Kinda depressing imo.</html>",
                "<html>China has the largest amount of residents.<BR>" +
                        "Is the origin of 'social  credit' memes.<BR>Won't consider it noice.</html>",
                "<html>Japan.<BR> Funky country with impressive culture, but most of people think<BR>" +
                        "of it when they mention anime. <BR>Have you stayed at Shirakawa btw?</html>",
                "<html>Australia is a very good country to live in.<BR>Funny accent, funny animals," +
                        " but sometimes crazy people such as MaxMoeFoe.<i>Ugh....funky little fella</i></html>"};

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComboBox <String> jComboBox = new JComboBox<>(options);
        jComboBox.setBounds(80,50,140,20);

        JLabel lbl = new JLabel();
        lbl.setBounds(30,100,400,100);
        lbl.setText(descr[0]);


        JLabel fon = new JLabel();
        fon.setBounds(0, 0, 500, 500);
        fon.setIcon( new ImageIcon("C:\\Users\\алина\\Downloads\\hKc4jVOM7WE.jpg"));
        fon.setHorizontalAlignment(SwingConstants.LEFT);
        JLabel wha = new JLabel();
        wha.setBounds(30,100,400,100);
        wha.setIcon( new ImageIcon("C:\\Users\\алина\\Downloads\\fon.jpg"));
        add(jComboBox);
        add(lbl);add(wha);
        add(fon);


        setLayout(null);
        setSize(500,500);
        setVisible(true);

        jComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dscrptn = descr[jComboBox.getSelectedIndex()];
                lbl.setText(dscrptn);
            }
        });
    }

    public static void main(String[] args)
    {
        new Menu();
    }
}
