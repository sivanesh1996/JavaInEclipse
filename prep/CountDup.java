package prep;

public class CountDup {

	public static void main(String[] args) {
		//count of each nos,count of duplicate no,count of unique no,display duplicates
		int ar[]= {1,1,2,2,4,3,4,4,5};
		int freq[]=new int[ar.length];
		int dup[]=new int[ar.length];
		
		for(int i=0;i<ar.length;i++) {
			int count=1;
			int no=ar[i];
			
			for(int j=i+1;j<freq.length;j++) {
				if(ar[j]==no) {
					count++;
					freq[j]=-1;
				}
			}
			
			if(freq[i]!=-1) {  //To prevent setting freq arr if duplicate elements
				freq[i]=count;
			}
		
		}
		int j=0;
		int countOfDup=0;
		int countOfUniq=0;
		for(int i=0;i<ar.length;i++) {
		if(freq[i]>1) {
			dup[j]=ar[i];
			j++;
			countOfDup++;
		}
		
		if(freq[i]==1) {
			
			countOfUniq++;
		}
		
		if(freq[i]!=-1) {
			System.out.println(ar[i] +" appeared " +freq[i] +" times");
		}
		
	}
		System.out.println("Count of duplicate elements:"+countOfDup);
		System.out.println("Count of unique elements:"+countOfUniq);
		System.out.println("duplicate elements are:");
	
for(int i=0;i<ar.length;i++) {
	if(dup[i]>0) {
		System.out.print(dup[i] +" ");
	}
	
}

}
}
