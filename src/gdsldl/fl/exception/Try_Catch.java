/**
 * @author FL
 * @version 2023年3月16日上午10:35:41
 */
package gdsldl.fl.exception;
public class Try_Catch {
public static void main(String[] args) {
	try {
//		代码/可能有的异常
		System.out.println(1/0);
	} catch (Exception e) {
		// 捕获到异常
//		系统将异常封装成Expection对象e，传递给catch
//		得到异常对象后，自己处理
//		如果没有发生异常catch代码块不执行
		e.printStackTrace();
	}finally {
//		不管try代码是否有异常发生，始终要执行final中的代码
//		一般将释放资源的代码放在fianlly中
	}
}
}
