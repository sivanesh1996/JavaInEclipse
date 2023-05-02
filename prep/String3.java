package prep;

public class String3 {

	public static void main(String[] args) {
		// check whether there are only numbers in string
		String s="ss001";
		//System.out.println(s.length());
		//METHOD-1
//		int count=0;
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)>='0' && s.charAt(i)<='9')
//				count++;
//		}
//		if(count==s.length()) {
//			System.out.println("Given input is only numbers");
//		}
//		else
//		{
//			System.out.println("Given input is not only numbers");
//		}
// METHOD-2		
		String s1=s.replaceAll("[a-zA-Z]","");
		System.out.println(s1);
		System.out.println(s1.length());
		
		if(s.length()==s1.length()) {
			System.out.println("Given input is only numbers");
		}
		else
		{
			System.out.println("Given input is not only numbers");
		}
//	METHOD-3
//		try {
//		int i=Integer.parseInt(s);
//		System.out.println(i);
//		}
//		
//		catch(NumberFormatException e) {
//			System.out.println("contains not numbers only");
//		}
		
		
	}

}
