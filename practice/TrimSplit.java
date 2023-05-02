package practice;

public class TrimSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="  hello everyone";
		String[] sp=s.split(" ");
		String t=s.trim();
		int arr[]=new int[sp.length];
		
//		for(int i=0;i<sp.length;i++) {
//			System.out.println(sp[i]);
//		}
	System.out.println(t);
		for(int i=0;i<sp.length;i++) {
			
			int count=0;
			for(int j=0;j<sp[i].length();j++) {
		//	count++;
			arr[i]=++count;
			
		}
		
		
	}
		
		for(int i=0;i<sp.length;i++) {
			//System.out.println(sp[i] +" has " +arr[i] +" characters");
		}
	//	System.out.println(t);
}
}
