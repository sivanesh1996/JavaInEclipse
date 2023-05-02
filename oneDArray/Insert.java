package oneDArray;

public class Insert {

	public static void main(String[] args) {
		
		int[] arr= {1,2,4,5,6};
		int[] arr1=new int[arr.length+1];
		
		for(int i=0;i<2;i++) {
			arr1[i]=arr[i];
		}
		arr1[2]=3;
		
		for(int i=3;i<arr1.length;i++)
		{
			arr1[i]=arr[i-1];
		}
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i] +" ");
		}

	}

}
