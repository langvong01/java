package Session4;

import Session3.Circle;

public class TestCircle2 {
    public static void main(String[] args) {
        Circle c4 = new Circle();
        c4.setRadius(5.0);
        System.out.println("radius is :" + c4.getRadius());
        c4.setColor("Blue");
        System.out.println("Color is :"+c4.getColor());
        System.out.println(c4.toString());
        System.out.println(c4);
    }
}
