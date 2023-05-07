package gdsldl.fl.generic;

import java.util.ArrayList;

/**
 * @author:FL
 * @version: 2023年3月22日上午10:08:29
*/
@SuppressWarnings("all")
public class Generic01 {

public static void main(String[]  args) {
	/**在ArrayList中，添加3个Dog对象
Dog对象含有name和age,并输出name和age*/
	 ArrayList list = new ArrayList();
	 list.add(new Dog("大黄", 6));
	 list.add(new Dog("大黑", 6));
	 list.add(new Dog("小白", 6));
//	 如果加入了其他类型
//	 编译器发现不了问题
	 list.add(new Cat("小花", 6));

//	 遍历
	 for (Object o : list) {
//		向下转型
		 Dog dog = (Dog) o;
		 System.out.println( dog.name+"-" +dog.age );
	}
}
}

class Dog{
	public String name;
	public int age;
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
}
class Cat{
	public String name;
	public int age;
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
}