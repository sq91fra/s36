package gdsldl.fl.reflection.class_;

import com.fl.Car;

import java.lang.reflect.Field;

public class Class02 {
    public static void main(String[] args) throws Exception {
        String classFullPath = "com.fl.Car";
//        获取Car类对应的Class对象
        Class<?> cls = Class.forName(classFullPath);
//        输出cls
        System.out.println(cls);//显示cls对象时那个类的Class对象
        System.out.println(cls.getClass());
//        得到包名
        System.out.println(cls.getPackage().getName());
//        得到全类名
        System.out.println(cls.getName());
//        创建对象实例
        Car car = (Car)cls.newInstance();
        System.out.println(car);
//获取属性
        Field price = cls.getField("price");
        System.out.println(price.get(car));
//        通过反射给属性赋值
        price.set(car,666);
        System.out.println(price.get(car));
//        得到所有属性的数组
        Field[] fields = cls.getFields();
        for (Field f :fields) {
            System.out.println(f.getName());
        }

    }
}
