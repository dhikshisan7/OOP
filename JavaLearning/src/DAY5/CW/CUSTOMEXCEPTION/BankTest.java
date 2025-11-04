package DAY5.CW.CUSTOMEXCEPTION;
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}
class BankAccount{
    int balance;
    public BankAccount(int initialBalance){
        this.balance=initialBalance;
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public void withdraw(int amount) throws InsufficientFundsException{
        if(balance<amount){
            throw new InsufficientFundsException("Insufficient Balance");
        }
        balance-=amount;
    }
    public void getBalance(){
        System.out.println(balance);
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount acc=new BankAccount(5000);
        acc.deposit(5000);
        acc.getBalance();
        try {
            acc.withdraw(18000);
        } catch (InsufficientFundsException e) {
            System.out.println("InsufficientFundsException: "+e.getMessage());
        }
    }
}
