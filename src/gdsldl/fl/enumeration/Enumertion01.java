package gdsldl.fl.enumeration;

public class Enumertion01 {
public static void main(String[] args) {
	
//	��ͳ�������˼·���ʺϹ̶��Ķ���->ö��
	System.out.println(Season.AUTUMN);
}
}

class Season{
	private String name;
	private String desc;//����
	
	public static Season SPRING = new Season("����", "��ů");
	public static Season SUMMER = new Season("����", "����");
	public static Season AUTUMN = new Season("����", "��ˬ");
	public static Season WINTER = new Season("����", "����");
	
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