import java.util.Arrays;

public class MergeSortArrays {

	    public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        int temp = 0;
	        //merge all the arrays
	       for(int i = m; i < m+n; i++){
	            nums1[i]=nums2[i-m]; 
	        }
	        
	        //sort array
	         for (int i = 0; i <nums1.length; i++) {     
	          for (int j = i+1; j <nums1.length; j++) {     
	              if(nums1[i] >nums1[j]) {      
	                 temp = nums1[i];    
	                 nums1[i] = nums1[j];    
	                 nums1[j] = temp;    
	               }     
	            }     
	        } 
	         //or you can simply put Arrays.sort(nums1);
	         System.out.println(Arrays.toString(nums1));
	        

	      
	 }        

	    public static void main(String args[]) {
			int[] array1 = {1,2,3,0,0,0};
			int[] array2 = {2,5,6}; 
	        merge(array1,3,array2,3);
	        

	    }

}
