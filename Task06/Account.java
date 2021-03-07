package Session4;

public class Account {
    String id;
    String  name;
    int balance = 0;
    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance){
        this.id =id;
        this.name = name;
        this.balance = balance;
    }
    public String getId(){
        return  id;
    }
    public  String getName(){
        return  name;
    }
    public  int getBalance(){
        return  balance;
    }
    public int credit(int amount){
        balance +=amount;
        return balance;
    }
    public int debit(int amount){
        if (amount<=balance) {
            balance -=amount;
        }
        else{
            System.out.print("Amount exceeded");
        }
        return balance;
    }

    public void transferTo(Account another , int amount){
        if (amount<=balance){
                this.balance -= amount;
                another.balance += amount;
            System.out.println("Congrulation! Transfer is success");
            System.out.println("Amount transfer is "+ amount);
        }
        else {
            System.out.println("Amount Exceeded");
        }
    }
    public  String toString(){
        return "Account[id = "+ id + ", name= "+name+", balance= "+balance+"]";
    }

}
