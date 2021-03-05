package Session3;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle("blue",2.0);
        System.out.println("The radius is : "+ c1.getRadius());
        System.out.println("The color is "+ c1.getColor());
        System.out.println("The Area is :"+ c1.getArea());

        Circle c2 = new Circle("red",2.0);
        System.out.println("The radius is : "+ c2.getRadius());
        System.out.println("The color is "+ c2.getColor());
        System.out.println("The Area is :"+ c2.getArea());

        Circle c3 = new Circle("red",1.0);
        System.out.println("The radius is : "+ c3.getRadius());
        System.out.println("The color is "+ c3.getColor());
        System.out.println("The Area is :"+ c3.getArea());
    }
}
