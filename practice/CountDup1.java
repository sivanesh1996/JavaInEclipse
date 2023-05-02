package practice;

public class CountDup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,1,2,2,4,3,4,4,5};
		int freq[]=new int[arr.length];
		int dup[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			int no=arr[i];
			int count=1;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(no==arr[j])
				{
					count++;
					freq[j]=-1;
					
				}
			}
				if(freq[i]!=-1) {
					freq[i]=count;
				}
			
		}
		int countDup=0;
		int countUniq=0;
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(freq[i]>1) {
				dup[j]=arr[i];
				j++;
				countDup++;
			}
			
			if(freq[i]==1) {
				countUniq++;
			}
			
			if(freq[i]!=-1) {
				System.out.println(arr[i] +" appeared " +freq[i] +" times");
			}
			
		}
		
		for(int i=0;i<dup.length;i++) {
			if(dup[i]>0)
				System.out.println(dup[i]);
		}
		System.out.println("No of duplicate elements:"+countDup);
        System.out.println("No of unique elements:"+countUniq);
}

}
