package Practice;

public class TestBank {
    public static void main(String[] args) {
        Bank b1 = new Bank(1000,0.1);
        System.out.println("The balance is " + b1.getBalance());
        System.out.println("The rate is " + b1.getRate() + "%");
        System.out.println(b1.caculateInterest());
        System.out.println(b1);
    }
}
