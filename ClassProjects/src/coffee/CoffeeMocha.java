package coffee;

public class CoffeeMocha extends Coffee {


    public CoffeeMocha(String coffeetype, double price, String storename) {
        super(coffeetype, price, storename);
    }

    public void prepare() {
        System.out.println("\nCoffee Type: " + super.getType());
        ingredient();
    }

    public void ingredient() {
        System.out.println("Ingredients: Milk, Espresso, Mocha Syrup, Cocoa Powder, Whipped Cream");
    }
    
}