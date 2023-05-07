package gdsldl.fl.enumeration;

public class Enumeration02 {

}

//ʹ��enum�ؼ���
interface Wear{
	public void wearing() ;
}
enum Season2 implements Wear{
	
	SPRING("spring", "warm"),
	SUMMER("summer", "hot"),
	AUTUMN("auumn", "coolˬ"),
	WINTER("winter", "cold");
	private String name;
	private String desc;//����
	
	
//	public static Season SPRING = new Season("����", "��ů");
//	public static Season SUMMER = new Season("����", "����");
//	public static Season AUTUMN = new Season("����", "��ˬ");
//	public static Season WINTER = new Season("����", "����");
	private Season2(String name, String desc) {
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


	@Override
	public void wearing() {
		System.out.println("创衣服...");
	}
}
