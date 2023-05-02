package practice;

public class CapsFirstWord {

	public static void main(String[] args) {
		String s="Iam a good boy";
		 s=s.toLowerCase();
		String s1="";
		char c[]=s.toCharArray();
		c[0]=(char)(c[0]-32);
		
		for(int i=0;i<s.length();i++) {
			
			if(c[i]==' ') {
				c[i+1]=(char)(c[i+1]-32);
			}
		}
	
		
		for(int k=0;k<c.length;k++) {
			//s1=s1+c[k];
			System.out.print(c[k]);
		}
	//	System.out.print(s1);

	}

}
