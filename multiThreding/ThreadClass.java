package multiThreding;

public class ThreadClass extends Thread {
	
	public void run()
	{
		System.out.println("Iam run method");
		
		for(int i=0;i<5;i++) {
			System.out.print(i);
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		
		
		int a=Thread.MAX_PRIORITY;
		int b=Thread.MIN_PRIORITY;
		int c=Thread.NORM_PRIORITY;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		Thread d=Thread.currentThread();
		System.out.println(d);  //printing thread main obj
		System.out.println(d.getName());
		System.out.println(d.getPriority());
		
		ThreadClass obj=new ThreadClass();
		ThreadClass obj1=new ThreadClass();
				
        obj.start();
        obj1.start();
		obj.join();
		
		System.out.println(obj1); // printing thread obj
		System.out.println(obj.getName()); 
		System.out.println("sivanesh");
		System.out.println(obj1);
		
	

	}

}
