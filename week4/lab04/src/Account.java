public class Account {
    public double balance;
    public String name;
    public void deposit(double b){
        balance += b >= 0 ? b:0;
        if (b < 0) {System.out.println("The balance variable must be greater than or equal to zero.");}
    }
    public double withdraw(double b){
        if (b < 0) {
            System.out.println("The balance variable must be greater than or equal to zero.");
            balance = 0;
        }else {balance -= b;}
        if (balance < 0) {
            balance += b;
            System.out.println("Your account balance is insufficient.");
        }
        return balance;
    }
    public void showInfo(){
        System.out.println("In " + name + " account, there is a balance equal to "+ balance + " baht.");
    }
}
