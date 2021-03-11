package Session5.Session10;

public class FourWheeler extends Vehicle {
    private boolean powerSteer;

    /**
     * @param vID       a String variable storing vehicle ID
     * @param vName     a Sring varialbe storing vehicle name
     * @param numWheels is an interger variable storing number of wheels
     * @param pSteer    a String varible storing steering infomation
     */
    public FourWheeler(String vID, String vName, int numWheels, boolean pSteer) {
        vehicleNo = vID;
        vehicleName = vName;
        wheels = numWheels;

        // Child's class own attribute
        powerSteer = pSteer;

    }

    /**
     * @return void
     * Display    vehicle details
     */
    public void showDetails() {
        System.out.println("Vehicalno: " + vehicleNo);
        System.out.println("VehicalName: " + vehicleName);
        System.out.println("Number of Wheels: " + wheels);
        if (powerSteer == true) {
            System.out.println("Power Steering : Yes");
        } else {
            System.out.println("Power Steering: No");
        }
    }
}



