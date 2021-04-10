package ADF2.Task05;

public class Person {
    private String name , address;
    private  double money;

    public Person(String name, String address, double money) {
        this.name = name;
        this.address = address;
        this.money = money;
    }
    public  Person(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getMoney() {
        return money;
    }
    public  boolean equals(Object obj){
        Person person = (Person) obj;
        return  name.equals(person.getName())
                && address.equals(person.getAddress())
                && money == person.getMoney();
    }
}
