package coffee;

import java.util.*;

public class Order {

    static Scanner input = new Scanner(System.in);
    public static int menu;

    public static void printMenu() {
        System.out.println("\nMENU");
        System.out.println("0. Quit");
        System.out.println("1. White Chocolate Mocha");
        System.out.println("2. Dark Chocolate Mocha");
        System.out.println("3. Coffee Mocha");
        System.out.println("4. Peppermint Mocha");
        System.out.println("5. New Mocha"); //Create New Mocha Drink
        System.out.println("6. Print All");
        System.out.println("\nChoose an option");
        menu = input.nextInt();
        input.nextLine();
    }


    public static void main(String[] args) {
        ArrayList<Coffee> order = new ArrayList<Coffee>();

        System.out.print("Enter Store Name: ");
        String name = input.next();
        
        System.out.print("White Chocolate Mocha price: ");
        double wm = input.nextDouble();
        System.out.print("Dark Chocolate Mocha price: ");
        double dm = input.nextDouble();
        System.out.print("Coffee Mocha price: ");
        double cm = input.nextDouble();
        System.out.print("Peppermint Mocha price: ");
        double pm = input.nextDouble();

        do {
            printMenu();
            switch (menu) {
                case 0:
                    System.out.println("Program ended");
                    System.exit(0);
                    input.close();
                    break;

                case 1:
                    WhiteChocolateMocha whiteChocolateMocha = new WhiteChocolateMocha("White Chocolate Mocha", wm, name);
                    order.add(whiteChocolateMocha);
                    System.out.println(whiteChocolateMocha.getType() + " order is added");
                    break;

                case 2:
                    DarkChocolateMocha darkChocolateMocha = new DarkChocolateMocha("Dark Chocolate Mocha", dm, name);
                    order.add(darkChocolateMocha);
                    System.out.println(darkChocolateMocha.getType() + " order is added");
                    break;

                case 3:
                    CoffeeMocha coffeeMocha = new CoffeeMocha("Coffee Mocha", cm, name);
                    order.add(coffeeMocha);
                    System.out.println(coffeeMocha.getType() + " order is added");
                    break;

                case 4:
                    System.out.println("How many pumps of peppermint syrup: ");
                    double amount = input.nextDouble();
                    PeppermintMocha peppermintMocha = new PeppermintMocha("Peppermint Mocha", pm, name, amount);
                    order.add(peppermintMocha);
                    System.out.println(peppermintMocha.getType() + " order is added");
                    break;

                case 5:
                    //Creating new mocha with new ingredients as well as price(in case adding extra shots and syrup or milk alternatives)
                    System.out.println("Enter new mocha type: ");
                    String type = input.nextLine();
                    System.out.println("Enter ingredients: ");
                    String ingredient = input.nextLine();
                    System.out.print("Enter new mocha price: ");
                    double price = input.nextDouble();
                    NewMocha coffee = new NewMocha(type, price, name, ingredient);
                    order.add(coffee);
                    System.out.println(coffee.getType() + " order is added");
                    break;

                case 6:
                    //print all the history until user select "0. Quit"
                    for (int i = 0; i < order.size(); i++) {
                        order.get(i).prepare();
                        System.out.println("Price: $" + order.get(i).getPrice());
                    }
                    break;

            }
        } while (menu != 0);
        
    }
    
}