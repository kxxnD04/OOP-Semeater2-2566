import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class Main {
    private JLabel balance, amount, cash;
    private JTextField text;
    private JButton depo, with, exit;
    private JFrame fr;
    private JPanel pa1;
    public Main(){
        fr = new JFrame("Teller GUI");
        text = new JTextField();
        balance = new JLabel("Balance");
        amount = new JLabel("Amount");
        cash = new JLabel("6000");
        depo = new JButton("Deposit");
        with = new JButton("Withdraw");
        exit = new JButton("Exit");
        pa1 = new JPanel();
        pa1.setLayout(new GridLayout(2, 2));
        fr.setLayout(new GridLayout(1, 1));
        
        pa1.add(balance);
        pa1.add(cash);
        pa1.add(amount);
        pa1.add(text);
        pa1.setBorder(new EmptyBorder(70, 70, 70, 70));
        fr.add(pa1);
        
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(600, 250, 270, 250);
        fr.setVisible(true);
    }
     public static void main(String[] args) {
        new Main();
 }
}

