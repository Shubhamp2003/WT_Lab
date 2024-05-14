import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

    private JTextField displayField;
    private JButton[] buttons;
    private String[] buttonLabels = { "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", ".", "=", "/" };
    private double currentTotal = 0.0;
    private String currentOperator = "";

    public Calculator() {
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 250);
        setLayout(new BorderLayout());

        displayField = new JTextField();
        displayField.setEditable(false);
        add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));
        buttons = new JButton[buttonLabels.length];
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }
        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonText = ((JButton) e.getSource()).getText();

        if (buttonText.equals("+")) {
            currentTotal = Double.parseDouble(displayField.getText());
            currentOperator = "+";
            displayField.setText("");
        } else if (buttonText.equals("-")) {
            currentTotal = Double.parseDouble(displayField.getText());
            currentOperator = "-";
            displayField.setText("");
        } else if (buttonText.equals("*")) {
            currentTotal = Double.parseDouble(displayField.getText());
            currentOperator = "*";
            displayField.setText("");
        } else if (buttonText.equals("/")) {
            currentTotal = Double.parseDouble(displayField.getText());
            currentOperator = "/";
            displayField.setText("");
        } else if (buttonText.equals("=")) {
            if (currentOperator.equals("+")) {
                currentTotal += Double.parseDouble(displayField.getText());
            } else if (currentOperator.equals("-")) {
                currentTotal -= Double.parseDouble(displayField.getText());
            } else if (currentOperator.equals("*")) {
                currentTotal *= Double.parseDouble(displayField.getText());
            } else if (currentOperator.equals("/")) {
                currentTotal /= Double.parseDouble(displayField.getText());
            }
            displayField.setText("" + currentTotal);
        } else {
            displayField.setText(displayField.getText() + buttonText);
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}