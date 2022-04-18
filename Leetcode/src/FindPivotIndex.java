/* Q.724 Find Pivot Index (중간지점, 그기준 왼쪽합=오른쪽)
 * */
public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for(int x: nums) {
        	sum += x;
        	}
        for(int i = 0; i < nums.length; ++i){
            if (leftsum == sum - leftsum - nums [i]) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
        
    }
    public static void main(String[] args) {
    	int[] test1 = {1,7,3,6,5,6};
    	int[] test2 = {1,2,3};
    	System.out.println(pivotIndex(test1)); 
    	/* The sum of the numbers to the left of index 3 (nums[3] = 6) 
    	 * is equal to the sum of numbers to the right of index 3.
		 * Also, 3 is the first index where this occurs.
    	 * */
    	System.out.println(pivotIndex(test2));
    	//There is no index that satisfies the conditions in the problem statement.
    
    }
}
