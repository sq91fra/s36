package gdsldl.fl.generic;
import org.junit.jupiter.api.*;

/**
 * @author:FL
 * @version: 2023年4月12日下午4:57:50
*/
public class JUnit_ {
	@Test	
public void run() {
	m1();
	m2();
	m3();
}

public  void m1() {
	System.out.println("m1()被调用...");
}
public  void m2() {
	System.out.println("m2()被调用...");
}
public  void m3() {
	System.out.println("m3()被调用...");
}
}
