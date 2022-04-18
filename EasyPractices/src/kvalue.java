
public class kvalue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(kpath(1));
		System.out.println(kpath(3)); 
		System.out.println(kpath(15));
		System.out.println(kpath(23)); 
		
	}
	public static int kpath(int k) {
		int count = 0;
		if(k==1) {
			return -1;
		}
		while(k>1) {
			if(k%2 == 0){
				k-=1; 
				count+=1;
				{
					if(k%4==0) {
						k/=4;
						count+=2;
					}else if(k%2==0) {
						k/=2;
						count+=1;
					}
				} 
			}
			else if (k%2!=0) {
				k+=1;
				count+=1;
				if(k%8==0) {
					k/=8;
					count+=3;
					System.out.print("shortest path ");
				} else if(k%4==0) {
					k/=4;
					count+=2;
				} else if(k%2==0) {
					k/=2;
					count+=1;
				}
			}
		}
		return count;
}
}
