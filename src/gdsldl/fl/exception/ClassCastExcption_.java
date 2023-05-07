/**
 * @author FL
 * @version 2023年3月16日上午9:36:02
 */
package gdsldl.fl.exception;
public class ClassCastExcption_ {
public static void main(String[] args) {
	A b = new B();
	B b2 = (B)b;
	C c = (C)b;//抛出类型转换异常
}
}

class A{}

class B extends A{}

class C extends A{}
