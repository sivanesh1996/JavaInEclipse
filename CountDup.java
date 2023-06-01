
public class CountDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {5,5,8,2,5,6,9,1,3,2};
		int freq[]=new int[ar.length];
		int dup[]=new int[freq.length];
		
		for(int i=0;i<ar.length;i++) {
			int count=1;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					count++;
					freq[j]=-1;
				}
				if(freq[i]!=-1){
					freq[i]=count;
				}
			}
		}
		
		int j=0;
		int countOfDup=0;
		int countOfUniq=0;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]==1) {
				countOfUniq++;
			}
			if(freq[i]>1) {
				countOfDup++;
				dup[j]=ar[i];
				j++;
			}
		}
		System.out.println("Count of Duplicate elements:"+countOfDup);
		System.out.println("Count of unique elements:"+countOfUniq);
		
		for(int i=0;i<dup.length;i++) {
			
			if(dup[i]!=0) {
				System.out.println("duplicate elements are:"+dup[i]);
			}
		}
	}

}
