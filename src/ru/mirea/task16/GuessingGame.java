package ru.mirea.task16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;


class GuessingGame extends JFrame {
    JButton tryButton = new JButton("Guess!");
    JTextField numberField = new JTextField();
    JLabel jLabel = new JLabel("Try to guess a number in between 0 and 20!");
    int guessNumber = (int)(Math.random() * 20);
    int clickCount = 0;

    public GuessingGame() {
        super("-Guessing Game-");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);

        JPanel grid = new JPanel(new GridLayout(3, 1, 5, 0));
        grid.add(jLabel);
        grid.add(numberField);
        grid.add(tryButton);

        JPanel flowButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        flowButton.add(grid);

        Container window = getContentPane();
        window.add(flowButton);

        tryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int userNumber = Integer.parseInt(numberField.getText());
                if (userNumber == guessNumber) {
                    jLabel.setText("You won!");
                    numberField.setVisible(false);
                    tryButton.setVisible(false);
                } else {
                    if (userNumber < guessNumber) {
                        jLabel.setText("The number is bigger");
                    } else {
                        jLabel.setText("The number is smaller");
                    }
                }
                clickCount++;
                if (clickCount == 3 && userNumber != guessNumber) {
                    jLabel.setText("Your game is over. No more tries.");
                    numberField.setVisible(false);
                    tryButton.setVisible(false);
                }
            }
        });
    }

    public static void main(String[] args) {
        new GuessingGame().setVisible(true);
    }
}