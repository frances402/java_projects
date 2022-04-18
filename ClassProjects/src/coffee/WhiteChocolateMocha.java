package coffee;

public class WhiteChocolateMocha extends Coffee {


    public WhiteChocolateMocha(String type, double price, String storename) {
        super(type, price, storename);
    }

    public void prepare() {
        System.out.println("\nCoffee Type: " + super.getType());
        ingredient();
    }

    public void ingredient() {
        System.out.println("Ingredients: Milk, Espresso, White Chocolate Syrup, Whipped Cream, White Chocolate chips");
    }
}