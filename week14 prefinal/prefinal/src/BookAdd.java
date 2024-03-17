import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BookAdd implements ActionListener{
    private JFrame frame;
    private JPanel pa1, pa2;
    private JLabel name, price, type;
    private JTextField showName, showPrice;
    private JComboBox comboType;
    private JButton insert;
    private static final String[] BookType = {"General", "Computer", "Math&Sci", "Photo3"};
    private Book ManageBook;
    private BookView bookview;
    
    public BookAdd(BookView bv){
        frame = new JFrame("Book Add");
        pa1 = new JPanel(new GridLayout(3, 2));
        pa2 = new JPanel(new FlowLayout());
        name = new JLabel("Name");
        price = new JLabel("Price");
        type = new JLabel("Type");
        showName = new JTextField();
        showPrice = new JTextField();    
        comboType = new JComboBox(BookType);
        insert = new JButton("Insert");
        bookview = bv;
        insert.addActionListener(this);
        pa1.add(name);
        pa1.add(showName);
        pa1.add(price);
        pa1.add(showPrice);
        pa1.add(type);
        pa1.add(comboType);
        
        pa2.add(insert);
        
        frame.add(pa1, BorderLayout.NORTH);
        frame.add(pa2, BorderLayout.CENTER);
        frame.pack();
        frame.setLocation(500, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        ManageBook =  new Book(showName.getText(), Double.valueOf(showPrice.getText()), (String)comboType.getSelectedItem());
        JOptionPane.showMessageDialog(null, "Done it");
        bookview.addBook(ManageBook);
        bookview.updateWhenInsert();
        frame.dispose();
    }
    
}
