import java.awt.*;
import javax.swing.*;
public class MyTimer extends JLabel implements Runnable{
    private static final Font f = new Font("Fira Code Sarabun", Font.BOLD, 30);
    private static int sec = 0;
    private static int min = 0;
    private static int hour = 0;
    private static boolean status;
    public boolean getStatus(){
        return status;
    }
    public synchronized void checkPaused(){
        while (status){
            try{
                this.wait();
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
    @Override
    public void run() {
        try{
            while (true){
                checkPaused();
                if(sec == 60){
                    sec = 0;
                    min += 1;
                }else if (min == 60){
                    min = 0;
                    hour += 1;
                }
                setFont(f);
                setText(String.format("%02d:%02d:%02d", hour, min, sec));
                sec++;
                Thread.sleep(10);                   
                }

        }catch (InterruptedException ex) {
                System.out.println(ex);
    }    
}
    public synchronized void stop(){
        status = true;
    }

    public synchronized void resume(){
        this.notify();
        status = false;
    }
    
}
