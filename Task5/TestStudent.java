package Session3;

public class TestStudent {
    public static void main(String[] args) {
        Student paul = new Student("paul", 3);
        Student peter = new Student("peter", 4);

        System.out.println(paul.getName());
        System.out.println(paul.getGpa());
        System.out.println(peter.getName());
        System.out.println(peter.getGpa());
    }
}
