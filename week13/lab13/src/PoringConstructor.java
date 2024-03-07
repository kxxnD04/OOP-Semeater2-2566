import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class PoringConstructor implements ActionListener{
    private JFrame frame;
    private JPanel panel;
    private JButton add;
    public PoringConstructor(){
        frame = new JFrame();
        panel = new JPanel();
        add = new JButton("Add");
        
        panel.add(add);
        frame.add(panel, BorderLayout.CENTER);
        add.addActionListener(this);
        frame.pack();
        frame.setLocation(750, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Poring().start();
    }
    
    public static void main(String[] args) {
        new PoringConstructor();
    }
}
