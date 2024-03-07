import javax.swing.*;
public class MyFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyClock clock = new MyClock();
        Thread t = new Thread(clock);
        t.start();
        frame.add(clock);
        frame.setBounds(600, 600, 200, 120);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
