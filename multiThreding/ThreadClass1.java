package multiThreding;

public class ThreadClass1 implements Runnable {
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		ThreadClass1 st=new ThreadClass1();
		System.out.println(st);
		
		Thread t=new Thread(st);
		Thread t1=new Thread(st);
		t.start();
		t1.start();
		t.join();
		System.out.println(t);
		System.out.println(t1);
		
		

	}

}
