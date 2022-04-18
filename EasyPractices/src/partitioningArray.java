import java.util.HashMap;
//partitioning array
public class partitioningArray {

	 public static void main(String[] args) {
	        System.out.println(partitionArrayUnique(new int[]{1,2,3,4}, 2)); // true
	        System.out.println(partitionArrayUnique(new int[]{1,2,3,3}, 2)); // true
	        System.out.println(partitionArrayUnique(new int[]{1,2,3,4}, 3)); // false
	        System.out.println(partitionArrayUnique(new int[]{3,3,3,6,6,6,9,9,9}, 3)); // true
	        System.out.println(partitionArrayUnique(new int[]{1,2,3,1,2,3,1,2,2}, 3)); // false
	        System.out.println(partitionArrayUnique(new int[]{}, 1)); // true
	        System.out.println(partitionArrayUnique(new int[]{1}, 1)); // true
	        System.out.println(partitionArrayUnique(new int[]{1,2}, 2)); // true
	    }

	    public static boolean partitionArrayUnique(int[] nums, int k){
	        if(nums.length % k != 0){
	            return false;
	        }

	        HashMap<Integer, Integer> map = new HashMap<>();
	        int max = 0;
	        for(int num: nums){
	            map.put(num, map.getOrDefault(num, 0) + 1);
	            if(map.get(num) > max){
	                max = map.get(num);
	            }
	        }

	        return max <= (nums.length / k);
	    }
	    /*public static String partitionArray(int k, List<Integer> numbers) {
    // Write your code here
    
        if(numbers.size() % k != 0){
                return "No";
            }

            HashMap<Integer, Integer> map = new HashMap<>();
            int max = 0;
            for(int num: numbers){
                map.put(num, map.getOrDefault(num, 0) + 1);
                if(map.get(num) > max){
                    max = map.get(num);
                }
            }

            if (max <= (numbers.size() / k))
            return "Yes";
            else
            return "No";
        }
	     * */
}
