/**
 * @author FL
 * @version 2023年3月17日下午2:50:09
 */
package gdsldl.fl.exception;

public class Try_Catch_Ex {
public static void main(String[] args) {
	System.out.println(method());
}

public static int method() {
	try {
		String[] names  = new String[3];//未
		if(names[1].equals("tom")) {
		System.out.println(names[1]);	                                                                                 
		}else {
			names[3] = "lsp666";
		}
		return 1;
	} catch (ArrayIndexOutOfBoundsException e) {
		return 2;
	}catch (NullPointerException e) {
		// TODO: handle exception
		return 3;
	}finally {
		return 4;//必须执行，且只返回一个，故返回4
	}
}
}
