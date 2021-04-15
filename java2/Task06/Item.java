package ADF2.Task06;

import java.io.Serializable;

public class Item  implements Serializable {
    private  static  final  long serialVersionIUID = 1l;
    private String  productName;
    private  String billCode;
    private  int quanity;
    private  double price;

    public Item() {
        super();
    }

    public Item(String productName, String billCode, int quanity, double price) {
        super();
        this.productName = productName;
        this.billCode = billCode;
        this.quanity = quanity;
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getBillCode() {
        return billCode;
    }

    public int getQuanity() {
        return quanity;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Item{" +
                "productName='" + productName + '\'' +
                ", billCode='" + billCode + '\'' +
                ", quanity=" + quanity +
                ", price=" + price +
                '}';
    }
}
