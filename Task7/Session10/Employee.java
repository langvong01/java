package Session5.Session10;

public class Employee {
    String empID;
    String empName;
    int salary;
    float commisson;
    public Employee(String id, String name,int sal){
        empID =id;
        empName = name;
        salary = sal;
    }

    /**
     *
     * @param sales
     */
    public  void calcCommission(float sales){
        if (sales>10000)
            commisson = salary*20/100;
        else
            commisson = 0;
}

    /**
     *
     * @param overtime
     */
    public void calcCommission(int overtime){
    if(overtime>8)
        commisson = salary/30;
    else
        commisson = 0;
    }

    /**
     *
     */
   public  void displayDetails(){
       System.out.println("Employee ID:"+ empID);
       System.out.println("Employee name :"+ empName);
       System.out.println("Salary: "+ salary);
       System.out.println("Commission :" + commisson);
   }


}
