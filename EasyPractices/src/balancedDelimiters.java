import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class balancedDelimiters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p = Pattern.compile("\\(\\)|\\[\\]|\\{\\}");
        while(p.matcher(str).find())
            str = str.replaceAll("\\(\\)|\\[\\]|\\{\\}", "");
        if(str.isEmpty())
            System.out.println("True");
        else
            System.out.println("False");
        
    }
}