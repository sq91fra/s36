package gdsldl.fl.inclass;

public class ArrayQueue {
	private int[] array;
	private int maxSize;
	private int frontPoint, rearPoint;
//��ʼ������
	public ArrayQueue(int maxSize) {
		// TODO Auto-generated constructor stub
		this.maxSize = maxSize;
		array = new int[maxSize];//��ʼ������
		
		frontPoint = -1;//��ʼ��ָ��
		rearPoint = -1;
	}
	
//	�ж϶����Ƿ�����
	public boolean isFull() {
		return rearPoint == maxSize -1;
	}
	
	//�ж϶����Ƿ�Ϊ��
	public boolean isEmpty() {
		return rearPoint == frontPoint;
	}
	
//	���Ԫ�ؽ������
	public void add(int n) {
		if (isFull()) {
			System.out.println("��������...");
			return;
		}
		rearPoint++;
		array[rearPoint] = n;//�Ӷ�β���Ԫ��
	}

//	��ȡ����Ԫ�ز���ɾ��Ԫ��
	public int get() {
		if(isEmpty()) {
			throw new RuntimeException("�ն���...");
		}
		frontPoint++;
		return array[frontPoint];
	}
	
//	�鿴�����е�����Ԫ��
	public void list() {
		if (isEmpty()) {
			throw new RuntimeException("�ն��У���Ԫ��...");
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("�����е�"+(i+1)+"��Ԫ���ǣ�"+array[i]);
		}
	}
//	�鿴���е�һ������
	public int front() {
		if (isEmpty()) {
			throw new RuntimeException("�ն��У���Ԫ��...");
		}
		
		return array[frontPoint+1];
	}

	
	
}

