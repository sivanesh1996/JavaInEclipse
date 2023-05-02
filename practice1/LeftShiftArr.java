package practice1;

public class LeftShiftArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {1,2,3,4,5};
		
		int temp=ar[0];
		
		for(int i=0;i<ar.length-1;i++) {
			ar[i]=ar[i+1];
		}
		
		ar[ar.length-1]=temp;
		
		for(int o:ar) {
			System.out.print(o +" ");
		}
		

	}

}
