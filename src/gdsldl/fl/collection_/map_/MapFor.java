package gdsldl.fl.collection_.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author:FL
 * @version: 2023年4月9日下午5:50:24
*/
@SuppressWarnings("all")
public class MapFor {
public static void main(String[] args) {
	Map<String,String>map = new HashMap<String,String>();
	map.put("只因你", "太美");
	map.put(null, "太美");
	map.put("鸡你", null);
	

//	第一组：先取key，再通过key取出对应的value
	Set<String> keyset = map.keySet();
//	增强for
	System.out.println("第一种遍历方式:");
	for (String key : keyset) {
		System.out.println(key +"-"+ map.get(key));
	}
//	迭代器
	System.out.println("第二种遍历方式:");
	Iterator<String> iterator = keyset.iterator();
	while (iterator.hasNext()) {
		String key = (String) iterator.next();
		System.out.println(key +"-"+ map.get(key));
	}
	
	
//	第二组：先取value
//	缺点，不能通过value来取key
	System.out.println("第三种遍历方式:");
	Collection<String> values = map.values();
//	普通for(略)
//	增强for
	for (String value : values) {
		System.out.println(value);
	}
	System.out.println("第四种遍历方式:");
//	迭代器
	Iterator<String> iterator2 = values.iterator();
	while (iterator2.hasNext()) {
		String value = (String) iterator2.next();
		System.out.println(value);
	}
	
//	第三组：通过EntrySet来获取
	Set entrySet = map.entrySet();//EntrySet<Map,Entry<K,V>>
	System.out.println("使用EntrySet的增强for...");
//	增强for
	for (Object entry : entrySet) {
		Map.Entry m = (Map.Entry) entry;
		System.out.println(m.getKey()+"-"+m.getValue());
	}
//	迭代器
	System.out.println("使用EntrySet的迭代器...");
	Iterator iterator3 = entrySet.iterator();
	while (iterator3.hasNext()) {
		Object next = (Object) iterator3.next();
//		向下转型为Entry
		Map.Entry m = (Map.Entry) next;
		System.out.println(m.getKey()+"-"+m.getValue());
	}
	
}
}
