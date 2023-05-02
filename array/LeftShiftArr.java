package array;

public class LeftShiftArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'a','b','c','d','e'};
		int no=2;
		while(no>0) {
		
		char temp=arr[0];
		int i=0;
		while(i<arr.length-1) {
			arr[i]=arr[i+1];
			i++;
		}
		arr[i]=temp;
		no--;
		
		}
		
		for(char o:arr) {
			System.out.print(o +" ");
		}

	
		
	}

}
