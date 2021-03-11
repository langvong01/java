package Session5.Session10;

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee objEmp = new Employee("E001","Maria Nemeth",40000);
        objEmp.calcCommission(20000f);
        objEmp.displayDetails();
        System.out.println();
        Employee objEmp1 = new PartTimeEmployee("E002","Rib Snutg",30000,"Day");
        objEmp1.displayDetails();

    }
}
