package ADF2.Task06;

import java.util.Scanner;

public class UserInputUtil {
    /**
     * Get value type integer from console
     *
     * @method inputTypeInt
     * @param  value
     */
    public static  int inputTypeInt(String value){
        int intValue = 0;
        do {
            try{
                intValue = Integer.parseInt(value);
            }catch (Exception e){
                System.out.println("Please input int value");
            }
            break;
        }while (true);
            return  intValue;
    }
    /**
     * Get value type float from console
     *
     * @method inputTypeFloat
     * @param  value
     */
    public static  float inputTypeFloat(String value){
        float floatValue = 0;
        do {
            try {
                floatValue = Float.parseFloat(value);
            }catch (Exception e){
                System.out.println("Please input float value !");
            }
            break;
        }while (true);
            return floatValue;
    }
    public static  float intputTypeDouble(String value){
        float doubleValue = 0;
        do {
            try {
                doubleValue = Float.parseFloat(value);
            }catch (Exception e){
                System.out.println("Please input double value");
                break;
            }
        }while (true);
        return doubleValue;
    }

    /**
     * Get a valid bill code from console
     *
     * @method checkBIllCode
     * @param  scanner
     */
    public  static  String checkBillCode(Scanner scanner){
        String billCode;
        System.out.println("Enter bill code: ");
        billCode = scanner.nextLine();
        while (!Validator.isValiddBillCode(billCode)) {
            System.out.println("Invalid bill code: (example:B0000) ");
            billCode = scanner.nextLine();
        }
        return  billCode;
    }
}
