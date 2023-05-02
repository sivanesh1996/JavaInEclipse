package prep;

public class SecondMin{

	public static void main(String[] args) {
		int ar[]= {10,20,40,35,-5};
		int min=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		int i=0;
		
		while(i<ar.length) {
			if(ar[i]<min) {
			
				secondMin=min;
				min=ar[i];
				
			}
			else if(ar[i]<secondMin) {
				secondMin=ar[i];
			} i++;
		}
		System.out.println("Minumum number is:"+min);
		System.out.println("Second minimum number is:"+secondMin);

	}

}
