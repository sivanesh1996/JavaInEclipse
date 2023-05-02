package realWorldApp;

public class RemoveSpace {

	public static void main(String[] args) {
		
		String s="a s d f 1 2";
		String s1="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				char a=s.charAt(i);
				//System.out.println(a);
				String f=Character.toString(a);
				s1=s1+f;
			}
	}
		System.out.println(s1);

}
}
