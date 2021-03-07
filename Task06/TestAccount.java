package Session4;

public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account("1","Nguoi nhan");
        Account a2 = new Account("2","Nguoi chuyen",10000);

        System.out.println("The balance of a1 is " + a1.balance);
        System.out.println("The balance of a2 is "+ a2.balance);
        System.out.println("I want to transfer money from a2 to a1");

        System.out.println();

        a2.transferTo(a1,5000);

        System.out.println("The balance of a1 is " + a1.balance);
        System.out.println("The balance of a2 is "+ a2.balance);

        System.out.println(a1);
        System.out.println(a2);
    }
}
