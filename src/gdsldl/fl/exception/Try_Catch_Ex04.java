/**
 * @author FL
 * @version 2023年3月17日下午3:27:52
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
		System.out.println("输入一个整数...");
		int num = sc.nextInt();
		System.out.println("输入的数是："+num);
		return;
	} catch (Exception e) {
		// TODO: handle exception
		System.err.println("输入的数必须是整数...");
		scanfInt();
	}
}
}
