package gdsldl.fl.generic;
/**
 * @author:FL
 * @version: 2023年4月11日上午11:02:40
*/
public class Generic_Ex3 {
	public static void main(String[] args) {
		GE3<String ,Integer ,Float> ge3 = new GE3<>();
//		ge3.e("6");
		ge3.e(10);
		ge3.e(new GE03());
	}
}

class GE3<T,R,M>{
	public <E> void e(E e) {
		System.out.println(e.getClass().getSimpleName());
	}
	public void trm(T t, R r, M m) {
		System.out.println(t.getClass());
		System.out.println(r.getClass());
		System.out.println(m.getClass());
	}
}
class GE03{
	
}