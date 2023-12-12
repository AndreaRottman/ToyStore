import java.text.DecimalFormat;

public class Toy {
    protected String name;
    protected char toyType;
    protected String brand;
    protected double price;
    protected int qty;

    public Toy(String name, char toyType, String brand, double price, int qty) {
        this.name = name;
        this.toyType = toyType;
        this.brand = brand;
        this.price = price;
        this.qty = qty;
    }
    public Toy(){
        this.name = "Teddy";
        this.toyType = 'G';
        this.brand = "Store";
        this.price = 5.00;
        this.qty = 1000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getToyType() {
        return toyType;
    }

    public void setToyType(char toyType) {
        this.toyType = toyType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = Double.parseDouble(price);
    }

    public int getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = Integer.parseInt(qty);
    }

    @Override
    public String toString() {
        DecimalFormat currency = new DecimalFormat("$#,###.00");
        return
                "item = " + getName() +
                ", toyType = " + getToyType() +
                ", brand = " + getBrand()  +
                ", price = " + currency.format(getPrice()) +
                ", qty = " + getQty() +
                '}';
    }
}
