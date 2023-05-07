package gdsldl.fl.threaduse;
/**
 * @author:FL
 * @version: 2023年4月9日上午10:54:42
*/
@SuppressWarnings("all")
public class SellTicket {
public static void main(String[] args) {
	ST1 st1 = new ST1();
	ST2 st2 = new ST2();
	 new Thread(st2,"t1").start();
	  new Thread(st2,"t2").start();
	  new Thread(st2,"t3").start();
//	Thread t1 =  new Thread(st1);
//	Thread t2 =  new Thread(st1);
//	Thread t3 =  new Thread(st1);
	

}
}

class ST1 implements Runnable{
	private static int ticket = 10000;
	private  boolean loop = true;
	@Override
	public synchronized void run() {//在方法上上锁
//		不合理，在方法上上锁导致只有一个方法执行
		while (loop) {
			if (ticket <= 0) {
				System.out.println("售票结束...");
				break;
			}
			System.out.println(Thread.currentThread().getName()+"买了一张票,剩余票数为"+(--ticket));
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
class ST2 implements Runnable{
	public int ticket = 100000;
	private  boolean loop = true;
	public synchronized void m() {
		//在代码块上面写synchronize，同步代码块
//		synchronized (this) {
			if (ticket <= 0) {
				System.out.println("售票结束...");
				loop = false;
				return;
			}
			try {
				Thread.sleep(10);
				System.out.println(Thread.currentThread().getName()+"买了一张票,剩余票数为"+(--ticket));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//		}
		
	}
	@Override
	public  void run() {//在方法上上锁
		while (loop) {
			m();
		}
	}
	
}
