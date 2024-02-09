import javax.swing.*;
import java.awt.*;
public class CalculatorOneGUI {
    private JFrame fr;
    private JTextField text1, text2, text3;
    private JPanel pa;
    private JButton plus, minus, times, divide;
    public CalculatorOneGUI(){
        fr = new JFrame();
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        pa = new JPanel();
        plus = new JButton("บวก");
        minus = new JButton("ลบ");
        times = new JButton("คูณ");
        divide = new JButton("หาร");
        plus.setFont(new Font("Fira Code Sarabun", Font.BOLD, 14));
        minus.setFont(new Font("Fira Code Sarabun", Font.BOLD, 14));
        times.setFont(new Font("Fira Code Sarabun", Font.BOLD, 14));
        divide.setFont(new Font("Fira Code Sarabun", Font.BOLD, 14));
        fr.setTitle("เครื่องคิดเลข");
        fr.setLayout(new GridLayout(4, 1));
        pa.setLayout(new FlowLayout());
        
        pa.add(plus);
        pa.add(minus);
        pa.add(times);
        pa.add(divide);
        
        fr.add(text1);
        fr.add(text2);
        fr.add(pa);
        fr.add(text3);
        
        fr.setResizable(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new CalculatorOneGUI();
 }
}
