package Task4.lab04;

public class Bai5 {
    public static void main(String[] args) {
        drawLine();
        drawTop();
        drawBottom();
        drawLine();
    }
    public  static void drawTop() {
        for (int line =1;line<=4;line++){
            System.out.print("|");
            for (int i =2;i>=4-line;i--){
                System.out.print(" ");
            }
            System.out.print("\\");

            for (int x=1;x<=8-2*line;x++){
                System.out.print(".");
            }
            System.out.print("/");
            for (int j=2;j>=4-line;j--){
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
    public  static  void drawBottom(){
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
    public  static  void drawLine(){
        System.out.println("+--------+");
    }

}
