package ru.ilmira.lesson8;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class Calculator extends JFrame {
    double value1 = 0;
    String operation = "+";
    public JTextField field = new JTextField();

    Calculator() {
        setBounds(350, 350, 300, 350);
        setTitle("Калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        field.setFont(new Font("Arial", Font.BOLD, 24));
        field.setBounds(16, 10, 248, 36);
        field.setBackground(Color.white);
        field.setHorizontalAlignment(JTextField.RIGHT);
        field.setEditable(false);

        add(field, BorderLayout.NORTH);
        JPanel buttonForm = new JPanel(new GridLayout(5, 4));
        add(buttonForm, BorderLayout.CENTER);
        JButton buttonClear = new JButton("C");
        buttonForm.add(buttonClear);
        JButton buttonPlus = new JButton("+");
        buttonForm.add(buttonPlus);
        JButton buttonMinus = new JButton("-");
        buttonForm.add(buttonMinus);
        JButton button7 = new JButton("7");
        buttonForm.add(button7);
        JButton button8 = new JButton("8");
        buttonForm.add(button8);
        JButton button9 = new JButton("9");
        buttonForm.add(button9);
        JButton button4 = new JButton("4");
        buttonForm.add(button4);
        JButton button5 = new JButton("5");
        buttonForm.add(button5);
        JButton button6 = new JButton("6");
        buttonForm.add(button6);
        JButton button1 = new JButton("1");
        buttonForm.add(button1);
        JButton button2 = new JButton("2");
        buttonForm.add(button2);
        JButton button3 = new JButton("3");
        buttonForm.add(button3);

        JButton buttonNull = new JButton("0");
        buttonForm.add(buttonNull);
        JButton buttonMultiply = new JButton("*");
        buttonForm.add(buttonMultiply);
        JButton buttonDivide = new JButton("/");
        buttonForm.add(buttonDivide);
        JButton buttonRes = new JButton("=");
        add(buttonRes, BorderLayout.SOUTH);

        buttonNull.addActionListener(e -> field.setText(field.getText() + "0"));
        button1.addActionListener(e -> field.setText(field.getText() + "1"));
        button2.addActionListener(e -> field.setText(field.getText() + "2"));
        button3.addActionListener(e -> field.setText(field.getText() + "3"));
        button4.addActionListener(e -> field.setText(field.getText() + "4"));
        button5.addActionListener(e -> field.setText(field.getText() + "5"));
        button6.addActionListener(e -> field.setText(field.getText() + "6"));
        button7.addActionListener(e -> field.setText(field.getText() + "7"));
        button8.addActionListener(e -> field.setText(field.getText() + "8"));
        button9.addActionListener(e -> field.setText(field.getText() + "9"));

        buttonClear.addActionListener(e -> {
            field.setText("");
            value1 = 0;
        });
        buttonPlus.addActionListener(e -> {
            value1 = Double.parseDouble(field.getText());
            field.setText("");
            operation = "+";
        });
        buttonMinus.addActionListener(e -> {
            value1 = Double.parseDouble(field.getText());
            field.setText("");
            operation = "-";
        });
        buttonMultiply.addActionListener(e -> {
            value1 = Double.parseDouble(field.getText());
            field.setText("");
            operation = "*";
        });
        buttonDivide.addActionListener(e -> {
            value1 = Double.parseDouble(field.getText());
            field.setText("");
            operation = "/";
        });
        buttonRes.addActionListener(e -> {
            double value2 = Double.parseDouble(field.getText());
            double result = 0;
            if ("+".equals(operation)) {
                result = value1 + value2;
            }
            if ("-".equals(operation)) {
                result = value1 - value2;
            }
            if ("*".equals(operation)) {
                result = value1 * value2;
            }
            if ("/".equals(operation)) {
                result = value1 / value2;
            }

            DecimalFormat df = new DecimalFormat("###.###");
            field.setText(df.format(result));
            value1 = 0;
            operation = "+";
        });
        setVisible(true);
    }
}
