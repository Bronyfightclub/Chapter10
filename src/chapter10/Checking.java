package chapter10;
public class Checking {
    private String account;
    private double balance;
    public Checking(){
        this.account = "Trevor";
        this.balance = 0.0D;
    }
    public Checking(String newAccount, double openBalance){
        this.account = newAccount;
        this.balance = openBalance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getDeposit(String balance, String amount){
        return 55.43D;
    }
    public double getWithdrawal(String balance, String amount){
        return 90.81D;
    }
    public String toString(){
        return "Account Name: " + this.account + "\n Account Balance: "
                        + this.getBalance();
    }
}