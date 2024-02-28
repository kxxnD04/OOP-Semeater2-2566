import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class StudentView implements ActionListener, WindowListener{
    private JFrame fr;
    private JPanel pa;
    private JLabel id, name, money, show_money;
    private JTextField id_field, name_field;
    private JButton deposit, withdraw;
    
    public StudentView(){
        fr = new JFrame("Student View");
        pa = new JPanel(new GridLayout(4,2 ));
        id = new JLabel("ID :");
        name = new JLabel("Name :");
        money = new JLabel("Money :");
        id_field = new JTextField();
        name_field = new JTextField();
        show_money = new JLabel("0");   
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        show_money.setBackground(Color.gray);
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        
        pa.add(id);
        pa.add(id_field);
        pa.add(name);
        pa.add(name_field);
        pa.add(money);
        pa.add(show_money);
        pa.add(deposit);
        pa.add(withdraw);
        
        fr.add(pa);
        fr.addWindowListener(this);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(250, 250, 250, 200);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new StudentView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(deposit)){
            show_money.setText((Integer.parseInt(show_money.getText()) + 100) + "");
        }else if (e.getSource().equals(withdraw)){
            if (Integer.parseInt(show_money.getText()) >= 100){
                show_money.setText((Integer.parseInt(show_money.getText()) - 100) + "");
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        if(new File("StudentM.dat").exists()){
            Student s = null;
            try(FileInputStream fin = new FileInputStream("StudentM.dat");
                ObjectInputStream Object_IN = new ObjectInputStream(fin)){
                s = ((Student)Object_IN.readObject());
                name_field.setText(s.getName());
                id_field.setText(s.getID()+"");
                show_money.setText(s.getMoney()+"");
                }
        catch(IOException | ClassNotFoundException ex){
                System.out.println(ex);
        }    
    }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try(FileOutputStream fout = new FileOutputStream("StudentM.dat");
            ObjectOutputStream Object_OUT = new ObjectOutputStream(fout);){
            Object_OUT.writeObject(new Student(name_field.getText(), Integer.parseInt(id_field.getText()), Integer.parseInt(show_money.getText())));
        }catch(IOException ex){
            System.out.println(ex);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
}
