package gdsldl.fl.threaduse;
/**
 * @author FL
 * @version 2023年4月6日上午9:26:25
 */
/**
 * 有一个线程ThreadA正在运行，用户希望插入一个线程ThreadB，并且要求线程
ThreadB执行完毕，然后再继续线程ThreadA，此时可以使用到ThreadB对象.join()
方法
 */
public class Thread_6 {
	public static void main(String[] args) {
		ThreadA a=new ThreadA();
		a.start();
		}
}

class ThreadA extends Thread{
	ThreadB b;

	public void run() {
		b=new ThreadB();
		 b.start(); 
		 try {
		 b.join();
		 // ThreadA线程要等ThreadB线程执行完毕后才能继续执行
		} catch (InterruptedException e) {
		 e.printStackTrace();
		}

		for (int i = 0; i < 50; i++) {
			System.out.println(i+"线程A运行中...");
		}
	}
}
class ThreadB extends Thread{
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i+"线程B运行中...");
		}
	}
}