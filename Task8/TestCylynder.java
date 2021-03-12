package Session6;


import Session3.Circle;
import Session5.Cylinder;

public class TestCylynder {
    public static void main(String[] args) {
        Circle c1 = new Cylinder(1.1,2.2);

        System.out.println(c1.getRadius());
        System.out.println();
        System.out.println(c1.toString());
        System.out.println(c1.getArea());


    }
}
