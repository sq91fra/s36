package gdsldl.fl.threaduse;
/**
 * @author FL
 * @version 2023��4��6������9:26:25
 */
/**
 * ��һ���߳�ThreadA�������У��û�ϣ������һ���߳�ThreadB������Ҫ���߳�
ThreadBִ����ϣ�Ȼ���ټ����߳�ThreadA����ʱ����ʹ�õ�ThreadB����.join()
����
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
		 // ThreadA�߳�Ҫ��ThreadB�߳�ִ����Ϻ���ܼ���ִ��
		} catch (InterruptedException e) {
		 e.printStackTrace();
		}

		for (int i = 0; i < 50; i++) {
			System.out.println(i+"�߳�A������...");
		}
	}
}
class ThreadB extends Thread{
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i+"�߳�B������...");
		}
	}
}