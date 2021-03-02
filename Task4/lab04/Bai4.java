package Task4.lab04;


public class Bai4 {
    public static void main(String[] args) {
        for (int line =5;line>=1;line--){

            for (int i = 1;i<line-1;i++){
                System.out.print(" ");
                }
            for (int x =1;x<=11-2*line;x++){
                System.out.print("*");
            }
            System.out.println();
            }
    }
}
