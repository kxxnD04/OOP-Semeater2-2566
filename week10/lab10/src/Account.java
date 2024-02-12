public class Account {
    protected double balance;
    protected String name;
    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
    public void deposit(double a){
        if (a <= 0){
            System.out.println("Input number must be a positive integer.");
        }else {
            this.setBalance(this.getBalance() + a);
            System.out.println(a + " baht is deposited to "+ this.getName() + ".");
        }
    }
    public void withdraw(double a){
        if (a <= 0){
            System.out.println("Input number must be a positive integer.");
        }else {
            if (this.getBalance() - a < 0){
                System.out.println("Not enough money!");
            }else{
                this.setBalance(this.getBalance() - a);
                System.out.println(a + " baht is withdrawn from "+ this.getName() + ".");               
            }
        }        
    }
    public void showAccount(){
        System.out.println(this.getName() + " account has " + this.getBalance() + " baht.");
    }
}
