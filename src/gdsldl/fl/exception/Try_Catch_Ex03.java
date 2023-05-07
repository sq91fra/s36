/**
 * @author FL
 * @version 2023年3月17日下午3:02:40
 */
package gdsldl.fl.exception;

public class Try_Catch_Ex03 {
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
		return ++i;//保存临时变量temp=3,返回temp
	}finally {
		++i;
		System.out.println("i = "+ i);//i=4
	}
}

}
