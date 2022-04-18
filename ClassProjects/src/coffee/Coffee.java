package coffee;

public abstract class Coffee implements HowToMakeDrink {

    private String type;
    private double price;
    private String storename;

    public Coffee(String type, double price, String storename) {
        this.type = type;
        this.price = price;
        this.storename = storename;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    //Override
    public void prepare() {
        System.out.println("\nCoffee Type: " + type);
    }

    //abstract method
    public abstract void ingredient();


}