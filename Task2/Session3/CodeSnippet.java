package Task2.Session3;

import java.util.Scanner;

public class CodeSnippet {
    enum Direction {
        East,West,North,South
    }
    public static void main(String[] args) {

        // Code snippet 1
        System.out.println("This is code snippet 1");
        int rollNumber;
        char gender;
        System.out.println("---------------------");

        // Code Snippet 2
        System.out.println("This is code snippet 2");

        int rollNumber1 = 101;
        char gender1 = 'M';
        System.out.println("---------------------");

        // Code Snippet 3
        System.out.println("This is code snippet 3");

        int rollNumber2; //Variable Declare
        rollNumber2 = 101; //Vriable  is initialized
        System.out.println("---------------------");

        // Code Snippet 4
        System.out.println("This is code snippet 4");
        int x,y,z;
         int  a  =5 ,b,c = 10;
         byte num = 20;
          char c1 = 'c';
          int num1,num2 = 10;
        System.out.println("---------------------");

        // Code Snippet 5
        System.out.println("This is code snippet 5");

        String str = "A String Data";
        System.out.println("---------------------");

        // Code Snippet 6
        System.out.println("This is code snippet 6");

        int empNumber;
        float salary;
        double shareBalance = 456790.897;
        char gender2 = 'M';
        boolean ownVehicle = false;
        empNumber =101;
        salary = 6789.50f;
        System.out.println("Employee Number : "+ empNumber);
        System.out.println("Salary : "+ salary);
        System.out.println("Gender : " + gender2);
        System.out.println("ShareBalance"+ shareBalance);
        System.out.println("OwnsVehicle"+ ownVehicle);
        System.out.println("---------------------");

        // Code Snippet 7
        System.out.println("This is code snippet 7");

        System.out.println("Java \t Programing \n Language");
        System.out.println("Tom \"Dick\" Harry");
        System.out.println("---------------------");

        // Code Snippet 8
        System.out.println("This is code snippet 8");

        System.out.println("\u0048\u0065\u006C\u006C\u006F" + "!\n");
        System.out.println("Bl\141ke\"2007\"");
        System.out.println("---------------------");

        // Code Snippet 9
        final double PI = 3.14159;
        double radius = 5.87;
        double area;
        area = PI * radius * radius;
        System.out.println("Area of the circle is " + area);
        System.out.println("---------------------");

        // Cod Snippet 10
        Direction direction;
        direction = Direction.East;
        System.out.println("Value : "+ direction);
        System.out.println("---------------------");

        // Code  Snippet 11
        int num3 = 5;
        int num4 = 10;
        int sum = num3 + num4;
        System.out.print("The sum of");
        System.out.print(num3);
        System.out.print(" and ");
        System.out.print(num4);
        System.out.print(" is ");
        System.out.print(sum);
        int num5 = 2;
        sum = num3 + num4 + num5;
        System.out.println("The sum of "+ num3 + ","+ num4 + "and " + num5 +"is "+sum);
        System.out.println("---------------------");

        // Code Snippet 12
        int i = 55/22;
        System.out.printf("55/22 = %d %n",i);
        double q = 1.0/2.0;
        System.out.printf("1.0/2.0 = %09.3f%n",q);
        q = -10.0/0.0;
        System.out.printf("-10.0/0.0 = %7.2e%n",q);
        q = -5000.0/3.0;
        System.out.printf("5000/3.0 = %7.2e%n",q);
        System.out.printf("pi = %5.3f,e = %5.4f%n",Math.PI ,Math.E);
        System.out.println("---------------------");

        //Code Snippet 13
        int num6 = 2;
        double result = num * num;
        System.out.format("The square root of %d is %f.%n",num6, result);
        System.out.println("---------------------");

        // Code Snippet 14
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int intValue = s.nextInt();
        System.out.println("Enter  a decimal number");
        float floatValue = s.nextFloat();
        System.out.println("Enter a string value");
        String strValue = s.next();
        System.out.println("Values enteredare:");
        System.out.println(intValue  + " " + floatValue + " " + strValue);
        System.out.println("---------------------");

        // Code  snippet 15
        x = 10; // Assigns the value 10 to variable x
        x += 5; // Increments the value of x by 5
        x -= 5; // Decrements the value of x by 5
        x *= 5; // Multiplies the value of x by 5
        x /= 2; // Divides the value of x by 2
        x %= 2; // Divides the value of x by 2 and the remainder is returned
        System.out.println("---------------------");

        // Code snippet 16
        x = 2 + 3; // Returns 5
        y = 8 -5 ; // Returns 3
        x = 5 * 2; // Returns 10
        x = 5/2; // Returns 2
        y = 10 % 3; // Returns 1
        System.out.println("---------------------");

        // Code snippet 17
        int i1 = 5;
        int j = i++; // i=6, j=5
        int k = ++i; //i=6,k=6
        i = - i ; //now i is -6
        boolean result1 = false; //result is false
        result1 = !result1; //now result is true
        System.out.println("---------------------");

        // Code snippet 18
        int value1 = 10;
        int value2 = 20;

        System.out.print("value1 == value2: ");
        System.out.println(value1 == value2);
        System.out.print("value1 != value2: ");
        System.out.println(value1 != value2);
        System.out.print("value1 > value 2: ");
        System.out.println(value1 > value2);
        System.out.print("value1 < value2: ");
        System.out.println(value1 < value2);
        System.out.print("value1 <= value2: ");
        System.out.println(value1 <= value2);
        System.out.println("---------------------");

        // Code snippet 19
        int first = 10;
        int second = 20;
        System.out.println((first ==30) && (second ==20));
        System.out.println((first ==30) || (second ==20));
        System.out.println("---------------------");

        // Code snippet 20
         int x20 = 23;
         int y20 = 12;
         //23 =10111 , 12 = 01100
        System.out.print("x20 & y20 : ");
        System.out.println(x20 & y20);
        System.out.print("x20 | y20: ");
        System.out.println(x20 | y20);
        System.out.print("x20 ^ y20: ");
        System.out.println(x20 ^ y20); // Returns 27, i.e 31 = 11011
        int a20 = 43;
        int b20 = 1;
        System.out.print("a20 >> b20: ");
        System.out.println(a20 >> b20); // returns 21 , i.e, 21 = 0010101
        System.out.print("a20 << b20: ");
        System.out.println(a20 << b20); //returns 86 , i.e, 86 = 1010110
        System.out.println("---------------------");

        // Code snippet 21
        int value3 = 10;
        int value4 = 20;
        int result2;
        boolean someCondition = true;
        result2 = someCondition ? value3 : value4;

        System.out.println(result2);
        System.out.println("---------------------");

        // Code snippet 22
        double dbl =10;
        long lng = 100;
        int in = 10;
        dbl =in;
        lng = in;
        System.out.println("---------------------");
        // Code snippet 23
        float a23 = 21.3476f;
        int b23 = (int) a+ 5;
    }
}

