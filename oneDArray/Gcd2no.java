package oneDArray;

public class Gcd2no {

	public static void main(String[] args) {
		int a=9;
		int b=15;
		int gcd=0;
		int c=(a<b)?a:b;
		
		for(int i=1;i<=c;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
System.out.println("GCD of "+a+" and "+b+" is: "+gcd);
	}

}
