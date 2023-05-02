package string;

public class ObjectClass4 {

	public static void main(String[] args) {
		ObjectClass4 obj=new ObjectClass4();
		ObjectClass4 obj1=new ObjectClass4();
		System.out.println("1:"+obj.equals(obj1));
        System.out.println("2:"+(obj==obj1));
        
        String s=new String("Siva");
        String s1=new String("Siva");
        String s2=s1;
        System.out.println("3:"+s1);
        System.out.println("4:"+s.equals(s1));
        System.out.println("5:"+s==s1);
        System.out.println("6:"+s1.equals(s2));
        System.out.println("7:"+s1==s2);
	}

}
