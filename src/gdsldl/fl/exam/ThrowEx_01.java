package gdsldl.fl.exam;

/**
 * 
 * @author FL
 * @version 2023年3月17日下午11:32:37
 */
public class ThrowEx_01 {
public static void main(String[] args) {
	try {
		ReturnException.A();
	} catch (Exception e) {
		System.err.println(e.getMessage());
	}
	ReturnException.B();;
}
}

class ReturnException{
	static void A() {
		try {
			System.out.println("进入方法A");
			throw new RuntimeException("制造异常...");
		} finally {
			System.out.println("A方法的fianlly...");
		}
	}
	
	static void B() {
		try {
			System.out.println("进入方法B...");
			return;
		} finally {
			System.out.println("调用B方法1的finally...");
		}
	}
}
