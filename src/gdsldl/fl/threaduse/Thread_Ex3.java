package gdsldl.fl.threaduse;
/**
 * @author:FL
 * @version: 2023年4月6日下午8:54:53
*/
public class Thread_Ex3 {
public static void main(String[] args) {
//	Sell1 sell1 = new Sell1();
//	Sell1 sell2 = new Sell1();
//	Sell1 sell3 = new Sell1();
//
//	sell1.start();
//	sell2.start();
//	sell3.start();
	
	Sell2 sell4 = new Sell2();
	new Thread(sell4).start();
	new Thread(sell4).start();
	new Thread(sell4).start();
}
}

class Sell1 extends Thread{
	public static int res = 100;//用static，使三个线程都可操作res
	@Override
	public  void run() {
		while (true) {
			if(res <=0) {
				System.out.println(Thread.currentThread().getName()+"售票结束...");
				break;
			}
			try {
				System.out.println(Thread.currentThread().getName()+"卖了一张票，剩余票数:" + (--res));
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
class Sell2 implements Runnable{
	public static int ticket = 100;
	private  boolean loop = true;
	private synchronized void m() {
		if (ticket <= 0) {
			System.out.println("售票结束...");
			loop = false;
			return;
		}
		try {
			Thread.sleep(50);
			System.out.println(Thread.currentThread().getName()+"买了一张票,剩余票数为"+(--ticket));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public  void run() {//在方法上上锁
		while (loop) {
			m();
		}
	}
}


