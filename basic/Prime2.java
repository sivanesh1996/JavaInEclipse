package basic;

public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=2;
		int count=0;
		int i=2;
		
		while(n<=i) {
		if(n%i==0)
			count++;
		if(count>1) {
			System.out.println("given number is not prime");
			break;
		
		}
		i++;	
	}
		if(count<=1)
			System.out.println("given number is prime");
	}

}
