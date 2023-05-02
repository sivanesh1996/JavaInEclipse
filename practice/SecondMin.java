package practice;

public class SecondMin {

	public static void main(String[] args) {
		int ar[]= {30,50,20,10,70};
		int min=Integer.MAX_VALUE;
		int secMin=Integer.MAX_VALUE;
		int i=0;
		
		while(i<ar.length) {
			if(ar[i]<min) {
				secMin=min;
				min=ar[i];
			}
			else if(ar[i]<secMin) {
				secMin=ar[i];
			} 
			i++;
		}
System.out.println("Second minimum number is :"+secMin);
	}

}
