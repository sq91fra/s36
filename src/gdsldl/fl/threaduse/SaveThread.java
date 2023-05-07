package gdsldl.fl.threaduse;
/**
 * @author:FL
 * @version: 2023年4月8日下午10:15:48
*/
public class SaveThread {
public static void main(String[] args) throws InterruptedException {
	Thread t  = new Thread(new ST());
	t.setDaemon(true);//将线程设置为守护线程
//	当用户线程结束，守护线程也会结束
	t.start();
	for (int i = 0; i < 9; i++) {
		Thread.sleep(1000);
		System.out.println("纯爱战士在工作...");
	}
	System.out.println("纯爱战士把黄毛鲨了...");
}
}

class ST implements Runnable{

	@Override
	public void run() {
		while(true) {
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("黄毛来了...");
			
		}
	}
	
}
