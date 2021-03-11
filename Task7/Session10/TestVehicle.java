package Session5.Session10;

public class TestVehicle {
    /**
     * Define the TestVehicle.java class
     */

        /**
         *
         * @param args
         */
        public static void main(String[] args) {
            FourWheeler objFour = new FourWheeler("LA-09 Cs-1406","Voiskswagen",4,true);
            objFour.showDetails();
            objFour.accelerate(200);
        }
    }

