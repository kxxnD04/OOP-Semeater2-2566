import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class TextEditor implements ActionListener{
//    38.15 sec
    private JFrame frame;
    private JPanel panel;
    private JTextArea text;
    private JMenuBar menu;
    private JMenu file;
    private JMenuItem ne_w, open, save, close;
    
    public TextEditor(){
        frame = new JFrame("My Text Editor");
        panel = new JPanel();
        text = new JTextArea();
        menu = new JMenuBar();
        file = new JMenu("File");
        ne_w = new JMenuItem("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        close = new JMenuItem("Close");
        
        panel.setLayout(new GridLayout(0,1));
        file.add(ne_w);
        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(close);
        
        
        ne_w.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        close.addActionListener(this);

        menu.add(file);
        frame.setJMenuBar(menu);
        panel.add(text);
        frame.add(panel);
        frame.setBounds(300, 300, 500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    public static void main(String[] args) {
        new TextEditor();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ne_w)){
            text.setText("");
        }else if(e.getSource().equals(open)){
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(frame); // fr คือ ตัวแปรออปเจ็ค JFrame
            File f = fc.getSelectedFile();
            try(FileReader fin = new FileReader(f);){
                int ch;
                while ((ch = fin.read()) != -1){
                    text.setText(text.getText() + (char)ch);
                }
            } catch (FileNotFoundException ex) {} 
              catch (IOException ex) {}
        }else if (e.getSource().equals(save)){
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(frame); // fr คือ ตัวแปรออปเจ็ค JFrame
            File f = fc.getSelectedFile();
            try (FileWriter fout = new FileWriter(f);){
                fout.write(text.getText());
            } catch (IOException ex) {}
        }else if (e.getSource().equals(close)){
            System.exit(0);
        }
    }
}
