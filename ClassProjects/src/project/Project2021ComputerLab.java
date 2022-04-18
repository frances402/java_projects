package project;
import java.util.*;


public class Project2021ComputerLab {
    static Scanner input = new Scanner(System.in);
    public static int menu;
    public static String[][] array = new String[4][];

    public Project2021ComputerLab() {
        array[0] = new String[5];
        array[1] = new String[6];
        array[2] = new String[4];
        array[3] = new String[3];
        //creates empty array instead of null
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = "empty";
            }
        }
    }

    public static void mainMenu() {
        System.out.println("\nMain Menu");
        System.out.println("0) Quit");
        System.out.println("1) Stimulate login");
        System.out.println("2) Stimulate logoff");
        System.out.println("3) Search");
        menu = input.nextInt();

    }

    public static void printArray() {
        System.out.println("\nLAB STATUS");
        //System.out.println("Lab # Computer Stations");
        System.out.println("Lab Number \tComputer Stations Numbers");
        int rowNum = 1;
        //created columnNum and rowNum so it doesn't mess up the index and print numbers starting from 1
        for (int row = 0; row < array.length; row++) {
            System.out.print(rowNum + "\t\t");
            rowNum++;
            int columnNum = 1;
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(columnNum + ": " + array[row][column] + " ");
                columnNum++;
            }
            System.out.println();
        }
    }


    //2) stimulate logoff method
    public static void logOff(String id) {

        boolean none = false;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (id.equals(array[row][column])) { 
                    array[row][column] = "empty";
                    none = true;
                }
            }
        }
        if (none == true) {
            System.out.println("User " + id + " is logged off");
        } else {
            System.out.println("Invalid User ID");
        }

    }


    //3) search method
    public static void search(String id) {

        int labNumber;
        int stationNumber;
        boolean none = false;

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (id.equals(array[row][column])) {
                    labNumber = row + 1;
                    stationNumber = column + 1;
                    System.out.println("Lab Number is " + labNumber);
                    System.out.println("Computer Station Number is " + stationNumber);
                    none = true;
                }
            }
        }
        if (none == false) {
            System.out.println("None");
        }
    }



    public static void main(String[] args) {
        new Project2021ComputerLab();

        do {
            printArray();
            mainMenu();
            switch (menu) {
                case 0:
                    System.out.println("Program ended");
                    System.exit(0);
                    input.close();
                    break;
                case 1:
                    System.out.println("Enter the 5 digit ID number of the user logging in:");
                    String idIn = input.next();
                    System.out.println("Enter the lab number the user is loggin in from (1-4):");
                    int row = input.nextInt();
                    row--;
                    System.out.println("Enter computer station number the user is logging in to (1-6):");
                    int column = input.nextInt();
                    column--;
                    //since array starts with 0 but the table starts with 1, so I had to subtract each rows and columns to store id
                    array[row][column] = idIn;

                    break;
                case 2:
                    System.out.println("Enter the 5 digit ID number of the user to find:");
                    String idOff = input.next();
                    logOff(idOff);
                    break;
                case 3:
                    System.out.println("Enter the 5 digit ID number of the user to search Lab Number and Station Number:");
                    String idSearch = input.next();
                    search(idSearch);
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;

            }

        } while (menu != 0);
    }
}