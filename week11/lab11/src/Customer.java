public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    public Customer(String firstName, String lastName, CheckingAccount acct){
        this.acct = acct;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Customer(String firstName, String lastName){
        this(firstName, lastName, null);
    }
    public Customer(){
        this("", "", null);
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
    public void setAcct(CheckingAccount acct){
        this.acct = acct;
    }
    public CheckingAccount getAcct(){
        return acct;
    }
    @Override
    public String toString(){
        return (acct == null ? firstName + " " + lastName + " doesn’t have account."
       : "The " + firstName + " account has " + acct.getBalance() +" baht and " + acct.getCredit() + " credits.");
    }
    public boolean equals(Customer c){
        return this.getFirstName().equals(c.getFirstName()) & this.getLastName().equals(c.getLastName());
    }
}
