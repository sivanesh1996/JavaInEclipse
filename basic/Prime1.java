package basic;

public class Prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		int i=1;
		int count=0;
		
		while(n>=i) {
			if(n%i==0)
				count++;
			i++;
		}
		if(count==2)
			System.out.println("given number is prime");
		else if(count>2)
			System.out.println("not prime");
	}

}
