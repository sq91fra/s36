package gdsldl.fl.collection_.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:FL
 * @version: 2023年4月4日上午10:30:57
*/
@SuppressWarnings({"all"})
public class List01 {
public static void main(String[] args) {
	//list接口的子类的元素都是先输入的先输出
	List list =  new ArrayList() ;
	list.add("jack");
	list.add("张三");
	list.add(6);
	list.add(6);
	System.out.println("list = " + list);
}
}
