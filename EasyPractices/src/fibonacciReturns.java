import java.math.BigInteger;
import java.util.*;
public class fibonacciReturns {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    ArrayList<BigInteger> fib = new ArrayList<BigInteger>();
	    fib.add(new BigInteger("0"));
	    fib.add(new BigInteger("1"));
	    while(sc.hasNext()) {
	        int n = sc.nextInt();
	        if(n > fib.size()-1 ) {
	            for(int i=fib.size(); i<=n; i++) {
	                BigInteger a= fib.get(i-1);
	                BigInteger b = fib.get(i-2);
	                fib.add(i, a.add(b));

	            }
	        }
	        System.out.print(fib.get(n) + "\n");
	    }
	}
}
