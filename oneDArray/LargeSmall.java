package oneDArray;

public class LargeSmall {

	public static void main(String[] args) {
		int arr[]= {3,4,5,2,1,5,9,8,-5};
        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++) {
        	if(large<arr[i])
        		large=arr[i];
        }
        System.out.println("Large element:"+large);
        
        for(int i=0;i<arr.length;i++) {
        	if(small>arr[i]) {
        		small=arr[i];
        	}
        }
        System.out.println("Small element:"+small);
        
	}

}
