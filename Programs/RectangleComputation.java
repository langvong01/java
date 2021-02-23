package Programs;

public class RectangleComputation {
    public static void main(String[] args) {
        double length,width,area,perimeter;
        length = 5;
        width = 10;
        area = length * width;
        perimeter = (length + width) * 2;
        System.out.print("The area is ");
        System.out.println(area);
        System.out.print("The perimeter is ");
        System.out.println(perimeter);
    }
}
