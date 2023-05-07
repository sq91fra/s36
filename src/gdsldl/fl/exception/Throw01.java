/**
 * @author FL
 * @version 2023年3月17日下午4:04:06
 */
package gdsldl.fl.exception;

public class Throw01 {
public static void main(String[] args) {
	try {
		int num = div(10, 0);
		System.out.println(num);
	} catch (Exception e) {
		// TODO: handle exception
		System.err.println("在主方法中处理div方法的异常...");
		System.out.println("主方法是调用div方法的类，所以主方法处理...");
	}
}

public static int div(int a, int b) {
	return a/b;
}
}


