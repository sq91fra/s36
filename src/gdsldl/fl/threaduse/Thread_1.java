package gdsldl.fl.threaduse;
/**
 * @author FL
 * @version 2023��4��6������8:14:49
 */
//��Thread������󴴽��߳�
public class Thread_1 {
	public static void main(String args[]) { 
		SpeakHello objThread1=new SpeakHello() ;
		SpeakNihao objThread2=new SpeakNihao(); 
		objThread1.start(); //���ö����run()
		objThread2.start(); 
		for(int i=1;i<=15;i++) 
		 System.out.print("��Һ�"+i+" ");
		 }

}

class SpeakNihao extends Thread { //��дThread����
	 public void run() { //�߳����з��� 
	 for(int i=1;i<=20;i++) System.out.print("����"+i+" ");
	 } 
	}
	class SpeakHello extends Thread { //��дThread����
	 public void run() { //�߳����з���
	 for(int i=1;i<=20;i++) System.out.print("hello"+i+" ");
	 } 
	}