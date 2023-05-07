package gdsldl.fl.threaduse;
/**
 * @author FL
 * @version 2023��4��6������8:29:19
 */
public class Thread_2 {
	public static void main(String args[]) {
		SpeakHello1 s1 =new SpeakHello1();
		Thread objThread1=new Thread(s1);//创建线程对象
		Thread objThread2=new Thread(s1);//创建线程对象
		objThread1.start(); //调用SpeakHello的run()
		objThread2.start(); //调用SpeakNihao的run() 
		for(int i=1;i<=15;i++) 
		 System.out.print("大家好"+i+" ");
		 }
}

class SpeakNihao1 implements Runnable { //编写类实现Runnable接口
	 public void run() { //线程运行方法 
	 for(int i=1;i<=20;i++) System.out.print("您好"+i+" ");
	 }
	}
class SpeakHello1 implements Runnable { //编写类实现Runnable接口
	 public void run() { //线程运行方法
	 for(int i=1;i<=20;i++) System.out.print("hello"+i+" ");
	}
}