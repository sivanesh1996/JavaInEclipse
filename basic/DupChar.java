package basic;

public class DupChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]= {'a','b','c','d','c','a'}; // 0 1 2 3 4 5
//		case 1:5-0=5  case 2:4-2=2
		int ar[]=new int[ch.length];
		int k=0;
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					
					ar[k]=j-i;
					//System.out.println("First duplicate element:"+ch[i]);
					
				}
			}
			
			 {
				
			}
			
		
			
		}

	}

}
