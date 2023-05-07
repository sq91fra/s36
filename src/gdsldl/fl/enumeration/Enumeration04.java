package gdsldl.fl.enumeration;
public class Enumeration04 {
public static void main(String[] args) {
	D d  = new D();
	d.hi();
}
}

class D{
	public int n1 = 10;
	@Deprecated
	public void hi() {
		System.out.println("过时的hi()...");
	}
}

class Father{
	public void flly() {
		System.out.println("Father fly...");
	}
}

class Son extends Father{
	@Override
	public void flly() {
		System.out.println("Son fly...");
	}
}

