package gdsldl.fl.threaduse;
/**
 * @author FL
 * @version 2023��4��6������9:08:20
 */
//�̹߳���ķ�������sleep()
public class Thread_5 {
	public static void main(String[] args) throws 
	Exception{
	 MyThread thread = new MyThread();
	 thread.start();//�������̵߳�run()
	 try{
	 System.out.println("2����������߳�");
	 Thread.sleep(2500);
	 }catch (InterruptedException e){
		 System.out.println("���̱߳���;����");
	 }
	 thread.interrupt();
	 //ʹ��interrupt()�������Ի���˯�ߵ��߳�
	 }
}

class MyThread extends Thread{
	 @Override
	 public void run(){
	 try{
	 System.out.println("���߳�׼��˯��60��");
	 Thread.sleep(60000);
	 System.out.println("���߳�˯�����");
	 }
	 catch (InterruptedException e){
		 //��˯�ߵ��̱߳�interrupt()��������ʱ����InterruptedException�쳣
	 System.out.println("���̱߳���;����");
	 }
	 } 
	}