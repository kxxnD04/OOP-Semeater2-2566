import java.awt.*;
import javax.swing.*;
public class MDIFromGUI {
    private JFrame fr;
    private JMenuBar menu;
    private JMenu m1, m2, m3, i1;
    private JMenuItem i2, i3, i4, i5, i6;
    private JDesktopPane dp;
    private JInternalFrame f1, f2, f3;

    public MDIFromGUI() {
       
        fr = new JFrame("SubMenuItem Demo");
        menu = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        i1 = new JMenu("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("Exit");
        i5 = new JMenuItem("Window");
        i6 = new JMenuItem("Message");
        dp = new JDesktopPane();
        f1 = new JInternalFrame("Application 01", true, true, true, true);
        f2 = new JInternalFrame("Application 02", true, true, true, true);
        f3 = new JInternalFrame("Application 03", true, true, true, true);
        f1.setBounds(50, 240, 240, 120);
        f2.setBounds(200, 50, 220, 150);
        f3.setBounds(450, 180, 300, 220);
        f1.setVisible(true);
        f2.setVisible(true);
        f3.setVisible(true);
        dp.add(f1);
        dp.add(f2);
        dp.add(f3);
        dp.setBackground(Color.BLACK);

        i1.add(i5);
//        i1.addSeparator();
        i1.add(i6);
        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m1.add(i4);

        menu.add(m1);
        menu.add(m2);
        menu.add(m3);
        fr.setJMenuBar(menu);
        fr.add(dp);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(600, 250, 800, 500);
        fr.setVisible(true);
    }
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {new MDIFromGUI();});
 }
}
