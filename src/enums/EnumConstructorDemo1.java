package enums;

enum Beer01{
    KF(100,500), KO(80,600), OM(200,750),RC(75,500), FO;
    private int price;
    private int quantity;

    Beer01(int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }
    Beer01() {
        this.price = 65;
        this.quantity = 700;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
}
public class EnumConstructorDemo1 {
    public static void main(String[] args) {

        Beer01 b = Beer01.FO;
        System.out.println("FO price : "+b.getPrice() +" -  Quantity : "+b.getQuantity()+"ml");

        Beer01 b1 = Beer01.KF;
        System.out.println("KF price : "+b1.getPrice() +" -  Quantity : "+b1.getQuantity()+"ml");

        Beer01 b2 = Beer01.OM;
        System.out.println("OM price : "+b2.getPrice() +" -  Quantity : "+b2.getQuantity()+"ml");

        Beer01 b3 = Beer01.KO;
        System.out.println("KO price : "+b3.getPrice() +" -  Quantity : "+b3.getQuantity()+"ml");
    }
}
