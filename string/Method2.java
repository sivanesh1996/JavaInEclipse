package string;

public class Method2 {

	public static void main(String[] args) {
		String s="Hai";
		s=s.toUpperCase();
		System.out.println(s);
		System.out.println(s.length());
		char[] c=s.toCharArray();
		System.out.println("To char array:");
		System.out.println(c);
		
		int[] ss= {'A','B','c'};
		char[] aa= {97,98,99};
		
		
		
		for(int i=0;i<ss.length;i++)
		{
			System.out.println(ss[i]); //prints ASCI value of char
		}
		
		for(int i=0;i<aa.length;i++)
		{
			System.out.println(aa[i]); //prints ASCI alphabets of input ASCI value
		}
		
		int []cc= {1,2,3};
		char []dd= {'A','B','C'};
		
		System.out.println(s.charAt(0));
		
		for(int i=0;i<cc.length;i++)
		{
			System.out.println(cc[i]); //normally printing char array
			
		}

		for(int i=0;i<dd.length;i++)
		{
			
			System.out.println(dd[i]); //normally printing int array
		}
	}

}
