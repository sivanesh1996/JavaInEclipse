package gcd;

public class Gcd3no {

	public static void main(String[] args) {
		int a=6;
		int b=9;
		int c=12;
		int gcd=0;
		int d=(((a<b)?a:b)<c)?((a<b)?a:b):c;
		
		for(int i=1;i<=d;i++)
		{
			if(a%i==0 && b%i==0 && c%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("GCD of ("+a+","+b+","+c+") is: "+gcd);

	}

}
