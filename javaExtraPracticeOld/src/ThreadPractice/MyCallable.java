package ThreadPractice;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

	private int startNum, endNum;
	
	public MyCallable(int startNum, int endNum) {
		this.startNum = startNum;
		this.endNum = endNum;
	}
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for(int i=startNum;i<=endNum; i++){
			sum = sum+i;
		}
		return sum;
	}
	

}
