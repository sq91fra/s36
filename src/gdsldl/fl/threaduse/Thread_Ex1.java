package gdsldl.fl.threaduse;
/**
 * @author FL
 * @version 2023年4月6日上午8:43:49
 */
//模拟多个售票窗口售票
public class Thread_Ex1 {
public static void main(String[] args) {
	Thread thread1 = new Thread(new Window1(),"窗口1");
	Thread thread2 = new Thread(new Window2(),"窗口2");
	thread1.start(); //调用对象的run()
	thread2.start(); //调用对象的run()
	for(int i=1;i<=15;i++) 
	 System.out.println(Thread.currentThread().getName()+"售票中"+i+" ");
	 
}
}

class Window1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++) 
			 System.out.println(Thread.currentThread().getName()+"售票中"+i+" ");
	}
	
}
class Window2 implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++) 
			System.out.println(Thread.currentThread().getName()+"售票中"+i+" ");
	}
	
}