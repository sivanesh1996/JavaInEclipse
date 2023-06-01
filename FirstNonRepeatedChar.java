
public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aeroplane";
		
		
		for(int i=0;i<s.length();i++) {
			boolean bool=true;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
				//	System.out.println("First repeated char:"+s.charAt(i));
					bool=false;
					break;
				}
				
			}
			if(bool) {
				System.out.println("First non repeated char:"+s.charAt(i));
				break;
			}
		}

	}

}
