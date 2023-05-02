package string;

public class UpperCase {
	
	 void Uppercase(String a)
	{
		int b=a.length();
		int s[]=new int[b];
		//char c[]=new char[b];
		for(int i=0;i<b;i++)
		{
			
			//System.out.print(a.charAt(i));
			 
			 s[i]=a.charAt(i);
			 s[i]=s[i]-32;
			 int x=s[i];
			 char cc=(char)x;
			System.out.print(cc);
		}
		
	}

	public static void main(String[] args) {
		UpperCase b=new UpperCase();
		
		System.out.println("Please Enter Lower case characters:");
		b.Uppercase("selvakumar");

	}

}
