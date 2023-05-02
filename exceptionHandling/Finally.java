package exceptionHandling;

public class Finally {

	public static void main(String[] args) {
		int a=1;
		int b=1;
		
		try {
		System.out.println(a/1);
		
		try {
			System.out.println(a/b);
		}
		finally {
			System.out.println("hi");
		}
		}
		finally {
			System.out.println("Thanks for your precious time");
		}
		
		
	}

}
