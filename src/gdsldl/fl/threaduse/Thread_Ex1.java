package gdsldl.fl.threaduse;
/**
 * @author FL
 * @version 2023��4��6������8:43:49
 */
//ģ������Ʊ������Ʊ
public class Thread_Ex1 {
public static void main(String[] args) {
	Thread thread1 = new Thread(new Window1(),"����1");
	Thread thread2 = new Thread(new Window2(),"����2");
	thread1.start(); //���ö����run()
	thread2.start(); //���ö����run()
	for(int i=1;i<=15;i++) 
	 System.out.println(Thread.currentThread().getName()+"��Ʊ��"+i+" ");
	 
}
}

class Window1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++) 
			 System.out.println(Thread.currentThread().getName()+"��Ʊ��"+i+" ");
	}
	
}
class Window2 implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++) 
			System.out.println(Thread.currentThread().getName()+"��Ʊ��"+i+" ");
	}
	
}