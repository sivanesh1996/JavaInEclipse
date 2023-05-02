package prep;

public class CapsFirstWord {

	public static void main(String[] args) {
		String s="hello iam siva";
		char c[]=s.toCharArray();
		int i=0;
	
		
		while(i<c.length) {
			
			if(c[0]>='a')
				c[0]=(char)(c[0]-32);
			else if(c[0]<='Z')
				c[0]=c[0];
			if(c[i]==' ') {
				c[i+1]=(char)(c[i+1]-32);
				}
			i++;
		}

		System.out.println(c);
	}

}
