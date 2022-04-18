
public class JavaPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("IV")); //4
		System.out.println(romanToInt("III")); //3
	}
	
	public static int romanToInt(String s) {
        int value = 0;
        char prev = '\0';

        for (int i = s.length() - 1; i >= 0; i--) {
            value += getIntValue(s.charAt(i), prev);
            prev = s.charAt(i);
        }

        return value;
    }

    private static int getIntValue(char curr, char prev) {
        switch (curr) {
            case 'I':
                switch (prev) {
                    case 'V':
                    case 'X':
                        return -1;
                    default:
                        return 1;
                }
            case 'V':
                return 5;
            case 'X':
                switch (prev) {
                    case 'L':
                    case 'C':
                        return -10;
                    default:
                        return 10;
                }
            case 'L':
                return 50;
            case 'C':
                switch (prev) {
                    case 'D':
                    case 'M':
                        return -100;
                    default:
                        return 100;
                }
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}
