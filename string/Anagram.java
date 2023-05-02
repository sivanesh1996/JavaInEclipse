package string;

public class Anagram {
	
	

	public static void main(String[] args) {
		String s="mary";
		String s1="marry";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(s.charAt(i)==s1.charAt(j))
				{
					count++;
				}
			}
		}
		System.out.println(count);
		if(count==s.length())
		{
			System.out.println("given string is anagram");
		}
		else
		{
		System.out.println("given string is not anagram");
		}
		

	}

}
