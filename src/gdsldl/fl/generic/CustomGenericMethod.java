package gdsldl.fl.generic;
/**
 * @author:FL
 * @version: 2023年4月11日上午10:42:54
*/
public class CustomGenericMethod {
public static void main(String[] args) {
	Car car = new  Car();
	car.fly("", 0);
	car.fly(null, 0.1);//泛型方法不能传入null
	
}
}

class Car{//普通类
	public void run() {//普通方法
	}
	public <A,B> void fly(A a, B b) {//泛型方法
		System.out.println("------------------");
		System.out.println(a.getClass());
		System.out.println(b.getClass());
	}
}

class Air<A,B>{//泛型类
	public void run() {//普通方法
	}
	public  void fly(A a, B b) {//泛型方法
	}
}

class Fish<A,B>{
	public<K> void hello( A a, K k) {
		System.out.println(a.getClass()); System.out.println(k.getClass()); 
		}
}
