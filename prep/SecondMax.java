package prep;

public class SecondMax {

	public static void main(String[] args) {
		//Second Max
		int ar[]= {10,50,30,40,60};
		int max=Integer.MIN_VALUE,secondMax=Integer.MIN_VALUE;
		int i=0;
		
		while(i<ar.length) {
		if(ar[i]>max) {
			
			secondMax=max;
			max=ar[i];
		}
		else if(ar[i]>secondMax) {
			secondMax=ar[i];
		}
      i++;
	} 
		System.out.println("Maximum number:"+max);
		System.out.println("Second maximum number is:"+secondMax);
	}

}
	
