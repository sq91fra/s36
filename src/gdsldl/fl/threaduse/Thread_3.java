package gdsldl.fl.threaduse;
/**
 * @author FL
 * @version 2023��4��6������8:36:26
 */
//����Thread�������߳���������
public class Thread_3 {
	public static void main(String args[]) { 
//		��SpeakNihao2����Ϊ�߳�һ
		SpeakNihao2 objThread2=new SpeakNihao2("�߳�1"); 
		objThread2.start(); 
		for(int i=1;i<=15;i++) 
		 System.out.println(Thread.currentThread().getName()+"��Һ�"+i+" ");
		}
}

class SpeakNihao2 extends Thread { //��дThread����
public SpeakNihao2(String name) {//ͨ�����캯�������߳�����
super(name);//���ø���Ĺ��캯��ʵ�ֶ��߳����Ƹ�ֵ
setName(name);//�ȼ����������䣬�����Ǹ��߳���������
}
@Override
public void run() { //�߳����з��� 
 for(int i=1;i<=20;i++) 
	//Thread.currentThread().getName()��ȡ��ǰ�̵߳�����
 System.out.println(Thread.currentThread().getName()+"����"+i+" ");
} 
}