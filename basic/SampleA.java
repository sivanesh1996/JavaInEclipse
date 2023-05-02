package basic;

public class SampleA {

	protected void run() {
		System.out.println("SampleA");
	}
}

class SampleB extends SampleA{
	public void run() {
		System.out.println("SaampleB");
	}
	
	public static void main(String[] args) {
		SampleB obj=new SampleB();
		obj.run();
	}
}
