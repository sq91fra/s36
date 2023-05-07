package gdsldl.fl.threaduse;
/**
 * @author:FL
 * @version: 2023年4月6日下午9:43:25
*/
public class Thread_Exit {
public static void main(String[] args) {
	T t = new T();
	t.start();
	
	System.out.println("main线程休眠10s...");
	
	try {
		Thread.sleep(10*1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	t.setLoop(false);
}
}

class T extends Thread{
	int count  = 0;
	boolean loop = true;
	@Override
	public void run() {
		while (loop) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println("线程t运行中..."+ (++count));
		}
	}
	public void setLoop(boolean loop) {
		this.loop = loop;
	}
	
}