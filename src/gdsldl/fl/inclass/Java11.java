package gdsldl.fl.inclass;

public class Java11 {
	public static void main(String[] args) {
		//����Math���show1()
		Math math = new Math();
		math.show1();
		//����Math���show2()
		Math.show2();

	}
}

class Math{
	public static int add(int a,int b) {
		return a+b;
	}
	public void show1() {
		
		int result=  add(1, 3) ;//����ͬһ�����add������ʵ���������������
		System.out.println(result);
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public static void show2() {
		Math math = new Math();
		int result= math.sub(3,1)  ;//����ͬһ�����sub������ʵ���������������
		System.out.println(result);
	}
}

