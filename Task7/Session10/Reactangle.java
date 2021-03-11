package Session5.Session10;

/**
 * Define the child class Rectangle.java
 */

public class Reactangle extends  Shape {
    float perimeter;
    float length = 10;

    /**
     * Implement the abstract method to caculate the perimeter
     * @param width
     * @return void
     * @oOverride
     */

    public void  caculate(float width){
        perimeter = 2*(length + width);
        System.out.println("perimeter of the Rectangle is :"+perimeter);
    }
}
