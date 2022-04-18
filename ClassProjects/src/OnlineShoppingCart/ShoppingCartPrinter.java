package OnlineShoppingCart;

import java.util.*;

public class ShoppingCartPrinter {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //create two item objects
        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();

        System.out.println("Item 1");
        System.out.println("Enter the item name: ");
        String itemName1 = input.nextLine();
        item1.setName(itemName1);
        System.out.println("Enter the item price: ");
        int itemPrice1 = input.nextInt();
        item1.setPrice(itemPrice1);
        System.out.println("Enter the item quantity: ");
        int itemQuantity1 = input.nextInt();
        item1.setQuantity(itemQuantity1);


        System.out.println("\nItem 2");
        System.out.println("Enter the item name: ");
        input.nextLine();
        String itemName2 = input.nextLine();
        item2.setName(itemName2);
        System.out.println("Enter the item price: ");
        int itemPrice2 = input.nextInt();
        item2.setPrice(itemPrice2);
        System.out.println("Enter the item quantity: ");
        int itemQuantity2 = input.nextInt();
        item2.setQuantity(itemQuantity2);


        //calculate total cost
        int item1Cost = item1.getPrice() * item1.getQuantity();
        int item2Cost = item2.getPrice() * item2.getQuantity();
        int total = item1Cost + item2Cost;

        System.out.println("\nTOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @  $" + item1.getPrice() + " = $" + item1Cost);
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @  $" + item2.getPrice() + " = $" + item2Cost);
        System.out.println("\nTotal: $" + total);

    }

}
