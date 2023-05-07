package gdsldl.fl.reflection.homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Homework01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> cls = Class.forName("gdsldl.fl.reflection.homework.PrivateTest");
        Object o = cls.newInstance();
//        提供getName的公有方法
        Method getName = cls.getMethod("getName");
//        得到私有name属性
        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"helloWorld");
        System.out.println(getName.invoke(o));
    }
}

class PrivateTest{
    private String name = "helloKitty";
    public String getName() {
        return name;
    }
}