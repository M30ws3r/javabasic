package HW;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BabyCalculator extends JFrame{
	//0.멤버변수 선언, 1.객체생성
    private JTextField inputSpace = new JTextField();
    private final String[] buttonNames = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "0", "=", "-", "*", "/"};
    private final JButton[] buttons = new JButton[buttonNames.length];
    private final ArrayList<String> equation = new ArrayList<>();
    private String num = "";

    public BabyCalculator() {
        initializeUI();
    }
    
    //2. 화면 붙이기 및 출력
    private void initializeUI() {
        setTitle("유치원생계산기");
        setBounds(200, 200, 200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        inputSpace.setEditable(false);
        inputSpace.setBackground(Color.WHITE);
        inputSpace.setHorizontalAlignment(JTextField.RIGHT);
        inputSpace.setFont(new Font("Arial", Font.BOLD, 50));

        JPanel buttonPanel = new JPanel(new GridLayout(5, 3));
        for (int i = 0; i < buttonNames.length; i++) {
            buttons[i] = new JButton(buttonNames[i]);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 20));
            buttons[i].addActionListener(new ButtonListener());
            buttonPanel.add(buttons[i]);
        }
        add(inputSpace, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(command.equals("=")){
                inputSpace.setText(Double.toString(calculate(inputSpace.getText())));
                num = "";
            }else{
                inputSpace.setText(inputSpace.getText()+command);
            }
        }
    }
    //계산
    private double calculate(String inputText) {
        fullTextParsing(inputText);
        double result = 0;
        String operation = "";
        for (String s : equation) {
            switch (s) {
                case "+": operation = "+"; break;
                case "-": operation = "-"; break;
                case "*": operation = "*"; break;
                case "/": operation = "/"; break;
                default:
                    double value = Double.parseDouble(s);
                    if (operation.isEmpty()) {
                        result = value;
                    } else {
                        result = executeOperation(result, value, operation);
                    }
            }
        }
        return result;
    }
    //기호에 따라 연산 다르게 구현
    private double executeOperation(double a, double b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return b!=0? a / b : Double.NaN; // Avoid division by zero
            default: return a;
        }
    }
    private void fullTextParsing(String inputText) {
        equation.clear();
        num = "";
        for (char ch : inputText.toCharArray()) {
            if ("+-*/".indexOf(ch) != -1) {
                equation.add(num);
                equation.add(String.valueOf(ch));
                num = "";
            } else {
                num += ch;
            }
        }
        if(!num.isEmpty()) {
            equation.add(num);
        }
    }
    public static void main(String[] args) {
        new BabyCalculator();
    }
}