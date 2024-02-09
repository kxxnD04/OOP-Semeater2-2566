import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JLabel balance, amount, cash;
    private JTextField text;
    private JButton depo, with, exit;
    private JFrame fr;
    private JPanel pa1, pa2;
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        text = new JTextField();
        balance = new JLabel("Balance");
        amount = new JLabel("Amount");
        cash = new JLabel("6000");
        depo = new JButton("Deposit");
        with = new JButton("Withdraw");
        exit = new JButton("Exit");
        pa1 = new JPanel();
        pa2 = new JPanel();
        pa1.setLayout(new GridLayout(2, 2));
        pa2.setLayout(new FlowLayout());
        fr.setLayout(new GridLayout(2, 1));
        
        pa1.add(balance);
        pa1.add(cash);
        pa1.add(amount);
        pa1.add(text);
        
        pa2.add(depo);
        pa2.add(with);
        pa2.add(exit);
        
        fr.add(pa1);
        fr.add(pa2);
        
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(600, 250, 270, 250);
        fr.setVisible(true);
    }
     public static void main(String[] args) {
        new TellerGUI();
 }
}
