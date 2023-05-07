package gdsldl.fl.generic;
/**
 * @author:FL
 * @version: 2023年4月9日下午4:32:31
*/
public class Generic03 {
public static void main(String[] args) {
	G3<String,Integer> g3 = new G3<String,Integer>("张三", 6);
	System.out.println(g3);
	System.out.println(g3.getClass());
}
}

//在类旁边加一个<E>(似乎)表示在该类定义一个泛型变量
//泛型的类型在创建该类的时候确定，E也可以是T，Q等
class G3<E,T>{
//	这里E会用定义时的类型替换
	 public E name;
	T age;
	
	public G3(E name, T age) {
		super();
		this.name = name;
		this.age = age;
	}
	public T getAge() {
		return age;
	}
	public void setAge(T age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "G3 [name=" + name + ", age=" + age + "]";
	}
	
}
