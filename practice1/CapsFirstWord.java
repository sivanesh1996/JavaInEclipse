package practice1;

public class CapsFirstWord {

	public static void main(String[] args) {
		String s="hello from bsnl";
		char c[]=s.toCharArray();
		
		if(c[0]>='a')
			c[0]=(char)(c[0]-32);
		else if(c[0]<='Z')
			c[0]=c[0];
		
		for(int i=0;i<s.length();i++) {
			if(c[i]==' ')
				c[i+1]=(char)(c[i+1]-32);
		}
		
		System.out.println(c);

	}

}
