package gdsldl.fl.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author:FL
 * @version: 2023年3月22日下午10:16:48
*/
public class CollectionFor {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		Collection col = new ArrayList();
		
		col.add(new Book("张三",66,"张三的传奇一生"));
		col.add(new Book("曹雪芹",36,"红楼梦"));
		col.add(new Book("蔡徐坤",55,"偶像练习生指南"));
		
//		使用增强for遍历Collection(底层依然还是迭代器)
		for (Object book : col) {
			System.out.println("book = "+ book);
		}
//		增强for也可以遍历数组
		int[] arr = {1,2,5,1,4,0};
		for (int i : arr) {
			System.out.println("i = "+ i);
		}
		
	}
}
