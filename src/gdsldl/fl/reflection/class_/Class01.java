package gdsldl.fl.reflection.class_;

import com.fl.Car;

public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
        String classFullPath = "com.fl.Car";//一般通过配置文件获取
//        1.
        Class<?> cls1 = Class.forName(classFullPath);
//        2.
        Class<Car> cls2 = Car.class;
//        3.
        Car car = new Car();
        Class<? extends Car> cls3 = car.getClass();
//        4.通过类加载器(4种)
        ClassLoader classLoader = car.getClass().getClassLoader();
        Class<?> cls4 = classLoader.loadClass(classFullPath);

        System.out.println(cls1);
        System.out.println(cls2);
        System.out.println(cls3);
        System.out.println(cls4);
//        cls1,cls2,cls3,cls4是同一个对象
//        5. 基本数据类型
        Class<Integer> cls5 = int.class;
        System.out.println(cls5);//int

//        6. 基本数据类型对应包装类
        Class<Integer> cls6 = Integer.TYPE;
        System.out.println(cls6);//int

        System.out.println(cls5 == cls6);//ture
    }
}
