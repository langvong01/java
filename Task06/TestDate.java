package Session4;

public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(5,8,1997);
        System.out.println("This is day " + d1.getDay());
        System.out.println("This is month " + d1.getMonth());
        System.out.println("This is year " + d1.getYear());
        d1.day = 6;
        System.out.println(d1.toString());

        d1.setDate(14,9,1992);
        System.out.println(d1.toString());
    }
}
