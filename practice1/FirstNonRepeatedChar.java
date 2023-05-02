package practice1;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String s="windoew";
		
		for(int i=0;i<s.length();i++) {
			boolean bool=true;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					bool=false;
					//System.out.println("Not found");
					break;
				}
				
			}
			if(bool) {
				System.out.println("found:"+s.charAt(i));
				break;
			}
		}

	}

}
