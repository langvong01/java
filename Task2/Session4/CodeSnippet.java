package Task2.Session4;

import java.util.Scanner;

public class CodeSnippet {
    public static void main(String[] args) {
        //Code Snippet 1
        /*
        System.out.println("This is code Snippet 1");
        int first = 400, second = 700, result;
        result = first + second;

        // Evaluates the value of result variable
        if (result > 1000) {
            second = second + 100;
        }
        System.out.println("The value of second is " + second);
        System.out.println("---------------------");


         */
        // Code snippet 2
        /*
        System.out.println("This is code Snippet 2");

        int number = 358;
        int digit = number % 10;
        System.out.println("digit is " + digit);

         */
        //Code snippet 3
        /*
        System.out.println("This is code Snippet 3");
        int number =11,remainder;
        remainder = number %2;
        if (remainder==0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }

         */
        // Code snippet 4
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Eneter a Number:");
        int num = in.nextInt();
        if (num %3==0){
            System.out.println("Inside Outer if Block");
            if (num % 5 ==0){
                System.out.println("Number is divisiable by 3 and 5");
            }else {
                System.out.println("Number is divisible by 3, byt not by 5");

            }
        }else {
            if (num % 5 ==0){
                System.out.println("Number is divisible  by 5 , but not by 3");
            }else {
                System.out.println("Number is divisible by 3, byt not by 5");
            }
        }

         */
        // Code snippet 5
        /*
        int totalMarks =59;
        if (totalMarks>=90){
            System.out.println("grade=A+");
        }else  if (totalMarks>=60)  {
            System.out.println("Grade =A");
        }else  if (totalMarks>=40){
            System.out.println("Grade = B");
        }else if ((totalMarks>=30)){
            System.out.println("Grade = C");
        }else {
            System.out.println("Fail");
        }

         */
        /* Code snippet 6
        int choice = 3;
        switch (choice){
            case 1:
                System.out.println("Addittion");
                break;
            case  2:
                System.out.println("Subtraction");
                break;
            case 3:
                System.out.println("Multiplication");
                break;
            case 4:
                System.out.println("Division");
                break;
            default:
                System.out.println("Invalid Choice");


         */
        /* Code snippet 7
        int month = 1;
        int year = 2001;
        int numDays = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (year % 4 == 0) {
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;
            default:
                System.out.println("Invalid Month");
        }
        System.out.println("Month: " + month);
        System.out.println("number of Days :" + numDays);


         */

        /* Code snippet 8
        String day = "Monday";
        switch (day) {
            case "Sunday":
                System.out.println("First day of the week");
                break;
            case "Monday":
                System.out.println("First day of the week");
                break;
            case "Tuesday":
                System.out.println("First day of the week");
                break;
            case "Wednesday":
                System.out.println("First day of the week");
                break;
            case "Thursday":
                System.out.println("First day of the week");
                break;
            case "Friday":
                System.out.println("First day of the week");
                break;
            case "Saturday":
                System.out.println("First day of the week");
                break;
            default:
                System.out.println("InvalidDay");
        }

         */
    String day = "Monday";
    String hour = "am";
    switch (day){
        case "Sunday":
            System.out.println("Sunday is a Holiday");
            switch (hour){
                case "am":
                    System.out.println("Good Morning");
                    break;
                case "pm":
                    System.out.println("Good afternoon");
                    break;
            }
            break;
        case "Monday":
            System.out.println("Monday is a Working day");
            switch (hour){
                case "am":
                    System.out.println("Good Morning");
                    break;
                case "pm":
                    System.out.println("Good afternoon");
                    break;
            }
            break;
        default:
            System.out.println("InvalidDay");
    }

    }
}
