package Session4;

public class TestReactangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3.0f,4.0f);
        r1.setLength(4.0f);
        r2.setWidth(5.0f);
        System.out.println("The length and width of r1 are :"+r1.getLength()+ ", " + r1.getWidth());
        System.out.println("the Area of r1 is "+ r1.getArea());
        System.out.println("the Perimeter of r1 is "+ r1.getPerimeter());
        System.out.println(r1.toString());

    }
}
