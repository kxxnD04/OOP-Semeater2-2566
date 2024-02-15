import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorSample implements ActionListener{
    private JTextField text;
    private JButton zero, one, two, three, four, five, six, seven, eight, nine;
    private JButton c, equal, plus, minus, times, divide;
    private JFrame fr;
    private JPanel pa;
    private double num1, num2;
    private boolean checknum1 = false;
    private boolean checknum2 = false;
    private String operator = "";
    public CalculatorSample(){

        text = new JTextField();
        fr = new JFrame("My Calculator");
        pa = new JPanel();
        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        c = new JButton("c");
        equal = new JButton("=");
        plus = new JButton("+");
        minus = new JButton("-");
        times = new JButton("x");
        divide = new JButton("/");
        
        zero.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        c.addActionListener(this);
        equal.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        times.addActionListener(this);
        divide.addActionListener(this);

        pa.setLayout(new GridLayout(4, 1));
        pa.add(seven);
        pa.add(eight);
        pa.add(nine);
        pa.add(plus);
        pa.add(four);
        pa.add(five);
        pa.add(six);
        pa.add(minus);
        pa.add(one);
        pa.add(two);
        pa.add(three);
        pa.add(times);
        pa.add(zero);
        pa.add(c);
        pa.add(equal);
        pa.add(divide);
        
        text.setEditable(false);
        fr.add(text, BorderLayout.NORTH);
        fr.add(pa, BorderLayout.CENTER);

        fr.setBounds(200, 450, 300, 200);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new CalculatorSample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton j = (JButton) e.getSource();
        if (j.getText().equals("c")){
            text.setText("");
            checknum1 = false;
            checknum2 = false;
            num1 = 0.0;
            num2 = 0.0;
        }else if((j.getText().equals("+") || j.getText().equals("-") || 
                j.getText().equals("x") || j.getText().equals("/")) ) {
            if (!text.getText().equals("")){
                if (checknum1 == true & checknum2 == false){
                    num2 = Double.parseDouble(text.getText());
                    if(operator.equals("+")){
                        num1 = (1.0*num1) + num2;
                    }else if(operator.equals("-")){
                        num1 = (1.0*num1) - num2;
                    }else if(operator.equals("x")){
                        num1 = (1.0*num1)*num2;
                    }else if(operator.equals("/")){
                        num1 = (1.0*num1)/num2;}
                    operator = j.getText();
                }else{
                num1 = Double.parseDouble(text.getText());
                checknum1 = true;
                operator = j.getText();
                }
                }
            text.setText("");

        }else if (j.getText().equals("=")){           
            if (!text.getText().equals("")){
                num2 = Double.parseDouble(text.getText());
                checknum2 = true;
            }
            if(checknum1 == true && checknum2 == true && !("".equals(operator))){
                double ans = 0.0;
                if(operator.equals("+")){
                    ans = (1.0*num1) + num2;
                }else if(operator.equals("-")){
                    ans = (1.0*num1) - num2;
                }else if(operator.equals("x")){
                    ans = (1.0*num1)*num2;
                }else if(operator.equals("/")){
                    ans = (1.0*num1)/num2;
                }
                if (ans - (int)ans == 0.0){
                    text.setText(String.valueOf((int)Math.round(ans)));
                }else{
                    text.setText(String.valueOf(ans));                    
                }
                checknum1 = false;
                checknum2 = false;
                operator = "";
                num1 = 0.0;
                num2 = 0.0;
            }
        }else{
            text.setText(text.getText() + j.getText());
        }
    }
}
