import java.util.*;
public class findTheMedian {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		if ((n & 1) == 1) {
			System.out.println(a[n / 2]);
		} else {
			System.out.println((a[n / 2] + a[n / 2 + 1]) / 2);
		}
		sc.close();
	}
}

