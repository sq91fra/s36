package gdsldl.fl.collection_.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:FL
 * @version: 2023年4月5日上午11:34:17
*/
@SuppressWarnings({"all"})
public class Homework01 {
public static void main(String[] args) {
	News news1 = new News("新冠确诊病例超千万，数百万印度信徒赴恒河“圣浴”引民众担忧");
	News news2 = new News("芬兰加入北约，对俄罗斯的影响有多大？");
	List list = new ArrayList();
	list.add(news1);
	list.add(news2);
//	倒序遍历
	int size = list.size();
	for (int i = size - 1; i >= 0; i--) {
		News news = (News)list.get(i);
		System.out.println(processTitle(news.getTitle()));
	}
}
public static String processTitle(String title) {
	if (title == null) {
		return "";
	}
	if (title.length() > 15) {
		return title.substring(0,15) + "...";
	}else {
		return title;
	}
}
}

class News{
	private String title;
	private String content;
	public News(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "News title=" + title ;
	}
	
	public static String updateTitle(String title) {
		char[] arr =  title.toCharArray();
		String temp = "";
		if(arr.length >15) {
			for (int i = 0; i < 15; i++) {
				temp += arr[i];
			}
			temp += "...";
			return temp;
		}else {
			return title;
		}
	}
	

}
