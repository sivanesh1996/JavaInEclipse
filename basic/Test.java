package basic;

public class Test implements Test1,Test2{
	public void running() {
		System.out.println("iam running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.running();
		

	}

}
