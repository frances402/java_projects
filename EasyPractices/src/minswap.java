
public class minswap {

	      
	public static int minSwap(int[] array){
        int p = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                p++;
            }
        }
        
        int count = 0;
        for(int i=0;i<p;i++){
            if(array[i]==1){
                count++;
            }
        }

        return count;
    }
	      
	    
	    public static void main(String args[]) 
	    { 
	        int ar[] = {1,0,0,0,1,0,1,0,1,0,1,1,1,0,1,1,0,1}; 
	        System.out.println(minSwap(ar)); 
	    } 
	

}
