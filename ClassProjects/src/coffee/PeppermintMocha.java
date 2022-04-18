package coffee;

public class PeppermintMocha extends Coffee {
	
    private double peppermintSyrubAmount;

    public PeppermintMocha(String type, double price, String storename, double peppermintSyrubAmount) {
        super(type, price, storename);
        this.peppermintSyrubAmount = peppermintSyrubAmount;
    }

    public double getPeppermintSyrubAmount() {
        return peppermintSyrubAmount;
    }

    public void setPeppermintSyrubAmount(double peppermintSyrubAmount) {
        this.peppermintSyrubAmount = peppermintSyrubAmount;
    }

    public void prepare() {
        System.out.println("\nCoffee Type: " + super.getType());
        ingredient();
    }

    public void ingredient() {
        System.out.println("Ingredients: Milk, Espresso, Mocha Syrup, Whipped cream, Crushed Peppermint Candies, Peppermint Syrup " + getPeppermintSyrubAmount() + " pumps");
    }

}