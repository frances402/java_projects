import java.util.*;
public class fibonacciLite {

	//Fn = Fn-1 + Fn-2
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(fibonnaci(number));
    }
    
    public static int fibonnaci(int num){
        if(num <= 0){
            return 0;
        }
        else if(num == 1){
            return 1;
        }
        return fibonnaci(num-1) + fibonnaci(num-2);
    }
    
}