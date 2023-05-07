package gdsldl.fl.threaduse;
/**
 * @author:FL
 * @version: 2023年4月1日下午4:47:35
*/
public class Thread01 {
public static void main(String[] args) {
//	创建一个Cat对象，可以当线程使用
	Cat cat = new Cat();
	cat.start();//启动线程
	
	
}
}

class Cat extends Thread{
	@Override
	public void run() {
		int i = 0;
		while (i < 10) {
//			每隔1秒输出喵~
			System.out.println("喵~");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			i++;
		}
		
	}
}
