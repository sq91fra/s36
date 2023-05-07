package gdsldl.fl.inclass;

public class Java12 {
public static void main(String[] args) {
	new Dormitory(100);
	new Dormitory(200);
	System.out.println(Dormitory.amount);
}

}

class Dormitory{
	public static double amount = 0;
	public Dormitory(int i) {
		consume(i);
	}
	public void consume(int amount ) {
		Dormitory.amount = Dormitory.amount +amount;
	}
}
