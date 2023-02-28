package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("org.example.Main.Calculadora iniciada!");
        System.out.println("Hello world!");
    }

    public static class Calculadora extends JFrame implements ActionListener {
        private static final long serialVersionUID = 1L;
        private JTextField textField;
        private JButton[] botoes;
        private String[] simbolos = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", ".", "=", "/"};
        private double valor1, valor2, resultado;
        private String operacao;

        public Calculadora() {
            setTitle("org.example.Main.Calculadora");
            setLayout(new BorderLayout());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            textField = new JTextField();
            textField.setHorizontalAlignment(JTextField.RIGHT);
            textField.setEditable(false);
            add(textField, BorderLayout.NORTH);

            JPanel painelBotoes = new JPanel();
            painelBotoes.setLayout(new GridLayout(4, 4));

            botoes = new JButton[16];
            for (int i = 0; i < 16; i++) {
                botoes[i] = new JButton(simbolos[i]);
                botoes[i].addActionListener(this);
                painelBotoes.add(botoes[i]);
            }

            add(painelBotoes, BorderLayout.CENTER);

            pack();
            setLocationRelativeTo(null);
            setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == botoes[0]) {
                textField.setText(textField.getText() + "7");
            } else if (e.getSource() == botoes[1]) {
                textField.setText(textField.getText() + "8");
            } else if (e.getSource() == botoes[2]) {
                textField.setText(textField.getText() + "9");
            } else if (e.getSource() == botoes[3]) {
                valor1 = Double.parseDouble(textField.getText());
                operacao = "+";
                textField.setText("");
            } else if (e.getSource() == botoes[4]) {
                textField.setText(textField.getText() + "4");
            } else if (e.getSource() == botoes[5]) {
                textField.setText(textField.getText() + "5");
            } else if (e.getSource() == botoes[6]) {
                textField.setText(textField.getText() + "6");
            } else if (e.getSource() == botoes[7]) {
                valor1 = Double.parseDouble(textField.getText());
                operacao = "-";
                textField.setText("");
            } else if (e.getSource() == botoes[8]) {
                textField.setText(textField.getText() + "1");
            } else if (e.getSource() == botoes[9]) {
                textField.setText(textField.getText() + "2");
            } else if (e.getSource() == botoes[10]) {
                textField.setText(textField.getText() + "3");
            } else if (e.getSource() == botoes[11]) {
                valor1 = Double.parseDouble(textField.getText());
                operacao = "*";
                textField.setText("");
            }}}
}