/**
 * @author FL
 * @version 2023��3��16������8:06:10
 */
package gdsldl.fl.exception;

public class Exception01 {
public static void main(String[] args) {
	int num1 = 10;
	int num2 = 0;
	try {
		int result = num1 / num2;	//�׳��쳣������ʱ�쳣
	} catch (Exception e) {
		// �����쳣������ƣ���ʹ�������쳣���������Ĵ�����Լ�������
//		e.printStackTrace();
		System.out.println(e.getMessage());//����쳣��Ϣ
	}
//	���׳��쳣�󣬳����˳���֮��Ĵ��벻������
//	���ֻ������һ���쳣(bug)�ͱ���������Ľ�׳��̫��
	System.out.println("Continue...");
}
}

