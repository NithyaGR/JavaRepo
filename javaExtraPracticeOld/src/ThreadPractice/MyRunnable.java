package ThreadPractice;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		
		for(int i=1; i<=100; i++){
			System.out.println("In MyRunnable "+i);
		}
		
	}

}
