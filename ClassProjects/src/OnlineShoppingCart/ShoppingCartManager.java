package OnlineShoppingCart;

public class ShoppingCartManager {

    public static char menu;


    public static void printMenu(ShoppingCart cart) {
        System.out.println("\nMENU");
        System.out.println("a - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println("q - Quit");
        System.out.println("\nChoose an option");
        menu = ShoppingCartPrinter.input.next().charAt(0);
        ShoppingCartPrinter.input.nextLine();

    }

    public static void main(String[] args) {


        System.out.println("Enter Customer's Name: ");
        String customerName = ShoppingCartPrinter.input.nextLine(); //used single scanner
        System.out.println("Enter Today's Date: ");
        String currentDate = ShoppingCartPrinter.input.nextLine();

        ShoppingCart cart = new ShoppingCart(customerName, currentDate);

        System.out.println("Cutomer Name: " + cart.getCustomerName());
        System.out.println("Today's Date: " + cart.getCurrentDate());



        do {
            printMenu(cart);
            switch (menu) {
                case 'a':
                    System.out.println("Enter the item name: ");
                    String itemName = ShoppingCartPrinter.input.nextLine();
                    System.out.println("Enter the item description: ");
                    String itemDescription = ShoppingCartPrinter.input.nextLine();
                    System.out.println("Enter the item price: ");
                    int itemPrice = ShoppingCartPrinter.input.nextInt();
                    System.out.println("Enter the item quantity: ");
                    int itemQuantity = ShoppingCartPrinter.input.nextInt();
                    ItemToPurchase item = new ItemToPurchase(itemName, itemDescription, itemPrice, itemQuantity);
                    cart.addItem(item);
                    break;
                case 'd':
                    System.out.println("\nREMOVE ITEM FROM CART");
                    System.out.println("Enter name of item remove");
                    String removeName = ShoppingCartPrinter.input.nextLine();
                    cart.removeItem(removeName);
                    break;
                case 'c':
                    System.out.println("\nCHANGE ITEM QUANTITY");
                    System.out.println("Enter name of item");
                    String changeName = ShoppingCartPrinter.input.nextLine();
                    System.out.println("Enter the new quantity");
                    int newQuantity = ShoppingCartPrinter.input.nextInt();
                    ItemToPurchase item1 = new ItemToPurchase(changeName, "none", 0, newQuantity);
                    cart.modifyItem(item1);
                    break;
                case 'i':
                    System.out.println("\nOUTPUT ITEM DESCRIPTION");
                    cart.printDesciptions();
                    break;
                case 'o':
                    System.out.println("\nOUTPUT SHOPPING CART");
                    cart.printTotal();
                    break;
                case 'q':
                    System.out.println("Program ended");
                    System.exit(0);
                    ShoppingCartPrinter.input.close();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (menu != 'q');


    }

}