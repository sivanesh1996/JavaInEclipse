package realWorldApp;

public class AverageExceptmaxmin {

	public static void main(String[] args) {
		
		int arr1[]= {2,3,1,4,5,6,8,0,9,7};
		float a=0;
	
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]>arr1[j])
				{
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		
		for(int i=1;i<arr1.length-1;i++)
		{
			a=a+arr1[i];
			
			
		}
		
		System.out.println(a/(arr1.length-2));

	}

}
