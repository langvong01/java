package Session4;

public class TestInvoiceIteam {
    public static void main(String[] args) {
        InvoiceIteam i1 = new InvoiceIteam("1","mobile",5,5000);
        System.out.println("The id of i1 is "+ i1.getId());
        System.out.println("The desc of i1 is "+ i1.getDesc());
        System.out.println("The qty of i1 is "+ i1.getQty());
        System.out.println("The unitPrice of i1 is "+ i1.getUnitPrice());

        i1.setQty(10);
        i1.setUnitPrice(1000);
        System.out.println("the total of f1 is "+i1.getTotal());
    }
}
