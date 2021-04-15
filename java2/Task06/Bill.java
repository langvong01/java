package ADF2.Task06;

import java.io.Serializable;

public class Bill  implements Serializable {
    private  static  final  long serialVersionIUID = 1l;
    private  String  billCode;
    private  String customerName;
    private  String creatDate;
    private  float discount;
    private  double totalPrice;
    public Bill(){
        super();
    }
    public Bill(String billCode , String customerName, String creatDate, float discount , double totalPrice){
        super();
        this.billCode = billCode;
        this.creatDate = creatDate;
        this.customerName = customerName;
        this.discount = discount;
        this.totalPrice = totalPrice;
    }

    public String getBillCode() {
        return billCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCreatDate() {
        return creatDate;
    }

    public float getDiscount() {
        return discount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCreatDate(String creatDate) {
        this.creatDate = creatDate;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }


    @Override
    public String toString() {
        return "Bill{" +
                "billCode='" + billCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", creatDate='" + creatDate + '\'' +
                ", discount=" + discount +
                ", totalPrice=" + totalPrice +
                '}';
    }
}