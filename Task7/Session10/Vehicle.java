package Session5.Session10;

public class Vehicle {
    // Declare common attributes of a vehicle
    protected String vehicleNo;
    protected String vehicleName;
    protected int wheels;

    /**
     *
     *
     * @param speed
     *      * @return void
     *
     */

    public void accelerate(int speed){
        System.out.println("Accelerating at: "+speed + "kmph");
    }
}
