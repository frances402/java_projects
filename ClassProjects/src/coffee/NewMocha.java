package coffee;

public class NewMocha extends Coffee {

    private String ingredient;


    public NewMocha(String type, double price, String storename, String ingredient) {
        super(type, price, storename);
        this.ingredient = ingredient;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public void prepare() {
        System.out.println("\nCoffee Type: " + super.getType());
        ingredient();
    }
    
    public void ingredient() {
        System.out.println(this.ingredient);
    }
    
}