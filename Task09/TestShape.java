package Task09;

public class TestShape {
    public static void main(String[] args) {
        Shape1 s1 = new Rectangle(1,2);
        System.out.println(s1);
        System.out.println("Area is :"+ s1.getArea());
        Shape1 s2 = new Triangle(1,2);
        System.out.println(s2);
        System.out.println("Area is :"+ s2.getArea());

    }
}
