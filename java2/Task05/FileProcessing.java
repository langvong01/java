package ADF2.Task05;

import java.util.List;
import java.util.Scanner;

public class FileProcessing {
    /**
     * ALl option of Menu
     */
    private  final  static  int Person_Info = 1 , copy_Word =2 , EXIT = 3;

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
         Managment mangge = new Managment();
         int choice = 0;
         do {
             System.out.println("----------------File Processing-----------------");
             System.out.println("1, Find person info");
             System.out.println("2. Copy Text to new FIle");
             System.out.println("3. Exit");

             System.out.println("Please choice one option");
             try {
                 choice = Integer.parseInt(sc.nextLine());
                 switch (choice){
                     case Person_Info:
                         System.out.println("------------Person Info---------");
                         String path;
                         double money = 0;
                         System.out.print("Enter path: ");
                         path = sc.nextLine();
                         while (true){
                             System.out.println("Enter money: ");
                             try {
                                 money = mangge.checkInputMoney(sc.nextLine());
                                 break;
                             }catch (Exception e){
                                 System.out.println(e.getMessage());
                             }
                         }
                         System.out.println("---Result-----------");
                         List<Person> persons = null;
                         try {
                             persons = mangge.getPerSon(path,money);
                         }catch (Exception e ){
                             System.out.println(e.getMessage());
                             break;
                         }
                         if (persons==null){
                             break;
                         }
                         System.out.printf("%-20s%-20s%-20s%n", "Name",
                                 "Address", "Money");
                         for (Person person:persons){
                             System.out.printf("%-20s%-20s%-20s%n",person.getName(),
                                     person.getAddress(),person.getMoney());

                         }
                         String maxName = "",
                         minName = ",";
                         if (persons.size()>0){
                             maxName = persons.get(persons.size()-1).getName();
                             minName=persons.get(0).getName();
                         }
                         System.out.printf("Max: %s\n",maxName);
                         System.out.printf("Min : %s\n",minName);
                         break;
                     case copy_Word:
                         System.out.println("----------Copy text------");
                         String name,
                         source;
                         System.out.print("Enter Source: ");
                         source = sc.nextLine();
                         System.out.print("Enter new file name:");
                         name = sc.nextLine();
                         try {
                             if (mangge.copyWordOneTImes(source,name)){
                                 System.out.println("copy done...");
                             }else {
                                 System.out.println("failure");
                             }
                         }catch (Exception e){
                             System.out.println(e.getMessage());
                         }
                         break;
                     case EXIT:
                         System.exit(0);
                         break;
                     default:
                         System.out.println("Please choice 1-4");
                         break;
                    }
                }catch (NumberFormatException e){
                 System.out.println("Please choice 1-4");
                }
            }   while (choice !=EXIT);
        }
    }
}
