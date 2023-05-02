package string;

public class RepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="winston";
		
		System.out.println(s.length());
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			boolean repeat=false;
			
			for(int j=i+1;j<s.length();j++) {
				
				if(ch==s.charAt(j)) {
					//System.out.println(j +"," +i);
					System.out.println("first repeated char is: "+ch);
					repeat=true;
					break;
				}
				
				
				
			}
			
			if(repeat==true) {
				break;
			}
			else if(i==s.length()-1) {
				System.out.println("no char repeated");
			}
			
		}
		
		
		
		

	}

}
