package gdsldl.fl.collection_.map_;

import java.util.Properties;

/**
 * @author:FL
 * @version: 2023年4月4日上午10:32:21
*/
@SuppressWarnings({"all"})
public class Properties_ {
public static void main(String[] args) {
	Properties p = new Properties();
	for (int i = 0; i < 8; i++) {
//		添加
		p.put("hello"+i, i+1);
	}
	
	System.out.println(p);
//	通过k获取对应值
	System.out.println(p.get("hello1"));
	
//	删除(通过键)
	p.remove("hello2");
	
//	修改(如果键已经存在，就会被修改)
	
}
}
