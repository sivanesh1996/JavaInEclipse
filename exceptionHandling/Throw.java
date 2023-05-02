package exceptionHandling;

public class Throw {

	void age(int x) throws NegativeException
	{
		int age=x;
		if(age<0)
		throw new NegativeException("hi");
		else
			System.out.println("eligible for vote");
	
		
	}
	public static void main(String[] args) {
		
		Throw t=new Throw();
		try {
		t.age(-1);

	}
		catch(NegativeException e)
		{
		  System.out.println(e.getMessage());
		  e.printStackTrace();
		}

}
}
