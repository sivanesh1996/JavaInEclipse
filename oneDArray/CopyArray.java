package oneDArray;

public class CopyArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int arr1[]=new int[arr.length];
		int arr2[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr1[i] +" ");
		}
		System.out.println();
		System.arraycopy(arr, 0,arr2 , 0,arr.length);

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr2[i] +" ");
		}
	}

}
