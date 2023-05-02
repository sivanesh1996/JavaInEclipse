package stringBuffer;

public class Practice3 {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Siva");
		s.insert(0, 'V');
		System.out.println(s);
		
		s.replace(0, 3, "ja");//including 0 excluding 3
		System.out.println(s);
		

	}

}
