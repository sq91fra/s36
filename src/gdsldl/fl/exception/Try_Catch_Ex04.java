/**
 * @author FL
 * @version 2023��3��17������3:27:52
 */
package gdsldl.fl.exception;

import java.util.Scanner;

public class Try_Catch_Ex04 {
public static void main(String[] args) {
	scanfInt();
}

public static void scanfInt() {
	Scanner sc = new Scanner(System.in);
	try {
		System.out.println("����һ������...");
		int num = sc.nextInt();
		System.out.println("��������ǣ�"+num);
		return;
	} catch (Exception e) {
		// TODO: handle exception
		System.err.println("�����������������...");
		scanfInt();
	}
}
}
