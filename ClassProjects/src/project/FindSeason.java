package project;

/* Minji Jeon
 * #1
 * 1/6/2022 */ 

import java.util.*;

public class FindSeason {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        do {

            String month = scan.next();
            if (month.equals("Quit")) {
                System.out.println("Program ended");
                System.exit(0);
                scan.close(); //program stops when input is Quit
            }

            int day = scan.nextInt();
            if (day <= 0 || day > 31) {
                System.out.println("invalid");
                continue;
            } //days less than 0 or greater than 31 should print invalid


            //switch method to print season
            switch (month) {

                case "January":
                    System.out.println("Winter");
                    break;
                case "Feburary":
                    if (day > 29) { 
                        System.out.println("invalid");
                    } else {
                        System.out.println("Winter");
                    }
                    break;
                case "March":
                    if (day <= 19) {
                        System.out.println("Winter");
                    } else {
                        System.out.println("Spring");
                    }
                    break;
                case "April":
                    if (day == 31) {
                        System.out.println("Invalid");
                    } else {
                        System.out.println("Spring");
                    }
                    break;
                case "May":
                    System.out.println("Spring");
                    break;
                case "June":
                    if (day <= 20) {
                        System.out.println("Spring");
                    } else {
                        System.out.println("Summer");
                    }
                    break;
                case "July":
                    System.out.println("Summer");
                    break;
                case "August":
                    System.out.println("Summer");
                    break;
                case "September":
                    if (day == 31) {
                        System.out.println("invalid");
                    } else if (day <= 21) {
                        System.out.println("Summer");
                    } else {
                        System.out.println("Autumn");
                    }
                    break;
                case "October":
                    System.out.println("Autumn");
                    break;
                case "November":
                    if (day == 31) {
                        System.out.println("invalid");
                    } else {
                        System.out.println("Autumn");
                    }
                    break;
                case "December":
                    if (day <= 20) {
                        System.out.println("Autumn");
                    } else {
                        System.out.println("Winter");
                    }
                    break;
                default:
                    System.out.println("invalid");
                    break;
            }

        } while (scan.hasNext()); //do-while loop until input is Quit
    }
}