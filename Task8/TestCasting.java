package Session6;

public class TestCasting {
    public static void main(String[] args) {
        A a1 = new C();
        System.out.println(a1);
        B b1 = (B) a1;
        A c1 = (A) b1;
        System.out.println(b1);
        System.out.println(c1);
        A a2 = new B();
        System.out.println(a2);
        B b2 = (B) a2;
        A a3 = (A) a2;
        System.out.println(b2);
        System.out.println(a3);

    }
}
