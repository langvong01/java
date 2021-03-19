package Task2;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Example {

    public static void main(String[] args) {
      /* 9.1
        char c1 = '0';
      char c2 ='A';
       char c3;
       c3 = (char) (c1 + 5);
        System.out.println(c3);
        System.out.println(c1+5);

        for(int codeNum ='a';codeNum<='z';++codeNum){
            System.out.println((char)codeNum + ":" + codeNum);
        }
        */

        /** 9.2
         char hexChar = 'a';
         int dec;
         if(hexChar>='0' && hexChar<='9'){
         dec = hexChar - '0';
         } else if (hexChar>='A' && hexChar<='F') {
         dec = hexChar - 'A' + 10;
         } else  if (hexChar>='a' && hexChar<='f') {
         dec = hexChar - 'a' + 10;
         } else {
         dec =-1;
         System.out.println("Invalid hex char");
         }
         System.out.println(hexChar + ": "+ dec);
         */
        /* 9.3
        String str = "Java is cool !";
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(5));
        // Comparing two Strings
        String anotherStr = "Java is COOL !";
        System.out.println(str.equals(anotherStr));
        System.out.println(str.equalsIgnoreCase(anotherStr));
        System.out.println(str.subSequence(0,3));
        System.out.println(str.substring(0,3));
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.endsWith("cool!"));
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str.toUpperCase().charAt(2));
        System.out.println(str.repeat(3));
        System.out.println(str.s);
        */
        /** 9.4 String to  Float, int , double

         String inStr = "5566";
        int number = Integer.parseInt(inStr);
        System.out.println(number);

        String inStr1 = "55.66";
        float aFloat = Float.parseFloat(inStr1);
        double aDouble = Double.parseDouble("1.2345");
        aDouble = Double.parseDouble("1.2e-3");

        //String to Char
         String msg = "Hello , word";
        char msgChar;
        for (int idx = 0; idx < msg.length(); ++idx) {
            msgChar = msg.charAt(idx);
            System.out.println("msgChar : " + msgChar);
        */
            // String to Boolean
       /*
        String boolStr ="true";
        boolean done = Boolean.parseBoolean(boolStr);
        boolean valid = Boolean.parseBoolean("fale");
        System.out.println(done);
        System.out.println(valid);
        */


        /**
            // 9.5 Coverting Primitive to String

        String str1 = 123 + "";
        String str2 = 12.34 + "";
        String str3 = 'c' + "";
        String str4 = true + "";

        String str5 = String.valueOf(123456);
        String str6  = String.valueOf('c');
        String str7 = String.valueOf(55.44);
        String str8 = String.valueOf(true);

        String str9 = Integer.toString(123456);
        String str10 = Float.toString(55.44);
        String str11 = Boolean.toString((true));
         */

        /* 9.6
        System.out.printf("Hi, %d,%.1f%n",11,22.22);

        String str = String.format("%.1f",1.234);
        System.out.println(str);
        */

        /**  9.7 Code Example : Reverse String
        String inStr;
        int inStrLen;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a String:");
        inStr = in.nextLine();
        inStrLen = inStr.length();
        System.out.print("The reverse is : ");

        for (int incharIdx = inStrLen - 1;incharIdx >=0;--incharIdx){
            System.out.print(inStr.charAt(incharIdx));
        }
        System.out.println();
        in.close();
         */

        /* 10.1 + 10 .2
        int [] marks = new int[5];
        marks[0] = 95;
        marks[1] = 85;
        marks [2] = 77;
        marks [3] = 69;
        marks [4] = 66;

        System.out.println(marks[0]);
        System.out.println(marks[3] + marks[4]);

        int [] factors = new int[5];
        int numFactors  = factors.length;
        */

        /** 10.3 Array and Loop
        int[] marks = {74,43,58,60,90,64,70};
        int sum = 0;
        int sumSq = 0;
        double mean , stdDev;

        for (int i = 0;i< marks.length;i++){
            sum =  sum + marks[i];
            sumSq = sumSq + marks[i] * marks[i];
        }
        mean = (double) sum/ marks.length;
        stdDev = Math.sqrt((double) sumSq/ marks.length-mean*mean);

        System.out.printf("Mean is : %.2f%n",mean);
        System.out.printf("Standard deviation is : %.2f%n",stdDev);
        */

        /* 10.4 . Enhanced for-loop

         int [] number = {1 , 2 , 3  ,4 ,5 ,6 , 7 };
          int sumNum;
          int sumSqrtNum;
          for ( int number : numbers {
             sum += number;
             sumsqrtNum += number * number;}
         */

        /**
        int numItem;
        int [] items;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of items : ");
        numItem = in.nextInt();

        items = new int[numItem];


        if(items.length > 0 ){
            System.out.print("Enter the value of all items (separated by space) :  ");
            for ( int i = 0;i< items.length;++i){
                items[i] = in.nextInt();
            }
        }

        System.out.print("The values are: [");
         for(int i = 0; i< items.length;++i){
             if (i == 0){
                 System.out.print(items[0]);
             }
             else {
                 System.out.print("," + items[i]);
             }
         }
        System.out.println("]");
         in.close();
         */

        /* Arrays.toString
        int [] a1 = { 6, 1, 3 ,4 ,5};
        int [] a2 = {};
        double [] a3 = new double[1];

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        a3[0] = 2.2;
        System.out.println(Arrays.toString(a3));
        */
        int numStudents;
        int [] grades;
        int [] bins = new int[10];
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of students :");
        numStudents = in.nextInt();

        grades = new int[numStudents];

        for(int i =0;i< grades.length;++i){
            System.out.print("Enter the grade for student" + (i+1) + ": ");
            grades[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(grades));

        for(int grade: grades){
            if(grade == 100) {
                ++bins[9];
            }else {
                ++bins[grade/10];
            }
        }
        System.out.println(Arrays.toString(bins));

        for(int binIdx = 0 ;binIdx<bins.length;++binIdx) {
            if (binIdx != 9) {
                System.out.printf("%2d-%3d: ", binIdx * 10, binIdx * 10 + 9);

            } else {
                System.out.printf("%2d-%3d: ", 90, 100);
            }
            for (int itemNo = 0; itemNo < bins[binIdx]; ++itemNo) {
                System.out.print("*");
            }
            System.out.println();
        }
        int binMax = bins[0];
        for (int binidx =1;binidx<bins.length;++binidx){
            if (binMax<bins[binidx]) binMax = bins[binidx];
        }
        for (int level = binMax; level>0;--level){
            for (int binIdx = 0;binIdx<bins.length;++binIdx){
                if(bins[binIdx]>=level){
                    System.out.print("  *  ");
                }else {
                    System.out.print("    ");;
                }
            }
            System.out.println();
        }
        for (int binIdx= 0;binIdx<bins.length;++binIdx) {
            System.out.printf("%3d -%-3d",binIdx*10,(binIdx !=9)? binIdx*10+9 :100);
        }
        System.out.println();
        in.close();
        }
    }
