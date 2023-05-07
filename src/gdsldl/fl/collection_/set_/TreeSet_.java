package gdsldl.fl.collection_.set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author:FL
 * @version: 2023年4月4日下午12:26:27
*/
@SuppressWarnings({"all"})
public class TreeSet_ {
public static void main(String[] args) {
//	TreeSet treeSet = new TreeSet();
//	重写compare方法，自定义排序规则
	TreeSet treeSet = new TreeSet(new Comparator() {
		@Override
		public int compare(Object o1, Object o2) {
			return ((String) o1).compareTo((String) o2);
		}
	});

	for (int i = 0; i < 10; i++) {
		treeSet.add("hi"+i);
	}
	
	System.out.println("treeSet" +treeSet);
}
}
