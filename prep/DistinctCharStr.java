package prep;

public class DistinctCharStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="this is a string";
		char c[]=s.toCharArray();
		int r[]=new int[c.length];
	//	boolean flag=true;
		
		
		for(int i=0;i<s.length();i++) {
			int count=1;
			char ch=s.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				if(ch==s.charAt(j)) {
					count++;
					r[j]=-1;		
				}			
			}
			if(r[i]!=-1) {
				r[i]=count;
			}
						
		}
		
//		for(int o:r) {
//			System.out.print(o);
//		}
		for(int i=0;i<r.length;i++) {
		if(r[i]==1) {
			System.out.print(c[i]);
		}
		}
		

	}

}
