package string;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="window";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			boolean flag=false;
			
			for(int j=i+1;j<s.length();j++) {
				if(ch==s.charAt(j)) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				System.out.println(ch +" is first non repeated char");
				break;
			}
			
		}
		

	}

}
