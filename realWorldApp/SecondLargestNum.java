package realWorldApp;

public class SecondLargestNum {

	public static void main(String[] args) {
		
		int arr[]= {7,9,2,5,6};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
				}
			}
			
		}
		
		System.out.println("The second largest number in given array is:" +arr[1]);
	}

}
