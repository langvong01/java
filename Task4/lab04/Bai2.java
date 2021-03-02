package Task4.lab04;

public class Bai2 {
    public static void main(String[] args) {
        for(int line = 0,z=0;line<5;line++){
            for(int i=5; i>5-line;i--){
                System.out.print(" ");
            }
            for (int x =0;x<(9-line-z);x++){
                System.out.print("*");
            }
            System.out.println();
            ++z;

        }

    }
}
