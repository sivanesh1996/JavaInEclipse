package string;

public class ObjectClass {

	public static void main(String[] args) {
		ObjectClass obj=new ObjectClass();
		ObjectClass obj1=new ObjectClass();
		System.out.println(obj.hashCode());
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		String s=new String("Siva");
	    System.out.println(s.hashCode());
	    System.out.println(s.hashCode());
	    String a=new String("hi");
	    System.out.println(a.hashCode());
	}

}	
