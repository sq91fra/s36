package gdsldl.fl.inclass;

public class Java11 {
	public static void main(String[] args) {
		//调用Math类的show1()
		Math math = new Math();
		math.show1();
		//调用Math类的show2()
		Math.show2();

	}
}

class Math{
	public static int add(int a,int b) {
		return a+b;
	}
	public void show1() {
		
		int result=  add(1, 3) ;//调用同一个类的add方法，实现任意两个数相加
		System.out.println(result);
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public static void show2() {
		Math math = new Math();
		int result= math.sub(3,1)  ;//调用同一个类的sub方法，实现任意两个数相减
		System.out.println(result);
	}
}

