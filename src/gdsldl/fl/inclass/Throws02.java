package gdsldl.fl.inclass;

public class Throws02 {
public static void main(String[] args) {
	B b = new B();
	b.a();
}
	
}

class B{
	public void a(){
		this.b();
	}
	
	public void b() throws RuntimeException {
		System.out.println(1/0);
	}
}

class BB extends B{
	@Override
	public void b() throws NullPointerException {
		super.b();
	}
}
