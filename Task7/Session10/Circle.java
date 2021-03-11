package Session5.Session10;

public class Circle extends  Shape {
    float area;
     public void  caculate(float rad){
         area = getPI()* rad *rad;
         System.out.println("Area of circle is: "+ area);
     }
}
