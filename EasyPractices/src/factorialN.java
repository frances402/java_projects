import java.io.*;
import java.util.*;
import java.math.*;

public class factorialN {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger b = new BigInteger("1");
        
        for(int i=1;i<=n;i++){
            b = b.multiply(new BigInteger(String.valueOf(i)));
        }
        
        System.out.println(b);
    }
}
/*
 * import java.io.*;
import java.util.*;
import java.math.*;

public class factorialN {
 * public static Long fact(Integer a){
    if(a == 0){
        return new Long(1);
    }
    else{
        return a*fact(a-1);
    }
}
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Integer a = (Integer)scan.nextInt();
    Long value = fact(a);
    System.out.print(value);
}
}*/
