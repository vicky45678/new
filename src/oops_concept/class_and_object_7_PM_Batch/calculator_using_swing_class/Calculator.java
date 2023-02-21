package oops_concept.class_and_object_7_PM_Batch.calculator_using_swing_class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    private JTextField inputField;
    private double firstNum = 0, secondNum = 0, result = 0;
    private char operator;

    public Calculator() {
        super("Calculator");

        // Set up the input field
        inputField = new JTextField("", 15);
        inputField.setEditable(false);

        // Set up the number buttons
        JPanel numberPanel = new JPanel(new GridLayout(4, 3));
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(Integer.toString(i));
            button.addActionListener(this);
            numberPanel.add(button);
        }

        // Set up the zero button
        JButton buttonZero = new JButton("0");
        buttonZero.addActionListener(this);
        numberPanel.add(buttonZero);

        // Set up the operator buttons
        JPanel operatorPanel = new JPanel(new GridLayout(4, 1));
        JButton buttonAdd = new JButton("+");
        JButton buttonSubtract = new JButton("-");
        JButton buttonMultiply = new JButton("*");
        JButton buttonpercentage = new JButton("%");
        JButton buttonDivide = new JButton("/");
        JButton buttonEquals = new JButton("=");
        buttonAdd.addActionListener(this);
        buttonSubtract.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonpercentage.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonEquals.addActionListener(this);

        operatorPanel.add(buttonAdd);
        operatorPanel.add(buttonSubtract);
        operatorPanel.add(buttonMultiply);
        operatorPanel.add(buttonDivide);

        // Add the components to the content pane
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(inputField, BorderLayout.NORTH);
        c.add(numberPanel, BorderLayout.CENTER);
        c.add(operatorPanel, BorderLayout.EAST);
        c.add(buttonEquals, BorderLayout.SOUTH);

        // Set the size and make the window visible
        setSize(200, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();
        char ch = input.charAt(0);

        if (ch >= '0' && ch <= '9') {
            inputField.setText(inputField.getText() + input);
        } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            firstNum = Double.parseDouble(inputField.getText());
            operator = ch;
            inputField.setText("");
        } else if (ch == '=') {
            secondNum = Double.parseDouble(inputField.getText());
            switch (operator) {
                case '+':
                    result = firstNum + secondNum;
                    break;
                case '-':
                    result = firstNum - secondNum;
                    break;
                case '*':
                    result = firstNum * secondNum;
                    break;
                case '/':
                    result = firstNum / secondNum;
                    break;
                case '%':
                    result= firstNum%secondNum;
                    break;
            }
            inputField.setText(Double.toString(result));
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setVisible(true);
    }
}
