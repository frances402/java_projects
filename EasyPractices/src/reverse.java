
public class reverse {
	
	public static void main(String[] args) {
		System.out.println(reverse(34));
	}
	
	public static int reverse(int x) {
		int num = 0;		
		if (x == 0) {
			return x;
			}
		
		while (x != 0) {
			int digit = x % 10;
			x /= 10;
			if (num > 0 && (Integer.MAX_VALUE - digit) / 10 < num) {
				return 0;
			}
			if (num < 0 && (Integer.MIN_VALUE - digit) / 10 > num) {
				return 0;
			}
			num = num * 10 + digit;
		}
		return num;
    }
}
