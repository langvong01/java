package Session3;

public class Circle {
    double radius;
    String color;

    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle(double r){
        radius = r;
        color = "red";
    }
    public  Circle(String c,double r){
            color = c;
            radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea(){
        return  radius*radius*Math.PI;
    }
}
