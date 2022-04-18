/* Q.387 First Unique Character in a String
 * Given a string, find the first non-repeating character in it 
 * and return its index. If it doesn't exist, return -1.
 * */
import java.util.*;

public class NonRepeatingCharacterinString {
	public static int firstUniqChar(String s) {
		HashMap<Character,Integer> m = new HashMap<>();
		int n = s.length();
		if (n == 0) {
			return -1;
		}
		if (n == 1) {
			return 0;
		}
		for (char c : s.toCharArray()) {
			m.put(c,m.getOrDefault(c, 0) + 1);
		}
		for(int i = 0; i < n; i++) {
			if (m.get(s.charAt(i))==1) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		System.out.println(firstUniqChar("leetcode"));
		System.out.println(firstUniqChar("loveleetcode"));
		
	}

}
