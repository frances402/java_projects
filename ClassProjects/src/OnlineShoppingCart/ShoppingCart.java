package OnlineShoppingCart;

import java.util.*;

public class ShoppingCart {

    private String customerName;
    private String currentDate;
    private ArrayList < ItemToPurchase > cartItems = new ArrayList < > ();

    public ShoppingCart() {
        //default constructor
        customerName = "none";
        currentDate = "Janurary 1, 2016";
    }

    public ShoppingCart(String customerName, String currentDate) {
        //parameterized constructor
        this.customerName = customerName;
        this.currentDate = currentDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void addItem(ItemToPurchase item) {
        if (item != null) {
            cartItems.add(item);
        }
    }

    public void removeItem(String itemName) {
        boolean hasItem = false;

        if (cartItems != null) {
            for (int i = 0; i < cartItems.size(); i++) {
                //check if itemName entered matches with itemName
                if (cartItems.get(i).getName().equals(itemName)) {
                    cartItems.remove(i);
                    hasItem = true;
                    return;
                }
            }

            if (hasItem == false) {
                System.out.println("Item not found in cart. Nothing removed.");
            }
        }

    }

    public void modifyItem(ItemToPurchase item) {
        boolean hasItem = false;

        if (cartItems != null) {
            for (int i = 0; i < cartItems.size(); i++) {
                //check if itemName entered matches with itemName
                if (cartItems.get(i).getName().equals(item.getName())) {
                    if (!item.getDesciption().equals("none")) {
                        cartItems.get(i).setDescription(item.getDesciption());
                    }
                    if (item.getPrice() != 0) {
                        cartItems.get(i).setPrice(item.getPrice());
                    }
                    if (item.getQuantity() != 0) {
                        cartItems.get(i).setQuantity(item.getQuantity());
                    }
                    hasItem = true;

                }
            }

            if (hasItem == false) {
                System.out.println("Item not found in cart. Nothing modified.");
            }
        }

    }

    public int getNumItemsInCart() {
        int total = 0;
        for (int i = 0; i < cartItems.size(); i++) {
            total += cartItems.get(i).getQuantity();
        }
        return total;
    }

    public int getCostOfCart() {
        int total = 0;
        for (int i = 0; i < cartItems.size(); i++) {
            total += cartItems.get(i).getQuantity() * cartItems.get(i).getPrice();
        }
        return total;

    }

    public void printTotal() {
        if (cartItems.isEmpty()) {
            System.out.println("SHOPPING CART IS EMPTY");
        } else {
            System.out.println(customerName + "'s Shopping Cart - " + currentDate);
            System.out.println("Number of Items: " + getNumItemsInCart());
            for (int i = 0; i < cartItems.size(); i++) {
                System.out.println("\n" + cartItems.get(i).getName() + " " + cartItems.get(i).getQuantity() +
                    " @ $" + cartItems.get(i).getPrice() + " = " + (cartItems.get(i).getQuantity() * cartItems.get(i).getPrice()));
            }
            System.out.println("\nTotal: " + getCostOfCart());
        }


    }

    public void printDesciptions() {
        System.out.println(customerName + "'s Shopping Cart - " + currentDate);
        System.out.println("\nItem Desciptions");
        for (int i = 0; i < cartItems.size(); i++) {
            System.out.println(cartItems.get(i).getName() + ": " + cartItems.get(i).getDesciption());
        }

    }

}
