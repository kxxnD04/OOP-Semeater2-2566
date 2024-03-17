import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
public class BookView implements ActionListener, WindowListener{
//    2.54.48
    private JFrame frame;
    private JPanel pa1, pa2, pa3;
    private JLabel name, price, type;
    private JTextField showName, showPrice, showIndex;
    private JComboBox comboType;
    private JButton goNext, goBack, add, update, delete;
    private  ArrayList<Book> bookStore;
    private static final String[] BookType = {"General", "Computer", "Math&Sci", "Photo3"};
    public BookView(){
        frame = new JFrame("Book View");
        pa1 = new JPanel(new GridLayout(3, 2));
        pa2 = new JPanel(new FlowLayout());
        pa3 = new JPanel(new FlowLayout());
        name = new JLabel("Name");
        price = new JLabel("Price");
        type = new JLabel("Type");
        showName = new JTextField();
        showPrice = new JTextField();
        showIndex = new JTextField("0", 5);
        comboType = new JComboBox(BookType);
        goBack = new JButton("<<<");
        goNext = new JButton(">>>");
        add = new JButton("Add");
        update = new JButton("Update");
        delete = new JButton("Delete");
        bookStore = new ArrayList();
        
        frame.addWindowListener(this);
        goBack.addActionListener(this);
        goNext.addActionListener(this);
        add.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);
        
        pa1.add(name);
        pa1.add(showName);
        pa1.add(price);
        pa1.add(showPrice);
        pa1.add(type);
        pa1.add(comboType);
        
        showIndex.setEditable(false);
        pa2.add(goBack);
        pa2.add(showIndex);
        pa2.add(goNext);
        
        pa3.add(add);
        pa3.add(update);
        pa3.add(delete);
        
        frame.add(pa1, BorderLayout.NORTH);
        frame.add(pa2, BorderLayout.CENTER);
        frame.add(pa3, BorderLayout.SOUTH);
        frame.pack();
        frame.setLocation(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new BookView();
    }
    public void addBook(Book b){
        bookStore.add(b);
    }
    public int checkIndex(String type){
        return switch (type) {
            case "General" -> 0;
            case "Computer" -> 1;
            case "Math&Sci" -> 2;
            default -> 3;
        };
    }
    public void updateWhenInsert(){
        Book b = bookStore.get(bookStore.size()-1);
        showName.setText(b.getName());
        showPrice.setText(String.valueOf(b.getPrice()));
        showIndex.setText(String.valueOf(bookStore.size()));
        comboType.setSelectedIndex(checkIndex(b.getType()));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(add)){
            new BookAdd(this);
        }else if(e.getSource().equals(update)){
            try {
                if(Integer.parseInt(showIndex.getText()) != 0){
                bookStore.get(Integer.parseInt(showIndex.getText())).setName(showName.getText());
                bookStore.get(Integer.parseInt(showIndex.getText())).setPrice(Double.valueOf(showPrice.getText()));
                bookStore.get(Integer.parseInt(showIndex.getText())).setType((String)comboType.getSelectedItem());
                JOptionPane.showMessageDialog(null, "Done it", "Update Command", JOptionPane.INFORMATION_MESSAGE);
              }
            } catch (Exception ex) {ex.printStackTrace();}
        }else if(e.getSource().equals(delete)){
            if (Integer.parseInt(showIndex.getText()) != 0){            
            if (Integer.parseInt(showIndex.getText()) > 1){    
                showName.setText(bookStore.get(Integer.parseInt(showIndex.getText()) - 2).getName());
                showPrice.setText(String.valueOf(bookStore.get(Integer.parseInt(showIndex.getText())-2).getPrice()));
                comboType.setSelectedIndex(checkIndex(bookStore.get(Integer.parseInt(showIndex.getText()) - 2).getType()));
                showIndex.setText(String.valueOf(Integer.parseInt(showIndex.getText()) - 1));
                bookStore.remove(Integer.parseInt(showIndex.getText()));
            }else if (Integer.parseInt(showIndex.getText()) == 1){
                if (bookStore.size() == 1){
                    bookStore.remove(Integer.parseInt(showIndex.getText()) - 1);
                    showName.setText("");
                    showPrice.setText("");
                    comboType.setSelectedIndex(0);     
                    showIndex.setText("0");
                }else if (bookStore.size() > 1){
                    showName.setText(bookStore.get(Integer.parseInt(showIndex.getText())).getName());
                    showPrice.setText(String.valueOf(bookStore.get(Integer.parseInt(showIndex.getText())).getPrice()));
                    comboType.setSelectedIndex(checkIndex(bookStore.get(Integer.parseInt(showIndex.getText())).getType()));                
                    showIndex.setText(String.valueOf(Integer.parseInt(showIndex.getText())));       
                    bookStore.remove(Integer.parseInt(showIndex.getText()));
                }  
            }
            JOptionPane.showMessageDialog(null, "Done it", "Delete Command", JOptionPane.INFORMATION_MESSAGE);       
            }
        }else if(e.getSource().equals(goBack)){
            if(Integer.parseInt(showIndex.getText()) > 1){

                showName.setText(bookStore.get(Integer.parseInt(showIndex.getText()) - 2).getName());
                showPrice.setText(String.valueOf(bookStore.get(Integer.parseInt(showIndex.getText())-2).getPrice()));
                comboType.setSelectedIndex(checkIndex(bookStore.get(Integer.parseInt(showIndex.getText()) - 2).getType()));
                showIndex.setText(String.valueOf(Integer.parseInt(showIndex.getText()) - 1));                
            }
        }else if(e.getSource().equals(goNext)){
            if(Integer.parseInt(showIndex.getText()) < bookStore.size() ){
                showName.setText(bookStore.get(Integer.parseInt(showIndex.getText())).getName());
                showPrice.setText(String.valueOf(bookStore.get(Integer.parseInt(showIndex.getText())).getPrice()));
                comboType.setSelectedIndex(checkIndex(bookStore.get(Integer.parseInt(showIndex.getText())).getType()));                
                showIndex.setText(String.valueOf(Integer.parseInt(showIndex.getText()) +1));                
            }
        }
    }
    @Override
    public void windowOpened(WindowEvent e) {
        if (new File("Book.data").exists()){
            try(FileInputStream f = new FileInputStream("Book.data");
                ObjectInputStream fin = new ObjectInputStream(f);) {
                bookStore = (ArrayList<Book>) fin.readObject();
                showName.setText(bookStore.get(0).getName());
                showPrice.setText(String.valueOf(bookStore.get(0).getPrice()));
                comboType.setSelectedIndex(checkIndex(bookStore.get(0).getType()));
                showIndex.setText("1");
            }catch(Exception ex){ex.printStackTrace();}
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        if (!bookStore.isEmpty()){
            try(FileOutputStream f = new FileOutputStream("Book.data");
            ObjectOutputStream fout = new ObjectOutputStream(f);) {
            fout.writeObject(bookStore);
            }catch(Exception ex){ex.printStackTrace();}
        }
    }
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
}
