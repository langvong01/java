package Session6;

public class TestMonster {
    public static void main(String[] args) {
        Monster m1 =  new FireMonster("Fire");
        Monster m2 = new WaterMonster("Watter");
        Monster m3 = new StoneMonster("Stone");
        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());
    }
}
