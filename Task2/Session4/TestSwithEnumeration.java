package Task2.Session4;

public class TestSwithEnumeration {
    enum Cards{
        Spade,Heart,Diamond,Club
    }

    public static void main(String[] args) {
        Cards card = Cards.Diamond;
        switch (card){
            case Spade ->
                    System.out.println("Spade");
            case Club ->
                    System.out.println("Club");
            case Heart ->
                    System.out.println("Heart");
            case Diamond ->
                    System.out.println("Diamond");
        }
    }
}
