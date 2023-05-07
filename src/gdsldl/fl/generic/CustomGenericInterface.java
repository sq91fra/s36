package gdsldl.fl.generic;
/**
 * @author:FL
 * @version: 2023年4月11日上午10:13:28
*/
public class CustomGenericInterface {

}

interface ICG<A,B,C>{
	String name = "张三";//复习接口
	int age = 18;
//	* 接口中，静态成员也不能使用泛型（这个和泛型类规定一样）
//	A a;//error
	public void hi(A a);//复习抽象类
	public void show(A a, B b, C c) ;
	
}

//* 泛型接口的类型，在*继承接口*或者*实现接口*时确定
	//继承接口
interface ICG01 extends ICG<String ,Double,Integer>{
	//在继承接口时，指定了A，B，C
	@Override
	default void hi(String a) {
		// TODO 自动生成的方法存根
		
	}
	@Override
	default void show(String a, Double b, Integer c) {
		// TODO 自动生成的方法存根
		
	}
}
	//实现接口
class ICG02 implements ICG<String ,Double,Integer>{

		@Override
		public void hi(String a) {
			// TODO 自动生成的方法存根
			
		}

		@Override
		public void show(String a, Double b, Integer c) {
			// TODO 自动生成的方法存根
			
		}
	
}
//* 没有指定类型，默认为Object...
