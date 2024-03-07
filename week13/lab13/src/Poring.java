import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class Poring extends Thread implements MouseListener{
    private static int count = 0;
    private JFrame frame;
    private JPanel panel;
    private JLabel poringCount, poringLabel;
    private ImageIcon poringImage, poringScale;
//    private ArrayList list;
    public Poring(){
        count += 1;
//        list = new ArrayList();
//        list.add(new ImageIcon("StrawberryPanwit.png"));
//        list.add(new ImageIcon("ChoSpeedSmol.jpg"));
//        list.add(new ImageIcon("Olarn.png"));
//        list.add(new ImageIcon("sooksan.jpg"));
//        list.add(new ImageIcon("TravisScott.png"));
        Random random = new Random();
        frame = new JFrame();
        panel = new JPanel(new FlowLayout());
//        poringImage = (ImageIcon)list.get(random.nextInt(0,5 ));
//        poringScale = new ImageIcon(poringImage.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH));
        poringImage = new ImageIcon("poringjaa.png");
        poringLabel = new JLabel(poringImage);
        poringLabel.setText(String.valueOf(count));
        poringLabel.addMouseListener(this);
        panel.add(poringLabel);
        
        frame.add(panel);
        frame.pack();
        frame.setLocation(random.nextInt(900), random.nextInt(900));
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        
        
    }
    @Override
    public void run(){
        while (true){
            try {
                Poring.sleep(100);
                frame.setLocation(frame.getX() +7, frame.getY() + 7);
                Poring.sleep(100);
                frame.setLocation(frame.getX() -7, frame.getY() - 7);
                Poring.sleep(100);
                frame.setLocation(frame.getX() +5, frame.getY() + 5);
                Poring.sleep(100);
                frame.setLocation(frame.getX() -5, frame.getY()  - 5);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        frame.dispose();

    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
//    public static void main(String[] args) {
//       new Poring().start();
//    }
}
