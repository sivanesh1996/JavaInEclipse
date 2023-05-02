package string;

public class UseNewKey {

	public static void main(String[] args) {
		char c[]= {'S','I','V','A','N','E','S','H'};
		String s=new String(c);
		System.out.println(s);
		String s1=new String(c,4,4);
		System.out.println(s1);
        
	}

}
