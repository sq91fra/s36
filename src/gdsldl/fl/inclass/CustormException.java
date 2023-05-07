package gdsldl.fl.inclass;

import java.util.Scanner;

public class CustormException {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("输入一个18~120之间的年龄...");
	int age = sc.nextInt();
	try {
	if(!(age >= 18 && age <= 120)) {
		throw new AgeException();
	}
	} catch (AgeException e) {
		System.err.println("年龄输入有误");
	}
	System.out.println("输入的年龄是"+age);

}
}

@SuppressWarnings("serial")
class AgeException extends RuntimeException{
//自定义异常
	public AgeException(String message) {
		super(message);
	}

public AgeException() {

}
	
}
