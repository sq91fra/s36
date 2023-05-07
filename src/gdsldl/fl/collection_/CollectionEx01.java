package gdsldl.fl.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author:FL
 * @version: 2023年3月22日下午10:35:26
*/
public class CollectionEx01 {
@SuppressWarnings("all")
public static void main(String[] args) {
//	1. 创建 3个 Dog{name,age} 对象，放入ArrayList中，赋给List引用
	Dog dog1 =new Dog("哈士奇", 6);
	Dog dog2 =new Dog("泰迪", 7);
	Dog dog3 =new Dog("中华田园犬", 8);
	List list = new ArrayList();
	list.add(dog1);
	list.add(dog2);
	list.add(dog3);
	//	2. 分别使用迭代器和增强for遍历
	Iterator iterator = list.iterator();//迭代器遍历
	System.out.println("迭代器:");
	while (iterator.hasNext()) {
		Object obj = (Object) iterator.next();
		System.out.println("dog = " + obj);
	}
	System.out.println("增强for:");
	for (Object obj : list) {
		System.out.println("dog = " + obj);
	}
//	3. 重写Dog 的toString方法，输出name和age
}
}

class Dog{
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
}
