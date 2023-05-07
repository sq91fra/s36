package gdsldl.fl.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:FL
 * @version: 2023年3月22日上午10:40:39
*/
public class Collection01 {
	@SuppressWarnings({"all"})
	public static void main(String[] args) {
		List list = new ArrayList();
//		add
		list.add("jack");
		list.add(6);
		list.add(true);
		System.out.println("list = "+ list);
//		remove
		list.remove(0);//删除第一个元素
		list.remove("jack");//指定删除
		System.out.println("list = "+ list);
//		contains:查找元素是否存在，返回boolean
		System.out.println(list.contains(6));
//		size：获取元素个数
		System.out.println(list.size());
//		isEmpty:判断是否为空
		System.out.println(list.isEmpty());
//		clear:清空
		list.clear();
//		addAll:添加多个元素
		List list2 = new ArrayList();
		list2.add("蔡徐坤");
		list2.add(6);
		list2.add("唱,跳,rap");
		list.addAll(list2);
		System.out.println("list = "+ list);
//		containsAll；查找多个元素是否都包含
		System.out.println( list.containsAll(list2));
//		removeAll:删除多个指定元素
		list.add("鸡你太美");
		list.removeAll(list2);
		System.out.println("list = "+ list);
	}
}
