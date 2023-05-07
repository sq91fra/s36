package gdsldl.fl.threaduse;
/**
 * @author FL
 * @version 2023年4月6日上午9:08:20
 */
//线程挂起的方法——sleep()
public class Thread_5 {
	public static void main(String[] args) throws 
	Exception{
	 MyThread thread = new MyThread();
	 thread.start();//调用子线程的run()
	 try{
	 System.out.println("2秒半后叫醒子线程");
	 Thread.sleep(2500);
	 }catch (InterruptedException e){
		 System.out.println("子线程被中途叫醒");
	 }
	 thread.interrupt();
	 //使用interrupt()方法可以唤醒睡眠的线程
	 }
}

class MyThread extends Thread{
	 @Override
	 public void run(){
	 try{
	 System.out.println("子线程准备睡眠60秒");
	 Thread.sleep(60000);
	 System.out.println("子线程睡眠完毕");
	 }
	 catch (InterruptedException e){
		 //当睡眠的线程被interrupt()方法唤醒时触发InterruptedException异常
	 System.out.println("子线程被中途叫醒");
	 }
	 } 
	}