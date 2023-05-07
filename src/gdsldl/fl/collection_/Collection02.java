package gdsldl.fl.collection_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author:FL
 * @version: 2023年3月22日上午11:31:28
*/
public class Collection02 {
	@SuppressWarnings({"all"})
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(new Book("张三",66,"张三的传奇一生"));
	list.add(new Book("曹雪芹",36,"红楼梦"));
	list.add(new Book("蔡徐坤",55,"偶像练习生指南"));
	Iterator iterable = list.iterator();
//	idea提示所有快捷键的键：ctrl+j
//	生成迭代器快捷键：idea:itit ;eclipse:while+提示
	while (iterable.hasNext()) {
		Object object = (Object) iterable.next();
		System.out.println("obj=" + object);
	}
//退出while循环后，这时迭代器指向最后一个元素	
//	iterable.next();error
//	如果想再次变量，需要重置迭代器
	iterable = list.iterator();
	System.out.println("第二次：");
	while (iterable.hasNext()) {
		Object object = (Object) iterable.next();
		System.out.println("obj=" + object);
	}
}
}

class Book{
	private String name;
	private double price;
	private String author;
	
	public Book(String name, double price, String author) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + "]";
	}
	
}
