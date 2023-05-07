package gdsldl.fl.generic;

import java.util.Arrays;

/**
 * @author:FL
 * @version: 2023年4月10日下午5:36:54
*/
@SuppressWarnings("all")
public class CustomGeneric {
public static void main(String[] args) {
//	1．Tiger 后面泛型，所以我们把 Tiger 就称为自定义泛型类
//	2. A,B,C泛型的标识符，一般是单个大写字母
//	3．泛型标识符可以有多个．
//	4．普通成员可以使用泛型（属性、方法）
Tiger<Double,String,Integer> g = new Tiger<>("john");
g.setA(10.9);
//g.setA("yy");//error,因为已经制定A为Double类型
System.out.println(g);

Tiger g2 = new Tiger("john...");//A,B,C默认为Object
g2.setA("yy");
System.out.println("g2 = " + g2);
}
}

class Tiger<A,B,C>{
	String name;
	private A a;
	private B b;
	private C c;
//	5．使用泛型的数组，不能初始化,但是可以定义
//	因为数组不能确定T的类型，就无法在内存开空间
//	C[] cs1 = new C[6];
	C[] cs2;
	
	public Tiger(String name) {
	super();
	this.name = name;
}

	public Tiger(String name, A a, B b, C c) {//构造器使用泛型（属性、方法）
		super();
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Tiger [name=" + name + ", a=" + a + ", b=" + b + ", c=" + c + ", cs2="
				+ (cs2 != null ? Arrays.asList(cs2).subList(0, Math.min(cs2.length, maxLen)) : null) + "]";
	}
	
//	6. 静态方法或属性不能使用泛型
//	因为静态与类加载相关，在类加载时，对象还没有创建
//	static C c2;
	
}
