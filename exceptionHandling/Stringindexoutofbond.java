package exceptionHandling;

public class Stringindexoutofbond {

	public static void main(String[] args) {
		String s="hi";
		try {
		System.out.println(s.charAt(5));

	}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("entered string index not exists");
			e.printStackTrace();
		}
	}

}
