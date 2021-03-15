package Practice;

public class Bank {
    double balance;
    double rate;
    public Bank(double balance,double rate){
        this.balance = balance;
        this.rate = rate;
    }
    public double caculateInterest(){
        return balance * (rate/1200);
    }

    public double getBalance() {
        return balance;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "balance=" + balance +
                ", rate=" + rate +
                '}';
    }
}
