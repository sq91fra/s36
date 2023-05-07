package gdsldl.fl.threaduse;
/**
 * @author FL
 * @version 2023年4月6日上午8:41:24
 */
public class Thread_4 {
	public static void main(String args[]) { 
		Thread t1=new Thread(new SpeakHello3(),"线程2");//通过第二个参数设置线程名称
		t1.start(); //调用对象的run()
		for(int i=1;i<=15;i++) 
		 System.out.println(Thread.currentThread().getName()+"大家好"+i+" ");
		 }

}

class SpeakHello3 implements Runnable{ //编写Thread子类
	 @Override
	 public void run() { //线程运行方法
	 for(int i=1;i<=20;i++) 
	 System.out.println(Thread.currentThread().getName()+"hello"+i+" ");
	 } 
	}