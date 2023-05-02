package array;

public class secondMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,1,50,6};
		int min=Integer.MAX_VALUE;
		int secondMin=Integer.MIN_VALUE;
		int i=0;
		
		while(i<arr.length) {
		if(arr[i]<min) {
			secondMin=min;
			min=arr[i];
		}
		else if(arr[i]<secondMin) {
			secondMin=arr[i];
		}
		i++;
		}
		System.out.println("Second min is: "+secondMin);

	}

}
