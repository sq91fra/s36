/**
 * @author FL
 * @version 2023��3��16������9:36:02
 */
package gdsldl.fl.exception;
public class ClassCastExcption_ {
public static void main(String[] args) {
	A b = new B();
	B b2 = (B)b;
	C c = (C)b;//�׳�����ת���쳣
}
}

class A{}

class B extends A{}

class C extends A{}
