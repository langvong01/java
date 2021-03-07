package Session4;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Vinh","Do",1000);
        System.out.println("The id of e1 is "+e1.getId());
        System.out.println("The firstName of e1  is "+e1.getFirstname());
        System.out.println("The lastName of e1 is "+e1.getLastName());
        System.out.println("The fullName of e1 is "+ e1.getName());
        System.out.println("The salary of e1 is " + e1.getSalary());
        e1.setSalary(2000);
        System.out.println("the salary of e1 in a year is "+ e1.getAnnualSalary());
        System.out.println();
        System.out.println("The salary of e1 in  next year is " + e1.raiseSalary(10));
        System.out.println(e1.toString());
    }
}
