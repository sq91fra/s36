package gdsldl.fl.enumeration;

public class Enumertion01 {
public static void main(String[] args) {
	
//	传统的设计类思路不适合固定的对象->枚举
	System.out.println(Season.AUTUMN);
}
}

class Season{
	private String name;
	private String desc;//描述
	
	public static Season SPRING = new Season("春天", "温暖");
	public static Season SUMMER = new Season("夏天", "炎热");
	public static Season AUTUMN = new Season("秋天", "凉爽");
	public static Season WINTER = new Season("冬天", "寒冷");
	
	private Season(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}


	public String getDesc() {
		return desc;
	}

	@Override
	public String toString() {
		return "Season [name=" + name + ", desc=" + desc + "]";
	}

}