/**
 * @author FL
 * @version 2023��3��17������3:02:40
 */
package gdsldl.fl.exception;

public class Try_Catch_Ex02 {
public static void main(String[] args) {
	System.out.println(method());
}
	
public static int method() {
	int i = 1;
	i++;
	String[] names  = new String[3];
	try {
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
		return i++;//����ִ�У���ֻ����һ�����ʷ���4
	}
}

}
