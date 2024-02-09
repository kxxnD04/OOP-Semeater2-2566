import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI {
    private JTextField text;
    private JButton zero, one, two, three, four, five, six, seven, eight, nine;
    private JButton c, equal, plus, minus, times, divide;
    private JFrame fr;
    private JPanel pa, pa2;
    public CalculatorTwoGUI(){
//        Font f1 = new Font("Fira Code Sarabun", Font.BOLD, 14);
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
//        seven.setFont(f1);
        
        pa.setLayout(new GridLayout(4, 4));
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
        
        fr.add(text, BorderLayout.NORTH);
        fr.add(pa, BorderLayout.CENTER);
        
//        fr.setResizable(true);
        fr.setBounds(200, 450, 300, 200);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        SwingUtilities.invokeLater(() -> {new CalculatorTwoGUI();});
          new CalculatorTwoGUI();
    }
}
