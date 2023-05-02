package array;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,500,40,600,1};
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		int i=0;
		while(i<arr.length) {
		if(max<arr[i]) {
			secondMax=max;
			max=arr[i];
		}
		else if(arr[i]>secondMax){
			secondMax=arr[i];
		}
		i++;
		}
		
		System.out.println("second max is:"+secondMax);
	}

}
