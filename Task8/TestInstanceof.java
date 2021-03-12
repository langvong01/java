package Session6;

import Session3.Circle;
import Session5.Cylinder;

public class TestInstanceof {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.1);
        Circle cy1 = new Cylinder(2.2,3.3);
        System.out.println(c1 instanceof Circle);
        System.out.println(cy1 instanceof  Cylinder );
    }
}
