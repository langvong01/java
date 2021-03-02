package Task4.lab03;

import java.util.Scanner;

public class AveragePoint {
    public static void main(String[] args) {
        int markMath,markScience,markEnglish,markMath1,markScience1,markEnglish1;
        int sum , sum1;
        float avg , avg1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks obtained in Math : ");
        markMath = in.nextInt();
        System.out.println("Enter marks obtained in Science : ");
        markScience = in.nextInt();
        System.out.println("Enter marks obtained in English : ");
        markEnglish = in.nextInt();
        System.out.println();
        System.out.println("Enter marks obtained in Math : ");
        markMath1 = in.nextInt();
        System.out.println("Enter marks obtained in Science : ");
        markScience1 = in.nextInt();
        System.out.println("Enter marks obtained in English : ");
        markEnglish1 = in.nextInt();




        System.out.println("Marks of ThiDK : ");
        System.out.printf("Maths = %d\n",markMath);
        System.out.printf("Science = %d\n",markScience);
        System.out.printf("English = %d\n",markEnglish);
        System.out.println();
        System.out.println("Marks of bill : ");
        System.out.printf("Maths = %d\n",markMath1);
        System.out.printf("Science = %d\n",markScience1);
        System.out.printf("English = %d\n",markEnglish1);

        sum = markEnglish + markScience + markMath;
        sum1 = markEnglish1 + markScience1 + markMath1;
        avg = (float) ((markEnglish + markMath + markScience)/3);
        avg1 = (float) ((markEnglish1 + markMath1 + markScience1)/3);
        System.out.println();
        System.out.println("Total marks scored by ThiDk = " + sum);
        System.out.println("Percentage = " + avg + "%");
        System.out.println("Total marks scored by Bill = " + sum1);
        System.out.println("Percentage = " + avg1 + "%");

        System.out.println("Is ThiDk's percentage leeser than Bill ?"+(avg< avg1 ? "Yes":"No") );
        System.out.println("Is ThiDk's percentage greater than Bill ?"+(avg> avg1 ? "Yes":"No") );
        System.out.println("ThiDk's and Bill's percentage are equal ?"+(avg == avg1 ? "Yes":"No"));

        if (avg > 75){
            System.out.println("Scholarshop Amount for ThiDk = $20000");
        }else if (60<=avg && avg<=75){
            System.out.println("Scholarshop Amount for ThiDk = $10000");
        }else {
            System.out.println("Scholarshop Amount for ThiDk = $0");

        }


        if (avg1 > 75){
            System.out.println("Scholarshop Amount for Bill = $20000");
        }else if (60<=avg1 && avg1<=75){
            System.out.println("Scholarshop Amount for Bill = $10000");
        }else {
            System.out.println("Scholarshop Amount for Bill = $0");
        }

    }
}
