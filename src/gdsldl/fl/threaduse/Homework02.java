package gdsldl.fl.threaduse;
/**
 * @author:FL
 * @version: 2023年4月8日下午7:11:07
*/
public class Homework02 {
public static void main(String[] args) {
	Thread t1 = new Thread(new card());
	Thread t2 = new Thread(new card());
	
	t1.start();
	t2.start();
}
}

class card implements Runnable{
	private static int sum = 10000;
	public synchronized void getMoney() {
		if(sum < 0) return;
		
		sum -= 1000;
	}
	@Override
	public void run() {
		getMoney();
		System.out.println(sum);
	}
	
}
