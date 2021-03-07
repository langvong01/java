package Session4;

public class Employee {
    private  int id;
    private String firstName;
    private String lastName;
    private int salary,newSalary;
    public Employee(int id,String lastName, String firstName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getId(){
        return  id;
    }
    public  String getFirstname(){
        return firstName;
    }
    public  String getLastName(){
        return  lastName;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    public  int getSalary(){
        return  salary;
    }
    public  void setSalary(int salary){
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary * 12;
    }
    public int raiseSalary(int percent){
        newSalary = salary + salary* percent/100;
        return newSalary;
    }
    public String toString (){
        return "Employee[id = "+ id +", "+"name= "+ firstName+" "+lastName+", salary= "+salary+"]";
    }
}
