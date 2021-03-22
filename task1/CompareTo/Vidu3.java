package CompareTo;

public class Vidu3 {
    public static void main(String[] args) {
        String s1 = "CodeLean1";
        String s2  = "CodeLean2";
        System.out.println("Chuỗi 1:" + s1);
        System.out.println("Chuỗi 2: " + s2);

        int S = s1.compareTo(s2);

        if(S<0){
            System.out.println("\""+ s1 +"\" "+ "cao hơn về mặt từ vựng so với chuỗi " + "\""+ s2 + "\"");

        } if (S == 0) {
            System.out.println("\" "+ s1 +"\""+ "bằng nhau về  từ vựng so với chuỗi " + "\" "+ s2 + "\"");
        }
        if (S>0) {
            System.out.println("\""+ s1 +"\""+ "nhỏ hơn hơn về mặt từ vựng so với chuỗi" + "\" "+ s2 + "\"");

        }
    }
}
