package gdsldl.fl.generic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author:FL
 * @version: 2023年4月9日下午4:51:25
*/
public class Generic_Ex1 {
public static void main(String[] args) {
	Student student1 = new Student("张三", 6);
	Student student2 = new Student("李四", 6);
	Student student3 = new Student("三张", 6);
//	使用泛型，给hashSet放入3个学生
	HashSet<Student> set = new HashSet<Student>();
	set.add(student1);
	set.add(student2);
	set.add(student3);
	
//	增强for遍历
	for (Student student : set) {
		System.out.println(student);
	}

//	使用泛型，给hashMap放入3个学生	
	HashMap<String, Student> map = new HashMap<String,Student>();
	map.put("zs", student1);
	map.put("ls", student2);
	map.put("sz", student3);
//	用迭代器遍历?
	Set<Entry<String, Student>> entry = map.entrySet();
	Iterator<Entry<String, Student>> iterator =  entry.iterator();
	System.out.println("=========");
	while (iterator.hasNext()) {
		Map.Entry<String, Student> next = iterator.next();
		System.out.println(next.getKey() + "-" + next.getValue());
	}
}
}

class Student{
	public String name;
	public int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}