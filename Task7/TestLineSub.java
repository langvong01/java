package Session5;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub l1 = new LineSub(1,2,3,4);
        System.out.println(l1);
        LineSub l2 = new LineSub(new Point(5,6),new Point(7,8));
        System.out.println(l2);

        System.out.println(l1.getBeginXY()[1]);
    }
}
