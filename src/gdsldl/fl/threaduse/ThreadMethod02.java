package gdsldl.fl.threaduse;
/**
 * @author:FL
 * @version: 2023年4月8日下午8:07:03
*/
public class ThreadMethod02 {
public static void main(String[] args) throws InterruptedException {
	T2 t2 = new T2();
	t2.start();
	
	for (int i = 0; i < 15; i++) {
		Thread.sleep(500);
		System.out.println("小弟吃了"+ (i+1)+ "包子");
		if (i == 5) {
			System.out.println("小弟让老大先吃...");
//			t2.join();
			Thread.yield();//礼让，不一定成功
			System.out.println("老大吃完，小弟接着吃...");
		}
	}
}
}

class T2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println("老大吃了"+ (i+1)+ "包子");
		}
	}
}
