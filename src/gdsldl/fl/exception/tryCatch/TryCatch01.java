/**
 * @author FL
 * @version 2023��3��16������11:30:49
 */
package gdsldl.fl.exception.tryCatch;

public class TryCatch01 {
public static void main(String[] args) {
	try {
		String str = "123";
		int a = Integer.parseInt(str);
		System.out.println(a);
	} catch (NumberFormatException e) {
		System.out.println("�쳣��Ϣ="+e.getMessage());
	}
}
}
