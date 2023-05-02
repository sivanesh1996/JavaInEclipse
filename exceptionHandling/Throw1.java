package exceptionHandling;

public class Throw1 {

	void age(int x) throws NegativeException
	{
		int age=x;
		if(age<0)
		throw new NegativeException("hi");
		else
			System.out.println("eligible for vote");
	
		
	}
	public static void main(String[] args) throws NegativeException {
		
		Throw t=new Throw();
		
		t.age(-1);

	
		

}
}
