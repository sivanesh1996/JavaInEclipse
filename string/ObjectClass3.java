package string;

public class ObjectClass3 {
	
	String name;
	int age;
	ObjectClass3(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}

	public static void main(String[] args) {
		
		ObjectClass3 obj=new ObjectClass3("Siva",27);
		ObjectClass3 obj1=new ObjectClass3("Guru",26);
		System.out.println(obj);
        System.out.println(obj1);
	}

	@Override
	public String toString() {
		return "Name:"+name +"\nAge:"+age;
	}

}
