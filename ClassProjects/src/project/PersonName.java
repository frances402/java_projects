package project;
import java.util.*;

public class PersonName {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter firstName middleName lastName separated by at least one blank. It may have more than one blank separing firstName middleName lastName.");
        String name = input.nextLine();
        name = name.toUpperCase(); //changed to upper case for convenience
        String[] words = name.split("\\s+"); //used "\\s+" if there is more than one blank between names
        if (words.length < 3) {
            //if it doesn't have middle name
            String firstName = words[0];
            String lastName = words[1].charAt(0) + words[1].toLowerCase().substring(1);
            //changed into correct capitalized format ex)DOE => Doe
            System.out.println(lastName + ", " + firstName.charAt(0) + ".");
            //initials for firstName and full name on lastName

        } else {
            String firstName = words[0];
            String middleName = words[1];
            String lastName = words[2].charAt(0) + words[2].toLowerCase().substring(1);
            System.out.println(lastName + ", " + firstName.charAt(0) + "." + middleName.charAt(0) + ".");
            //initials for firstName and middleName and full name on lastName
        }

        input.close();


    }
}