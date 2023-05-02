package prep;

public class PalindromeStr {

	public static void main(String[] args) {
		String given="Dadt";
		String solution="";
		given=given.toLowerCase();
		
        int i=given.length()-1;
        while(i>=0) {
        	solution=solution+given.charAt(i);
        	 i--;
        }
       if(given.equals(solution)) 
    	   System.out.println("Palindrome");
       else
    	   System.out.println("Not palindrome");
     
	}

}
