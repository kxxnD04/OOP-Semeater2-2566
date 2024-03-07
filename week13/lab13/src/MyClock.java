import java.awt.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class MyClock extends JLabel implements Runnable{
    private static final Font f = new Font("Fira Code Sarabun", Font.BOLD, 30);
    @Override
    public void run() {
        while (true){
            try {
                Calendar d = Calendar.getInstance();
                int sec = d.get(Calendar.SECOND);
                int min = d.get(Calendar.MINUTE);
                int hour = d.get(Calendar.HOUR_OF_DAY);
                setFont(f);
                setText(String.format("%02d:%02d:%02d", hour, min, sec));
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
