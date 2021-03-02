package Task4.lab03;

import java.util.Scanner;

public class InvoiceSale {
    public static void main(String[] args) {
        int numShirts,numTrouser;
        int totalShirts,totalTrousers,total;
        int priceShirts = 300;
        int priceTrouser = 700;
        int discount,netTotal;
        float pointEarn;
        Scanner in = new Scanner(System.in) ;
        System.out.println("Enter the number of Shirts to order: ");
        numShirts = in.nextInt();
        System.out.println("Enter the number of Trousers to order: ");
        numTrouser = in.nextInt();
        totalShirts = numShirts * priceShirts;
        totalTrousers = numTrouser * priceTrouser;
        total = totalShirts + totalTrousers;
        System.out.println("Item\t\t\tQuantity\t\tPrice\t\tTotal");
        System.out.println("---------------------------------------" + "-------------------");
        System.out.printf("Shirts\t\t\t%d\t\t\t\t%d\t\t\t%d",numShirts,priceShirts,totalShirts);
        System.out.println();
        System.out.printf("Trousers\t\t%d\t\t\t\t%d\t\t\t%d",numTrouser,priceTrouser,totalTrousers);
        System.out.println();
        System.out.printf("Discount\t\t\t\t\t\t\t\t\t%d",(total>5000?total/10:(total>3000 && total<=5000?total/20:0)));
        System.out.println();
        System.out.println("---------------------------------------" + "-------------------");
        discount = (int)(total>5000?total/10:(total>3000 && total<=5000?total/20:0));
        System.out.printf("Net Total\t\t\t\t\t\t\t\t\t%d",total-discount);
        System.out.println();
        netTotal = total -discount;
        pointEarn = (float) netTotal/100;
        System.out.printf("Points Earned\t\t%.2f",pointEarn);
        System.out.println();
        System.out.println("Thank You!");


    }
}
