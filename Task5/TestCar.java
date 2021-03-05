package Session3;

public class TestCar {
    public static void main(String[] args) {
        Car car1  = new Car(291,30,1,10);
        Car car2 = new Car();

        System.out.println("The plateNumber of  car1 is "+car1.plateNumber);
        System.out.println("The speed of  car1 is "+car1.accelerate()+"km/h");
        System.out.println("The plateNumber of  car2 is "+car2.plateNumber);
        car2.plateNumber = 292;
        System.out.println("The plateNumber of  car2 is "+car2.plateNumber);

    }
}
