package practice1;

public class SecondMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int given[]= {10,20,5,50,1,2,4,90};
		int min=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		
		for(int i=0;i<given.length;i++) {
			if(given[i]<min) {
				secondMin=min;
				min=given[i];
			}
			else if(given[i]<secondMin){
				secondMin=given[i];
			}
		}
		System.out.println("Second minimum value is:"+secondMin);
System.out.println("Minimum value is:"+min);
	}

}
