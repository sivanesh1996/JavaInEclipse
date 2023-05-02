package exceptionHandling;

public class NullPointerException  {

	public static void main(String[] args) throws Exception {
		NullPointerException obj=new NullPointerException();
		obj.display();
		
			//System.out.println(" program attempts to use an object reference that has the null value. ");
		

}

	private void display() throws Exception{
		// TODO Auto-generated method stub
	String i=null;
	String m="20";
	int s=i.length();
    System.out.println("hi");
		
		
	}
}
