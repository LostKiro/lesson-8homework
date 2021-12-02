package ru.geekbrains;

import javax.swing.*;

public class Calculator extends JFrame {
    public Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
