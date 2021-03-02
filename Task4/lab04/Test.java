package Task4.lab04;

public class Test {
    public static void main(String[] args) {
        for (int line = 4;line>=1;line--){
            System.out.print("|");
            for (int i =1;i<=(line-1);i++){
                System.out.print(" ");
            }
            System.out.print("/");
            for (int y =1;y<=(8-2*line);y++){
                System.out.print(".");
            }
            System.out.print("\\");
            for (int x =1;x<=(line-1);x++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
