package pattern;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int i=65;
//		char c=(char)i;
//		System.out.println(c);
		
		for(int i=65;i<=68;i++) {
			for(int j=65;j<=i;j++) {
				System.out.print((char)j);
			}
			
			System.out.println();
		}

	}

}
