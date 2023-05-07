package gdsldl.fl.threaduse;
/**
 * @author:FL
 * @version: 2023年4月6日下午8:26:05
*/
public class Thread_Ex2 {
public static void main(String[] args) {
	/*编写一个程序，创建两个线程，
	一个线程每1秒输出hello，world，输出10次退出
	一个线程每一秒输出hi输出5次退出*/
	
	new Thread1().start();
	
	Thread thread2 = new Thread(new Thread2());
	thread2.start();
}
}

class Thread1 extends Thread{
	@Override
	public void run() {
		int i = 0;
		while(i<10){
			try {
				sleep(1000);
				System.out.println("hello,world");
				i++;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("?");
			}
		}

	}
}

class Thread2 implements Runnable{

	@Override
	public void run() {
		
		int i = 0;
		while(i<5){
			try {
				Thread.sleep(1000);
				System.out.println("hi");
				i++;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("?");
			}
		}
	}
	
}
