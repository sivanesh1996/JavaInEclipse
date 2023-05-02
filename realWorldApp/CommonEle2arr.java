package realWorldApp;

public class CommonEle2arr {

	public static void main(String[] args) {
		int arr1[]= {2,3,4,5,6};
		int arr2[]= {9,8,5,4,1};
		
		int m1=arr1.length;
		int m2=arr2.length;
		int m3=(m1>=m2)?m1:m2;
		
		int arr3[]=new int[m3];
		
		for(int i=0;i<m1;i++)
		{
			for(int j=0;j<m2;j++)
			{
				if(arr1[i]==arr2[j])
					arr3[i]=arr1[i];
			}
		}
		
		for(int i=0;i<m3;i++)
		{
			if(arr3[i]>0)
			System.out.println(arr3[i]);
		}

	}

}
