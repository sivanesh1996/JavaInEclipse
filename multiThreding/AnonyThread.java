package multiThreding;

public class AnonyThread {
	
	int in=900;
	/*synchronized */void credit()
	{
		System.out.println("Thread is coming in");
		for(int i=0;i<5;i++) {
		in=in+100;
		System.out.println(in);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		AnonyThread obj=new AnonyThread();
		
		Thread t=new Thread(new Runnable() {
			public void run() {
				System.out.println("Iam Thread:1");
				obj.credit();
			}
		});
		
		
		Thread t1=new Thread(new Runnable() {
			public void run() {
				System.out.println("Iam Thread:2");
				obj.credit();
			}
		});
		
		t.start();
		//t.join();
		t1.start();
		//t1.join();
		//System.out.println(obj.in);
	}

}
