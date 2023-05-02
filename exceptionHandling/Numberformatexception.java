package exceptionHandling;

public class Numberformatexception {

	public static void main(String[] args) {
		
		String s="hi123";
		
		try {
			int x=Integer.parseInt(s);
			System.out.println(x);
		}
		catch(NumberFormatException e) {
			System.out.println("pls provide integer alone in string");
			e.printStackTrace();
		}

	}

}
