package practice;

public class CapsFirstWord1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hello iam siva";
		char c[]=s.toCharArray();
		if(c[0]>='a' && c[0]<='z')
			c[0]=(char) (c[0]-32);
			
			else
				c[0]=c[0];

		int i=1;
		
		while(i<c.length) {
			if((c[i]==' ') && (c[i+1]>='a' && c[i+1]<='z'))
				c[i+1]=(char) (c[i+1]-32);
			else
				c[i]=c[i];	
			i++;
		}
		
		for(char o:c) {
			System.out.print(o);
		}

	}

}
