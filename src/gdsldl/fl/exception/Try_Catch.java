/**
 * @author FL
 * @version 2023��3��16������10:35:41
 */
package gdsldl.fl.exception;
public class Try_Catch {
public static void main(String[] args) {
	try {
//		����/�����е��쳣
		System.out.println(1/0);
	} catch (Exception e) {
		// �����쳣
//		ϵͳ���쳣��װ��Expection����e�����ݸ�catch
//		�õ��쳣������Լ�����
//		���û�з����쳣catch����鲻ִ��
		e.printStackTrace();
	}finally {
//		����try�����Ƿ����쳣������ʼ��Ҫִ��final�еĴ���
//		һ�㽫�ͷ���Դ�Ĵ������fianlly��
	}
}
}
