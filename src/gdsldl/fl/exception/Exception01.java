/**
 * @author FL
 * @version 2023年3月16日上午8:06:10
 */
package gdsldl.fl.exception;

public class Exception01 {
public static void main(String[] args) {
	int num1 = 10;
	int num2 = 0;
	try {
		int result = num1 / num2;	//抛出异常，运行时异常
	} catch (Exception e) {
		// 进行异常处理机制，即使出现了异常，程序后面的代码可以继续运行
//		e.printStackTrace();
		System.out.println(e.getMessage());//输出异常信息
	}
//	当抛出异常后，程序退出，之后的代码不会运行
//	如果只是遇到一点异常(bug)就崩溃，程序的健壮性太差
	System.out.println("Continue...");
}
}

