import java.awt.event.*;
import javax.swing.*;
public class TimerUse implements MouseListener{
    private JFrame frame;
    private MyTimer clock;
    private Thread t;
    public TimerUse(){
        frame = new JFrame();
        frame.addMouseListener(this);
        clock = new MyTimer();
        t = new Thread(clock);
        t.start();
        frame.add(clock);
        frame.setBounds(600, 600, 200, 120);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new TimerUse();
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(!clock.getStatus()){
            clock.stop();
        }else{
            clock.resume();
        }
    }
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}
