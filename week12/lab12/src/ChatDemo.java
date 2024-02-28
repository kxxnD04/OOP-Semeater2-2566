import java.io.*;
import java.awt.event.*;
import java.awt.*;
import java.time.LocalDateTime;
import javax.swing.*;
import java.time.format.*;
public class ChatDemo implements ActionListener, WindowListener{
    private static final Font f = new Font("Fira Code Sarabun", Font.BOLD, 11);
    private JFrame fr;
    private JPanel pa;
    private JButton submit, reset;
    private JTextArea text;
    private JTextField tfield;
    
    public ChatDemo(){
        fr = new JFrame("ChatDemo");
        pa = new JPanel();
        submit = new JButton("Submit");
        reset = new JButton("Reset");
        text = new JTextArea(15, 20);
        tfield = new JTextField(45);
        tfield.setFont(f);
        text.setEditable(false);
        pa.setLayout(new FlowLayout());
        submit.addActionListener(this);
        reset.addActionListener(this);
        pa.add(submit);
        pa.add(reset);
        
        fr.addWindowListener(this);
        fr.add(text, BorderLayout.NORTH);
        fr.add(tfield, BorderLayout.CENTER);
        fr.add(pa, BorderLayout.SOUTH);
        fr.pack();
        fr.setLocation(300, 300);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(submit) && !"".equals(tfield.getText())){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss: ");
            text.append(dtf.format(LocalDateTime.now()) + tfield.getText()+"\n");
            text.setFont(f);
            tfield.setText("");
        }else if (e.getSource().equals(reset)){
            text.setText("");
            tfield.setText("");
        }
    }
    public static void main(String[] args) {
       new ChatDemo();
    }

    @Override
    public void windowOpened(WindowEvent e) {
        if (new File("ChatDemo.dat").exists()){
            try(FileReader fin = new FileReader("ChatDemo.dat");){
                int ch;
                text.setFont(f);
                while ((ch=fin.read()) != -1){
                    text.setText(text.getText()+(char)ch);
                }
            }catch(IOException ex){
                System.out.println(ex);
            }
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try(FileWriter fout = new FileWriter("ChatDemo.dat");){
           fout.write(text.getText());
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
