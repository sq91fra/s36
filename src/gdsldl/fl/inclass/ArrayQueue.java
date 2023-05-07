package gdsldl.fl.inclass;

public class ArrayQueue {
	private int[] array;
	private int maxSize;
	private int frontPoint, rearPoint;
//初始化队列
	public ArrayQueue(int maxSize) {
		// TODO Auto-generated constructor stub
		this.maxSize = maxSize;
		array = new int[maxSize];//初始化数组
		
		frontPoint = -1;//初始化指针
		rearPoint = -1;
	}
	
//	判断队列是否已满
	public boolean isFull() {
		return rearPoint == maxSize -1;
	}
	
	//判断队列是否为空
	public boolean isEmpty() {
		return rearPoint == frontPoint;
	}
	
//	添加元素进入队列
	public void add(int n) {
		if (isFull()) {
			System.out.println("队列已满...");
			return;
		}
		rearPoint++;
		array[rearPoint] = n;//从队尾添加元素
	}

//	获取队列元素并且删除元素
	public int get() {
		if(isEmpty()) {
			throw new RuntimeException("空队列...");
		}
		frontPoint++;
		return array[frontPoint];
	}
	
//	查看队列中的所有元素
	public void list() {
		if (isEmpty()) {
			throw new RuntimeException("空队列，无元素...");
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("队列中第"+(i+1)+"个元素是："+array[i]);
		}
	}
//	查看队列第一个参数
	public int front() {
		if (isEmpty()) {
			throw new RuntimeException("空队列，无元素...");
		}
		
		return array[frontPoint+1];
	}

	
	
}

