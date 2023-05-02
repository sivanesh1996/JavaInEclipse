package prep;

public class String1 {

	public static void main(String[] args) {
		//printing numbers in a string
		String s="Nagercoil 629001";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				System.out.print(s.charAt(i));
				count++;
			}
		}
		System.out.println("Number of numbers:"+count);
		//System.out.println(s.replaceAll("[a-zA-Z]",""));

	}

}
