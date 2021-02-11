package ThreadPractice;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		Thread t1 = new MyThread();
		t1.start();
		
		MyRunnable mr = new MyRunnable();
		Thread t2 = new Thread(mr);
		t2.start();
		
		try {
			//Thread.sleep(1000);
			t2.join();
			t1.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=1;i<=100;i++){
			System.out.println("In ThreadTest Main "+i);
		}
		
		//MyCallable mc = new MyCallable(1, 10000);
		
		
		
		
	}
	
	

}
