package ADF2.Task06;

import java.util.regex.Pattern;

public class Validator {
    /**
     * Check bill code follow the pattern
     * @method isValidBillCode
     * @param billCode
     * @return true if the bill code is valid , else fasle
     */
    public static  boolean isValiddBillCode(String billCode){
        return Pattern.matches("^(B)[0-9]{4}$",billCode);
    }
}
