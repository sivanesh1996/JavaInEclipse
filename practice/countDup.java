package practice;

public class countDup {

	public static void main(String[] args) {
		String arr[]= {"1","5","1","2","3","3","5","4","6","5","6"};
        int ar[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			ar[i]=Integer.parseInt(arr[i]);
		}
		
		int freq[]=new int[ar.length];
		int dup[]=new int[ar.length];
		
		for(int i=0;i<ar.length;i++) {
			int count=1,no=ar[i];
			
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]==no) {
					count++;
					freq[j]=-1;
				}
				if(freq[i]!=-1) {
					freq[i]=count;
				}
			}						
	}
		int k=0;
		for(int i=0;i<ar.length;i++) {
			if(freq[i]>1)
			{
				dup[k]=ar[i];
				k++;
			}
		}
		
		for(int i=0;i<dup.length;i++) {
		    if(dup[i]>0)
			System.out.print(dup[i] +" ");
		}
		
		
}
}
