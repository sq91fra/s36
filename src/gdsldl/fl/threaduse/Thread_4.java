package gdsldl.fl.threaduse;
/**
 * @author FL
 * @version 2023��4��6������8:41:24
 */
public class Thread_4 {
	public static void main(String args[]) { 
		Thread t1=new Thread(new SpeakHello3(),"�߳�2");//ͨ���ڶ������������߳�����
		t1.start(); //���ö����run()
		for(int i=1;i<=15;i++) 
		 System.out.println(Thread.currentThread().getName()+"��Һ�"+i+" ");
		 }

}

class SpeakHello3 implements Runnable{ //��дThread����
	 @Override
	 public void run() { //�߳����з���
	 for(int i=1;i<=20;i++) 
	 System.out.println(Thread.currentThread().getName()+"hello"+i+" ");
	 } 
	}