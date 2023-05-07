package gdsldl.fl.threaduse;
/**
 * @author FL
 * @version 2023年4月6日上午8:36:26
 */
//给用Thread创建的线程设置名称
public class Thread_3 {
	public static void main(String args[]) { 
//		给SpeakNihao2命名为线程一
		SpeakNihao2 objThread2=new SpeakNihao2("线程1"); 
		objThread2.start(); 
		for(int i=1;i<=15;i++) 
		 System.out.println(Thread.currentThread().getName()+"大家好"+i+" ");
		}
}

class SpeakNihao2 extends Thread { //编写Thread子类
public SpeakNihao2(String name) {//通过构造函数设置线程名称
super(name);//调用父类的构造函数实现对线程名称赋值
setName(name);//等价于上面的语句，作用是给线程设置名称
}
@Override
public void run() { //线程运行方法 
 for(int i=1;i<=20;i++) 
	//Thread.currentThread().getName()获取当前线程的名称
 System.out.println(Thread.currentThread().getName()+"您好"+i+" ");
} 
}