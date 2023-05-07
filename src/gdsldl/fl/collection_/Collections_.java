package gdsldl.fl.collection_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author:FL
 * @version: 2023年4月5日上午11:10:02
*/
@SuppressWarnings({"all"})
public class Collections_ {
public static void main(String[] args) {
	List list = new ArrayList();
	list.add("李四");
	list.add("张三");
	list.add("王五");
	
	System.out.println("list = "+list);
//	翻转
//	Collections.reverse(list);
//	随机排序shuffle
//	Collections.shuffle(list);
//	自然排序
	Collections.sort(list);
//	交换
	Collections.swap(list,0,2);
	System.out.println("list = "+list);
}
}
