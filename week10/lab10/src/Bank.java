public class Bank {
    private Account acct[];
    private int numAcct;
    public Bank(){
        acct = new Account[10];
        numAcct = 0;
    }
    public void addAccount(Account ac){
        int index = 0;
        if (numAcct < 10){
            while (true){
                if (acct[index] == null){
                    acct[index] = ac;
                    break;
                }
                index++;
            }
        numAcct++;
        }
    }
    public Account getAccount(int index){
        return acct[index];
    }
    public int getNumAccount(){
        return numAcct;
    }
}
