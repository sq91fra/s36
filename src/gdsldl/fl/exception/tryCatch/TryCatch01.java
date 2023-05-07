/**
 * @author FL
 * @version 2023年3月16日上午11:30:49
 */
package gdsldl.fl.exception.tryCatch;

public class TryCatch01 {
public static void main(String[] args) {
	try {
		String str = "123";
		int a = Integer.parseInt(str);
		System.out.println(a);
	} catch (NumberFormatException e) {
		System.out.println("异常信息="+e.getMessage());
	}
}
}
