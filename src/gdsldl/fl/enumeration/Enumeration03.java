package gdsldl.fl.enumeration;

public class Enumeration03 {
public static void main(String[] args) {
//	using season2,demonstrate various methods
	Season2 autumn = Season2.AUTUMN;
//	输出enum 名
	System.out.println(autumn.name());
//	输出enum次序，从0开始编号
	System.out.println(autumn.ordinal());//autumn次序是3，输出2
//	 values()
	System.out.println("----循环取出枚举对象----");
	Season2[] values = Season2.values();
	for (Season2 season : values) {
		System.out.println(season);
	}

	System.out.println("----valueOf()----");
	Season2 autumn1 = Season2.valueOf("AUTUMN");
	System.out.println("autumn="+autumn1);
//	返回的autumn1对象与前面的autumn是同一个对象
	System.out.println(autumn == autumn1);
//	用autumn的编号与summer的编号进行比较
	System.out.println("----compareTo----");	
	System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));
}
}

enum Gender{
	BOY,GIRL;
}

