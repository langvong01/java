package ifelse;

public class PrintLeapYears {
    public static void main(String[] args) {
        int lowerbound = 999;
        int upperbound = 2000;
        int  count = 0;
        int number = lowerbound;
        while (number<=upperbound){
            if (number<=upperbound){
                count++;
            }
            number +=4;
        }
        System.out.println("The number of leap year is " + count);
    }
}
