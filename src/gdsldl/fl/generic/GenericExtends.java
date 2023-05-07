package gdsldl.fl.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:FL
 * @version: 2023年4月12日下午4:27:00
*/
@SuppressWarnings("all")
public class GenericExtends {
public static void main(String[] args) {
	
//	List<Object> list = new ArrayList<String>();／／不对
	List<Object> list1 = new ArrayList<>();
	List<String> list2 = new ArrayList<>();
	List<AA> list3 = new ArrayList<>();
	List<BB> list4 = new ArrayList<>();
	List<CC> list5 = new ArrayList<>();
	
//	以下都能通过编译
	print1(list1);//√
	print1(list2);//√
	print1(list3);//√
	print1(list4);//√
	print1(list5);//√

//	AA和其子类可以通过编译
//	print2(list1);//×
//	print2(list2);//×
	print2(list3);//√
	print2(list4);//√
	print2(list5);//√
	
//	AA和其父类(包括间接父类)可以通过编译
	print3(list1);//√
//	print3(list2);//×
	print3(list3);//√
//	print3(list4);//×
//	print3(list5);//×
}
//List<?> c:表示可以传入任意类型
public static void print1(List<?> c) {
	for (Object object : c) {
		System.out.println(object);
	}
}
//可以接收AA和AA子类，规定了泛型的上限
public static void print2(List<? extends AA> c) {
	for (Object object : c) {
		System.out.println(object);
	}
}
//可以接收AA和AA父类(或父类的父类...)，规定了泛型的下限
public static void print3(List<? super AA> c) {
	for (Object object : c) {
		System.out.println(object);
	}
}
}

class AA{
}

class BB extends AA{
}

class CC extends BB{
}