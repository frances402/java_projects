package OnlineShoppingCart;

public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    private String itemDescription;

    public ItemToPurchase() {
        //default constructor
        this.itemName = "none";
        this.itemPrice = 0;
        this.itemQuantity = 0;
        this.itemDescription = "none";
    }



    public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity) {
        //parameterized constructor
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public String getName() {
        return itemName;
    }

    public void setName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return itemPrice;
    }

    public void setPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return itemQuantity;
    }

    public void setQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getDesciption() {
        return itemDescription;
    }

    public void setDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void printItemCost() {
        int cost = getQuantity() * getPrice(); //not sure if its this.getQuantity
        System.out.println(getName() + " " + getQuantity() + " @  $" + getPrice() + " = $" + cost);
    }

    public void printItemDesciption() {
        System.out.println(getName() + ": " + getDesciption());
    }


}
