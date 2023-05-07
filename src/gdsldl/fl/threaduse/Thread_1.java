package gdsldl.fl.threaduse;
/**
 * @author FL
 * @version 2023年4月6日上午8:14:49
 */
//用Thread子类对象创建线程
public class Thread_1 {
	public static void main(String args[]) { 
		SpeakHello objThread1=new SpeakHello() ;
		SpeakNihao objThread2=new SpeakNihao(); 
		objThread1.start(); //调用对象的run()
		objThread2.start(); 
		for(int i=1;i<=15;i++) 
		 System.out.print("大家好"+i+" ");
		 }

}

class SpeakNihao extends Thread { //编写Thread子类
	 public void run() { //线程运行方法 
	 for(int i=1;i<=20;i++) System.out.print("您好"+i+" ");
	 } 
	}
	class SpeakHello extends Thread { //编写Thread子类
	 public void run() { //线程运行方法
	 for(int i=1;i<=20;i++) System.out.print("hello"+i+" ");
	 } 
	}