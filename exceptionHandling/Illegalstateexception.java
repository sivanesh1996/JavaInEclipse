package exceptionHandling;

public class Illegalstateexception extends Thread {
	
	public void run()
	{
		System.out.println("Iam running");
	}

	public static void main(String[] args) {
		Illegalstateexception il=new Illegalstateexception();
		il.start();
		try {
		System.out.println("going to start again");
		
		il.start();
	}
		catch(IllegalStateException e) {
			System.out.println("Thread cannot be started again");
			e.printStackTrace();
		}
	}

}
