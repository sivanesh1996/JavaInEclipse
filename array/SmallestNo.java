package array;

public class SmallestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50,2};
		int max=Integer.MAX_VALUE;
		int i=0;
		
		while(i<arr.length) {
		if(max>arr[i])
				max=arr[i];
		i++;

	}
		
		System.out.println(max);
	}

}
