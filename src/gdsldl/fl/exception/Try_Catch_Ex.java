/**
 * @author FL
 * @version 2023��3��17������2:50:09
 */
package gdsldl.fl.exception;

public class Try_Catch_Ex {
public static void main(String[] args) {
	System.out.println(method());
}

public static int method() {
	try {
		String[] names  = new String[3];//δ
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
		return 4;//����ִ�У���ֻ����һ�����ʷ���4
	}
}
}
