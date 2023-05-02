package string;

public class ReverseString {

	public static void main(String[] args) {
		String s="radar";
		String na="";
		for(int i=s.length()-1;i>=0;i--)
		{
			na=na+s.charAt(i);
			//System.out.println(na);
		}
		
		System.out.println(na);
		
		if(s.equals(na))
			System.out.println("given string is palindrome");
		else
			System.out.println("given string is not a palindrome");

	}

}
