package coffee;

public class DarkChocolateMocha extends Coffee {


    public DarkChocolateMocha(String type, double price, String storename) {
        super(type, price, storename);
    }

    public void prepare() {
        System.out.println("\nCoffee Type: " + super.getType());
        ingredient();
    }

    public void ingredient() {
        System.out.println("Ingredients: Milk, Espresso, Dark Chocolate Syrup, Cocoa Powder, Whipped Cream");
    }

}