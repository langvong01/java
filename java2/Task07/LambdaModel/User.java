package ADF2.Task07.LambdaModel;

public class User {
    private String name;
    private float salary;
    private  int age;
    /**
     *
     * A constructor with threes parameter
     */
    public User(String name, float salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
