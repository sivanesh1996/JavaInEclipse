package prep;

public class FirstNonRepeatChar {

	public static void main(String[] args) {
		String s="windowi";
		
		for(int i=0;i<s.length();i++) {
			boolean bool=true;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					bool=false;
					break;
				}
				
				}
			if(bool==true) {
				System.out.println("First non repeated char is:"+s.charAt(i));
				break;
			}
		}

	}

}
