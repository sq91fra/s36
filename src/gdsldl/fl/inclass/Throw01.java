package gdsldl.fl.inclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throw01 {
public static void main(String[] args) {
	
}

public static void f1() throws FileNotFoundException{
//	创建一个文件流对象
//	编译异常
//	使用throws，抛出异常，让调用f1方法的调用者处理
//	throws后面的异常类型可以是方法产生的异常类型，也可以是他的父类
//	throws关键字后也可以是异常列表，可以抛出多个异常
	FileInputStream fis = new FileInputStream("d://hello.txt");
}

public static void f2(){
//	因为f1()抛出的是一个编译异常
//	即这时，就要在调用f1()的方法处理
	try {
		f1();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}//error
}
}
