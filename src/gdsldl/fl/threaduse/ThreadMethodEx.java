package gdsldl.fl.threaduse;
/**
 * @author:FL
 * @version: 2023年4月8日下午8:22:16
*/
public class ThreadMethodEx {
public static void main(String[] args) throws InterruptedException {
	Thread t = new Thread(new TME());
	
	for (int i = 0; i < 10; i++) {
		Thread.sleep(1000);
		System.out.println( "hi" + (i+1) );
		if (i == 4) {
			t.start();
			t.join();
		}
	}
	System.out.println("主线程结束...");
}
}

class TME implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("hello" + (i+1) );
		}
		System.out.println("子线程结束...");
	}
	
}