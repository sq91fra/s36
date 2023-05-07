package gdsldl.fl.inclass;

public class RunArrayQueue {
	public static void main(String[] args) {
		
		ArrayQueue array = new ArrayQueue(5);
		
		for (int i = 0; i < 5; i++) {
			array.add(i);
		}
		
		array.list();
	}

}
