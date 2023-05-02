package realWorldApp;

/* Input=a2v3b1c2  Expected output=aavvvbcc */

public class StringApp1 {

	public static void main(String[] args) {
		
		String s="a2v3b1c2";
		char s1='0';
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				 s1=s.charAt(i);
				 //System.out.println(s1);
			}
			else
			{
				char a=s.charAt(i);
				String f=Character.toString(a);
				int a1=Integer.parseInt(f);
				
			//	System.out.println(a1);
				
				for(int j=0;j<a1;j++)
				{
					s2=s2+s1;
					
				}
			}
		}
		System.out.print(s2);

	}

}
