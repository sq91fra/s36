/**
 * @author FL
 * @version 2023��3��17������4:04:06
 */
package gdsldl.fl.exception;

public class Throw01 {
public static void main(String[] args) {
	try {
		int num = div(10, 0);
		System.out.println(num);
	} catch (Exception e) {
		// TODO: handle exception
		System.err.println("���������д���div�������쳣...");
		System.out.println("�������ǵ���div�������࣬��������������...");
	}
}

public static int div(int a, int b) {
	return a/b;
}
}


