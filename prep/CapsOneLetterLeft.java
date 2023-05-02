package prep;

public class CapsOneLetterLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Balaraman";
		s=s.toLowerCase();
		char c[]=s.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			
			if(i%2==0)
				c[i]=(char)(c[i]-32);
			else
				c[i]=c[i];
		}
		
		s=new String(c);
		System.out.println(s);

	}

}
