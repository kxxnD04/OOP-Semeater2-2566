import java.util.*;
public class Customer {
    // ข้อสอง
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;
    public void addAccount(Account acct){
        int index = 0;
        if (numOfAccount < 5){
            while (true){
                if (this.acct[index] == null){
                    this.acct[index] = acct;
                    break;
                }
                index++;
            }
        numOfAccount++;
        }
    }    
    public Customer(String firstName, String lastName){
        acct = new Account[5];
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Customer(){
        this("", "");
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public Account[] getAcct(){
        return acct;
    }
    @Override
    public String toString(){
        return firstName + " " + lastName + " has " + numOfAccount + (numOfAccount > 1 ? " accounts.": " account.");
    }
    public Account getAccount(int index){
        return acct[index];
    }
    public int getNumOfAccount(){
        return numOfAccount;
    }
    public boolean equals(Customer c){
        return this.getFirstName().equals(c.getFirstName()) & this.getLastName().equals(c.getLastName());
    }
//    private String firstName;
//    private String lastName;
//    private ArrayList acct;
//    private int numOfAccount;
//    public void addAccount(Account acct){
//        this.acct.add(acct);
//        numOfAccount++;
//    }    
//    public Customer(String firstName, String lastName){
//        acct = new ArrayList();
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//    public Customer(){
//        this("", "");
//    }
//    public void setFirstName(String firstName){
//        this.firstName = firstName;
//    }
//    public String getFirstName(){
//        return firstName;
//    }
//    public void setLastName(String lastName){
//        this.lastName = lastName;
//    }
//    public String getLastName(){
//        return lastName;
//    }
//    public ArrayList getAcct(){
//        return acct;
//    }
//    @Override
//    public String toString(){
//        return firstName + " " + lastName + " has " + acct.size() + (acct.size() > 1 ? " accounts.": " account.");
//    }
//    public Account getAccount(int index){
//        return (Account) acct.get(index);
//    }
//    public int getNumOfAccount(){
//        return acct.size();
//    }
//    public boolean equals(Customer c){
//        return this.getFirstName().equals(c.getFirstName()) & this.getLastName().equals(c.getLastName());
//    }
}
