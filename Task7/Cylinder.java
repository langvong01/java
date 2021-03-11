package Session5;

import Session3.Circle;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){
        super();
        this.height=1.0;
        System.out.println("Constructed a Cylineder with Cylinder()");
    }
    public Cylinder(double height){
        super();
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height" );
    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylineder(height, radius)");
    }
    public  Cylinder(double height, double radius, String color){
        super(color, radius);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylineder(height, radius,color)");
    }
    public  double getHeight(){
        return  this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        return  getArea() * this.height;
    }
    public String toString(){
        return "Cylinder[" + super.toString() + ", height = "+ height + "]";
    }

    /**
     * @Override
     * @return
     */
    public double getArea() {
        return  2 * Math.PI * getRadius() * height + 2* super.getArea();
    }
}
