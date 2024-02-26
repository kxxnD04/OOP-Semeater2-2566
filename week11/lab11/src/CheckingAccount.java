public class CheckingAccount extends Account{
    private double credit;
    public CheckingAccount(){
        super(0.0, "");
        this.credit = 0.0;
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if (credit > 0){
            this.credit = credit;
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return credit;
    }
    @Override
    public void withdraw(double a) throws WithdrawException{
        if (a > 0){
            if (super.getBalance() - a >= 0){
                super.setBalance(super.getBalance() - a);
                System.out.println(a+ " baht is withdrawn from " + super.getName() + " and your credit balance is " + this.credit + ".");
            }else if (super.getBalance() - a + this.credit > 0){
                this.credit -= (a-super.getBalance());
                super.setBalance(0);
                System.out.println(a+ " baht is withdrawn from " + super.getName() + " and your credit balance is " + this.credit + ".");
            }else {
                throw new WithdrawException("Account " + name + " has not enough money!");
            }
        }else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void withdraw(String a) throws WithdrawException{
        this.withdraw(Double.parseDouble(a));
    }
    @Override
    public String toString(){
        return "The " + super.getName() + " account has " + super.getBalance() + " baht and " + this.credit + " credits.";
    }
}
