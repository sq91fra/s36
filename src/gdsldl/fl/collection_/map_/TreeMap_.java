package gdsldl.fl.collection_.map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author:FL
 * @version: 2023年4月5日上午10:43:35
*/
@SuppressWarnings({"all"})
public class TreeMap_ {
public static void main(String[] args) {
//	使用默认构造器，创建是无序的
//	TreeMap treeMap = new TreeMap();

	TreeMap treeMap = new TreeMap(new Comparator() {
	@Override
	public int compare(Object o1, Object o2) {
		// TODO 自动生成的方法存根
		return (int)o1 - (int)o2;//	按照主键大小排序
//		return ((String)o1).compareTo((String)o2);//按照k大小
	}
	});
	
	treeMap.put( 3,"张三");
	treeMap.put( 4,"李四");
	treeMap.put( 5,"王五");
	treeMap.put( 1,"肇一");
	
	System.out.println("treeMap = "+ treeMap);
}
}
