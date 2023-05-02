package practice;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="      h ello siva";
		System.out.println("before remove space:"+s);
		String d=s.replaceAll("\\s", "");
		System.out.println("after remove space:"+d);
		
		String s1=" hello bird";
		System.out.println("before trim:"+s1);
		String d1=s1.trim();
		System.out.println("after trim:"+d1);

	}

}
