package array;

public class LargeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50,8,800};
		int min=Integer.MIN_VALUE;
		int i=0;
		
		while(i<arr.length) {
		if(arr[i]>min)
			min=arr[i];
		i++;
		}
		System.out.println(min);

	}

}
