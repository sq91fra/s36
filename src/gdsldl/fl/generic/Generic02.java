package gdsldl.fl.generic;

import java.util.ArrayList;

/**
 * @author:FL
 * @version: 2023年3月22日上午10:08:29
*/
@SuppressWarnings("all")
public class Generic02 {

public static void main(String[]  args) {
	/**在ArrayList中，添加3个Dog对象
Dog对象含有name和age,并输出name和age*/
	 ArrayList<Dog1> list = new ArrayList<Dog1>();
//	 在<>中放入类名，表示泛型
//	 以list为例，ArrayList<Dog1>表示只能放入Dog1类
	 list.add(new Dog1("大黄", 6));
	 list.add(new Dog1("大黑", 6));
	 list.add(new Dog1("小白", 6));
//	 编译错误，加不进去
//	 list.add(new Cat1("小花", 6));

//	 遍历
	 for (Dog1 o : list) {
//		不需要向下转型
//		 Dog dog = (Dog) o;
		 System.out.println( o.name+"-" +o.age );
	}
}
}

class Dog1{
	public String name;
	public int age;
	public Dog1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
}
class Cat1{
	public String name;
	public int age;
	public Cat1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
}