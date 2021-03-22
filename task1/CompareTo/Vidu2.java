package CompareTo;

public class Vidu2 {
    public static void main(String[] args) {
        String str_Sample = "Rockstar";
        System.out.println("So sanh voi 'ROCKSTAR' :"+str_Sample.compareTo("rockstar"));
        // So sanh - bỏ qua trường hợp
        System.out.println("So sánh với 'ROCKSTAR' - Trường hợp bị bỏ qua :"+ str_Sample.compareToIgnoreCase("ROCKSTAR"));
    }
}
